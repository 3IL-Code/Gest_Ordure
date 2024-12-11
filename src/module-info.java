module Gestion_Ordures {
	requires javafx.controls;
	requires javafx.web;
	requires java.sql;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
}
