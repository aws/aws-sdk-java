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

import com.amazonaws.services.sagemakeredgemanager.model.*;

/**
 * Interface for accessing Amazon Sagemaker Edge Manager asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.sagemakeredgemanager.AbstractAmazonSagemakerEdgeManagerAsync} instead.
 * </p>
 * <p>
 * <p>
 * SageMaker Edge Manager dataplane service for communicating with active agents.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonSagemakerEdgeManagerAsync extends AmazonSagemakerEdgeManager {

    /**
     * <p>
     * Use to check if a device is registered with SageMaker Edge Manager.
     * </p>
     * 
     * @param getDeviceRegistrationRequest
     * @return A Java Future containing the result of the GetDeviceRegistration operation returned by the service.
     * @sample AmazonSagemakerEdgeManagerAsync.GetDeviceRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-edge-2020-09-23/GetDeviceRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDeviceRegistrationResult> getDeviceRegistrationAsync(GetDeviceRegistrationRequest getDeviceRegistrationRequest);

    /**
     * <p>
     * Use to check if a device is registered with SageMaker Edge Manager.
     * </p>
     * 
     * @param getDeviceRegistrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeviceRegistration operation returned by the service.
     * @sample AmazonSagemakerEdgeManagerAsyncHandler.GetDeviceRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-edge-2020-09-23/GetDeviceRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDeviceRegistrationResult> getDeviceRegistrationAsync(GetDeviceRegistrationRequest getDeviceRegistrationRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeviceRegistrationRequest, GetDeviceRegistrationResult> asyncHandler);

    /**
     * <p>
     * Use to get the current status of devices registered on SageMaker Edge Manager.
     * </p>
     * 
     * @param sendHeartbeatRequest
     * @return A Java Future containing the result of the SendHeartbeat operation returned by the service.
     * @sample AmazonSagemakerEdgeManagerAsync.SendHeartbeat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-edge-2020-09-23/SendHeartbeat" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SendHeartbeatResult> sendHeartbeatAsync(SendHeartbeatRequest sendHeartbeatRequest);

    /**
     * <p>
     * Use to get the current status of devices registered on SageMaker Edge Manager.
     * </p>
     * 
     * @param sendHeartbeatRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendHeartbeat operation returned by the service.
     * @sample AmazonSagemakerEdgeManagerAsyncHandler.SendHeartbeat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-edge-2020-09-23/SendHeartbeat" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SendHeartbeatResult> sendHeartbeatAsync(SendHeartbeatRequest sendHeartbeatRequest,
            com.amazonaws.handlers.AsyncHandler<SendHeartbeatRequest, SendHeartbeatResult> asyncHandler);

}
