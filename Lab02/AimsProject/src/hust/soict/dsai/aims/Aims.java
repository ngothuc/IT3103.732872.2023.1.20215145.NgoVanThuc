package hust.soict.dsai.aims;

import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;

// Ngo_Van_Thuc_20215145
public class Aims {
    private static Cart cart = new Cart();
    private static Store store = new Store();
    public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while(true) {
            showMenu();
            int chosse = scanner.nextInt();
            switch(chosse) {
                case 1:
                    viewStore();
                    break;
                case 2:
                    System.out.println("Now you can add or remove a media in store");
                    break;
                case 3:
                    cart.printCart();
                    break;
                case 0:
                    return;
            }
        }

	}

    public static void viewStore() {
        store.storeMenu();
        String title;
        int choose = scanner.nextInt();
        switch(choose) {
            case 1:
                title = scanner.nextLine();
                System.out.println("Media: " + store.searchTitle(title).toString());
                break;
            case 2:
                title = scanner.nextLine();
                cart.addMedia(store.searchTitle(title));
                System.out.println("Add media to cart successfully");
                break;
            case 3:
                title = scanner.nextLine();
                Media media = store.searchTitle(title);
                playMedia(media);
                break;
            case 4:
                cart.printCart();
                break;
            case 0:
                return;
        }
    }

    public static void playMedia(Media media) {
        if(media instanceof DigitalVideoDisc) {
            DigitalVideoDisc dvd = (DigitalVideoDisc) media;
            dvd.play(); 
        }else if(media instanceof CompactDisc) {
            ((CompactDisc)media).play();
        }else System.out.println("Can't play media");
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
        System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");

    }

}
