package com.antares.demo.model.dto.task;

import com.antares.demo.model.Task;

import java.util.List;

public interface TaskDAO {

    public void addTask(Task task);

    public List<Task> listTask();

    public void removeTask(Integer id);

}
