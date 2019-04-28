package edu.aisl.jsf;

import java.io.Serializable;
import java.util.Date;

public class Utilisateur implements Serializable {

	private String login;
	private String nom;
	private String motDePasse;
	private Date dateNaissance;
	
	public Utilisateur() {
		super();
	}
	
	public Utilisateur(String login, String nom, String motDePasse, Date dateNaissance) {
		super();
		this.login = login;
		this.nom = nom;
		this.motDePasse = motDePasse;
		this.dateNaissance = dateNaissance;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	
}
