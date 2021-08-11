package dao;
import model.Requerimiento_2;
import util.JDBCUtilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RequerimientoDao_2 {

    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        // objeto tipo lista para cargar los datos de la consulta
        ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();
//        conexion a la bd
        Connection conexion = JDBCUtilities.getConnection();
        try{
            String consulta = "SELECT  \n" +
                    "p.Fecha_Inicio as 'Fec. Ini.', \n" +
                    "p.Ciudad as 'Nom. Ciudad',\n" +
                    "p.Constructora  as 'Nombre. Constructora',\n" +
                    "l.Nombre || ' ' || l.Segundo_Apellido as 'Nom. Lider', \n" +
                    "t.Codigo_Tipo as 'C. Tipo', \n" +
                    "t.Estrato \n" +
                    "FROM Proyecto p\n" +
                    "left join Lider l on l.ID_Lider = p.ID_Lider\n" +
                    "left join Tipo t on t.ID_Tipo  = p.ID_Tipo \n" +
                    "where p.Ciudad = 'Armenia'\n" +
                    "and p.Fecha_Inicio  BETWEEN '2021-01-01' and '2021-05-30'\n";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                Requerimiento_2 requerimiento2 = new Requerimiento_2();
                requerimiento2.setFechaInicio(resultSet.getString("Fec. Ini."));
                requerimiento2.setNombreCiudad(resultSet.getString("Nom. Ciudad"));
                requerimiento2.setConstructora(resultSet.getString("Nombre. Constructora"));
                requerimiento2.setLider(resultSet.getString("Nom. Lider"));
                requerimiento2.setTipo(resultSet.getInt("C. Tipo"));
                requerimiento2.setEstrato(resultSet.getInt("Estrato"));
                respuesta.add(requerimiento2);
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
