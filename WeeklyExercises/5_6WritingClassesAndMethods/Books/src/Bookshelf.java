import java.util.Scanner;

public class Bookshelf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book book1 = new Book("AnimalFarm", "George Orwell", "Penguin", 1984);
        System.out.println("Book 1: \n" + book1);

        book1.setTitle("Animal Farm");
        System.out.println("Book 1: \n" + book1);

        System.out.print("Enter new book, book 2, title:");
        String newTitle = scanner.nextLine();
        System.out.print("Enter new book, book 2, author:");
        String newAuthor = scanner.nextLine();
        System.out.print("Enter new book, book 2, publisher:");
        String newPublisher = scanner.nextLine();
        System.out.print("Enter new book, book 2, Copyright Date: \n");
        int newCRD = scanner.nextInt();

        Book book2 = new Book(newTitle, newAuthor, newPublisher, newCRD);
        System.out.println("Book 2: \n" + book2);
    }
}
