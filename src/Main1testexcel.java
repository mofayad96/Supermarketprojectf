import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Example usage
        List<Product> products = createProductData();
        ExcelService.writeToExcelSheet(products, "products.xls");
    }

    private static List<Product> createProductData() {
        // Create sample product data
        // Replace this with your actual data retrieval logic
        // Here's an example with dummy data
        List<Product> products = new ArrayList<>();
        Supermarket s1=new Supermarket();
        products.add(new Product("apple","fruits",20.0,25.5,LocalDate.of(2023,5,29),120));
        products.add(new Product("orange juice","Drinks",34.0,44.0,LocalDate.of(2024,5,17),450));
        return products;
    }
}
