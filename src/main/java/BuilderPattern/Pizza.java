package BuilderPattern;

public class Pizza {

    private String toppings;
    private String crust;
    private String type;
    private String size;

    public Pizza(String toppings, String crust, String type, String size) {
        this.toppings = toppings;
        this.crust = crust;
        this.type = type;
        this.size = size;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
