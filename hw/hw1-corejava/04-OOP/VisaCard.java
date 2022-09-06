public class VisaCard extends CreditCard {

    public VisaCard(String holderName, String cardNumber, double accountBalance) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.accountBalance = accountBalance;
        this.cardType = "VisaCard";
    }

    @Override
    public boolean isCardAcceptable(String cardType) {
        return cardType.equals("VisaCard");
    }
}
