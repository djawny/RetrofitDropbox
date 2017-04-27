package com.sdaacademy.jawny.daniel.retrofitdropbox.model;

public class DropboxCurrentAccountResponse {
    private String account_id;
    private Name name;
    private String email;
    private boolean email_verified;
    private boolean disabled;
    private String country;
    private String locale;
    private String referral_link;
    private boolean is_paired;
    private AccountType account_type;

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEmail_verified() {
        return email_verified;
    }

    public void setEmail_verified(boolean email_verified) {
        this.email_verified = email_verified;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getReferral_link() {
        return referral_link;
    }

    public void setReferral_link(String referral_link) {
        this.referral_link = referral_link;
    }

    public boolean is_paired() {
        return is_paired;
    }

    public void setIs_paired(boolean is_paired) {
        this.is_paired = is_paired;
    }

    public AccountType getAccount_type() {
        return account_type;
    }

    public void setAccount_type(AccountType account_type) {
        this.account_type = account_type;
    }
}
