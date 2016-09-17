package bai1;

import java.util.Scanner;

public class B1_Ucln_Bcnn {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		System.out.println("Uoc chung lon nhat cua " + a + " va " + b + " : " + UCLN(a, b));
		System.out.println("Boi chung nho nhat cua " + a + " va " + b + " : " + BCNN(a, b));
		
	}
	private static int UCLN(int a,int b)
	{
		while (b!=0)
		{
			int r=a%b;
	   		a=b;
	   		b=r;
		}
		return a;
	}
	 
	private static int BCNN(int a,int b)
	{
	 return a*(b/UCLN(a,b));
	}
}
