package ch1;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem6 {
   public static void main(String[] args) {
      int i;
      String val = "aabcccccaaaddbbcaef";
      System.out.println(compressString(val));
      System.out.println(compressString("abcdefg"));
   }

   public static String compressString(String s) {
      String out = "";

      int repeat = 1;
      boolean repeats = false;
      char previous = s.charAt(0);

      for (int i = 1; i < s.length(); ++i) {
         if (s.charAt(i) == previous) {
            repeat++;
         } else {
            out += String.valueOf(previous) + repeat;
            previous = s.charAt(i);
            repeat = 1;
         }

         if (repeat > 1) {
            repeats = true;
         }
         if (i == s.length() - 1) {
            out += String.valueOf(previous) + repeat;
         }
      }

      return (repeats) ? out : s;
   }
}
