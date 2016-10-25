package ch1;

import java.net.URL;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem3 {
   public static void main(String[] args) {
      char[] urled = URLify("Mr John Smith    ".toCharArray(), 13);
      char[] urled2 = URLify(" W a t s U p            ".toCharArray(), 12);

      System.out.println(urled);
      System.out.println(urled2);
   }

   public static char[] URLify(char[] input, int length) {
      int spaces = 0;

      for (int i = 0; i < length; ++i) {
         spaces += (input[i] == ' ') ? 1 : 0;
      }

      int index = length + spaces*2;

      for (int i = length-1; i >= 0; --i) {
         if (input[i] == ' ') {
            input[index-1] = '0';
            input[index-2] = '2';
            input[index-3] = '%';
            index -= 3;
         } else {
            input[index-1] = input[i];
            index--;
         }
      }

      return input;
   }
}
