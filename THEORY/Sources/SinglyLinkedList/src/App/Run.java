package App;

import Modules.Node;

public class Run {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.setNext(new Node(20));
        head.getNext().setNext(new Node(30));

    }

}
