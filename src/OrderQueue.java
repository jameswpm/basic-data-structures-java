public class OrderQueue {

    public Order current;
    private Order head;
    private Order tail;

    public OrderQueue() {
        tail = null;
        head = null;
    }

    public void enqueue(Integer orderNumber, String clientName, Double total) {
        Order entry = new Order(orderNumber, clientName, total);

        if (head == null) {
            head = entry;
            tail = entry;     
        } else {            
            tail.setNext(entry);
            tail = entry;
        }        
    }

    public Order dequeue() {
        Order ret = head;

        head = ret.getNext();

        return ret;
    }

    public Order peek() {
        return head;
    }

    public void showOrders() {

        if (head != null) {
            current = head;
            while (current != tail) {
                System.out.println(current);
                current = current.getNext();
            }
            System.out.println(tail);
        }
    }
    
    public static void main(String[] args) {
        OrderQueue myQueue = new OrderQueue();

        //init
        myQueue.enqueue(1, "James", 2.5);

        //include 4
        myQueue.enqueue(2, "Lana", 2.5);
        myQueue.enqueue(3, "Rafa", 56.89);
        myQueue.enqueue(4, "Miranda", 5.0);
        myQueue.enqueue(5, "Carlinhos", 2.5);

        //print
        myQueue.showOrders();

        System.out.println("Trying dequeue");

        //dequeue and/or peek
        Order myOrder = myQueue.peek();
        // Order myOrder2 = myQueue.dequeue();
        System.out.println(myOrder);
        //print
        System.out.println("New queue");
        myQueue.showOrders();
    }

}
