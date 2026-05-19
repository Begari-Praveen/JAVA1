class Stack{
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public Node head;
    public Node tail;
    public Stack(){
        head= null;
        tail = null;
    }
    public void push(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void pop(){
        if(head == null){
            System.out.println("stack Empty");
            return;
        }
        if(head == tail){
            System.out.println(head.data +" deleted");
            head = tail = null;
            return;
        }
        System.out.println(head.data +" deleted");
        head = head.next;
    }
    public int peek(){
        if(head == null){
            System.out.println("stack Empty");
            return -1;
        }
       return head.data;
    }
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }
}
class Main {
    public static void main(String[] args) {
       Stack s = new Stack();
       s.push(1);
       s.push(2);
       s.push(3);
       s.push(4);
       s.pop();
       System.out.println(s.peek());
       System.out.println(s.isEmpty());
    }
}
