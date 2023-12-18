package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{
    @Override
    public int compare(Media media1, Media media2) {
        if(Float.compare(media2.getCost(), media1.getCost()) == 0) {
            return media1.getTitle().compareTo(media2.getTitle());
        }
        return Float.compare(media1.getCost(), media2.getCost());
    }

}
