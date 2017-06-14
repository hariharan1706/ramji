class reverse{
public static void main(String[] args){
int a=Integer.parseInt(args[0]);
int rev=0;
while(a!=0)
{
rev=rev*10;
rev=rev+a%10;
a=a/10;
}
System.out.println("reverse no is:"+rev);
}
}
