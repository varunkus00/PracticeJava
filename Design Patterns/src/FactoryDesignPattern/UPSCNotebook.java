package FactoryDesignPattern;

public class UPSCNotebook implements Notebook {

    @Override
    public void writeNotebook() {
        System.out.println("Write UPSCNotebook Notebook");
    }

    @Override
    public String readNotebook() {
        return "Reading UPSCNotebook Notebook";
    }

}
