public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment12 = service.calculate(1_000_000, 12, 9.99);
        double payment24 = service.calculate(1_000_000, 24, 9.99);
        double payment36 = service.calculate(1_000_000, 36, 9.99);

        System.out.println("Ежемесячный платеж на 12 месяцев: " + payment12);
        System.out.println("Ежемесячный платеж на 24 месяцев: " + payment24);
        System.out.println("Ежемесячный платеж на 36 месяцев: " + payment36);

    }
}