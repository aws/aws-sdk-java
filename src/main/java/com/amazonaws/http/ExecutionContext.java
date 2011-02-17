/*
 * Copyright 2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.http;

import java.util.List;

import com.amazonaws.handlers.RequestHandler;

public class ExecutionContext {
	public List<RequestHandler> requestHandlers;

	public ExecutionContext() {}

	public ExecutionContext(List<RequestHandler> requestHandlers) {
		this.requestHandlers = requestHandlers;
	}

	/**
	 * Returns a list of request handlers that should be run for a given
	 * request's execution.
	 *
	 * @return The list of request handlers to run for the current request.
	 */
	public List<RequestHandler> getRequestHandlers() {
		return requestHandlers;
	}
}