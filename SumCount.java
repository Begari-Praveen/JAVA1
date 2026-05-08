package BasicMath;

public class SumCount {
    public static void main(String[] args) {
       int n=12345;
       int count =0;
       int sum =0;
       while(n>0){
           int rem = n%10;
           sum += rem;
           count++;
           n=n/10;
       }
       System.out.println(count);
       System.out.println(sum);
    }
}
