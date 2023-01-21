public class CreditPaymentService {
    public double calculate(double AmountCredit, double percent, double time) {
        double PercentMouth = ((percent / 12) / 100);

        double payment = (AmountCredit * PercentMouth * Math.pow((1 + PercentMouth),time) / ((Math.pow((1 + PercentMouth),time)) - 1));
        return payment;
    }
}
