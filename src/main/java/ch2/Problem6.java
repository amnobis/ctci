package ch2;

import structs.ListNode;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem6 {
   public static void main(String[] args) {
      ListNode n7 = new ListNode(1, null);
      ListNode n6 = new ListNode(3, null);
      ListNode n5 = new ListNode(2, n6);
      ListNode n4 = new ListNode(1, n5);

      System.out.println(isPalindrome(n4));
   }

   public static boolean isPalindrome(ListNode head) {
      if (head == null) {
         return true;
      }

      ListNode rev = reverse(middle(head));
      ListNode p1 = rev;


      while (head != null && rev != null) {
         if (rev.val != head.val) {
            return false;
         }
         rev = rev.next;
         head = head.next;
      }
      return true;
   }

   public static ListNode middle(ListNode head) {
      ListNode slow = head;
      ListNode fast = head;

      while (fast.next != null && fast.next.next != null) {
         slow = slow.next;
         fast = fast.next.next;
      }

      if (fast.next != null) {
         slow = slow.next;
      }
      return slow;
   }

   public static ListNode reverse(ListNode head) {
      if (head == null) {
         return head;
      }
      ListNode prev = head;
      head = head.next;
      prev.next = null;

      while (head != null) {
         ListNode tmp = head;
         head = head.next;
         tmp.next = prev;
         prev = tmp;
      }
      return prev;
   }
}
