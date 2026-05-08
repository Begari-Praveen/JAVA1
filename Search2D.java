class Search2D {
    public static void main(String[] args) {
        int arr[][] ={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        int target = 8;
        int start =0;
        int end= arr[0].length-1;
        while(start <= arr.length-1 && end>=0){
            if(target == arr[start][end]){
                System.out.println("found "+start+" "+end);
                return;
            }
            else if(target < arr[start][end]){
                end--;
            }
            else{
                start++;
            }
        }
        System.out.println("Not Found");
    }
}