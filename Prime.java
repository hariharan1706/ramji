package prime;

public class Prime {

	public static void main(String[] args) {
		 int num = 4,count=0;
		 int a[]=new int[num];
		 int b[]=new int[num];
		 
		 for(int i=2;i<num;i++)
		 {
			
			if(num%i==0){
				count++;
				break;
			}
		 }
if(count==0){
	System.out.println("prime");
}
else
	System.out.println("not prime"); }

}
