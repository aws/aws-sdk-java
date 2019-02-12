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
 * This is the <i>Amazon AppStream 2.0 API Reference</i>. This reference provides descriptions and syntax for each of
 * the actions and data types in AppStream 2.0. AppStream 2.0 is a fully managed application streaming service. You
 * centrally manage your desktop applications on AppStream 2.0 and securely deliver them to any computer. AppStream 2.0
 * manages the AWS resources required to host and run your applications, scales automatically, and provides access to
 * your users on demand.
 * </p>
 * <p>
 * To learn more about AppStream 2.0, see the following resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/appstream2">Amazon AppStream 2.0 product page</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/documentation/appstream2">Amazon AppStream 2.0 documentation</a>
 * </p>
 * </li>
 * </ul>
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
     * Associates the specified users with the specified stacks. Users in a user pool cannot be assigned to stacks with
     * fleets that are joined to an Active Directory domain.
     * </p>
     * 
     * @param batchAssociateUserStackRequest
     * @return A Java Future containing the result of the BatchAssociateUserStack operation returned by the service.
     * @sample AmazonAppStreamAsync.BatchAssociateUserStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/BatchAssociateUserStack"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchAssociateUserStackResult> batchAssociateUserStackAsync(BatchAssociateUserStackRequest batchAssociateUserStackRequest);

    /**
     * <p>
     * Associates the specified users with the specified stacks. Users in a user pool cannot be assigned to stacks with
     * fleets that are joined to an Active Directory domain.
     * </p>
     * 
     * @param batchAssociateUserStackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchAssociateUserStack operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.BatchAssociateUserStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/BatchAssociateUserStack"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchAssociateUserStackResult> batchAssociateUserStackAsync(BatchAssociateUserStackRequest batchAssociateUserStackRequest,
            com.amazonaws.handlers.AsyncHandler<BatchAssociateUserStackRequest, BatchAssociateUserStackResult> asyncHandler);

    /**
     * <p>
     * Disassociates the specified users from the specified stacks.
     * </p>
     * 
     * @param batchDisassociateUserStackRequest
     * @return A Java Future containing the result of the BatchDisassociateUserStack operation returned by the service.
     * @sample AmazonAppStreamAsync.BatchDisassociateUserStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/BatchDisassociateUserStack"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDisassociateUserStackResult> batchDisassociateUserStackAsync(
            BatchDisassociateUserStackRequest batchDisassociateUserStackRequest);

    /**
     * <p>
     * Disassociates the specified users from the specified stacks.
     * </p>
     * 
     * @param batchDisassociateUserStackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDisassociateUserStack operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.BatchDisassociateUserStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/BatchDisassociateUserStack"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDisassociateUserStackResult> batchDisassociateUserStackAsync(
            BatchDisassociateUserStackRequest batchDisassociateUserStackRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDisassociateUserStackRequest, BatchDisassociateUserStackResult> asyncHandler);

    /**
     * <p>
     * Copies the image within the same region or to a new region within the same AWS account. Note that any tags you
     * added to the image will not be copied.
     * </p>
     * 
     * @param copyImageRequest
     * @return A Java Future containing the result of the CopyImage operation returned by the service.
     * @sample AmazonAppStreamAsync.CopyImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CopyImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CopyImageResult> copyImageAsync(CopyImageRequest copyImageRequest);

    /**
     * <p>
     * Copies the image within the same region or to a new region within the same AWS account. Note that any tags you
     * added to the image will not be copied.
     * </p>
     * 
     * @param copyImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopyImage operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.CopyImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CopyImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CopyImageResult> copyImageAsync(CopyImageRequest copyImageRequest,
            com.amazonaws.handlers.AsyncHandler<CopyImageRequest, CopyImageResult> asyncHandler);

    /**
     * <p>
     * Creates a Directory Config object in AppStream 2.0. This object includes the information required to join
     * streaming instances to an Active Directory domain.
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
     * Creates a Directory Config object in AppStream 2.0. This object includes the information required to join
     * streaming instances to an Active Directory domain.
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
     * Creates a fleet. A fleet consists of streaming instances that run a specified image.
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
     * Creates a fleet. A fleet consists of streaming instances that run a specified image.
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
     * Creates an image builder. An image builder is a virtual machine that is used to create an image.
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
     * Creates an image builder. An image builder is a virtual machine that is used to create an image.
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
     * Creates a stack to start streaming applications to users. A stack consists of an associated fleet, user access
     * policies, and storage configurations.
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
     * Creates a stack to start streaming applications to users. A stack consists of an associated fleet, user access
     * policies, and storage configurations.
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
     * Creates a temporary URL to start an AppStream 2.0 streaming session for the specified user. A streaming URL
     * enables application streaming to be tested without user setup.
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
     * Creates a temporary URL to start an AppStream 2.0 streaming session for the specified user. A streaming URL
     * enables application streaming to be tested without user setup.
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
     * Creates a new user in the user pool.
     * </p>
     * 
     * @param createUserRequest
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AmazonAppStreamAsync.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Creates a new user in the user pool.
     * </p>
     * 
     * @param createUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified Directory Config object from AppStream 2.0. This object includes the information required
     * to join streaming instances to an Active Directory domain.
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
     * Deletes the specified Directory Config object from AppStream 2.0. This object includes the information required
     * to join streaming instances to an Active Directory domain.
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
     * Deletes the specified image. You cannot delete an image when it is in use. After you delete an image, you cannot
     * provision new capacity using the image.
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
     * Deletes the specified image. You cannot delete an image when it is in use. After you delete an image, you cannot
     * provision new capacity using the image.
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
     * Deletes permissions for the specified private image. After you delete permissions for an image, AWS accounts to
     * which you previously granted these permissions can no longer use the image.
     * </p>
     * 
     * @param deleteImagePermissionsRequest
     * @return A Java Future containing the result of the DeleteImagePermissions operation returned by the service.
     * @sample AmazonAppStreamAsync.DeleteImagePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteImagePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteImagePermissionsResult> deleteImagePermissionsAsync(DeleteImagePermissionsRequest deleteImagePermissionsRequest);

    /**
     * <p>
     * Deletes permissions for the specified private image. After you delete permissions for an image, AWS accounts to
     * which you previously granted these permissions can no longer use the image.
     * </p>
     * 
     * @param deleteImagePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteImagePermissions operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.DeleteImagePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteImagePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteImagePermissionsResult> deleteImagePermissionsAsync(DeleteImagePermissionsRequest deleteImagePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteImagePermissionsRequest, DeleteImagePermissionsResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified stack. After the stack is deleted, the application streaming environment provided by the
     * stack is no longer available to users. Also, any reservations made for application streaming sessions for the
     * stack are released.
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
     * Deletes the specified stack. After the stack is deleted, the application streaming environment provided by the
     * stack is no longer available to users. Also, any reservations made for application streaming sessions for the
     * stack are released.
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
     * Deletes a user from the user pool.
     * </p>
     * 
     * @param deleteUserRequest
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AmazonAppStreamAsync.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Deletes a user from the user pool.
     * </p>
     * 
     * @param deleteUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list that describes one or more specified Directory Config objects for AppStream 2.0, if the names
     * for these objects are provided. Otherwise, all Directory Config objects in the account are described. These
     * objects include the information required to join streaming instances to an Active Directory domain.
     * </p>
     * <p>
     * Although the response syntax in this topic includes the account password, this password is not returned in the
     * actual response.
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
     * Retrieves a list that describes one or more specified Directory Config objects for AppStream 2.0, if the names
     * for these objects are provided. Otherwise, all Directory Config objects in the account are described. These
     * objects include the information required to join streaming instances to an Active Directory domain.
     * </p>
     * <p>
     * Although the response syntax in this topic includes the account password, this password is not returned in the
     * actual response.
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
     * Retrieves a list that describes one or more specified fleets, if the fleet names are provided. Otherwise, all
     * fleets in the account are described.
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
     * Retrieves a list that describes one or more specified fleets, if the fleet names are provided. Otherwise, all
     * fleets in the account are described.
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
     * Retrieves a list that describes one or more specified image builders, if the image builder names are provided.
     * Otherwise, all image builders in the account are described.
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
     * Retrieves a list that describes one or more specified image builders, if the image builder names are provided.
     * Otherwise, all image builders in the account are described.
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
     * Retrieves a list that describes the permissions for shared AWS account IDs on a private image that you own.
     * </p>
     * 
     * @param describeImagePermissionsRequest
     * @return A Java Future containing the result of the DescribeImagePermissions operation returned by the service.
     * @sample AmazonAppStreamAsync.DescribeImagePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeImagePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeImagePermissionsResult> describeImagePermissionsAsync(DescribeImagePermissionsRequest describeImagePermissionsRequest);

    /**
     * <p>
     * Retrieves a list that describes the permissions for shared AWS account IDs on a private image that you own.
     * </p>
     * 
     * @param describeImagePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeImagePermissions operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.DescribeImagePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeImagePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeImagePermissionsResult> describeImagePermissionsAsync(DescribeImagePermissionsRequest describeImagePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeImagePermissionsRequest, DescribeImagePermissionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list that describes one or more specified images, if the image names or image ARNs are provided.
     * Otherwise, all images in the account are described.
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
     * Retrieves a list that describes one or more specified images, if the image names or image ARNs are provided.
     * Otherwise, all images in the account are described.
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
     * Retrieves a list that describes the active streaming sessions for a specified stack and fleet. If a value for
     * <code>UserId</code> is provided for the stack and fleet, only streaming sessions for that user are described. If
     * an authentication type is not provided, the default is to authenticate users using a streaming URL.
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
     * Retrieves a list that describes the active streaming sessions for a specified stack and fleet. If a value for
     * <code>UserId</code> is provided for the stack and fleet, only streaming sessions for that user are described. If
     * an authentication type is not provided, the default is to authenticate users using a streaming URL.
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
     * Retrieves a list that describes one or more specified stacks, if the stack names are provided. Otherwise, all
     * stacks in the account are described.
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
     * Retrieves a list that describes one or more specified stacks, if the stack names are provided. Otherwise, all
     * stacks in the account are described.
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
     * Retrieves a list that describes the UserStackAssociation objects. You must specify either or both of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The stack name
     * </p>
     * </li>
     * <li>
     * <p>
     * The user name (email address of the user associated with the stack) and the authentication type for the user
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeUserStackAssociationsRequest
     * @return A Java Future containing the result of the DescribeUserStackAssociations operation returned by the
     *         service.
     * @sample AmazonAppStreamAsync.DescribeUserStackAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeUserStackAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserStackAssociationsResult> describeUserStackAssociationsAsync(
            DescribeUserStackAssociationsRequest describeUserStackAssociationsRequest);

    /**
     * <p>
     * Retrieves a list that describes the UserStackAssociation objects. You must specify either or both of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The stack name
     * </p>
     * </li>
     * <li>
     * <p>
     * The user name (email address of the user associated with the stack) and the authentication type for the user
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeUserStackAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeUserStackAssociations operation returned by the
     *         service.
     * @sample AmazonAppStreamAsyncHandler.DescribeUserStackAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeUserStackAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserStackAssociationsResult> describeUserStackAssociationsAsync(
            DescribeUserStackAssociationsRequest describeUserStackAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUserStackAssociationsRequest, DescribeUserStackAssociationsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list that describes one or more specified users in the user pool.
     * </p>
     * 
     * @param describeUsersRequest
     * @return A Java Future containing the result of the DescribeUsers operation returned by the service.
     * @sample AmazonAppStreamAsync.DescribeUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeUsersResult> describeUsersAsync(DescribeUsersRequest describeUsersRequest);

    /**
     * <p>
     * Retrieves a list that describes one or more specified users in the user pool.
     * </p>
     * 
     * @param describeUsersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeUsers operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.DescribeUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeUsersResult> describeUsersAsync(DescribeUsersRequest describeUsersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUsersRequest, DescribeUsersResult> asyncHandler);

    /**
     * <p>
     * Disables the specified user in the user pool. Users can't sign in to AppStream 2.0 until they are re-enabled.
     * This action does not delete the user.
     * </p>
     * 
     * @param disableUserRequest
     * @return A Java Future containing the result of the DisableUser operation returned by the service.
     * @sample AmazonAppStreamAsync.DisableUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DisableUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableUserResult> disableUserAsync(DisableUserRequest disableUserRequest);

    /**
     * <p>
     * Disables the specified user in the user pool. Users can't sign in to AppStream 2.0 until they are re-enabled.
     * This action does not delete the user.
     * </p>
     * 
     * @param disableUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableUser operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.DisableUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DisableUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableUserResult> disableUserAsync(DisableUserRequest disableUserRequest,
            com.amazonaws.handlers.AsyncHandler<DisableUserRequest, DisableUserResult> asyncHandler);

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
     * Enables a user in the user pool. After being enabled, users can sign in to AppStream 2.0 and open applications
     * from the stacks to which they are assigned.
     * </p>
     * 
     * @param enableUserRequest
     * @return A Java Future containing the result of the EnableUser operation returned by the service.
     * @sample AmazonAppStreamAsync.EnableUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/EnableUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableUserResult> enableUserAsync(EnableUserRequest enableUserRequest);

    /**
     * <p>
     * Enables a user in the user pool. After being enabled, users can sign in to AppStream 2.0 and open applications
     * from the stacks to which they are assigned.
     * </p>
     * 
     * @param enableUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableUser operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.EnableUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/EnableUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableUserResult> enableUserAsync(EnableUserRequest enableUserRequest,
            com.amazonaws.handlers.AsyncHandler<EnableUserRequest, EnableUserResult> asyncHandler);

    /**
     * <p>
     * Immediately stops the specified streaming session.
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
     * Immediately stops the specified streaming session.
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
     * Retrieves the name of the fleet that is associated with the specified stack.
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
     * Retrieves the name of the fleet that is associated with the specified stack.
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
     * Retrieves the name of the stack with which the specified fleet is associated.
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
     * Retrieves the name of the stack with which the specified fleet is associated.
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
     * Retrieves a list of all tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders,
     * images, fleets, and stacks.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your Resources</a>
     * in the <i>Amazon AppStream 2.0 Developer Guide</i>.
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
     * Retrieves a list of all tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders,
     * images, fleets, and stacks.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your Resources</a>
     * in the <i>Amazon AppStream 2.0 Developer Guide</i>.
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
     * href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your Resources</a>
     * in the <i>Amazon AppStream 2.0 Developer Guide</i>.
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
     * href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your Resources</a>
     * in the <i>Amazon AppStream 2.0 Developer Guide</i>.
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
     * Disassociates one or more specified tags from the specified AppStream 2.0 resource.
     * </p>
     * <p>
     * To list the current tags for your resources, use <a>ListTagsForResource</a>.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your Resources</a>
     * in the <i>Amazon AppStream 2.0 Developer Guide</i>.
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
     * Disassociates one or more specified tags from the specified AppStream 2.0 resource.
     * </p>
     * <p>
     * To list the current tags for your resources, use <a>ListTagsForResource</a>.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your Resources</a>
     * in the <i>Amazon AppStream 2.0 Developer Guide</i>.
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
     * Updates the specified Directory Config object in AppStream 2.0. This object includes the information required to
     * join streaming instances to an Active Directory domain.
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
     * Updates the specified Directory Config object in AppStream 2.0. This object includes the information required to
     * join streaming instances to an Active Directory domain.
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
     * Adds or updates permissions for the specified private image.
     * </p>
     * 
     * @param updateImagePermissionsRequest
     * @return A Java Future containing the result of the UpdateImagePermissions operation returned by the service.
     * @sample AmazonAppStreamAsync.UpdateImagePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateImagePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateImagePermissionsResult> updateImagePermissionsAsync(UpdateImagePermissionsRequest updateImagePermissionsRequest);

    /**
     * <p>
     * Adds or updates permissions for the specified private image.
     * </p>
     * 
     * @param updateImagePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateImagePermissions operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.UpdateImagePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateImagePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateImagePermissionsResult> updateImagePermissionsAsync(UpdateImagePermissionsRequest updateImagePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateImagePermissionsRequest, UpdateImagePermissionsResult> asyncHandler);

    /**
     * <p>
     * Updates the specified fields for the specified stack.
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
     * Updates the specified fields for the specified stack.
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
