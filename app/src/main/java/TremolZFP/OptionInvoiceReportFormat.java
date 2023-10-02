package TremolZFP;
    public enum OptionInvoiceReportFormat {
        Brief_EJ("n"),
        Detailed_EJ("M");

        private final String value;
        private OptionInvoiceReportFormat(String value) {
            this.value = value;
        }
        public String toString() {
            return value;
        }
    }
