package com.example.splashactivity;

import com.google.gson.annotations.SerializedName;

public class UserInfo {

    @SerializedName("firstName")
    public String firstName;

    @SerializedName("city")
    public String city;

    @SerializedName("date")
    public String date;

    @SerializedName("nooflead")
    public String nooflead;

    @SerializedName("noofclient")
    public String noofclient;



  /*  @SerializedName("lastName")
    public String lastName;

    @SerializedName("emailId")
    public String emailId;
*/


    @SerializedName("imageUrl")
    public String imageUrl;

    public UserInfo(String email, String fname, String lname, String imageurl) {
    }

    public UserInfo() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

   /* public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
*/
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNooflead() {
        return nooflead;
    }

    public void setNooflead(String nooflead) {
        this.nooflead = nooflead;
    }

    public String getNoofclient() {
        return noofclient;
    }

    public void setNoofclient(String noofclient) {
        this.noofclient = noofclient;
    }

    public UserInfo(String firstName, String city, String date, String nooflead, String noofclient, String imageUrl) {
        this.firstName = firstName;
        this.city = city;
        this.date = date;
        this.nooflead = nooflead;
        this.noofclient = noofclient;
        this.imageUrl = imageUrl;
    }
}
