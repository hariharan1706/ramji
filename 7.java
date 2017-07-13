import java.util.Arrays;
import java.util.Scanner;
class hari{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter size");
int a=sc.nextInt();
int[] x=new int[a];
for(int i=0;i<a;i++){
x[i]=sc.nextInt();
}
for(int i=0;i<a;i++){
for(int j=i+1;j<a;j++){
if(x[i]==x[j]){
System.out.println(x[i]);
}
}
}
}
}