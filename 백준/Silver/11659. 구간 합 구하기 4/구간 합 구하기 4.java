import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[] sumArray = new long[N + 1]; // 합 배열 선언 (인덱스를 1부터 시작하도록 설정)
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            sumArray[i] = sumArray[i - 1] + Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int last = Integer.parseInt(st.nextToken());
            System.out.println(sumArray[last] - sumArray[first - 1]);
        }
    }
}