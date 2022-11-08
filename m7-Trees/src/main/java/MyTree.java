import java.util.LinkedList;
import java.util.Queue;

public class MyTree {

    TNode root;

    public MyTree() {
    }


    void insert(int value){

        TNode newNode = new TNode(value);

        if (root == null){
            root = newNode;
            return;
        }

        TNode current = root; //like head
        while (true){ //value can be less or greater than current value

            if (value <= current.value){

                if (current.leftChild == null){
                    //if left is null insert there!!
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;


            }

            else {

                if (current.rightChild == null){
                    //if right is null insert there!!
                    current.rightChild = newNode;
                    break;
                }

                current = current.rightChild; // like current = current.next : iteration

            }



        }


    }


    //PRE ORDER TRAVERSAL OF THE TREE

    //Root-Left-Right

    void preOrderTraversal(TNode root){

        if (root == null) return;

        System.out.print(root.value + ", ");

        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);


    }

    //Left-Root-Right
    void inOrderTraversal(TNode root){ // returns with ascending order

        if (root == null) return;
        inOrderTraversal(root.leftChild);
        System.out.print(root.value + ", ");
        inOrderTraversal(root.rightChild);




    }


    //Left-Right-Root

    void postOrderTraversal(TNode root){

        if (root == null) return;
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.value + ", ");




    }


    void levelOrderTraversal(){
        if(root==null) return;
        Queue<TNode>  queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TNode toVisit=queue.poll();
            //poll:Retrieves and removes the head of this queue, or returns null if this queue is empty.
            System.out.print(toVisit.value+", ");
            if (toVisit.leftChild!=null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild!=null) queue.add(toVisit.rightChild);

        }
    }


    //-------------------------------------------------

    //Task1
    public boolean contains(int value){

        if (root == null)return false;

        TNode current = root;

        while (current != null){

            if (value < current.value) current = current.leftChild;
            else if (value > current.value) current = current.rightChild;
            else return true;


        }

        return false;

    }

    //Task2
    public boolean isLeaf(TNode node){
        return node.leftChild == null && node.rightChild == null;
    }

    //Task3
    public void printLeaves(TNode root){

        if (root == null) return;
        //perform visit on root
        if (isLeaf(root)) System.out.print(root.value + " , ");
        //recursively branch leftSubtree
        printLeaves(root.leftChild);
        printLeaves(root.rightChild);


        //recursively branch rightSubtree

    }

    //Task4
    public int countLeaves(TNode root) {

        if (root == null) return 0;

        if (isLeaf(root)) return 1;

        return countLeaves(root.leftChild) + countLeaves(root.rightChild);


    }

    //Task5
    public int findSumLeaves(TNode root) {

        if (root == null) return 0;

        if (isLeaf(root)) return root.value;

        return findSumLeaves(root.leftChild) + findSumLeaves(root.rightChild);


    }


    //Task6

    int height(TNode root){

        if (root == null) return -1;

        if (isLeaf(root)) return 0;

        return 1 + Math.max(height(root.leftChild), height(root.rightChild));

    }



}
