public class FairCoin {

    public static void main(String[] args) {
        int heads, tails, result, flipCount;
        boolean fairCoin;

        flipCount = 0;
        heads = 0;
        tails = 0;

        do
        {
            result = (int) (Math.random() * 2);
            flipCount++;
            if(result == 0) {
                heads++;
                System.out.println("Heads count: " + heads);
            }
            if(result == 1) {
                tails++;
                System.out.println("Tails count: " + tails);
            }

        } while (flipCount < 101);

        System.out.println("Heads: " + heads + " Tails: " + tails);

        if((heads >= 42)) {
            fairCoin = true;
            System.out.println("Your coin is unfair.");
        } else {
            System.out.println("Fair coin!");
        }
       
    }
}