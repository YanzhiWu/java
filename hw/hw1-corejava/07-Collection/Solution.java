import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
    }

    private static List<String> collection1(List<String> l1, List<String> l2) {
        Set<String> set = new HashSet<>(l1);
        List<String> result = new ArrayList<>();
        for (String s : l2) {
            if (set.contains(s)) {
                result.add(s);
            }
        }
        return result;
    }

    private static Map<Character, Integer> collection2(String s) {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            result.put(s.charAt(i), result.getOrDefault(s.charAt(i), 0) + 1);
        }
        return result;
    }

    static Map<Integer, Data> collection3 = new HashMap<>();

    private static void create(int key, String value) {
        if (!collection3.containsKey(key)) {
            collection3.put(key, new Data(key, value));
        }
    }

    private static String read(int key) {
        if (collection3.containsKey(key)) {
            return collection3.get(key).value;
        }
        return null;
    }

    private static void update(int key, String value) {
        if (collection3.containsKey(key)) {
            collection3.put(key, new Data(key, value));
        }
    }

    private static void delete(int key) {
        if (collection3.containsKey(key)) {
            collection3.remove(key);
        }
    }
}

class Data {
    int key;
    String value;

    Data(int key, String value) {
        this.key = key;
        this.value = value;
    }
}
