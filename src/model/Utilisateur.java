package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Utilisateur {

	private IntegerProperty id;
	private StringProperty nom;
	private StringProperty prenom;
	private StringProperty adresse;
	private StringProperty telephone;
	private StringProperty mail;
	private StringProperty username;
	private StringProperty mdp;
	
	
	public Utilisateur() {
		super();
		this.id = new SimpleIntegerProperty();
		this.nom =  new SimpleStringProperty();
		this.prenom =  new SimpleStringProperty();
		this.adresse =  new SimpleStringProperty();
		this.telephone =  new SimpleStringProperty();
		this.mail =  new SimpleStringProperty();
		this.username =  new SimpleStringProperty();
		this.mdp =  new SimpleStringProperty();
	}


	public Utilisateur(int id, String nom, String prenom, String adresse,
			String telephone, String mail, String username, String mdp) {
		super();
		this.id = new SimpleIntegerProperty(id);
		this.nom =  new SimpleStringProperty(nom);
		this.prenom =  new SimpleStringProperty(prenom);
		this.adresse =  new SimpleStringProperty(adresse);
		this.telephone =  new SimpleStringProperty(telephone);
		this.mail =  new SimpleStringProperty(mail);
		this.username =  new SimpleStringProperty(username);
		this.mdp =  new SimpleStringProperty(mdp);
	}


	public final IntegerProperty idProperty() {
		return this.id;
	}
	


	public final int getId() {
		return this.idProperty().get();
	}
	


	public final void setId(final int id) {
		this.idProperty().set(id);
	}
	


	public final StringProperty nomProperty() {
		return this.nom;
	}
	


	public final String getNom() {
		return this.nomProperty().get();
	}
	


	public final void setNom(final String nom) {
		this.nomProperty().set(nom);
	}
	


	public final StringProperty prenomProperty() {
		return this.prenom;
	}
	


	public final String getPrenom() {
		return this.prenomProperty().get();
	}
	


	public final void setPrenom(final String prenom) {
		this.prenomProperty().set(prenom);
	}
	


	public final StringProperty adresseProperty() {
		return this.adresse;
	}
	


	public final String getAdresse() {
		return this.adresseProperty().get();
	}
	


	public final void setAdresse(final String adresse) {
		this.adresseProperty().set(adresse);
	}
	


	public final StringProperty telephoneProperty() {
		return this.telephone;
	}
	


	public final String getTelephone() {
		return this.telephoneProperty().get();
	}
	


	public final void setTelephone(final String telephone) {
		this.telephoneProperty().set(telephone);
	}
	


	public final StringProperty mailProperty() {
		return this.mail;
	}
	


	public final String getMail() {
		return this.mailProperty().get();
	}
	


	public final void setMail(final String mail) {
		this.mailProperty().set(mail);
	}
	


	public final StringProperty usernameProperty() {
		return this.username;
	}
	


	public final String getUsername() {
		return this.usernameProperty().get();
	}
	


	public final void setUsername(final String username) {
		this.usernameProperty().set(username);
	}
	


	public final StringProperty mdpProperty() {
		return this.mdp;
	}
	


	public final String getMdp() {
		return this.mdpProperty().get();
	}
	


	public final void setMdp(final String mdp) {
		this.mdpProperty().set(mdp);
	}
	
	
	
	
	
}
