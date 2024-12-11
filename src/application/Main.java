package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.io.File;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		/*
		 * try { BorderPane root = new BorderPane(); Scene scene = new
		 * Scene(root,400,400);
		 * scene.getStylesheets().add(getClass().getResource("application.css").
		 * toExternalForm()); primaryStage.setScene(scene); primaryStage.show(); }
		 * catch(Exception e) { e.printStackTrace(); }
		 */
		
		// Création de la WebView
        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();

        // Charger le fichier HTML local
        File htmlFile = new File("map.html"); // Chemin vers le fichier HTML
        webEngine.load(htmlFile.toURI().toString());

        // Création du layout
        BorderPane root = new BorderPane();
        root.setCenter(webView);

        // Configuration de la scène
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("Leaflet Map avec JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
