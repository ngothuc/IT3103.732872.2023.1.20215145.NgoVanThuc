package hust.soict.dsai.aims.media;

public class Disc extends Media{
    protected int length;
    protected String director;

    public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Disc: - " + super.toString() + " - Director: " + director + " - Length: " + length;
	}
}
