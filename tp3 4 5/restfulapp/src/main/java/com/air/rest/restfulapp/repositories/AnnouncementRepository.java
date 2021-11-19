package com.air.rest.restfulapp.repositories;


import com.air.rest.restfulapp.models.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;



//JpaRepository<Announcement,Integer>
public interface AnnouncementRepository extends CrudRepository <Announcement,Integer>  {
}
