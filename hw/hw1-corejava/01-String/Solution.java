import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Solution {
    public static void main(String[] args) {
    }

    private static List<String> String1() {
        String s = "Algorithms";
        List<String> result = new ArrayList<>();
        result.add(s.substring(2, 4));
        result.add(s.substring(0, 4));
        return result;
    }

    private static boolean String2(String s1, String s2) {
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private static List<String> String3() {
        String s = "https://www.amazon.com/demo?test=abc";
        StringTokenizer st = new StringTokenizer(s, ":/.?=");
        List<String> result = new ArrayList<>();
        while (st.hasMoreTokens()) {
            result.add(st.nextToken());
        }
        return result;
    }

    private static String String4(List<String[]> l) {
        StringBuilder result = new StringBuilder();
        for (String[] array : l) {
            for (String s : array) {
                result.append(s);
            }
        }
        return result.toString();
    }
}
