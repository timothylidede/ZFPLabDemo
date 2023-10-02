package TremolZFP;
    public enum OptionTransactionType {
        Error_Code("c"),
        Error_Message("m"),
        Exception_Message("e"),
        Response_Code("r"),
        Status("s");

        private final String value;
        private OptionTransactionType(String value) {
            this.value = value;
        }
        public String toString() {
            return value;
        }
    }
