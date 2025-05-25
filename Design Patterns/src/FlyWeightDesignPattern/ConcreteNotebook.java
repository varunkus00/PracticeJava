package FlyWeightDesignPattern;

public class ConcreteNotebook implements Notebook {
    private final NotebookStaticAttributes intrinsicAttributes;

    public ConcreteNotebook(NotebookStaticAttributes intrinsicAttributes) {
        this.intrinsicAttributes = intrinsicAttributes;
    }

    @Override
    public void displayNotebook(String subject, String owner) {
        System.out.println("Notebook for subject: " + subject);
        System.out.println("Owned by: " + owner);
        System.out.println("Height: " + intrinsicAttributes.getHeight());
        System.out.println("Width: " + intrinsicAttributes.getWidth());
        System.out.println("Publication: " + intrinsicAttributes.getPublication());
        System.out.println("--------------------------------");
    }
}
