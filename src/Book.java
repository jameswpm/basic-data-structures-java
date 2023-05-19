public class Book {
    private String name;

    private Book next;

    public Book(String name) {
        this.name = name;
        this.next = null;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getNext() {
        return this.next;
    }

    public void setNext(Book next) {
        this.next = next;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            "}";
    }
}