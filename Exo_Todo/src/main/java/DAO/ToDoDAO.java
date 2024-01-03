package DAO;

import Entity.ToDo;

import java.util.List;

public interface ToDoDAO {

    public void Suppression(int id);

    public void Ajout(ToDo toDo);

    public ToDo ObtentionUnique(int id);

    public List<ToDo> Obtention();

    public ToDo MiseAJour(ToDo toDo);
}
