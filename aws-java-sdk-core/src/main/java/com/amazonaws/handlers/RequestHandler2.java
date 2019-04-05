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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.util.TimingInfo;

/**
 * Interface for addition request handling in clients. A request handler is executed on a request
 * object <b>before</b> it is sent to the client runtime to be executed.
 * <p>
 * This interface deprecates {@link RequestHandler} by providing access to not only the AWS
 * response, but also the associated http response via {@link Response}.
 * <p>
 * Note {@link TimingInfo} is accessible via {@link Request#getAWSRequestMetrics()} and hence is
 * omitted from the interface to reduce duplication by design.
 */
public abstract class RequestHandler2 implements IRequestHandler2 {

    @Override
    public AmazonWebServiceRequest beforeExecution(AmazonWebServiceRequest request) {
        return request;
    }

    @Override
    public AmazonWebServiceRequest beforeMarshalling(AmazonWebServiceRequest request) {
        return request;
    }

    @Override
    public void beforeRequest(Request<?> request) {
    }

    @Override
    public void beforeAttempt(HandlerBeforeAttemptContext context) {
    }

    @Override
    public HttpResponse beforeUnmarshalling(Request<?> request, HttpResponse httpResponse) {
        return httpResponse;
    }

    @Override
    public void afterAttempt(HandlerAfterAttemptContext context) {
    }

    @Override
    public void afterResponse(Request<?> request, Response<?> response) {
    }

    @Override
    public void afterError(Request<?> request, Response<?> response, Exception e) {
    }

    /**
     * Returns an instance of request handler adapted to the {@link RequestHandler2} interface from
     * the given request handler implementing the deprecated {@link RequestHandler} interface.
     */
    public static RequestHandler2 adapt(@SuppressWarnings("deprecation") RequestHandler old) {
        return new RequestHandler2Adaptor(old);
    }
}
