package mk.ukim.finki.wp.lab.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class BookReservation {
    String bookTitle;
    String readerName;
    String readerAddress;
    int numberOfCopies;

    public String getBookTitle() {
        return bookTitle;
    }

    public String getReaderName() {
        return readerName;
    }

    public String getReaderAddress() {
        return readerAddress;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public BookReservation(String bookTitle, String readerName, String readerAddress, int numberOfCopies) {
        this.bookTitle = bookTitle;
        this.readerName = readerName;
        this.readerAddress = readerAddress;
        this.numberOfCopies = numberOfCopies;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public void setReaderAddress(String readerAddress) {
        this.readerAddress = readerAddress;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }
}
