import java.util.*;

public class arraytoint {
    public static List<Integer> addToArrayForm( int k) {
        List<Integer> ans = new ArrayList<>();
        int[] num = {2,0,5};

       int p = num.length-1 ;
       int carry = 0 ;

       while(p>=0 || k>0){
           int numval = 0;
           if(p>=0){
               numval = num[p];
           }
           int d = k%10; // it is the last digit from k
           int sum = numval + d + carry;
           int digit = sum%10;
           carry = sum/10;
           ans.add(digit);
           p--;       // moving the pointer
           k = k/10 ; // removing the last digit from k
       }

       if(carry>0){
           ans.add(carry); // adding carry to the array list
       }

       Collections.reverse(ans);  // reversing the ans array list
       return ans ;
    }
    public static void main(String[] args) {
        System.out.println(addToArrayForm(10));
    }
}
