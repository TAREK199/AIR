package com.air.rest.restfulapp.services;

import com.air.rest.restfulapp.models.Announcement;

import java.util.List;
import java.util.Optional;

public interface AnnouncementService {

    List<Announcement> getAllAnnouncements();

   // Announcement getAnnouncement(int id);
    Optional<Announcement> getAnnouncement(int id);

    void saveAnnouncement(Announcement announcement);
    void updateAnnouncement(Announcement announcement);
    void deleteAnnouncement(int id);


}
