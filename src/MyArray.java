import java.util.ArrayList;

public class MyArray {

    public class WishList {
        ArrayList<String> items;
        ArrayList<Integer> quantity;

        public WishList() {
            items = new ArrayList<String>();
            quantity = new ArrayList<Integer>();
        }

        public void addItem(String item, Integer numberOfItens) {
            items.add(item);
            quantity.add(numberOfItens);
        }

        public void removeItem(String item) {
            int indexOfItem = items.indexOf(item);
            items.remove(indexOfItem);
            quantity.remove(indexOfItem);           
        }

        public void listItens() {
            int i;
            int size = items.size();
            for(i = 0; i <= size - 1; i++) {
                MyArray.this.show("My item " + i + " is: " + items.get(i) + " with " + quantity.get(i) + " units");
            }
        }
    }

    public void show(String print) {
        System.out.println(print);
        System.out.flush();
    }


    public static void main(String[] args) throws Exception {
        MyArray myArray = new MyArray();
        WishList myList = myArray.new WishList();

        myList.addItem("Orange", 1);
        myList.addItem("Apple", 4);
        myList.addItem("Pinapple", 1);
        myList.addItem("Cat", 3);


        myList.listItens();

        myList.removeItem("Cat");

        myList.listItens();
    }
}

