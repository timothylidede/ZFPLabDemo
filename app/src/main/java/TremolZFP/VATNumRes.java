package TremolZFP;
public class VATNumRes {
   /**
    *(VAT Number) 15 symbols VAT registration number
    */
    public String VATNum;
    public String getVATNum() {
       return VATNum;
    }
    protected void setVATNum(String value) {
       VATNum = value;
    }

   /**
    *(FM Number) 12 symbols Fiscal Memory serial number
    */
    public String FMNum;
    public String getFMNum() {
       return FMNum;
    }
    protected void setFMNum(String value) {
       FMNum = value;
    }

   /**
    *(PIN) 14 symbols: 2 letters, 8 digits, 1 symbol and 3 spaces
    */
    public String PIN;
    public String getPIN() {
       return PIN;
    }
    protected void setPIN(String value) {
       PIN = value;
    }
}
