package ch2;

import structs.Node;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem2 {
   public static void main(String[] args) {
      Node n7 = new Node(6, null);
      Node n6 = new Node(5, n7);
      Node n5 = new Node(3, n6);
      Node n4 = new Node(3, n5);
      Node n3 = new Node(3, n4);
      Node n2 = new Node(2, n3);
      Node n1 = new Node(1, n2);

      System.out.println(kthToLast(n1, 6).val);
   }

   public static Node kthToLast(Node head, int k) {
      Node p1 = head;
      Node p2 = head;

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
