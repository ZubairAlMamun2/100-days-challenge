public class returntwosum {

    //day-13
    public int[] twoSum(int[] numbers, int target) {
        int num[] =new int[2];
        int start=0;
        int end=numbers.length-1;
        boolean flag=false;
        while(!flag){
            int sum=numbers[start]+numbers[end];
            if(sum==target){
                flag=true;
            }
            else if(sum>target){
                end--;
            }
            else{
                start++;
            }
        }
        start+=1;
        end+=1;
        num[0]=start;
        num[1]=end;

        return num;
    }
    public static void main(String[] args) {
        
    }
}
