package BinaryOperation;

public class BinaryTree {
        static class Node {
            int value;
            Node left, right;

            Node(int value){
                this.value = value;
                left = null;
                right = null;
            }
        }

        public void insert(Node node, int value) {
            if (value < node.value) {
                if (node.left != null) {
                    insert(node.left, value); }
                else {
                    System.out.println(" Inserted " + value + " to left of " + node.value); node.left = new Node(value);
                }
            }
            else if (value > node.value) {
                if (node.right != null) {
                    insert(node.right, value);
                } else {
                    System.out.println(" Inserted " + value + " to right of "
                            + node.value);
                    node.right = new Node(value);
                }
            }
        }


        public static void main(String args[])
        {
            BinaryTree tree = new BinaryTree();
            Node root = new Node(56);
            System.out.println("Binary Tree Example");
            System.out.println("Building tree with root value " + root.value);
            tree.insert(root, 30);
            tree.insert(root, 70);



            System.out.println("\n");
            Node root1 = new Node(30);
            System.out.println("Building tree with root value " + root1.value);
            System.out.println("Siblings");
            tree.insert(root, 22);
            tree.insert(root, 40);

            System.out.println("\n");
            Node root2 = new Node(70);
            System.out.println("Building tree with root value " + root2.value);
            tree.insert(root, 60);
            tree.insert(root, 95);

            System.out.println("\n");
            Node root3 = new Node(22);
            System.out.println("Building tree with root value " + root3.value);
            System.out.println("Parent key");
            tree.insert(root, 11);

            System.out.println("\n");
            Node root4 = new Node(11);
            System.out.println("Building tree with root value " + root4.value);
            System.out.println("Child value");
            tree.insert(root, 3);
            tree.insert(root, 16);

            System.out.println("\n");
            Node root5 = new Node(60);
            System.out.println("Building tree with root value " + root5.value);
            tree.insert(root, 65);

            System.out.println("\n");
            Node root6 = new Node(65);
            System.out.println("Building tree with root value " + root6.value);
            System.out.println("Leaf nodes");
            tree.insert(root, 63);
            tree.insert(root, 67);

        }
}



