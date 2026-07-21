import java.util.*;

class Book {
    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("----------------------");
    }
}

public class LibraryManagementSystem {

    // Linear Search by title
    public static Book linearSearch(Book[] books, String searchTitle) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].title.equalsIgnoreCase(searchTitle)) {
                return books[i];
            }
        }
        return null;
    }

    // Binary Search by title
    public static Book binarySearch(Book[] books, String searchTitle) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int result = books[mid].title.compareToIgnoreCase(searchTitle);

            if (result == 0) {
                return books[mid];
            } else if (result < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Book[] books = {
            new Book(101, "Data Structures", "Mark Allen"),
            new Book(102, "Java Programming", "James Gosling"),
            new Book(103, "Operating System", "Galvin"),
            new Book(104, "Computer Networks", "Andrew Tanenbaum"),
            new Book(105, "Database Management", "Korth")
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book title to search: ");
        String title = sc.nextLine();

        System.out.println("\nLinear Search Result:");
        Book linearResult = linearSearch(books, title);

        if (linearResult != null) {
            linearResult.displayBook();
        } else {
            System.out.println("Book not found using Linear Search.");
        }

        // Sorting books by title before binary search
        Arrays.sort(books, new Comparator<Book>() {
            public int compare(Book b1, Book b2) {
                return b1.title.compareToIgnoreCase(b2.title);
            }
        });

        System.out.println("\nBinary Search Result:");
        Book binaryResult = binarySearch(books, title);

        if (binaryResult != null) {
            binaryResult.displayBook();
        } else {
            System.out.println("Book not found using Binary Search.");
        }

        sc.close();
    }
}