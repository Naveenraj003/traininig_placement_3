import java.util.Scanner;

class VotingSystem {
    static int votesA = 0, votesB = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1.Vote Candidate A 2.Vote Candidate B 3.Results 4.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> votesA++;
                case 2 -> votesB++;
                case 3 -> {
                    System.out.println("Candidate A Votes: " + votesA);
                    System.out.println("Candidate B Votes: " + votesB);
                }
            }
        } while (choice != 4);
    }
}
