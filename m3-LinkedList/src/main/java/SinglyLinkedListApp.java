public class SinglyLinkedListApp {

    public static void main(String[] args) {

        MySinglyLinkedList myList = new MySinglyLinkedList();
        System.out.println(myList.isEmpty());


        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }

        myList.printNodes();

        System.out.println("-------------------------------------------");


        myList.deleteById(9);
        myList.printNodes();


        System.out.println("------------------------------");


        System.out.println("index of 0: " + myList.indexOf(0));

    }

}
