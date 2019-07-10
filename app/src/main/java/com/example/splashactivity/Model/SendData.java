package com.example.splashactivity.Model;

import com.google.gson.annotations.SerializedName;

public class SendData {
    @SerializedName("name")
    String name;

    @SerializedName("firm_name")
    String firm_name;

    @SerializedName("add1")
    String add1;

    @SerializedName("city")
    String city;

    @SerializedName("pincode")
    String pincode;

    @SerializedName("state")
    String state;

    @SerializedName("district")
    String district;

    @SerializedName("contact")
    String contact;

    @SerializedName("contact1")
    String contact1;

    @SerializedName("whatup")
    String whatup;

    @SerializedName("email")
    String email;

    @SerializedName("website")
    String website;

    @SerializedName("gstno")
    String gstno;

    @SerializedName("user_type")
    String user_type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirm_name() {
        return firm_name;
    }

    public void setFirm_name(String firm_name) {
        this.firm_name = firm_name;
    }

    public String getAdd1() {
        return add1;
    }

    public void setAdd1(String add1) {
        this.add1 = add1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContact1() {
        return contact1;
    }

    public void setContact1(String contact1) {
        this.contact1 = contact1;
    }

    public String getWhatup() {
        return whatup;
    }

    public void setWhatup(String whatup) {
        this.whatup = whatup;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getGstno() {
        return gstno;
    }

    public void setGstno(String gstno) {
        this.gstno = gstno;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public SendData(String name, String firm_name, String add1, String city, String pincode, String state,
                    String district, String contact, String contact1, String whatup, String email, String website, String gstno, String user_type) {
        this.name = name;
        this.firm_name = firm_name;
        this.add1 = add1;
        this.city = city;
        this.pincode = pincode;
        this.state = state;
        this.district = district;
        this.contact = contact;
        this.contact1 = contact1;
        this.whatup = whatup;
        this.email = email;
        this.website = website;
        this.gstno = gstno;
        this.user_type = user_type;
    }

    public SendData() {
    }
}
