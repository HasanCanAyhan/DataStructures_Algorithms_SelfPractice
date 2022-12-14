public class TreeApp {
    public static void main(String[] args) {
        MyTree tree=new MyTree();
        int[] numbers=new int[] { 10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};
        for (int i = 0; i <11; i++) {
            tree.insert(numbers[i]);
        }


       VisualizeTree.printTree(tree.root,null,false);

        /*
        tree.preOrderTraversal(tree.root);

        System.out.println();
        System.out.println("------------------------------------------------");

        tree.inOrderTraversal(tree.root);

        System.out.println();
        System.out.println("------------------------------------------------");

        tree.postOrderTraversal(tree.root);

        System.out.println();
        System.out.println("------------------------------------------------");

        tree.levelOrderTraversal();


         */

        System.out.println("------------------------------------------------");

        System.out.println( tree.contains(8) );

        System.out.println("------------------------------------------------");

        tree.printLeaves(tree.root);
        System.out.println();
        System.out.println("countLeaves : " + tree.countLeaves(tree.root));

        System.out.println("------------------------------------------------");

        System.out.println("findSumLeaves = " + tree.findSumLeaves(tree.root));

        System.out.println("------------------------------------------------");

        System.out.println("height = " + tree.height(tree.root));

        System.out.println("------------------------------------------------");

        System.out.println("Sum of Node Depths is : " + tree.calculateNodeDepthSums());

        System.out.println("------------------------------------------------");

        System.out.println("Sum of all Nodes is : " + tree.calculateNodeSums());



    }


}
