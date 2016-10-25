package ch1;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem5 {
   public static void main(String[] args) {
      System.out.println(oneOp("pale", "ple"));
      System.out.println(oneOp("pale", "pales"));
      System.out.println(oneOp("pale", "bale"));
      System.out.println(oneOp("cake", "cale"));
   }

   public static boolean oneOp(String s, String t) {
      int[] chars = new int[128];

      s.chars().forEach(val -> {
         chars[val]++;
      });

      t.chars().forEach(val -> {
         chars[val]--;
      });

      int countPos = 0;
      int countNeg = 0;

      for (int i = 0; i < chars.length; ++i) {
         if (chars[i] < 0) {
            countNeg += chars[i];
         } else if (chars[i] > 0) {
            countPos += chars[i];
         }

         if (countPos > 1 || countNeg < -1) {
            return false;
         }
      }
      return true;
   }
}
