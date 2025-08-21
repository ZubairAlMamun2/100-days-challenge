public class pallindrome {
    

    //day-1
    public static boolean checkpallindrome(int num) {
    
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
        System.out.println(checkpallindrome(121));
    }
}
