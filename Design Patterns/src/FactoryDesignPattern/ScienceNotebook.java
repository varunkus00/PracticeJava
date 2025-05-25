package FactoryDesignPattern;

public class ScienceNotebook implements Notebook {

    @Override
    public void writeNotebook() {
        System.out.println("Write Science Notebook");
    }

    @Override
    public String readNotebook() {
        return "Reading Science Notebook";
    }
}
