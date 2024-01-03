import DAO.ToDoDAOImpl;
import Entity.ToDo;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ToDoDAOImpl toDoDAO = new ToDoDAOImpl();
        int tache_num;


        // Creer une tache :

//        System.out.println("ecrivez une tache");
//        String task = scan.nextLine();
//        ToDo tache = new ToDo(task, false);
//        toDoDAO.Ajout(tache);


        // Voir toutes les taches :

//        toDoDAO.Obtention();


        // Voir une tache :

        toDoDAO.Obtention();
        System.out.println("Choisissez quelle tâche modifier");
        tache_num = scan.nextInt();
        scan.nextLine();
        System.out.println(toDoDAO.ObtentionUnique(tache_num));

        // Modifier  une tache :

//        System.out.println("Que souhaitez vous modifier ?");
//        System.out.println("1 - Modifier le nom de la tâche.");
//        System.out.println("2 - Modifier l'état de la tâche.");
//        tache_num = scan.nextInt();
//        scan.nextLine();



        // Supprimer une tache :

//        toDoDAO.Obtention();
//        System.out.println("Choisissez quelle tâche supprimer");
//        int tache_num = scan.nextInt();
//        scan.nextLine();
//        toDoDAO.Suppression(tache_num);


        scan.close();
    }
}
