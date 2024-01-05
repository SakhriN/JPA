package DAO;

import Entity.ToDo;
import Entity.ToDoInfo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

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
    public ToDoInfo MiseAJourDescription(int id, Date date, String description, int priority) {
        EntityManager joe = test.createEntityManager();
        ToDoInfo tache = ObtentionUnique(id);
        joe.getTransaction().begin();
        tache.setDate(date);
        tache.setDescription(description);
        tache.setPriority(priority);
        joe.merge(tache);
        joe.getTransaction().commit();
        joe.close();
        return tache;
    }
    public ToDoInfo AjoutDescription(int id, Date date, String description, int priority, ToDo toDo) {
        EntityManager joe = test.createEntityManager();
        ToDoInfo tache = ObtentionUnique(id);
        joe.getTransaction().begin();
        tache.setDate(date);
        tache.setDescription(description);
        tache.setPriority(priority);
        tache.setToDo(toDo);
        joe.merge(tache);
        joe.getTransaction().commit();
        joe.close();
        return tache;
    }
}
