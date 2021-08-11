package dao;
import model.Requerimiento_4;
import util.JDBCUtilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RequerimientoDao_4 {

    public ArrayList<Requerimiento_4> requerimiento4() throws SQLException {
        // objeto tipo lista para cargar los datos de la consulta
        ArrayList<Requerimiento_4> respuesta = new ArrayList<Requerimiento_4>();
//        conexion a la bd
        Connection conexion = JDBCUtilities.getConnection();
        try{
            String consulta = "SELECT substr(Nombre,0,3) || substr(Primer_Apellido,0,3)  || substr(Segundo_Apellido,0,3) as 'Abrev.' from Lider ";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                Requerimiento_4 requerimiento4 = new Requerimiento_4();
                requerimiento4.setAbrev(resultSet.getString("Abrev."));

                respuesta.add(requerimiento4);
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
