package com.antares.demo.model.dto.role;

import com.antares.demo.model.Role;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoleDAOImpl implements RoleDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addRole(Role role) {
        sessionFactory.getCurrentSession().save(role);
    }

    @SuppressWarnings("unchecked")
    public List<Role> listRole() {
        return sessionFactory.getCurrentSession().createQuery("from Role").list();
    }


    public void removeRole(Integer id) {
        Role role = (Role) sessionFactory.getCurrentSession().load(Role.class, id);
        if (null != role) {
            sessionFactory.getCurrentSession().delete(role);
        }
    }
}
