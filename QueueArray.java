// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Queue{
    int arr[];
    int size ;
    int rear;
    int front ;
    public Queue(int size){
        this.size = size ;
        arr = new int[size];
        rear = -1;
        front =0;
    }
    public void enqueue(int data){
        if(rear == size -1){
            System.out.println("overflow");
            return;
        }
        rear++;
        arr[rear] = data;
        System.out.println("data is added " + data);
    }
    
    public void dequeue(){
        if(front > rear){
            System.out.println("underflow");
            return;
        }
        int val = arr[front];
        front++;
        System.out.println(val+" deleted");
    }
    public int peek(){
        return arr[front];
    }
    public int size(){
        return rear-front+1;
    }
    public boolean isEmpty(){
        return front > rear;
    }
}
class Main {
    public static void main(String[] args) {
       
       Queue q = new Queue(5);
       q.enqueue(10);
       q.enqueue(20);
       q.enqueue(30);
       q.dequeue();
       System.out.println(q.peek());
       System.out.println(q.size());
       System.out.println(q.isEmpty());
       
    }
}
