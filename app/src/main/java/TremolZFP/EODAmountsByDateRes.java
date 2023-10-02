package TremolZFP;
import java.util.Date;
public class EODAmountsByDateRes {
   /**
    *6 symbols for initial date in the DDMMYY format
    */
    public Date EOD_Date;
    public Date getEOD_Date() {
       return EOD_Date;
    }
    protected void setEOD_Date(Date value) {
       EOD_Date = value;
    }

   /**
    *Up to 20 symbols for the EOD sale turnover
    */
    public Double EOD_sale_turnover;
    public Double getEOD_sale_turnover() {
       return EOD_sale_turnover;
    }
    protected void setEOD_sale_turnover(Double value) {
       EOD_sale_turnover = value;
    }

   /**
    *Up to 20 symbols for the EOD credit turnover
    */
    public Double EOD_credit_turnover;
    public Double getEOD_credit_turnover() {
       return EOD_credit_turnover;
    }
    protected void setEOD_credit_turnover(Double value) {
       EOD_credit_turnover = value;
    }

   /**
    *Up to 20 symbols for the EOD VAT from sales
    */
    public Double EOD_saleVAT;
    public Double getEOD_saleVAT() {
       return EOD_saleVAT;
    }
    protected void setEOD_saleVAT(Double value) {
       EOD_saleVAT = value;
    }

   /**
    *Up to 20 symbols for the EOD VAT from credit invoices
    */
    public Double EOD_creditVAT;
    public Double getEOD_creditVAT() {
       return EOD_creditVAT;
    }
    protected void setEOD_creditVAT(Double value) {
       EOD_creditVAT = value;
    }

   /**
    *4 symbols for invoices count
    */
    public String InvoiceCount;
    public String getInvoiceCount() {
       return InvoiceCount;
    }
    protected void setInvoiceCount(String value) {
       InvoiceCount = value;
    }

   /**
    *4 symbols for credit count
    */
    public String CreditCount;
    public String getCreditCount() {
       return CreditCount;
    }
    protected void setCreditCount(String value) {
       CreditCount = value;
    }
}
