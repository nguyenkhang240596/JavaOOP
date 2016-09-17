package bai1;

import java.util.Scanner;

public class B3_SumIntegers {
	public static void main(String[] args) {
		int a = new Scanner(System.in).nextInt();
		int s = 0;
		while (a > 0) {
			s = s + a%10;
			a /= 10;
		}
		System.out.println(s);
	}
}
