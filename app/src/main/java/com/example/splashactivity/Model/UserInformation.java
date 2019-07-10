package com.example.splashactivity.Model;

public class UserInformation {

    String id,location,date,time,category,name,firmname,address,cityVillage,Pincode,State,District,Mobileno1,Mobileno2,
    whatsappno,emailid,Website;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirmname() {
        return firmname;
    }

    public void setFirmname(String firmname) {
        this.firmname = firmname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCityVillage() {
        return cityVillage;
    }

    public void setCityVillage(String cityVillage) {
        this.cityVillage = cityVillage;
    }

    public String getPincode() {
        return Pincode;
    }

    public void setPincode(String pincode) {
        Pincode = pincode;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getMobileno1() {
        return Mobileno1;
    }

    public void setMobileno1(String mobileno1) {
        Mobileno1 = mobileno1;
    }

    public String getMobileno2() {
        return Mobileno2;
    }

    public void setMobileno2(String mobileno2) {
        Mobileno2 = mobileno2;
    }

    public String getWhatsappno() {
        return whatsappno;
    }

    public void setWhatsappno(String whatsappno) {
        this.whatsappno = whatsappno;
    }

    public UserInformation() {
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String website) {
        Website = website;
    }

    public UserInformation(String id, String location, String date, String time, String category, String name, String firmname, String address, String cityVillage, String pincode, String state,
                           String district, String mobileno1, String mobileno2, String whatsappno, String emailid, String website) {
        this.id = id;
        this.location = location;
        this.date = date;
        this.time = time;
        this.category = category;
        this.name = name;
        this.firmname = firmname;
        this.address = address;
        this.cityVillage = cityVillage;
        Pincode = pincode;
        State = state;
        District = district;
        Mobileno1 = mobileno1;
        Mobileno2 = mobileno2;
        this.whatsappno = whatsappno;
        this.emailid = emailid;
        Website = website;
    }
}
