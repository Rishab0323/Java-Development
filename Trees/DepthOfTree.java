class DepthOfTree{

    class Node{
        private int value;
        private Node left;
        private Node right;

        DepthOfTree(int value,Node root){
            this.value = value;
            
        }
    }
    public static void main(String [] args){
         public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        return Math.max(leftHeight,rightHeight) + 1;

    }
    }
}