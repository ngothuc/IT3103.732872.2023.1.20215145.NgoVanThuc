package hust.soict.dsai.aims.media;

public class Track implements Playable{
    private int length;
    private String title;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
    }

    @Override
	public boolean equals(Object o) {
		if(o == this) return true;
		if(!(o instanceof Track)) return false;
		Track track = (Track) o;
		return title.equals(track.title) && length == track.length;		
	}

}

