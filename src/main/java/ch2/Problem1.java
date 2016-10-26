package ch2;

import structs.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem1 {
   public static void main(String[] args) {
      ListNode n7 = new ListNode(5, null);
      ListNode n6 = new ListNode(5, n7);
      ListNode n5 = new ListNode(3, n6);
      ListNode n4 = new ListNode(3, n5);
      ListNode n2 = new ListNode(2, n4);
      ListNode n3 = new ListNode(3, n2);
      ListNode n1 = new ListNode(1, n3);

      removeDuplicates(n1);
      removeDuplicates(n6);
   }

   public static void removeDuplicates(ListNode head) {
      Set<Integer> vals = new HashSet<>();

      if (head == null) {
         return;
      }
      ListNode prev = head;
      head = head.next;
      prev.next = null;

      while (head != null) {
         if (!vals.contains(head.val)) {
            vals.add(head.val);
            prev.next = head;
            head = head.next;
            prev = prev.next;
         } else {
            head = head.next;
         }
      }
      prev.next = null;
   }
}
