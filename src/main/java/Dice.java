import java.util.Random;

public class Dice {
    private int numberOfTosses;

    public Dice (int numberOfTosses) {
        this.numberOfTosses = numberOfTosses;
    }

    private int toss() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    public int tossAndSum() {
        int total = 0;
        for (int i = 0; i < numberOfTosses; i++) {
            total += toss();
        } return total;
    }
}
