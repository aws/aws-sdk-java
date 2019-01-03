/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.handlers;

import com.amazonaws.Request;
import com.amazonaws.util.TimingInfo;

/**
 * @deprecated by {@link RequestHandler2}.
 *  
 * Interface for addition request handling in clients. A request handler is
 * executed on a request object <b>before</b> it is sent to the client runtime
 * to be executed.
 */
@Deprecated
public interface RequestHandler {

    /**
     * Runs any additional processing logic on the specified request (before it
     * is executed by the client runtime).
     *
     * @param request
     *            The low level request being processed.
     */
    public void beforeRequest(Request<?> request);

	/**
	 * Runs any additional processing logic on the specified request (after is
	 * has been executed by the client runtime).
	 *
	 * @param request
	 *            The low level request being processed.
	 * @param response
	 *            The response generated from the specified request.
	 * @param timingInfo
	 *            Timing information on the request's processing.
	 */
    public void afterResponse(Request<?> request, Object response, TimingInfo timingInfo);

	/**
	 * Runs any additional processing logic on a request after it has failed.
	 *
	 * @param request
	 *            The request that generated an error.
	 * @param e
	 *            The error that resulted from executing the request.
	 */
    public void afterError(Request<?> request, Exception e);

}
