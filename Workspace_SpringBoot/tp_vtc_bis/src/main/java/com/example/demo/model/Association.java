package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Association {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_association;
	private Long conducteur;
	private Long vehicule;
	
	/*Correction Moussa et pas le @ManyToMany dans les autres model
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_association;
	private Conducteur conducteur;
	private Vehicule vehicule;
	
	@ManyToOne
	private Conducteur conducteur;
	
	@ManyToOne
	private Vehicule vehicule;
	*/
	
	public Association() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId_association() {
		return id_association;
	}
	public void setId_association(Long id_association) {
		this.id_association = id_association;
	}
	public Long getConducteur() {
		return conducteur;
	}
	public void setConducteur(Long conducteur) {
		this.conducteur = conducteur;
	}
	public Long getVehicule() {
		return vehicule;
	}
	public void setVehicule(Long vehicule) {
		this.vehicule = vehicule;
	}


	@Override
	public String toString() {
		return "Association [id_association=" + id_association + ", conducteur=" + conducteur + ", vehicule=" + vehicule
				+ "]";
	}
	
}
