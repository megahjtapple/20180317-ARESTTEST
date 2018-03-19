package testarest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/*
 * Code reference:
 * https://www.youtube.com/watch?v=5jQSat1cKMo
 *
 * Procedure:
 * 1. Install JDK 1.8 (Version 1.3.1)
 * 2. Install Tomcat 8.0 (Not 8.5)
 * 3. Download https://jersey.github.io/download.html (Jersey JAX-RS 2.0 RI bundle )
 * 4. Follow youtube.
 *
 *
 * Note:
 * <servlet-class>org.glassfish.jersey.servlet.ServletContainer.class</servlet-class> doesn't work.
 *
 * Have to be:
 *
 * <servlet-class>org.glassfish.jersey.servlet.ServletContainer</servlet-class>
 *
 */

@Path("/hello")
public class Hello {

    @GET
    @Produces(MediaType.TEXT_XML)
    public String sayHello(){
        String resource="<? xml version='1.0' ?>" +
                "<hello> Hi Neel, This is Hello form XML</hello>";
        return resource;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String sayHelloJSON(){
        String resource="{'TestingFiled':'HelloWorld'}";
        return resource;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHelloHTML(){
        String resource="<h1> HI Neel, This is Hello from HTML</h1>";
        return resource;
    }
}
