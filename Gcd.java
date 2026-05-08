package BasicMath;

public class Gcd {
    public static void main(String[] args) {
      int n1 =24; 
      int n2 = 12 ;
      int gcd =0;
      int n = Math.min(n1,n2);
      for(int i=1;i<=n;i++){
          if(n1 %i == 0 && n2%i ==0){
              gcd = i;
          }
      }
      System.out.print(gcd);
    }
}
