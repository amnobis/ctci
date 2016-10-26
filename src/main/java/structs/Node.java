package structs;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Node {
   public int val;
   public Node next;

   public Node(int val, Node next) {
      this.val = val;
      this.next = next;
   }
}
