import java.util.Scanner;

class Queue {
    int front = 0, rear = -1;
    int[] queue = new int[5];

    void enqueue(int value) {
        if (rear == queue.length - 1)
            System.out.println("Queue Overflow");
        else
            queue[++rear] = value;
    }

    void dequeue() {
        if (front > rear)
            System.out.println("Queue Underflow");
        else
            System.out.println("Deleted: " + queue[front++]);
    }

    void display() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = front; i <= rear; i++)
            System.out.print(queue[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int choice;

        do {
            System.out.println("\n1.Enqueue 2.Dequeue 3.Display 4.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter value: ");
                    q.enqueue(sc.nextInt());
                }
                case 2 -> q.dequeue();
                case 3 -> q.display();
            }
        } while (choice != 4);
    }
}
