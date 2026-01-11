class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src,int dest,int wt){
        this.src = src;
        this.dest = dest;
        this.wt = wt;
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

    public static void calcIndeg(ArrayList<Edge> graph ,int indeg[]){
        for(int i=0;i<graph.length;i++){
            int v = i;
            for(int j=0;j<graph[v].length;j++){
                Edge e = graph[v].get(i);
                indeg[e.dest]++;
            }
        }
    }

    public static void topSort(ArrayList<Edge> graph[]){
        int indeg[] = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<indeg.length;i++){
            if(indeg[i] == 0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int cur = q.remove();
            System.out.pritn(cur +"  ");

            for(int i=0;i<graph[cur].size();i++){
                Edge e = graph[cur].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest] == 0){
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    //djkstra
    public static dijkstra(ArrayList<Edge> graph[],int src){
        int dist[] = new [int graph.length];
        for(int i=0;i<graph.length;i++){
            if(!src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        boolean vis[] = new boolean[graph.length];
        ProirityQueue<Pair> pq = new ProirityQueue<>();
        pq.add(new Pair(src,path));

        while(!pq.isEmpty()){
            Pair cur = pq.remove();
            if(!vis[cur.n]){
                vis[cur.n] = true;

                 
            }
        }
    }

    @Override
    public int compareTo(Pair P2){
        return this.path - p2.path; 
    }

    static class Pair{
        int n;
        int path;

        public pair(int n,int path){
            this.n = n;
            this.path = path;
        }
    }

    public static void bellmanford(ArrayList<Edge> graph[],int src){
        int dist[] = new int[graph.length];
        for(int i=0;i<dist.length;i++){
            if(i != src){
                dist[i] = Intger.MAX_VALUE;
            }
        }

        int V = graph.length;
        for(int i=0;i<V-1;i++){
            for(int j=0;j<graph.length;j++){
                for(int k=0;k<graph.length;k++){
                    Edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int  wt = e.wt;

                    if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[u] ){
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }

        for(int i=0;i<dist.length;i++){
            System.out.print(dist[u] +" ");
        }
        System.out.println()
    }
}