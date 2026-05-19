import java.util.*;

class Main {

    public static void main(String[] args) {

        int arr[] = {6,0,8,1,3};

        int ans[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        // traverse from right to left
        for(int i = arr.length - 1; i >= 0; i--){

            int num = arr[i];

            // remove smaller elements
            while(!s.isEmpty() && s.peek() <= num){
                s.pop();
            }

            // next greater element
            if(s.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = s.peek();
            }

            // push current element
            s.push(num);
        }

        // print answer array
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
