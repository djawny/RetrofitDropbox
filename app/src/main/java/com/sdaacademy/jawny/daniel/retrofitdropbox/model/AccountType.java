package com.sdaacademy.jawny.daniel.retrofitdropbox.model;

import com.google.gson.annotations.SerializedName;

public class AccountType {

    @SerializedName(".tag")
    private String tag;

    public AccountType() {
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
