package IHM;

import DAO.ToDoDAOImpl;
import Entity.ToDo;

import java.util.Scanner;


public class IHM {

    Scanner scan = new Scanner(System.in);
    ToDoDAOImpl toDoDAO = new ToDoDAOImpl();
    int tache_num;
    int tache_mod;


    //     Creer une tache :
    public void Ajouter() {
        System.out.println("ecrivez une tache");
        String task = scan.nextLine();
        ToDo tache = new ToDo(task, false);
        toDoDAO.Ajout(tache);
    }


    //     Voir toutes les taches :
    public void Obtentiontoutes() {
        toDoDAO.Obtention();
    }

//    Voir une tache :

    public ToDo ObtentionUnique() {
        toDoDAO.Obtention();
        System.out.println("Choisissez la tâche ");
        tache_num = scan.nextInt();
        scan.nextLine();
        return toDoDAO.ObtentionUnique(tache_num);
    }

//    Modifier une tache :

    public void Modification() {
        if (ObtentionUnique()!=null) {
            menutache();
            tache_mod = scan.nextInt();
            scan.nextLine();

            while (tache_mod != 1 && tache_mod != 2) {
                System.out.println("invalide.");
                menutache();
                tache_mod = scan.nextInt();
                scan.nextLine();
            }

            if (tache_mod == 1) {
                System.out.println("Merci d'écrire un nouveau nom de tâche.");
                String nouveauNom = scan.nextLine();
                toDoDAO.MiseAJourNom(tache_num, nouveauNom);
            } else {
                toDoDAO.MiseAJourEtat(tache_num);
            }
        }else {
            System.out.println("Incorrect, retour au menu principal.");
        }
    }

//    Supprimer une tache :
    public void Suppression() {
        if (ObtentionUnique()!=null) {
            toDoDAO.Suppression(tache_num);
        }else
        {
            System.out.println("Incorrect, retour au menu principal.");
        }


    }
    public void menutache() {
        System.out.println("Que souhaitez vous modifier ?");
        System.out.println("1 - Modifier le nom de la tâche.");
        System.out.println("2 - Modifier l'état de la tâche.");
    }
    public void menu() {
        System.out.println("Bonjour, choisissez ce que vous voulez effectuer");
        System.out.println("1 - Creer une tâche.");
        System.out.println("2 - Afficher toutes les tâches.");
        System.out.println("3 - Afficher une tâche.");
        System.out.println("4 - Modifier une tâche.");
        System.out.println("5 - Supprimer une tâche.");
        System.out.println("6 - Fermer.");
    }

    public void Fermeture(){
        System.out.println("Au revoir.");
    }

}
