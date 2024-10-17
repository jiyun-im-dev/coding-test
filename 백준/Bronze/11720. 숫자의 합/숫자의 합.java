import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        String s = br.readLine();
        int[] nums = s.chars().map(c -> c - '0').toArray();
        for (int num : nums) {
            sum += num;
        }
        System.out.println(sum);
    }
}