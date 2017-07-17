import java.util.Scanner;
class longest{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String x=sc.nextLine();
String y=sc.nextLine();
int len=x.length();
if(len>y.length())
{
len=y.length();
}
StringBuilder a=new StringBuilder();
for(int i=0;i<len;i++)
{
if(x.charAt(i)==y.charAt(i))
{
a.append(x.charAt(i));
}
else
{
break;
}
}
System.out.println(a.toString());
}
}
