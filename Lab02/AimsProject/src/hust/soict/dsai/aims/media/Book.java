package hust.soict.dsai.aims.media;

import java.util.Arrays;
import java.util.List;

public class Book extends Media {

    private List<String> authors;

    public Book() {
    }

    public void addAuthor(String author) {
        if (!this.authors.contains(author)) {
            this.authors.add(author);
        }
    }

    public void removeAuthor(String author) {
        if (this.authors.contains(author)) {
            this.authors.remove(author);
        }
    }

    @Override
    public String toString() {
        return "Book - " + super.toString() + " Author: " + authors;
    }

}
