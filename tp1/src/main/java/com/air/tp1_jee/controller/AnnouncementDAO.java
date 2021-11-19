package com.air.tp1_jee.controller;


import com.air.tp1_jee.dao.DAO;
import com.air.tp1_jee.model.Announcement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;




public class AnnouncementDAO implements DAO {

    @Override
    public void addAnnouncement(Announcement announcement) {

        try {
            ConnectionDB connectionDB = new ConnectionDB();
            Connection connection = connectionDB.getInstance();

            String query = "insert into annonce(title,description,adress,mail) values (?,?,?,?)" ;

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1,announcement.getTitle());
            preparedStatement.setString(2,announcement.getDescription());
            preparedStatement.setString(3,announcement.getAdress());
            preparedStatement.setString(4,announcement.getEmail());

            preparedStatement.executeUpdate();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    @Override
    public List<Announcement> displayAnnouncements() {
        List<Announcement> announcementList = new ArrayList<>();
        try {
            ConnectionDB connectionDB = new ConnectionDB();
            Connection connection = connectionDB.getInstance();
            String query = "select * from annonce";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                String address = resultSet.getString("adress");
                String email = resultSet.getString("mail");
                Announcement announcement = new Announcement(title, description, address, email);
                announcementList.add(announcement);
            }
            resultSet.close();
            statement.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return announcementList;
    }

    }



