package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	
    public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}

	public void addMedia(Media media) {
		if(!itemsInStore.contains(media)) {
			itemsInStore.add(media);
			System.out.println("Media added successfully");
		}else System.out.println("Already has this media");
	}

	public void removeMedia(Media media) {
		if(itemsInStore.contains(media)) {
			itemsInStore.remove(media);
			System.out.println("Media remove successfully");
		}else System.out.println("Can't find media");
	}

	public static void storeMenu() {
        System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
    }

	public Media searchTitle(String title) {
		for(Media media : itemsInStore) {
			if(media.getTitle().equals(title)) return media;
		}
		return null;
	}
}
