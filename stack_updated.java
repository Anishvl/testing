import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Integer> arr = new ArrayList<>();
    private int top = -1;

    public static void main(String args[]) {
        Main stack = new Main(); 
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("\nEnter the operation here\n\n1. push\n2. pop\n3. peek\n4. show");
            int oper = s.nextInt();
            switch (oper) {
                case 1:
                    System.out.println("Enter the number to push");
                    int temp = s.nextInt();
                    stack.push(temp);
                    break;
                case 2:
                    System.out.println(stack.pop());
                    break;
                case 3:
                    System.out.println(stack.peek());
                    break;
                case 4:
                    stack.show();
                    break;
              case 5:
                return;
                default:
                    System.out.println("The entered value is incorrect");
                    break;
            }
        }
    }

    public void push(int data) {
        if (top == 4) {
            System.out.println("Stack is full. Cannot push more elements.");
        } else {
            arr.add(data);
            top++;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            int data = arr.get(top);
            arr.remove(top);
            top--;
            return data;
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return arr.get(top);
        }
    }

    public void show() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Elements in the stack:");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr.get(i));
            }
        }
    }
}
