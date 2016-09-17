package bai1;

import java.util.Scanner;

public class B4_PhanTichSoNguyenThanhTichCacThuaSoNT {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		phanTich(n);
	}
	
	private static void phanTich(int n)
	{
		for (int i=2;i <= Math.sqrt(n);i++)
 		{
 			while (n%i==0) 
 			{
 				n=n/i; 
 				if (n >= i) System.out.print(i + "*");
 				else System.out.print(i);
 			}	
		}
		if (n > 1)
 			System.out.println(n);
	}
}
