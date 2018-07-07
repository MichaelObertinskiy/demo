package com.antares.demo.model.dto.task;

import com.antares.demo.model.Task;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskDAOImpl implements TaskDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addTask(Task task) {
        sessionFactory.getCurrentSession().save(task);
    }

    @SuppressWarnings("unchecked")
    public List<Task> listTask() {
        return sessionFactory.getCurrentSession().createQuery("from Task").list();
    }


    public void removeTask(Integer id) {
        Task task = (Task) sessionFactory.getCurrentSession().load(Task.class, id);
        if (null != task) {
            sessionFactory.getCurrentSession().delete(task);
        }
    }
}
