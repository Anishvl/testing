//LIFO
import java.util.*;
public class main{
  public static void main(String args[]){
    Queue queue=new Queue();
    queue.enqueue(30);
    queue.enqueue(40);
    queue.enqueue(50);

    queue.enqueue(60);
    queue.enqueue(70);
    queue.enqueue(80);
    queue.show();
  }
}
public class Queue{
  int front=0;
  int rear=0;
  int size=0;
  int capacity=5;
  int arr[]=new int[capacity];
  public void enqueue(int data){
    arr[(rear)%5]=data;
    rear++;
    size++;
  }
  public void show(){
    for(int i=0;i<rear;i++){
      System.out.println(arr[(front+i)%5]+" ");
    }
  }
  public void dequeue(){
    int data=arr[(front%5)];
    //arr[front]=0;
    front++;
    size--;
  }
}