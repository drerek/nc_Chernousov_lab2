package com.Factories;
import com.OracleGrantsDAO.OracleCustomerDAO;
import com.OracleGrantsDAO.OracleEmployeeDAO;
import com.OracleGrantsDAO.OracleProjectManagerDAO;
import com.interfaces.CustomerDAO;
import com.interfaces.EmployeeDAO;
import com.interfaces.ProjectManagerDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDAOFactory extends DAOFactory {
    // метод для создания соединений к Cloudscape
    public static Connection createConnection() throws SQLException {
        // Использовать DRIVER и DBURL для создания соединения
        // Рекомендовать реализацию/использование пула соединений
        String URL = "jdbc:oracle:thin:@localhost:1521:XE";
        String USER = "DREREK";
        String PASSWORD = "qwerty";
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    @Override
    public CustomerDAO getCustomerDAO() {
        return new OracleCustomerDAO();
    }

    @Override
    public EmployeeDAO getEmployeeDAO() {
        return new OracleEmployeeDAO();
    }

    @Override
    public ProjectManagerDAO getProjectManagerDao() {
        return new OracleProjectManagerDAO();
    }

}
