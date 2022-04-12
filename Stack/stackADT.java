
//ADT implementation of stack using simple array

import java.util.Scanner;

public class stackADT {
    private final int arraySize; //size to array
    private final long[] stackArray; //empty array to define as stack
    private int top; //top of stack

    public stackADT(int s) { //constructor
        arraySize = s;
        stackArray = new long[arraySize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arraySize - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("STACK IS FULL NO ITEM CAN BE PUSH NOW!!");
        }
        stackArray[++top] = data;
    }

    public long pop() {
        if (isEmpty()) {
            System.out.println("STACK IS EMPTY NO ITEM CAN BE POP!!");
        }
        return stackArray[top--];
    }

    public void peek() {
        System.out.println("TOP OF THE STACK IS : " + stackArray[top]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size the stack : ");
        int size = sc.nextInt();
        stackADT newStack = new stackADT(size);
        while (true) {
            System.out.println("---------------------------STACK---------------------------");
            System.out.println("\t1 -> CHECK IF EMPTY");
            System.out.println("\t2 -> CHECK IF FULL");
            System.out.println("\t3 -> PUSH");
            System.out.println("\t4 -> POP");
            System.out.println("\t5 -> PEEK");
            System.out.println("-----------------------------------------------------------");

            int ch = sc.nextInt();
            if (ch != 0) {
                switch (ch) {
                    case 1 -> System.out.println("\t STACK EMPTY STATUS : " + newStack.isEmpty());
                    case 2 -> System.out.println("\t STACK FULL STATUS : " + newStack.isFull());
                    case 3 -> {
                        int item = sc.nextInt();
                        newStack.push(item);
                    }
                    case 4 -> System.out.println("ITEM POPPED : " + newStack.pop());
                    case 5 -> newStack.peek();
                    default -> throw new IllegalStateException("Unexpected value: " + ch);
                }
            }

        }
    }
}



