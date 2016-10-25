package ch1;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem2 {
   public static void main(String[] args) {
      System.out.println(isPermute("abcde", "bcdae"));
      System.out.println(isPermute("abcdd", "abcde"));
   }

   public static boolean isPermute(String s, String t) {
      if (s.length() != t.length()) {
         return false;
      }

      char[] sChars = s.toCharArray();
      char[] tChars = t.toCharArray();
      int vals = 0;

      for (int i = 0; i < sChars.length; ++i) {
         vals ^= sChars[i];
         vals ^= tChars[i];
      }

      return (vals == 0);
   }
}
