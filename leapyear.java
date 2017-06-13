class leap_or_not{
public static void main(String[] args){
int a=Integer.parseInt(args[0]);
if((a%4==0)&&(a%400==0))
{
System.out.println("it was leap year");}
else if(a%100==0)
{
System.out.println("not a leap year");
}
}}