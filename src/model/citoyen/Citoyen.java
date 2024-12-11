package model.citoyen;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Citoyen {

	private IntegerProperty id_cit;
	private StringProperty nom_cit;
	private IntegerProperty tel_cit;
	private StringProperty address_cit;
	private IntegerProperty point;
	
	public Citoyen() {
		super();
		this.id_cit = new SimpleIntegerProperty();
		this.nom_cit = new SimpleStringProperty();
		this.tel_cit = new SimpleIntegerProperty();
		this.address_cit = new SimpleStringProperty();
		this.point = new SimpleIntegerProperty();
	}
	
	
	public Citoyen(int id_cit, String nom_cit, int tel_cit,
			String address_cit, int point) {
		super();
		this.id_cit = new SimpleIntegerProperty(id_cit);
		this.nom_cit = new SimpleStringProperty(nom_cit);
		this.tel_cit = new SimpleIntegerProperty(tel_cit);
		this.address_cit = new SimpleStringProperty(address_cit);
		this.point = new SimpleIntegerProperty(point);
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
	

	public final StringProperty nom_citProperty() {
		return this.nom_cit;
	}
	

	public final String getNom_cit() {
		return this.nom_citProperty().get();
	}
	

	public final void setNom_cit(final String nom_cit) {
		this.nom_citProperty().set(nom_cit);
	}
	

	public final IntegerProperty tel_citProperty() {
		return this.tel_cit;
	}
	

	public final int getTel_cit() {
		return this.tel_citProperty().get();
	}
	

	public final void setTel_cit(final int tel_cit) {
		this.tel_citProperty().set(tel_cit);
	}
	

	public final StringProperty address_citProperty() {
		return this.address_cit;
	}
	

	public final String getAddress_cit() {
		return this.address_citProperty().get();
	}
	

	public final void setAddress_cit(final String address_cit) {
		this.address_citProperty().set(address_cit);
	}
	
	
	
}
