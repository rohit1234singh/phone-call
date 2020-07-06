import java.util.Scanner;
class subclass{
int a,b,c;
void add(){
c=a+b;
System.out.println("the sum is: "+c);
}
} 
class mainclass{
public static void main(String[]args){
subclass ob=new subclass();
ob.a=10;
ob.b=20;
ob.add();
}
}
