import java.util.Scanner;

class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    void delete() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int choice;

        do {
            System.out.println("\n1.Insert 2.Delete 3.Display 4.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter value: ");
                    list.insert(sc.nextInt());
                }
                case 2 -> list.delete();
                case 3 -> list.display();
            }
        } while (choice != 4);
    }
}
