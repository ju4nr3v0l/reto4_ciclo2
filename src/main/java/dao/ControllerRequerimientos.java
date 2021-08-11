package dao;

import model.Requerimiento_1;
import model.Requerimiento_2;
import model.Requerimiento_3;
import model.Requerimiento_4;
import model.Requerimiento_5;

import java.sql.SQLException;
import java.util.ArrayList;

public class ControllerRequerimientos {

    private final RequerimientoDao_1 requerimientoDao_1 = new RequerimientoDao_1();
    private final RequerimientoDao_2 requerimientoDao_2 = new RequerimientoDao_2();
    private final RequerimientoDao_3 requerimientoDao_3 = new RequerimientoDao_3();
    private final RequerimientoDao_4 requerimientoDao_4 = new RequerimientoDao_4();
    private final RequerimientoDao_5 requerimientoDao_5 = new RequerimientoDao_5();

    public ArrayList<Requerimiento_1> consultaRequerimiento1() throws SQLException {
        return this.requerimientoDao_1.requerimiento1();
    }

    public ArrayList<Requerimiento_2> consultaRequerimiento2() throws SQLException {
        return this.requerimientoDao_2.requerimiento2();
    }

    public ArrayList<Requerimiento_3> consultaRequerimiento3() throws SQLException {
        return this.requerimientoDao_3.requerimiento3();
    }

    public ArrayList<Requerimiento_4> consultaRequerimiento4() throws SQLException {
        return this.requerimientoDao_4.requerimiento4();
    }

    public ArrayList<Requerimiento_5> consultaRequerimiento5() throws SQLException {
        return this.requerimientoDao_5.requerimiento5();
    }
}
