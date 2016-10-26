package ch2;

import structs.Node;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem3 {
   public static void main(String[] args) {
      Node n7 = new Node(6, null);
      Node n6 = new Node(5, n7);
      Node n5 = new Node(3, n6);
      Node n4 = new Node(3, n5);
      Node n3 = new Node(3, n4);
      Node n2 = new Node(2, n3);
      Node n1 = new Node(1, n2);

      delMidNode(n4);
      delMidNode(n6);

      while (n1 != null) {
         System.out.println(n1.val);
         n1 = n1.next;
      }
   }

   public static void delMidNode(Node head) {
      if (head == null || head.next == null) {
         return;
      }
      head.val = head.next.val;
      head.next = head.next.next;
   }
}

