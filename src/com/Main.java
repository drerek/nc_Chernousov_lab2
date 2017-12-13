package com;

import com.Factories.DAOFactory;
import com.Factories.OracleDAOFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Tempuser on 08.12.2017.
 */
public class Main {
    public static void main(String[] args) {
        DAOFactory daoFactory = DAOFactory.getDAOFactory();
        try (Connection connection = OracleDAOFactory.createConnection();){
            Statement stmt = connection.createStatement();
            String sql = "Select EMPNO FROM DREREK.EMP";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()){
                int id = rs.getInt("EMPNO");
                System.out.println(id);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
