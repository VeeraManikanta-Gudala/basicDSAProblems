
import java.util.LinkedList;
import java.util.Queue;

class Graph{
    int vertices;
    int[][] adjMatrix;
    Graph(int vertices){
        this.vertices=vertices;
        adjMatrix=new int[vertices][vertices];
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

    void bfs(int start) {
        boolean visited[]=new boolean[vertices];
        Queue<Integer> q=new LinkedList<>();
        visited[start]=true;
        q.add(start);
        while(!q.isEmpty())
        {
            start=q.poll();
            System.out.print(start+" ");
            for(int i=0;i<vertices;i++)
            {
                if(!visited[i]&&adjMatrix[start][i]==1)
                {
                    //adj nodes->i
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
    }
      
}
public class B_bfs{
    public static void main(String[] args) {
        Graph graph=new Graph(4);
        graph.addEdge(0,1);
        graph.addEdge(0,3);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.printGraph();
        System.out.println("bfs");
        graph.bfs(0);
    }
}
