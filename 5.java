import java.util.Scanner;
class element{
public static void main(String[] args){
System.out.println("enter the number in array");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] arr=new int[n];
System.out.println("enter the elements");
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
for(int k=0;k<n;k++)
{
if((arr[i]+arr[j])==arr[k])
System.out.println("element i="+arr[i]+"j="+arr[j]+"k="+arr[k]);
}
}
}
}
}
