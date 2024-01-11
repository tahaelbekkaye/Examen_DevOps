package com.tpDevOps;

public class Produit {
	private Long id;
	private String nom;
	private double prix;
	private int quantite;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Produit(Long id, String nom, double prix, int quantite) {
	        this.id = id;
	        this.nom = nom;
	        this.prix = prix;
	        this.quantite = quantite;
	    }
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Produit produit = (Produit) obj;
	    return id.equals(produit.id) && nom.equals(produit.nom);
	}
}