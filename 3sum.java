import java.util.*;

public class Main {

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> mainlist = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int low=i+1;
            int high=nums.length-1;
            while(low < high){
              int sum = nums[i]+nums[low]+nums[high];
              if(sum==0){
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[low]);
                list.add(nums[high]);
                mainlist.add(list);
                
                low++;
                high--;
                while(low<high && nums[low] == nums[low-1]){
                    low++;
                }
                while(low<high && nums[high] == nums[high+1]){
                    high--;
                }
              }
              else if(sum<0){
                low++;
              }
              else{
                high--;
              }
            }
        }
    return mainlist;
    }

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = threeSum(nums);

        System.out.println(result);
    }
}
