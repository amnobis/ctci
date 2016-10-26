package ch2;

import structs.Node;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem4 {
   public static void main(String[] args) {
      Node n7 = new Node(6, null);
      Node n6 = new Node(5, n7);
      Node n5 = new Node(5, n6);
      Node n4 = new Node(5, n5);
      Node n3 = new Node(5, n4);
      Node n2 = new Node(5, n3);
      Node n1 = new Node(7, n2);

      partition(n1, 6);
      while (n1 != null) {
         System.out.print(n1.val + "->");
         n1 = n1.next;
      }
   }

   public static  void partition(Node head, int value) {
      if (head == null) {
         return;
      }
      Node curr = head;

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
