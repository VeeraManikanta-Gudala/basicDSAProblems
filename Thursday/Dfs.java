class Graph {
    int vertices;
    int[][] adjMatrix;

    Graph(int vertices) {
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices];
    }

    void addEdge(int src, int dest) {
        adjMatrix[src][dest] = 1;
        adjMatrix[dest][src] = 1;
    }

    void printGraph() {
        for (int[] row : adjMatrix) {
            for (int j : row) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void depthfirstsearch(int start) {
        boolean[] visited = new boolean[vertices];
        dfsUtil(start, visited);
    }

    private void dfsUtil(int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");
        for (int i = 0; i < vertices; i++) {
            if (!visited[i] && adjMatrix[start][i] == 1) {
                dfsUtil(i, visited);
            }
        }
    }
}

public class Dfs {
    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);

        System.out.println("Adjacency Matrix:");
        graph.printGraph();
        
        System.out.println("\nDFS Traversal starting from vertex 0:");
        graph.depthfirstsearch(0);
    }
}
