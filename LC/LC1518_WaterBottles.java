package LC;

public class LC1518_WaterBottles {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int totalBottlesDrunk = 0;
        int emptyBottles = 0;

        while (numBottles > 0) {
            totalBottlesDrunk += numBottles;
            emptyBottles += numBottles;

            numBottles = emptyBottles / numExchange;
            emptyBottles = emptyBottles % numExchange;
        }

        return totalBottlesDrunk;
    }
    public static void main(String[] args){
        int numBottles = 9;
        int numExchange = 3;
        int ans = numWaterBottles(numBottles, numExchange);
        System.out.println(ans);
    }
}
