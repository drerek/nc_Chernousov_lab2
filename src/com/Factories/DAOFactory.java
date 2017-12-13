package com.Factories;

import com.interfaces.CustomerDAO;
import com.interfaces.EmployeeDAO;
import com.interfaces.ProjectManagerDAO;

/**
 * Created by Tempuser on 06.12.2017.
 */
// Абстрактный класс DAO Factory
public abstract class DAOFactory {

    // Здесь будет метод для каждого DAO, который может быть
    // создан. Реализовывать эти методы
    // должны конкретные генераторы.
    public abstract CustomerDAO getCustomerDAO();
    public abstract EmployeeDAO getEmployeeDAO();
    public abstract ProjectManagerDAO getProjectManagerDao();


    public static DAOFactory getDAOFactory() {
                return new OracleDAOFactory();
        }
    }
