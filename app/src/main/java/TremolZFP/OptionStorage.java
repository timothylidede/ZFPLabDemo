package TremolZFP;
    public enum OptionStorage {
        Storage_in_External_SD_card_memory("4"),
        Storage_in_External_USB_Flash_memory("2");

        private final String value;
        private OptionStorage(String value) {
            this.value = value;
        }
        public String toString() {
            return value;
        }
    }
