package model.citoyen;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Zone {

	private IntegerProperty id_zone;
	private IntegerProperty id_citoyens;
	private StringProperty nom_zone;
	private StringProperty ville_zone;
	private IntegerProperty longitude;
	private IntegerProperty latitude;
	
	
	public Zone() {
		super();
		this.id_zone = new SimpleIntegerProperty() ;
		this.id_citoyens = new SimpleIntegerProperty() ;
		this.nom_zone = new SimpleStringProperty() ;
		this.ville_zone = new SimpleStringProperty() ;
		this.longitude = new SimpleIntegerProperty() ;
		this.latitude = new SimpleIntegerProperty() ;
	}
	
	public Zone(int id_zone, int id_citoyens, String nom_zone,
			String ville_zone, int longitude, int latitude) {
		super();
		this.id_zone = new SimpleIntegerProperty(id_zone) ;
		this.id_citoyens = new SimpleIntegerProperty(id_citoyens) ;
		this.nom_zone = new SimpleStringProperty(nom_zone) ;
		this.ville_zone = new SimpleStringProperty(ville_zone) ;
		this.longitude = new SimpleIntegerProperty(longitude) ;
		this.latitude = new SimpleIntegerProperty(latitude) ;
	}


	public final IntegerProperty id_zoneProperty() {
		return this.id_zone;
	}
	


	public final int getId_zone() {
		return this.id_zoneProperty().get();
	}
	


	public final void setId_zone(final int id_zone) {
		this.id_zoneProperty().set(id_zone);
	}
	


	public final IntegerProperty id_citoyensProperty() {
		return this.id_citoyens;
	}
	


	public final int getId_citoyens() {
		return this.id_citoyensProperty().get();
	}

	

	public final StringProperty nom_zoneProperty() {
		return this.nom_zone;
	}
	


	public final String getNom_zone() {
		return this.nom_zoneProperty().get();
	}
	


	public final void setNom_zone(final String nom_zone) {
		this.nom_zoneProperty().set(nom_zone);
	}
	


	public final StringProperty ville_zoneProperty() {
		return this.ville_zone;
	}
	


	public final String getVille_zone() {
		return this.ville_zoneProperty().get();
	}
	


	public final void setVille_zone(final String ville_zone) {
		this.ville_zoneProperty().set(ville_zone);
	}
	


	public final IntegerProperty longitudeProperty() {
		return this.longitude;
	}
	


	public final int getLongitude() {
		return this.longitudeProperty().get();
	}
	


	public final void setLongitude(final int longitude) {
		this.longitudeProperty().set(longitude);
	}
	


	public final IntegerProperty latitudeProperty() {
		return this.latitude;
	}
	


	public final int getLatitude() {
		return this.latitudeProperty().get();
	}
	


	public final void setLatitude(final int latitude) {
		this.latitudeProperty().set(latitude);
	}


	@Override
	public String toString() {
		return "Zone [id_zone=" + id_zone + ", id_citoyens=" + id_citoyens + ", nom_zone=" + nom_zone + ", ville_zone="
				+ ville_zone + ", longitude=" + longitude + ", latitude=" + latitude + "]";
	}
	
	
	
	
	
}
