package com.antares.demo.model.dto.attachMessage;

import com.antares.demo.model.AttachMessage;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AttachMessageDAOImpl implements AttachMessageDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public void addAttachMessage(AttachMessage attachMessage) {
        sessionFactory.getCurrentSession().save(attachMessage);
    }

    @SuppressWarnings("unchecked")

    public List<AttachMessage> listAttachMessage() {
        return sessionFactory.getCurrentSession().createQuery("from AttachMessage").list();
    }


    public void removeAttachMessage(Integer id) {
        AttachMessage attachMessage = (AttachMessage) sessionFactory.getCurrentSession().load(AttachMessage.class, id);
        if (null != attachMessage){
            sessionFactory.getCurrentSession().delete(attachMessage);
        }
    }
}
