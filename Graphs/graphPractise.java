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

    //dfs
    public void dfs(int src){
            Map<Integer,Boolean> visited = new HashMap<>();
            dfsHelper(src,visited);
        }

        public void dfsHelper(int src,Map<Integer,Boolean> visited){
            visited.put(src,true);
            System.out.print(src +" ");
            for(int neighbor : adj[src]){
                if(!visited.get(neighbor)){
                    dfsHelper(neighbor,visited);
                }
            }
        }
   public static void main(String[] args){
        graphPractise g= new graphPractise(5);
        g.addEdge(1,0,true);
        g.addEdge(2,0,false);
        g.addEdge(3,4,false);

        g.printgraph();

        g.dfs(0);
   }

   ///leetcode problem 797
   public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        path.add(0);
        dfs(graph,0,res,path);


        return res;
    }
    private void dfs(int [][] graph,int node,List<List<Integer>> res,List<Integer> path){
        if(node == graph.length-1){
            res.add(new ArrayList<Integer>(path));
            return;
        }

        for(int nextNode : graph[node]){
            path.add(nextNode);
            dfs(graph,nextNode,res,path);
            path.remove(path.size() - 1);
        }
    }
}