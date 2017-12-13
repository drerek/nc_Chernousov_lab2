package com.OracleGrantsDAO;

import com.Grants.Customer;
import com.Grants.Employee;
import com.Grants.ProjectManager;
import com.Objects.Project;
import com.interfaces.AdministratorDAO;

/**
 * Created by Tempuser on 08.12.2017.
 */
public class OracleAdministatorDAO implements AdministratorDAO {
    @Override
    public int addEmployee(Employee employee) {
        return 0;
    }

    @Override
    public int addCustomer(Customer customer) {
        return 0;
    }

    @Override
    public int addProject(Project project) {
        return 0;
    }

    @Override
    public int setProjectManager(Project project, ProjectManager projectManager) {
        return 0;
    }
}
