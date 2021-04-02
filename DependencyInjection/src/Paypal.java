public class Paypal implements Zahlungsart {
    @Override
    public void zahlen() {
        System.out.println("Zahle mit Paypal");
    }
}
