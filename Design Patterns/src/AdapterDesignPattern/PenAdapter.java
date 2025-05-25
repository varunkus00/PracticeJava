package AdapterDesignPattern;

public class PenAdapter implements PenInterface{
    private PenAdaptee penAdaptee = new PenAdaptee();
    private String color;

    public PenAdapter(String color) {
        this.color = color;
    }
    @Override
    public void write() {
        penAdaptee.PilotPen();
    }

    @Override
    public String getColor() {
        return color;
    }
}
