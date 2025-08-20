import java.util.*;

public class problemsolving{

    //day-3
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
        int ft = 0 ;
        int st = 1 ;

        for(int i=1 ; i<=n;i++){
            int tt = ft + st ;
            ft = st ;
            st = tt ;
        }

        return ft ;}
    }


    //day-2
    public static boolean sqart(int x){
       if(x==0){
          return false;
      }

      while(x%2==0){
          x = x/2 ;
      }

      if(x==1){
          return true ;
      }else{
          return false;
      }
    }


    //day-1
    public static boolean pallindrome(int num) {
    
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
        
        int num =25;
        
        
    }
}