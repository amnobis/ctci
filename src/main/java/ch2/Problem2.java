package ch2;

import structs.ListNode;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem2 {
   public static void main(String[] args) {
      ListNode n7 = new ListNode(6, null);
      ListNode n6 = new ListNode(5, n7);
      ListNode n5 = new ListNode(3, n6);
      ListNode n4 = new ListNode(3, n5);
      ListNode n3 = new ListNode(3, n4);
      ListNode n2 = new ListNode(2, n3);
      ListNode n1 = new ListNode(1, n2);

      System.out.println(kthToLast(n1, 6).val);
   }

   public static ListNode kthToLast(ListNode head, int k) {
      ListNode p1 = head;
      ListNode p2 = head;

      for (int i = 0; i < k; ++i) {
         if (p1 == null) {
            return null;
         }
         p1 = p1.next;
      }

      while (p1 != null) {
         p1 = p1.next;
         p2 = p2.next;
      }
      return p2;
   }
}
