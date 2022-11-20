package trees;


import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class MyTree {

    TNode root;

    public MyTree() {
    }

    public TNode depthFirstValues(TNode root){

        if (root == null) return null;

        Stack<TNode> stack = new Stack<>();
        stack.push(root);

        while (stack.size() > 0){
            TNode current = stack.pop();
            System.out.println(current.value);

            if (current.leftChild != null){
                stack.push(current.leftChild);
            }
            if (current.rightChild != null){
                stack.push(current.rightChild);
            }


        }


        return root;
    }


    public boolean treeIncludes(TNode root, int target){ // like level order by using queue

        if (root == null) return false;

        Queue<TNode> queue = new PriorityQueue<>();

        while (queue.size() > 0){

            TNode curr = queue.poll();
            if (curr.value == target) return true;

            if (curr.leftChild != null) queue.add(curr.leftChild);

            if (curr.rightChild != null)queue.add(curr.rightChild);

        }

        return false;



    }



    public boolean treeIncludes_recursive(TNode root, int target){ // like level order by using queue

        if (root == null) return false;

        if (root.value == target) return true;

        return treeIncludes(root.leftChild,target) || treeIncludes(root.rightChild,target);



    }








}
