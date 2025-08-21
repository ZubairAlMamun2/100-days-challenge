public class sqart {
    

    //day-2
    public static boolean calculatesqart(int x){
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

    public static void main(String[] args) {
        System.out.println(calculatesqart(16));
    }
}
