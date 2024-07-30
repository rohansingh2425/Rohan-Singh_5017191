import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Book {
    int bookId;
    String title;
    String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
}

  
public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();  


        System.out.print("Enter the number of books: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("Enter book " + (i + 1) + " details:");
            System.out.print("Book ID: ");
            int bookId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();  


            books.add(new Book(bookId, title, author));
        }

        System.out.print("Enter the book name to search: ");
        String searchTitle = scanner.nextLine();

        
        int index = linearSearch(books, searchTitle);
        if (index != -1) {
            System.out.println("Book found at index " + index);
            System.out.println("Book ID: " + books.get(index).bookId);
            System.out.println("Author: " + books.get(index).author);
        } else {
            System.out.println("Book not found");
        }

        
        Collections.sort(books, (b1, b2) -> b1.title.compareToIgnoreCase(b2.title));

        
        index = binarySearch(books, searchTitle);
        if (index != -1) {
            System.out.println("Book found at index " + index);
            System.out.println("Book ID: " + books.get(index).bookId);
            System.out.println("Author: " + books.get(index).author);
        } else {
            System.out.println("Book not found");
        }

        scanner.close();
    }

    public static int linearSearch(ArrayList<Book> books, String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).title.equalsIgnoreCase(title)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, String title) {
        int left = 0, right = books.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compare = books.get(mid).title.compareToIgnoreCase(title);
            if (compare == 0) {
                return mid;
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

/*
COMPARISON OF TIME COMPLEXITIES OF LINEAR SEARCH AND BINARY SEARCH:


Linear Search :
Time complexity: O(n)

Binary Search :
Time complexity: O(log n)


When to Use Linear and Binary Search:

Linear Search is used for:

- Small datasets or when the data is unsorted.
- Linear search is simple to implement and doesn't require any pre-processing. For small datasets, the overhead of sorting for binary search might not be worth the performance gain.

Binary Search is used for:

- Large, sorted datasets.
- Binary search offers significantly better performance for large datasets. The logarithmic time complexity makes it extremely efficient for finding elements in sorted data.

 */