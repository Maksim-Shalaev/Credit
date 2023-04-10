public class CreditPaymentService {

    public double calculate(float sum, float percent, float period) {
        float month = percent / 12 / 100; // процентная ставка в месяц
        float payment = (float) (((sum * month * Math.pow(1 + month, period))) / (Math.pow(1 + month, period) - 1));
        int total = (int) payment;
        return total;
    }
}
