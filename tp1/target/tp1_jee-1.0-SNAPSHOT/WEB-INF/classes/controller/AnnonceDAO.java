package src.main.resources;


import src.main.resources.dao.DAO;
import src.main.resources.model.Annonce;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class AnnonceDAO implements DAO {


    @Override
    public void addAnnonce(Annonce annonce) {

        try {
            ConnectionDB connectionDB = new ConnectionDB();
            Connection connection = connectionDB.getInstance();

            String query = "insert into  annonce (title,description,adress,mail) values (?,?,?,?)" ;

        //    statement.execute("insert into  annonce value ('" + title + "', '" + description + "', '" + address + "', " + email + ")");
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1,annonce.getTitle());
            preparedStatement.setString(2,annonce.getDescription());
            preparedStatement.setString(3,annonce.getAdress());
            preparedStatement.setString(4,annonce.getEmail());

            preparedStatement.executeUpdate();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



    @Override
    public List<Annonce> showAnnonce() {

        List<Annonce> listAnnonces = new ArrayList<>();

        try {
            ConnectionDB connectionDB = new ConnectionDB();
            Connection connection = connectionDB.getInstance();

            String query = "select * from annonce";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                String adress = resultSet.getString("address");
                String email = resultSet.getString("email");

                Annonce annonce = new Annonce(title, description, adress, email);
                listAnnonces.add(annonce);
            }

            resultSet.close();
            statement.close();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        //  PreparedStatement preparedStatement = connection.prepareStatement(query);
        return listAnnonces;
    }

    }



