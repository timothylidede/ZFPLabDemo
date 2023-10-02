package TremolZFP;
    public enum OptionVATClass1 {
        VAT_Class_A("A");

        private final String value;
        private OptionVATClass1(String value) {
            this.value = value;
        }
        public String toString() {
            return value;
        }
    }
