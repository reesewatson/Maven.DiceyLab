import java.util.Random;

public class Dice {
    private int numberOfTosses;

    public Dice (int numberOfTosses) {
        this.numberOfTosses = numberOfTosses;
    }

    // Test whether you can toss the die/dice.
    static Integer toss() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    // Test whether you can toss die/dice and tally sums.
    public Integer tossAndSum() {
        int total = 0;
        for (int i = 0; i < numberOfTosses; i++) {
            total += toss();
        } return total;
    }
}
