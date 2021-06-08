/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemakeredgemanager;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.sagemakeredgemanager.model.*;

/**
 * Interface for accessing Amazon Sagemaker Edge Manager.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.sagemakeredgemanager.AbstractAmazonSagemakerEdgeManager} instead.
 * </p>
 * <p>
 * <p>
 * SageMaker Edge Manager dataplane service for communicating with active agents.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonSagemakerEdgeManager {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "edge.sagemaker";

    /**
     * <p>
     * Use to check if a device is registered with SageMaker Edge Manager.
     * </p>
     * 
     * @param getDeviceRegistrationRequest
     * @return Result of the GetDeviceRegistration operation returned by the service.
     * @throws InternalServiceException
     *         An internal failure occurred. Try your request again. If the problem persists, contact AWS customer
     *         support.
     * @sample AmazonSagemakerEdgeManager.GetDeviceRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-edge-2020-09-23/GetDeviceRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    GetDeviceRegistrationResult getDeviceRegistration(GetDeviceRegistrationRequest getDeviceRegistrationRequest);

    /**
     * <p>
     * Use to get the current status of devices registered on SageMaker Edge Manager.
     * </p>
     * 
     * @param sendHeartbeatRequest
     * @return Result of the SendHeartbeat operation returned by the service.
     * @throws InternalServiceException
     *         An internal failure occurred. Try your request again. If the problem persists, contact AWS customer
     *         support.
     * @sample AmazonSagemakerEdgeManager.SendHeartbeat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-edge-2020-09-23/SendHeartbeat" target="_top">AWS
     *      API Documentation</a>
     */
    SendHeartbeatResult sendHeartbeat(SendHeartbeatRequest sendHeartbeatRequest);

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
