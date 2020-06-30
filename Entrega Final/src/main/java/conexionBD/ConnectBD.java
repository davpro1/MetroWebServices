package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectBD {
    	
		Connection conexion=null;
    	
        String connectionURL = "jdbc:sqlserver://USUARIO-PC\\MSSQLSERVER;"
                + "databaseName=MetroV2;"
                + "user = usuarioConexion;"
                + "password = 1234567890; ";
        
        public Connection conect() throws SQLException {
        	try {
        		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        	}
    	    catch(ClassNotFoundException ex){
    	        ex.printStackTrace();
    	        System.exit(-1);
    	    }
    		
    		try {
    			this.conexion = DriverManager.getConnection(connectionURL);
    		} catch (SQLException e) {
    			System.out.println("Conexion Fallida!:\n" + e.getMessage());
    		}

    		if (conexion != null) {
    			System.out.println("Conexion establecida");
    		} else {
    			System.out.println("No se pudo establecer conexion");
    		}
    		
    		return this.conexion;
    		
    	}

    }