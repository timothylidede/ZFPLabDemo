package TremolZFP;
    public enum OptionPINReportFormat {
        Brief_EJ("p"),
        Detailed_EJ("P");

        private final String value;
        private OptionPINReportFormat(String value) {
            this.value = value;
        }
        public String toString() {
            return value;
        }
    }
