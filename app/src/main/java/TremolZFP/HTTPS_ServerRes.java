package TremolZFP;
public class HTTPS_ServerRes {
   /**
    *(Length) Up to 3 symbols for the HTTTPS server address length
    */
    public Double AddrLen;
    public Double getAddrLen() {
       return AddrLen;
    }
    protected void setAddrLen(Double value) {
       AddrLen = value;
    }

   /**
    *Up to 50 symbols for the HTTPS address
    */
    public String Address;
    public String getAddress() {
       return Address;
    }
    protected void setAddress(String value) {
       Address = value;
    }
}
