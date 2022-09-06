public interface CreditCard {
    String holderName = null, cardNumber = null, cardType = null;
    double accountBalance = 0;

    boolean isCardAcceptable(String cardType);

    default void payBill(double bill) {
        System.out.println("payBill()");
    }

    static void refund(double amount) {
        System.out.println("refund()");
    }
}
