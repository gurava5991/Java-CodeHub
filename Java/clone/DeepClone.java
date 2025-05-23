package clone;

import java.util.ArrayList;
import java.util.List;

class Book implements Cloneable {
    String title;

    Book(String title) {
        this.title = title;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Book(this.title); // Creating a new independent object
    }
}

class Library implements Cloneable {
    String name;
    List<Book> books;

    Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Method to add books to the library
    void addBook(String title) {
        books.add(new Book(title));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Library clonedLibrary = (Library) super.clone();
        clonedLibrary.books = new ArrayList<>();

        for (Book book : this.books) {
            clonedLibrary.books.add((Book) book.clone()); // Deep cloning each book
        }

        return clonedLibrary;
    }

    public void display() {
        System.out.println("Library Name: " + name);
        for (Book book : books) {
            System.out.println("Book: " + book.title);
        }
    }
}

public class DeepClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Library library1 = new Library("Central Library");
        library1.addBook("Java Basics");
        library1.addBook("Data Structures");
        library1.addBook("Operating System");

        // Deep cloning
        Library library2 = (Library) library1.clone();

        System.out.println("Before Modification:");
        library1.display();
        library2.display();

        // Modifying cloned object
        library2.books.get(0).title = "Advanced Java"; // Changing first book in cloned library

        System.out.println("\nAfter Modification:");
        library1.display(); // Original library should remain unchanged
        library2.display(); // Cloned library has modified book title
    }
}

