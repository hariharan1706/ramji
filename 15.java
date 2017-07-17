import java.util.Scanner;
class hari{
public static void main(String[] args){
String a;
System.out.println("enter a line");
Scanner s=new Scanner(System.in);
a=s.nextLine();
int counter=0;
for(int i=0;i<a.length();i++)
{
counter++;
}
System.out.println(counter);
}
}