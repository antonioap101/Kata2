import software.ulpgc.kata2.BMIHistogramCalculator;
import software.ulpgc.kata2.CsvFilePersonLoader;
import software.ulpgc.kata2.Person;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Person> people = CsvFilePersonLoader.with("bmi_dataset.csv").load();
        Map<String, Integer> histogram = new BMIHistogramCalculator(people).calculate();
        for (String key: histogram.keySet().stream().sorted().toList()){
            System.out.println(key + " -> " + histogram.get(key));
        }

    }
}