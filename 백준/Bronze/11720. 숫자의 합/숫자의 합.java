import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long count = sc.nextLong();
		String num = sc.next();
		String[] numArray;
		numArray = num.split("");
		long sum = 0;
		for (int i = 0; i < count; i++) {
			sum += Integer.parseInt(numArray[i]) % 10;
		}
		System.out.println(sum);
		/* 틀린 코드 - 일정 범위 이상의 수는 계산 불가능
		Scanner sc = new Scanner(System.in);
		long count = sc.nextLong();
		long num = sc.nextLong();
		long sum = 0;
		for (long i = 0; i < count; i++) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println(sum);*/
	}
}