import java.util.*;

public class main{
  public static void main(String args[]){
    Stack stack=new Stack();
    stack.push(30);
    stack.push(50);
    stack.push(60);
    stack.push(70);
    stack.push(80);
    stack.push(90);
    stack.show();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.show();


  }
}
public class Stack{
  int capacity=2;
  int top;
  int arr[]=new int[capacity];


  void push(int data){
    if(top==capacity){

      arr=expand();
      arr[top]=data;
      top++;



    }
    else{

      arr[top]=data;
      top++;



    }
  }
  int isempty(){
    if(top==0){
      return -1;
    }
    else{
      return 1;
    }
  }

  int pop(){
    int datas=arr[top];
    if(isempty()==-1){
      System.out.println("The stack is empty");
      return -1;
    }
    else


    arr[top]=0;
    top--;
    shrink();
    return datas;



  }
  int[] shrink(){
    int length=top;
    if(length<=(capacity/2)/2){
      capacity=capacity/2;
      int newstack[]=new int[capacity];
      for(int i=0;i<top;i++){
        newstack[i]=arr[i];
    }
      arr= newstack;

    }
    return arr;
  }
  void show(){
    if(isempty()==-1){
      System.out.println("The stack is empty");
    }else{
      for(int i=0;i<top;i++){
        System.out.println(arr[i]);
      }
    }
  }
    int[] expand(){
      int newstack[]=new int[(capacity*2)];
      capacity *=2;
      for(int i=0;i<top;i++){
        newstack[i]=arr[i];

    }
     return newstack;

  }

}