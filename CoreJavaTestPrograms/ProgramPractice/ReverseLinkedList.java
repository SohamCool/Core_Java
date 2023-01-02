package ProgramPractice;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        LinkedList<Integer> list1 = new LinkedList<>();
        list.descendingIterator().forEachRemaining(list1::add);

        System.out.println(list1);
    }
}
