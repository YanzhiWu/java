class ExceptionHandler {
    public static void main(String[] args) {
    }

    public static void handleException(String cardType, String address) {
        try {
            if (cardType.equals("AMEX")) {
                throw new CardTypeException();
            }
            if (!address.contains("US")) {
                throw new AddressException();
            }
        } catch (CardTypeException | AddressException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class CardTypeException extends Exception {
    public CardTypeException() {
        super();
    }
}

class AddressException extends Exception {
    public AddressException() {
        super();
    }
}
