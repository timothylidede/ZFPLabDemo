package TremolZFP;
    public enum OptionReportFormat {
        Brief_EJ("t"),
        Detailed_EJ("T");

        private final String value;
        private OptionReportFormat(String value) {
            this.value = value;
        }
        public String toString() {
            return value;
        }
    }
