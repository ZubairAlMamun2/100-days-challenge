public class waterbottle {

    //day-5

    public static int numWaterBottles(int numBottles, int numExchange) {
        int result=numBottles;
        for(int i=0;numBottles>=numExchange;i++){
            int numExchangedBottles=numBottles/numExchange;
            numBottles=numBottles%numExchange;
            result=result+numExchangedBottles;
            numBottles +=numExchangedBottles;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(numWaterBottles(9,3));
    }
}
