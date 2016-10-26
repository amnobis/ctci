package ch2;

import structs.Node;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem6 {
   public static void main(String[] args) {
      Node n7 = new Node(1, null);
      Node n6 = new Node(3, null);
      Node n5 = new Node(2, n6);
      Node n4 = new Node(1, n5);

      System.out.println(isPalindrome(n4));
   }

   public static boolean isPalindrome(Node head) {
      if (head == null) {
         return true;
      }

      Node rev = reverse(middle(head));
      Node p1 = rev;


      while (head != null && rev != null) {
         if (rev.val != head.val) {
            return false;
         }
         rev = rev.next;
         head = head.next;
      }
      return true;
   }

   public static Node middle(Node head) {
      Node slow = head;
      Node fast = head;

      while (fast.next != null && fast.next.next != null) {
         slow = slow.next;
         fast = fast.next.next;
      }

      if (fast.next != null) {
         slow = slow.next;
      }
      return slow;
   }

   public static Node reverse(Node head) {
      if (head == null) {
         return head;
      }
      Node prev = head;
      head = head.next;
      prev.next = null;

      while (head != null) {
         Node tmp = head;
         head = head.next;
         tmp.next = prev;
         prev = tmp;
      }
      return prev;
   }
}
