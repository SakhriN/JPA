package exos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.Query;

import java.time.LocalDate;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        Scanner scoun = new Scanner(System.in);
        Session session = sessionFactory.openSession();
        Transaction tx = null;

        try {
            tx = session.getTransaction();
            tx.begin();


            Produit produit1 = new Produit("Lacoste", "le quartier", Date.valueOf(LocalDate.now()), 129.99D, 102);
            Produit produit2 = new Produit("Bacoste", "le quartier", Date.valueOf("2020-12-12"), 129.99D, 102);
            Produit produit3 = new Produit("Nacoste", "le quartier", Date.valueOf(LocalDate.now()), 129.99D, 102);
            Produit produit4 = new Produit("Racoste", "le quartier", Date.valueOf("1962-11-17"), 129.99D, 102);
            Produit produit5 = new Produit("Sa accoste", "le quartier", Date.valueOf(LocalDate.now()), 129.99D, 102);

            List<Produit> deception = new ArrayList<>();
            deception.add(produit1);
            deception.add(produit2);
            deception.add(produit3);
            deception.add(produit4);
            deception.add(produit5);

//            System.out.println(deception);
//            for (Produit produit : deception) {
//                session.save(produit);
//            }
//
//            Query<Produit> demande1 = session.createQuery("FROM Produit WHERE id = 2");
//            List<Produit> bloup = demande1.list();
//            System.out.println(bloup);
//
//            Produit extermination = session.load(Produit.class, 3);
//            session.remove(extermination);
//            session.getTransaction().commit();

//            Produit modification = session.load(Produit.class, 1);
//            modification.setPrix(12.12D);
//            modification.setDateAchat(Date.valueOf(LocalDate.now()));
//            session.update(modification);
//            session.getTransaction().commit();


//            EX2:


//            Query<Produit> demande2 = session.createQuery("FROM Produit");
//            List<Produit> bloupp = demande2.list();
//            System.out.println(bloupp);

//            Query<Produit> demande3 = session.createQuery("FROM Produit WHERE prix > :prix");
//            demande3.setParameter("prix", 100D);
//            List<Produit> blouppp = demande3.list();
//            for (Produit produit : blouppp) {
//                System.out.println(produit);
//            }
//            Query<Produit> demande4 = session.createQuery("FROM Produit WHERE dateAchat > :dateDebut AND dateAchat < :dateFin ");
//            demande4.setParameter("dateDebut", Date.valueOf("2024-01-01"));
//            demande4.setParameter("dateFin",Date.valueOf("2024-12-12"));
//            List<Produit> demence = demande4.list();
//            for (Produit produit : demence) {
//                System.out.println(produit);
//            }


//            Ex3 :

//            int stock = scoun.nextInt();
//            scoun.nextLine();
//            Query<Produit> query = session.createQuery("FROM Produit WHERE stock < :stockMax", Produit.class);
//            query.setParameter("stockMax", stock);
//            List<Produit> produits = query.getResultList();
//            System.out.println("Liste des produits avec un stock inférieur à " + stock + ":");
//            for (Produit produit : produits) {
//                System.out.println("Numéro : " + produit.getId() + ", Référence : " + produit.getReference());
//            }
//            Ex4:
            System.out.println("tappe une marque");
            String marqueChoisie = scoun.nextLine();
            Query<Produit> query = session.createQuery("FROM Produit WHERE marque = :marque", Produit.class);
            query.setParameter("marque", marqueChoisie);
            List<Produit> produits = query.getResultList();
            // Calculer la valeur totale du stock
            int valeurStock = produits.stream().mapToInt(Produit::getStock).sum();
            // Afficher la valeur du stock
            System.out.println("La valeur totale du stock pour la marque " + marqueChoisie + " est : " + valeurStock);
            tx.commit();

        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
                ex.printStackTrace();
            }
        } finally {
            session.close();
            sessionFactory.close();
        }

    }
}
