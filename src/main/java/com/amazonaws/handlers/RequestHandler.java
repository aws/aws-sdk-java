/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Interface for addition request handling in clients. A request handler is
 * executed on a request object <b>before</b> it is sent to the client runtime
 * to be executed.
 */
public interface RequestHandler {

    /**
     * Runs any additional processing logic on the specified request (before it
     * is executed by the client runtime), then hands back the updated request
     * object.
     * 
     * @param <T>
     *            Indicates the parameterized type of the request being
     *            processed by this handler.
     * 
     * @param request
     *            The request being processed by this handler.
     * 
     * @return The updated request object.
     */
    public <T> Request<T> handleRequest(Request<T> request);

}
