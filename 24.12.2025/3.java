import java.util.Scanner;

class Stack {
    int top = -1;
    int[] stack = new int[5];

    void push(int value) {
        if (top == stack.length - 1)
            System.out.println("Stack Overflow");
        else
            stack[++top] = value;
    }

    void pop() {
        if (top == -1)
            System.out.println("Stack Underflow");
        else
            System.out.println("Popped: " + stack[top--]);
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        for (int i = top; i >= 0; i--)
            System.out.print(stack[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        int choice;

        do {
            System.out.println("\n1.Push 2.Pop 3.Display 4.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter value: ");
                    s.push(sc.nextInt());
                }
                case 2 -> s.pop();
                case 3 -> s.display();
            }
        } while (choice != 4);
    }
}
