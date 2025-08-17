import java.util.*;

public class problemsolving{
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
        
        int num =8;
        
        System.out.println(sqart(num));
    }
}