package DAO;

import exos.Produit;

import java.util.List;

public interface ProduitDAO {

    public void Create(Produit produit);

    public Produit ReadOne(int id);

    public List<Produit> ReadAll(Produit produit);

    public void Update(int id);

    public void Delete(int id);
}
