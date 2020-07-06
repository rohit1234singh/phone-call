import java.util.Scanner;
class pqr{
public static void main(String[]args){
String pw;
System.out.println("enter the password");
Scanner input=new Scanner(System.in);
pw=input.next();
switch(pw){
case "admin":;
System.out.println("check ok");
break;
default:
System.out.println("invalid password");
}
}
}