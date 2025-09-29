import java.util.*;

Class LevelOrder{

    class Node{
        private int value;
        private Node left;
        private Node right;
    }

    private Node root;

    public Node(){
        this.value = value;
    }

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

    public void levelTraversal(Node root){
        if(root == null){
            return; 
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(! q.isEmpty()){
            Node curNode = q.remove();
            if(curNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
                else{
                    System.out.print(curNode.data +"  ");
                    if(curNode.left != null){
                        q.add(currNode.left);  
                    }

                    if(curNode.right != null){
                        q.add(curNode);
                    }
                }
            }
        }
    }

    public static void main(String [] args){

        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        LevelOrder lvl = new LevelOrder();
        Node root = lvl.build(nodes);

        lvl.levelTraversal(root);

    }
}