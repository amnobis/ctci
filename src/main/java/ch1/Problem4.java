package ch1;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem4 {
   public static void main(String[] args) {
      System.out.println(isPalindromePerm("atco cat"));
   }

   public static boolean isPalindromePerm(String s) {
      int[] vals = new int[128];

      for (char ind : s.toCharArray()) {
         // Does upper/lowercase matter? Do spaces matter?
         vals[ind]++;
      }

      boolean odd = false;

      for (int i = 0; i < vals.length; ++i) {
         if (vals[i] % 2 == 1) {
            if (!odd) {
               odd = true;
            } else {
               return false;
            }
         }
      }

      return true;
   }
}
