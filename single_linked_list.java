import java.util.*;

public class main{
  public static void main(String args[]){
    LinkedList list=new LinkedList();
    list.insert(35);
    list.insert(34);
    list.insert(33);
    list.show();
  }
}
public class Node{
  int data;
  Node next;
}
public class LinkedList{
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