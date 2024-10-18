import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int start_idx = 1, end_idx = 1, count = 1, sum = 1;
        while (end_idx != N) {
            if (sum < N) {
                end_idx++;
                sum += end_idx;
            } else if (sum == N) {
                end_idx++;
                sum += end_idx;
                count++;
            } else if (sum > N) {
                sum -= start_idx;
                start_idx++;
            }
        }
        System.out.println(count);
    }
}