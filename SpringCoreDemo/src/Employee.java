// Bean or Model or POJO(Plain Old Java Object)
public class Employee {

    // Attributes
    int eid;
    String ename;
    String eaddress;

    // Methods
    public Employee(){

    }

    public Employee(int eid, String ename, String address) {
        this.eid = eid;
        this.ename = ename;
        this.eaddress = address;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEaddress() {
        return eaddress;
    }

    public void setEaddress(String address) {
        this.eaddress = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", address='" + eaddress + '\'' +
                '}';
    }
}
