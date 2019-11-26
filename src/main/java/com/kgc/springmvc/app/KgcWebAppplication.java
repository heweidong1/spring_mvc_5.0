package com.kgc.springmvc.app;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * 以前在web.xml中配置得
 */
public class KgcWebAppplication implements WebApplicationInitializer
{

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println("tomcat----init------");
        //初始化spring环境
        AnnotationConfigWebApplicationContext acweb =
                new AnnotationConfigWebApplicationContext();
        acweb.register(Appconfig.class);
        //acweb.refresh();
        //web环境
        DispatcherServlet servlet = new DispatcherServlet(acweb);
        ServletRegistration.Dynamic ds = servletContext.addServlet("ds",servlet);
        //拦截路径
        ds.addMapping("*.do");
        ds.setLoadOnStartup(1);
    }
}
