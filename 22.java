import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
class harish{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String str="xyzxxmalayalamabc";
int i,j,large=-1234;
String s1="";
LinkedHashSet set=new LinkedHashSet();
for(i=0;i<str.length();i++){
for(j=i+1;j<=str.length();j++){
s1="";
s1=str.substring(i,j);
String s3="";
s3=s1;
StringBuffer s2=new StringBuffer(s1);
s2.reverse();
String s4="";
s4=s2.toString();
if(s4.equals(s1)){
set.add(s4);
}
}
}
for(Object o:set){
int count=0;
count=((String) o).length();
if(count>large){
large=count;
}
}
for(Object o:set){
int count=0;
count=((String) o).length();
if(large==count){
System.out.println(o);
}
}
}
}