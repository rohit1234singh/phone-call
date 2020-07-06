import java.lang.*;
import java.util.Scanner;
class sp{
public static void main(String[]args){
int n;
System.out.println("enter the value of n (b/w 1 to 3)");
Scanner input=new Scanner(System.in);

 n=input.nextInt();

switch(n){
case 1:
System.out.println("one");
break;
case 2:
System.out.println("two");
break;
case 3:
System.out.println("three");
break;
default:
System.out.println("invalid input");
}
}
}

