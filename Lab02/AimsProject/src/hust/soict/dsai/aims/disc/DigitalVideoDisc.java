package hust.soict.dsai.aims.disc;
// Ngo_Van_Thuc_20215145
public class DigitalVideoDisc {	
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;

	private static int nbDigitalVideoDisc = 0;
	private int id;

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
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = ++nbDigitalVideoDisc;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		this.id = ++nbDigitalVideoDisc;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.id = ++nbDigitalVideoDisc;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.id = ++nbDigitalVideoDisc;
	}
	@Override
	public String toString() {
		return "DVD - " + title 
		+ " - " + (category == null ? "Mising category" : category)
		+ " - " + (director == null ? "Missing directory" : director) 
		+ " - " + (length <= 0 ? "Missing length" : length);
	}

	public boolean isMatch(String title) {

		return this.title.toLowerCase().contains(title.toLowerCase());
	
	}
	
}
