package trees.binarySearchTree;

public class BinarySearchTree {

    TNode root;

    public BinarySearchTree() {
    }

    void insert(int val){

        TNode tNode = new TNode(val);

        if (root == null){
            root = tNode;
            return;// to stop
        }

        TNode curr = root;//start point
        while (true){

            if (val <= curr.value){

                if (curr.leftChild == null){
                    curr.leftChild = tNode;// here: insertion
                    break;
                }

                curr = curr.leftChild;

            }else {
                //val > curr.value

                if (curr.rightChild == null){
                    curr.rightChild = tNode; // here: insertion
                    break;
                }

                curr = curr.rightChild;

            }




        }

    }

    void preOrder(TNode root){ // root, left, right

        if (root == null) {
            return;
        }

        System.out.print(root.value + " - > ");
        preOrder(root.leftChild);
        preOrder(root.rightChild);





    }



}
