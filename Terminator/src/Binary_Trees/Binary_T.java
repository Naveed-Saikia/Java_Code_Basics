package Binary_Trees;
import java.util.Scanner;

public class Binary_T {
    Node root;
    
    class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public void populate(Scanner sc) {
        System.out.println("Enter the value of the root node:");
        int rootVal = sc.nextInt();
        root = new Node(rootVal);  // Initialize root node
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter left value of " + node.val + "? (true/false)");
        boolean isLeft = sc.nextBoolean();
        if (isLeft) {
            System.out.println("Enter left value of " + node.val + ":");
            int val = sc.nextInt();
            Node leftNode = new Node(val);
            node.left = leftNode;
            populate(sc, leftNode);
        }

        System.out.println("Do you want to enter right value of " + node.val + "? (true/false)");
        boolean isRight = sc.nextBoolean();
        if (isRight) {
            System.out.println("Enter right value of " + node.val + ":");
            int val = sc.nextInt();
            Node rightNode = new Node(val);
            node.right = rightNode;
            populate(sc, rightNode);
        }
    }

    public void display(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Binary_T tree = new Binary_T();  // Create an instance of Binary_T
        tree.populate(sc);

        System.out.println("The tree in preorder traversal is:");
        tree.display(tree.root);
        sc.close();
    }
}
