package org.aguzman.appejb.remote;

import org.aguzman.webapp.ejb.models.Producto;
import org.aguzman.webapp.ejb.service.ServiceEjbRemota;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        ServiceEjbRemota service = null;
        ServiceEjbRemota service2 = null;

//        final Properties env = new Properties();
//        env.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
//        env.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
//        env.put("jboss.naming.client.ejb.context", true);
        try {
            InitialContext ctx = new InitialContext();
            service = (ServiceEjbRemota) ctx.lookup("ejb:/appejb-remote-jaas/ServiceEjb!org.aguzman.webapp.ejb.service.ServiceEjbRemota?stateful");
            service2 = (ServiceEjbRemota) ctx.lookup("ejb:/appejb-remote-jaas/ServiceEjb!org.aguzman.webapp.ejb.service.ServiceEjbRemota?stateful");

            String saludo = service.saludar("Andres");
            String saludo2 = service2.saludar("John");
            System.out.println(saludo);
            System.out.println(saludo2);

            Producto p = service.crear(new Producto("sandia"));
            System.out.println("nuevo producto: " + p);

            service.listar().forEach(System.out::println);

        } catch (NamingException e) {
            e.printStackTrace();
        }

    }
}
