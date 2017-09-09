package com.lambda.hwlambda.util;

import com.amazonaws.services.lambda.runtime.Context;

public abstract class SpringVoidRequestHandler <I> extends SpringRequestHandler<I, Void> {

	@Override
	public Void handleRequest(I input, Context context) {
		// TODO Auto-generated method stub
		return super.handleRequest(input, context);
	}

	
	
}
