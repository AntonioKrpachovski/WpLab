package mk.ukim.finki.wp.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Book;
import mk.ukim.finki.wp.lab.model.BookReservation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class DataHolder {
    public static List<Book> books = new ArrayList<>();
    public static List<BookReservation> reservations = new ArrayList<>();

    @PostConstruct
    public void init(){
        books = new  ArrayList<>(10);
        books.add(new Book("A Song of Ice and Fire", "Fantasy", 9.9));
        books.add(new Book("Harry Potter", "Fiction", 7.5));
        books.add(new Book("ne znam drugi knigi", "idk", 4.4));
        books.add(new Book("uste edna za da testiram isti genre", "idk", 4.4));
        reservations = new  ArrayList<>();
    }

}
