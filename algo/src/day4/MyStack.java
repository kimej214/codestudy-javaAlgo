package day4;

import java.util.Arrays;
import java.util.NoSuchElementException;

class MyStack {
    private final int[] arr;
    private int top; // 다음에 들어갈 위치(=size)

    public MyStack(int capacity) {
        arr = new int[capacity];
    }

    public void push(int x) {
        if(top < arr.length) {
            arr[top] = x;
            top++;
        } else {
            throw new IllegalStateException();
        }

    }

    public int pop() {
        if (top == 0) {
            throw new NoSuchElementException();
        }
//        if(top<arr.length) {
        int result = arr[top - 1];
        arr[top - 1] = 0;
        top--;
        return result;
//        } else {
//            System.out.println("NoSuchElementException");
//            throw new NoSuchElementException();
//        }
//        return -1;
    }

    public int peek() {
        if (top == 0) {
            throw new NoSuchElementException();
        }
//        if(top<arr.length) {
        System.out.println(Arrays.toString(arr));
        return arr[top - 1];
//        } else {
//            System.out.println("NoSuchElementException");
//        }
//        return -1;
    }
    // 비어 있어야 true임
    public boolean isEmpty() {
        if(!(top==0)) {
//            System.out.println(1);
            return false;

        } else {
//            System.out.println(0);
            return true;

        }
    }

    public int size() {
//        System.out.println(top);
//        return -1;
        return top;
    }

}