package dao;
import model.Requerimiento_5;
import util.JDBCUtilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RequerimientoDao_5 {

    public ArrayList<Requerimiento_5> requerimiento5() throws SQLException {
        // objeto tipo lista para cargar los datos de la consulta
        ArrayList<Requerimiento_5> respuesta = new ArrayList<Requerimiento_5>();
//        conexion a la bd
        Connection conexion = JDBCUtilities.getConnection();
        try{
            String consulta = "select DISTINCT (p.Constructora), sum(l.Salario) as 'Salario Lider' from Proyecto p \n" +
                    "join Lider l on l.ID_Lider = p.ID_Lider\n" +
                    "GROUP by p.Constructora \n" +
                    "having sum(l.Salario) > 37000000 and sum(l.salario) < 40000000";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                Requerimiento_5 requerimiento5 = new Requerimiento_5();
                requerimiento5.setConstructora(resultSet.getString("Constructora"));
                requerimiento5.setSalarioLider(resultSet.getInt("Salario Lider"));

                respuesta.add(requerimiento5);
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
