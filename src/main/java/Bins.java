import java.util.Map;
import java.util.TreeMap;

public class Bins {

    private int i;

    // Test bins.
    Map<Integer, Integer> diceResults = new TreeMap();
    public Bins (int lowestNum, int highestNum) {
        for (int i = lowestNum; i <= highestNum; i++) {
            diceResults.put(i, 0); }
    }

    public void setResult(int roll) {
        try {
            diceResults.put(roll, diceResults.get(roll)+1);
        } catch (NullPointerException e) {
            System.out.println(roll);
        }
    }

    // You're going to want to test whether you can garner dice roll results.
    public Map<Integer, Integer> getResults() {
        return diceResults;
    }

    @Override
    public String toString() {
        String stars = "***";
        return String.format("%2d",i) + " : " + "\n";
                + String.format("%8d", diceResults) + " : " + "\n";
                + String.format("%5.2f", ((float)(diceResults)) + " " + "\n";
                + stars
                + "\n";

//                "***\n" +
//                "Simulation of 2 dice tossed for 1000000 times." + stars + "\n" +
//                (String.format("%s%s\n", diceResults, stars)) +
//                stars;
    }
}
