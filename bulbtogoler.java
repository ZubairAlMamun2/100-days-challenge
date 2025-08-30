public class bulbtogoler {

    //day-15
        public static int bulbSwitch(int n) {
            int count=0;
            int i=1;
            while(i*i<=n){
                count++;
                i++;
            }

            return count;
    }
    public static void main(String[] args) {
        int num=9;

        System.out.println(bulbSwitch(num));
    }
}
