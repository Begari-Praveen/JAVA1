public class Trapose {
     public static void main(String[] args) {
       
     int arr[][] = {{1,2,3},
                     {4,5,6},
                     {7,8,9}};
    int m = arr.length;
    int n= arr[0].length;
    int temp[][] =new int[n][m];    
    
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                temp[j][i] = arr[i][j];
            }
        }
        
        for(int i=0;i<temp.length;i++){
            for(int j=0;j<temp[i].length;j++){
               System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
    }    
}
