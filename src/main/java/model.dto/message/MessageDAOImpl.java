package com.antares.demo.model.dto.message;

import com.antares.demo.model.Message;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MessageDAOImpl implements MessageDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public void addMessage(Message message) {
        sessionFactory.getCurrentSession().save(message);
    }

    @SuppressWarnings("unchecked")
    public List<Message> listMessage() {
        return sessionFactory.getCurrentSession().createQuery("from Message").list();
    }


    public void removeMessage(Integer id) {
        Message message = (Message) sessionFactory.getCurrentSession().load(Message.class, id);
        if(null!= message){
            sessionFactory.getCurrentSession().delete(message);
        }
    }
}
