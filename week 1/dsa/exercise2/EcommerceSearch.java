import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println("----------------------");
    }
}

public class EcommerceSearch {

    // Linear Search by product name
    public static Product linearSearch(Product[] products, String searchName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(searchName)) {
                return products[i];
            }
        }
        return null;
    }

    // Binary Search by product name
    public static Product binarySearch(Product[] products, String searchName) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int result = products[mid].productName.compareToIgnoreCase(searchName);

            if (result == 0) {
                return products[mid];
            } 
            else if (result < 0) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Mobile", "Electronics"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Bag", "Fashion")
        };

        System.out.println("Linear Search Result:");
        Product result1 = linearSearch(products, "Mobile");

        if (result1 != null) {
            result1.displayProduct();
        } else {
            System.out.println("Product not found.");
        }

        // Sorting array before binary search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        System.out.println("Binary Search Result:");
        Product result2 = binarySearch(products, "Mobile");

        if (result2 != null) {
            result2.displayProduct();
        } else {
            System.out.println("Product not found.");
        }
    }
}