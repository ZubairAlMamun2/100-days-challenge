public class missingnumber {

    //day-10
    public static int missingNumber(int[] nums) {

        int num=nums.length;
        int flag=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==nums[j]){
                    flag=1;
                }
            }
            if(flag==0){
                num=i;
                break;  
            }
            flag=0;
        }
        return num;
    }
    public static void main(String[] args) {
        int nums[] ={7,6,4,2,3,5,8,0,1};
        int ans= missingNumber(nums);
        System.out.println(ans);
    }
}
