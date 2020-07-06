import java.util.Scanner;
class anushaka{
public static void main(String[]args){
String wishes;
System.out.println("birthday wishes");
Scanner input=new Scanner(System.in);
wishes=input.next();
switch(wishes){
case "HappyBirthdaytoyouanushaka":
System.out.println("done");
break;
default:
System.out.println("invalid wishes");
}
}
}