package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLDatabaseConnection {
   
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
    	
    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://USUARIO-PC\\MSSQLSERVER;"
                + "databaseName=MetroV2;"
                + "user = usuarioConexion;"
                + "password = 1234567890; ";
        Connection con = DriverManager.getConnection(connectionURL);
        System.out.println("Conexion Exitosa");
    }
}