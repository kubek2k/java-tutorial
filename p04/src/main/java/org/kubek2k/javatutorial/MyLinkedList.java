package org.kubek2k.javatutorial;

import java.util.Iterator;

public class MyLinkedList implements Iterable<Integer> {

    private Integer value;

    private MyLinkedList next;

    public MyLinkedList(final Integer value, final MyLinkedList next) {
        this.next = next;
        this.value = value;
    }

    public MyLinkedList(final Integer value) {
        this(value, null);
    }

    public Iterator<Integer> iterator() {
        return null;
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(1, new MyLinkedList(2, new MyLinkedList(3)));
        for(Integer i : list) {
            System.out.println(i);
        }
    }
}
