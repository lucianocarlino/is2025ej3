package is2025.ut4.productapi.domain;

public class Product {
    private String code;
    private String description;
    private double price;
    private int stock;
    private double tax;
    private double finalPrice;

    public Product() {}

    public Product(String code, String description, double price, int stock) {
        this.code = code;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public void setTax(double tax) { this.tax = tax; }
    public double getTax() { return tax; }

    public double FinalPrice(){
        finalPrice = price + (price * tax / 100);
        return finalPrice;
    }

    public double getFinalPrice() { 
        return FinalPrice();
    }
}
