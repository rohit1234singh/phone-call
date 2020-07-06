import java.util.Scanner;
class arithmetic{
int a,b;
void add(){
int c=a+b;
System.out.println("the sum is:"+c);
}
void sub(){
int c=a-b;
System.out.println("the sub:"+c);
}
void mul(){
int c=a*b;
System.out.println("the mul:"+c);
}
void div(){
float c=(float)a/b;
System.out.println("the div:"+c);
}
void mdiv(){
int c=a%b;
System.out.println("the mdiv:"+c);
}
}
class calculator{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
arithmetic obj=new arithmetic();
System.out.println("enter a value");
obj.a=input.nextInt();
System.out.println("enter b value");
obj.b=input.nextInt();
System.out.println("enter choice");
System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.mdiv");
int choice=input.nextInt();
switch(choice){
case 1 :obj.add();
break;
case 2 :obj.sub();
break;
case 3 :obj.mul();
break;
case 4 :obj.div();
break;
case 5 :obj.mdiv();
break;
default:
System.out.println("invalid input");
}
}
}