package ch2;

import structs.ListNode;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem5 {
   public static void main(String[] args) {
      ListNode n3 = new ListNode(3, null);
      ListNode n2 = new ListNode(2, n3);
      ListNode n1 = new ListNode(1, n2);

      ListNode n7 = new ListNode(7, null);
      ListNode n6 = new ListNode(6, n7);
      ListNode n5 = new ListNode(5, n6);
      ListNode n4 = new ListNode(4, n5);

   }
}
