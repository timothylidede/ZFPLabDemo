package TremolZFP;
public class DepartmentRes {
   /**
    *Up to 2 symbols for department number in format ##
    */
    public Double DepNum;
    public Double getDepNum() {
       return DepNum;
    }
    protected void setDepNum(Double value) {
       DepNum = value;
    }

   /**
    *23 symbols for department name
    */
    public String DepName;
    public String getDepName() {
       return DepName;
    }
    protected void setDepName(String value) {
       DepName = value;
    }
}
