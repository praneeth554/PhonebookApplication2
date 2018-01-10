package sbiicm.com.phonebookapplication;

/**
 * Created by praneeth on 1/4/2018.
 */

public class Users {

    public Users(String contacts, String pfid, String name, String email, String branch, String phone, String place) {
        this.contacts = contacts;
        this.pfid = pfid;
        this.name = name;
        this.email = email;
        this.branch = branch;
        this.phone = phone;
        this.place = place;
    }



    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getPfid() {
        return pfid;
    }

    public void setPfid(String pfid) {
        this.pfid = pfid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    String contacts;
    String pfid;
    String name;
    String email;
    String branch;
    String phone;
    String place;


}
