package TremolZFP;
public class CustomerDataRes {
   /**
    *3 symbols for customer number in order in format ###
    */
    public Double CustomerNum;
    public Double getCustomerNum() {
       return CustomerNum;
    }
    protected void setCustomerNum(Double value) {
       CustomerNum = value;
    }

   /**
    *14 symbols for customer PIN number
    */
    public String PinNumber;
    public String getPinNumber() {
       return PinNumber;
    }
    protected void setPinNumber(String value) {
       PinNumber = value;
    }

   /**
    *(Company name) 30 symbols for customer name
    */
    public String CustomerCompanyName;
    public String getCustomerCompanyName() {
       return CustomerCompanyName;
    }
    protected void setCustomerCompanyName(String value) {
       CustomerCompanyName = value;
    }

   /**
    *30 symbols for headquarters
    */
    public String HeadQuarters;
    public String getHeadQuarters() {
       return HeadQuarters;
    }
    protected void setHeadQuarters(String value) {
       HeadQuarters = value;
    }

   /**
    *30 symbols for customer's address
    */
    public String Address;
    public String getAddress() {
       return Address;
    }
    protected void setAddress(String value) {
       Address = value;
    }

   /**
    *30 symbols for customer's city
    */
    public String City;
    public String getCity() {
       return City;
    }
    protected void setCity(String value) {
       City = value;
    }

   /**
    *30 symbols for customer's exemption number
    */
    public String ExemptionNum;
    public String getExemptionNum() {
       return ExemptionNum;
    }
    protected void setExemptionNum(String value) {
       ExemptionNum = value;
    }

   /**
    *Up to 11 symbols for accumulated turnover of the customer
    */
    public Double CustTurnover;
    public Double getCustTurnover() {
       return CustTurnover;
    }
    protected void setCustTurnover(Double value) {
       CustTurnover = value;
    }

   /**
    *Up to 11 symbols for customer refund turnover
    */
    public Double CustomerRefundTurnover;
    public Double getCustomerRefundTurnover() {
       return CustomerRefundTurnover;
    }
    protected void setCustomerRefundTurnover(Double value) {
       CustomerRefundTurnover = value;
    }
}
