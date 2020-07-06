import java.util.Scanner;
class day{

public static void main(String[]args){
String n;
System.out.println("enter the name of day");
Scanner input=new Scanner(System.in);
n=input.next();
switch(n){
case "sunday":
System.out.println("1st day");
break;
case "monday":
System.out.println("2nd day");
break; 
case "Tuesday":
System.out.println("3rd day");
break;
case "wednesday":
System.out.println("4th day");
break;
case "thursday":
System.out.println("5th day");
break;
case "friday":
System.out.println("6th day");
break;
case "Saturday":
System.out.println("7th day");
break;
default:
System.out.println("invalid input");
}
}
}
