class smallestarray{
public static void main(String[]args){
int arr[]={25,11,10,6};
int min=arr[0];
for(int i=0;i<arr.length;i++){
if(arr[i]<min)
min=arr[i];
}
System.out.println("smallest element in given array:"+min);
}
}