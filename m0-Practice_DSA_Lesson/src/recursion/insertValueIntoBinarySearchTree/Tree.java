package recursion.insertValueIntoBinarySearchTree;

public class Tree {


    public TNode insertNode(TNode root, int data){

        if (root == null){
            root = new TNode(data);
            return root;
        }

        if (root.value < data){
            root.rightChild = insertNode(root.rightChild, data);
        }else {
            root.leftChild = insertNode(root.leftChild,data);
        }

        return root;

    }

}
