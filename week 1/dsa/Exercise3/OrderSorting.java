class Order {
    int orderId;
    String customerName;
    double totalPrice;

    Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("----------------------");
    }
}

public class OrderSorting {

    // Bubble Sort by totalPrice
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swapping happened, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Quick Sort by totalPrice
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(orders, low, high);

            quickSort(orders, low, pivotIndex - 1);
            quickSort(orders, pivotIndex + 1, high);
        }
    }

    public static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice <= pivot) {
                i++;

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

    public static void displayOrders(Order[] orders) {
        for (Order order : orders) {
            order.displayOrder();
        }
    }

    public static void main(String[] args) {

        Order[] orders1 = {
            new Order(101, "Naman", 4500.50),
            new Order(102, "Rahul", 1200.00),
            new Order(103, "Amit", 8500.75),
            new Order(104, "Priya", 3000.25),
            new Order(105, "Sneha", 6500.00)
        };

        Order[] orders2 = {
            new Order(101, "Naman", 4500.50),
            new Order(102, "Rahul", 1200.00),
            new Order(103, "Amit", 8500.75),
            new Order(104, "Priya", 3000.25),
            new Order(105, "Sneha", 6500.00)
        };

        System.out.println("Orders Before Sorting:");
        displayOrders(orders1);

        System.out.println("Orders After Bubble Sort by Total Price:");
        bubbleSort(orders1);
        displayOrders(orders1);

        System.out.println("Orders After Quick Sort by Total Price:");
        quickSort(orders2, 0, orders2.length - 1);
        displayOrders(orders2);
    }
}