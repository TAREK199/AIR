package com.air.rest.restfulapp.models;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "WAnnouncement")
public class Announcement {

    @Id
    private int id;
    private String title;
    private String description;
    private String email;

    public Announcement(){};

    public Announcement(int id, String title, String description, String email) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
