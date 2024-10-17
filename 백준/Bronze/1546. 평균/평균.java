import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int max = 0;
        int tmp;
        float avg;
        for (int i = 0; i < n; i++) {
            tmp = sc.nextInt();
            sum += tmp;
            if (tmp > max) max = tmp;
        }
        avg = (float)sum / n / max * 100;
        System.out.println(avg);
    }
}