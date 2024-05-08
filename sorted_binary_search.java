import java.util.*;
public class main{
  public static void main(String args[]){
    int arr[]={1,2,3,4,5,6,7,8,9,10};
    //int size=arr.lenght;
    System.out.println(Arrays.toString(arr));
    //int i=0;
    System.out.println("enter the element to search");
    Scanner s=new Scanner(System.in);
    int tar=s.nextInt();
    int size=arr.length-1;
    int i=0;
    while(i<=size){
      //int i=0;
      int mid=(i+size)/2;
      if(arr[mid]==tar){
        System.out.println("target "+tar+" found at "+mid+" index");
        break;
      }
      else if(mid<tar){
        i=mid+1;
      }
      else{
        size=mid;
      }
    }
  }
}