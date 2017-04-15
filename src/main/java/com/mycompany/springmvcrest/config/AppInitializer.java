package com.mycompany.springmvcrest.config;

import javax.servlet.Filter;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import org.springframework.web.filter.CharacterEncodingFilter;

@Order(0)
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {
				//AppCofing.class,
				DataSourceConfig.class,
				//JpaConfig.class,
				//SecurityConfig.class,
				Jackson2ObjectMapperConfig.class,
				//MessageSourgeConfig.class				
		};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {
				WebConfig.class,
				//SwaggerConfig.class,
		};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
	
	@Override
    protected javax.servlet.Filter[] getServletFilters() {
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        encodingFilter.setEncoding("UTF-8");
        encodingFilter.setForceEncoding(true);
        return new Filter[] { encodingFilter };
    }
	
	

}
