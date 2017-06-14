import java.util.Scanner;
class harivi{
public static void main(String[] args){
int a,b,x,y,t,hcf;
System.out.println("enter the 2 numbers");
Scanner s=new Scanner(System.in);
x=s.nextInt();
y=s.nextInt();
a=x;
b=y;
while(b!=0){
t=b;
b=a%b;
a=t;
}
hcf=a;
System.out.println("hcf="+hcf);
}
}