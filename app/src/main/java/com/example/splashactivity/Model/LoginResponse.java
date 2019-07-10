package com.example.splashactivity.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LoginResponse {


    @SerializedName("items")
    List<UserInformation> items;

    public List<UserInformation> getItems() {
        return items;
    }

    public void setItems(List<UserInformation> items) {
        this.items = items;
    }
}
