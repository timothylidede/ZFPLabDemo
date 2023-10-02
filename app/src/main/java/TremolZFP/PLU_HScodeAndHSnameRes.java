package TremolZFP;
public class PLU_HScodeAndHSnameRes {
   /**
    *5 symbols for article number with leading zeroes in format #####
    */
    public Double PLUNum;
    public Double getPLUNum() {
       return PLUNum;
    }
    protected void setPLUNum(Double value) {
       PLUNum = value;
    }

   /**
    *1 symbol for article's VAT class with optional values:" 
    * - 'A' - VAT Class A 
    * - 'B' - VAT Class B 
    * - 'C' - VAT Class C 
    * - 'D' - VAT Class D 
    * - 'E' - VAT Class E
    */
    public OptionVATClass OptionVATClass;
    public OptionVATClass getOptionVATClass() {
       return OptionVATClass;
    }
    protected void setOptionVATClass(OptionVATClass value) {
       OptionVATClass = value;
    }

   /**
    *(HS Code) 10 symbols for HS Code in format XXXX.XX.XX
    */
    public String HSCode;
    public String getHSCode() {
       return HSCode;
    }
    protected void setHSCode(String value) {
       HSCode = value;
    }

   /**
    *(HS Name) 20 symbols for HS Name
    */
    public String HSName;
    public String getHSName() {
       return HSName;
    }
    protected void setHSName(String value) {
       HSName = value;
    }

   /**
    *3 symbols for measure unit
    */
    public String MeasureUnit;
    public String getMeasureUnit() {
       return MeasureUnit;
    }
    protected void setMeasureUnit(String value) {
       MeasureUnit = value;
    }
}
