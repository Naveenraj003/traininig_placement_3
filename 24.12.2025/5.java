import java.util.ArrayList;
import java.util.Scanner;

class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n1.Add 2.Remove 3.Display 4.Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter element: ");
                    list.add(sc.nextLine());
                }
                case 2 -> {
                    System.out.print("Enter element to remove: ");
                    list.remove(sc.nextLine());
                }
                case 3 -> System.out.println(list);
            }
        } while (choice != 4);
    }
}
