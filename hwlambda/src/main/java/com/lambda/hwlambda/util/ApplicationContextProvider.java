package com.lambda.hwlambda.util;

import org.springframework.context.ApplicationContext;

import com.amazonaws.services.lambda.runtime.Context;

public interface ApplicationContextProvider {

	 ApplicationContext getApplicationContext();
	 
}
