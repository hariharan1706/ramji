import java.util.Scanner;
class chinnu{
public static void main(String[] args){
int k;
Scanner s=new Scanner(System.in);
int x=s.nextInt();
int y=s.nextInt();
int z=s.nextInt();
System.out.println("the number is"+x);
System.out.println("the number is"+y);
System.out.println("the number is"+z);
k=x>y?(x>z?x:z):(y>z?y:z);
System.out.println("the largest number is"+k);
}
}