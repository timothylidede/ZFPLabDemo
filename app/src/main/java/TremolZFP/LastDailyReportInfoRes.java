package TremolZFP;
import java.util.Date;
public class LastDailyReportInfoRes {
   /**
    *10 symbols for last Z-report date in DD-MM-YYYY format
    */
    public Date LastZDailyReportDate;
    public Date getLastZDailyReportDate() {
       return LastZDailyReportDate;
    }
    protected void setLastZDailyReportDate(Date value) {
       LastZDailyReportDate = value;
    }

   /**
    *Up to 4 symbols for the number of the last daily report in format ####
    */
    public Double LastZDailyReportNum;
    public Double getLastZDailyReportNum() {
       return LastZDailyReportNum;
    }
    protected void setLastZDailyReportNum(Double value) {
       LastZDailyReportNum = value;
    }

   /**
    *Up to 4 symbols for the number of the last RAM reset in format ####
    */
    public Double LastRAMResetNum;
    public Double getLastRAMResetNum() {
       return LastRAMResetNum;
    }
    protected void setLastRAMResetNum(Double value) {
       LastRAMResetNum = value;
    }
}
