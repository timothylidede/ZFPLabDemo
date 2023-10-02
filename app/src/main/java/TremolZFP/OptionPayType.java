package TremolZFP;
    public enum OptionPayType {
        Cash("0"),
        Currency("5");

        private final String value;
        private OptionPayType(String value) {
            this.value = value;
        }
        public String toString() {
            return value;
        }
    }
