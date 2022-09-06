abstract class CreditCard {
    protected String holderName, cardNumber, cardType;
    protected double accountBalance;

    public abstract boolean isCardAcceptable(String cardType);

    public void payBill(double bill) {
        accountBalance -= bill;
    }
}
