package BinaryTree;

public class problem10 {
    public class binarytree {
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

        static class TreeInfo {
            int height;
            int diameter;

            TreeInfo(int height, int diameter) {
                this.height = height;
                this.diameter = diameter;
            }
        }

        public static TreeInfo diameter2(Node root) {

            if (root == null) {
                new TreeInfo(0, 0);
            }

            TreeInfo left = diameter2(root.left);
            TreeInfo right = diameter2(root.right);
             
            int myHeight = Math.max(left.height, right.height) +  1;

            int diam1 = left.diameter;
            int diam2 = right.diameter;
            int diam3 = left.height + right.height + 1;

            int myDiameter = Math.max(diam3, Math.max(diam1, diam2));

            TreeInfo myInfo = new TreeInfo(myHeight, myDiameter);
            return myInfo;
        }
    
    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryBuildTree tree = new BinaryBuildTree();
        Node root = tree.buildTree(nodes);
        
        System.out.println(diameter2(root));
    }
    }
}
