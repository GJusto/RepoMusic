package configuration;

import javax.servlet.*;
//import javax.servlet.Registration.Dynamic;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Inicializacao implements WebApplicationInitializer {
	
	@Override
	public void onStartup(ServletContext ctx) throws ServletException {
		System.out.println("método iniciado ");
		AnnotationConfigWebApplicationContext appCtx = new AnnotationConfigWebApplicationContext();
		appCtx.register(Config.class);
		appCtx.setServletContext(ctx);
		Dynamic servlet = ctx.addServlet("Spring", new DispatcherServlet(appCtx));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
		
	}

}