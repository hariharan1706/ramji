import java.util.Scanner;
import java.util.Arrays;
class hoi{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter the numbers");
int a=s.nextInt();
int arr[]=new int[a];
for(int i=0;i<a;i++)
{
arr[i]=s.nextInt();
}
System.out.println("output:"+(arr[0]+arr[1]));
s.close();
}
}
