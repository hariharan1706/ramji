import java.util.Scanner;
import java.util.Arrays;
class least{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the integer");
String s=sc.next();
System.out.println("enter number of elements to be deleted");
int n=sc.nextInt();
String result="";
int num=Integer.parseInt(s);
int[] arr=new int[s.length()];
for(int i=0;i<s.length();i++){
arr[i]=num%10;
num/=10;
}
Arrays.sort(arr);
for(int i=0;i<s.length()-n;i++){
result+=arr[i];
}
System.out.println(Integer.parseInt(result));
}
}
