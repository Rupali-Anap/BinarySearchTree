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
        }
    }

