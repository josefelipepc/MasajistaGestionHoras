/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cache;
import cl.modelo.Horario;
import java.util.ArrayList;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author JPOZO-LAPTOP
 */

@WebListener()
public class HorarioCache implements ServletContextListener{
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //Se construye una lista con usuarios.
        ArrayList<Horario> listaHorarios = new ArrayList();
        listaHorarios.add(new Horario("09:00 - 10:00", "DISPONIBLE"));
        listaHorarios.add(new Horario("10:00 - 11:00", "DISPONIBLE"));
        listaHorarios.add(new Horario("11:00 - 12:00", "DISPONIBLE"));
        listaHorarios.add(new Horario("12:00 - 13:00", "DISPONIBLE"));
        listaHorarios.add(new Horario("14:00 - 15:00", "DISPONIBLE"));
        listaHorarios.add(new Horario("15:00 - 16:00", "DISPONIBLE"));
        listaHorarios.add(new Horario("16:00 - 17:00", "DISPONIBLE"));
        listaHorarios.add(new Horario("17:00 - 18:00", "DISPONIBLE"));
        listaHorarios.add(new Horario("18:00 - 19:00", "DISPONIBLE"));
        listaHorarios.add(new Horario("19:00 - 10:00", "DISPONIBLE"));
        listaHorarios.add(new Horario("09:00 - 10:00", "DISPONIBLE"));
        listaHorarios.add(new Horario("09:00 - 10:00", "DISPONIBLE"));
        listaHorarios.add(new Horario("18:00 - 19:0", "DISPONIBLE"));
        listaHorarios.add(new Horario("18:00 - 19:00", "DISPONIBLE"));

        sce.getServletContext().setAttribute("lstHorarios", listaHorarios);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
    
    
}
    
