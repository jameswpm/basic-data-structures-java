public class DoublyLinkedList {
    public Product current;
    private Product head;
    private Product tail;

    public DoublyLinkedList() {
        current = null;
        head = null;
        tail = null;
    }

    public void newProduct(String name, String barCode, Double price) {
        Product entry = new Product(name, barCode, price);

        if (head == null) {
            head = entry;
            tail = entry;
        } else {
            tail.setNext(entry);
            entry.setPrevious(tail);
            tail = entry;
        }
    }

    public void listProducts(Boolean isBackward) {

        if (head != null && !isBackward) {
            current = head;
            while (current != tail) {
                System.out.println("Product: " + current.getName());
                System.out.println("BarCode: " + current.getBarCode() + " Price: " + current.getPrice());
                current = current.getNext();
            }
            System.out.println("Product: " + tail.getName());
            System.out.println("BarCode: " + tail.getBarCode() + " Price: " + tail.getPrice());
        }

        if (tail != null && isBackward) {
            current = tail;
            while (current != head) {
                System.out.println("Product: " + current.getName());
                System.out.println("BarCode: " + current.getBarCode() + " Price: " + current.getPrice());
                current = current.getPrevious();
            }
            System.out.println("Product: " + head.getName());
            System.out.println("BarCode: " + head.getBarCode() + " Price: " + head.getPrice());
        }
    }

    public void excludeProduct(String barCode) {

        if (head != null) {

            if (head.getBarCode().equals(barCode)) {
                //exclude head
                head = head.getNext();
                head.setPrevious(null);
            } else {
                current = head.getNext();
                while (current != tail) {
                    
                    if (current.getBarCode().equals(barCode)) {
                        current.getPrevious().setNext(current.getNext());
                        current.getNext().setPrevious(current.getPrevious());
                        break;
                    } 
                    current = current.getNext();
                }
                if (tail.getBarCode().equals(barCode)) {
                    current.getPrevious().setNext(null);
                    tail = current.getPrevious();
                }
            }
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList();

        //init
        myList.newProduct("James", "01", 2.3);

        //include 4
        myList.newProduct("James2", "02", 2.4);
        myList.newProduct("James3", "03", 2.5);
        myList.newProduct("James4", "04", 2.6);
        myList.newProduct("James5", "05", 5.3);


        //print from head
        myList.listProducts(false);
        //print from tail
        // myList.listProducts(true);

        // System.out.println("Trying excluding head");

        // //exclude head
        // myList.excludeProduct("01");
        // //print
        // myList.listProducts(true);


        // System.out.println("Trying excluding tail");

        // //exclude tail
        // myList.excludeProduct("05");
        // //print
        // myList.listProducts(false);

        System.out.println("Trying excluding anything");

        //exclude 03
        myList.excludeProduct("03");
        //print
        myList.listProducts(false);
    }
}
