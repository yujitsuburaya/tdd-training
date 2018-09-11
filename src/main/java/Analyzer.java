import java.util.Collections;
import java.util.List;

public class Analyzer {
    private List<Integer> numbers;

    Analyzer(List<Integer> numbers) {
        this.numbers = numbers;
    }
    public String analyze() {
        return "o) minimum value = " + Collections.min(numbers) + "\n" +
                "o) maximum value = " + Collections.max(numbers) + "\n" +
                "o) number of elements in the sequence = " + numbers.size() + "\n" +
                "o) average value = " + String.format("%.6f", calcAverage(numbers));
    }

    public Double calcAverage(List<Integer> numbers) {
        double total = 0;
        int sequence = numbers.size();
        for (int i = 0; i < sequence; i++) {
            total += numbers.get(i);
        }

        return total/sequence;
    }
}
