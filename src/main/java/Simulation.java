public class Simulation {

    public static void main(String[] args) {
        playWithTwoDice();
        playWithTwo();
    }

    private static void playWithTwoDice() {
        Bins bins = new Bins(2, 12);
        Dice die = new Dice(2);

        for (int i = 0; i < 5; i++) {
            bins.setResult(die.tossAndSum());
        }
        System.out.println(bins);
    }
    private static void playWithTwo() {
        Bins bins = new Bins(5, 30);
        Dice die = new Dice(5);

        for (int i = 0; i < 500; i++) {
            bins.setResult(die.tossAndSum());
        }
        System.out.println(bins);
    }
}
