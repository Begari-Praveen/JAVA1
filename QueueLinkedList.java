// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Queue{
     class Node{
         int data;
         Node next;
         public Node(int data){
             this.data= data;
             this.next = null;
         }
     }
     Node head ;
     Node tail;
     public Queue(){
         this.head = null;
         this.tail = null;
     } 

    public void enqueue(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    
    public void dequeue(){
        if(head == null){
            System.out.println("underflow");
            return;
        }
        if(head == tail){
            head = tail = null;
            return;
        }
        int val = head.data;
        head = head.next;
        System.out.println(val + " deleted");
    }
    public int peek(){
        if(head == null){
            System.out.println("underflow");
            return -1;
        }
        return  head.data;
    }
    public boolean isEmpty(){
        return head == null;
    }
}

class Main {
    public static void main(String[] args) {
       
       Queue q = new Queue();
       q.enqueue(10);
       q.enqueue(20);
       q.enqueue(30);
       q.dequeue();
       System.out.println(q.peek());
       System.out.println(q.isEmpty());
       
    }
}
