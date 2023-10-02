package TremolZFP;
public class FooterRes {
   /**
    *1 symbol for the footer line number
    */
    public String FooterNum;
    public String getFooterNum() {
       return FooterNum;
    }
    protected void setFooterNum(String value) {
       FooterNum = value;
    }

   /**
    *TextLength symbols for footer line
    */
    public String FooterText;
    public String getFooterText() {
       return FooterText;
    }
    protected void setFooterText(String value) {
       FooterText = value;
    }
}
