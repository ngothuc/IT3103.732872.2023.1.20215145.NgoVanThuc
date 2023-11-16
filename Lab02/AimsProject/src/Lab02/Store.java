package Lab02;

public class Store {
    public static final int MAX_NUMBERS_IN_STORE = 9999;
    private DigitalVideoDisc itemInStore[] = new DigitalVideoDisc[MAX_NUMBERS_IN_STORE];
    private int qtyInStore = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if(qtyInStore < MAX_NUMBERS_IN_STORE) {
            itemInStore[qtyInStore] = disc;
            qtyInStore++;
            System.out.println("The disc has been added");
        } else {
            System.out.println("Sote is full");
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        for(int i = 0; i < qtyInStore; i++) {
            if(itemInStore[i].equals(disc)) {
                for(int j = i; j < qtyInStore - 1; j++) {
                    itemInStore[j] = itemInStore[j+1];
            }
            qtyInStore--;
            System.out.println("The disc has been removed");
            return;
        }
        }
    System.out.println("Can't find this disc");
    }
}
