import java.util.Arrays;
import java.util.Scanner;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category; 

    }
}

public class EcommerceSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();  


        Product[] products = new Product[n];
        Product[] sortedProducts = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter product details for product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int productId = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Product Name: ");
            String productName = scanner.nextLine();
            System.out.print("Category: ");
            String category = scanner.nextLine();  


            products[i] = new Product(productId, productName, category);
            sortedProducts[i] = new Product(productId, productName, category);
        }

        
        Arrays.sort(sortedProducts, (p1, p2) -> Integer.compare(p1.productId, p2.productId));

        System.out.print("Enter the product ID to search: ");
        int searchId = scanner.nextInt();

        int linearIndex = linearSearch(products, searchId);
        if (linearIndex != -1) {
            System.out.println("Product found at index " + linearIndex + " using linear search.");
        } else {
            System.out.println("Product not found using linear search.");
        }

        int binaryIndex = binarySearch(sortedProducts, searchId);
        if (binaryIndex != -1) {
            System.out.println("Product found at index " + binaryIndex + " using binary search.");
        } else {
            System.out.println("Product not found using binary search.");
        }

        scanner.close();
    }

    public static int linearSearch(Product[] products, int searchId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == searchId) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] products, int searchId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].productId == searchId) {
                return mid;
            } else if (products[mid].productId < searchId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

/*
Time Complexity

Linear Search:

Best Case: O(1) (When the target element is the first element in the list)
Average Case: O(n)
Worst Case: O(n) (When the target element is the last element or not in the list at all)

Binary Search:

Best Case: O(1) (When the target element is the middle element of the list)
Average Case: O(log n)
Worst Case: O(log n) (When the list is reduced to one element and still the target is not found)

Suitability for an E-commerce Platform

Linear Search:
Advantages:

- Simple to implement.
- No need for the data to be sorted.
- Suitable for small datasets or lists that are infrequently searched.

Disadvantages:

- Inefficient for large datasets due to O(n) complexity.
- Slower response time for user queries on large datasets.

Binary Search:
Advantages:

- Much more efficient for large datasets due to O(logn) complexity.
- Faster response time for user queries on large datasets.

Disadvantages:

- Requires the data to be sorted, which adds additional overhead for maintaining sorted data.
- Slightly more complex to implement compared to linear search.


For an e-commerce platform, where user experience and fast search responses are crucial, binary search is generally more suitable. This is because:

Efficiency: Binary search is significantly faster than linear search for large datasets, which is typical for e-commerce platforms with extensive product catalogs.
User Experience: Faster search results lead to a better user experience, potentially increasing user engagement and sales.
Scalability: As the product catalog grows, binary search can handle increased data volume more efficiently.
 */
