/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.apigatewaymanagementapi;

import javax.annotation.Generated;

import com.amazonaws.services.apigatewaymanagementapi.model.*;

/**
 * Interface for accessing AmazonApiGatewayManagementApi asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.apigatewaymanagementapi.AbstractAmazonApiGatewayManagementApiAsync} instead.
 * </p>
 * <p>
 * <p>
 * The Amazon API Gateway Management API allows you to directly manage runtime aspects of your deployed APIs. To use it,
 * you must explicitly set the SDK's endpoint to point to the endpoint of your deployed API. The endpoint will be of the
 * form https://{api-id}.execute-api.{region}.amazonaws.com/{stage}, or will be the endpoint corresponding to your API's
 * custom domain and base path, if applicable.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonApiGatewayManagementApiAsync extends AmazonApiGatewayManagementApi {

    /**
     * <p>
     * Sends the provided data to the specified connection.
     * </p>
     * 
     * @param postToConnectionRequest
     * @return A Java Future containing the result of the PostToConnection operation returned by the service.
     * @sample AmazonApiGatewayManagementApiAsync.PostToConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apigatewaymanagementapi-2018-11-29/PostToConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PostToConnectionResult> postToConnectionAsync(PostToConnectionRequest postToConnectionRequest);

    /**
     * <p>
     * Sends the provided data to the specified connection.
     * </p>
     * 
     * @param postToConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PostToConnection operation returned by the service.
     * @sample AmazonApiGatewayManagementApiAsyncHandler.PostToConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apigatewaymanagementapi-2018-11-29/PostToConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PostToConnectionResult> postToConnectionAsync(PostToConnectionRequest postToConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<PostToConnectionRequest, PostToConnectionResult> asyncHandler);

}
