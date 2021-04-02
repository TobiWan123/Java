public class Main {
    public static void main(String[] args){
        // Dependency Injection - Zahlungsart -> Paypal
        Zahlung zahlungPaypal = new Zahlung(new Paypal());
        zahlungPaypal.bezahlen();

        // Dependency Injection - Zahlungsart -> EC
        Zahlung zahlungEC = new Zahlung(new EC());
        zahlungEC.bezahlen();
    }
}
