package DAO;

import exos.Produit;

import java.util.Date;
import java.util.List;

public interface ProduitDAO {

    public void Create(Produit produit);

    public Produit ReadOne(int id);

    public List<Produit> ReadAll(Produit produit);

    public void Update(Produit produit, String marque, String reference, Date date
            , double prix, int stock);

    public void Delete(int id);
}
