package search;

public class Main {
    public static void main(String[] args) {
        // Create a list of products
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Smartphone", "Electronics"),
            new Product(104, "Backpack", "Accessories"),
            new Product(105, "Watch", "Accessories")
        };

        // Test Linear Search
        String searchName1 = "Shoes";
        Product foundLinear = SearchService.linearSearch(products, searchName1);
        if (foundLinear != null) {
            System.out.println("Linear Search Result: " + foundLinear);
        } else {
            System.out.println("Linear Search Result: Product not found.");
        }

        // Test Binary Search
        String searchName2 = "Watch";
        Product foundBinary = SearchService.binarySearch(products, searchName2);
        if (foundBinary != null) {
            System.out.println("Binary Search Result: " + foundBinary);
        } else {
            System.out.println("Binary Search Result: Product not found.");
        }
    }
}
