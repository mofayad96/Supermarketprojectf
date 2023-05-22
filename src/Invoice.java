private String transactionDate;
    private String transactiontime;
    private double price;
    private double totalfinalprice;
    private double totalinitialprice;
    private String id_stuff;
    private String id_points_sale;
    private double sold_products;


    public Invoice(String transactionDate, String transactiontime, double price, double totalfinalprice, double totalinitialprice, String id_stuff, String id_points_sale, double sold_products)
    {
        this.transactionDate = transactionDate;
        this.transactiontime = transactiontime;
        this.price = price;
        this.totalfinalprice = totalfinalprice;
        this.totalinitialprice = totalinitialprice;
        this.id_stuff = id_stuff;
        this.id_points_sale = id_points_sale;
        this.sold_products = sold_products;
    }

    public String getTransactionDate()
    {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate)
    {
        this.transactionDate = transactionDate;
    }

    public String getTransactiontime() {
        return transactiontime;
    }

    public void setTransactiontime(String transactiontime) {
        this.transactiontime = transactiontime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalfinalprice() {
        return totalfinalprice;
    }

    public void setTotalfinalprice(double totalfinalprice) {
        this.totalfinalprice = totalfinalprice;
    }

    public double getTotalinitialprice() {
        return totalinitialprice;
    }

    public void setTotalinitialprice(double totalinitialprice) {
        this.totalinitialprice = totalinitialprice;
    }

    public String getId_stuff() {
        return id_stuff;
    }

    public void setId_stuff(String id_stuff) {
        this.id_stuff = id_stuff;
    }

    public String getId_points_sale() {
        return id_points_sale;
    }

    public void setId_points_sale(String id_points_sale) {
        this.id_points_sale = id_points_sale;
    }

    public double getSold_products() {
        return sold_products;
    }

    public void setSold_products(double sold_products) {
        this.sold_products = sold_products;
    }

}
