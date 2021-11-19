package com.air.tp1_jee.model;


public class Announcement {

    private String title ;
    private String description;
    private String address ;
    private String email ;

    public Announcement(String title, String description, String address, String email) {
        this.title = title;
        this.description = description;
        this.address = address;
        this.email = email;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getAdress() {
        return address;
    }
    public void setAdress(String adress) {
        this.address = adress;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
