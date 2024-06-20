package Friday.Questions;


import java.util.LinkedList;
import java.util.List;

public class SpanningTree {
    static class Edge{
        int src, dest, wt;
        public Edge(int src,int dest,int wt){
            this.dest = dest;
            this.src = src;
            this.wt = wt;
        }
    }
    static class SubSet{
        int parent,rank;
        public SubSet(int parent , int rank){
            this.parent = parent;
            this.rank = rank;
        }
    }

    public static void main(String[] args) {
        int v = 0;
        List<Edge> graphEdges = new LinkedList<Edge>(
                List.of(
                        new Edge(0, 1, 4),
                        new Edge(1, 2, 8),
                        new Edge(1, 7, 11),
                        new Edge(2, 3, 7),
                        new Edge(2, 8, 2),
                        new Edge(2, 5, 4),
                        new Edge(3, 4, 9),
                        new Edge(3, 5, 14),
                        new Edge(4, 5, 10),
                        new Edge(5, 2, 4),
                        new Edge(5, 6, 2),
                        new Edge(6, 7, 1),
                        new Edge(6, 8, 6),
                        new Edge(7, 0, 8),
                        new Edge(7, 1, 11),
                        new Edge(7, 8, 7)
                )
        );
        graphEdges.sort(new Comparator<Edge>() {
            @Override public int compare(Edge o1, Edge o2)
            {
                return o1.weight - o2.weight;
            }
        });
        kruskals(V, graphEdges);
    }
    public static void kruskals(int v,List<Edge> edges){
        int j = 0;
        int noOfEdges = 0;
        SubSet[] subSets = new SubSet[v];
        Edge[] results = new Edge[v];
        for (int i = 0; i < v; i++) {
            subSets[i] = new SubSet(i,0);
        }

    }
}
