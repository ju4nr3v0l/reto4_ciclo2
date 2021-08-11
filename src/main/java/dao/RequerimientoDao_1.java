package dao;
import model.Requerimiento_1;
import util.JDBCUtilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RequerimientoDao_1 {

    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        // objeto tipo lista para cargar los datos de la consulta
        ArrayList<Requerimiento_1> respuesta = new ArrayList<Requerimiento_1>();
//        conexion a la bd
        Connection conexion = JDBCUtilities.getConnection();
        try{
            String consulta = "SELECT  \n" +
                    "Fecha , \n" +
                    "Proveedor , \n" +
                    "ID_Compra , \n" +
                    "Pagado \n" +
                    "FROM Compra \n" +
                    "order by ID_Compra desc \n" +
                    "limit 20\n";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                Requerimiento_1 requerimiento1 = new Requerimiento_1();
                requerimiento1.setFechaCompra(resultSet.getString("Fecha"));
                requerimiento1.setCodCompra(resultSet.getInt("ID_Compra"));
                requerimiento1.setNombreProveedor(resultSet.getString("Proveedor"));
                requerimiento1.setPagado(resultSet.getString("Pagado"));
                respuesta.add(requerimiento1);
            }
            resultSet.close();
            statement.close();


        } catch(SQLException e)  {
            System.err.println(e.getMessage());
        } finally {
            if (conexion != null){
                conexion.close();
            }
        }
        return respuesta;
    }
}
