import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = 0, n = 0, b = 0;
            String s = sc.next();
            int j = 0;
            while (j < s.length() && s.charAt(j) == '!') {
                a++;
                j++;
            }
            n = s.charAt(j) - '0';
            j++;
            while (j < s.length() && s.charAt(j) == '!') {
                b++;
                j++;
            }
            if (n == 0 && b > 0) {
                n = 1;
            }
            for (int k = 0; k < a; k++) {
                n = n == 1 ? 0: 1;
            }
            System.out.println(n);
        }
    }
}