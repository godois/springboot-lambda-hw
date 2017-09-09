package com.lambda.hwlambda.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

public abstract class SpringRequestStreamHandler implements RequestStreamHandler, ApplicationContextProvider {

    private final RequestStreamHandler handler;

    public SpringRequestStreamHandler() {
        this.handler = getApplicationContext().getBean(RequestStreamHandler.class);
    }

	public void handleRequest(InputStream input, OutputStream output, Context context) throws IOException {
		handler.handleRequest(input, output, context);		
	}

}