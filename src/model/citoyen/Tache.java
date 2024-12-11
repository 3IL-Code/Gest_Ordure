package model.citoyen;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Tache {
	
	private IntegerProperty id_tache;
	private IntegerProperty id_cit;
	private IntegerProperty id_coll;
	private StringProperty etat;
	private StringProperty statut;

	public Tache() {
		super();
		this.id_tache = new SimpleIntegerProperty();
		this.id_cit = new SimpleIntegerProperty();
		this.id_coll = new SimpleIntegerProperty();
		this.etat = new SimpleStringProperty();
		this.statut = new SimpleStringProperty();
	}

	public Tache(int id_tache, int id_cit, int id_coll, String etat, String statut) {
		super();
		this.id_tache = new SimpleIntegerProperty(id_tache);
		this.id_cit = new SimpleIntegerProperty(id_cit);
		this.id_coll = new SimpleIntegerProperty(id_coll);
		this.etat = new SimpleStringProperty(etat);
		this.statut = new SimpleStringProperty(statut);
	}

	public final IntegerProperty id_tacheProperty() {
		return this.id_tache;
	}
	

	public final int getId_tache() {
		return this.id_tacheProperty().get();
	}
	

	public final void setId_tache(final int id_tache) {
		this.id_tacheProperty().set(id_tache);
	}
	

	public final IntegerProperty id_citProperty() {
		return this.id_cit;
	}
	

	public final int getId_cit() {
		return this.id_citProperty().get();
	}
	

	public final void setId_cit(final int id_cit) {
		this.id_citProperty().set(id_cit);
	}
	

	public final IntegerProperty id_collProperty() {
		return this.id_coll;
	}
	

	public final int getId_coll() {
		return this.id_collProperty().get();
	}
	

	public final void setId_coll(final int id_coll) {
		this.id_collProperty().set(id_coll);
	}
	

	public final StringProperty etatProperty() {
		return this.etat;
	}
	

	public final String getEtat() {
		return this.etatProperty().get();
	}
	

	public final void setEtat(final String etat) {
		this.etatProperty().set(etat);
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
	
	
	

}
