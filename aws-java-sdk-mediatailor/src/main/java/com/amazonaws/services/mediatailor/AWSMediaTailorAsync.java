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
package com.amazonaws.services.mediatailor;

import javax.annotation.Generated;

import com.amazonaws.services.mediatailor.model.*;

/**
 * Interface for accessing MediaTailor asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mediatailor.AbstractAWSMediaTailorAsync} instead.
 * </p>
 * <p>
 * <p>
 * Use the AWS Elemental MediaTailor SDK to configure scalable ad insertion for your live and VOD content. With AWS
 * Elemental MediaTailor, you can serve targeted ads to viewers while maintaining broadcast quality in over-the-top
 * (OTT) video applications. For information about using the service, including detailed information about the settings
 * covered in this guide, see the AWS Elemental MediaTailor User Guide.
 * <p>
 * Through the SDK, you manage AWS Elemental MediaTailor configurations the same as you do through the console. For
 * example, you specify ad insertion behavior and mapping information for the origin server and the ad decision server
 * (ADS).
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMediaTailorAsync extends AWSMediaTailor {

    /**
     * <p>
     * Deletes the configuration for the specified name.
     * </p>
     * 
     * @param deletePlaybackConfigurationRequest
     * @return A Java Future containing the result of the DeletePlaybackConfiguration operation returned by the service.
     * @sample AWSMediaTailorAsync.DeletePlaybackConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeletePlaybackConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePlaybackConfigurationResult> deletePlaybackConfigurationAsync(
            DeletePlaybackConfigurationRequest deletePlaybackConfigurationRequest);

    /**
     * <p>
     * Deletes the configuration for the specified name.
     * </p>
     * 
     * @param deletePlaybackConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePlaybackConfiguration operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.DeletePlaybackConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeletePlaybackConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePlaybackConfigurationResult> deletePlaybackConfigurationAsync(
            DeletePlaybackConfigurationRequest deletePlaybackConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePlaybackConfigurationRequest, DeletePlaybackConfigurationResult> asyncHandler);

    /**
     * <p>
     * Returns the configuration for the specified name.
     * </p>
     * 
     * @param getPlaybackConfigurationRequest
     * @return A Java Future containing the result of the GetPlaybackConfiguration operation returned by the service.
     * @sample AWSMediaTailorAsync.GetPlaybackConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/GetPlaybackConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPlaybackConfigurationResult> getPlaybackConfigurationAsync(GetPlaybackConfigurationRequest getPlaybackConfigurationRequest);

    /**
     * <p>
     * Returns the configuration for the specified name.
     * </p>
     * 
     * @param getPlaybackConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPlaybackConfiguration operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.GetPlaybackConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/GetPlaybackConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPlaybackConfigurationResult> getPlaybackConfigurationAsync(GetPlaybackConfigurationRequest getPlaybackConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetPlaybackConfigurationRequest, GetPlaybackConfigurationResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the configurations defined in AWS Elemental MediaTailor. You can specify a max number of
     * configurations to return at a time. The default max is 50. Results are returned in pagefuls. If AWS Elemental
     * MediaTailor has more configurations than the specified max, it provides parameters in the response that you can
     * use to retrieve the next pageful.
     * </p>
     * 
     * @param listPlaybackConfigurationsRequest
     * @return A Java Future containing the result of the ListPlaybackConfigurations operation returned by the service.
     * @sample AWSMediaTailorAsync.ListPlaybackConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListPlaybackConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPlaybackConfigurationsResult> listPlaybackConfigurationsAsync(
            ListPlaybackConfigurationsRequest listPlaybackConfigurationsRequest);

    /**
     * <p>
     * Returns a list of the configurations defined in AWS Elemental MediaTailor. You can specify a max number of
     * configurations to return at a time. The default max is 50. Results are returned in pagefuls. If AWS Elemental
     * MediaTailor has more configurations than the specified max, it provides parameters in the response that you can
     * use to retrieve the next pageful.
     * </p>
     * 
     * @param listPlaybackConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPlaybackConfigurations operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.ListPlaybackConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListPlaybackConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPlaybackConfigurationsResult> listPlaybackConfigurationsAsync(
            ListPlaybackConfigurationsRequest listPlaybackConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPlaybackConfigurationsRequest, ListPlaybackConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Adds a new configuration to AWS Elemental MediaTailor.
     * </p>
     * 
     * @param putPlaybackConfigurationRequest
     * @return A Java Future containing the result of the PutPlaybackConfiguration operation returned by the service.
     * @sample AWSMediaTailorAsync.PutPlaybackConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/PutPlaybackConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutPlaybackConfigurationResult> putPlaybackConfigurationAsync(PutPlaybackConfigurationRequest putPlaybackConfigurationRequest);

    /**
     * <p>
     * Adds a new configuration to AWS Elemental MediaTailor.
     * </p>
     * 
     * @param putPlaybackConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutPlaybackConfiguration operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.PutPlaybackConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/PutPlaybackConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutPlaybackConfigurationResult> putPlaybackConfigurationAsync(PutPlaybackConfigurationRequest putPlaybackConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutPlaybackConfigurationRequest, PutPlaybackConfigurationResult> asyncHandler);

}
