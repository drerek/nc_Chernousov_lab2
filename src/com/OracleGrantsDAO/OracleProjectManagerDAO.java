package com.OracleGrantsDAO;

import com.Grants.Employee;
import com.Objects.Project;
import com.Objects.Sprint;
import com.Objects.Task;
import com.interfaces.ProjectManagerDAO;

import java.util.Date;

/**
 * Created by Tempuser on 06.12.2017.
 */
public class OracleProjectManagerDAO implements ProjectManagerDAO {

    @Override
    public int createSprint(Project project, Sprint sprint, Date startTime, Date estimatedTime) {
        return 0;
    }

    @Override
    public int createTask(Task task, Sprint sprint, Date startTime, Date estimatedTime) {
        return 0;
    }

    @Override
    public int setEmployee(Task task, Employee employee, Date startTime, Date estimatedTime) {
        return 0;
    }
}
