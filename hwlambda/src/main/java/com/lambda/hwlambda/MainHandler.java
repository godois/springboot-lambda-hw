package com.lambda.hwlambda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lambda.hwlambda.model.Request;
import com.lambda.hwlambda.model.Response;
import com.lambda.hwlambda.util.SpringRequestHandler;

public class MainHandler extends SpringRequestHandler<Request, Response> {
	
	private static final ApplicationContext context = 
			new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

	public ApplicationContext getApplicationContext() {
		// TODO Auto-generated method stub
		return context;
	}

}
