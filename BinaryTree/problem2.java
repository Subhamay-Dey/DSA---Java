package BinaryTree;

public class problem2 {
    public class Binarytree {
        static class Node {
            int data;
            Node left;
            Node right;

            Node(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }

        static class BinaryBuildTree {
            static int idx = -1;
            public static Node buildTree(int nodes[]) {
                idx++;
                if(nodes[idx] == -1) {
                    return null;
                }
                Node newNode = new Node(nodes[idx]);
                newNode.left = buildTree(nodes);
                newNode.right = buildTree(nodes);

                return newNode;
            }
        }

        public static void preorder(Node root) {
            if(root == null) {
                return;
            }
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    
    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryBuildTree tree = new BinaryBuildTree();
        Node root = tree.buildTree(nodes);
        preorder(root);
    }
    }
}
