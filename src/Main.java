public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService(); // создание объекта с переменной service для вычислений ежемесячного платежа
//        float s; // сумма кредита, рубли
//        float n; // срок кредита, мес
//        float r = (float) 9.99; // годовой процент
//        float payment = (float) service.calculate(1_000_000, (float) 9.99, 12);
//        int total = (int) payment;
//        System.out.println("Ежемесячный платеж составит: " + total + " рублей");
        float pp = (float) service.calculate(5_000_000, (float) 14.99, 72); // этот вариант для себя попробовал, чтобы закрепить
        System.out.println();
        System.out.println("При сроке кредита 72 мес, ежемесячный платеж составит: ");
        System.out.println(pp);

        System.out.println();
        System.out.println("При сроке кредита 12 мес, ежемесячный платеж составит: ");
        System.out.println(service.calculate(1_000_000, (float) 9.99, 12));

        System.out.println();
        System.out.println("При сроке кредита 24 мес, ежемесячный платеж составит: ");
        System.out.println(service.calculate(1_000_000, (float) 9.99, 24));

        System.out.println();
        System.out.println("При сроке кредита 36 мес, ежемесячный платеж составит: ");
        System.out.println(service.calculate(1_000_000, (float) 9.99, 36));
    }
}
