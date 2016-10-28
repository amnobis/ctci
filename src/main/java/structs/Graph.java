package structs;

/**
 * @author anobis
 */
public class Graph {
    public Node[] nodes;

    public static class Node {
        public String name;
        public Node[] children;
    }
}
