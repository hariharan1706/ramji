import java.util.Scanner;
class spec{
public static void main(String[] args){
String a;
int count=0,b=0;
Scanner s=new Scanner(System.in);
a=s.next();
for(int i=0;i<a.length();i++){
b=a.charAt(i);
if(b>=33&&b<=47||b>=58&&b<=64||b>=92&&b<=96){
count++;
}
}
System.out.println(count);
}
}
