import java.util.*;
public class main{
  public static void main(String args[]){
   int arr[]={1,3,2,5,4};
    int size=arr.length;
    //int arr1[]=new arr1[4];
    for(int i=0;i<size-1;i++){
      for(int j=0;j<size-i-1;j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j+1];
          arr[j+1]=arr[j];
          arr[j]=temp;
        }
      }
    }
    System.out.println(Arrays.toString(arr));

  }

}