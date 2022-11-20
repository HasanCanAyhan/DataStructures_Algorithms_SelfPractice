package recursion.insertValueIntoBinarySearchTree;

public class printAllLeafNodes {

    public static void printLeaves(TNode root){

        if (root == null) return;


        if (root.leftChild == null && root.rightChild == null){
            System.out.print(root.value + ", ");
            return;
        }

        if (root.leftChild != null){
            printLeaves(root.leftChild);
        }

        if (root.rightChild != null){
            printLeaves(root.rightChild);
        }


    }

}
