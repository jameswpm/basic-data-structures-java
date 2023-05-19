public class BooksStack {
    private Book head;

    public BooksStack() {
        head = null;
    }

    public void push(String bookName) {
        Book entry = new Book(bookName);

        if (head == null) {
            head = entry;
        } else {
            Book temp = head;
            entry.setNext(temp);
            head = entry;
        }        
    }

    public Book pop() {
        Book ret = head;

        head = ret.getNext();

        return ret;
    }

    public Book peek() {
        return head;
    }

    public void showBooks() {

        if (head != null) {
            Book current = head;
            while (current.getNext() != null) {
                System.out.println(current);
                current = current.getNext();
            }
            System.out.println(current);
        }
    }

    public static void main(String[] args) {
        BooksStack myStack = new BooksStack();

        //init
        myStack.push("James");

        //include 4
        myStack.push("Lana");
        myStack.push("Rafa");
        myStack.push("Miranda");
        myStack.push("Carlinhos");

        //print
        myStack.showBooks();

        System.out.println("Trying pop");

        //pop and/or peek
        Book myBook = myStack.peek();
        // Order myBook2 = myStack.dequeue();
        System.out.println(myBook);
        //print
        System.out.println("New stack");
        myStack.showBooks();
    }
}
