package com.lambda.hwlambda.util;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public abstract class VoidRequestHandler <T> implements RequestHandler<T, Void> {

	public Void handleRequest(T input, Context context) {
		handle(input, context);
		return null;
	}

	public abstract void handle (final T input, final Context context);
	
}
