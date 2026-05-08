package BasicMath;

public class Reverse {
     public static void main(String[] args) {
       int n=12321;
       int num = n;
       int rev=0 ;
       while(n>0){
           int rem = n%10;
           rev = rev*10 + rem;
           n=n/10;
       }
       System.out.println(rev);
       
       if(rev == num){
           System.out.println("pallindrome");
       }
       else{
           System.out.println("Not a pallindrome");
       }
    }
}
