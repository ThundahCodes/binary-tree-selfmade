public class App {
    public static void inorder(Node node) {
        if (node == null) { return; } 
        else {
            inorder(node.getLeft());
            node.visit();
            inorder(node.getRight());
        }
    }

    public static void insert(Node parent, Node new_node) {
        if (parent.compareTo(new_node) < 0) {
            if (parent.getLeft() == null) {
                parent.setLeft(new_node);
            }
            else {
                insert(parent.getLeft(), new_node);
            }
        }
        else if (parent.compareTo(new_node) > 0) {
            parent.setRight(new_node);
        }
    }

    public static void main(String[] args) {
        Node a = new Node("a"); Node d = new Node("d"); Node b = new Node("b");
        Node e = new Node("e"); Node c = new Node("c"); Node f = new Node("f");

        insert(f, e); insert(f, d); insert(f, c); insert(f, b); insert(f, a);

        inorder(f);
    }
}
