import java.util.Scanner;
class reverseword{
public static void main(String[] args){
System.out.println("important to use pull stop at end of sentence to get the proper output");
Scanner ramji=new Scanner(System.in);
System.out.println("enter the sentence");
String s=ramji.nextLine();
ramji.close();
String[] str=new String[100];
int h=0;
int l=0;
for(int i=0;i<s.length();i++){
if((int)s.charAt(i)==32||(int)s.charAt(i)==46){
str[l]=s.substring(h,i);
l++;
h=i+1;
}
}
for(int i=l-1;i>0;i--){
System.out.println(str[i]+"");
}
System.out.println(str[0]+".");
}
}
