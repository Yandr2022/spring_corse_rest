package com.yandr2022.spring.rest.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MyConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
//<display-name>spring-cource-mvc-hibernate-aop</display-name>
//
//<absolute-ordering />
//
//<servlet>
//<servlet-name>dispatcher</servlet-name>
//<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
//<init-param>
//<param-name>contextConfigLocation</param-name>
//<param-value>/WEB-INF/applicationContext.xml</param-value>
//</init-param>
//<load-on-startup>1</load-on-startup>
//</servlet>
//
//<servlet-mapping>
//<servlet-name>dispatcher</servlet-name>
//<url-pattern>/</url-pattern>
//</servlet-mapping>