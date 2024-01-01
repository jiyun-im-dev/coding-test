import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float[] scores = new float[n];
		for (int i = 0; i < n; i++) {
			scores[i] = sc.nextLong();
		}
		Arrays.sort(scores); // 오름차순 정렬
		float max = scores[n - 1];
		float sum = 0;
		// 계산한 값을 배열에 다시 넣는다
		for (int i = 0; i < n; i++) {
			scores[i] = scores[i] / max * 100;
			sum += scores[i];
		}
		float avg = sum / n;
		System.out.println(avg);
	}
}