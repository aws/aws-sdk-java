package com.amazonaws;

import com.amazonaws.handlers.RequestHandler;

public interface AmazonWebServicesClientInf {

	public void setEndpoint(String endpoint) throws IllegalArgumentException;

	public void shutdown();

	public void addRequestHandler(RequestHandler requestHandler);

	public void removeRequestHandler(RequestHandler requestHandler);

}
