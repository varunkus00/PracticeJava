import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerializeDemo{
    public static void main(String[] args){
        Book b = new Book("The Art", "Varun", 5.5, "1234");

        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("book.ser")))){
            oos.writeObject(b);
            System.out.println("Object written to file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
