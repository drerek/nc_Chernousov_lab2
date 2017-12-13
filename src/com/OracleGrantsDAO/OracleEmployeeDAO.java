package com.OracleGrantsDAO;

import com.Objects.Task;
import com.interfaces.EmployeeDAO;

import java.util.Collection;
import java.util.Date;

/**
 * Created by Tempuser on 06.12.2017.
 */
public class OracleEmployeeDAO implements EmployeeDAO {

    @Override
    public Collection getTasks() {
        return null;
    }

    @Override
    public int agreeWithTask(Task task) {
        return 0;
    }

    @Override
    public int requestToIncreaseTime(Task task, Date estimatedTime) {
        return 0;
    }


}
