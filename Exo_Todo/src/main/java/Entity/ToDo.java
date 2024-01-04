package Entity;

import javax.persistence.*;
import Entity.ToDoInfo;
@Entity
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int td_id;

    @Column
    String nom;

    boolean etat;

    @OneToOne(mappedBy = "toDo", cascade = CascadeType.ALL, orphanRemoval = true)
    ToDoInfo toDoInfo;
    public ToDo() {
    }

    public ToDo(String nom) {
        this.nom = nom;
    }
    public ToDo(String nom, boolean etat) {
        this.nom = nom;
        this.etat = etat;
    }

    public ToDo(int td_id, String nom, boolean etat) {
        this.td_id = td_id;
        this.nom = nom;
        this.etat = etat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public int getId() {
        return td_id;
    }

    public void setId(int td_id) {
        this.td_id = td_id;
    }

    public ToDoInfo getToDoInfo() {
        return toDoInfo;
    }

    public void setToDoInfo(ToDoInfo toDoInfo) {
        this.toDoInfo = toDoInfo;
    }

    @Override
    public String toString() {
        return "ToDo : " +
                "id=" + td_id +
                ", nom= " + nom +
                ", etat= " + etat +
                ", toDoInfo= " + toDoInfo +
                '.';
    }
}


