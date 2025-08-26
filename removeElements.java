
public class removeElements {

    //day-11
    public static int removeElement(int[] nums, int val) {
        int ptr=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[ptr]=nums[i];
                ptr++;
            }
        }
        return  ptr;
    }
    
    public static void main(String[] args) {
        int[] nums= {0,1,2,2,3,0,4,2};
         int val = 2 ;

         System.out.println(removeElement(nums,val));

    }
}
