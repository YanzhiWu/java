import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.function.Function;

public class Solution {
    public static void main(String[] args) {
        String s = "walabcwalexywalxzsfwalmx";
        List<String> l = Arrays.asList(s.split("wal"));
        String replaceResult = l.stream().collect(Collectors.joining("sams"));

        s = "Eclipse eclipse Eclipse eclipse amc clip ECLIPSE";
        l = Arrays.asList(s.toLowerCase().split(" "));
        Map<String, Integer> countResult = l.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)));
    }
}

class MyStream {
    @FunctionalInterface
    public interface Apply {
        public int calculate(int x);
    }

    public static List<Integer> MyMap(List<Integer> l, Apply stream) {
        List<Integer> result = new ArrayList<>();
        for (int num : l) {
            result.add(stream.calculate(num));
        }
        return result;
    }
}
