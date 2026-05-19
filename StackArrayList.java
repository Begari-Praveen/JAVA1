import java.util.*;
class Stack{
    
    ArrayList<Integer> list ;
    
    public Stack(){
        list = new ArrayList<>();
    }
    public void push(int data){
        
        list.add(data);
        System.out.println(data + " pushed");
    }
    public void pop(){
        if(list.isEmpty()){
            System.out.println("list is empty");
            return;
        }
        int val = list.get(list.size()-1);
        list.remove(list.size()-1);
        System.out.println(val + "deleted");
    }
    public int peek(){
        return list.get(list.size()-1);
    }
    public int size(){
        return list.size();
    }
    public boolean isEmpty(){
        if(list.isEmpty()){
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
