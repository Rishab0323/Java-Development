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

public List<List<Integer>> levelOrder(TreeNode root){
    List<List<Intger>> result = new ArrayList<>();

    if(root == null){
        return result;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    While(!queue.isEmpty()){
        int levelSize = queue.size();
        List<Integer> currentLevel = new ArrayList<>(levelSize);
        for(int i=0;o<levelSize;i++){
            TreeNode  cuurentNode =queue.poll();
            currentLevel.add(currentNode).val;
            if(curentNode.left != null ){
                queue.offer(curentNode.left);
            }
            if(currentLevel.right != null){
                queue.offer(currentNode.right);
            }
        }
        result.add(currentLevel);
    }
    return result;
}

}

class Practise_tree{
    public static void main(String [] args){
        BinaryTree tree = new BinaryTree(2);

    }
}