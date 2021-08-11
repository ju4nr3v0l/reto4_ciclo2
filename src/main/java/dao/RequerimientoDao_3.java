package dao;
import model.Requerimiento_3;
import util.JDBCUtilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RequerimientoDao_3 {

    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        // objeto tipo lista para cargar los datos de la consulta
        ArrayList<Requerimiento_3> respuesta = new ArrayList<Requerimiento_3>();
//        conexion a la bd
        Connection conexion = JDBCUtilities.getConnection();
        try{
            String consulta = "SELECT COUNT(DISTINCT (p.ID_Proyecto)) as 'Numero Proyectos'\n" +
                    "FROM Compra c\n" +
                    "Left join Proyecto p on p.ID_Proyecto = c.ID_Proyecto \n" +
                    "Left join Lider l on l.ID_Lider = p.ID_Lider\n" +
                    "Left join MaterialConstruccion mc on mc.ID_MaterialConstruccion = c.ID_MaterialConstruccion \n" +
                    "where p.Fecha_Inicio >= '2020-06-12'\n" +
                    "and l.ID_Lider <> 9\n" +
                    "and mc.ID_MaterialConstruccion not in (18,21)";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                Requerimiento_3 requerimiento3 = new Requerimiento_3();
                requerimiento3.setNumeroProyectos(resultSet.getInt("Numero Proyectos"));

                respuesta.add(requerimiento3);
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
