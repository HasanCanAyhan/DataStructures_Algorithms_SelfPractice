package trees.binarySearchTree;

public class BSTTest {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        int[] numbers=new int[] { 10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};
        for (int i = 0; i <11; i++) {
            bst.insert(numbers[i]); // 1.Insert operation
        }


        VisualizeTree.printTree(bst.root,null,false);

        System.out.println("##########################################################");

        System.out.println("PreOrder"); // 2.Pre-Order
        bst.preOrder(bst.root);
        System.out.println();

        System.out.println("##########################################################");

        System.out.println("InOrder"); // 3.In-Order : ascending order
        bst.inOrder(bst.root);

        System.out.println();

        System.out.println("##########################################################");

        System.out.println("PostOrder"); // 4.Post-Order
        bst.postOrder(bst.root);

        System.out.println();

        System.out.println("##########################################################");

        System.out.println("LevelOrder"); // 5.Breadth-First(Level Order);
        bst.levelOrder(bst.root);

        System.out.println();

        System.out.println("##########################################################");

        System.out.println("Task1 - isContains"); //Task1
        System.out.println(bst.contains(bst.root,5));

        System.out.println("##########################################################");

        System.out.println(bst.contains2(bst.root,11));

        System.out.println("##########################################################");
        System.out.println("Task3 - printLeaves");
        bst.printLeaves(bst.root);

        System.out.println();
        System.out.println("##########################################################");

        System.out.println("Task3- 2.Solution - printLeaves");
        bst.printLeaves2(bst.root);

        System.out.println();
        System.out.println("##########################################################");

        System.out.println("Task4- countLeaves");
        System.out.println(bst.countLeaves(bst.root));

        System.out.println();
        System.out.println("##########################################################");

        System.out.println("Task5- findSumOfLeaves");
        System.out.println(bst.findSumOfLeaves(bst.root));

        System.out.println();
        System.out.println("##########################################################");

        System.out.println("Task6- height");
        System.out.println(bst.height(bst.root));

        System.out.println();
        System.out.println("##########################################################");

        System.out.println("Task7- sumOfNodeDepths");
        System.out.println(bst.sumOfNodeDepths(bst.root,0));




    }
}
