package models;

import java.util.Date;
import java.util.List;

public class Employee {
    public String ename;
    public String eaddress;
    public long empMobile;
    public Date DOB;
    public List<String> skills;

    public long getEmpMobile() {
        return empMobile;
    }

    public void setEmpMobile(long empMobile) {
        this.empMobile = empMobile;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
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

    public void setEaddress(String eaddress) {
        this.eaddress = eaddress;
    }
}
