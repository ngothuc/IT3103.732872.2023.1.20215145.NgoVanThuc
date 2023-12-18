package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.Collections;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
// Ngo_Van_Thuc_20215145
public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

	public void addMedia(Media media) {
		if(!itemsOrdered.contains(media)) {
			itemsOrdered.add(media);
			System.out.println("Media added successfully");
		}else System.out.println("Already has this media");
	}

	public void removeMedia(Media media) {
		if(itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
			System.out.println("Media remove successfully");
		}else System.out.println("Can't find media");
	}
	
	public float totalCost() {
        float cost = 0;
        for (Media media : itemsOrdered) {
            cost += media.getCost();
        }
        return cost;
    }

	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items: ");
		for(Media media : itemsOrdered) {
			System.out.println( media.toString() + " : " + media.getCost());
		}
		System.out.println("Total Cost: " + totalCost());
		System.out.println("***************************************************");
	}

	public void searchById(int id) {
		for(Media media : itemsOrdered) {
			if(media.getId() == id) {
				System.out.println(media.toString());
				return;
			}
		}
		System.out.println("Can't find this disc");
	}

	public void searchByTitle(String title) {
		for(Media media : itemsOrdered) {
			if(media.isMatch(title)) {
				System.out.println(media.toString());
				return;
			}
		}
		System.out.println("No match found with title " + title);
	}

	public void printCart() {
		for(Media media : itemsOrdered) {
			System.out.println(media.toString());
		}
	}

	public void sortByTitle() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
		print();
	}

	public void sortByCost() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
		printCart();
	}

	public static void cartMenu() {
        System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");

    }

}

