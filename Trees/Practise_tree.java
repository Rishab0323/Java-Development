public class BinaryTree{
    private Node root;

    class Node{
        int val;
        Node left;
        Node right;

        Node (int val,Node left,Node right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
    }

    BinaryTree(int value){
        root = new BinaryTree(value);
    }

    public Node getValue(){
        return root;
    }
}

class Practise_tree{
    public static void main(String [] args){
        BinaryTree tree = new BinaryTree(2);

    }
}

     Node(int val,Node left,Node right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    Node getValue(){
        return value;
    }
}

class Practise_tree{
    public static void main(String [] args){
        BinaryTree tree = new BinaryTree(2);

    }
}