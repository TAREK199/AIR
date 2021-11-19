package com.air.rest.restfulapp.controllers;

import com.air.rest.restfulapp.models.Announcement;
import com.air.rest.restfulapp.services.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AnnouncementController {


    @Autowired
    private AnnouncementService announcementService ;

    @RequestMapping("/")
    public List<Announcement> getAllAnnouncement(){
        return announcementService.getAllAnnouncements();
    }

    @RequestMapping("/announcement/{id}")
    public Optional<Announcement> getAnnouncement(@PathVariable int id){
        return announcementService.getAnnouncement(id);
    }

    @RequestMapping (method = RequestMethod.POST,value = "/announcements")
    public void saveAnnouncement(@RequestBody Announcement announcement){
        announcementService.saveAnnouncement(announcement);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/announcement")
    public void updateAnnouncement(@RequestBody Announcement announcement){
        announcementService.updateAnnouncement(announcement);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/announcements/{id}")
    public void deleteAnnouncement(@PathVariable int id){
        announcementService.deleteAnnouncement(id);

    }





}
