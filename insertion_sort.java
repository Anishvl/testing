//insertion sort
import java.util.*;
public class main{
  public static void main(String args[]){
    int arr[]={5,1,4,2,3};
    int size=arr.length;
   for(int i=0;i<size;i++){
     int key=arr[i];
     int j=i-1;
     while(j>=0 && arr[j]>key){
       arr[j+1]=arr[j];
       j--;
     }
     arr[j+1]=key;
   }
    System.out.println(Arrays.toString(arr));
  }
}