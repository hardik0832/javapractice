import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        library.addBook(new Book(1, "Java Basics", "James Gosling"));
        library.addBook(new Book(2, "OOP Concepts", "Bjarne Stroustrup"));

        int choice;

        do {
            System.out.println("\n1. Show Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    library.showBooks();
                    break;
                case 2:
                    System.out.print("Enter Book ID to issue: ");
                    library.issueBook(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter Book ID to return: ");
                    library.returnBook(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}
