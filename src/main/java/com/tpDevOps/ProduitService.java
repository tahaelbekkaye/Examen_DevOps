package com.tpDevOps;

import java.util.ArrayList;
import java.util.List;

public class ProduitService {
	private List<Produit> produits;

    public ProduitService() {
        this.produits = new ArrayList<>();
    }
    
	// Fonction pour lister tous les produits
    public List<Produit> listerProduits() {
        return produits;
    }

}
