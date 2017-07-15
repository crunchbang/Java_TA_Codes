
class BinTree2 {
        int value;
        BinTree2 left, right;

        public BinTree2(int v, BinTree2 l, BinTree2 r) {
                value = v;
                left = l;
                right = r;
        }

        /*
         * check if key is present in the tree
         */
        public boolean find(int key) {
                if (value == key)
                        return true;
                else {
                        boolean inLeft = false;
                        boolean inRight = false;

                        if (left != null) {
                                inLeft = left.find(key);
                        }

                        if (!inLeft && right != null) {
                                inRight = right.find(key);
                        }

                        return (inLeft | inRight);
                }
        }

        /*
         * find number of keys in tree
         */
        public int numberOfNodes() {
                int numNodes = 0;
                if (left == null && right == null) {
                        numNodes = 1;
                } else {
                        int numNodesLeft = 0;
                        if (left != null) {
                                numNodesLeft = left.numberOfNodes();
                        }

                        int numNodesRight = 0;
                        if (right != null) {
                                numNodesRight = right.numberOfNodes();
                        }

                        numNodes = 1 + numNodesLeft + numNodesRight;
                }
                return numNodes;
        }

        /*
         * find total value of all keys in tree
         */
        public int totalValue() {
                int totalVal = 0;
                if (left == null && right == null) {
                        totalVal = value;
                } else {
                        int totalValLeft = 0;
                        if (left != null) {
                                totalValLeft = left.totalValue();
                        }

                        int totalValRight = 0;
                        if (right != null) {
                                totalValRight = right.totalValue();
                        }

                        totalVal = value + totalValLeft + totalValRight;
                }
                return totalVal;
        }

        /*
         * check if key is a descendent of current node(calling object)
         */
        public boolean isDescendent(int key) {
                boolean inLeftSubTree = false;
                if (left != null) {
                        inLeftSubTree = left.find(key);
                } 

                boolean inRightSubTree = false;
                if (!inLeftSubTree && right != null) {
                        inRightSubTree = right.find(key);
                }

                return (inLeftSubTree | inRightSubTree);
        }

        /*
         * check of node1 & node2 are children of the same parent
         */
        public boolean areSiblings(int node1, int node2) {
                boolean status = false;

                if (left != null && right != null) {
                        if (left.value == node1 && right.value == node2)
                                status = true;
                } 

                if (!status && left != null) {
                        status = left.areSiblings(node1, node2);
                } 

                if (!status && right != null) {
                        status = right.areSiblings(node1, node2);
                }

                return status;
        }

        /*
         * helper function for areCousins.
         * find the level number of node in tree
         */
        public int findLevel(int node) {
                int level = -1;
                if (value == node) {
                        level = 0;
                } else {
                        int levelLeft = -1; 
                        int levelRight = -1;

                        if (left != null)
                                levelLeft = left.findLevel(node);
                        if (levelLeft != -1 && right != null) 
                                levelRight = right.findLevel(node);

                        level = 1 + Math.max(levelLeft, levelRight);
                }
                return level;
        }

        /*
         * check if node1 & node2 are cousins (nodes at the same level but 
         * not siblings).
         */
        public boolean areCousins(int node1, int node2) {
                int node1Level = findLevel(node1);
                int node2Level = findLevel(node2);
                boolean status = false;

                if (node1Level == node2Level) {
                        if (!areSiblings(node1, node2))
                                status = true;
                        else
                                status = false;
                }
                return status;
        }


        /*
         * find lowest common ancestor of node1 & node2
         */
        public int closestCommonAncestor(int node1, int node2) {
                if (value == node1 || value == node2)
                        return value;

                int valLeft = -1, valRight = -1;
                if (left != null) {
                        valLeft = left.closestCommonAncestor(node1, node2);
                }

                if (right != null) {
                        valRight = right.closestCommonAncestor(node1, node2);
                }

                if (valLeft != -1 && valRight != -1) {
                        return value;
                } else if (valLeft != -1) {
                        return valLeft;
                } else {
                        return valRight;
                }
        }
}

class BinTree2Tester {
        public static void main(String[] args) {
                BinTree2 node4 = new BinTree2(4, null, null);
                BinTree2 node6 = new BinTree2(6, null, null);
                BinTree2 node5 = new BinTree2(5, null, null);
                BinTree2 node7 = new BinTree2(7, null, null);
                BinTree2 node2 = new BinTree2(2, node4, node6);
                BinTree2 node3 = new BinTree2(3, node5, node7);
                BinTree2 node1 = new BinTree2(1, node2, node3);


                System.out.println("find(3) : " + node1.find(3));
                System.out.println("numberOfNodes() : " + node1.numberOfNodes());
                System.out.println("totalValue() : " + node1.totalValue());
                System.out.println("node3.isDescendent(5) : " + node3.isDescendent(5));
                System.out.println("node2.isDescendent(7) : " + node2.isDescendent(7));
                System.out.println("areSiblings(2, 3) : " + node1.areSiblings(2, 3));
                System.out.println("areSiblings(4, 3) : " + node1.areSiblings(4, 3));
                System.out.println("areCousins(4, 5) : " + node1.areCousins(4, 5));
                System.out.println("areCousins(4, 6) : " + node1.areCousins(4, 6));
                System.out.println("closestCommonAncestor(4, 5) : " + node1.closestCommonAncestor(4, 5));
                System.out.println("closestCommonAncestor(4, 2) : " + node1.closestCommonAncestor(4, 2));
                System.out.println("closestCommonAncestor(3, 6) : " + node1.closestCommonAncestor(3, 6));

                /*
                 * OUTPUT
                 * find(3) : true
                 * numberOfNodes() : 7
                 * totalValue() : 28
                 * node3.isDescendent(5) : true
                 * node2.isDescendent(7) : false
                 * areSiblings(2, 3) : true
                 * areSiblings(4, 3) : false
                 * areCousins(4, 5) : true
                 * areCousins(4, 6) : false
                 * closestCommonAncestor(4, 5) : 1
                 * closestCommonAncestor(4, 2) : 2
                 * closestCommonAncestor(3, 6) : 1
                 */
        }
}
