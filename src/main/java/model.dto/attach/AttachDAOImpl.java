package com.antares.demo.model.dto.attach;

import com.antares.demo.model.Attach;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AttachDAOImpl implements AttachDAO {

    @Autowired
    private SessionFactory sessionFactory;


    public void addAttach(Attach attach) {

        sessionFactory.getCurrentSession().save(attach);
    }

    @SuppressWarnings("unchecked")
    public List<Attach> listAttach() {
        return sessionFactory.getCurrentSession().createQuery("from Attach").list();
    }

    @Override
    public void removeAttach(Integer id) {

        Attach attach = (Attach)sessionFactory.getCurrentSession().load(Attach.class,id);
        if (null!=attach){
            sessionFactory.getCurrentSession().delete(attach);
        }

    }
}
