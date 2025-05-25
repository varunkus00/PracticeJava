package AdapterDesignPattern;

public class AdapterPatternClient {

    private PenInterface penInterface;
    public AdapterPatternClient(PenInterface penInterface) {
        this.penInterface = penInterface;
    }

    public void doHomework() {
        penInterface.write();
    }

}
