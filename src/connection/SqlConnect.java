package connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;


public class SqlConnect extends Parametre_Connexion {

	@Override
	public Connection connect() throws SQLException {
		try {
			
			Class.forName("com.msql.jdbc.Driver");
			Connection con = DriverManager.getConnection(this.getUrl(), this.getUser(), this.getPassword());
			return con;
		}catch(ClassNotFoundException | SQLException e) {
			
			Logger.getLogger(SqlConnect.class.getName()).log(Level.SEVERE, null, e);
		}
		return null;
	}
	

}
