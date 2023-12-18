package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	private String artist;
    private ArrayList<Track> tracks;

    public String getArtist() {
		return artist;
	}

    public void addTrack(Track track) {
        if(!this.tracks.contains(track)) {
            this.tracks.add(track);
            System.out.println("Added track " + track.getTitle());
        }else System.out.println("Track " + track.getTitle() +" is existed");
    }

    public void removeTrack(Track track) {
        if(this.tracks.contains(track)) {
            this.tracks.remove(track);
            System.out.println("Removed track " + track.getTitle());
        }else System.out.println("Can't find track " + track.getTitle());
    }

    public int getLength() {
        int length = 0;
        for(Track track : this.tracks) {
            length += track.getLength();
        }
        return length;
    }

    @Override
    public void play() {
        for(Track track : this.tracks) {
            track.play();
        }
    }
    
}
