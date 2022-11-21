package trees.binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

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

    void inOrder(TNode root){ // left, root, right

        if (root == null)return;

        inOrder(root.leftChild);
        System.out.print(root.value + " -> ");
        inOrder(root.rightChild);


    }

    void postOrder(TNode root){//left, right, root

        if (root == null) return;

        postOrder(root.leftChild);
        postOrder(root.rightChild);
        System.out.print(root.value + " -> ");

    }

    void levelOrder(TNode root){

        if (root == null) return;
        Queue<TNode> queue=new LinkedList<>();
        queue.add(root);

        while (queue.size() > 0){

            TNode curr = queue.poll();
            System.out.print(curr.value + " -> ");

            if (curr.leftChild != null) queue.add(curr.leftChild);
            if (curr.rightChild != null) queue.add(curr.rightChild);

        }

    }



}
