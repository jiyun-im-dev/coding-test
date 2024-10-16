import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) { // 테스트 케이스 개수만큼 반복
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken()); // 각 문자를 R번 반복
            char[] text = st.nextToken().toCharArray();
            for (char c : text) {
                for (int j = 0; j < R; j++) {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }
}