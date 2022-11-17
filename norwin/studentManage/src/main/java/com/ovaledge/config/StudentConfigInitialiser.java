package com.ovaledge.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentConfigInitialiser extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] config = {StudentAppConfig.class};
		return config;
	}

	@Override
	protected String[] getServletMappings() {
		String[] ds = {"/"};
		return ds;
	}

}
