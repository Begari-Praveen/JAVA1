// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class LinkedList{
    class Node{
        int data;
        Node next ;
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
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head ;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void add(int pos , int data){
        Node newNode = new Node(data);
        if(pos < 0){
            System.out.println("not possible");
            return;
        }
        if(pos == 0){
            addFirst(data);
            return;
        }
        Node temp = head;
        int i=0;
        while(i<pos-1 && temp != null){
            temp=temp.next;
            i++;
        }
       if(temp == null){
           System.out.println("out of range ");
           return;
       }
      newNode.next = temp.next;
      temp.next = newNode;
      
      if(newNode.next == null){
          tail = newNode;
      }
    }
    public void deleteFirst(){
        if(head == null){
          System.out.println("list is empty");
          return;
        }
        if(head == tail){
            System.out.println(head.data + " deleted");
            head = null;
            tail = null;
            return;
        }
        System.out.println(head.data + "deleted");
        head = head.next;
    }
    
    public void deleteLast(){
         if(head == null){
          System.out.println("list is empty");
          return;
        }
        if(head == tail){
            System.out.println(head.data + " deleted");
            head = null;
            tail = null;
            return;
        }
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }
    public void delete(int pos){
         if(pos<0){
          System.out.println("Invalid");
          return;
        }
        if(head == null){
            System.out.println("list is empty");
          return;
        }
        if(pos == 0){
            deleteFirst();
        }
        int i=0;
        Node temp = head ;
        while(i<pos-1 && temp != null){
            temp = temp.next ;
            i++;
        }
        if(temp== null || temp.next == null ){
            System.out.println("out of range");
            return;
        }
        if(temp.next ==tail){
            temp.next = null;
            tail = temp;
            return;
        }
        System.out.println(temp.next.data+" deleted");
        temp.next = temp.next.next;
        
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    
    public Node findMid(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next ;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public boolean pallindrome(){
        
        Node mid = findMid();
        
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev ;
            prev = curr;
            curr = next;
        }
        Node right = prev ;
        Node left = head;
        
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public boolean detectCycle(){
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
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
         list.add(2,15);
         list.print();
        //  list.deleteFirst();
        //  list.deleteLast();
        //  list.delete(2);
        //  list.print();
        System.out.println();
        list.reverse();
        list.print();
        
    }
}
