 import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
public class Supermarket {
 
    private List<Product> products;
    private List<Client> Clients;
    private List<Staffmember> StaffMembers;
    private List<Staffcard> Staffcards;
    private List<Invoice> invoices;
    private HashMap<String, Integer> product = new HashMap<>();

public Supermarket() {
        this.products = new ArrayList<>();
        this.Clients = new ArrayList<>();
        this.StaffMembers = new ArrayList<>();
        this.Staffcards = new ArrayList<>();
        this.invoices = new ArrayList<>();
    }
 public void addproduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }
 public void addInvoices(Invoice invoice) {
        this.invoices.add(invoice);
    }

    public void removeInvoices(Invoice invoice) {
        this.invoices.remove(invoice);
    }


}
