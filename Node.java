public class Node implements Comparable<Node> {
    Node left = null; Node right = null; String value = null;
    
    public Node(String value) { this.value = value; }
    public void visit() { System.out.println(value + " visited"); }
    public Node getLeft() { return left; }
    public void setLeft(Node left) { this.left = left; }
    public Node getRight() { return right; }
    public void setRight(Node right) { this.right = right; }
    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }
   
    @Override
    public int compareTo(Node other) { return value.compareTo(other.getValue()); }
}
