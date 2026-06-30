// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LinkedList{
    
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    Node tail = null;
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    
    public void add(int index, int data){
        Node  newNode = new Node(data);
        if(index < 0){
            System.out.println("invalid index");
            return;
        }
        if(index == 0){
            addFirst(data);
            return;
        }
        int i=0;
        Node temp = head;
        while(i<index-1 && temp!=null){
            i++;
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("invalid index");
            return;
        }
        if(temp == tail){
            addLast(data);
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void removeFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        else if(head == tail){
            head = tail = null;
            return;
        }
        else{
            head = head.next;
        }
    }
    
    public void removeLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        else if(head == tail){
            head = tail = null;
            return;
        }
        else{
            Node temp = head ;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    public void remove(int index){
        if(index < 0){
            System.out.println("Invalid Index");
            return;
        }
        if(index == 0){
            removeFirst();
            return;
        }
        int i=0;
        Node temp = head;
        while(i<index-1 && temp != null){
            temp = temp.next ;
            i++;
        }
        if(temp == null || temp.next == null){
            System.out.println("out of range");
            return;
        }
        if(temp.next == tail){
            removeLast();
            return;
        }
        temp.next = temp.next.next;
    }
    
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    
    public int size(){
        Node temp = head;
        int count =0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    
    public boolean contains(int data){
        Node temp = head;
        while(temp != null){
            if(data == temp.data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    
    public int get(int index){
        Node temp = head;
        int i=0;
        while(i<index && temp!= null){
            temp = temp.next;
            i++;
        }
        if(temp == null){
            return -1;
        }
        return temp.data;
    }
    public void set(){
        Node temp = head ;
        
        
    }
    
}
class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addFirst(1);
        list.print();
        list.removeFirst();
        list.removeLast();
        list.print();
        list.add(2,45);
        list.print();
        list.remove(3);
        list.print();
        
    }
}
