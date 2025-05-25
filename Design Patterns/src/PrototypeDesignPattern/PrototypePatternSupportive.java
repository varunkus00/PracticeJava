package PrototypeDesignPattern;

public class PrototypePatternSupportive {
    public static void call() {
        Notebook notebook = new Notebook();
        notebook.setSubject("English");
        notebook.setNumberOfPages(200);
        notebook.setType("Typed Notes");
        notebook.setHeight(10);
        notebook.setWidth(10);
        notebook.setFirstPageMessage("This is First Page");
        notebook.setLastPageMessage("This is Last Page");

        UPSCNotebook GS1 = new UPSCNotebook("GS1", notebook);
        UPSCNotebook currentAffairs = new UPSCNotebook("CURRENT AFFAIRS", notebook);;

        NotebookRegistry.setNotebookRegistry(NotebookType.GS1, GS1);
        NotebookRegistry.setNotebookRegistry(NotebookType.CURRENT_AFFAIRS, currentAffairs);

        UPSCNotebook GS2 = (UPSCNotebook)NotebookRegistry.getNotebookPrototype(NotebookType.GS1) ;
        UPSCNotebook currentAffairs2 = (UPSCNotebook)NotebookRegistry.getNotebookPrototype(NotebookType.CURRENT_AFFAIRS);
        GS2.setName("GS2 cloned from GS1");
        currentAffairs2.setName("currentAffairs2 cloned from currentAffairs");

        System.out.println(GS2.toString());
        System.out.println(currentAffairs2.toString());
    }
}
