import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class Product {
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}


class InventoryManagementSystem {
   
    private Map<String, Product> inventory;

    public InventoryManagementSystem() {
        inventory = new HashMap<>();
    }

    
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

   
    public void updateProduct(String productId, Product updatedProduct) {
        if (inventory.containsKey(productId)) {
            inventory.put(productId, updatedProduct);
        } else {
            System.out.println("Product not found in the inventory.");
        }
    }

    
    public void deleteProduct(String productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
        } else {
            System.out.println("Product not found in the inventory.");
        }
    }

   
    public void displayInventory() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}


public class InventoryManagement {
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Inventory");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    String productId = scanner.nextLine();
                    System.out.print("Enter Product Name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    ims.addProduct(new Product(productId, productName, quantity, price));
                    break;
                case 2:
                    System.out.print("Enter Product ID to Update: ");
                    String updateProductId = scanner.nextLine();
                    System.out.print("Enter New Product Name: ");
                    String newProductName = scanner.nextLine();
                    System.out.print("Enter New Quantity: ");
                    int newQuantity = scanner.nextInt();
                    System.out.print("Enter New Price: ");
                    double newPrice = scanner.nextDouble();
                    ims.updateProduct(updateProductId, new Product(updateProductId, newProductName, newQuantity, newPrice));
                    break;
                case 3:
                    System.out.print("Enter Product ID to Delete: ");
                    String deleteProductId = scanner.nextLine();
                    ims.deleteProduct(deleteProductId);
                    break;
                case 4:
                    ims.displayInventory();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

/*
Time Complexity Analysis

1.Add Operation:
Time Complexity: O(1) on average.
2.Update Operation:
Time Complexity: O(1) on average.
3.Delete Operation:
Time Complexity: O(1) on average.
4.Display Operation:
Time Complexity: O(n), where 'n' is the number of products in the inventory.

Optimization Strategies

1.Improve Hash Function
2.Handle Collisions
3.Capacity Management
4.Concurrency Considerations
5.Memory Management
6.Custom Data Structures
 By implementing these optimizations, 
 you can ensure that the inventory management system remains efficient and scalable, 
 handling large datasets and high transaction volumes effectively.
 */