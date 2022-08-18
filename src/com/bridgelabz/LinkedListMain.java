package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.push(70);
        list1.push(56);
        list1.insert(30);
        list1.show();

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(56);
        list2.add(70);
        list2.insert(30);
        list2.show();
    }
}