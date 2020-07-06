class fibonacciseriesusingRec{
static int a=0,b=1,c;
public static void main(String[]args){
System.out.print(a+" "+b);
fibonacciseriesusingRec ob=new fibonacciseriesusingRec();
ob.printfib(5);
}
void printfib(int i){
if(i>=1){
c=a+b;
System.out.print(" "+c);
a=b;
b=c;
printfib(i-1);
}
}
}
