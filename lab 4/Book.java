package bookdetails;
// Book.java
import java.util.Scanner;

public class Book {
    // Instance variables
    private String title;
    private String author;
    private double price;

    // Constructor with parameters
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to set the title of the book
    public void setTitle(String title) {
        this.title = title;
    }

    // Method to set the author of the book
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to set the price of the book
    public void setPrice(double price) {
        this.price = price;
    }

    // Method to get the title of the book
    public String getTitle() {
        return title;
    }

    // Method to get the author of the book
    public String getAuthor() {
        return author;
    }

    // Method to get the price of the book
    public double getPrice() {
        return price;
    }

    // Method to return the book's details as a string
    @Override
    public String toString() {
        return "Book Title: " + title + "\nAuthor: " + author + "\nPrice: $" + price;
    }

    // Main method
    public static void main(String[] args) {
        // Create a Book object with title, author, and price
        Book book = new Book("Developing Java Software", "Hamza Winder", 81.75);

        // Print the book's details
        System.out.println(book.toString());
        
        // Optional: Demonstrating setting new values (if desired)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a new title for the book: ");
        String newTitle = scanner.nextLine();
        book.setTitle(newTitle);
        
        System.out.print("Enter a new author for the book: ");
        String newAuthor = scanner.nextLine();
        book.setAuthor(newAuthor);
        
        System.out.print("Enter a new price for the book: ");
        double newPrice = scanner.nextDouble();
        book.setPrice(newPrice);
        
        // Print the updated book's details
        System.out.println("\nUpdated Book Details:");
        System.out.println(book.toString());

        scanner.close();
    }
}

