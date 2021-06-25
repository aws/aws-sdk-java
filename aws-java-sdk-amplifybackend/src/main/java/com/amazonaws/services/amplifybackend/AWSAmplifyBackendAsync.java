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
package com.amazonaws.services.amplifybackend;

import javax.annotation.Generated;

import com.amazonaws.services.amplifybackend.model.*;

/**
 * Interface for accessing AmplifyBackend asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.amplifybackend.AbstractAWSAmplifyBackendAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS Amplify Admin API
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAmplifyBackendAsync extends AWSAmplifyBackend {

    /**
     * <p>
     * This operation clones an existing backend.
     * </p>
     * 
     * @param cloneBackendRequest
     *        The request body for CloneBackend.
     * @return A Java Future containing the result of the CloneBackend operation returned by the service.
     * @sample AWSAmplifyBackendAsync.CloneBackend
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CloneBackend" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CloneBackendResult> cloneBackendAsync(CloneBackendRequest cloneBackendRequest);

    /**
     * <p>
     * This operation clones an existing backend.
     * </p>
     * 
     * @param cloneBackendRequest
     *        The request body for CloneBackend.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CloneBackend operation returned by the service.
     * @sample AWSAmplifyBackendAsyncHandler.CloneBackend
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CloneBackend" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CloneBackendResult> cloneBackendAsync(CloneBackendRequest cloneBackendRequest,
            com.amazonaws.handlers.AsyncHandler<CloneBackendRequest, CloneBackendResult> asyncHandler);

    /**
     * <p>
     * This operation creates a backend for an Amplify app. Backends are automatically created at the time of app
     * creation.
     * </p>
     * 
     * @param createBackendRequest
     *        The request body for CreateBackend.
     * @return A Java Future containing the result of the CreateBackend operation returned by the service.
     * @sample AWSAmplifyBackendAsync.CreateBackend
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateBackend" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateBackendResult> createBackendAsync(CreateBackendRequest createBackendRequest);

    /**
     * <p>
     * This operation creates a backend for an Amplify app. Backends are automatically created at the time of app
     * creation.
     * </p>
     * 
     * @param createBackendRequest
     *        The request body for CreateBackend.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBackend operation returned by the service.
     * @sample AWSAmplifyBackendAsyncHandler.CreateBackend
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateBackend" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateBackendResult> createBackendAsync(CreateBackendRequest createBackendRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBackendRequest, CreateBackendResult> asyncHandler);

    /**
     * <p>
     * Creates a new backend API resource.
     * </p>
     * 
     * @param createBackendAPIRequest
     *        The request body for CreateBackendAPI.
     * @return A Java Future containing the result of the CreateBackendAPI operation returned by the service.
     * @sample AWSAmplifyBackendAsync.CreateBackendAPI
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateBackendAPI"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBackendAPIResult> createBackendAPIAsync(CreateBackendAPIRequest createBackendAPIRequest);

    /**
     * <p>
     * Creates a new backend API resource.
     * </p>
     * 
     * @param createBackendAPIRequest
     *        The request body for CreateBackendAPI.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBackendAPI operation returned by the service.
     * @sample AWSAmplifyBackendAsyncHandler.CreateBackendAPI
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateBackendAPI"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBackendAPIResult> createBackendAPIAsync(CreateBackendAPIRequest createBackendAPIRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBackendAPIRequest, CreateBackendAPIResult> asyncHandler);

    /**
     * <p>
     * Creates a new backend authentication resource.
     * </p>
     * 
     * @param createBackendAuthRequest
     *        The request body for CreateBackendAuth.
     * @return A Java Future containing the result of the CreateBackendAuth operation returned by the service.
     * @sample AWSAmplifyBackendAsync.CreateBackendAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateBackendAuth"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBackendAuthResult> createBackendAuthAsync(CreateBackendAuthRequest createBackendAuthRequest);

    /**
     * <p>
     * Creates a new backend authentication resource.
     * </p>
     * 
     * @param createBackendAuthRequest
     *        The request body for CreateBackendAuth.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBackendAuth operation returned by the service.
     * @sample AWSAmplifyBackendAsyncHandler.CreateBackendAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateBackendAuth"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBackendAuthResult> createBackendAuthAsync(CreateBackendAuthRequest createBackendAuthRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBackendAuthRequest, CreateBackendAuthResult> asyncHandler);

    /**
     * <p>
     * Creates a config object for a backend.
     * </p>
     * 
     * @param createBackendConfigRequest
     *        The request body for CreateBackendConfig.
     * @return A Java Future containing the result of the CreateBackendConfig operation returned by the service.
     * @sample AWSAmplifyBackendAsync.CreateBackendConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateBackendConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBackendConfigResult> createBackendConfigAsync(CreateBackendConfigRequest createBackendConfigRequest);

    /**
     * <p>
     * Creates a config object for a backend.
     * </p>
     * 
     * @param createBackendConfigRequest
     *        The request body for CreateBackendConfig.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBackendConfig operation returned by the service.
     * @sample AWSAmplifyBackendAsyncHandler.CreateBackendConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateBackendConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBackendConfigResult> createBackendConfigAsync(CreateBackendConfigRequest createBackendConfigRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBackendConfigRequest, CreateBackendConfigResult> asyncHandler);

    /**
     * <p>
     * Generates a one-time challenge code to authenticate a user into your Amplify Admin UI.
     * </p>
     * 
     * @param createTokenRequest
     * @return A Java Future containing the result of the CreateToken operation returned by the service.
     * @sample AWSAmplifyBackendAsync.CreateToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateToken" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTokenResult> createTokenAsync(CreateTokenRequest createTokenRequest);

    /**
     * <p>
     * Generates a one-time challenge code to authenticate a user into your Amplify Admin UI.
     * </p>
     * 
     * @param createTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateToken operation returned by the service.
     * @sample AWSAmplifyBackendAsyncHandler.CreateToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateToken" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTokenResult> createTokenAsync(CreateTokenRequest createTokenRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTokenRequest, CreateTokenResult> asyncHandler);

    /**
     * <p>
     * Removes an existing environment from your Amplify project.
     * </p>
     * 
     * @param deleteBackendRequest
     * @return A Java Future containing the result of the DeleteBackend operation returned by the service.
     * @sample AWSAmplifyBackendAsync.DeleteBackend
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/DeleteBackend" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackendResult> deleteBackendAsync(DeleteBackendRequest deleteBackendRequest);

    /**
     * <p>
     * Removes an existing environment from your Amplify project.
     * </p>
     * 
     * @param deleteBackendRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBackend operation returned by the service.
     * @sample AWSAmplifyBackendAsyncHandler.DeleteBackend
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/DeleteBackend" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackendResult> deleteBackendAsync(DeleteBackendRequest deleteBackendRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBackendRequest, DeleteBackendResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing backend API resource.
     * </p>
     * 
     * @param deleteBackendAPIRequest
     *        The request body for DeleteBackendAPI.
     * @return A Java Future containing the result of the DeleteBackendAPI operation returned by the service.
     * @sample AWSAmplifyBackendAsync.DeleteBackendAPI
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/DeleteBackendAPI"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackendAPIResult> deleteBackendAPIAsync(DeleteBackendAPIRequest deleteBackendAPIRequest);

    /**
     * <p>
     * Deletes an existing backend API resource.
     * </p>
     * 
     * @param deleteBackendAPIRequest
     *        The request body for DeleteBackendAPI.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBackendAPI operation returned by the service.
     * @sample AWSAmplifyBackendAsyncHandler.DeleteBackendAPI
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/DeleteBackendAPI"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackendAPIResult> deleteBackendAPIAsync(DeleteBackendAPIRequest deleteBackendAPIRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBackendAPIRequest, DeleteBackendAPIResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing backend authentication resource.
     * </p>
     * 
     * @param deleteBackendAuthRequest
     *        The request body for DeleteBackendAuth.
     * @return A Java Future containing the result of the DeleteBackendAuth operation returned by the service.
     * @sample AWSAmplifyBackendAsync.DeleteBackendAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/DeleteBackendAuth"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackendAuthResult> deleteBackendAuthAsync(DeleteBackendAuthRequest deleteBackendAuthRequest);

    /**
     * <p>
     * Deletes an existing backend authentication resource.
     * </p>
     * 
     * @param deleteBackendAuthRequest
     *        The request body for DeleteBackendAuth.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBackendAuth operation returned by the service.
     * @sample AWSAmplifyBackendAsyncHandler.DeleteBackendAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/DeleteBackendAuth"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackendAuthResult> deleteBackendAuthAsync(DeleteBackendAuthRequest deleteBackendAuthRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBackendAuthRequest, DeleteBackendAuthResult> asyncHandler);

    /**
     * <p>
     * Deletes the challenge token based on the given appId and sessionId.
     * </p>
     * 
     * @param deleteTokenRequest
     * @return A Java Future containing the result of the DeleteToken operation returned by the service.
     * @sample AWSAmplifyBackendAsync.DeleteToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/DeleteToken" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTokenResult> deleteTokenAsync(DeleteTokenRequest deleteTokenRequest);

    /**
     * <p>
     * Deletes the challenge token based on the given appId and sessionId.
     * </p>
     * 
     * @param deleteTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteToken operation returned by the service.
     * @sample AWSAmplifyBackendAsyncHandler.DeleteToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/DeleteToken" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTokenResult> deleteTokenAsync(DeleteTokenRequest deleteTokenRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTokenRequest, DeleteTokenResult> asyncHandler);

    /**
     * <p>
     * Generates a model schema for an existing backend API resource.
     * </p>
     * 
     * @param generateBackendAPIModelsRequest
     *        The request body for GenerateBackendAPIModels.
     * @return A Java Future containing the result of the GenerateBackendAPIModels operation returned by the service.
     * @sample AWSAmplifyBackendAsync.GenerateBackendAPIModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GenerateBackendAPIModels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GenerateBackendAPIModelsResult> generateBackendAPIModelsAsync(GenerateBackendAPIModelsRequest generateBackendAPIModelsRequest);

    /**
     * <p>
     * Generates a model schema for an existing backend API resource.
     * </p>
     * 
     * @param generateBackendAPIModelsRequest
     *        The request body for GenerateBackendAPIModels.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GenerateBackendAPIModels operation returned by the service.
     * @sample AWSAmplifyBackendAsyncHandler.GenerateBackendAPIModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GenerateBackendAPIModels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GenerateBackendAPIModelsResult> generateBackendAPIModelsAsync(GenerateBackendAPIModelsRequest generateBackendAPIModelsRequest,
            com.amazonaws.handlers.AsyncHandler<GenerateBackendAPIModelsRequest, GenerateBackendAPIModelsResult> asyncHandler);

    /**
     * <p>
     * Provides project-level details for your Amplify UI project.
     * </p>
     * 
     * @param getBackendRequest
     *        The request body for GetBackend.
     * @return A Java Future containing the result of the GetBackend operation returned by the service.
     * @sample AWSAmplifyBackendAsync.GetBackend
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetBackend" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBackendResult> getBackendAsync(GetBackendRequest getBackendRequest);

    /**
     * <p>
     * Provides project-level details for your Amplify UI project.
     * </p>
     * 
     * @param getBackendRequest
     *        The request body for GetBackend.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBackend operation returned by the service.
     * @sample AWSAmplifyBackendAsyncHandler.GetBackend
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetBackend" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBackendResult> getBackendAsync(GetBackendRequest getBackendRequest,
            com.amazonaws.handlers.AsyncHandler<GetBackendRequest, GetBackendResult> asyncHandler);

    /**
     * <p>
     * Gets the details for a backend API.
     * </p>
     * 
     * @param getBackendAPIRequest
     *        The request body for GetBackendAPI.
     * @return A Java Future containing the result of the GetBackendAPI operation returned by the service.
     * @sample AWSAmplifyBackendAsync.GetBackendAPI
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetBackendAPI" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetBackendAPIResult> getBackendAPIAsync(GetBackendAPIRequest getBackendAPIRequest);

    /**
     * <p>
     * Gets the details for a backend API.
     * </p>
     * 
     * @param getBackendAPIRequest
     *        The request body for GetBackendAPI.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBackendAPI operation returned by the service.
     * @sample AWSAmplifyBackendAsyncHandler.GetBackendAPI
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetBackendAPI" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetBackendAPIResult> getBackendAPIAsync(GetBackendAPIRequest getBackendAPIRequest,
            com.amazonaws.handlers.AsyncHandler<GetBackendAPIRequest, GetBackendAPIResult> asyncHandler);

    /**
     * <p>
     * Generates a model schema for existing backend API resource.
     * </p>
     * 
     * @param getBackendAPIModelsRequest
     *        The request body for GetBackendAPIModels.
     * @return A Java Future containing the result of the GetBackendAPIModels operation returned by the service.
     * @sample AWSAmplifyBackendAsync.GetBackendAPIModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetBackendAPIModels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetBackendAPIModelsResult> getBackendAPIModelsAsync(GetBackendAPIModelsRequest getBackendAPIModelsRequest);

    /**
     * <p>
     * Generates a model schema for existing backend API resource.
     * </p>
     * 
     * @param getBackendAPIModelsRequest
     *        The request body for GetBackendAPIModels.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBackendAPIModels operation returned by the service.
     * @sample AWSAmplifyBackendAsyncHandler.GetBackendAPIModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetBackendAPIModels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetBackendAPIModelsResult> getBackendAPIModelsAsync(GetBackendAPIModelsRequest getBackendAPIModelsRequest,
            com.amazonaws.handlers.AsyncHandler<GetBackendAPIModelsRequest, GetBackendAPIModelsResult> asyncHandler);

    /**
     * <p>
     * Gets a backend auth details.
     * </p>
     * 
     * @param getBackendAuthRequest
     *        The request body for GetBackendAuth.
     * @return A Java Future containing the result of the GetBackendAuth operation returned by the service.
     * @sample AWSAmplifyBackendAsync.GetBackendAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetBackendAuth" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetBackendAuthResult> getBackendAuthAsync(GetBackendAuthRequest getBackendAuthRequest);

    /**
     * <p>
     * Gets a backend auth details.
     * </p>
     * 
     * @param getBackendAuthRequest
     *        The request body for GetBackendAuth.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBackendAuth operation returned by the service.
     * @sample AWSAmplifyBackendAsyncHandler.GetBackendAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetBackendAuth" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetBackendAuthResult> getBackendAuthAsync(GetBackendAuthRequest getBackendAuthRequest,
            com.amazonaws.handlers.AsyncHandler<GetBackendAuthRequest, GetBackendAuthResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific job.
     * </p>
     * 
     * @param getBackendJobRequest
     * @return A Java Future containing the result of the GetBackendJob operation returned by the service.
     * @sample AWSAmplifyBackendAsync.GetBackendJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetBackendJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetBackendJobResult> getBackendJobAsync(GetBackendJobRequest getBackendJobRequest);

    /**
     * <p>
     * Returns information about a specific job.
     * </p>
     * 
     * @param getBackendJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBackendJob operation returned by the service.
     * @sample AWSAmplifyBackendAsyncHandler.GetBackendJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetBackendJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetBackendJobResult> getBackendJobAsync(GetBackendJobRequest getBackendJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetBackendJobRequest, GetBackendJobResult> asyncHandler);

    /**
     * <p>
     * Gets the challenge token based on the given appId and sessionId.
     * </p>
     * 
     * @param getTokenRequest
     * @return A Java Future containing the result of the GetToken operation returned by the service.
     * @sample AWSAmplifyBackendAsync.GetToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetToken" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTokenResult> getTokenAsync(GetTokenRequest getTokenRequest);

    /**
     * <p>
     * Gets the challenge token based on the given appId and sessionId.
     * </p>
     * 
     * @param getTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetToken operation returned by the service.
     * @sample AWSAmplifyBackendAsyncHandler.GetToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetToken" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTokenResult> getTokenAsync(GetTokenRequest getTokenRequest,
            com.amazonaws.handlers.AsyncHandler<GetTokenRequest, GetTokenResult> asyncHandler);

    /**
     * <p>
     * Imports an existing backend authentication resource.
     * </p>
     * 
     * @param importBackendAuthRequest
     *        The request body for ImportBackendAuth.
     * @return A Java Future containing the result of the ImportBackendAuth operation returned by the service.
     * @sample AWSAmplifyBackendAsync.ImportBackendAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/ImportBackendAuth"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportBackendAuthResult> importBackendAuthAsync(ImportBackendAuthRequest importBackendAuthRequest);

    /**
     * <p>
     * Imports an existing backend authentication resource.
     * </p>
     * 
     * @param importBackendAuthRequest
     *        The request body for ImportBackendAuth.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportBackendAuth operation returned by the service.
     * @sample AWSAmplifyBackendAsyncHandler.ImportBackendAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/ImportBackendAuth"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportBackendAuthResult> importBackendAuthAsync(ImportBackendAuthRequest importBackendAuthRequest,
            com.amazonaws.handlers.AsyncHandler<ImportBackendAuthRequest, ImportBackendAuthResult> asyncHandler);

    /**
     * <p>
     * Lists the jobs for the backend of an Amplify app.
     * </p>
     * 
     * @param listBackendJobsRequest
     *        The request body for ListBackendJobs.
     * @return A Java Future containing the result of the ListBackendJobs operation returned by the service.
     * @sample AWSAmplifyBackendAsync.ListBackendJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/ListBackendJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListBackendJobsResult> listBackendJobsAsync(ListBackendJobsRequest listBackendJobsRequest);

    /**
     * <p>
     * Lists the jobs for the backend of an Amplify app.
     * </p>
     * 
     * @param listBackendJobsRequest
     *        The request body for ListBackendJobs.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBackendJobs operation returned by the service.
     * @sample AWSAmplifyBackendAsyncHandler.ListBackendJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/ListBackendJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListBackendJobsResult> listBackendJobsAsync(ListBackendJobsRequest listBackendJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBackendJobsRequest, ListBackendJobsResult> asyncHandler);

    /**
     * <p>
     * Removes all backend environments from your Amplify project.
     * </p>
     * 
     * @param removeAllBackendsRequest
     *        The request body for RemoveAllBackends.
     * @return A Java Future containing the result of the RemoveAllBackends operation returned by the service.
     * @sample AWSAmplifyBackendAsync.RemoveAllBackends
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/RemoveAllBackends"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveAllBackendsResult> removeAllBackendsAsync(RemoveAllBackendsRequest removeAllBackendsRequest);

    /**
     * <p>
     * Removes all backend environments from your Amplify project.
     * </p>
     * 
     * @param removeAllBackendsRequest
     *        The request body for RemoveAllBackends.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveAllBackends operation returned by the service.
     * @sample AWSAmplifyBackendAsyncHandler.RemoveAllBackends
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/RemoveAllBackends"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveAllBackendsResult> removeAllBackendsAsync(RemoveAllBackendsRequest removeAllBackendsRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveAllBackendsRequest, RemoveAllBackendsResult> asyncHandler);

    /**
     * <p>
     * Removes the AWS resources required to access the Amplify Admin UI.
     * </p>
     * 
     * @param removeBackendConfigRequest
     * @return A Java Future containing the result of the RemoveBackendConfig operation returned by the service.
     * @sample AWSAmplifyBackendAsync.RemoveBackendConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/RemoveBackendConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveBackendConfigResult> removeBackendConfigAsync(RemoveBackendConfigRequest removeBackendConfigRequest);

    /**
     * <p>
     * Removes the AWS resources required to access the Amplify Admin UI.
     * </p>
     * 
     * @param removeBackendConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveBackendConfig operation returned by the service.
     * @sample AWSAmplifyBackendAsyncHandler.RemoveBackendConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/RemoveBackendConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveBackendConfigResult> removeBackendConfigAsync(RemoveBackendConfigRequest removeBackendConfigRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveBackendConfigRequest, RemoveBackendConfigResult> asyncHandler);

    /**
     * <p>
     * Updates an existing backend API resource.
     * </p>
     * 
     * @param updateBackendAPIRequest
     *        The request body for UpdateBackendAPI.
     * @return A Java Future containing the result of the UpdateBackendAPI operation returned by the service.
     * @sample AWSAmplifyBackendAsync.UpdateBackendAPI
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/UpdateBackendAPI"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBackendAPIResult> updateBackendAPIAsync(UpdateBackendAPIRequest updateBackendAPIRequest);

    /**
     * <p>
     * Updates an existing backend API resource.
     * </p>
     * 
     * @param updateBackendAPIRequest
     *        The request body for UpdateBackendAPI.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBackendAPI operation returned by the service.
     * @sample AWSAmplifyBackendAsyncHandler.UpdateBackendAPI
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/UpdateBackendAPI"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBackendAPIResult> updateBackendAPIAsync(UpdateBackendAPIRequest updateBackendAPIRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBackendAPIRequest, UpdateBackendAPIResult> asyncHandler);

    /**
     * <p>
     * Updates an existing backend authentication resource.
     * </p>
     * 
     * @param updateBackendAuthRequest
     *        The request body for UpdateBackendAuth.
     * @return A Java Future containing the result of the UpdateBackendAuth operation returned by the service.
     * @sample AWSAmplifyBackendAsync.UpdateBackendAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/UpdateBackendAuth"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBackendAuthResult> updateBackendAuthAsync(UpdateBackendAuthRequest updateBackendAuthRequest);

    /**
     * <p>
     * Updates an existing backend authentication resource.
     * </p>
     * 
     * @param updateBackendAuthRequest
     *        The request body for UpdateBackendAuth.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBackendAuth operation returned by the service.
     * @sample AWSAmplifyBackendAsyncHandler.UpdateBackendAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/UpdateBackendAuth"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBackendAuthResult> updateBackendAuthAsync(UpdateBackendAuthRequest updateBackendAuthRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBackendAuthRequest, UpdateBackendAuthResult> asyncHandler);

    /**
     * <p>
     * Updates the AWS resources required to access the Amplify Admin UI.
     * </p>
     * 
     * @param updateBackendConfigRequest
     *        The request body for UpdateBackendConfig.
     * @return A Java Future containing the result of the UpdateBackendConfig operation returned by the service.
     * @sample AWSAmplifyBackendAsync.UpdateBackendConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/UpdateBackendConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBackendConfigResult> updateBackendConfigAsync(UpdateBackendConfigRequest updateBackendConfigRequest);

    /**
     * <p>
     * Updates the AWS resources required to access the Amplify Admin UI.
     * </p>
     * 
     * @param updateBackendConfigRequest
     *        The request body for UpdateBackendConfig.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBackendConfig operation returned by the service.
     * @sample AWSAmplifyBackendAsyncHandler.UpdateBackendConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/UpdateBackendConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBackendConfigResult> updateBackendConfigAsync(UpdateBackendConfigRequest updateBackendConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBackendConfigRequest, UpdateBackendConfigResult> asyncHandler);

    /**
     * <p>
     * Updates a specific job.
     * </p>
     * 
     * @param updateBackendJobRequest
     *        The request body for GetBackendJob.
     * @return A Java Future containing the result of the UpdateBackendJob operation returned by the service.
     * @sample AWSAmplifyBackendAsync.UpdateBackendJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/UpdateBackendJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBackendJobResult> updateBackendJobAsync(UpdateBackendJobRequest updateBackendJobRequest);

    /**
     * <p>
     * Updates a specific job.
     * </p>
     * 
     * @param updateBackendJobRequest
     *        The request body for GetBackendJob.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBackendJob operation returned by the service.
     * @sample AWSAmplifyBackendAsyncHandler.UpdateBackendJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/UpdateBackendJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBackendJobResult> updateBackendJobAsync(UpdateBackendJobRequest updateBackendJobRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBackendJobRequest, UpdateBackendJobResult> asyncHandler);

}
