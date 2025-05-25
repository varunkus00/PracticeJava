package FactoryDesignPattern;

public class NotebookFactory {
    /*private NotebookType notebookType;

    public NotebookFactory(NotebookType notebookType) {
        this.notebookType = notebookType;
    }*/

    public static Notebook getNotebookFactory(NotebookType notebookType) {
        if( NotebookType.UPSC == notebookType ) {
            return new UPSCNotebook();
        } else if(NotebookType.Science == notebookType ) {
            return new ScienceNotebook();
        }
        throw new IllegalArgumentException("Invalid NotebookType");
    }

}
