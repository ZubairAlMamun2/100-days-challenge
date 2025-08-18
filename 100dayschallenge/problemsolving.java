import java.util.*;

public class problemsolving{

    //day-3
    public static int fibonacci(int n){
        int a=0,b=1,c=1,temp,sum=0;
        
        if(n==1){

            sum=0;
        }
        else if(n>1){
            for(int i=0;i<n-2;i++){
                temp=b;
                c=b+c;
                b=a+b;
                a=temp;
                sum =sum+b;
            }
            sum =a+b;
        }
        return sum;
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
        
        int num =7;
        
        System.out.println(fibonacci(num));  
    }
}