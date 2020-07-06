import java.util.Scanner;
class pqr1{
public static void main(String[]args){
Scanner ob=new Scanner(System.in);
System.out.println("enter the year");
int year=ob.nextInt();
if((year % 4==0 && year % 100!=0) || year % 400==0)
System.out.println(year +" is a leap year");
else 
System.out.println(year +"is not a leap year");

}
}