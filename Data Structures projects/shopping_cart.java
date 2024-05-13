import java.util.*;
public class main{
  public static void main(String args[]){
    int nums,items,num;
    String names;
    Cart cart=new Cart();
    System.out.println("1.add cart\n2.delete items\n3.update cart\n4.show cart\n5.clear cart\n6.Exit cart\n");
    System.out.println("Cart empty :(");
    Scanner s=new Scanner(System.in);
    while(true){
      nums=s.nextInt();
      if(nums==1){
        cart.add_cart();
      }
      else if(nums==2){
        cart.delete();
      }
      else if(nums==3){
        cart.update();
      }
      else if(nums==4){
        cart.show();
      }
      else if(nums==5){
        cart.clear();
        System.out.println("Cart cleared -_-");

      }
      else if(nums==6){
        System.out.println("Thanks for using :)");
        break;
      }
      else{
        System.out.println("Entered incorrect operation :(");
      }
    }
  }
}

public class Cart{
  int capacity=2;
  int top=0;
  int arr[]=new int[capacity];
  String names[]=new String[capacity];
  Scanner s=new Scanner(System.in);

  public void add_cart(){
    Scanner s=new Scanner(System.in);
    String  item;
    int nums;
    if(top==capacity){
      expand();
      add();

    }
    else{
      add();
    }

  }
  private void add(){
    Scanner s=new Scanner(System.in);
    System.out.println("item name?\n");
    String item=s.nextLine();
    System.out.println("Quantity?\n");
    int nums=s.nextInt();
    names[top]=item;
    arr[top]=nums;
    top++;
    System.out.println("items added sucessfully :)\n");
  }
  private void expand(){
    int newstack[]=new int[capacity*2];
    String newarr[]=new String[capacity*2];
    for(int i=0;i<top;i++){
      newstack[i]=arr[i];
      newarr[i]=names[i];
    }
    arr=newstack;
    names=newarr;
    top=capacity;
    capacity *=2;
  }
  public int show(){
    if(top==0){
      System.out.println("Cart empty :(");
      return -1;
    }
    else{
      for(int i=0;i<top;i++){
        System.out.println("\n"+(i+1)+"."+"  "+names[i]+" "+"x"+arr[i]);
      }
    }
    return 0;
  }
  public void delete(){
    //show();
    if(show()==-1){

    }
    else{
      Scanner s=new Scanner(System.in);
      System.out.println("\n Enter the item number to delete");
      int num;
      num=s.nextInt();
      if((1<num)&&(num<top)){
        arr[num-1]=0;
        names[num-1]="";
        int number[]=new int[capacity];
        String dup[]=new String[capacity];
        for (int i = num - 1; i < top - 1; i++) {
          arr[i] = arr[i + 1];
          names[i] = names[i + 1];
        }
        arr[top - 1] = 0;
        names[top - 1] = "";
        top--;
        System.out.println("Item deleted successfully.");

      }
      else{
        System.out.println("Enter the products range upto 1 to "+top);
      }

    }


  }
  public void update(){
    show();
    String change;
    int numchange;
    System.out.println("Enter the number to update");
    int num=s.nextInt();
    if((1<num) && (num<top)){
      System.out.println("\n"+(num)+"."+"  "+names[num-1]+" "+"x"+arr[num-1]);
      System.out.println("");
      System.out.println("1.  items\n2.  quantity\n\n Enter 1 or 2");
      int opr=s.nextInt();
      //s.nextLine();
      if(opr==1){
        item_update(num);
      }
      else if(opr==2){
        quantity_update(num);
      }
      else{
        System.out.println("Incorrect Operation :(");
      }
    }
    else{
      System.out.println("Enter the products range upto 1 to "+top);
    }

    }
  public String[] item_update(int num){

    System.out.println("Enter the name here");
    names[num-1]=s.nextLine();
    //s.close();
    return names;
  }
  public int[] quantity_update(int num){
    System.out.println("Enter the quantity here");
    //numchange=s.nextInt();
    arr[num-1]=s.nextInt();
    //s.close();
    return arr;
  }
  public void clear(){
    for (int i = 0; i < top ; i++) {
      arr[i] = arr[i + 1];
      names[i] = names[i + 1];
    }
    arr[top - 1] = 0;
    names[top - 1] = "";
    top--;
  }
}
