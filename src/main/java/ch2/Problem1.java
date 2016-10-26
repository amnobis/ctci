package ch2;

import structs.Node;

import java.util.HashSet;
import java.util.Set;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem1 {
   public static void main(String[] args) {
      Node n7 = new Node(5, null);
      Node n6 = new Node(5, n7);
      Node n5 = new Node(3, n6);
      Node n4 = new Node(3, n5);
      Node n2 = new Node(2, n4);
      Node n3 = new Node(3, n2);
      Node n1 = new Node(1, n3);

      removeDuplicates(n1);
      removeDuplicates(n6);
   }

   public static void removeDuplicates(Node head) {
      Set<Integer> vals = new HashSet<>();

      if (head == null) {
         return;
      }
      Node prev = head;
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
