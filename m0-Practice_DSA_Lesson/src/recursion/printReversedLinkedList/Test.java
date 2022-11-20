package recursion.printReversedLinkedList;

public class Test {

    public static void main(String[] args) {


        MySinglyLinkedList myList = new MySinglyLinkedList();

        System.out.println(myList.isEmpty());

        for (int i = 1; i <= 4 ; i++) {
            myList.add(i);
        }


        myList.printNodes();


        myList.printReversedLinkedList(myList.head);







    }

}
