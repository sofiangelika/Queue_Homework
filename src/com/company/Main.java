package com.company;

import ibadts.Queue;
import ibadts.StaticQueue;

public class Main {

    public static void main(String[] args) {
	homework_1();
	homework_2();
	homework_4();
	
    }

    static void homework_1() {
        Queue<Integer> integerQueue = new Queue<>();
        int count = 0;
        integerQueue.enqueue(1);
        integerQueue.enqueue(2);
        integerQueue.enqueue(3);
        while(!integerQueue.isEmpty()) {
            integerQueue.dequeue();
            count++;
        }
        System.out.println(count);
    }

    static void homework_2() {
        int[] numbers = {1, 2, 3, 4, 5};
        StaticQueue<Integer> integerQueue = new StaticQueue<>(4);
        int start = 0, end = numbers.length - 1;
        boolean beginning = true;

        while (start <= end && !integerQueue.isFull()) {
            int element;
            if (beginning) {
                element = numbers[start];
                start++;
            }
            else {
                element = numbers[end];
                end--;
            }
            integerQueue.enqueue(element);
            beginning = !beginning;
        }
    }

    static void homework_4() {
        Queue<String> business = new Queue<>();
        Queue<String> economy = new Queue<>();

        business.enqueue("Sir_A");
        business.enqueue("Madam_B");
        business.enqueue("Rick_C");

        economy.enqueue("Sarah_A");
        economy.enqueue("John_B");
        economy.enqueue("Wendy_C");

        System.out.print("Order: ");
        while (!business.isEmpty()) {
            System.out.print(business.dequeue() + " ");
            if (!business.isEmpty())
                System.out.print(business.dequeue() + " ");
            if (!economy.isEmpty())
                System.out.print(economy.dequeue() + " ");
        }
        while (!economy.isEmpty())
            System.out.print(economy.dequeue() + " ");
    }
}
