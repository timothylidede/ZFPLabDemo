package TremolZFP;
public class ParametersRes {
   /**
    *(POS Number) 4 symbols for number of POS in format ####
    */
    public Double POSNum;
    public Double getPOSNum() {
       return POSNum;
    }
    protected void setPOSNum(Double value) {
       POSNum = value;
    }

   /**
    *(Print Logo) 1 symbol of value: 
    * - '1' - Yes 
    * - '0' - No
    */
    public OptionPrintLogo OptionPrintLogo;
    public OptionPrintLogo getOptionPrintLogo() {
       return OptionPrintLogo;
    }
    protected void setOptionPrintLogo(OptionPrintLogo value) {
       OptionPrintLogo = value;
    }

   /**
    *(Auto Open Drawer) 1 symbol of value: 
    * - '1' - Yes 
    * - '0' - No
    */
    public OptionAutoOpenDrawer OptionAutoOpenDrawer;
    public OptionAutoOpenDrawer getOptionAutoOpenDrawer() {
       return OptionAutoOpenDrawer;
    }
    protected void setOptionAutoOpenDrawer(OptionAutoOpenDrawer value) {
       OptionAutoOpenDrawer = value;
    }

   /**
    *(Ext. Display Management) 1 symbol of value: 
    * - '1' - Manual 
    * - '0' - Auto
    */
    public OptionExternalDispManagement OptionExternalDispManagement;
    public OptionExternalDispManagement getOptionExternalDispManagement() {
       return OptionExternalDispManagement;
    }
    protected void setOptionExternalDispManagement(OptionExternalDispManagement value) {
       OptionExternalDispManagement = value;
    }

   /**
    *(Enable Currency) 1 symbol of value: 
    * - '1' - Yes 
    * - '0' - No
    */
    public OptionEnableCurrency OptionEnableCurrency;
    public OptionEnableCurrency getOptionEnableCurrency() {
       return OptionEnableCurrency;
    }
    protected void setOptionEnableCurrency(OptionEnableCurrency value) {
       OptionEnableCurrency = value;
    }
}
