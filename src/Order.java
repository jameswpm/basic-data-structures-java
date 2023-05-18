public class Order {
    private Integer orderNumber;
    private String clientName;
    private Double total;

    private Order next;


    public Order(Integer orderNumber, String clientName, Double total) {
        this.orderNumber = orderNumber;
        this.clientName = clientName;
        this.total = total;
        this.next = null;
    }

    public Integer getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getClientName() {
        return this.clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Double getTotal() {
        return this.total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Order getNext() {
        return this.next;
    }

    public void setNext(Order next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "{" +
            " orderNumber='" + getOrderNumber() + "'" +
            ", clientName='" + getClientName() + "'" +
            ", total='" + getTotal() + "'" +
            "}\n";
    }
}