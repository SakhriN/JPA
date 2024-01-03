import DAO.ToDoDAOImpl;
import Entity.ToDo;
import IHM.IHM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = 0;
        Scanner scan = new Scanner(System.in);
        IHM ihm = new IHM();
        do {
            ihm.menu();
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1 -> {
                    ihm.Ajouter();
                }
                case 2 -> {
                    ihm.Obtentiontoutes();
                }
                case 3 -> {
                    ihm.ObtentionUnique();
                }
                case 4 -> {
                    ihm.Modification();
                }
                case 5 -> {
                    ihm.Suppression();
                }
                case 6 -> {
                    ihm.Fermeture();
                }
                default -> {
                    System.out.println("Réponse invalide");
                }

            }

        } while (choice != 6);

    }
}


//    Scanner  scan = new Scanner(System.in);
//    ToDoDAOImpl  toDoDAO = new ToDoDAOImpl();
//    int tache_num;
//    int tache_mod;
//
//
//        System.out.println("ecrivez une tache");
//    String task = scan.nextLine();
//    ToDo tache = new ToDo(task, false);
//        toDoDAO.Ajout(tache);
//
////         Voir toutes les taches :
//
//        toDoDAO.Obtention();
//
//
//    // Voir une tache :
//
//        toDoDAO.Obtention();
//        System.out.println("Choisissez quelle tâche modifier");
//    tache_num = scan.nextInt();
//        scan.nextLine();
//        toDoDAO.ObtentionUnique(tache_num);
//
//    //         Modifier  une tache :
//
//    menutache();
//    tache_mod = scan.nextInt();
//        scan.nextLine();
//
//        while (tache_mod != 1 && tache_mod != 2) {
//        System.out.println("invalide.");
//        menutache();
//        tache_mod = scan.nextInt();
//        scan.nextLine();
//    }
//    ;
//
//        if (tache_mod == 1) {
//        System.out.println("Merci d'écrire un nouveau nom de tâche.");
//        String nouveauNom = scan.nextLine();
//        toDoDAO.MiseAJourNom(tache_num, nouveauNom);
//    } else {
//        toDoDAO.MiseAJourEtat(tache_num);
//    }
//
//    // Supprimer une tache :
//
//            toDoDAO.Obtention();
//            System.out.println("Choisissez quelle tâche supprimer");
//    tache_num = scan.nextInt();
//            scan.nextLine();
//            toDoDAO.Suppression(tache_num);
//
//
//        scan.close();
//
//}
//
//    public static void menutache() {
//        System.out.println("Que souhaitez vous modifier ?");
//        System.out.println("1 - Modifier le nom de la tâche.");
//        System.out.println("2 - Modifier l'état de la tâche.");
//    }
