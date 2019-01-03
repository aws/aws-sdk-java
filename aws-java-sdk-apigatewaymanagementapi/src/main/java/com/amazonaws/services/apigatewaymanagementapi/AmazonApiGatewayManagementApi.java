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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.apigatewaymanagementapi.model.*;

/**
 * Interface for accessing AmazonApiGatewayManagementApi.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.apigatewaymanagementapi.AbstractAmazonApiGatewayManagementApi} instead.
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
public interface AmazonApiGatewayManagementApi {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "execute-api";

    /**
     * <p>
     * Sends the provided data to the specified connection.
     * </p>
     * 
     * @param postToConnectionRequest
     * @return Result of the PostToConnection operation returned by the service.
     * @throws GoneException
     *         The connection with the provided id no longer exists.
     * @throws LimitExceededException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws PayloadTooLargeException
     *         The data has exceeded the maximum size allowed.
     * @throws ForbiddenException
     *         The caller is not authorized to invoke this operation.
     * @sample AmazonApiGatewayManagementApi.PostToConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apigatewaymanagementapi-2018-11-29/PostToConnection"
     *      target="_top">AWS API Documentation</a>
     */
    PostToConnectionResult postToConnection(PostToConnectionRequest postToConnectionRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
