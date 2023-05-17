import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Product, Integer> stock;

    public Inventory() {
        this.stock = new HashMap<>();
    }

    public void addProduct(Product product, int quantity) {
        int currentQuantity = stock.getOrDefault(product, 0);
        stock.put(product, currentQuantity + quantity);
    }

    public void removeProduct(Product product, int quantity) {
        int currentQuantity = stock.getOrDefault(product, 0);

        if (currentQuantity - quantity <= 0) {
            stock.remove(product);
        } else {
            stock.put(product, currentQuantity - quantity);
        }
    }

    public int getProductQuantity(Product product) {
        return stock.getOrDefault(product, 0);
    }

    public void displayInventory() {
        System.out.println("Inventory:");

        for (Map.Entry<Product, Integer> entry : stock.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();

            System.out.println(product.getName() + " - Quantity: " + quantity);
        }
    }
}

