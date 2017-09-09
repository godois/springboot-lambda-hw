package com.lambda.hwlambda.util;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public abstract class SpringRequestHandler<I, O> implements RequestHandler<I, O>, ApplicationContextProvider {

    private final RequestHandler handler;

    public SpringRequestHandler() {
        handler = getApplicationContext().getBean(RequestHandler.class);
    }    
    
	public O handleRequest(final I input, final Context context) {
		return (O) handler.handleRequest(input, context);
	}

}