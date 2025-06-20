
import java.util.*;
class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String toString() {
        return "ID: " + productId + ", Name: " + productName + ", Category: " + category;
    }
}


class Search {

    // Linear Search
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(targetName);

            if (cmp == 0)
                return products[mid];
            else if (cmp < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input number of products
        System.out.print("Enter number of products: ");
        int n = s.nextInt();
        s.nextLine(); // consume newline

        Product[] products = new Product[n];

        // Input product details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");

            System.out.print("Product ID: ");
            int id = s.nextInt();
            s.nextLine(); // consume newline

            System.out.print("Product Name: ");
            String name = s.nextLine();

            System.out.print("Category: ");
            String category = s.nextLine();

            products[i] = new Product(id, name, category);
        }

        // Input search term
        System.out.print("Enter product name to search: ");
        String searchName = s.nextLine();

        // Sort products by name for binary search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));


        // Linear Search
        Product result1 = Search.linearSearch(products, searchName);
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Product not found"));

        // Binary Search
        Product result2 = Search.binarySearch(products, searchName);
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Product not found"));

        s.close();
    }
}
