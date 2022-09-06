public class VisaCard implements CreditCard {
    public VisaCard() {
    }

    @Override
    public boolean isCardAcceptable(String cardType) {
        return cardType.equals("VisaCard");
    }
}
