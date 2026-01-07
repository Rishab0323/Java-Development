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
//leetcode problem 102

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
            currentLevel.add(currentNode.val);
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

//leetcode problem 637
public List<Double> averageOfLevels(Node root){
    List<Double> avg = new ArrayList<>();
    
    if(root == null){
        return avg;
    }
    
    Queue<Node> queue = new ArrayList<>();
    queue.offer(root);

    while(!queue.isEmpty()){
        int levelSize = queue.size();
        double averagelevels = 0;
        for(int i=0;i<levelSize;i++){
            Node currentNode = queue.poll();
            averagelevels += currentLevel.val;
            if(curentNode.left != null){
                queue.offer(curentNode.left);
            }
            if(curentNode.right != null){
                queue.offer(curentNode.right);
            }
            int currentAvg = averagelevels/levelsize;
            avg.add(currentAvg);
        }
    return avg;
    }

    //leetcode problem 103
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean reverse = false;
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            
            for(int i=0;i<levelSize;i++){
                if(!reverse){
                TreeNode currentNode =queue.pollFirst();
                currentLevel.add(currentNode.val);
                 if(currentNode.left != null ){
                queue.addLast(currentNode.left);
                 }
                if(currentNode.right != null){
                queue.addLast(currentNode.right);
                }
            }
            else{
                
            TreeNode  currentNode =queue.pollFirst();
            currentLevel.add(currentNode.val);
            if(currentNode.right != null ){
            queue.offer(currentNode.left);
                }
            if(currentNode.left != null){
            queue.offer(currentNode.right);
            }    
                }  
                    }  
            reverse = !reverse;
            result.add(currentLevel);        
        }
    return result;
    }


    //leetcode problem 116

    public Node connect(Node root) {
   
        if(root == null){
            return null;
        }
        Node leftMost = root;

        while(leftMost.left != null){
        Node current = leftMost;
        while(current != null ){
            current.left.next = current.right;
            if(current.next != null ){
            current.right.next = current.next.left;
        }
        current = current.next;
        }
        leftMost = leftMost.left;
    }
    return root;
}

//leetcode problem 199
public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

    if(root == null){
        return result;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    while(!queue.isEmpty()){
        int levelSize = queue.size();
        
        for(int i=0;i<levelSize;i++){
            TreeNode  currentNode =queue.poll();
            
            if(i==levelSize -1){
                result.add(currentNode.val);
            }

            if(currentNode.left != null ){
                queue.offer(currentNode.left);
            }
            if(currentNode.right != null){
                queue.offer(currentNode.right);
            }
        }    
    }
    return result;
    }

} 


class Practise_tree{
    public static void main(String [] args){
        BinaryTree tree = new BinaryTree(2);

    }
}