package mk.ukim.finki.wp.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Author;
import mk.ukim.finki.wp.lab.model.Book;
import mk.ukim.finki.wp.lab.model.BookReservation;
import mk.ukim.finki.wp.lab.model.Gender;
import mk.ukim.finki.wp.lab.repository.AuthorRepository;
import mk.ukim.finki.wp.lab.repository.BookRepository;
import mk.ukim.finki.wp.lab.repository.BookReservationRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class DataHolder {
    public static List<Book> books = new ArrayList<>();
    public static List<BookReservation> reservations = new ArrayList<>();
    public static List<Author> authors = new ArrayList<>();

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final BookReservationRepository bookReservationRepository;

    public DataHolder(AuthorRepository authorRepository, BookRepository bookRepository, BookReservationRepository bookReservationRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.bookReservationRepository = bookReservationRepository;
    }

    @PostConstruct
    public void init(){
        authors = new ArrayList<>(10);
        books = new  ArrayList<>(10);

        Author a1 = new Author("George Raymond Richard", "Martin", "United States of America", "George Raymond Richard Martin also known by the initials G.R.R.M. is an American author, screenwriter, and television producer. He is best known as the author of the series of epic fantasy novels A Song of Ice and Fire", Gender.MALE);
        authors.add(a1);
        books.add(new Book("A Song of Ice and Fire", "Fantasy", 9.9, a1));
        Author a2 = new Author("Joanne", "Rowling", "United Kingdoms", "Joanne Rowling , better known by her pen name J. K. Rowling, is the British novelist who wrote Harry Potter, a seven-volume series about a young wizard.", Gender.FEMALE);
        authors.add(a2);
        books.add(new Book("Harry Potter", "Fiction", 7.5, a2));
        Author a3 = new Author("AuthorName1", "AuthorSurname1", "AuthorCountry1", "AuthorBiography1", Gender.MALE);
        authors.add(a3);
        books.add(new Book("ne znam drugi knigi", "idk", 4.4, a3));
        books.add(new Book("uste edna za da testiram isti author", "idk", 4.4, a3));
        reservations = new  ArrayList<>();
        authorRepository.saveAll(authors);
        bookRepository.saveAll(books);
    }

}
