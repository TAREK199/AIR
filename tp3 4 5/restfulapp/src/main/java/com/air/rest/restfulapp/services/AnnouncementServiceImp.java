package com.air.rest.restfulapp.services;
import com.air.rest.restfulapp.models.Announcement;
import com.air.rest.restfulapp.repositories.AnnouncementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class AnnouncementServiceImp implements AnnouncementService{

    @Autowired
    private AnnouncementRepository announcementRepository;

    @Override
    public List<Announcement> getAllAnnouncements() {

        List<Announcement> announcementList =  new ArrayList<>();
        announcementRepository.findAll().forEach(announcementList::add);
        return announcementList;

    }

    @Override
    public Optional<Announcement> getAnnouncement(int id) {
       return announcementRepository.findById(id);

    }

    @Override
    public void saveAnnouncement(Announcement announcement) {

        announcementRepository.save(announcement);
    }

    @Override
    public void updateAnnouncement(Announcement announcement) {
        announcementRepository.save(announcement);
    }

    @Override
    public void deleteAnnouncement(int id) {
        announcementRepository.deleteById(id);
    }
}
