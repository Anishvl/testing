import java.util.*;
public class main{
  public static void main(String args[]){
    int arr[]={1,5,3,4,2};
    int size=arr.length;
    for(int i=0;i<size;i++){
      int min=arr[i];
      int index=i;
      for(int j=i;j<size;j++){
        if(arr[j]<min){
          min=arr[j];
          index=j;
        }
      }
      int temp=arr[i];
      arr[i]=arr[index];
      arr[index]=temp;
    }
    System.out.println(Arrays.toString(arr));
  }
}