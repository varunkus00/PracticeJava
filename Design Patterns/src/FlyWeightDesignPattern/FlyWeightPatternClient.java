package FlyWeightDesignPattern;

public class FlyWeightPatternClient {

    public static void call() {
        Notebook notebook = NotebookFlyweightFactory.getNotebook("VSP");
        notebook.displayNotebook("Science", "Cambridge Notebook");
    }

}
