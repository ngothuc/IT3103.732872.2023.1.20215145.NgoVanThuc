package hust.soict.dsai.aims.media;
// Ngo_Van_Thuc_20215145
public class DigitalVideoDisc extends Media implements Playable{	
	private String director;
	private int length;
	private static int nbDigitalVideoDisc = 0;
	public int getId() {
		return id;
	}

	public void setTitle(String title) {
		this.title = title;
	}
		
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}

	public DigitalVideoDisc(String title) {
        super(title);
    }

	public DigitalVideoDisc() {
		super();
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super(category, category, cost);
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = ++nbDigitalVideoDisc;
	}
	public DigitalVideoDisc(String title, float cost) {
		super(title, title, cost);
		this.title = title;
		this.id = ++nbDigitalVideoDisc;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(director, director, cost);
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.id = ++nbDigitalVideoDisc;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(director, director, cost);
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.id = ++nbDigitalVideoDisc;
	}
	// @Override
	// public String toString() {
	// 	return "DVD - " + title 
	// 	+ " - " + (category == null ? "Mising category" : category)
	// 	+ " - " + (director == null ? "Missing directory" : director) 
	// 	+ " - " + (length <= 0 ? "Missing length" : length);
	// }

	@Override
    public String toString() {
        return "DVD - " + super.toString();
    }


	public boolean isMatch(String title) {

		return this.title.toLowerCase().contains(title.toLowerCase());
	
	}

	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
}
