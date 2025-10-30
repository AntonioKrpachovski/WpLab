package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.bootstrap.DataHolder;
import mk.ukim.finki.wp.lab.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBookRepository implements BookRepository{
    @Override
    public List<Book> findAll() {
        return DataHolder.books;
    }
    @Override
    public List<Book> searchBooks(String text, Double rating) {
        List<Book> knigi=new ArrayList<>();
        if(text==null){
            text="";
        }
        if (rating==null){
            rating=0D;
        }
        for(Book book: DataHolder.books){
            if (book.getTitle().toLowerCase().contains(text.toLowerCase())){
                if (book.getAverageRating()>=rating){
                    knigi.add(book);
                }
            }
        }

        return knigi;
    }
}
