class Stack{
    int arr[];
    int top;
    int size;
    public Stack(int size){
        this.size = size;
        arr = new int[size];
        top =-1;
    }
    public void push(int data){
        
        if(top == size-1){
            System.out.println("stack overflow");
            return ;
        }
        top++;
        arr[top] = data;
        System.out.println(data);
    }
    public int pop(){
        if(top == -1){
            System.out.println("underflow");
            return -1;
        }
        int val = arr[top];
        top--;
        return val;
    }
    public int peek(){
         if(top == -1){
            System.out.println("underflow");
            return -1;
        }
        return arr[top];
    }
    public int size(){
        return top+1;
    }
}
class Main {
    public static void main(String[] args) {
        
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
    }
}
