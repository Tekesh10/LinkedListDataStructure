package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(70);
        list1.add(40);
        list1.add(30);
        list1.add(56);
        list1.show();
        list1.size();

        System.out.println("\n");

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.append(56);
        list2.append(30);
        list2.append(40);
        list2.append(70);
        list2.show();
        list2.size();
    }
}
//        Integer popFirstElement = list1.popFirst();
//        if (popFirstElement == null) {
//            System.out.println("Linked List Empty");
//        } else {
//            System.out.println("Popped the first element -> "+popFirstElement);
//        }
//        list1.show();

//        Integer popLastElement = list2.popLast();
//        if (popLastElement == null) {
//            System.out.println("Linked List Empty");
//        } else {
//            System.out.println("Popped the last element -> "+popLastElement);
//        }

//        if (list1.search(30) == null) {
//            System.out.println("Element not  found");
//        } else {
//            System.out.println("Element found");
//        }

//        if (!list2.searchAndInsert(30, 40)) {
//            System.out.println("Element not  found");
//        } else {
//            System.out.println("Element found and inserted");
//        }
//        list2.show();