package com.interfaces;

import com.Objects.Task;

import java.util.Collection;
import java.util.Date;

/**
 * Created by Tempuser on 06.12.2017.
 */
// Интерфейс, который должны поддерживать все CustomerDAO
public interface EmployeeDAO {
    public Collection getTasks();
    public int agreeWithTask(Task task);
    public int requestToIncreaseTime(Task task, Date estimatedTime);

}
