import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int tmp = sc.nextInt() % 42;
            st.add(tmp);
        }
        System.out.println(st.size());
    }
}