public class findmaxproduct {

    //day-8
    public static int maxProduct() {
        int nums[]={3,7};
        int num1=nums[1],num2=nums[0];

        for(int i=2;i<nums.length;i++){
            if(num1<nums[i]){
                if(num1>num2){
                num2=num1;
                }

                num1=nums[i];
            }
            else if(num2<nums[i]){
                num2=nums[i];
            }
        }

        int product=(num1-1)*(num2-1);
        return product;

    }

    public static void main(String[] args) {

        System.out.println(maxProduct());
    }
}
