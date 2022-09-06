public class MasterCard implements CreditCard {
    public MasterCard() {
    }

    @Override
    public boolean isCardAcceptable(String cardType) {
        return cardType.equals("MasterCard");
    }
}
