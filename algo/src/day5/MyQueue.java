package day5;

import java.util.NoSuchElementException;

class MyQueue {
    private final int[] arr;
    private int front; // 현재 맨 앞 원소 위치
    private int rear;  // 다음에 삽입할 위치
    private int size;

    public MyQueue(int capacity) {
        arr = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    public void offer(int x) {
        if(rear == arr.length) {
            throw new IllegalStateException();
        } else {
            arr[rear] = x;
            size++;
            rear++;
        }
    }

    public int poll() {
        if(size==0){
            throw new NoSuchElementException();
        } else {
            int value = arr[front];
            front++;
            size--;
            return value;
        }
    }

    public int peek() {
        if(size==0){
            throw new NoSuchElementException();
        } else {
            return arr[front];
        }
    }

    public boolean isEmpty() {
        //if(size!=0){
        //            return false;
        //        } else {
        //            return true;
        //        }
        return size == 0;
    }

    public int size() {
        return size;
    }
}
