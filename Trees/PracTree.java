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


public void populate(Node node){
    Sytstem.out.println(" insert value in tree 1 for left / other num for right  ");
    Scanner sc = new Scanner(System.in);
    int decision = sc.nextInt();
    if(decision != 1){
        insert(node,)
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

    public List<List<Integer>> levelOrder(){
        List<List<Integer>> res = new ArrayList<>();

        if(root == null){
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);

            for(int i=0;i<levelSize;i++){
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.value);
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            res.add(currentLevel);
        }
        return res;
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
