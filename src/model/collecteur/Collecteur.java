package model.collecteur;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Collecteur {

	private IntegerProperty id_collecteur;
	private StringProperty nom_coll;
	private IntegerProperty tel_coll;
	private StringProperty adress_coll;
	private StringProperty statut;
	
	
	public Collecteur() {
		super();
		this.id_collecteur = new SimpleIntegerProperty();
		this.nom_coll =  new SimpleStringProperty();
		this.tel_coll = new SimpleIntegerProperty();
		this.adress_coll = new SimpleStringProperty();
		this.statut = new SimpleStringProperty();
	}
	
	public Collecteur(int id_collecteur, String nom_coll, int tel_coll,
			String adress_coll, String statut) {
		super();
		this.id_collecteur = new SimpleIntegerProperty(id_collecteur);
		this.nom_coll =  new SimpleStringProperty(nom_coll);
		this.tel_coll = new SimpleIntegerProperty(tel_coll);
		this.adress_coll = new SimpleStringProperty(adress_coll);
		this.statut = new SimpleStringProperty(statut);
	}

	public final IntegerProperty id_collecteurProperty() {
		return this.id_collecteur;
	}
	

	public final int getId_collecteur() {
		return this.id_collecteurProperty().get();
	}
	

	public final void setId_collecteur(final int id_collecteur) {
		this.id_collecteurProperty().set(id_collecteur);
	}
	

	public final StringProperty nom_collProperty() {
		return this.nom_coll;
	}
	

	public final String getNom_coll() {
		return this.nom_collProperty().get();
	}
	

	public final void setNom_coll(final String nom_coll) {
		this.nom_collProperty().set(nom_coll);
	}
	

	public final IntegerProperty tel_collProperty() {
		return this.tel_coll;
	}
	

	public final int getTel_coll() {
		return this.tel_collProperty().get();
	}
	

	public final void setTel_coll(final int tel_coll) {
		this.tel_collProperty().set(tel_coll);
	}
	

	public final StringProperty adress_collProperty() {
		return this.adress_coll;
	}
	

	public final String getAdress_coll() {
		return this.adress_collProperty().get();
	}
	

	public final void setAdress_coll(final String adress_coll) {
		this.adress_collProperty().set(adress_coll);
	}
	

	public final StringProperty statutProperty() {
		return this.statut;
	}
	

	public final String getStatut() {
		return this.statutProperty().get();
	}
	

	public final void setStatut(final String statut) {
		this.statutProperty().set(statut);
	}

	@Override
	public String toString() {
		return "Collecteur [id_collecteur=" + id_collecteur + ", nom_coll=" + nom_coll + ", tel_coll=" + tel_coll
				+ ", adress_coll=" + adress_coll + ", statut=" + statut + "]";
	}
	
	
	

}
