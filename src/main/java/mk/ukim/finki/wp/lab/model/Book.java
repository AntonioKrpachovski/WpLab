package mk.ukim.finki.wp.lab.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

import javax.management.ConstructorParameters;
import java.beans.ConstructorProperties;

@Data
public class Book {
    String title;
    String genre;
    double averageRating;

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public Book(String title, String genre, double averageRating) {
        this.title = title;
        this.genre = genre;
        this.averageRating = averageRating;
    }
}
