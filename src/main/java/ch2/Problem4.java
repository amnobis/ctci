package ch2;

import structs.ListNode;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem4 {
   public static void main(String[] args) {
      ListNode n7 = new ListNode(6, null);
      ListNode n6 = new ListNode(5, n7);
      ListNode n5 = new ListNode(5, n6);
      ListNode n4 = new ListNode(5, n5);
      ListNode n3 = new ListNode(5, n4);
      ListNode n2 = new ListNode(5, n3);
      ListNode n1 = new ListNode(7, n2);

      partition(n1, 6);
      while (n1 != null) {
         System.out.print(n1.val + "->");
         n1 = n1.next;
      }
   }

   public static  void partition(ListNode head, int value) {
      if (head == null) {
         return;
      }
      ListNode curr = head;

      while (head != null) {
         if (curr.val >= value) {
            if (head.val < value) {
               int tmp = curr.val;
               curr.val = head.val;
               head.val = tmp;
               curr = curr.next;
            }
         } else {
            curr = curr.next;
         }
         head = head.next;
      }
   }
}
