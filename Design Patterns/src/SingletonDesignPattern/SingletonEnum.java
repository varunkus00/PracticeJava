package SingletonDesignPattern;

public enum SingletonEnum {
    INSTANCE;

    private SingletonEnum singletonEnum;
    private SingletonEnum() {
        singletonEnum = this;
    }

    public SingletonEnum getSingletonEnum() {
        return singletonEnum;
    }
}
