import java.time.LocalDate;

public class Client extends person{
    private LocalDate startDate;
    private double purchaseAmountInMonth;
    private String favProduct;
    private LocalDate birthday;


    public Client(String id,String name,int age,int telephone,String address, LocalDate startDate, double purchaseAmountInMonth,String favProduct,LocalDate birthday) {
        super(id, name, age, telephone, address);
        this.startDate = startDate;
        this.purchaseAmountInMonth=purchaseAmountInMonth;
        this.birthday=birthday;
        this.favProduct=favProduct;

    }

    public String getName() {
        return Name;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getFavProduct() {
        return favProduct;
    }

    public void setFavProduct(String favProduct) {
        this.favProduct = favProduct;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }


    public LocalDate getStartDate() {
        return startDate;
    }

    public double setPurchaseAmountInMonth(double purchaseAmountInMonth) {
        this.purchaseAmountInMonth = purchaseAmountInMonth;
        return purchaseAmountInMonth;
    }

    public double getPurchaseAmountInMonth() {
        return purchaseAmountInMonth;
    }
    public boolean isGoldenClient() {


        if (startDate.plusYears(5).isBefore(LocalDate.now())) {
            return true;
        }
        if (birthday.equals(LocalDate.now())) {
            return true;
        }

        return false;
    }
    public String toString() {
        if (isGoldenClient()) {
            return "Golden Client: " /* add relevant client information */;
        } else {
            return "Regular Client: "  /* add relevant client information */;
        }
    }
}