class DimaterOfTree {

     public int height(TreeNode root){
            if(root  == null){
                return 0;
            }

            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh,rh) + 1;
        }
    public int diameterOfBinaryTree(TreeNode root) {
       
        if(root == null){
            return  0;
        }
        int leftDiam = diameterOfBinaryTree(root.left);
        int leftht = height(root.left);
        int rightDiam = diameterOfBinaryTree(root.right);
        int rightht = height(root.right);

        int selfDiam = leftht + rightht ;
        return Math.max(selfDiam,Math.max(leftDiam,rightDiam));
    }
}