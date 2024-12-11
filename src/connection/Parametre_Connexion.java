package connection;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class Parametre_Connexion {

	
	protected final String url="jdbc:mysql://localhost:3306/ordure";
	
	protected final String user="Rikyane";
	
	protected final String password="@Jesusmonsauveur1";
	
	public abstract Connection connect() throws SQLException;


	public String getUrl() {return url;}


	public String getUser() {return user;}


	public String getPassword() {return password;}
	
	
}
