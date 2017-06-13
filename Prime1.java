package prime1;

public class Prime1 {

	public static void main(String[] args) {
		int num1 = 10, num2=99,count=0;
		 
		  for (int i =num1 ; i <= num2; i++) {
		   count = 0;
		   for (int j = 2; j <= i/2 ; j++) 
		   {
		    if (i % j == 0) {
		     count++;
		     break;
		    }
		   }
		  if(count==0)
		        System.out.println(+i);
		    

	}
		  }
}
