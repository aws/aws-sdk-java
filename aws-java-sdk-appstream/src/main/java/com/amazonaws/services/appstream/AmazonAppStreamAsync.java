/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appstream;

import javax.annotation.Generated;

import com.amazonaws.services.appstream.model.*;

/**
 * Interface for accessing Amazon AppStream asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.appstream.AbstractAmazonAppStreamAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon AppStream 2.0</fullname>
 * <p>
 * You can use Amazon AppStream 2.0 to stream desktop applications to any device running a web browser, without
 * rewriting them.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonAppStreamAsync extends AmazonAppStream {

    /**
     * <p>
     * Associates the specified fleet with the specified stack.
     * </p>
     * 
     * @param associateFleetRequest
     * @return A Java Future containing the result of the AssociateFleet operation returned by the service.
     * @sample AmazonAppStreamAsync.AssociateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/AssociateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateFleetResult> associateFleetAsync(AssociateFleetRequest associateFleetRequest);

    /**
     * <p>
     * Associates the specified fleet with the specified stack.
     * </p>
     * 
     * @param associateFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateFleet operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.AssociateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/AssociateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateFleetResult> associateFleetAsync(AssociateFleetRequest associateFleetRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateFleetRequest, AssociateFleetResult> asyncHandler);

    /**
     * <p>
     * Creates a directory configuration.
     * </p>
     * 
     * @param createDirectoryConfigRequest
     * @return A Java Future containing the result of the CreateDirectoryConfig operation returned by the service.
     * @sample AmazonAppStreamAsync.CreateDirectoryConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateDirectoryConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDirectoryConfigResult> createDirectoryConfigAsync(CreateDirectoryConfigRequest createDirectoryConfigRequest);

    /**
     * <p>
     * Creates a directory configuration.
     * </p>
     * 
     * @param createDirectoryConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDirectoryConfig operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.CreateDirectoryConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateDirectoryConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDirectoryConfigResult> createDirectoryConfigAsync(CreateDirectoryConfigRequest createDirectoryConfigRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDirectoryConfigRequest, CreateDirectoryConfigResult> asyncHandler);

    /**
     * <p>
     * Creates a fleet.
     * </p>
     * 
     * @param createFleetRequest
     * @return A Java Future containing the result of the CreateFleet operation returned by the service.
     * @sample AmazonAppStreamAsync.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest createFleetRequest);

    /**
     * <p>
     * Creates a fleet.
     * </p>
     * 
     * @param createFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFleet operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest createFleetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFleetRequest, CreateFleetResult> asyncHandler);

    /**
     * <p>
     * Creates an image builder.
     * </p>
     * <p>
     * The initial state of the builder is <code>PENDING</code>. When it is ready, the state is <code>RUNNING</code>.
     * </p>
     * 
     * @param createImageBuilderRequest
     * @return A Java Future containing the result of the CreateImageBuilder operation returned by the service.
     * @sample AmazonAppStreamAsync.CreateImageBuilder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateImageBuilder" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateImageBuilderResult> createImageBuilderAsync(CreateImageBuilderRequest createImageBuilderRequest);

    /**
     * <p>
     * Creates an image builder.
     * </p>
     * <p>
     * The initial state of the builder is <code>PENDING</code>. When it is ready, the state is <code>RUNNING</code>.
     * </p>
     * 
     * @param createImageBuilderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateImageBuilder operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.CreateImageBuilder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateImageBuilder" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateImageBuilderResult> createImageBuilderAsync(CreateImageBuilderRequest createImageBuilderRequest,
            com.amazonaws.handlers.AsyncHandler<CreateImageBuilderRequest, CreateImageBuilderResult> asyncHandler);

    /**
     * <p>
     * Creates a URL to start an image builder streaming session.
     * </p>
     * 
     * @param createImageBuilderStreamingURLRequest
     * @return A Java Future containing the result of the CreateImageBuilderStreamingURL operation returned by the
     *         service.
     * @sample AmazonAppStreamAsync.CreateImageBuilderStreamingURL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateImageBuilderStreamingURL"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateImageBuilderStreamingURLResult> createImageBuilderStreamingURLAsync(
            CreateImageBuilderStreamingURLRequest createImageBuilderStreamingURLRequest);

    /**
     * <p>
     * Creates a URL to start an image builder streaming session.
     * </p>
     * 
     * @param createImageBuilderStreamingURLRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateImageBuilderStreamingURL operation returned by the
     *         service.
     * @sample AmazonAppStreamAsyncHandler.CreateImageBuilderStreamingURL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateImageBuilderStreamingURL"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateImageBuilderStreamingURLResult> createImageBuilderStreamingURLAsync(
            CreateImageBuilderStreamingURLRequest createImageBuilderStreamingURLRequest,
            com.amazonaws.handlers.AsyncHandler<CreateImageBuilderStreamingURLRequest, CreateImageBuilderStreamingURLResult> asyncHandler);

    /**
     * <p>
     * Creates a stack.
     * </p>
     * 
     * @param createStackRequest
     * @return A Java Future containing the result of the CreateStack operation returned by the service.
     * @sample AmazonAppStreamAsync.CreateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateStackResult> createStackAsync(CreateStackRequest createStackRequest);

    /**
     * <p>
     * Creates a stack.
     * </p>
     * 
     * @param createStackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStack operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.CreateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateStackResult> createStackAsync(CreateStackRequest createStackRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStackRequest, CreateStackResult> asyncHandler);

    /**
     * <p>
     * Creates a URL to start a streaming session for the specified user.
     * </p>
     * 
     * @param createStreamingURLRequest
     * @return A Java Future containing the result of the CreateStreamingURL operation returned by the service.
     * @sample AmazonAppStreamAsync.CreateStreamingURL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateStreamingURL" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateStreamingURLResult> createStreamingURLAsync(CreateStreamingURLRequest createStreamingURLRequest);

    /**
     * <p>
     * Creates a URL to start a streaming session for the specified user.
     * </p>
     * 
     * @param createStreamingURLRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStreamingURL operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.CreateStreamingURL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateStreamingURL" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateStreamingURLResult> createStreamingURLAsync(CreateStreamingURLRequest createStreamingURLRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStreamingURLRequest, CreateStreamingURLResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified directory configuration.
     * </p>
     * 
     * @param deleteDirectoryConfigRequest
     * @return A Java Future containing the result of the DeleteDirectoryConfig operation returned by the service.
     * @sample AmazonAppStreamAsync.DeleteDirectoryConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteDirectoryConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDirectoryConfigResult> deleteDirectoryConfigAsync(DeleteDirectoryConfigRequest deleteDirectoryConfigRequest);

    /**
     * <p>
     * Deletes the specified directory configuration.
     * </p>
     * 
     * @param deleteDirectoryConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDirectoryConfig operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.DeleteDirectoryConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteDirectoryConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDirectoryConfigResult> deleteDirectoryConfigAsync(DeleteDirectoryConfigRequest deleteDirectoryConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDirectoryConfigRequest, DeleteDirectoryConfigResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified fleet.
     * </p>
     * 
     * @param deleteFleetRequest
     * @return A Java Future containing the result of the DeleteFleet operation returned by the service.
     * @sample AmazonAppStreamAsync.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest deleteFleetRequest);

    /**
     * <p>
     * Deletes the specified fleet.
     * </p>
     * 
     * @param deleteFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFleet operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest deleteFleetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFleetRequest, DeleteFleetResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified image. You cannot delete an image that is currently in use. After you delete an image, you
     * cannot provision new capacity using the image.
     * </p>
     * 
     * @param deleteImageRequest
     * @return A Java Future containing the result of the DeleteImage operation returned by the service.
     * @sample AmazonAppStreamAsync.DeleteImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteImageResult> deleteImageAsync(DeleteImageRequest deleteImageRequest);

    /**
     * <p>
     * Deletes the specified image. You cannot delete an image that is currently in use. After you delete an image, you
     * cannot provision new capacity using the image.
     * </p>
     * 
     * @param deleteImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteImage operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.DeleteImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteImageResult> deleteImageAsync(DeleteImageRequest deleteImageRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteImageRequest, DeleteImageResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified image builder and releases the capacity.
     * </p>
     * 
     * @param deleteImageBuilderRequest
     * @return A Java Future containing the result of the DeleteImageBuilder operation returned by the service.
     * @sample AmazonAppStreamAsync.DeleteImageBuilder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteImageBuilder" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteImageBuilderResult> deleteImageBuilderAsync(DeleteImageBuilderRequest deleteImageBuilderRequest);

    /**
     * <p>
     * Deletes the specified image builder and releases the capacity.
     * </p>
     * 
     * @param deleteImageBuilderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteImageBuilder operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.DeleteImageBuilder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteImageBuilder" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteImageBuilderResult> deleteImageBuilderAsync(DeleteImageBuilderRequest deleteImageBuilderRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteImageBuilderRequest, DeleteImageBuilderResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified stack. After this operation completes, the environment can no longer be activated and any
     * reservations made for the stack are released.
     * </p>
     * 
     * @param deleteStackRequest
     * @return A Java Future containing the result of the DeleteStack operation returned by the service.
     * @sample AmazonAppStreamAsync.DeleteStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStackResult> deleteStackAsync(DeleteStackRequest deleteStackRequest);

    /**
     * <p>
     * Deletes the specified stack. After this operation completes, the environment can no longer be activated and any
     * reservations made for the stack are released.
     * </p>
     * 
     * @param deleteStackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStack operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.DeleteStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStackResult> deleteStackAsync(DeleteStackRequest deleteStackRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStackRequest, DeleteStackResult> asyncHandler);

    /**
     * <p>
     * Describes the specified directory configurations.
     * </p>
     * 
     * @param describeDirectoryConfigsRequest
     * @return A Java Future containing the result of the DescribeDirectoryConfigs operation returned by the service.
     * @sample AmazonAppStreamAsync.DescribeDirectoryConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeDirectoryConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDirectoryConfigsResult> describeDirectoryConfigsAsync(DescribeDirectoryConfigsRequest describeDirectoryConfigsRequest);

    /**
     * <p>
     * Describes the specified directory configurations.
     * </p>
     * 
     * @param describeDirectoryConfigsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDirectoryConfigs operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.DescribeDirectoryConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeDirectoryConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDirectoryConfigsResult> describeDirectoryConfigsAsync(DescribeDirectoryConfigsRequest describeDirectoryConfigsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDirectoryConfigsRequest, DescribeDirectoryConfigsResult> asyncHandler);

    /**
     * <p>
     * Describes the specified fleets or all fleets in the account.
     * </p>
     * 
     * @param describeFleetsRequest
     * @return A Java Future containing the result of the DescribeFleets operation returned by the service.
     * @sample AmazonAppStreamAsync.DescribeFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeFleets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetsResult> describeFleetsAsync(DescribeFleetsRequest describeFleetsRequest);

    /**
     * <p>
     * Describes the specified fleets or all fleets in the account.
     * </p>
     * 
     * @param describeFleetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFleets operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.DescribeFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeFleets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetsResult> describeFleetsAsync(DescribeFleetsRequest describeFleetsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetsRequest, DescribeFleetsResult> asyncHandler);

    /**
     * <p>
     * Describes the specified image builders or all image builders in the account.
     * </p>
     * 
     * @param describeImageBuildersRequest
     * @return A Java Future containing the result of the DescribeImageBuilders operation returned by the service.
     * @sample AmazonAppStreamAsync.DescribeImageBuilders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeImageBuilders"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeImageBuildersResult> describeImageBuildersAsync(DescribeImageBuildersRequest describeImageBuildersRequest);

    /**
     * <p>
     * Describes the specified image builders or all image builders in the account.
     * </p>
     * 
     * @param describeImageBuildersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeImageBuilders operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.DescribeImageBuilders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeImageBuilders"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeImageBuildersResult> describeImageBuildersAsync(DescribeImageBuildersRequest describeImageBuildersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeImageBuildersRequest, DescribeImageBuildersResult> asyncHandler);

    /**
     * <p>
     * Describes the specified images or all images in the account.
     * </p>
     * 
     * @param describeImagesRequest
     * @return A Java Future containing the result of the DescribeImages operation returned by the service.
     * @sample AmazonAppStreamAsync.DescribeImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeImages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(DescribeImagesRequest describeImagesRequest);

    /**
     * <p>
     * Describes the specified images or all images in the account.
     * </p>
     * 
     * @param describeImagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeImages operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.DescribeImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeImages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(DescribeImagesRequest describeImagesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeImagesRequest, DescribeImagesResult> asyncHandler);

    /**
     * <p>
     * Describes the streaming sessions for the specified stack and fleet. If a user ID is provided, only the streaming
     * sessions for only that user are returned. If an authentication type is not provided, the default is to
     * authenticate users using a streaming URL.
     * </p>
     * 
     * @param describeSessionsRequest
     * @return A Java Future containing the result of the DescribeSessions operation returned by the service.
     * @sample AmazonAppStreamAsync.DescribeSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeSessions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSessionsResult> describeSessionsAsync(DescribeSessionsRequest describeSessionsRequest);

    /**
     * <p>
     * Describes the streaming sessions for the specified stack and fleet. If a user ID is provided, only the streaming
     * sessions for only that user are returned. If an authentication type is not provided, the default is to
     * authenticate users using a streaming URL.
     * </p>
     * 
     * @param describeSessionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSessions operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.DescribeSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeSessions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSessionsResult> describeSessionsAsync(DescribeSessionsRequest describeSessionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSessionsRequest, DescribeSessionsResult> asyncHandler);

    /**
     * <p>
     * Describes the specified stacks or all stacks in the account.
     * </p>
     * 
     * @param describeStacksRequest
     * @return A Java Future containing the result of the DescribeStacks operation returned by the service.
     * @sample AmazonAppStreamAsync.DescribeStacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeStacks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(DescribeStacksRequest describeStacksRequest);

    /**
     * <p>
     * Describes the specified stacks or all stacks in the account.
     * </p>
     * 
     * @param describeStacksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStacks operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.DescribeStacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeStacks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(DescribeStacksRequest describeStacksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStacksRequest, DescribeStacksResult> asyncHandler);

    /**
     * <p>
     * Disassociates the specified fleet from the specified stack.
     * </p>
     * 
     * @param disassociateFleetRequest
     * @return A Java Future containing the result of the DisassociateFleet operation returned by the service.
     * @sample AmazonAppStreamAsync.DisassociateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DisassociateFleet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFleetResult> disassociateFleetAsync(DisassociateFleetRequest disassociateFleetRequest);

    /**
     * <p>
     * Disassociates the specified fleet from the specified stack.
     * </p>
     * 
     * @param disassociateFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateFleet operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.DisassociateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DisassociateFleet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFleetResult> disassociateFleetAsync(DisassociateFleetRequest disassociateFleetRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateFleetRequest, DisassociateFleetResult> asyncHandler);

    /**
     * <p>
     * Stops the specified streaming session.
     * </p>
     * 
     * @param expireSessionRequest
     * @return A Java Future containing the result of the ExpireSession operation returned by the service.
     * @sample AmazonAppStreamAsync.ExpireSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ExpireSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExpireSessionResult> expireSessionAsync(ExpireSessionRequest expireSessionRequest);

    /**
     * <p>
     * Stops the specified streaming session.
     * </p>
     * 
     * @param expireSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExpireSession operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.ExpireSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ExpireSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExpireSessionResult> expireSessionAsync(ExpireSessionRequest expireSessionRequest,
            com.amazonaws.handlers.AsyncHandler<ExpireSessionRequest, ExpireSessionResult> asyncHandler);

    /**
     * <p>
     * Lists the fleets associated with the specified stack.
     * </p>
     * 
     * @param listAssociatedFleetsRequest
     * @return A Java Future containing the result of the ListAssociatedFleets operation returned by the service.
     * @sample AmazonAppStreamAsync.ListAssociatedFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ListAssociatedFleets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociatedFleetsResult> listAssociatedFleetsAsync(ListAssociatedFleetsRequest listAssociatedFleetsRequest);

    /**
     * <p>
     * Lists the fleets associated with the specified stack.
     * </p>
     * 
     * @param listAssociatedFleetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssociatedFleets operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.ListAssociatedFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ListAssociatedFleets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociatedFleetsResult> listAssociatedFleetsAsync(ListAssociatedFleetsRequest listAssociatedFleetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssociatedFleetsRequest, ListAssociatedFleetsResult> asyncHandler);

    /**
     * <p>
     * Lists the stacks associated with the specified fleet.
     * </p>
     * 
     * @param listAssociatedStacksRequest
     * @return A Java Future containing the result of the ListAssociatedStacks operation returned by the service.
     * @sample AmazonAppStreamAsync.ListAssociatedStacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ListAssociatedStacks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociatedStacksResult> listAssociatedStacksAsync(ListAssociatedStacksRequest listAssociatedStacksRequest);

    /**
     * <p>
     * Lists the stacks associated with the specified fleet.
     * </p>
     * 
     * @param listAssociatedStacksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssociatedStacks operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.ListAssociatedStacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ListAssociatedStacks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociatedStacksResult> listAssociatedStacksAsync(ListAssociatedStacksRequest listAssociatedStacksRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssociatedStacksRequest, ListAssociatedStacksResult> asyncHandler);

    /**
     * <p>
     * Lists the tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders, images,
     * fleets, and stacks.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="http://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic">Tagging Your Resources</a> in
     * the <i>Amazon AppStream 2.0 Developer Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonAppStreamAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders, images,
     * fleets, and stacks.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="http://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic">Tagging Your Resources</a> in
     * the <i>Amazon AppStream 2.0 Developer Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Starts the specified fleet.
     * </p>
     * 
     * @param startFleetRequest
     * @return A Java Future containing the result of the StartFleet operation returned by the service.
     * @sample AmazonAppStreamAsync.StartFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StartFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartFleetResult> startFleetAsync(StartFleetRequest startFleetRequest);

    /**
     * <p>
     * Starts the specified fleet.
     * </p>
     * 
     * @param startFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartFleet operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.StartFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StartFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartFleetResult> startFleetAsync(StartFleetRequest startFleetRequest,
            com.amazonaws.handlers.AsyncHandler<StartFleetRequest, StartFleetResult> asyncHandler);

    /**
     * <p>
     * Starts the specified image builder.
     * </p>
     * 
     * @param startImageBuilderRequest
     * @return A Java Future containing the result of the StartImageBuilder operation returned by the service.
     * @sample AmazonAppStreamAsync.StartImageBuilder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StartImageBuilder" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartImageBuilderResult> startImageBuilderAsync(StartImageBuilderRequest startImageBuilderRequest);

    /**
     * <p>
     * Starts the specified image builder.
     * </p>
     * 
     * @param startImageBuilderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartImageBuilder operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.StartImageBuilder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StartImageBuilder" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartImageBuilderResult> startImageBuilderAsync(StartImageBuilderRequest startImageBuilderRequest,
            com.amazonaws.handlers.AsyncHandler<StartImageBuilderRequest, StartImageBuilderResult> asyncHandler);

    /**
     * <p>
     * Stops the specified fleet.
     * </p>
     * 
     * @param stopFleetRequest
     * @return A Java Future containing the result of the StopFleet operation returned by the service.
     * @sample AmazonAppStreamAsync.StopFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StopFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopFleetResult> stopFleetAsync(StopFleetRequest stopFleetRequest);

    /**
     * <p>
     * Stops the specified fleet.
     * </p>
     * 
     * @param stopFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopFleet operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.StopFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StopFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopFleetResult> stopFleetAsync(StopFleetRequest stopFleetRequest,
            com.amazonaws.handlers.AsyncHandler<StopFleetRequest, StopFleetResult> asyncHandler);

    /**
     * <p>
     * Stops the specified image builder.
     * </p>
     * 
     * @param stopImageBuilderRequest
     * @return A Java Future containing the result of the StopImageBuilder operation returned by the service.
     * @sample AmazonAppStreamAsync.StopImageBuilder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StopImageBuilder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopImageBuilderResult> stopImageBuilderAsync(StopImageBuilderRequest stopImageBuilderRequest);

    /**
     * <p>
     * Stops the specified image builder.
     * </p>
     * 
     * @param stopImageBuilderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopImageBuilder operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.StopImageBuilder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StopImageBuilder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopImageBuilderResult> stopImageBuilderAsync(StopImageBuilderRequest stopImageBuilderRequest,
            com.amazonaws.handlers.AsyncHandler<StopImageBuilderRequest, StopImageBuilderResult> asyncHandler);

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image
     * builders, images, fleets, and stacks.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a resource already has a tag with the same key, this
     * operation updates its value.
     * </p>
     * <p>
     * To list the current tags for your resources, use <a>ListTagsForResource</a>. To disassociate tags from your
     * resources, use <a>UntagResource</a>.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="http://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic">Tagging Your Resources</a> in
     * the <i>Amazon AppStream 2.0 Developer Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonAppStreamAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image
     * builders, images, fleets, and stacks.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a resource already has a tag with the same key, this
     * operation updates its value.
     * </p>
     * <p>
     * To list the current tags for your resources, use <a>ListTagsForResource</a>. To disassociate tags from your
     * resources, use <a>UntagResource</a>.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="http://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic">Tagging Your Resources</a> in
     * the <i>Amazon AppStream 2.0 Developer Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Disassociates the specified tags from the specified AppStream 2.0 resource.
     * </p>
     * <p>
     * To list the current tags for your resources, use <a>ListTagsForResource</a>.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="http://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic">Tagging Your Resources</a> in
     * the <i>Amazon AppStream 2.0 Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonAppStreamAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Disassociates the specified tags from the specified AppStream 2.0 resource.
     * </p>
     * <p>
     * To list the current tags for your resources, use <a>ListTagsForResource</a>.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="http://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic">Tagging Your Resources</a> in
     * the <i>Amazon AppStream 2.0 Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the specified directory configuration.
     * </p>
     * 
     * @param updateDirectoryConfigRequest
     * @return A Java Future containing the result of the UpdateDirectoryConfig operation returned by the service.
     * @sample AmazonAppStreamAsync.UpdateDirectoryConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateDirectoryConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDirectoryConfigResult> updateDirectoryConfigAsync(UpdateDirectoryConfigRequest updateDirectoryConfigRequest);

    /**
     * <p>
     * Updates the specified directory configuration.
     * </p>
     * 
     * @param updateDirectoryConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDirectoryConfig operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.UpdateDirectoryConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateDirectoryConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDirectoryConfigResult> updateDirectoryConfigAsync(UpdateDirectoryConfigRequest updateDirectoryConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDirectoryConfigRequest, UpdateDirectoryConfigResult> asyncHandler);

    /**
     * <p>
     * Updates the specified fleet.
     * </p>
     * <p>
     * If the fleet is in the <code>STOPPED</code> state, you can update any attribute except the fleet name. If the
     * fleet is in the <code>RUNNING</code> state, you can update the <code>DisplayName</code> and
     * <code>ComputeCapacity</code> attributes. If the fleet is in the <code>STARTING</code> or <code>STOPPING</code>
     * state, you can't update it.
     * </p>
     * 
     * @param updateFleetRequest
     * @return A Java Future containing the result of the UpdateFleet operation returned by the service.
     * @sample AmazonAppStreamAsync.UpdateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFleetResult> updateFleetAsync(UpdateFleetRequest updateFleetRequest);

    /**
     * <p>
     * Updates the specified fleet.
     * </p>
     * <p>
     * If the fleet is in the <code>STOPPED</code> state, you can update any attribute except the fleet name. If the
     * fleet is in the <code>RUNNING</code> state, you can update the <code>DisplayName</code> and
     * <code>ComputeCapacity</code> attributes. If the fleet is in the <code>STARTING</code> or <code>STOPPING</code>
     * state, you can't update it.
     * </p>
     * 
     * @param updateFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFleet operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.UpdateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFleetResult> updateFleetAsync(UpdateFleetRequest updateFleetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFleetRequest, UpdateFleetResult> asyncHandler);

    /**
     * <p>
     * Updates the specified stack.
     * </p>
     * 
     * @param updateStackRequest
     * @return A Java Future containing the result of the UpdateStack operation returned by the service.
     * @sample AmazonAppStreamAsync.UpdateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateStackResult> updateStackAsync(UpdateStackRequest updateStackRequest);

    /**
     * <p>
     * Updates the specified stack.
     * </p>
     * 
     * @param updateStackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStack operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.UpdateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateStackResult> updateStackAsync(UpdateStackRequest updateStackRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStackRequest, UpdateStackResult> asyncHandler);

}
