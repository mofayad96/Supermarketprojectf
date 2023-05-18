import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Supermarket {

    private List<Product> products;
    private List<Client> Clients;
    private List<Staffmember> StaffMembers;
    private List<Staffcard> Staffcards;
    private List<Invoice> invoices;

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

    public void addClient(Client client) {
        this.Clients.add(client);
    }

    public void removeClient(Client client) {
        this.Clients.remove(client);

    }

    public void addStaffmember(Staffmember staffmember) {
        this.StaffMembers.add(staffmember);
    }

    public void removeStaffmembers(Staffmember staffmember) {
        this.StaffMembers.remove(staffmember);
    }

    public void addStaffcard(Staffcard staffcard) {
        this.Staffcards.add(staffcard);
    }

    public void removeStaffcard(Staffcard staffcard) {
        this.Staffcards.remove(staffcard);
    }

    public void addInvoices(Invoice invoice) {
        this.invoices.add(invoice);
    }

    public void removeInvoices(Invoice invoice) {
        this.invoices.remove(invoice);
    }

    public int sellProduct(Product product, int quantity, Client client, Staffmember staffmember, PointOfSale pointOfSale) {
        if (product.getQuantity() < quantity) {
            System.out.println("Sorry, " + product.getName() + " is out of stock.");
            return product.getQuantity();
        }

        if (LocalDate.now().isAfter(product.getExpirationDate())) {
            System.out.println("Sorry, " + product.getName() + " is expired.");
            return 0;
        }

        int soldQuantity = quantity;
        product.setQuantity(product.getQuantity() - soldQuantity);
        if (product.getQuantity() < 10) {
            System.out.println("Alert: The quantity of " + product.getName() + " is now less than 10.");
        }

        double initialPrice = product.getSellPrice() * quantity;
        double discount = calculateDiscount(initialPrice, client, product);
        double finalPrice = initialPrice - discount;

        Invoice invoice = new Invoice(LocalDate.now().toString(), LocalDate.now().toString(), initialPrice, finalPrice, discount, staffmember.getId(), pointOfSale.getId(), quantity);
        addInvoices(invoice);

        System.out.println("Sold " + quantity + " units of " + product.getName() + " to " + client.getName() + ".");
        System.out.println("Initial Price: " + initialPrice + " L.E.");
        System.out.println("Discount: " + discount + " L.E.");
        System.out.println("Final Price: " + finalPrice + " L.E.");
        System.out.println("point of sale ID: " + pointOfSale.getId() + " || " + "Location: " + pointOfSale.getLocation());
        System.out.println("Staffmember ID :" + staffmember.getId());
        System.out.println("Thank you for using our store ☺");
        product.setQuantity(product.getQuantity() - soldQuantity);
        client.setPurchaseAmountInMonth(client.getPurchaseAmountInMonth() + (int) (soldQuantity * product.getSellPrice()));
        return soldQuantity;
    }
    double calculateDiscount(double initialPrice, Client client, Product product) {
        double discount = 0;
        if (isGolden(client)) {
            if (LocalDate.now().equals(client.getBirthday())) {
                discount = initialPrice * 0.1;
            } else if (product.getName().equals(client.getFavProduct())) {
                discount = initialPrice * 0.2;
            } else {
                discount = initialPrice * 0.02;
            }

        }
        if (LocalDate.now().equals(LocalDate.of(2023, 5, 18))) {
            discount += initialPrice * 0.87;
        }
        if (client.getPurchaseAmountInMonth() > 4000) {
            discount += initialPrice * 0.01;
        }


        return discount;
    }

    private boolean isGolden(Client client) {
        return LocalDate.now().minusYears(5).isAfter(client.getStartDate());
    }
    private boolean isfavproduct(Product product, Client client) {
        return product.getName().equals(client.getFavProduct());
    }
}

