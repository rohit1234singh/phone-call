class largestarray{
public static void main(String[]args){
int arr[]={25,12,70,75};
int max=arr[0];
for(int i=0;i<arr.length;i++){
if(arr[i]>max)
max=arr[i];
}
System.out.println("largest element in given array:"+max);
}
}
