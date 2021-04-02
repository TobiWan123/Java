public class Zahlung {
    // Dependency Zahlungsart
    private Zahlungsart z;

    // Inject Dependecy Zahlungsart via Konstruktor
    public Zahlung(Zahlungsart z) {
        this.z = z;
    }

    public void bezahlen(){
        z.zahlen();
    }
}
