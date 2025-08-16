import java.util.*;

public class palindrome{
    public static boolean pal(int num) {
    
        int copy=num;
        int pall=0;
        System.out.println(num);
        while(copy!=0){
            int rem=copy%10;
            pall =pall*10+rem; 
            copy=copy/10;
        }
        System.out.println(pall);
        if(num<0){
            return false;
        }
        else if(pall==num){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        
         System.out.println( pal(num));
        
    }
}