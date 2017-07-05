import java.util.Scanner;
class height{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the 50 students height");
int arr[]=new int[50];
for(int i=0;i<50;i++){
arr[i]=sc.nextInt();
}
int temp=0;
for(int i=0;i<49;i++){
for(int j=i+1;j<50;j++){
if(arr[i]>arr[j]){
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
for(int i=0;i<50;i++){
System.out.println(arr[i]);
}
System.out.println("the fourth tallest height is:"+arr[46]);
System.out.println("enter the tallest student position ");
int num=sc.nextInt();
sc.close();
System.out.println("the "+num+"th tallest person height is"+arr[num]);
}
}

