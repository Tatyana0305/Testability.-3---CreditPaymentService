public class CreditPaymentService {
    public double calculate(int creditAmount, int creditTerm, double percent) {


        double rate = percent / 12 / 100;
        double value1 = 1 + rate;
        double a2 = value1;
        double b2 = creditTerm;
        double value3 = Math.pow(a2, b2);
        double value2 = value3 - 1;
        double coefficient = rate * value3 / value2;
        double payment = creditAmount * coefficient;
        return payment;

    }
    }
