import java.util.*;
public class main{
  public static void main(String args[]){
    LinkedList list=new LinkedList();
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number of elements");
    int nums=s.nextInt();
    System.out.println("enter the numbers now");
    for(int i=0;i<nums;i++){
      int temp=s.nextInt();
      list.insert(temp);
    }
    System.out.println("Elements in the List are:");
    list.show();
  }
}
class Node{
  Node next;
  int data;
}
class LinkedList{
  Node head;
  public void insert(int data){
    Node node=new Node();
    node.data=data;
    node.next=null;

    if(head==null){
      head=node;
    }
    else{
      Node n=head;
      while(n.next!=null){
        n=n.next;
      }
      n.next=node;

    }


  }
  public void show(){
    Node node=head;
    while(node!=null){
      System.out.println(node.data);
      node=node.next;
    }
  }
}

