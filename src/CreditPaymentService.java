public class CreditPaymentService {

    public double calculate(float s, float r, float n) {
        float m = r / 12 / 100; // процентная ставка в месяц
        float payment = (float) (((s * m * Math.pow(1 + m, n))) / (Math.pow(1 + m, n) - 1));
        int total = (int) payment;
        return total;
    }
}
