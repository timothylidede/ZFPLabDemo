package TremolZFP;
    public enum OptionAuthType {
        CHAP("2"),
        None("0"),
        PAP("1"),
        PAP_or_CHAP("3");

        private final String value;
        private OptionAuthType(String value) {
            this.value = value;
        }
        public String toString() {
            return value;
        }
    }
