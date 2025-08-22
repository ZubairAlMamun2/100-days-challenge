public class twosum {

    //day-6

    public static int[] twoSum( int target) {
        int[] nums={2,7,4,5};
        int[] ans = new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
          return ans ;
    }
    public static void main(String[] args) {

        System.out.println(twoSum(9));;
    }
}
