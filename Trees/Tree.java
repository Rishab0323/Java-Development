import java.util.Scanner;

class Tree{

    public Tree(){

    }

    private class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    //insert element
    public void populate(Scanner sc){
        System.out.println("enter the root node");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc,root);
    }

    private void populate(Scanner sc, Node node){
        System.out.println("do you want to enter left of " +node.value);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("enter the value of the left of" +node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc,node.left);
        }

        System.out.println("do you want to enter right of " +node.value);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("enter the value of the right  of" +node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc,node.right);
        }
    }

    public void display(){
        display(root, " ");
    }

    private void display(Node node,String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent +"\t");
        display(node.right, indent +"\t");
          
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Tree  tr = new Tree();
        tr.populate(sc);
        tr.display();
    }
}