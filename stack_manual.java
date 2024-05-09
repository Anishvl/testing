import java.util.*;
public class main{
  public static void main(String [] args){
    stack stac=new stack();
    stac.push(1);
    stac.push(2);
    stac.push(3);
    System.out.println(stac.peek());
    stac.show();
    System.out.println("");
    System.out.print(stac.pop());
    System.out.println("");
    stac.show();
  }
}
class stack{
  int top=0;
  int arr[]=new int[5];
  public void push(int data){
    arr[top]=data;
    top++;
  }
  public void show(){
    for(int i=0;i<top;i++){
      System.out.print(arr[i]);
    }
  }
  public int pop(){
    top--;
    int data=arr[top];
    arr[top]=0;
    return data;
  }
  public int peek(){
    return arr[top-1];
  }
}