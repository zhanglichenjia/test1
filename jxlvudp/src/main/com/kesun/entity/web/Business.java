package kesun.entity.web;

import kesun.entity.AbsBusinessObject;


public class Business extends AbsBusinessObject {
    private String name;
    private String address;
    private String numberid;
    private  String sid;

    private School school =null;

    private static final long serialVersionUID = 1L;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberid() {
        return numberid;
    }

    public void setNumberid(String numberid) {
        this.numberid = numberid;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
}