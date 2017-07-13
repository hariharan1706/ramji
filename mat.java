import java.util.Scanner;
class guvibh{
public static void main(String []args){
Scanner hari=new Scanner(System.in);
System.out.println("enter n value");
int n=hari.nextInt();
System.out.println("enter matrix values");
int[][] arr=new int[n][n];
int[][] arr1=new int[n][n];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
arr[i][j]=hari.nextInt();
arr1[i][j]=arr[i][j];
}
}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
if(arr[i][j]==0){
for(int temp=0;temp<n;temp++){
arr1[i][temp]=0;
arr1[j][temp]=0;
}}}}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.println(arr[i][j]+" ");
}
System.out.println();
}
}
}
