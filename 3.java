import java.util.Scanner;
class find{
public static void main(String[] args){
int p=0,r=0,sum;
Scanner b=new Scanner(System.in);
System.out.println("enter:");
int n=b.nextInt();
int a[][]=new int[n][n];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
a[i][j]=b.nextInt();
}
}
sum=a[0][0];
while(p+1<n&&r+1<n){
if(a[p][r+1]>a[p+1][r]){
sum=sum+a[p][r+1];
r++;
if(r+1==n)
{
for(int t=p+1;t<n;t++)
{
sum=sum+a[t][r];
}
}
}
else
{
sum=sum+a[p+1][r];
p++;
if(p+1==n)
{
for(int t=r+1;t<n;t++)
{
sum=sum+a[p][t];
}
}
}
}
System.out.println(sum);
}
}

