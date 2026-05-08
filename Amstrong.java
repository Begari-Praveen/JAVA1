package BasicMath;

public class Amstrong {
    public static void main(String[] args) {
      int n=153;
      int num = n;
      int sum=0;
      while(n>0){
          int rem = n%10;
          sum = sum + (rem*rem*rem);
          n=n/10;
      }
      if(num == sum){
          System.out.println("Amstrong");
      }
      else{
          System.out.println("Not a Amstrong");
      }
    }
}
