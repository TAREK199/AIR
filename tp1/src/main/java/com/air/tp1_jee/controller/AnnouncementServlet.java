package com.air.tp1_jee.controller;


import com.air.tp1_jee.model.Announcement;

import java.io.*;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


@WebServlet(name = "AnnouncementServlet", value = "/")
public class AnnouncementServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        AnnouncementDAO announcementDAO = new AnnouncementDAO();
        List<Announcement> announcementList = announcementDAO.displayAnnouncements();
        request.setAttribute("list",announcementList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
        dispatcher.forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //  super.doPost(request, response);
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        Announcement announcement = new Announcement(title,description,address,email);
        AnnouncementDAO announcementDAO = new AnnouncementDAO();
        announcementDAO.addAnnouncement(announcement);
        doGet(request,response);
    }


}