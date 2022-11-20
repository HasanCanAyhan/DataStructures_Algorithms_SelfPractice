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
        queue.add(root);

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

        return treeIncludes_recursive(root.leftChild,target) || treeIncludes_recursive(root.rightChild,target);



    }


    public int sumOfEachNodes(TNode root){

        if (root == null) return 0;

        Queue<TNode> queue = new PriorityQueue<>();
        queue.add(root);

        int sum = 0;
        while (queue.size() > 0){

            TNode curr = queue.poll();
            sum += curr.value;

            if (curr.leftChild != null) queue.add(curr.leftChild);

            if (curr.rightChild != null)queue.add(curr.rightChild);

        }

        return sum;


    }


    public int sumOfEachNodes_recursive(TNode root){

        if (root == null) return 0;

        //            3               13                                             5
        return root.value + sumOfEachNodes_recursive(root.leftChild) + sumOfEachNodes_recursive(root.rightChild);

    }


    public int minValue(TNode root){

        if (root == null) return 0;

        Queue<TNode> queue = new PriorityQueue<>();
        queue.add(root);

        int min = Integer.MAX_VALUE;
        while (queue.size() > 0){

            TNode curr = queue.poll();
            if (curr.value < min){
                min = curr.value;
            }

            if (curr.leftChild != null) queue.add(curr.leftChild);

            if (curr.rightChild != null)queue.add(curr.rightChild);

        }

        return min;


    }


    public int minValue_recursive(TNode root){

        if (root == null) return 0;

        int leftMin = minValue_recursive(root.leftChild);
        int rightMin = minValue_recursive(root.rightChild);

        return Math.min(root.value,Math.min(leftMin,rightMin));

    }





}
