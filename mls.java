import java.util.Scanner;
class multiply{
int a,b,c;
void multiply(){
c=a*b;
System.out.println("the multiply is:"+c);
}
}
class mls{
public static void main(String[]args){
multiply m=new multiply();
m.a=10;
m.b=2;
m.multiply();
}
}   