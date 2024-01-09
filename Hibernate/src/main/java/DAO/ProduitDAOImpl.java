package DAO;

import exos.Produit;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Query;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import java.util.List;

public class ProduitDAOImpl implements ProduitDAO {
    StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
    SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();


    Transaction tx = null;

    public void Create(Produit produit) {
        Session session = sessionFactory.openSession();
        tx = session.beginTransaction();
        session.save(produit);
        tx.commit();
        session.close();
    }

    ;

    public Produit ReadOne(int id) {
        Session session = sessionFactory.openSession();
        tx = session.beginTransaction();
        Produit produit = session.get(Produit.class,id);
        tx.commit();
        session.close();
        return produit;
    }

    public List<Produit> ReadAll(Produit produit) {
        Session session = sessionFactory.openSession();
        tx = session.beginTransaction();
        Query<Produit> query = session.createQuery("FROM Produit");
        List<Produit> produits = query.list();
        tx.commit();
        session.close();
        return produits;
    }

    public void Update(int id) {
    }

    public void Delete(int id) {
        Session session = sessionFactory.openSession();
        tx = session.beginTransaction();
        Produit produit = session.get(Produit.class,id);
        session.delete(produit);
        tx.commit();
        session.close();
    }
}
