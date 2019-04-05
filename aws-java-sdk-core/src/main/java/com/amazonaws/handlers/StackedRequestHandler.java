/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.util.ValidationUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Composite {@link RequestHandler2} to execute a chain of {@link RequestHandler2} implementations
 * in stack order. That is if you have request handlers R1, R2, R3 the order of execution is as
 * follows
 * 
 * <pre>
 *    
 * {@code   
 * R1.beforeMarshalling   
 * R2.beforeMarshalling   
 * R3.beforeMarshalling   
 *    
 * R1.beforeRequest   
 * R2.beforeRequest   
 * R3.beforeRequest   
 *    
 * R3.beforeUnmarshalling
 * R2.beforeUnmarshalling
 * R1.beforeUnmarshalling
 * 
 * R3.after(Response|Error)   
 * R2.after(Response|Error)   
 * R1.after(Response|Error)   
 * }
 * </pre>
 */
@ThreadSafe
public class StackedRequestHandler implements IRequestHandler2 {

    private final List<RequestHandler2> inOrderRequestHandlers;
    private final List<RequestHandler2> reverseOrderRequestHandlers;

    public StackedRequestHandler(RequestHandler2...requestHandlers) {
       this(Arrays.asList(ValidationUtils.assertNotNull(requestHandlers, "requestHandlers")));
    }

    public StackedRequestHandler(List<RequestHandler2> requestHandlers) {
        this.inOrderRequestHandlers = ValidationUtils.assertNotNull(requestHandlers, "requestHandlers");
        this.reverseOrderRequestHandlers = new ArrayList<RequestHandler2>(requestHandlers);
        Collections.reverse(reverseOrderRequestHandlers);
    }

    @Override
    public AmazonWebServiceRequest beforeExecution(AmazonWebServiceRequest origRequest) {
        AmazonWebServiceRequest toReturn = origRequest;
        for (RequestHandler2 handler : inOrderRequestHandlers) {
            toReturn = handler.beforeExecution(toReturn);
        }
        return toReturn;
    }

    @Override
    public AmazonWebServiceRequest beforeMarshalling(AmazonWebServiceRequest origRequest) {
        AmazonWebServiceRequest toReturn = origRequest;
        for (RequestHandler2 handler : inOrderRequestHandlers) {
            toReturn = handler.beforeMarshalling(toReturn);
        }
        return toReturn;
    }

    @Override
    public void beforeRequest(Request<?> request) {
        for (RequestHandler2 handler : inOrderRequestHandlers) {
            handler.beforeRequest(request);
        }
    }

    @Override
    public void beforeAttempt(HandlerBeforeAttemptContext context) {
        for (RequestHandler2 handler : inOrderRequestHandlers) {
            handler.beforeAttempt(context);
        }
    }

    @Override
    public HttpResponse beforeUnmarshalling(Request<?> request, HttpResponse origHttpResponse) {
        HttpResponse toReturn = origHttpResponse;
        for(RequestHandler2 handler : reverseOrderRequestHandlers) {
            toReturn = handler.beforeUnmarshalling(request, toReturn);
        }
        return toReturn;
    }

    @Override
    public void afterAttempt(HandlerAfterAttemptContext context) {
        for(RequestHandler2 handler : reverseOrderRequestHandlers) {
            handler.afterAttempt(context);
        }
    }

    @Override
    public void afterResponse(Request<?> request, Response<?> response) {
        for(RequestHandler2 handler : reverseOrderRequestHandlers) {
            handler.afterResponse(request, response);
        }
    }

    @Override
    public void afterError(Request<?> request, Response<?> response, Exception e) {
        for(RequestHandler2 handler : reverseOrderRequestHandlers) {
            handler.afterError(request, response, e);
        }
    }
}
