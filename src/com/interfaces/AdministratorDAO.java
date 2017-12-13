package com.interfaces;

import com.Grants.Customer;
import com.Grants.Employee;
import com.Grants.ProjectManager;
import com.Objects.Project;

/**
 * Created by Tempuser on 06.12.2017.
 */
// Интерфейс, который должны поддерживать все CustomerDAO
public interface AdministratorDAO {
    public int addEmployee(Employee employee);
    public int addCustomer(Customer customer);
    public int addProject(Project project);
    public int setProjectManager(Project project, ProjectManager projectManager);
}
