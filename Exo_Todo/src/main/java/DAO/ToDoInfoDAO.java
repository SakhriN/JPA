package DAO;

import Entity.ToDo;
import Entity.ToDoInfo;

import java.util.Date;

public interface ToDoInfoDAO {

    public void Suppression(int id);

    public void Ajout(ToDoInfo toDoInfo);

    public ToDoInfo ObtentionUnique(int id);


    public ToDoInfo MiseAJourDescription(int id, Date date, String description, int priority);

    public ToDoInfo AjoutDescription(int id, Date date, String description, int priority, ToDo toDo);
}
