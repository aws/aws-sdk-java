/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.handlers;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.http.HttpResponse;

/**
 * Interface for {@link RequestHandler2}. Do not use this outside the core SDK. We can and will add
 * methods to this interface in the future. Extend {@link RequestHandler2} to implement a custom
 * request handler.
 */
@SdkInternalApi
public interface IRequestHandler2 {
    /**
     * Runs any additional processing logic on the specified request object as soon as the request
     * is provided to the service client.
     *
     * <p>This request handler is excluded from the client execution time metrics and is run on the
     * application's thread, even for asynchronous requests.</p>
     *
     * <p>Warning: Modifications to this message will leak out to the user, who might reuse the request
     * object without realizing that it was modified as part of sending it the first time. For this
     * reason, we recommend that you only modify the request in the {@link #beforeRequest(Request)}
     * method. If you require data that is not available in that method, you should create a
     * {@link AmazonWebServiceRequest#clone()} of the request (which performs a deep copy of the
     * handler context map), add any context data you require in the {@link #beforeRequest(Request)}
     * method using {@link AmazonWebServiceRequest#addHandlerContext(HandlerContextKey, Object)}, and
     * return your cloned message from this method. You can then extract that data for use in the
     * request using {@link Request#getHandlerContext(HandlerContextKey)}.</p>
     *
     * @param request the request passed in by the user
     * @return the (possibly different) request to execute
     */
    AmazonWebServiceRequest beforeExecution(AmazonWebServiceRequest request);

    /**
     * Runs any additional processing logic on the specified request object before it is marshaled
     * into an HTTP request.
     *
     * <p>Warning: Modifications to this message will leak out to the user, who might reuse the request
     * object without realizing that it was modified as part of sending it the first time. For this
     * reason, we recommend that you only modify the request in the {@link #beforeRequest(Request)}
     * method. If you require data that is not available in that method, you should create a
     * {@link AmazonWebServiceRequest#clone()} of the request (which performs a deep copy of the
     * handler context map), add any context data you require in the {@link #beforeRequest(Request)}
     * method using {@link AmazonWebServiceRequest#addHandlerContext(HandlerContextKey, Object)}, and
     * return your cloned message from this method. You can then extract that data for use in the
     * request using {@link Request#getHandlerContext(HandlerContextKey)}.</p>
     *
     * @param request
     *            the request passed in by the user
     * @return the (possibly different) request to marshal
     */
    AmazonWebServiceRequest beforeMarshalling(AmazonWebServiceRequest request);

    /**
     * Runs any additional processing logic on the specified request (before it is executed by the
     * client runtime).
     *
     * @param request
     *            The low level request being processed.
     */
    void beforeRequest(Request<?> request);

    /**
     * Runs any additional processing logic on a request before each individual attempt is made.
     *
     * @param context
     *              container for callback-related data; includes the request
     */
    void beforeAttempt(HandlerBeforeAttemptContext context);

    /**
     * Runs any additional processing logic on the specified response before it's unmarshalled. This
     * callback is only invoked on successful responses that will be unmarshalled into an
     * appropriate modeled class and not for unsuccessful responses that will be unmarshalled into a
     * subclass of {@link AmazonServiceException}
     *
     * @param request
     *            The low level request being processed.
     * @param httpResponse
     *            The Raw HTTP response before being unmarshalled
     * @return {@link HttpResponse} to replace the actual response. May be a mutated version of the
     *         original or a completely new {@link HttpResponse} object
     */
    HttpResponse beforeUnmarshalling(Request<?> request, HttpResponse httpResponse);

    /**
     * Runs any additional processing logic on a request after each individual attempt.  Callback is
     * invoked whether or not the attempt resulted in a successful response or an error.  This callback
     * is invoked within a finally block and so any exceptions it generates will "replace" the current
     * exception, if one is outstanding.
     *
     * @param context
     *              container for the request as well as all possible results of the attempt
     */
    void afterAttempt(HandlerAfterAttemptContext context);

    /**
     * Runs any additional processing logic on the specified request (after is has been executed by
     * the client runtime).
     *
     * @param request
     *            The low level request being processed.
     * @param response
     *            The response generated from the specified request.
     */
    void afterResponse(Request<?> request, Response<?> response);

    /**
     * Runs any additional processing logic on a request after it has failed.  This callback is invoked
     * from a catch block.  If it generates an exception, the original AmazonClientException will be lost.
     *
     * @param request
     *            The request that generated an error.
     * @param response
     *            the response or null if the failure occurred before the response is made available
     * @param e
     *            The error that resulted from executing the request.
     */
    void afterError(Request<?> request, Response<?> response, Exception e);
}
