class PrTree{

    private Node root;
    
    private class Node {
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }

    }

    private Node insert(Node node,int value){
        if(node == null){
            Node newNode = new Node(value);
            return newNode;
        }

        if(value < node.value){
            node.left = insert(node.left,value);
        }

        if(value > node.value){
            node.right = insert(node.right,value);
        }
        return node;
    }


    public void insertSorted(int value){
        root = insert(root,value);

    }

    public void display(){
        if(root == null){
            System.out.println("root is empty" +root);
            return;
        }
        System.out.println(root.value);
        return;
        
    }
}

class PracTree{
    public static void main(String [] args){
        PrTree tree = new PrTree();
        tree.display();

        // int nums[] = {1,2,3,4,5,6,7,8,9};
        int num = 12;
        tree.insertSorted(num);
        tree.display();
        
    }
    }
