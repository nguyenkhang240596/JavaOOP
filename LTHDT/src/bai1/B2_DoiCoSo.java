package bai1;

import java.util.Scanner;

public class B2_DoiCoSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		doiCoSo(a, b);
	}
	
	public static void doiCoSo(int n,int base){
        if(n>=base)
            doiCoSo(n / base, base); 
        if(n % base>9)
            System.out.print((n%base+55)+"");
        else
            System.out.print(n%base);
    }
	
}
