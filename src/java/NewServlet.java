



import cl.modelo.Usuario;
import java.util.ArrayList;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author JPOZO-LAPTOP
 */

@WebListener()
public class UsuarioCache implements ServletContextListener{
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //Se construye una lista con usuarios.
        ArrayList<Usuario> listaUsuarios = new ArrayList();
        listaUsuarios.add(new Usuario("NombreCache1", "ApellidoCache1", "ncache1", "123"));
        listaUsuarios.add(new Usuario("NombreCache2", "ApellidoCache2", "ncache2", "123"));
        listaUsuarios.add(new Usuario("NombreCache3", "ApellidoCache3", "ncache3", "123"));

        sce.getServletContext().setAttribute("lstUsuarios", listaUsuarios);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    } 
}
