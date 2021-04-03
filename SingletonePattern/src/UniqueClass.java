public class UniqueClass {
    private final static UniqueClass instance = new UniqueClass();
    double testValue = Math.random()*1000;

    private UniqueClass(){}

    public static UniqueClass getInstance(){
        return instance;
    }
}
