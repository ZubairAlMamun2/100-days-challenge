public class product {

    //day-14
    public int[] productExceptSelf(int[] nums) {
        int n =nums.length;
        int arr[]= new int[n];

        int pro=1;
        for(int i=n-1;i>=0;i--){
            pro *=nums[i];

            arr[i]=pro;
        }


        int res[]= new int[n];
        int prevpro=1;
        for(int i=0;i<n-1;i++){
            int val=prevpro* arr[i+1];
            res[i]=val;

            prevpro=prevpro*nums[i];

        }
        res[n-1]=prevpro;

        return res;
    }
    public static void main(String[] args) {
        
    }
}
