import java.io.Serializable;

public class Book implements Serializable {

    private static final long serialVersionUID = 1L;
    private String title;
    private String author;
    private double price;
    private transient String internalCode;

    Book(String title, String author, double price, String internalCode) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.internalCode = internalCode;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getInternalCode() {
        return internalCode;
    }
}
