package com.company;

//homework 3
public class IntQueue {
    int capacity;
    int index = 0;
    int[] queue;

    IntQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
    }

    void enqueue(int item) {
        queue[index] = item;
        index++;
    }

    int dequeue() {
        index--;
        int item = queue[index];
        queue[index] = 0;
        return item;
    }

    boolean isEmpty() {
        return index == 0;
    }

    boolean isFull() {
        return index == capacity;
    }
}
