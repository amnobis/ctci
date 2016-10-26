package ch2;

import structs.Node;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem5 {
   public static void main(String[] args) {
      Node n3 = new Node(3, null);
      Node n2 = new Node(2, n3);
      Node n1 = new Node(1, n2);

      Node n7 = new Node(7, null);
      Node n6 = new Node(6, n7);
      Node n5 = new Node(5, n6);
      Node n4 = new Node(4, n5);

   }
}
