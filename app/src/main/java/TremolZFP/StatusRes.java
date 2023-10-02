package TremolZFP;
import java.util.Date;
public class StatusRes {
   /**
    *FM Read only
    */
    public boolean FM_Read_only;
    public boolean getFM_Read_only() {
       return FM_Read_only;
    }
    protected void setFM_Read_only(boolean value) {
       FM_Read_only = value;
    }

   /**
    *Power down in opened fiscal receipt
    */
    public boolean Power_down_in_opened_fiscal_receipt;
    public boolean getPower_down_in_opened_fiscal_receipt() {
       return Power_down_in_opened_fiscal_receipt;
    }
    protected void setPower_down_in_opened_fiscal_receipt(boolean value) {
       Power_down_in_opened_fiscal_receipt = value;
    }

   /**
    *Printer not ready - overheat
    */
    public boolean Printer_not_ready_overheat;
    public boolean getPrinter_not_ready_overheat() {
       return Printer_not_ready_overheat;
    }
    protected void setPrinter_not_ready_overheat(boolean value) {
       Printer_not_ready_overheat = value;
    }

   /**
    *DateTime not set
    */
    public boolean DateTime_not_set;
    public boolean getDateTime_not_set() {
       return DateTime_not_set;
    }
    protected void setDateTime_not_set(boolean value) {
       DateTime_not_set = value;
    }

   /**
    *DateTime wrong
    */
    public boolean DateTime_wrong;
    public boolean getDateTime_wrong() {
       return DateTime_wrong;
    }
    protected void setDateTime_wrong(boolean value) {
       DateTime_wrong = value;
    }

   /**
    *RAM reset
    */
    public boolean RAM_reset;
    public boolean getRAM_reset() {
       return RAM_reset;
    }
    protected void setRAM_reset(boolean value) {
       RAM_reset = value;
    }

   /**
    *Hardware clock error
    */
    public boolean Hardware_clock_error;
    public boolean getHardware_clock_error() {
       return Hardware_clock_error;
    }
    protected void setHardware_clock_error(boolean value) {
       Hardware_clock_error = value;
    }

   /**
    *Printer not ready - no paper
    */
    public boolean Printer_not_ready_no_paper;
    public boolean getPrinter_not_ready_no_paper() {
       return Printer_not_ready_no_paper;
    }
    protected void setPrinter_not_ready_no_paper(boolean value) {
       Printer_not_ready_no_paper = value;
    }

   /**
    *Reports registers Overflow
    */
    public boolean Reports_registers_Overflow;
    public boolean getReports_registers_Overflow() {
       return Reports_registers_Overflow;
    }
    protected void setReports_registers_Overflow(boolean value) {
       Reports_registers_Overflow = value;
    }

   /**
    *Blocking after 24 hours
    */
    public boolean Blocking_after_24_hours;
    public boolean getBlocking_after_24_hours() {
       return Blocking_after_24_hours;
    }
    protected void setBlocking_after_24_hours(boolean value) {
       Blocking_after_24_hours = value;
    }

   /**
    *Daily report is not zeroed
    */
    public boolean Daily_report_is_not_zeroed;
    public boolean getDaily_report_is_not_zeroed() {
       return Daily_report_is_not_zeroed;
    }
    protected void setDaily_report_is_not_zeroed(boolean value) {
       Daily_report_is_not_zeroed = value;
    }

   /**
    *Article report is not zeroed
    */
    public boolean Article_report_is_not_zeroed;
    public boolean getArticle_report_is_not_zeroed() {
       return Article_report_is_not_zeroed;
    }
    protected void setArticle_report_is_not_zeroed(boolean value) {
       Article_report_is_not_zeroed = value;
    }

   /**
    *Operator report is not zeroed
    */
    public boolean Operator_report_is_not_zeroed;
    public boolean getOperator_report_is_not_zeroed() {
       return Operator_report_is_not_zeroed;
    }
    protected void setOperator_report_is_not_zeroed(boolean value) {
       Operator_report_is_not_zeroed = value;
    }

   /**
    *Non-printed copy
    */
    public boolean Non_printed_copy;
    public boolean getNon_printed_copy() {
       return Non_printed_copy;
    }
    protected void setNon_printed_copy(boolean value) {
       Non_printed_copy = value;
    }

   /**
    *Opened Non-fiscal Receipt
    */
    public boolean Opened_Non_fiscal_Receipt;
    public boolean getOpened_Non_fiscal_Receipt() {
       return Opened_Non_fiscal_Receipt;
    }
    protected void setOpened_Non_fiscal_Receipt(boolean value) {
       Opened_Non_fiscal_Receipt = value;
    }

   /**
    *Opened Fiscal Receipt
    */
    public boolean Opened_Fiscal_Receipt;
    public boolean getOpened_Fiscal_Receipt() {
       return Opened_Fiscal_Receipt;
    }
    protected void setOpened_Fiscal_Receipt(boolean value) {
       Opened_Fiscal_Receipt = value;
    }

   /**
    *Receipt Invoice Type
    */
    public boolean Receipt_Invoice_Type;
    public boolean getReceipt_Invoice_Type() {
       return Receipt_Invoice_Type;
    }
    protected void setReceipt_Invoice_Type(boolean value) {
       Receipt_Invoice_Type = value;
    }

   /**
    *VAT included in receipt
    */
    public boolean VAT_included_in_receipt;
    public boolean getVAT_included_in_receipt() {
       return VAT_included_in_receipt;
    }
    protected void setVAT_included_in_receipt(boolean value) {
       VAT_included_in_receipt = value;
    }

   /**
    *Detailed Receipt
    */
    public boolean Detailed_Receipt;
    public boolean getDetailed_Receipt() {
       return Detailed_Receipt;
    }
    protected void setDetailed_Receipt(boolean value) {
       Detailed_Receipt = value;
    }

   /**
    *No FM module
    */
    public boolean No_FM_module;
    public boolean getNo_FM_module() {
       return No_FM_module;
    }
    protected void setNo_FM_module(boolean value) {
       No_FM_module = value;
    }

   /**
    *FM error
    */
    public boolean FM_error;
    public boolean getFM_error() {
       return FM_error;
    }
    protected void setFM_error(boolean value) {
       FM_error = value;
    }

   /**
    *FM full
    */
    public boolean FM_full;
    public boolean getFM_full() {
       return FM_full;
    }
    protected void setFM_full(boolean value) {
       FM_full = value;
    }

   /**
    *FM near full
    */
    public boolean FM_near_full;
    public boolean getFM_near_full() {
       return FM_near_full;
    }
    protected void setFM_near_full(boolean value) {
       FM_near_full = value;
    }

   /**
    *Decimal point (1=fract, 0=whole)
    */
    public boolean Decimal_point;
    public boolean getDecimal_point() {
       return Decimal_point;
    }
    protected void setDecimal_point(boolean value) {
       Decimal_point = value;
    }

   /**
    *FM fiscalized
    */
    public boolean FM_fiscalized;
    public boolean getFM_fiscalized() {
       return FM_fiscalized;
    }
    protected void setFM_fiscalized(boolean value) {
       FM_fiscalized = value;
    }

   /**
    *FM produced
    */
    public boolean FM_produced;
    public boolean getFM_produced() {
       return FM_produced;
    }
    protected void setFM_produced(boolean value) {
       FM_produced = value;
    }

   /**
    *Paired with TIMS
    */
    public boolean Paired_with_TIMS;
    public boolean getPaired_with_TIMS() {
       return Paired_with_TIMS;
    }
    protected void setPaired_with_TIMS(boolean value) {
       Paired_with_TIMS = value;
    }

   /**
    *External display: transparent display
    */
    public boolean External_display_transparent_display;
    public boolean getExternal_display_transparent_display() {
       return External_display_transparent_display;
    }
    protected void setExternal_display_transparent_display(boolean value) {
       External_display_transparent_display = value;
    }

   /**
    *Drawer: automatic opening
    */
    public boolean Drawer_automatic_opening;
    public boolean getDrawer_automatic_opening() {
       return Drawer_automatic_opening;
    }
    protected void setDrawer_automatic_opening(boolean value) {
       Drawer_automatic_opening = value;
    }

   /**
    *Owner  logo included in the receipt
    */
    public boolean Owner_logo_included_in_the_receipt;
    public boolean getOwner_logo_included_in_the_receipt() {
       return Owner_logo_included_in_the_receipt;
    }
    protected void setOwner_logo_included_in_the_receipt(boolean value) {
       Owner_logo_included_in_the_receipt = value;
    }

   /**
    *Customer report is not zeroed
    */
    public boolean Customer_report_is_not_zeroed;
    public boolean getCustomer_report_is_not_zeroed() {
       return Customer_report_is_not_zeroed;
    }
    protected void setCustomer_report_is_not_zeroed(boolean value) {
       Customer_report_is_not_zeroed = value;
    }

   /**
    *No Sec.IC
    */
    public boolean No_Sec_IC;
    public boolean getNo_Sec_IC() {
       return No_Sec_IC;
    }
    protected void setNo_Sec_IC(boolean value) {
       No_Sec_IC = value;
    }

   /**
    *No certificates
    */
    public boolean No_certificates;
    public boolean getNo_certificates() {
       return No_certificates;
    }
    protected void setNo_certificates(boolean value) {
       No_certificates = value;
    }

   /**
    *Service jumper
    */
    public boolean Service_jumper;
    public boolean getService_jumper() {
       return Service_jumper;
    }
    protected void setService_jumper(boolean value) {
       Service_jumper = value;
    }

   /**
    *Missing SD card
    */
    public boolean Missing_SD_card;
    public boolean getMissing_SD_card() {
       return Missing_SD_card;
    }
    protected void setMissing_SD_card(boolean value) {
       Missing_SD_card = value;
    }

   /**
    *Wrong SD card
    */
    public boolean Wrong_SD_card;
    public boolean getWrong_SD_card() {
       return Wrong_SD_card;
    }
    protected void setWrong_SD_card(boolean value) {
       Wrong_SD_card = value;
    }

   /**
    *Update is available
    */
    public boolean Update_is_available;
    public boolean getUpdate_is_available() {
       return Update_is_available;
    }
    protected void setUpdate_is_available(boolean value) {
       Update_is_available = value;
    }
}
