package yt_practice1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Node {

    int data;
    Node next; // reference/address of next node

    public Node(int data) {
        this.data = data;
    }





}
