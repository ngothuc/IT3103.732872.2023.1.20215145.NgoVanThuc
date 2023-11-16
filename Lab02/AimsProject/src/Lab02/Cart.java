package Lab02;
// Ngo_Van_Thuc_20215145
public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc (DigitalVideoDisc disc) {
		if(qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is alomost full");
			return;
		}
		itemsOrdered[qtyOrdered] = disc;
		qtyOrdered++;
		System.out.println("The disc has been added");
		return;
	}

	public void addDigitalVideoDisc (DigitalVideoDisc[] dvdList) {
		int numberOrdered = dvdList.length;
		if(qtyOrdered + numberOrdered <= MAX_NUMBERS_ORDERED) {
            for(DigitalVideoDisc x : dvdList) {
				itemsOrdered[qtyOrdered] = x;
				qtyOrdered++;
			}
        } else {
			System.out.println("The cart is alomost full");
            return;
		}
		
	}

	// public void addDigitalVideoDisc(DigitalVideoDisc... dvd) {
	// 	if (qtyOrdered + dvd.length <= MAX_NUMBERS_ORDERED) {
	// 		for (DigitalVideoDisc x : dvd) {
	// 			itemsOrdered[qtyOrdered] = x;
	// 			qtyOrdered++;
	// 		}
	// 	} else {
	// 		System.out.println("The cart is almost full");
	// 		return;
	// 	}
	// }

	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {

		if(qtyOrdered + 2 > MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
			return;
		}
		itemsOrdered[qtyOrdered] = dvd1;
		itemsOrdered[qtyOrdered + 1] = dvd2;
		qtyOrdered += 2;
		System.out.println("The disc has been added");
		return;
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i].equals(disc)) {
				for(int j = i; j < qtyOrdered; j++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				System.out.println("The disc has been remove");
				qtyOrdered--;
				return;
			}
		}
		System.out.println("Can't find this disc");
		return;
	}

	public float totalCost() {
        float cost = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            cost += itemsOrdered[i].getCost();
        }
        return cost;
    }

	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items: ");
		for(int i = 0; i < qtyOrdered; i++) {
			System.out.println( (i+1) + "." + itemsOrdered[i].toString() + " : " + itemsOrdered[i].getCost());
		}
		System.out.println("Total Cost: " + totalCost());
		System.out.println("***************************************************");
	}

	public void searchById(int id) {
		for(int i = 0; i <qtyOrdered; i++) {
			if(itemsOrdered[i].getId() == id) {
				System.out.println(itemsOrdered[i].toString());
				return;
			}
		}
		System.out.println("Can't find this disc");
	}

	public void searchByTitle(String title) {
		for(int i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i].isMatch(title)) {
				System.out.println(itemsOrdered[i].toString());
				return;
			}
		}
		System.out.println("No match found with title " + title);
	}

}

