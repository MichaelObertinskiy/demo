package com.antares.demo.model.dto.attach2Task;

import com.antares.demo.model.Attach2Task;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Attach2TaskDAOImpl implements Attach2TaskDAO{
    @Autowired
    private SessionFactory sessionFactory;

    public void addAttach2Task(Attach2Task attach2Task) {
        sessionFactory.getCurrentSession().save(attach2Task);
    }

    @SuppressWarnings("unchecked")
    public List<Attach2Task> listAttach2Task() {
        return sessionFactory.getCurrentSession().createQuery("from Attach2Task").list();
    }


    public void removeAttach2Task(Integer id) {
        Attach2Task attach2Task = (Attach2Task) sessionFactory.getCurrentSession().load(Attach2Task.class, id);
        if(null!= attach2Task){
            sessionFactory.getCurrentSession().delete(attach2Task);
        }
    }
}
