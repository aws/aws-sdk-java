/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.Response;
import com.amazonaws.util.TimingInfo;

/**
 * Interface for addition request handling in clients. A request handler is
 * executed on a request object <b>before</b> it is sent to the client runtime
 * to be executed.
 * <p>
 * This interface deprecates {@link RequestHandler} by providing access to not
 * only the AWS response, but also the associated http response via
 * {@link Response}.
 * <p>
 * Note {@link TimingInfo} is accessible via
 * {@link Request#getAWSRequestMetrics()} and hence is omitted from the
 * interface to reduce duplication by design.
 */
public abstract class RequestHandler2 {

    /**
     * Runs any additional processing logic on the specified request (before it
     * is executed by the client runtime).
     * 
     * @param request
     *            The low level request being processed.
     */
    public abstract void beforeRequest(Request<?> request);

    /**
     * Runs any additional processing logic on the specified request (after is
     * has been executed by the client runtime).
     * 
     * @param request
     *            The low level request being processed.
     * @param response
     *            The response generated from the specified request.
     */
    public abstract void afterResponse(Request<?> request, Response<?> response);

    /**
     * Runs any additional processing logic on a request after it has failed.
     * 
     * @param request
     *            The request that generated an error.
     * @param response
     *            the response or null if the failure occurred before the
     *            response is made available
     * @param e
     *            The error that resulted from executing the request.
     */
    public abstract void afterError(Request<?> request, Response<?> response,
            Exception e);

    /**
     * Returns an instance of request handler adapted to the
     * {@link RequestHandler2} interface from the given request handler
     * implementing the deprecated {@link RequestHandler} interface.
     */
    public static RequestHandler2 adapt(
            @SuppressWarnings("deprecation") RequestHandler old) {
        return new RequestHandler2Adaptor(old);
    }
}
