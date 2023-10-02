package TremolZFP;
public class SerialAndFiscalNumsRes {
   /**
    *(Serial Number) 20 symbols Manufacturing number 
    *FMNumber (FM Number) 12 symbols for FM individual number
    */
    public String SerialNum;
    public String getSerialNum() {
       return SerialNum;
    }
    protected void setSerialNum(String value) {
       SerialNum = value;
    }

   /**
    *ber (FM Number) 12 symbols for FM individual number
    */
    public String FMNum;
    public String getFMNum() {
       return FMNum;
    }
    protected void setFMNum(String value) {
       FMNum = value;
    }
}
