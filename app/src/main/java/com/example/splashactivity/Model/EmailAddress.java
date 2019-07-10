package com.example.splashactivity.Model;

import com.google.gson.annotations.SerializedName;

public class EmailAddress {

    @SerializedName("emailId")
    private String emailId;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
