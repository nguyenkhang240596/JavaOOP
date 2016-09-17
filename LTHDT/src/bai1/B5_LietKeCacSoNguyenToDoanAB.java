package bai1;

import java.util.Scanner;

public class B5_LietKeCacSoNguyenToDoanAB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if (b < 2)
		{
			
		}
		else {
			for (int i = a; i <= b; i++) {
				for (int j = i+1; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						System.out.println();
					}
				}
			}
		}
	}
}
