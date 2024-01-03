package DAO;

import Entity.ToDo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ToDoDAOImpl implements ToDoDAO {

    public static EntityManagerFactory test = Persistence.createEntityManagerFactory("exotodo");

    public void Suppression(int id) {
        EntityManager joe = test.createEntityManager();
        joe.getTransaction().begin();
        ToDo todo = joe.find(ToDo.class,id);
        joe.remove(todo);
        joe.getTransaction().commit();
        joe.close();
    }

    public void Ajout(ToDo toDo) {
        EntityManager joe = test.createEntityManager();
        joe.getTransaction().begin();
        joe.persist(toDo);
        joe.getTransaction().commit();
        joe.close();
    }

    ;

    public List<ToDo> Obtention() {
        EntityManager joe = test.createEntityManager();
        joe.getTransaction().begin();
        List<ToDo> toDoList = null;
        toDoList = joe.createQuery("select t from ToDo t", ToDo.class).getResultList();

        for (ToDo t: toDoList) {
            System.out.println(t);
        }
        joe.getTransaction().commit();
        return toDoList;
    }
    public ToDo ObtentionUnique(int id){
        EntityManager joe = test.createEntityManager();
        joe.getTransaction().begin();
        ToDo tache = null;
        tache = joe.find(ToDo.class,id);
        joe.getTransaction().commit();
        return tache;
    }

    public ToDo MiseAJour(ToDo toDo) {
        EntityManager joe = test.createEntityManager();
        return toDo;
    }

}
