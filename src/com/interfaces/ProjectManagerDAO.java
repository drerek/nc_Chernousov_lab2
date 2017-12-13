package com.interfaces;

import com.Grants.Employee;
import com.Objects.Project;
import com.Objects.Sprint;
import com.Objects.Task;

import java.util.Date;

/**
 * Created by Tempuser on 06.12.2017.
 */
// Интерфейс, который должны поддерживать все CustomerDAO
public interface ProjectManagerDAO {
    public int createSprint(Project project, Sprint sprint, Date startTime, Date estimatedTime);
    public int createTask(Task task, Sprint sprint, Date startTime, Date estimatedTime);
    public int setEmployee(Task task, Employee employee, Date startTime, Date estimatedTime);
}
