package relationshipandobjectbehaviour;
import java.util.*;

class Author{
    String name;
    List<Book> books; // Many-to-Many association

    Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    void writeBook(Book book) {
        books.add(book);
        book.authors.add(this); // Add author to the book as well
    }

    void displayBooks() {
        System.out.println("Author: " + name);
        System.out.println("Books Written:");
        for (Book book : books) {
            System.out.println("- " + book.title);
        }
    }
}
class Book{
    String title;
    List<Author> authors; // Many-to-Many association

    Book(String title) {
        this.title = title;
        this.authors = new ArrayList<>();
    }

    void displayAuthors() {
        System.out.println("Book: " + title);
        System.out.println("Authors:");
        for (Author author : authors) {
            System.out.println("- " + author.name);
        }
    }

}
public class ManyToMany {
    public static void main(String[] args) {
        // Creating authors
        Author author1 = new Author("J.K. Rowling");
        Author author2 = new Author("Stephen King");

        // Creating books
        Book book1 = new Book("Harry Potter");
        Book book2 = new Book("The Shining");
        Book book3 = new Book("Fantasy Collection");

        // Establishing many-to-many relationships
        author1.writeBook(book1);
        author1.writeBook(book3); // J.K. Rowling writes Fantasy Collection
        author2.writeBook(book2);
        author2.writeBook(book3); // Stephen King writes Fantasy Collection

        // Display relationships
        author1.displayBooks();
        author2.displayBooks();

        System.out.println();

        book1.displayAuthors();
        book2.displayAuthors();
        book3.displayAuthors();

    }
}
