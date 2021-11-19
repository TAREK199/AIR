package com.air.tp1_jee.dao;



import com.air.tp1_jee.model.Announcement;

import java.util.List;

public interface DAO {

    void addAnnouncement(Announcement announcement);
    List<Announcement> displayAnnouncements();
}