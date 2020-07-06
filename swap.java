import java.util.Scanner;
class swap{
public static void main(String[]args){
int x,y;
Scanner input=new Scanner(System.in);
System.out.println("enter the number");
x=input.nextInt();
y=input.nextInt();
System.out.println("enter the x and y value");
x=x^y;
y=x^y;
x=x^y;
System.out.println("value of x "+x);
System.out.println("value of y "+y);
}
