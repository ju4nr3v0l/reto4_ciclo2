package view;

import dao.ControllerRequerimientos;
import model.Requerimiento_1;
import model.Requerimiento_2;
import model.Requerimiento_3;
import model.Requerimiento_4;
import model.Requerimiento_5;

import java.sql.SQLException;
import java.util.ArrayList;

public class ViewRequerimientos {
    public static final ControllerRequerimientos controlador = new ControllerRequerimientos();

    public static void requerimiento1(){
        try{
            ArrayList<Requerimiento_1> listarRequerimiento1;
            listarRequerimiento1 = controlador.consultaRequerimiento1();
            for(Requerimiento_1 rq: listarRequerimiento1){
                System.out.println(
                        rq.getFechaCompra() + " " +
                        rq.getCodCompra() + " " +
                        rq.getNombreProveedor() + " " +
                        rq.getPagado() + " "
                );
            }
        } catch(SQLException e){

        }
    }

    public static void requerimiento2(){
        try{
            ArrayList<Requerimiento_2> listarRequerimiento2;
            listarRequerimiento2 = controlador.consultaRequerimiento2();
            for(Requerimiento_2 rq: listarRequerimiento2){
                System.out.println(
                        rq.getFechaInicio() + " " +
                        rq.getNombreCiudad() + " " +
                        rq.getConstructora() + " " +
                        rq.getLider() + " " +
                        rq.getTipo() + " " +
                        rq.getEstrato() + " "
                );
            }
        } catch(SQLException e){

        }
    }
    public static void requerimiento3(){
        try{
            ArrayList<Requerimiento_3> listarRequerimiento3;
            listarRequerimiento3 = controlador.consultaRequerimiento3();
            for(Requerimiento_3 rq: listarRequerimiento3){
                System.out.println(
                        rq.getNumeroProyectos() + " "

                );
            }
        } catch(SQLException e){

        }
    }

    public static void requerimiento4(){
        try{
            ArrayList<Requerimiento_4> listarRequerimiento4;
            listarRequerimiento4 = controlador.consultaRequerimiento4();
            for(Requerimiento_4 rq: listarRequerimiento4){
                System.out.println(
                        rq.getAbrev() + " "

                );
            }
        } catch(SQLException e){

        }
    }

    public static void requerimiento5(){
        try{
            ArrayList<Requerimiento_5> listarRequerimiento5;
            listarRequerimiento5 = controlador.consultaRequerimiento5();
            for(Requerimiento_5 rq: listarRequerimiento5){
                System.out.println(
                        rq.getConstructora() + " " +
                        rq.getSalarioLider() + " "

                );
            }
        } catch(SQLException e){

        }
    }
}
