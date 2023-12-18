package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media>{

    @Override
    public int compare(Media media1, Media media2) {
        if(media1.getTitle().compareTo(media2.getTitle()) == 0) {
            return Float.compare(media2.getCost(), media1.getCost());
        }
        return media1.getTitle().compareTo(media2.getTitle());
    }
}
