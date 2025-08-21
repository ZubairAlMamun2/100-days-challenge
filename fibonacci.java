public class fibonacci {
    
    //day-3
    public static int fibonaccii(int n){
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

 public static void main(String[] args) {
    System.out.println(fibonaccii(4));
 }   
}
