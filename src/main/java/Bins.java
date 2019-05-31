import java.util.Map;
import java.util.TreeMap;

public class Bins {

    Map<Integer, Integer> results = new TreeMap<Integer, Integer>();
    public Bins (int lowest, int highest) {
        for (int i = lowest; i <= highest; i++) {
            results.put(i, 0); }
    }

    public void setResult(int roll) {
        try {
            results.put(roll, results.get(roll)+1);
        } catch (NullPointerException e) {
            System.out.println(roll);
        }
    }


    public Map<Integer, Integer> getResults() {
        return results;
    }

    @Override
    public String toString() {
        String stars = "***";
        return "***\n" +
                "Simulation of 2 dice tossed for 1000000 times." + stars + "\n" +
                (String.format("%s%s\n", results, stars)) +
                stars;
    }
}
