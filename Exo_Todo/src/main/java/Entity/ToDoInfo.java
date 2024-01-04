package Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ToDoInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int tdi_id;

    String description;

    Date date;

    int priority;

    @OneToOne
    @JoinColumn(name = "td_id")
    ToDo toDo;

    public ToDoInfo() {
    }


    public ToDoInfo(String description, Date date, int priority) {
        this.description = description;
        this.date = date;
        this.priority = priority;
    }

    public ToDoInfo(int tdi_id, String description, Date date, int priority) {
        this.tdi_id = tdi_id;
        this.description = description;
        this.date = date;
        this.priority = priority;
    }

    public ToDoInfo(String description, Date date, int priority, ToDo toDo) {
        this.description = description;
        this.date = date;
        this.priority = priority;
        this.toDo = toDo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "ToDoInfo : " +
                "tdi_id = " + tdi_id +
                ", description = " + description +
                ", date = " + date +
                ", priority = " + priority +
                ". ";
    }
}
