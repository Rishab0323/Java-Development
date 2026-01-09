import java.util.*;

    class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src,int dest,int wt){
        this.src = src;
        this.dest = dest;
        this.wt = wt;
        }
    // dfs
        public void dfs(ArrayList<Edge> graph,int cur,boolean vis[]){
            System.out.println(curr +" ");
            vis[cur] = true;

            for(int i=0;i<graph[cur].size();i++){
                Edge e = graph[cur].get(i);
                if(!vis[cur]){
                    dfs(graph,e.dost,vis);
                }
            }
        }

        //bfs
        public void bfs(ArrayList<Edge>[] graph){
            Queue<Integer> q= new LinkedList<>();
            boolean vis[] = new boolean[graph.length];
            q.add(0);

            while(!q.size()){
                System.out.print(cur +" ");
                vis[cur] = true;
                for(int i=0;i<graph[cur].size;i++){
                    Edge e = graph[cur].get(i);
                    q.add(e.dost);
                }
            }
        }
    }

    
class Graph{
    public static void main(String [] args){

        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for(int i=0;i<V;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,5));

        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));
        graph[1].add(new Edge(1,3,3));

        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,4));

        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));

        graph[4].add(new Edge(4,2,2));

        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println("2 -> " +e.dest +" (wt = " +e.wt +")");
        }
    }
}