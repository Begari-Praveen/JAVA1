
import java.util.*;
class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.addLast(30);
        list.addFirst(15);
        System.out.println(list);
        list.add(50);
        list.add(2,40);
        System.out.println(list);
        list.set(2,42);
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) +"->");
        }
        System.out.print("null");
        System.out.println();
        System.out.println(list.get(2)+" "+list.getFirst()+" "+list.getLast());
        list.remove(2);
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        list.remove(Integer.valueOf(10));
        System.out.println(list);
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
    }
}
