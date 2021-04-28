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
package com.amazonaws.services.nimblestudio;

import javax.annotation.Generated;

import com.amazonaws.services.nimblestudio.model.*;

/**
 * Interface for accessing AmazonNimbleStudio asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.nimblestudio.AbstractAmazonNimbleStudioAsync} instead.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonNimbleStudioAsync extends AmazonNimbleStudio {

    /**
     * <p>
     * Accept EULAs.
     * </p>
     * 
     * @param acceptEulasRequest
     *        A collection of EULA acceptances.
     * @return A Java Future containing the result of the AcceptEulas operation returned by the service.
     * @sample AmazonNimbleStudioAsync.AcceptEulas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/AcceptEulas" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AcceptEulasResult> acceptEulasAsync(AcceptEulasRequest acceptEulasRequest);

    /**
     * <p>
     * Accept EULAs.
     * </p>
     * 
     * @param acceptEulasRequest
     *        A collection of EULA acceptances.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptEulas operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.AcceptEulas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/AcceptEulas" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AcceptEulasResult> acceptEulasAsync(AcceptEulasRequest acceptEulasRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptEulasRequest, AcceptEulasResult> asyncHandler);

    /**
     * <p>
     * Create a launch profile.
     * </p>
     * 
     * @param createLaunchProfileRequest
     *        A collection of launch profiles.
     * @return A Java Future containing the result of the CreateLaunchProfile operation returned by the service.
     * @sample AmazonNimbleStudioAsync.CreateLaunchProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateLaunchProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLaunchProfileResult> createLaunchProfileAsync(CreateLaunchProfileRequest createLaunchProfileRequest);

    /**
     * <p>
     * Create a launch profile.
     * </p>
     * 
     * @param createLaunchProfileRequest
     *        A collection of launch profiles.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLaunchProfile operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.CreateLaunchProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateLaunchProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLaunchProfileResult> createLaunchProfileAsync(CreateLaunchProfileRequest createLaunchProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLaunchProfileRequest, CreateLaunchProfileResult> asyncHandler);

    /**
     * <p>
     * Creates a streaming image resource in a studio.
     * </p>
     * 
     * @param createStreamingImageRequest
     *        A collection of streaming images.
     * @return A Java Future containing the result of the CreateStreamingImage operation returned by the service.
     * @sample AmazonNimbleStudioAsync.CreateStreamingImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateStreamingImage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateStreamingImageResult> createStreamingImageAsync(CreateStreamingImageRequest createStreamingImageRequest);

    /**
     * <p>
     * Creates a streaming image resource in a studio.
     * </p>
     * 
     * @param createStreamingImageRequest
     *        A collection of streaming images.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStreamingImage operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.CreateStreamingImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateStreamingImage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateStreamingImageResult> createStreamingImageAsync(CreateStreamingImageRequest createStreamingImageRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStreamingImageRequest, CreateStreamingImageResult> asyncHandler);

    /**
     * <p>
     * Creates a streaming session in a studio.
     * </p>
     * <p>
     * After invoking this operation, you must poll GetStreamingSession until the streaming session is in state READY.
     * </p>
     * 
     * @param createStreamingSessionRequest
     *        A collection of streaming sessions.
     * @return A Java Future containing the result of the CreateStreamingSession operation returned by the service.
     * @sample AmazonNimbleStudioAsync.CreateStreamingSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateStreamingSession" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateStreamingSessionResult> createStreamingSessionAsync(CreateStreamingSessionRequest createStreamingSessionRequest);

    /**
     * <p>
     * Creates a streaming session in a studio.
     * </p>
     * <p>
     * After invoking this operation, you must poll GetStreamingSession until the streaming session is in state READY.
     * </p>
     * 
     * @param createStreamingSessionRequest
     *        A collection of streaming sessions.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStreamingSession operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.CreateStreamingSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateStreamingSession" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateStreamingSessionResult> createStreamingSessionAsync(CreateStreamingSessionRequest createStreamingSessionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStreamingSessionRequest, CreateStreamingSessionResult> asyncHandler);

    /**
     * <p>
     * Creates a streaming session stream for a streaming session.
     * </p>
     * <p>
     * After invoking this API, invoke GetStreamingSessionStream with the returned streamId to poll the resource until
     * it is in state READY.
     * </p>
     * 
     * @param createStreamingSessionStreamRequest
     *        A list collection streams.
     * @return A Java Future containing the result of the CreateStreamingSessionStream operation returned by the
     *         service.
     * @sample AmazonNimbleStudioAsync.CreateStreamingSessionStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateStreamingSessionStream"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateStreamingSessionStreamResult> createStreamingSessionStreamAsync(
            CreateStreamingSessionStreamRequest createStreamingSessionStreamRequest);

    /**
     * <p>
     * Creates a streaming session stream for a streaming session.
     * </p>
     * <p>
     * After invoking this API, invoke GetStreamingSessionStream with the returned streamId to poll the resource until
     * it is in state READY.
     * </p>
     * 
     * @param createStreamingSessionStreamRequest
     *        A list collection streams.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStreamingSessionStream operation returned by the
     *         service.
     * @sample AmazonNimbleStudioAsyncHandler.CreateStreamingSessionStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateStreamingSessionStream"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateStreamingSessionStreamResult> createStreamingSessionStreamAsync(
            CreateStreamingSessionStreamRequest createStreamingSessionStreamRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStreamingSessionStreamRequest, CreateStreamingSessionStreamResult> asyncHandler);

    /**
     * <p>
     * Create a new Studio.
     * </p>
     * <p>
     * When creating a Studio, two IAM roles must be provided: the admin role and the user Role. These roles are assumed
     * by your users when they log in to the Nimble Studio portal.
     * </p>
     * <p>
     * The user role must have the AmazonNimbleStudio-StudioUser managed policy attached for the portal to function
     * properly.
     * </p>
     * <p>
     * The Admin Role must have the AmazonNimbleStudio-StudioAdmin managed policy attached for the portal to function
     * properly.
     * </p>
     * <p>
     * You may optionally specify a KMS key in the StudioEncryptionConfiguration.
     * </p>
     * <p>
     * In Nimble Studio, resource names, descriptions, initialization scripts, and other data you provide are always
     * encrypted at rest using an AWS KMS key. By default, this key is owned by AWS and managed on your behalf. You may
     * provide your own AWS KMS key when calling CreateStudio to encrypt this data using a key you own and manage.
     * </p>
     * <p>
     * When providing an AWS KMS key during studio creation, Nimble Studio creates KMS grants in your account to provide
     * your studio user and admin roles access to these KMS keys.
     * </p>
     * <p>
     * If you delete this grant, the studio will no longer be accessible to your portal users.
     * </p>
     * <p>
     * If you delete the studio KMS key, your studio will no longer be accessible.
     * </p>
     * 
     * @param createStudioRequest
     *        A collection of studio resources.
     * @return A Java Future containing the result of the CreateStudio operation returned by the service.
     * @sample AmazonNimbleStudioAsync.CreateStudio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateStudio" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateStudioResult> createStudioAsync(CreateStudioRequest createStudioRequest);

    /**
     * <p>
     * Create a new Studio.
     * </p>
     * <p>
     * When creating a Studio, two IAM roles must be provided: the admin role and the user Role. These roles are assumed
     * by your users when they log in to the Nimble Studio portal.
     * </p>
     * <p>
     * The user role must have the AmazonNimbleStudio-StudioUser managed policy attached for the portal to function
     * properly.
     * </p>
     * <p>
     * The Admin Role must have the AmazonNimbleStudio-StudioAdmin managed policy attached for the portal to function
     * properly.
     * </p>
     * <p>
     * You may optionally specify a KMS key in the StudioEncryptionConfiguration.
     * </p>
     * <p>
     * In Nimble Studio, resource names, descriptions, initialization scripts, and other data you provide are always
     * encrypted at rest using an AWS KMS key. By default, this key is owned by AWS and managed on your behalf. You may
     * provide your own AWS KMS key when calling CreateStudio to encrypt this data using a key you own and manage.
     * </p>
     * <p>
     * When providing an AWS KMS key during studio creation, Nimble Studio creates KMS grants in your account to provide
     * your studio user and admin roles access to these KMS keys.
     * </p>
     * <p>
     * If you delete this grant, the studio will no longer be accessible to your portal users.
     * </p>
     * <p>
     * If you delete the studio KMS key, your studio will no longer be accessible.
     * </p>
     * 
     * @param createStudioRequest
     *        A collection of studio resources.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStudio operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.CreateStudio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateStudio" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateStudioResult> createStudioAsync(CreateStudioRequest createStudioRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStudioRequest, CreateStudioResult> asyncHandler);

    /**
     * <p>
     * Creates a studio component resource.
     * </p>
     * 
     * @param createStudioComponentRequest
     *        The studio components.
     * @return A Java Future containing the result of the CreateStudioComponent operation returned by the service.
     * @sample AmazonNimbleStudioAsync.CreateStudioComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateStudioComponent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateStudioComponentResult> createStudioComponentAsync(CreateStudioComponentRequest createStudioComponentRequest);

    /**
     * <p>
     * Creates a studio component resource.
     * </p>
     * 
     * @param createStudioComponentRequest
     *        The studio components.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStudioComponent operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.CreateStudioComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateStudioComponent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateStudioComponentResult> createStudioComponentAsync(CreateStudioComponentRequest createStudioComponentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStudioComponentRequest, CreateStudioComponentResult> asyncHandler);

    /**
     * <p>
     * Permanently delete a launch profile.
     * </p>
     * 
     * @param deleteLaunchProfileRequest
     * @return A Java Future containing the result of the DeleteLaunchProfile operation returned by the service.
     * @sample AmazonNimbleStudioAsync.DeleteLaunchProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteLaunchProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLaunchProfileResult> deleteLaunchProfileAsync(DeleteLaunchProfileRequest deleteLaunchProfileRequest);

    /**
     * <p>
     * Permanently delete a launch profile.
     * </p>
     * 
     * @param deleteLaunchProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLaunchProfile operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.DeleteLaunchProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteLaunchProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLaunchProfileResult> deleteLaunchProfileAsync(DeleteLaunchProfileRequest deleteLaunchProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLaunchProfileRequest, DeleteLaunchProfileResult> asyncHandler);

    /**
     * <p>
     * Delete a user from launch profile membership.
     * </p>
     * 
     * @param deleteLaunchProfileMemberRequest
     * @return A Java Future containing the result of the DeleteLaunchProfileMember operation returned by the service.
     * @sample AmazonNimbleStudioAsync.DeleteLaunchProfileMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteLaunchProfileMember"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLaunchProfileMemberResult> deleteLaunchProfileMemberAsync(
            DeleteLaunchProfileMemberRequest deleteLaunchProfileMemberRequest);

    /**
     * <p>
     * Delete a user from launch profile membership.
     * </p>
     * 
     * @param deleteLaunchProfileMemberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLaunchProfileMember operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.DeleteLaunchProfileMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteLaunchProfileMember"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLaunchProfileMemberResult> deleteLaunchProfileMemberAsync(
            DeleteLaunchProfileMemberRequest deleteLaunchProfileMemberRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLaunchProfileMemberRequest, DeleteLaunchProfileMemberResult> asyncHandler);

    /**
     * <p>
     * Delete streaming image.
     * </p>
     * 
     * @param deleteStreamingImageRequest
     * @return A Java Future containing the result of the DeleteStreamingImage operation returned by the service.
     * @sample AmazonNimbleStudioAsync.DeleteStreamingImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteStreamingImage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteStreamingImageResult> deleteStreamingImageAsync(DeleteStreamingImageRequest deleteStreamingImageRequest);

    /**
     * <p>
     * Delete streaming image.
     * </p>
     * 
     * @param deleteStreamingImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStreamingImage operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.DeleteStreamingImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteStreamingImage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteStreamingImageResult> deleteStreamingImageAsync(DeleteStreamingImageRequest deleteStreamingImageRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStreamingImageRequest, DeleteStreamingImageResult> asyncHandler);

    /**
     * <p>
     * Deletes streaming session resource.
     * </p>
     * <p>
     * After invoking this operation, use GetStreamingSession to poll the resource until it transitions to a DELETED
     * state.
     * </p>
     * <p>
     * A streaming session will count against your streaming session quota until it is marked DELETED.
     * </p>
     * 
     * @param deleteStreamingSessionRequest
     * @return A Java Future containing the result of the DeleteStreamingSession operation returned by the service.
     * @sample AmazonNimbleStudioAsync.DeleteStreamingSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteStreamingSession" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteStreamingSessionResult> deleteStreamingSessionAsync(DeleteStreamingSessionRequest deleteStreamingSessionRequest);

    /**
     * <p>
     * Deletes streaming session resource.
     * </p>
     * <p>
     * After invoking this operation, use GetStreamingSession to poll the resource until it transitions to a DELETED
     * state.
     * </p>
     * <p>
     * A streaming session will count against your streaming session quota until it is marked DELETED.
     * </p>
     * 
     * @param deleteStreamingSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStreamingSession operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.DeleteStreamingSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteStreamingSession" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteStreamingSessionResult> deleteStreamingSessionAsync(DeleteStreamingSessionRequest deleteStreamingSessionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStreamingSessionRequest, DeleteStreamingSessionResult> asyncHandler);

    /**
     * <p>
     * Delete a studio resource.
     * </p>
     * 
     * @param deleteStudioRequest
     * @return A Java Future containing the result of the DeleteStudio operation returned by the service.
     * @sample AmazonNimbleStudioAsync.DeleteStudio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteStudio" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStudioResult> deleteStudioAsync(DeleteStudioRequest deleteStudioRequest);

    /**
     * <p>
     * Delete a studio resource.
     * </p>
     * 
     * @param deleteStudioRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStudio operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.DeleteStudio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteStudio" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStudioResult> deleteStudioAsync(DeleteStudioRequest deleteStudioRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStudioRequest, DeleteStudioResult> asyncHandler);

    /**
     * <p>
     * Deletes a studio component resource.
     * </p>
     * 
     * @param deleteStudioComponentRequest
     * @return A Java Future containing the result of the DeleteStudioComponent operation returned by the service.
     * @sample AmazonNimbleStudioAsync.DeleteStudioComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteStudioComponent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteStudioComponentResult> deleteStudioComponentAsync(DeleteStudioComponentRequest deleteStudioComponentRequest);

    /**
     * <p>
     * Deletes a studio component resource.
     * </p>
     * 
     * @param deleteStudioComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStudioComponent operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.DeleteStudioComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteStudioComponent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteStudioComponentResult> deleteStudioComponentAsync(DeleteStudioComponentRequest deleteStudioComponentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStudioComponentRequest, DeleteStudioComponentResult> asyncHandler);

    /**
     * <p>
     * Delete a user from studio membership.
     * </p>
     * 
     * @param deleteStudioMemberRequest
     * @return A Java Future containing the result of the DeleteStudioMember operation returned by the service.
     * @sample AmazonNimbleStudioAsync.DeleteStudioMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteStudioMember" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStudioMemberResult> deleteStudioMemberAsync(DeleteStudioMemberRequest deleteStudioMemberRequest);

    /**
     * <p>
     * Delete a user from studio membership.
     * </p>
     * 
     * @param deleteStudioMemberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStudioMember operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.DeleteStudioMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteStudioMember" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStudioMemberResult> deleteStudioMemberAsync(DeleteStudioMemberRequest deleteStudioMemberRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStudioMemberRequest, DeleteStudioMemberResult> asyncHandler);

    /**
     * <p>
     * Get Eula.
     * </p>
     * 
     * @param getEulaRequest
     * @return A Java Future containing the result of the GetEula operation returned by the service.
     * @sample AmazonNimbleStudioAsync.GetEula
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetEula" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEulaResult> getEulaAsync(GetEulaRequest getEulaRequest);

    /**
     * <p>
     * Get Eula.
     * </p>
     * 
     * @param getEulaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEula operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.GetEula
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetEula" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEulaResult> getEulaAsync(GetEulaRequest getEulaRequest,
            com.amazonaws.handlers.AsyncHandler<GetEulaRequest, GetEulaResult> asyncHandler);

    /**
     * <p>
     * Get a launch profile.
     * </p>
     * 
     * @param getLaunchProfileRequest
     * @return A Java Future containing the result of the GetLaunchProfile operation returned by the service.
     * @sample AmazonNimbleStudioAsync.GetLaunchProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetLaunchProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLaunchProfileResult> getLaunchProfileAsync(GetLaunchProfileRequest getLaunchProfileRequest);

    /**
     * <p>
     * Get a launch profile.
     * </p>
     * 
     * @param getLaunchProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLaunchProfile operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.GetLaunchProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetLaunchProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLaunchProfileResult> getLaunchProfileAsync(GetLaunchProfileRequest getLaunchProfileRequest,
            com.amazonaws.handlers.AsyncHandler<GetLaunchProfileRequest, GetLaunchProfileResult> asyncHandler);

    /**
     * <p>
     * Launch profile details include the launch profile resource and summary information of resources that are used by,
     * or available to, the launch profile. This includes the name and description of all studio components used by the
     * launch profiles, and the name and description of streaming images that can be used with this launch profile.
     * </p>
     * 
     * @param getLaunchProfileDetailsRequest
     * @return A Java Future containing the result of the GetLaunchProfileDetails operation returned by the service.
     * @sample AmazonNimbleStudioAsync.GetLaunchProfileDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetLaunchProfileDetails" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLaunchProfileDetailsResult> getLaunchProfileDetailsAsync(GetLaunchProfileDetailsRequest getLaunchProfileDetailsRequest);

    /**
     * <p>
     * Launch profile details include the launch profile resource and summary information of resources that are used by,
     * or available to, the launch profile. This includes the name and description of all studio components used by the
     * launch profiles, and the name and description of streaming images that can be used with this launch profile.
     * </p>
     * 
     * @param getLaunchProfileDetailsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLaunchProfileDetails operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.GetLaunchProfileDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetLaunchProfileDetails" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLaunchProfileDetailsResult> getLaunchProfileDetailsAsync(GetLaunchProfileDetailsRequest getLaunchProfileDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<GetLaunchProfileDetailsRequest, GetLaunchProfileDetailsResult> asyncHandler);

    /**
     * <p>
     * Get a launch profile initialization.
     * </p>
     * 
     * @param getLaunchProfileInitializationRequest
     * @return A Java Future containing the result of the GetLaunchProfileInitialization operation returned by the
     *         service.
     * @sample AmazonNimbleStudioAsync.GetLaunchProfileInitialization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetLaunchProfileInitialization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLaunchProfileInitializationResult> getLaunchProfileInitializationAsync(
            GetLaunchProfileInitializationRequest getLaunchProfileInitializationRequest);

    /**
     * <p>
     * Get a launch profile initialization.
     * </p>
     * 
     * @param getLaunchProfileInitializationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLaunchProfileInitialization operation returned by the
     *         service.
     * @sample AmazonNimbleStudioAsyncHandler.GetLaunchProfileInitialization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetLaunchProfileInitialization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLaunchProfileInitializationResult> getLaunchProfileInitializationAsync(
            GetLaunchProfileInitializationRequest getLaunchProfileInitializationRequest,
            com.amazonaws.handlers.AsyncHandler<GetLaunchProfileInitializationRequest, GetLaunchProfileInitializationResult> asyncHandler);

    /**
     * <p>
     * Get a user persona in launch profile membership.
     * </p>
     * 
     * @param getLaunchProfileMemberRequest
     * @return A Java Future containing the result of the GetLaunchProfileMember operation returned by the service.
     * @sample AmazonNimbleStudioAsync.GetLaunchProfileMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetLaunchProfileMember" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLaunchProfileMemberResult> getLaunchProfileMemberAsync(GetLaunchProfileMemberRequest getLaunchProfileMemberRequest);

    /**
     * <p>
     * Get a user persona in launch profile membership.
     * </p>
     * 
     * @param getLaunchProfileMemberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLaunchProfileMember operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.GetLaunchProfileMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetLaunchProfileMember" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLaunchProfileMemberResult> getLaunchProfileMemberAsync(GetLaunchProfileMemberRequest getLaunchProfileMemberRequest,
            com.amazonaws.handlers.AsyncHandler<GetLaunchProfileMemberRequest, GetLaunchProfileMemberResult> asyncHandler);

    /**
     * <p>
     * Get streaming image.
     * </p>
     * 
     * @param getStreamingImageRequest
     * @return A Java Future containing the result of the GetStreamingImage operation returned by the service.
     * @sample AmazonNimbleStudioAsync.GetStreamingImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStreamingImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStreamingImageResult> getStreamingImageAsync(GetStreamingImageRequest getStreamingImageRequest);

    /**
     * <p>
     * Get streaming image.
     * </p>
     * 
     * @param getStreamingImageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStreamingImage operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.GetStreamingImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStreamingImage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStreamingImageResult> getStreamingImageAsync(GetStreamingImageRequest getStreamingImageRequest,
            com.amazonaws.handlers.AsyncHandler<GetStreamingImageRequest, GetStreamingImageResult> asyncHandler);

    /**
     * <p>
     * Gets StreamingSession resource.
     * </p>
     * <p>
     * Invoke this operation to poll for a streaming session state while creating or deleting a session.
     * </p>
     * 
     * @param getStreamingSessionRequest
     * @return A Java Future containing the result of the GetStreamingSession operation returned by the service.
     * @sample AmazonNimbleStudioAsync.GetStreamingSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStreamingSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStreamingSessionResult> getStreamingSessionAsync(GetStreamingSessionRequest getStreamingSessionRequest);

    /**
     * <p>
     * Gets StreamingSession resource.
     * </p>
     * <p>
     * Invoke this operation to poll for a streaming session state while creating or deleting a session.
     * </p>
     * 
     * @param getStreamingSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStreamingSession operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.GetStreamingSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStreamingSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStreamingSessionResult> getStreamingSessionAsync(GetStreamingSessionRequest getStreamingSessionRequest,
            com.amazonaws.handlers.AsyncHandler<GetStreamingSessionRequest, GetStreamingSessionResult> asyncHandler);

    /**
     * <p>
     * Gets a StreamingSessionStream for a streaming session.
     * </p>
     * <p>
     * Invoke this operation to poll the resource after invoking CreateStreamingSessionStream.
     * </p>
     * <p>
     * After the StreamingSessionStream changes to the state READY, the url property will contain a stream to be used
     * with the DCV streaming client.
     * </p>
     * 
     * @param getStreamingSessionStreamRequest
     * @return A Java Future containing the result of the GetStreamingSessionStream operation returned by the service.
     * @sample AmazonNimbleStudioAsync.GetStreamingSessionStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStreamingSessionStream"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetStreamingSessionStreamResult> getStreamingSessionStreamAsync(
            GetStreamingSessionStreamRequest getStreamingSessionStreamRequest);

    /**
     * <p>
     * Gets a StreamingSessionStream for a streaming session.
     * </p>
     * <p>
     * Invoke this operation to poll the resource after invoking CreateStreamingSessionStream.
     * </p>
     * <p>
     * After the StreamingSessionStream changes to the state READY, the url property will contain a stream to be used
     * with the DCV streaming client.
     * </p>
     * 
     * @param getStreamingSessionStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStreamingSessionStream operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.GetStreamingSessionStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStreamingSessionStream"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetStreamingSessionStreamResult> getStreamingSessionStreamAsync(
            GetStreamingSessionStreamRequest getStreamingSessionStreamRequest,
            com.amazonaws.handlers.AsyncHandler<GetStreamingSessionStreamRequest, GetStreamingSessionStreamResult> asyncHandler);

    /**
     * <p>
     * Get a Studio resource.
     * </p>
     * 
     * @param getStudioRequest
     * @return A Java Future containing the result of the GetStudio operation returned by the service.
     * @sample AmazonNimbleStudioAsync.GetStudio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStudio" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStudioResult> getStudioAsync(GetStudioRequest getStudioRequest);

    /**
     * <p>
     * Get a Studio resource.
     * </p>
     * 
     * @param getStudioRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStudio operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.GetStudio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStudio" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStudioResult> getStudioAsync(GetStudioRequest getStudioRequest,
            com.amazonaws.handlers.AsyncHandler<GetStudioRequest, GetStudioResult> asyncHandler);

    /**
     * <p>
     * Gets a studio component resource.
     * </p>
     * 
     * @param getStudioComponentRequest
     * @return A Java Future containing the result of the GetStudioComponent operation returned by the service.
     * @sample AmazonNimbleStudioAsync.GetStudioComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStudioComponent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStudioComponentResult> getStudioComponentAsync(GetStudioComponentRequest getStudioComponentRequest);

    /**
     * <p>
     * Gets a studio component resource.
     * </p>
     * 
     * @param getStudioComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStudioComponent operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.GetStudioComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStudioComponent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStudioComponentResult> getStudioComponentAsync(GetStudioComponentRequest getStudioComponentRequest,
            com.amazonaws.handlers.AsyncHandler<GetStudioComponentRequest, GetStudioComponentResult> asyncHandler);

    /**
     * <p>
     * Get a user's membership in a studio.
     * </p>
     * 
     * @param getStudioMemberRequest
     * @return A Java Future containing the result of the GetStudioMember operation returned by the service.
     * @sample AmazonNimbleStudioAsync.GetStudioMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStudioMember" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStudioMemberResult> getStudioMemberAsync(GetStudioMemberRequest getStudioMemberRequest);

    /**
     * <p>
     * Get a user's membership in a studio.
     * </p>
     * 
     * @param getStudioMemberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStudioMember operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.GetStudioMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStudioMember" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStudioMemberResult> getStudioMemberAsync(GetStudioMemberRequest getStudioMemberRequest,
            com.amazonaws.handlers.AsyncHandler<GetStudioMemberRequest, GetStudioMemberResult> asyncHandler);

    /**
     * <p>
     * List Eula Acceptances.
     * </p>
     * 
     * @param listEulaAcceptancesRequest
     * @return A Java Future containing the result of the ListEulaAcceptances operation returned by the service.
     * @sample AmazonNimbleStudioAsync.ListEulaAcceptances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListEulaAcceptances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEulaAcceptancesResult> listEulaAcceptancesAsync(ListEulaAcceptancesRequest listEulaAcceptancesRequest);

    /**
     * <p>
     * List Eula Acceptances.
     * </p>
     * 
     * @param listEulaAcceptancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEulaAcceptances operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.ListEulaAcceptances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListEulaAcceptances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEulaAcceptancesResult> listEulaAcceptancesAsync(ListEulaAcceptancesRequest listEulaAcceptancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListEulaAcceptancesRequest, ListEulaAcceptancesResult> asyncHandler);

    /**
     * <p>
     * List Eulas.
     * </p>
     * 
     * @param listEulasRequest
     * @return A Java Future containing the result of the ListEulas operation returned by the service.
     * @sample AmazonNimbleStudioAsync.ListEulas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListEulas" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEulasResult> listEulasAsync(ListEulasRequest listEulasRequest);

    /**
     * <p>
     * List Eulas.
     * </p>
     * 
     * @param listEulasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEulas operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.ListEulas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListEulas" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEulasResult> listEulasAsync(ListEulasRequest listEulasRequest,
            com.amazonaws.handlers.AsyncHandler<ListEulasRequest, ListEulasResult> asyncHandler);

    /**
     * <p>
     * Get all users in a given launch profile membership.
     * </p>
     * 
     * @param listLaunchProfileMembersRequest
     * @return A Java Future containing the result of the ListLaunchProfileMembers operation returned by the service.
     * @sample AmazonNimbleStudioAsync.ListLaunchProfileMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListLaunchProfileMembers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLaunchProfileMembersResult> listLaunchProfileMembersAsync(ListLaunchProfileMembersRequest listLaunchProfileMembersRequest);

    /**
     * <p>
     * Get all users in a given launch profile membership.
     * </p>
     * 
     * @param listLaunchProfileMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLaunchProfileMembers operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.ListLaunchProfileMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListLaunchProfileMembers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLaunchProfileMembersResult> listLaunchProfileMembersAsync(ListLaunchProfileMembersRequest listLaunchProfileMembersRequest,
            com.amazonaws.handlers.AsyncHandler<ListLaunchProfileMembersRequest, ListLaunchProfileMembersResult> asyncHandler);

    /**
     * <p>
     * List all the launch profiles a studio.
     * </p>
     * 
     * @param listLaunchProfilesRequest
     * @return A Java Future containing the result of the ListLaunchProfiles operation returned by the service.
     * @sample AmazonNimbleStudioAsync.ListLaunchProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListLaunchProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLaunchProfilesResult> listLaunchProfilesAsync(ListLaunchProfilesRequest listLaunchProfilesRequest);

    /**
     * <p>
     * List all the launch profiles a studio.
     * </p>
     * 
     * @param listLaunchProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLaunchProfiles operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.ListLaunchProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListLaunchProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLaunchProfilesResult> listLaunchProfilesAsync(ListLaunchProfilesRequest listLaunchProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<ListLaunchProfilesRequest, ListLaunchProfilesResult> asyncHandler);

    /**
     * <p>
     * List the streaming image resources available to this studio.
     * </p>
     * <p>
     * This list will contain both images provided by AWS, as well as streaming images that you have created in your
     * studio.
     * </p>
     * 
     * @param listStreamingImagesRequest
     * @return A Java Future containing the result of the ListStreamingImages operation returned by the service.
     * @sample AmazonNimbleStudioAsync.ListStreamingImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStreamingImages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStreamingImagesResult> listStreamingImagesAsync(ListStreamingImagesRequest listStreamingImagesRequest);

    /**
     * <p>
     * List the streaming image resources available to this studio.
     * </p>
     * <p>
     * This list will contain both images provided by AWS, as well as streaming images that you have created in your
     * studio.
     * </p>
     * 
     * @param listStreamingImagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStreamingImages operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.ListStreamingImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStreamingImages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStreamingImagesResult> listStreamingImagesAsync(ListStreamingImagesRequest listStreamingImagesRequest,
            com.amazonaws.handlers.AsyncHandler<ListStreamingImagesRequest, ListStreamingImagesResult> asyncHandler);

    /**
     * <p>
     * Lists the streaming image resources in a studio.
     * </p>
     * 
     * @param listStreamingSessionsRequest
     * @return A Java Future containing the result of the ListStreamingSessions operation returned by the service.
     * @sample AmazonNimbleStudioAsync.ListStreamingSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStreamingSessions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListStreamingSessionsResult> listStreamingSessionsAsync(ListStreamingSessionsRequest listStreamingSessionsRequest);

    /**
     * <p>
     * Lists the streaming image resources in a studio.
     * </p>
     * 
     * @param listStreamingSessionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStreamingSessions operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.ListStreamingSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStreamingSessions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListStreamingSessionsResult> listStreamingSessionsAsync(ListStreamingSessionsRequest listStreamingSessionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListStreamingSessionsRequest, ListStreamingSessionsResult> asyncHandler);

    /**
     * <p>
     * Lists the StudioComponents in a studio.
     * </p>
     * 
     * @param listStudioComponentsRequest
     * @return A Java Future containing the result of the ListStudioComponents operation returned by the service.
     * @sample AmazonNimbleStudioAsync.ListStudioComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStudioComponents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListStudioComponentsResult> listStudioComponentsAsync(ListStudioComponentsRequest listStudioComponentsRequest);

    /**
     * <p>
     * Lists the StudioComponents in a studio.
     * </p>
     * 
     * @param listStudioComponentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStudioComponents operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.ListStudioComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStudioComponents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListStudioComponentsResult> listStudioComponentsAsync(ListStudioComponentsRequest listStudioComponentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListStudioComponentsRequest, ListStudioComponentsResult> asyncHandler);

    /**
     * <p>
     * Get all users in a given studio membership.
     * </p>
     * 
     * @param listStudioMembersRequest
     * @return A Java Future containing the result of the ListStudioMembers operation returned by the service.
     * @sample AmazonNimbleStudioAsync.ListStudioMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStudioMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStudioMembersResult> listStudioMembersAsync(ListStudioMembersRequest listStudioMembersRequest);

    /**
     * <p>
     * Get all users in a given studio membership.
     * </p>
     * 
     * @param listStudioMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStudioMembers operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.ListStudioMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStudioMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStudioMembersResult> listStudioMembersAsync(ListStudioMembersRequest listStudioMembersRequest,
            com.amazonaws.handlers.AsyncHandler<ListStudioMembersRequest, ListStudioMembersResult> asyncHandler);

    /**
     * <p>
     * List studios in your AWS account in the requested AWS Region.
     * </p>
     * 
     * @param listStudiosRequest
     * @return A Java Future containing the result of the ListStudios operation returned by the service.
     * @sample AmazonNimbleStudioAsync.ListStudios
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStudios" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStudiosResult> listStudiosAsync(ListStudiosRequest listStudiosRequest);

    /**
     * <p>
     * List studios in your AWS account in the requested AWS Region.
     * </p>
     * 
     * @param listStudiosRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStudios operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.ListStudios
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStudios" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStudiosResult> listStudiosAsync(ListStudiosRequest listStudiosRequest,
            com.amazonaws.handlers.AsyncHandler<ListStudiosRequest, ListStudiosResult> asyncHandler);

    /**
     * <p>
     * Gets the tags for a resource, given its Amazon Resource Names (ARN).
     * </p>
     * <p>
     * This operation supports ARNs for all resource types in Nimble Studio that support tags, including studio, studio
     * component, launch profile, streaming image, and streaming session. All resources that can be tagged will contain
     * an ARN property, so you do not have to create this ARN yourself.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonNimbleStudioAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Gets the tags for a resource, given its Amazon Resource Names (ARN).
     * </p>
     * <p>
     * This operation supports ARNs for all resource types in Nimble Studio that support tags, including studio, studio
     * component, launch profile, streaming image, and streaming session. All resources that can be tagged will contain
     * an ARN property, so you do not have to create this ARN yourself.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Add/update users with given persona to launch profile membership.
     * </p>
     * 
     * @param putLaunchProfileMembersRequest
     *        Information about a launch profile membership.
     * @return A Java Future containing the result of the PutLaunchProfileMembers operation returned by the service.
     * @sample AmazonNimbleStudioAsync.PutLaunchProfileMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/PutLaunchProfileMembers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutLaunchProfileMembersResult> putLaunchProfileMembersAsync(PutLaunchProfileMembersRequest putLaunchProfileMembersRequest);

    /**
     * <p>
     * Add/update users with given persona to launch profile membership.
     * </p>
     * 
     * @param putLaunchProfileMembersRequest
     *        Information about a launch profile membership.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutLaunchProfileMembers operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.PutLaunchProfileMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/PutLaunchProfileMembers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutLaunchProfileMembersResult> putLaunchProfileMembersAsync(PutLaunchProfileMembersRequest putLaunchProfileMembersRequest,
            com.amazonaws.handlers.AsyncHandler<PutLaunchProfileMembersRequest, PutLaunchProfileMembersResult> asyncHandler);

    /**
     * <p>
     * Add/update users with given persona to studio membership.
     * </p>
     * 
     * @param putStudioMembersRequest
     *        A launch profile membership collection.
     * @return A Java Future containing the result of the PutStudioMembers operation returned by the service.
     * @sample AmazonNimbleStudioAsync.PutStudioMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/PutStudioMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutStudioMembersResult> putStudioMembersAsync(PutStudioMembersRequest putStudioMembersRequest);

    /**
     * <p>
     * Add/update users with given persona to studio membership.
     * </p>
     * 
     * @param putStudioMembersRequest
     *        A launch profile membership collection.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutStudioMembers operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.PutStudioMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/PutStudioMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutStudioMembersResult> putStudioMembersAsync(PutStudioMembersRequest putStudioMembersRequest,
            com.amazonaws.handlers.AsyncHandler<PutStudioMembersRequest, PutStudioMembersResult> asyncHandler);

    /**
     * <p>
     * Repairs the SSO configuration for a given studio.
     * </p>
     * <p>
     * If the studio has a valid AWS SSO configuration currently associated with it, this operation will fail with a
     * validation error.
     * </p>
     * <p>
     * If the studio does not have a valid AWS SSO configuration currently associated with it, then a new AWS SSO
     * application is created for the studio and the studio is changed to the READY state.
     * </p>
     * <p>
     * After the AWS SSO application is repaired, you must use the Amazon Nimble Studio console to add administrators
     * and users to your studio.
     * </p>
     * 
     * @param startStudioSSOConfigurationRepairRequest
     * @return A Java Future containing the result of the StartStudioSSOConfigurationRepair operation returned by the
     *         service.
     * @sample AmazonNimbleStudioAsync.StartStudioSSOConfigurationRepair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/StartStudioSSOConfigurationRepair"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartStudioSSOConfigurationRepairResult> startStudioSSOConfigurationRepairAsync(
            StartStudioSSOConfigurationRepairRequest startStudioSSOConfigurationRepairRequest);

    /**
     * <p>
     * Repairs the SSO configuration for a given studio.
     * </p>
     * <p>
     * If the studio has a valid AWS SSO configuration currently associated with it, this operation will fail with a
     * validation error.
     * </p>
     * <p>
     * If the studio does not have a valid AWS SSO configuration currently associated with it, then a new AWS SSO
     * application is created for the studio and the studio is changed to the READY state.
     * </p>
     * <p>
     * After the AWS SSO application is repaired, you must use the Amazon Nimble Studio console to add administrators
     * and users to your studio.
     * </p>
     * 
     * @param startStudioSSOConfigurationRepairRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartStudioSSOConfigurationRepair operation returned by the
     *         service.
     * @sample AmazonNimbleStudioAsyncHandler.StartStudioSSOConfigurationRepair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/StartStudioSSOConfigurationRepair"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartStudioSSOConfigurationRepairResult> startStudioSSOConfigurationRepairAsync(
            StartStudioSSOConfigurationRepairRequest startStudioSSOConfigurationRepairRequest,
            com.amazonaws.handlers.AsyncHandler<StartStudioSSOConfigurationRepairRequest, StartStudioSSOConfigurationRepairResult> asyncHandler);

    /**
     * <p>
     * Creates tags for a resource, given its ARN.
     * </p>
     * 
     * @param tagResourceRequest
     *        The ARN for the role that manages access.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonNimbleStudioAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Creates tags for a resource, given its ARN.
     * </p>
     * 
     * @param tagResourceRequest
     *        The ARN for the role that manages access.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Deletes the tags for a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonNimbleStudioAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Deletes the tags for a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Update a launch profile.
     * </p>
     * 
     * @param updateLaunchProfileRequest
     *        The launch profile ID.
     * @return A Java Future containing the result of the UpdateLaunchProfile operation returned by the service.
     * @sample AmazonNimbleStudioAsync.UpdateLaunchProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UpdateLaunchProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLaunchProfileResult> updateLaunchProfileAsync(UpdateLaunchProfileRequest updateLaunchProfileRequest);

    /**
     * <p>
     * Update a launch profile.
     * </p>
     * 
     * @param updateLaunchProfileRequest
     *        The launch profile ID.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLaunchProfile operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.UpdateLaunchProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UpdateLaunchProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLaunchProfileResult> updateLaunchProfileAsync(UpdateLaunchProfileRequest updateLaunchProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLaunchProfileRequest, UpdateLaunchProfileResult> asyncHandler);

    /**
     * <p>
     * Update a user persona in launch profile membership.
     * </p>
     * 
     * @param updateLaunchProfileMemberRequest
     *        The principal ID.
     * @return A Java Future containing the result of the UpdateLaunchProfileMember operation returned by the service.
     * @sample AmazonNimbleStudioAsync.UpdateLaunchProfileMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UpdateLaunchProfileMember"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLaunchProfileMemberResult> updateLaunchProfileMemberAsync(
            UpdateLaunchProfileMemberRequest updateLaunchProfileMemberRequest);

    /**
     * <p>
     * Update a user persona in launch profile membership.
     * </p>
     * 
     * @param updateLaunchProfileMemberRequest
     *        The principal ID.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLaunchProfileMember operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.UpdateLaunchProfileMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UpdateLaunchProfileMember"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLaunchProfileMemberResult> updateLaunchProfileMemberAsync(
            UpdateLaunchProfileMemberRequest updateLaunchProfileMemberRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLaunchProfileMemberRequest, UpdateLaunchProfileMemberResult> asyncHandler);

    /**
     * <p>
     * Update streaming image.
     * </p>
     * 
     * @param updateStreamingImageRequest
     *        The streaming image ID.
     * @return A Java Future containing the result of the UpdateStreamingImage operation returned by the service.
     * @sample AmazonNimbleStudioAsync.UpdateStreamingImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UpdateStreamingImage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateStreamingImageResult> updateStreamingImageAsync(UpdateStreamingImageRequest updateStreamingImageRequest);

    /**
     * <p>
     * Update streaming image.
     * </p>
     * 
     * @param updateStreamingImageRequest
     *        The streaming image ID.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStreamingImage operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.UpdateStreamingImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UpdateStreamingImage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateStreamingImageResult> updateStreamingImageAsync(UpdateStreamingImageRequest updateStreamingImageRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStreamingImageRequest, UpdateStreamingImageResult> asyncHandler);

    /**
     * <p>
     * Update a Studio resource.
     * </p>
     * <p>
     * Currently, this operation only supports updating the displayName of your studio.
     * </p>
     * 
     * @param updateStudioRequest
     *        The studio ID.
     * @return A Java Future containing the result of the UpdateStudio operation returned by the service.
     * @sample AmazonNimbleStudioAsync.UpdateStudio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UpdateStudio" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateStudioResult> updateStudioAsync(UpdateStudioRequest updateStudioRequest);

    /**
     * <p>
     * Update a Studio resource.
     * </p>
     * <p>
     * Currently, this operation only supports updating the displayName of your studio.
     * </p>
     * 
     * @param updateStudioRequest
     *        The studio ID.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStudio operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.UpdateStudio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UpdateStudio" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateStudioResult> updateStudioAsync(UpdateStudioRequest updateStudioRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStudioRequest, UpdateStudioResult> asyncHandler);

    /**
     * <p>
     * Updates a studio component resource.
     * </p>
     * 
     * @param updateStudioComponentRequest
     *        The studio component ID.
     * @return A Java Future containing the result of the UpdateStudioComponent operation returned by the service.
     * @sample AmazonNimbleStudioAsync.UpdateStudioComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UpdateStudioComponent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateStudioComponentResult> updateStudioComponentAsync(UpdateStudioComponentRequest updateStudioComponentRequest);

    /**
     * <p>
     * Updates a studio component resource.
     * </p>
     * 
     * @param updateStudioComponentRequest
     *        The studio component ID.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStudioComponent operation returned by the service.
     * @sample AmazonNimbleStudioAsyncHandler.UpdateStudioComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UpdateStudioComponent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateStudioComponentResult> updateStudioComponentAsync(UpdateStudioComponentRequest updateStudioComponentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStudioComponentRequest, UpdateStudioComponentResult> asyncHandler);

}
