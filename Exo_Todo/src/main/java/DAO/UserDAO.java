package DAO;

import Entity.User;

import java.util.List;

public interface UserDAO {

    public User Ajout(User user);

    public List<User> Obtention(User user);

    public void Suppression(int id);
}
