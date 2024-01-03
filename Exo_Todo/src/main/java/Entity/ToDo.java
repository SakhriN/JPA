package Entity;

import javax.persistence.*;
@Entity
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String nom;

    boolean etat;

    public ToDo() {
    }

    public ToDo(String nom) {
        this.nom = nom;
    }
    public ToDo(String nom, boolean etat) {
        this.nom = nom;
        this.etat = etat;
    }

    public ToDo(int id, String nom, boolean etat) {
        this.id = id;
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
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ToDo : " +
                "id=" + id +
                ", nom= " + nom +
                ", etat= " + etat +
                '.';
    }
}


