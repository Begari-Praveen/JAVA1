import java.util.*;
class Main {
    public static void main(String[] args) {
       
       int arr[] = {6,0,8,1,3};
       for(int i=0;i<arr.length;i++){
          boolean found = false;
           for(int j=i+1;j<arr.length;j++){
               if(arr[i] <      arr[j]){
                   System.out.print(arr[j] + " ");
                   found = true;
                   break;
                  
               }
           }
           if(!found){
               System.out.print(-1 +" ");
           }
       }
    }
}
