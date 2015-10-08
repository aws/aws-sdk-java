/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotdata;

import com.amazonaws.services.iotdata.model.*;

/**
 * Interface for accessing AWS IoT Data Plane asynchronously. Each asynchronous
 * method will return a Java Future object representing the asynchronous
 * operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 */
public interface AWSIotDataAsync extends AWSIotData {

    /**
     * Invokes the DeleteThingShadow operation asynchronously.
     * 
     * @param deleteThingShadowRequest
     * @return A Java Future containing the result of the DeleteThingShadow
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DeleteThingShadowResult> deleteThingShadowAsync(
            DeleteThingShadowRequest deleteThingShadowRequest);

    /**
     * Invokes the DeleteThingShadow operation asynchronously.
     * 
     * @param deleteThingShadowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteThingShadow
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DeleteThingShadowResult> deleteThingShadowAsync(
            DeleteThingShadowRequest deleteThingShadowRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteThingShadowRequest, DeleteThingShadowResult> asyncHandler);

    /**
     * Invokes the GetThingShadow operation asynchronously.
     * 
     * @param getThingShadowRequest
     * @return A Java Future containing the result of the GetThingShadow
     *         operation returned by the service.
     */
    java.util.concurrent.Future<GetThingShadowResult> getThingShadowAsync(
            GetThingShadowRequest getThingShadowRequest);

    /**
     * Invokes the GetThingShadow operation asynchronously.
     * 
     * @param getThingShadowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetThingShadow
     *         operation returned by the service.
     */
    java.util.concurrent.Future<GetThingShadowResult> getThingShadowAsync(
            GetThingShadowRequest getThingShadowRequest,
            com.amazonaws.handlers.AsyncHandler<GetThingShadowRequest, GetThingShadowResult> asyncHandler);

    /**
     * Invokes the Publish operation asynchronously.
     * 
     * @param publishRequest
     */
    java.util.concurrent.Future<Void> publishAsync(PublishRequest publishRequest);

    /**
     * Invokes the Publish operation asynchronously.
     * 
     * @param publishRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     */
    java.util.concurrent.Future<Void> publishAsync(
            PublishRequest publishRequest,
            com.amazonaws.handlers.AsyncHandler<PublishRequest, Void> asyncHandler);

    /**
     * Invokes the UpdateThingShadow operation asynchronously.
     * 
     * @param updateThingShadowRequest
     * @return A Java Future containing the result of the UpdateThingShadow
     *         operation returned by the service.
     */
    java.util.concurrent.Future<UpdateThingShadowResult> updateThingShadowAsync(
            UpdateThingShadowRequest updateThingShadowRequest);

    /**
     * Invokes the UpdateThingShadow operation asynchronously.
     * 
     * @param updateThingShadowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateThingShadow
     *         operation returned by the service.
     */
    java.util.concurrent.Future<UpdateThingShadowResult> updateThingShadowAsync(
            UpdateThingShadowRequest updateThingShadowRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateThingShadowRequest, UpdateThingShadowResult> asyncHandler);

}
