package odd;
import java.util.Scanner;
public class Even {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	if(a%2==0)
	{
		System.out.println("even");
		
	}
	else
	if(a==0)
	{
	System.out.println("zero");}
	else {
		System.out.println("odd");
	}
	}

}
