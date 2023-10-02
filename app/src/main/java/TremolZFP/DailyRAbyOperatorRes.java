package TremolZFP;
public class DailyRAbyOperatorRes {
   /**
    *Symbols from 1 to 20 corresponding to operator's number
    */
    public Double OperNum;
    public Double getOperNum() {
       return OperNum;
    }
    protected void setOperNum(Double value) {
       OperNum = value;
    }

   /**
    *Up to 13 symbols for the RA by type of payment 0
    */
    public Double AmountRA_Payment0;
    public Double getAmountRA_Payment0() {
       return AmountRA_Payment0;
    }
    protected void setAmountRA_Payment0(Double value) {
       AmountRA_Payment0 = value;
    }

   /**
    *Up to 13 symbols for the RA by type of payment 1
    */
    public Double AmountRA_Payment1;
    public Double getAmountRA_Payment1() {
       return AmountRA_Payment1;
    }
    protected void setAmountRA_Payment1(Double value) {
       AmountRA_Payment1 = value;
    }

   /**
    *Up to 13 symbols for the RA by type of payment 2
    */
    public Double AmountRA_Payment2;
    public Double getAmountRA_Payment2() {
       return AmountRA_Payment2;
    }
    protected void setAmountRA_Payment2(Double value) {
       AmountRA_Payment2 = value;
    }

   /**
    *Up to 13 symbols for the RA by type of payment 3
    */
    public Double AmountRA_Payment3;
    public Double getAmountRA_Payment3() {
       return AmountRA_Payment3;
    }
    protected void setAmountRA_Payment3(Double value) {
       AmountRA_Payment3 = value;
    }

   /**
    *Up to 13 symbols for the accumulated amount by payment type 4
    */
    public Double AmountRA_Payment4;
    public Double getAmountRA_Payment4() {
       return AmountRA_Payment4;
    }
    protected void setAmountRA_Payment4(Double value) {
       AmountRA_Payment4 = value;
    }

   /**
    *Up to 13 symbols for the accumulated amount by payment type 5
    */
    public Double AmountRA_Currency;
    public Double getAmountRA_Currency() {
       return AmountRA_Currency;
    }
    protected void setAmountRA_Currency(Double value) {
       AmountRA_Currency = value;
    }

   /**
    *5 symbols for the total number of operations
    */
    public String NumRA;
    public String getNumRA() {
       return NumRA;
    }
    protected void setNumRA(String value) {
       NumRA = value;
    }
}
