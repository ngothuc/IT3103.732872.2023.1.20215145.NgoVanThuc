package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media{

	protected int id;
	protected String title;
	protected String category;
	protected float cost;

	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public Media() {

	}

	public Media(String title, String category, float cost) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public Media(String title) {
		this.title = title;
	}

    public boolean isMatch(String title2) {
        return false;
    }

	public boolean equals(Media media) {
		try {
			if (this.title.equals(media.getTitle()) && this.cost == media.getCost()) {
				return true;
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		return false;		
	}

	@Override
	public String toString() {
		return title + " " + (category == null ? "Missing category" : category + " - " + "Cost: " + cost);
	}

	public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

}
