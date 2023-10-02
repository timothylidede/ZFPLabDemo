package TremolZFP;
    public enum OptionTraderSystemReportFormat {
        Brief_EJ("s"),
        Detailed_EJ("S");

        private final String value;
        private OptionTraderSystemReportFormat(String value) {
            this.value = value;
        }
        public String toString() {
            return value;
        }
    }
