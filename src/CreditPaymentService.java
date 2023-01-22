public class CreditPaymentService {
    public double calculate(double AmountCredit, double percent, double time) {
        double PercentMouth = ((percent / 12) / 100);

        return (AmountCredit * PercentMouth * Math.pow((1 + PercentMouth), time) / ((Math.pow((1 + PercentMouth), time)) - 1));
    }
}
