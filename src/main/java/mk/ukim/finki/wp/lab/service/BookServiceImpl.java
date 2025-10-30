package mk.ukim.finki.wp.lab.service;

import mk.ukim.finki.wp.lab.bootstrap.DataHolder;
import mk.ukim.finki.wp.lab.model.Book;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Override
    public List<Book> listAll() {
        return DataHolder.books.stream().toList();
    }

    @Override
    public List<Book> searchBooks(String text, Double rating) throws NullPointerException {

        List<Book> knigi=new ArrayList<>();

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