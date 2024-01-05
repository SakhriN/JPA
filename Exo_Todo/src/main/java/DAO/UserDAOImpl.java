package DAO;

import Entity.ToDo;
import Entity.User;

import javax.persistence.EntityManager;

import java.util.List;

import static DAO.ToDoDAOImpl.test;

public class UserDAOImpl implements UserDAO {

    public User Ajout(User user) {
        EntityManager joe = test.createEntityManager();
        joe.getTransaction().begin();
        joe.persist(user);
        joe.getTransaction().commit();
        joe.close();
        return user;
    }

    public List<User> Obtention(User user) {
        EntityManager joe = test.createEntityManager();
        joe.getTransaction().begin();
        List<User> userList = null;
        userList = joe.createQuery("select u from User u", User.class).getResultList();

        for (User u : userList) {
            System.out.println(u);
        }
        joe.getTransaction().commit();
        joe.close();
        return userList;
    }

    public void Suppression(int id) {
        EntityManager joe = test.createEntityManager();
        joe.getTransaction().begin();
        User user = joe.find(User.class, id);
        joe.remove(user);
        joe.getTransaction().commit();
        joe.close();
    }
}

