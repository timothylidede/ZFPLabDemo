package TremolZFP;
    public enum OptionInvoiceDebitNotePrintType {
        Postponed_Printing("B"),
        Step_by_step_printing("@");

        private final String value;
        private OptionInvoiceDebitNotePrintType(String value) {
            this.value = value;
        }
        public String toString() {
            return value;
        }
    }
