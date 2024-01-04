package DAO;

import Entity.ToDo;
import Entity.ToDoInfo;

import java.util.List;

public interface ToDoInfoDAO {

    public void Suppression(int id);

    public void Ajout(ToDoInfo toDoInfo);

    public ToDoInfo ObtentionUnique(int id);


    public ToDoInfo MiseAJourDescription(int id, String description);
}
