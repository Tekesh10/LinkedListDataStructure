package com.bridgelabz;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    int size;

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            Node<T> temp, current;
            temp = head;
            current = null;
            int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
            for (int i = 0; i < count; i++) {
                current = temp;
                temp = temp.next;
            }
            assert current != null;
            current.next = newNode;
            newNode.next = temp;
        }
        size++;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        }
        else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public void show() {
        if (head == null) {
            System.out.println("Linked list is Empty");
        }
        else {
            Node<T> temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}