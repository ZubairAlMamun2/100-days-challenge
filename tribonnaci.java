public class tribonnaci {

    //day-4
    public static int tribonnacii(int n) {
        int firstnum =0;
        int secondnum=1;
        int thirdnum=1;
         if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else if(n==2){
            return 1;
        }
        else{
            for(int i=1;i<=n;i++){
            int fourthnum= firstnum+secondnum+thirdnum;
            firstnum=secondnum;
            secondnum=thirdnum;
            thirdnum=fourthnum;
            
            
        }
        return firstnum;
        }
    }


    public static void main(String[] args) {
        System.out.println(tribonnacii(5));
    }
}
