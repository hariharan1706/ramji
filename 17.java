import java.util.Scanner;
class linear{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("count number of lines");
System.out.println("enter the paragraph");
String a=s.nextLine();
int count=0;
for(int i=0;i<a.length();i++)
{
if(a.charAt(i)=='.')
{
count++;
}
}
System.out.println("count is"+count);
}
}
