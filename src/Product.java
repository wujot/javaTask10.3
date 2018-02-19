public class Product {
    private String name;
    private String manufacture;
    private double price;

    public Product() {}

    public Product(String name, String manufacture, double price) {
        this.name = name;
        this.manufacture = manufacture;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name of product: " + name +
                ", Manufacture: " + manufacture +
                ", Price: " + price;
    }
}
