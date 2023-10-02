package TremolZFP;
public class PaymentsRes {
   /**
    *(Payment 0) 10 symbols for type 0 of payment name
    */
    public String NamePayment0;
    public String getNamePayment0() {
       return NamePayment0;
    }
    protected void setNamePayment0(String value) {
       NamePayment0 = value;
    }

   /**
    *(Payment 1) 10 symbols for type 1 of payment name
    */
    public String NamePayment1;
    public String getNamePayment1() {
       return NamePayment1;
    }
    protected void setNamePayment1(String value) {
       NamePayment1 = value;
    }

   /**
    *(Payment 2) 10 symbols for type 2 of payment name
    */
    public String NamePayment2;
    public String getNamePayment2() {
       return NamePayment2;
    }
    protected void setNamePayment2(String value) {
       NamePayment2 = value;
    }

   /**
    *(Payment 3) 10 symbols for type 3 of payment name
    */
    public String NamePayment3;
    public String getNamePayment3() {
       return NamePayment3;
    }
    protected void setNamePayment3(String value) {
       NamePayment3 = value;
    }

   /**
    *(Payment 4) 10 symbols for type 4 of payment name
    */
    public String NamePayment4;
    public String getNamePayment4() {
       return NamePayment4;
    }
    protected void setNamePayment4(String value) {
       NamePayment4 = value;
    }

   /**
    *(Currency name) 10 symbols for type 5 of currency payment name
    */
    public String CurrencyName;
    public String getCurrencyName() {
       return CurrencyName;
    }
    protected void setCurrencyName(String value) {
       CurrencyName = value;
    }

   /**
    *10 symbols for exchange rate of payment type 5 in format: ####.#####
    */
    public Double ExchangeRate;
    public Double getExchangeRate() {
       return ExchangeRate;
    }
    protected void setExchangeRate(Double value) {
       ExchangeRate = value;
    }
}
