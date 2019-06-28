public class Simulation {

    public static void main(String[] args) {
        playWithTwoDice(); //You're going to want to test whether you can play with two dice.
        playWithOne(); //You're going to want to test whether you can play with one die.
    }

    private static void playWithTwoDice() {
        Bins bins = new Bins(2, 12);
        Dice die = new Dice(2);

        for (int i = 1; i <= 1000000; i++) {
            bins.setResult(die.tossAndSum());
        }
        System.out.println(bins);
    }
    private static void playWithOne() {
        Bins bins = new Bins(5, 30);
        Dice die = new Dice(5);

        for (int i = 0; i < 500; i++) {
            bins.setResult(die.tossAndSum());
        }
        System.out.println(bins);
    }
}
