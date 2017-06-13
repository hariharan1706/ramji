package prp;
import java.util.Scanner;
public class odd_or_even {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int a =s.nextInt();
		if(a>=0){
			System.out.println("Number is positive");
		}
		else{
			System.out.println("Number is negative");
		}	
	}
}
