package edu.aisl.jsf;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Named;

//@Named
//@SessionScoped
@ManagedBean
@javax.faces.bean.SessionScoped
public class UtilisateurBean implements Serializable {


	private static final long serialVersionUID = 1L;

	private Utilisateur selectedUtilisateur;

	private List<Utilisateur> utilisateurs;
	
	public List<Utilisateur> getUtilisateurs() {
		if(utilisateurs == null) {
			utilisateurs = createListeUtilisateurs();
		}
		return utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	@PostConstruct
	private void init() {
		selectedUtilisateur = new Utilisateur("toto", "Utilisateur Test", "secret", new Date());						
	}
	
	public Utilisateur getSelectedUtilisateur() {
		return selectedUtilisateur;
	}

	public void setSelectedUtilisateur(Utilisateur selectedUtilisateur) {
		this.selectedUtilisateur = selectedUtilisateur;
	}
	
	
	public void enregistrer() {
		// Message de confirmation
		FacesContext facesContext = FacesContext.getCurrentInstance();
		FacesMessage facesMessage = new FacesMessage("Enregistrement réalisé");
		facesContext.addMessage(null, facesMessage);
	}

	public String annuler() throws IOException {
		System.out.println("ANNULER");
		FacesContext.getCurrentInstance().getExternalContext().redirect("autrePage.xhtml");
		return "zzzzautrePage.xhtml";
	}

	private List<Utilisateur> createListeUtilisateurs() {
		List<Utilisateur> lst = new ArrayList<>();
		for(int i = 1; i < 30; i++) {
			lst.add(new Utilisateur("toto" + i, "Utilisateur Test n°" + i , "secret", new Date()));
		}
		return lst;
	}
	
}
