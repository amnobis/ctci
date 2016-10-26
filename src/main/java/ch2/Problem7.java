package ch2;

import structs.ListNode;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem7 {
   public static void main(String[] args) {

   }

   public static ListNode intersect(ListNode n1, ListNode n2) {
      if (n1 == null || n2 == null) {
         return null;
      }

      ListNode a = n1;
      ListNode b = n2;

      while (a != b){
         a = a == null? n2 : a.next;
         b = b == null? n1 : b.next;
      }

      return a;
   }
}
