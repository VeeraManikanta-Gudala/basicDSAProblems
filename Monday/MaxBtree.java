package Monday;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TNode{
    TNode left;
    int data;
    TNode right;
    TNode (int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public String toString(){
        return " "+data;
    }
}
public class MaxBtree {
    static TNode creteBtree(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root node");
        int data = sc.nextInt();
        if(data == -1) return null;
//        if(data.equalsIgnoreCase("stop")) return null;
        TNode node = new TNode(data);
        System.out.println("Enter left node for root");
        node.left = creteBtree();
        System.out.println("Enter right node for root");
        node.right = creteBtree();
        return  null;
    }
    static  int findMaxNode(TNode root){
        int max = -1;
        Queue<TNode> que = new LinkedList<>();
        if(root==null) return  max;
        que.add(root);
        while(!que.isEmpty()){
            TNode node = que.poll();

            if(node!=null){
                if(node.data > max)
                    max = node.data;
            }

            if(node.left != null){
                que.add(node.left);
            }
            if(node.right !=null){
                que.add(node.right);
            }

        }
        return max;
    }
    public static void main(String[] args) {
        TNode root = creteBtree();
        int max = findMaxNode(root);
        System.out.println("maximum value is : "+max);
    }
}
