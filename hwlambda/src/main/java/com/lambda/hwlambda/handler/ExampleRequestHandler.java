package com.lambda.hwlambda.handler;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.YamlProcessor.ResolutionMethod;
import org.springframework.stereotype.Component;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.lambda.hwlambda.model.Request;
import com.lambda.hwlambda.model.Response;
import com.lambda.hwlambda.service.ExampleServiceA;
import com.lambda.hwlambda.service.ExampleServiceB;

@Component
public class ExampleRequestHandler implements RequestHandler<Request, Response> {

	private final ExampleServiceA serviceA;
	private final ExampleServiceB serviceB;
	
	@Autowired
	public ExampleRequestHandler(
			final ExampleServiceA exampleServiceA,
			final ExampleServiceB exampleServiceB) {
		this.serviceA = Objects.requireNonNull(exampleServiceA, "exampleServiceA");
		this.serviceB = Objects.requireNonNull(exampleServiceB, "exampleServiceB");
	}

	public Response handleRequest(Request input, Context context) {
		
		final String responseMessage = "Request message: " + input.getMessage() 
		+ ", Service A message: " + serviceA.getMessage() 
		+ ", Service B message: " + serviceB.getMessage();
		
		final Response response = new Response();
		response.setMessage(responseMessage);
		response.setStatus(response.getStatus().OK);
		
		return response;
	}
	
	
	
}
