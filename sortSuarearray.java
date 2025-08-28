public class sortSuarearray {

    //day-12
 public int[] sortedSquares(int[] nums) {
                
         for(int j=0;j<nums.length;j++){
            if(j==0){
                nums[j]=nums[j]*nums[j];
            }
            for(int i=0;i<nums.length-1;i++){
            if(j==0){
                nums[i+1]=nums[i+1]*nums[i+1];
            }
            if(nums[i]>nums[i+1]){
                nums[i]=nums[i]+nums[i+1];
                nums[i+1]=nums[i]-nums[i+1];
                nums[i]=nums[i]-nums[i+1];

            }
        }
        }
        
        return nums;
    }
    public static void main(String[] args) {
        int nums[] = {-4,-1,0,3,10};
        // sortedSquares(nums);
    }
}
