import java.util.Scanner;
class natunum{
public static void main(String[] args){
int x,i=1;
int sum=0;
System.out.println("enter the number of items");
Scanner s=new Scanner(System.in);
x=s.nextInt();
while(i<=x)
{
sum=sum+i;
i++;
}
System.out.println("sum of "+x+" number is:"+sum);
}
}
