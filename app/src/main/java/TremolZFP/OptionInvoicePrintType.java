package TremolZFP;
    public enum OptionInvoicePrintType {
        Postponed_Printing("3"),
        Step_by_step_printing("1");

        private final String value;
        private OptionInvoicePrintType(String value) {
            this.value = value;
        }
        public String toString() {
            return value;
        }
    }
