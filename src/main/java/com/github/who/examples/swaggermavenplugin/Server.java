package com.github.who.examples.swaggermavenplugin;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.jetty.webapp.WebAppContext;

public class Server 
{
    private static final String WEB_CONTEXT_PATH = "src/main/webapp";
    private static final Integer SERVICE_PORT = 8081;
    
    public static void main( String[] args )
    {
        org.eclipse.jetty.server.Server server = new org.eclipse.jetty.server.Server(SERVICE_PORT);
        WebAppContext webContext = new WebAppContext();
        webContext.setContextPath("/swagger-maven-plugin-spring-mvc-example");
        webContext.setResourceBase(WEB_CONTEXT_PATH);
        webContext.setServer(server);
        server.setHandler(webContext);
        try {
            server.start();
            Logger.getLogger(Server.class.getName()).log(Level.INFO, "Jersey running on port:" + SERVICE_PORT);
        }
        catch (Exception ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
