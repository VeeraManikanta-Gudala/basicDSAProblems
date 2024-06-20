package Monday;
import java.util.LinkedList;
import java.util.Queue;

class BNode {
    int key;
    BNode left, right;

    public BNode(int item) {
        key = item;
        left = right = null;
    }
}

public class BSTS {
    BNode root;

    BSTS() {
        root = null;
    }

    void printLevelOrderWithFormatting() {
        if (root == null)
            return;

        Queue<BNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        int spaces = 50; // Initial spaces

        while (!queue.isEmpty()) {
            int nodeCount = queue.size();
            if (nodeCount == 0)
                break;

            for (int i = 0; i < spaces; i++)
                System.out.print(" ");
            spaces -= 5; // Reduce spaces for each level

            while (nodeCount > 0) {
                BNode tempNode = queue.poll();
                System.out.print(tempNode.key + " ");
                if (tempNode.left != null)
                    queue.add(tempNode.left);
                if (tempNode.right != null)
                    queue.add(tempNode.right);
                nodeCount--;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        BSTS tree = new BSTS();
        tree.root = new BNode(1);
        tree.root.left = new BNode(2);
        tree.root.right = new BNode(3);
        tree.root.left.left = new BNode(4);
        tree.root.left.right = new BNode(5);
        tree.root.right.left = new BNode(6);
        tree.root.right.right = new BNode(7);
        System.out.println("Level order traversal ");
        tree.printLevelOrderWithFormatting();
    }
}
