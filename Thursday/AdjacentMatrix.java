
import java.util.LinkedList;
import java.util.Queue;

class Graph{
    int vertices;
    int[][] adjMatrix;
    LinkedList<Integer>[] adjlist;
    Graph(int vertices){
        
        this.vertices=vertices;
        adjMatrix=new int[vertices][vertices];
        adjlist=new LinkedList[vertices];
        for(int i=0;i<vertices;i++)
        {
            adjlist[i]=new LinkedList<>();
        }
       

    }
   
    void add(int src,int dest){
        adjlist[src].addFirst(dest);
    }
    void addEdge(int src,int dest)
    {
        adjMatrix[src][dest]=1;
        adjMatrix[dest][src]=1;
    }
    void printGraph(){
        for(int i[]:adjMatrix)
        {
            for(int j:i) {
                System.out.print(j+" ");
            }
            System.out.println();           
        }
        
    }
    void depthfirstsearch(int start) {
        boolean[] visited = new boolean[vertices];
        dfsUtil(start, visited);
    }

    private void dfsUtil(int start, boolean[] visited) {
       visited[start]=true;
       System.out.print(start+" ");
       for(int Adjvetice:adjlist[start])
       {
        if(!visited[Adjvetice])
        {
            dfsUtil(Adjvetice, visited);
        }
       }
    }
    void bfs(int start)
    {
        boolean visited[]=new boolean[vertices];
        Queue<Integer> q=new LinkedList<>();
        visited[start]=true;
        q.add(start);
        for(int Adjvetice:adjlist[start])
       {
            start=q.poll();
            System.out.print(start+" ");
            if(!visited[Adjvetice])
            {
                visited[Adjvetice]=true;
                q.add(Adjvetice);
            }
       }
    }
}


public class AdjacentMatrix {
    public static void main(String[] args) {
        Graph graph=new Graph(5);
        graph.add(0, 1);
        graph.add(0, 2);
        graph.add(1, 3);
        graph.add(2, 3);
        graph.add(3, 0);
        graph.add(3, 4);
        graph.add(4, 1);
        for(LinkedList<Integer> i:graph.adjlist){
            System.out.println(i);
        }
        graph.depthfirstsearch(0);
        System.out.println();
        graph.bfs(0);

    }
}
