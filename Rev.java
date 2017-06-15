package rev;

import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
		System.out.println("Enter any number : ");
		Scanner s=new Scanner(System.in);
int a=0,b=0;
		int no = s.nextInt();

		
		while(no!=0)
		{
			b=no%10;
			a=a*10+b;
		no=no/10;
		
		}
		System.out.println("Number of Digits in given number is: "+a);
	}
	
}
