import java.util.Scanner;

class Calculator {
    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1.Add 2.Subtract 3.Multiply 4.Divide 5.Exit");
            choice = sc.nextInt();

            if (choice == 5) break;

            System.out.print("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Result: " + add(a, b));
                case 2 -> System.out.println("Result: " + sub(a, b));
                case 3 -> System.out.println("Result: " + mul(a, b));
                case 4 -> System.out.println("Result: " + div(a, b));
                default -> System.out.println("Invalid choice");
            }
        } while (true);
    }
}
