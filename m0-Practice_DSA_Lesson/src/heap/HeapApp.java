package heap;

public class HeapApp {

    public static void main(String[] args) {


        MyHeap heap = new MyHeap(10);

        
        heap.insert(61);
        heap.insert(120);
        heap.insert(52);
        heap.insert(45);
        heap.insert(81);




        heap.printHeap();
        int remove1 = heap.remove();
        System.out.println("remove1 = " + remove1);
        int remove2 = heap.remove();
        System.out.println("remove2 = " + remove2);
        int remove3 = heap.remove();
        System.out.println("remove3 = " + remove3);
        int remove4 = heap.remove();
        System.out.println("remove4 = " + remove4);

        heap.printHeap();




        System.out.println("------------------------------------------------------");


        CustomHeap_Review customHeap_review = new CustomHeap_Review(10);

        customHeap_review.insert(61);
        customHeap_review.insert(120);
        customHeap_review.insert(52);
        customHeap_review.insert(45);
        customHeap_review.insert(81);

        customHeap_review.printHeap();

        int remove_first = customHeap_review.remove();
        System.out.println("remove1 = " + remove_first);
        customHeap_review.printHeap();
        int remove_second = customHeap_review.remove();
        System.out.println("remove2 = " + remove_second);
        customHeap_review.printHeap();
        int remove_third = customHeap_review.remove();
        System.out.println("remove3= " + remove_third);
        customHeap_review.printHeap();
        int remove_forth = customHeap_review.remove();
        System.out.println("remove4= " + remove_forth);
        customHeap_review.printHeap();
        int remove_fifth = customHeap_review.remove();
        System.out.println("remove5= " + remove_fifth);
        customHeap_review.printHeap();

    }

}
