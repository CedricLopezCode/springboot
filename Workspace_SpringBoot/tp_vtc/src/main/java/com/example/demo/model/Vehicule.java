package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Vehicule {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_vehicule;
	private String marque;
	private String modele;
	private String couleur;
	private String immatriculation;
	
	//@ManyToMany(mappedBy = "vehicules")
	//private List<Conducteur> conducteurs;
	
	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicule(String marque, String modele, String couleur, String immatriculation) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
		this.immatriculation = immatriculation;
	}
	public Vehicule(String marque, String couleur) {
		super();
		this.marque = marque;
		this.couleur = couleur;
	}
	/*
	public Vehicule(Long id_vehicule, String marque, String modele, String couleur, String immatriculation,
			List<Conducteur> conducteurs) {
		super();
		this.id_vehicule = id_vehicule;
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
		this.immatriculation = immatriculation;
		//this.conducteurs = conducteurs;
	}
	*/
	public Long getId_vehicule() {
		return id_vehicule;
	}
	public void setId_vehicule(Long id_vehicule) {
		this.id_vehicule = id_vehicule;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	/*
	public List<Conducteur> getConducteurs() {
		return conducteurs;
	}
	public void setConducteurs(List<Conducteur> conducteurs) {
		this.conducteurs = conducteurs;
	}*/
	@Override
	public String toString() {
		return "Vehicule [id_vehicule=" + id_vehicule + ", marque=" + marque + ", modele=" + modele + ", couleur="
				+ couleur + ", immatriculation=" + immatriculation + ", association_vehicule_conducteur="
				+ /*conducteurs +*/ "]";
	}
	public String toStringResume() {
		return  id_vehicule +" "+ marque +" "+ modele +" "+ couleur +" "+ immatriculation ;
	}
	
	/*
	public String toStringResume() {
		return "Assoc: "+id_association +"\nConducteur: "+  conducteur.toStringResume() +"\nVehicule "+ vehicule.toStringResume();
	}
	*/
	
	
	
	
}
