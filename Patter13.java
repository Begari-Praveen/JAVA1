class Patter13{
    public static void main(String[] args){
        int n=5; 
    for(int i=1;i<=n;i++){
        for(int j=i;j<=n;j++){
            System.out.print(" ");
        }
        //   char ch ='A';
        for(int k=1;k<=i;k++){
            System.out.print(k);
            //   ch++;
        }
        //   char chr = 'A';
        for(int l=1 ;l<i;l++){
            System.out.print(l);
            //   chr++;
        }
        System.out.println();
    }
    }
}