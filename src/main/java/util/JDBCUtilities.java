package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilities {
    private static final String DATABASE_LOCATION = "/home/epayco/Descargas/ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        try{
            String url = "jdbc:sqlite:" + DATABASE_LOCATION;
            // create a connection to the database
            Connection conn = DriverManager.getConnection(url);
            return conn;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            Connection conn = DriverManager.getConnection("example");
        }
        Connection conn = DriverManager.getConnection("example");
        return conn;


    }

}
