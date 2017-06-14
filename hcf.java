class harivi{
public static void main(String[] args){
int a,b,x,y,t,hcf;
x=100;
y=500;
a=x;
b=y;
while(b!=0){
t=b;
b=a%b;
a=t;
}
hcf=a;
System.out.println("hcf="+hcf);
}
}