package Thursday;

import java.util.Scanner;

class BNode {
    BNode left = null;
    int data;
    BNode right = null;
    BNode(int data){
        this.data = data;
    }
    @Override
    public String toString(){
        return ""+data;
    }

}

public  class BinaryTreeCreation{
    static BNode createBinaryTree(){
        BNode root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Root");
        int data = sc.nextInt();
        if(data==-1) return null;
        root = new BNode(data);
        System.out.println("Enter node for left of root");
        root.left = createBinaryTree();
        System.out.println("Enter node for right of root");
        root.right = createBinaryTree();
        return root;
    }
    static void inOrder (BNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root+ " ");
        inOrder(root.right);

    }

    static void preOrder(BNode root){
        if(root == null) return;
        System.out.print(root + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(BNode root){
        if(root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root + " ");
    }
    static int heightOfTree(BNode root){
        if(root == null) return  0;
        else{
            int lh = heightOfTree(root.left);
            int rh = heightOfTree(root.right);
            if(lh>rh){
                return lh+1;
            }else{
                return rh+1;
            }
        }
    }
    public static void printLeveWise(BNode root , int i){
        if(root == null){
            return;
        } else if (i == 1 ) {
            System.out.print(root + " ");
        } else if (i>1) {
            printLeveWise(root.left,i-1);
            printLeveWise(root.right,i-1);
        }
    }

    public static void main(String[] args) {
        BNode root = createBinaryTree();
        System.out.println("\nInorder Traversal");
        inOrder(root);
        System.out.println("\nPreorder Traversal");
        preOrder(root);
        System.out.println("\nPostOrder traversal");
        postOrder(root);
        System.out.println("\nheight of the tree is " + heightOfTree(root)) ;
        System.out.println("Printing level nodes");
        for(int i = 1;i<=heightOfTree(root);i++){
            System.out.println("\nprinting level " + i);
            printLeveWise(root,i);
        }

    }
}