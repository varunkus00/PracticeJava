import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.ser"))) {
            Book b = (Book) ois.readObject();
            System.out.println("Deserialize" + b.getTitle() + " Author : " + b.getAuthor() + " Price : " + b.getPrice() + " Code : " + b.getInternalCode());
        } catch(IOException | ClassNotFoundException c) {
            c.printStackTrace();
        }
    }
}
