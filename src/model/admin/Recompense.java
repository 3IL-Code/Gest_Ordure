package model.admin;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Recompense {

	private IntegerProperty id_recomp;
	private StringProperty desc_recomp;
	private IntegerProperty valeur_recomp;
	
	public Recompense() {
		super();
		this.id_recomp = new SimpleIntegerProperty();
		this.desc_recomp = new SimpleStringProperty();
		this.valeur_recomp = new SimpleIntegerProperty();
	}
	
	public Recompense(int id_recomp, String desc_recomp, int valeur_recomp) {
		super();
		this.id_recomp = new SimpleIntegerProperty(id_recomp) ;
		this.desc_recomp = new SimpleStringProperty(desc_recomp) ;
		this.valeur_recomp = new SimpleIntegerProperty(valeur_recomp) ;
	}
	public final StringProperty desc_recompProperty() {
		return this.desc_recomp;
	}
	
	public final String getDesc_recomp() {
		return this.desc_recompProperty().get();
	}
	
	public final void setDesc_recomp(final String desc_recomp) {
		this.desc_recompProperty().set(desc_recomp);
	}
	
	public final IntegerProperty valeur_recompProperty() {
		return this.valeur_recomp;
	}
	
	public final int getValeur_recomp() {
		return this.valeur_recompProperty().get();
	}
	
	public final void setValeur_recomp(final int valeur_recomp) {
		this.valeur_recompProperty().set(valeur_recomp);
	}
	
	
	
}
