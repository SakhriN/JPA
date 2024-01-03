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