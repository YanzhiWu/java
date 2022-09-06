public class CurrencyExchange {
    public static class USD implements Currency {
        @Override
        public String getCurrency() {
            return "USD";
        }
    }

    public static class CAD implements Currency {
        @Override
        public String getCurrency() {
            return "CAD";
        }
    }

    public Currency getCountryCurrency(String countryName) {
        if (countryName.equals("United States")) {
            return new USD();
        }
        if (countryName.equals("Canada")) {
            return new CAD();
        }
        return null;
    }
}
