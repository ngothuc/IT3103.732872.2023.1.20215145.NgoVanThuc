package hust.soict.dsai.aims.media;

import java.util.List;

public class Book extends Media {

    private List<String> authors;

    public Book() {
        super();
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);
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
