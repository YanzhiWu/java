import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Solution {
    public static void main(String[] args) {
    }

    public static String runSameTime() {
        ExecutorService es = Executors.newFixedThreadPool(2);
        StringBuilder result = new StringBuilder();
        try {
            Future<String> a = es.submit(() -> new A().getMethod());
            Future<String> b = es.submit(() -> new B().getMethod());
            boolean finished = false;
            while (!finished) {
                if (a.isDone() && b.isDone()) {
                    result.append(b.get()).append(" ").append(a.get());
                    finished = true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return result.toString();
    }

    static class A {
        public String getMethod() {
            return "A.getMethod";
        }
    }

    static class B {
        public String getMethod() {
            return "B.getMethod";
        }
    }
}
