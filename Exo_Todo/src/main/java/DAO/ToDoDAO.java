package DAO;

import Entity.ToDo;

import java.util.List;

public interface ToDoDAO {

    public void Suppression(int id);

    public ToDo Ajout(ToDo toDo);

    public ToDo ObtentionUnique(int id);

    public List<ToDo> Obtention();

    public ToDo MiseAJourNom(int id, String name);

    public ToDo MiseAJourEtat(int id);

    public void Fermeture();
}
