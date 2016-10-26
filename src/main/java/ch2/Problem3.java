package ch2;

import structs.ListNode;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem3 {
   public static void main(String[] args) {
      ListNode n7 = new ListNode(6, null);
      ListNode n6 = new ListNode(5, n7);
      ListNode n5 = new ListNode(3, n6);
      ListNode n4 = new ListNode(3, n5);
      ListNode n3 = new ListNode(3, n4);
      ListNode n2 = new ListNode(2, n3);
      ListNode n1 = new ListNode(1, n2);

      delMidNode(n4);
      delMidNode(n6);

      while (n1 != null) {
         System.out.println(n1.val);
         n1 = n1.next;
      }
   }

   public static void delMidNode(ListNode head) {
      if (head == null || head.next == null) {
         return;
      }
      head.val = head.next.val;
      head.next = head.next.next;
   }
}

