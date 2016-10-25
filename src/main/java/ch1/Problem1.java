package ch1;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem1 {
   public static void main(String[] args) {
      System.out.println(isUnique("abcdefg"));
      System.out.println(isUnique("abcde*/&^ff"));
   }

   public static boolean isUnique(String s) {
      int[] vals = new int[128];

      for (char ind : s.toCharArray()) {
         vals[ind]++;

         if (vals[ind] > 1) {
            return false;
         }
      }
      return true;
   }
}
