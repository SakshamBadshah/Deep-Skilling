import java.util.HashMap;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("-------------------------");
    }
}

class Inventory {
    HashMap<Integer, Product> products = new HashMap<>();

    // Add Product
    public void addProduct(Product product) {
        if (products.containsKey(product.productId)) {
            System.out.println("Product already exists.");
        } else {
            products.put(product.productId, product);
            System.out.println("Product added successfully.");
        }
    }

    // Update Product
    public void updateProduct(int productId, int newQuantity, double newPrice) {
        if (products.containsKey(productId)) {
            Product product = products.get(productId);
            product.quantity = newQuantity;
            product.price = newPrice;
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Delete Product
    public void deleteProduct(int productId) {
        if (products.containsKey(productId)) {
            products.remove(productId);
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Display All Products
    public void displayAllProducts() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product product : products.values()) {
                product.displayProduct();
            }
        }
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product p1 = new Product(101, "Laptop", 10, 55000);
        Product p2 = new Product(102, "Mouse", 50, 500);
        Product p3 = new Product(103, "Keyboard", 30, 1200);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        System.out.println("\nAll Products:");
        inventory.displayAllProducts();

        inventory.updateProduct(102, 70, 450);

        System.out.println("\nAfter Update:");
        inventory.displayAllProducts();

        inventory.deleteProduct(103);

        System.out.println("\nAfter Delete:");
        inventory.displayAllProducts();
    }
}