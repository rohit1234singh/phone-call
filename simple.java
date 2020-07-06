import java.util.Scanner;
class simple{
public static void main(String[]args){

float p,r,si,t;
Scanner input=new Scanner(System.in);

System.out.println("enter the principle , rate and time");
p=input.nextFloat();
r=input.nextFloat();
t=input.nextFloat();
si=(p*r*t)/100;
System.out.println("Simple interest is" +si);
}
}