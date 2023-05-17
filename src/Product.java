public class Product {
    private String name;
    private String barCode;
    private Double price;
    
    private Product next;
    private Product previous;

    public Product(String name, String barCode, Double price) {
        this.name = name;
        this.barCode = barCode;
        this.price = price;
        this.next = null;
        this.previous = null;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarCode() {
        return this.barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getNext() {
        return this.next;
    }

    public void setNext(Product next) {
        this.next = next;
    }

    public Product getPrevious() {
        return this.previous;
    }

    public void setPrevious(Product previous) {
        this.previous = previous;
    }
}
