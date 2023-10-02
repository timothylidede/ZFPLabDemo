package TremolZFP;
    public enum OptionFiscalReceiptPrintType {
        Postponed_printing("2"),
        Step_by_step_printing("0");

        private final String value;
        private OptionFiscalReceiptPrintType(String value) {
            this.value = value;
        }
        public String toString() {
            return value;
        }
    }
