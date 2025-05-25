package PrototypeDesignPattern;

public class Notebook implements NotebookPrototype<Notebook>{

    private String subject;
    private int numberOfPages;
    private String type;
    private int height;
    private int width;
    private String firstPageMessage;
    private String lastPageMessage;

    public Notebook() {}
    Notebook(Notebook notebook) {
        this.subject = notebook.subject;
        this.numberOfPages = notebook.numberOfPages;
        this.type = notebook.type;
        this.height = notebook.height;
        this.width = notebook.width;
        this.firstPageMessage = notebook.firstPageMessage;
        this.lastPageMessage = notebook.lastPageMessage;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setFirstPageMessage(String firstPageMessage) {
        this.firstPageMessage = firstPageMessage;
    }

    public void setLastPageMessage(String lastPageMessage) {
        this.lastPageMessage = lastPageMessage;
    }

    @Override
    public Notebook copy() {
        return new Notebook(this);
    }

    @Override
    public String toString() {
        return " NoteBook : " + subject + " " + numberOfPages + " " + type + " " + height + " " + width + " " + firstPageMessage + " " + lastPageMessage;
    }
}
