public class MasterCard extends CreditCard {

    public MasterCard(String holderName, String cardNumber, double accountBalance) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.accountBalance = accountBalance;
        this.cardType = "MasterCard";
    }

    @Override
    public boolean isCardAcceptable(String cardType) {
        return cardType.equals("MasterCard");
    }
}
