package topcoder;

/**
 * @author anobis
 */
public class ZigZag {
    public static void main(String[] args) {
        System.out.println(longestZigZag(new int[]{ 1, 7, 4, 9, 2, 5 }));
        System.out.println(longestZigZag(new int[]{ 1, 17, 5, 10, 13, 15, 10, 5, 16, 8 }));
        System.out.println(longestZigZag(new int[]{44}));
        System.out.println(longestZigZag(new int[]{20, 10}));
        System.out.println(longestZigZag(new int[]{10, 20}));
        System.out.println(longestZigZag(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        System.out.println(longestZigZag(new int[]	{4, 4, 4, 4, 4, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}));
        System.out.println(longestZigZag(new int[]{ 70, 55, 13, 2, 99, 2, 80, 80, 80, 80, 100, 19, 7, 5, 5, 5, 1000, 32, 32 }));
        System.out.println(longestZigZag(new int[]{ 374, 40, 854, 203, 203, 156, 362, 279, 812, 955, 600, 947, 978, 46, 100, 953, 670, 862, 568, 188, 67, 669, 810, 704, 52, 861, 49, 640, 370, 908, 477, 245, 413, 109, 659, 401, 483, 308, 609, 120, 249, 22, 176, 279, 23, 22, 617, 462, 459, 244 }));
        System.out.println(longestZigZag(new int[]{20, 20}));
        System.out.println(longestZigZag(new int[]	{396, 549, 22, 819, 611, 972, 730, 638, 978, 342, 566, 514, 752, 871, 911, 172, 488, 542, 482, 974, 210, 474, 66, 387, 1, 872, 799, 262, 567, 113, 578, 308, 813, 515, 716, 905, 434, 101, 632, 450, 74, 254, 1000, 780, 633, 496, 513, 772, 925, 746}));
        System.out.println(longestZigZag(new int[]	{374, 40, 854, 203, 203, 156, 362, 279, 812, 955, 600, 947, 978, 46, 100, 953, 670, 862, 568, 188, 67, 669, 810, 704, 52, 861, 49, 640, 370, 908, 477, 245, 413, 109, 659, 401, 483, 308, 609, 120, 249, 22, 176, 279, 23, 22, 617, 462, 459, 244}));
    }

    public static int longestZigZag(int[] sequence){
        if (sequence.length == 1) {
            return 1;
        }
        int[] cache = new int[sequence.length -1];

        for (int i = 1; i < sequence.length; ++i) {
            cache[i-1] = sequence[i] - sequence[i-1];
            System.out.print(cache[i-1] + " ");
        }
        System.out.println();

        int ii = 0;
        while (ii < cache.length && cache[ii] == 0) {
            ++ii;
        }

        if (ii == cache.length) {
            return 1;
        }
        int dir = cache[ii];
        int len = 2;

        for (int i = ii + 1; i < cache.length; ++i) {
            if (cache[i] * dir < 0) {
                dir *= -1;
                len++;
            }
        }
        return len;
    }
}
