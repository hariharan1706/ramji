import java.util.Scanner;
public class hari
{
public static void main(String[] args)
{
int n,temp=0,min2=1,total,minimum;
Scanner vikky=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
minimum=Math.abs(a[0]+a[1]);
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
total=Math.abs(a[i]+a[j]);
if(total<minimum)
{
temp=i;
min2=j;
minimum=total;
}
}
}
System.out.println("element 1:"+a[temp]);
System.out.println("element 2:"+a[min2]);
}
}
