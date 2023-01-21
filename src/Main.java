public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment = service.calculate(1_000_000,9.99,36);
        int Amount = (int)payment;
        System.out.println("Ежемесячный платеж = " + Amount);
    }
}