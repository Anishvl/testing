import java.util.*;
public class main{
  public static void main(String args[]){
    int arr[]={1,2,3,4,5};
    int size=arr.length-1;
    //int size=len-1;
    int tar=5;
    for(int i=0;i<=size;i++){
      if(arr[i]==tar){
        System.out.println("target "+ tar+" found at "+i+" index");
      }
      else{
        System.out.println("target "+tar+" not found in the above list");
      }
    }
  }
}