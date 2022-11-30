package ute.application.bkt3.DAO;

public class BookDAO {
    private int bookImage;
    private String bookName;
    private String bookDes;

    public BookDAO(int bookImage, String bookName, String bookDes) {
        this.bookImage = bookImage;
        this.bookName = bookName;
        this.bookDes = bookDes;
    }

    public int getBookImage() {
        return bookImage;
    }

    public void setBookImage(int bookImage) {
        this.bookImage = bookImage;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDes() {
        return bookDes;
    }

    public void setBookDes(String bookDes) {
        this.bookDes = bookDes;
    }
}
