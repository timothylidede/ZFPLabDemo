package TremolZFP;
public class InvoiceRangeRes {
   /**
    *15 symbols for start No with leading zeroes in format ###############
    */
    public Double StartNum;
    public Double getStartNum() {
       return StartNum;
    }
    protected void setStartNum(Double value) {
       StartNum = value;
    }

   /**
    *15 symbols for end No with leading zeroes in format ###############
    */
    public Double EndNum;
    public Double getEndNum() {
       return EndNum;
    }
    protected void setEndNum(Double value) {
       EndNum = value;
    }
}
