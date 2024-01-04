package DAO;

import Entity.ToDo;
import Entity.ToDoInfo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ToDoInfoDAOImpl implements ToDoInfoDAO {

    public static EntityManagerFactory test = Persistence.createEntityManagerFactory("exotodo");

    public void Suppression(int id) {
        EntityManager joe = test.createEntityManager();
        joe.getTransaction().begin();
        ToDo todo = joe.find(ToDo.class, id);
        joe.remove(todo);
        joe.getTransaction().commit();
        joe.close();
    }

    public void Ajout(ToDoInfo toDoInfo) {
        EntityManager joe = test.createEntityManager();
        joe.getTransaction().begin();
        joe.persist(toDoInfo);
        joe.getTransaction().commit();
        joe.close();
    }
    public ToDoInfo ObtentionUnique(int id) {
        EntityManager joe = test.createEntityManager();
        joe.getTransaction().begin();
        ToDoInfo tache = null;
        tache = joe.find(ToDoInfo.class, id);
        joe.getTransaction().commit();
        joe.close();
        return tache;
    }
    public ToDoInfo MiseAJourDescription(int id, String description) {
        EntityManager joe = test.createEntityManager();
        ToDoInfo tache = ObtentionUnique(id);
        joe.getTransaction().begin();
        tache.setDescription(description);
        joe.merge(tache);
        joe.getTransaction().commit();
        joe.close();
        return tache;
    }
}
