import java.util.Scanner;

class Order implements Comparable<Order> {
    int orderId;
    String customerName;
    double totalPrice;

    Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice; 

    }

    @Override
    public int compareTo(Order other) {
        return Double.compare(this.totalPrice, other.totalPrice);
    }
}

public class SortOrders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of orders: ");
        int n = scanner.nextInt();

        Order[] orders = new Order[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for order " + (i + 1) + ":");
            System.out.print("Order ID: ");
            int orderId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Customer Name: ");
            String customerName = scanner.nextLine();
            System.out.print("Total Price: ");
            double totalPrice = scanner.nextDouble();

            orders[i] = new Order(orderId, customerName, totalPrice);
            
            scanner.close();
        }
        

 
        bubbleSort(orders);
        System.out.println("Orders sorted by totalPrice using Bubble Sort:");
        printOrders(orders);

  
        quickSort(orders, 0, n - 1);
        System.out.println("Orders sorted by totalPrice using Quick Sort:");
        printOrders(orders);
    }

    static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].compareTo(orders[j + 1]) > 0) {
                    // Swap orders[j] and orders[j + 1]
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    static int partition(Order[] orders, int low, int high) {
        Order pivot = orders[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (orders[j].compareTo(pivot) <= 0) {
                i++;
                // Swap orders[i] and orders[j]
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
      
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }

    static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println("Order ID: " + order.orderId + ", Customer Name: " + order.customerName + ", Total Price: " + order.totalPrice);
        }
    }
}

/*
Time Complexity[Comparison]:

Bubble Sort:

- Best case: O(n) 
- Average case: O(n^2)   
- Worst case: O(n^2)

Quick Sort:

- Best case: O(nlog n) 
- Average case: O(nlog n)   
- Worst case: O(n^2)

Why Quick Sort is Preferred over BUbble Sort:

- Quick Sort consistently delivers O(n log n) performance in most practical scenarios, making it significantly faster than Bubble Sort's O(n^2) average and worst-case time complexity.
- Quick Sort's divide-and-conquer approach often leads to better cache locality, improving performance.
- Quick Sort is the algorithm of choice for most sorting tasks due to its superior average and best-case performance.

 */