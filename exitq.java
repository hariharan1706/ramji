import java.util.scanner;
class press{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the letter");
String s=sc.nextLine();
if(s.equals("q")){
System.exit(0);
}
}
}