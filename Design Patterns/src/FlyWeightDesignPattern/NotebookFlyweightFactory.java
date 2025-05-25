package FlyWeightDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class NotebookFlyweightFactory {
    private static Map<String, Notebook> notebooks = new HashMap<>();

    public static Notebook getNotebook(String notebookSubject) {
        if( notebooks.get(notebookSubject) != null ) {
            return notebooks.get(notebookSubject);
        } else {
            notebooks.put(notebookSubject, new ConcreteNotebook(new NotebookStaticAttributes()));
        }
        return notebooks.get(notebookSubject);
    }

}
