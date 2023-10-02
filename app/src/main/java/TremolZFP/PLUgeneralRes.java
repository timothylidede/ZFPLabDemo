package TremolZFP;
import java.util.Date;
public class PLUgeneralRes {
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
    *34 symbols for article name
    */
    public String PLUName;
    public String getPLUName() {
       return PLUName;
    }
    protected void setPLUName(String value) {
       PLUName = value;
    }

   /**
    *Up to 10 symbols for article's price
    */
    public Double Price;
    public Double getPrice() {
       return Price;
    }
    protected void setPrice(Double value) {
       Price = value;
    }

   /**
    *1 symbol for Price flag with next value: 
    * - '0'- Free price is disable valid only programmed price 
    * - '1'- Free price is enable 
    * - '2'- Limited price
    */
    public OptionPrice OptionPrice;
    public OptionPrice getOptionPrice() {
       return OptionPrice;
    }
    protected void setOptionPrice(OptionPrice value) {
       OptionPrice = value;
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

   /**
    *1 symbol for article's VAT class with optional values: 
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
    *(Department Number) BelongToDepNum + 80h, 1 symbol for 
    *article department attachment, formed in the following manner:
    */
    public int BelongToDepNum;
    public int getBelongToDepNum() {
       return BelongToDepNum;
    }
    protected void setBelongToDepNum(int value) {
       BelongToDepNum = value;
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
    *1 symbol with value: 
    * - '0' - Inactive, default value 
    * - '1' - Active Single transaction in receipt
    */
    public OptionSingleTransaction OptionSingleTransaction;
    public OptionSingleTransaction getOptionSingleTransaction() {
       return OptionSingleTransaction;
    }
    protected void setOptionSingleTransaction(OptionSingleTransaction value) {
       OptionSingleTransaction = value;
    }

   /**
    *13 symbols for barcode
    */
    public String Barcode;
    public String getBarcode() {
       return Barcode;
    }
    protected void setBarcode(String value) {
       Barcode = value;
    }

   /**
    *(Available Quantity) Up to 11 symbols for quantity in stock
    */
    public Double AvailableQuantity;
    public Double getAvailableQuantity() {
       return AvailableQuantity;
    }
    protected void setAvailableQuantity(Double value) {
       AvailableQuantity = value;
    }

   /**
    *1 symbol for Quantity flag with next value:  
    * - '0'- Availability of PLU stock is not monitored  
    * - '1'- Disable negative quantity  
    * - '2'- Enable negative quantity
    */
    public OptionQuantityType OptionQuantityType;
    public OptionQuantityType getOptionQuantityType() {
       return OptionQuantityType;
    }
    protected void setOptionQuantityType(OptionQuantityType value) {
       OptionQuantityType = value;
    }

   /**
    *Up to 11 symbols for PLU accumulated turnover
    */
    public Double TurnoverAmount;
    public Double getTurnoverAmount() {
       return TurnoverAmount;
    }
    protected void setTurnoverAmount(Double value) {
       TurnoverAmount = value;
    }

   /**
    *Up to 11 symbols for Sales quantity of the article
    */
    public Double SoldQuantity;
    public Double getSoldQuantity() {
       return SoldQuantity;
    }
    protected void setSoldQuantity(Double value) {
       SoldQuantity = value;
    }

   /**
    *Up to 11 symbols for Refund turnover amount
    */
    public Double RefundTurnoverAmount;
    public Double getRefundTurnoverAmount() {
       return RefundTurnoverAmount;
    }
    protected void setRefundTurnoverAmount(Double value) {
       RefundTurnoverAmount = value;
    }

   /**
    *Up to 11 symbols for Refund turnover quantity
    */
    public Double RefundTurnoverQuantity;
    public Double getRefundTurnoverQuantity() {
       return RefundTurnoverQuantity;
    }
    protected void setRefundTurnoverQuantity(Double value) {
       RefundTurnoverQuantity = value;
    }

   /**
    *5 symbols for the number of the last in format #####  
    *article report with zeroing
    */
    public Double LastZReportNumber;
    public Double getLastZReportNumber() {
       return LastZReportNumber;
    }
    protected void setLastZReportNumber(Double value) {
       LastZReportNumber = value;
    }

   /**
    *16 symbols for the date and time of the last article report with zeroing
    */
    public Date LastZReportDate;
    public Date getLastZReportDate() {
       return LastZReportDate;
    }
    protected void setLastZReportDate(Date value) {
       LastZReportDate = value;
    }
}
