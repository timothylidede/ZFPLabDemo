package TremolZFP;
    public enum OptionDisplay {
        No("0"),
        Yes("1");

        private final String value;
        private OptionDisplay(String value) {
            this.value = value;
        }
        public String toString() {
            return value;
        }
    }
