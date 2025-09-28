class BuildTree{

    static class Node{
            int value;
            Node right;
            Node left;

            Node(int value){
                this.value = value;
                this.left = null;
                this.right = null;
            }
        }
    static class BinaryTree{
        static int index = -1;
        public static Node build(int nodes[]){
            index++;
            if(nodes[index] == -1){
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = build(nodes);
            newNode.right = build(nodes);

            return newNode;

        }

        public void preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.value +" ");
            preorder(root.left);
            preorder(root.right);
        }

        public void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.value +" ");
            inorder(root.right);
        }

        public void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.value +" ");
        }
    }
    public static void main(String [] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.build(nodes);
        System.out.println("root is" +root.value);
        bt.preorder(root);
        System.out.println("printing inorder traversal");
        bt.inorder(root);
        System.out.println("printing postorder traversal");
        bt.postorder(root);


    }
}