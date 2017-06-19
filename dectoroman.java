import java.util.Scanner;
class decimal{
public static void main(String[] args){
System.out.println("enter a number");
DecimalToRoman();
}
public static void DecimalToRoman(){
Scanner scan=new Scanner(System.in);
int num=scan.nextInt();
if(num>0&&num<4000){
String thou[]={"","M","MM","MMM"};
String hund[]={"","C","CC","CCC","CCCC","CD","D","DC","DCC","DCCC","CM"};
String ten[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
String unit[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
int th=num/1000;
int h=(num/100)%10;
int t=(num/10)%10;
int u=num%10;
System.out.println("the roman numerals of +num is" +thou[th]+hund[h]+ten[t]+unit[u]);
}
else
System.out.println("you entered a number out of range \n please enter a number in the range[1-3999]");
}
}
