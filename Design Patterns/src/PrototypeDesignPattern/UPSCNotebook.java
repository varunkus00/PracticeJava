package PrototypeDesignPattern;

public class UPSCNotebook implements NotebookPrototype<UPSCNotebook>{

    private String name;
    private Notebook notebook;

    public UPSCNotebook(String n, Notebook nb){
        name = n;
        notebook = nb;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public UPSCNotebook copy() {
        return new UPSCNotebook(this.name, notebook.copy());
    }

    @Override
    public String toString() {
        return " UPSCNotebook [name=" + name + ", notebook=" + notebook + "]";
    }

}
