public class twosum {
    public static int[] twoSum( int target) {
        int[] nums={2,7,11,15};;
        int num1=-1,num2=-1;
        for(int i=0;i<nums.length;i++ ){
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                int sum=nums[i]+nums[j];
                
                if(sum==target){
                    num1 = i;
                    num2 = j;
                    System.out.println(i + " f " + j);
                    return new int[]{num1,num2};
                }
            }
        }
        
        return new int[]{};
    }
    public static void main(String[] args) {

        System.out.println(twoSum(9));;
    }
}
