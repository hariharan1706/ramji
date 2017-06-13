import java.util.Scanner;
class palindrome{
public static void main(Stringp[] args){
int n=s.nextInt();
int temp;
temp=n;
int r;
int sum=0;
while(n>0){
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(sum=temp){
System.out.println(temp+"is a palindrome");
}
else{
System.out.println(temp+"is not a palindrome");
}
}
}
