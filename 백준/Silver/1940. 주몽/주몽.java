import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 재료의 개수
        int M = Integer.parseInt(br.readLine()); // 갑옷이 완성되는 숫자
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int count = 0, start_idx = 0, end_idx = N - 1;
        while (start_idx < end_idx) {
            if (arr[start_idx] + arr[end_idx] < M) {
                start_idx++;
            } else if (arr[start_idx] + arr[end_idx] == M) {
                count++;
                start_idx++;
                end_idx--;
            } else {
                end_idx--;
            }
        }
        System.out.println(count);
    }
}