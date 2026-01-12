import java.util.*;

class graphPractise{
    private int v;
    private LinkedList<Integer>[] adj;

    public graphPractise(int v){
        this.v = v;
        adj = new LinkedList[v];
        
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList<>();
        }
    }
   
   public void addEdge(int u,int v,boolean bidir){
        adj[u].add(v);
        if(bidir){
            adj[v].add(u);
        }
   }

   public void printgraph(){
        for(int i=0;i<v;i++){
            System.out.print(i +"-->");
            for(int node : adj[i]){
                System.out.println(node +",");
            }
            System.out.println();
        }
   }

   public static void main(String[] args){
        graphPractise g= new graphPractise(5);
        g.addEdge(1,0,true);
        g.addEdge(2,0,false);
        g.addEdge(3,4,false);

        g.printgraph();
   }
}