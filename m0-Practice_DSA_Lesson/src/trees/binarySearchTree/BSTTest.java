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

        System.out.println("PreOrder");
        bst.preOrder(bst.root);



    }
}
