package FactoryDesignPattern;

public class FactoryPatternSupportive {

    public static void call() {
        Notebook notebook = NotebookFactory.getNotebookFactory(NotebookType.Science);
        notebook.writeNotebook();
        System.out.println(notebook.readNotebook());
    }

}
