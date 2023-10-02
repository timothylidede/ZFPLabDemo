package TremolZFP;
    public enum OptionPaymentType {
        Currency("5"),
        Payment_0("0"),
        Payment_1("1"),
        Payment_2("2"),
        Payment_3("3"),
        Payment_4("4");

        private final String value;
        private OptionPaymentType(String value) {
            this.value = value;
        }
        public String toString() {
            return value;
        }
    }
