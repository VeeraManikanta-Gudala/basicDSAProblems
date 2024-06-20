package TuesDay;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class MgGraph {
    LinkedList<Integer>[] vList;
    int nv;
    public MgGraph(int size) {
        this.nv = size;
        vList = new LinkedList[size];

        for(int i=0;i<size;i++) {
            vList[i] = new LinkedList<Integer>();
        }
    }
    public void createEdge(int v, int d) {
        vList[v].add(d);
    }
    public void displayEdgesForVertex(int v) {
        if( (vList[v] != null) && (vList[v].isEmpty())){
            System.out.println("for Vertex "+v+" no edges");
        }
        else if(vList[v] != null) {
            for(Integer val :vList[v]) {
                System.out.println("("+ v+","+val+ ")");
            }
        }
    }
    public void bfs(int root) {
        Queue<Integer> bfsQ = new LinkedList<Integer>();
        bfsQ.add(root);
        boolean[] vVisted = new boolean[this.nv];
        while(!bfsQ.isEmpty()) {
            int  vertex = bfsQ.poll();
            vVisted[vertex] = true;
            System.out.print(vertex+" ");
            for(Integer val :vList[vertex]) {

                if((vVisted[val] == false) &&
                        (!bfsQ.contains(val))
                ){
                    bfsQ.add(val);
                }
            }
        }
    }
    public void dfs(int root){
        Stack<Integer> dfstk = new Stack<>();
        dfstk.push(root);

        boolean[] vVisted = new boolean[this.nv];

        vVisted[root] =true;
        System.out.print(root + " ");
        do {
            int  vertex = dfstk.pop();
            for(Integer val :vList[vertex]) {

                if((vVisted[val] == false) &&
                        (!dfstk.contains(val))
                ){
                    System.out.print(val+" ");
                    vVisted[val] = true;

                    dfstk.push(val);
                }
            }
        } while(!dfstk.isEmpty());

    }

}
public class Graphs {

    public static void main(String[] args) {
        int nV =7;
        MgGraph mgGrapgh = new MgGraph(nV);
        mgGrapgh.createEdge(0,1);
        mgGrapgh.createEdge(0,3);

        mgGrapgh.createEdge(1,0);
        mgGrapgh.createEdge(1,3);
        mgGrapgh.createEdge(1,2);
        mgGrapgh.createEdge(1,6);
        mgGrapgh.createEdge(1,5);

        mgGrapgh.createEdge(2,1);
        mgGrapgh.createEdge(2,3);
        mgGrapgh.createEdge(2,4);
        mgGrapgh.createEdge(2,5);

        mgGrapgh.createEdge(3,0);
        mgGrapgh.createEdge(3,1);
        mgGrapgh.createEdge(3,2);
        mgGrapgh.createEdge(3,4);

        mgGrapgh.createEdge(4,2);
        mgGrapgh.createEdge(4,3);
        mgGrapgh.createEdge(4,6);

        mgGrapgh.createEdge(5,1);
        mgGrapgh.createEdge(5,2);


        mgGrapgh.createEdge(6,1);
        mgGrapgh.createEdge(6,4);
        System.out.println("bfs");
        mgGrapgh.bfs(0);
        System.out.println("\ndfs");
        mgGrapgh.dfs(3);
    }
}