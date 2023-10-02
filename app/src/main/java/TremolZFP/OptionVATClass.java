package TremolZFP;
    public enum OptionVATClass {
        VAT_Class_A("A"),
        VAT_Class_B("B"),
        VAT_Class_C("C"),
        VAT_Class_D("D"),
        VAT_Class_E("E");

        private final String value;
        private OptionVATClass(String value) {
            this.value = value;
        }
        public String toString() {
            return value;
        }
    }
