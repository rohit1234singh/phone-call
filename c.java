class c{
public static void main(String[]args){
int i;
int a[]={1,2,3,4,5};
int b[]={6,7,8,9,10,11};
int c[]=new int[a.length+b.length];
System.array copy(a,0,c,0,a.lenth);
System.array copy(b,0,c,a.length,b.length);
System.out.println("first array:" ");
for(int i=0;i<a.length;i++){
System.out.println(a[i]+" ");
}
System.out.println();
System.out.println("2nd array:" ");
for(int i=0;i<b.length;i++){
System.out.println(b[i]+" ");
}
System.out.println();
System.out.println("first and second array:");
for(int i=0;i<c.length;i++){
System.out.prinln(c[i]+" ");
}
}
}
