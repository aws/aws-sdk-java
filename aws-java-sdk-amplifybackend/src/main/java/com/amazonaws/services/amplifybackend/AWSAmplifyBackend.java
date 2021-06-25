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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.amplifybackend.model.*;

/**
 * Interface for accessing AmplifyBackend.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.amplifybackend.AbstractAWSAmplifyBackend} instead.
 * </p>
 * <p>
 * <p>
 * AWS Amplify Admin API
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAmplifyBackend {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "amplifybackend";

    /**
     * <p>
     * This operation clones an existing backend.
     * </p>
     * 
     * @param cloneBackendRequest
     *        The request body for CloneBackend.
     * @return Result of the CloneBackend operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.CloneBackend
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CloneBackend" target="_top">AWS
     *      API Documentation</a>
     */
    CloneBackendResult cloneBackend(CloneBackendRequest cloneBackendRequest);

    /**
     * <p>
     * This operation creates a backend for an Amplify app. Backends are automatically created at the time of app
     * creation.
     * </p>
     * 
     * @param createBackendRequest
     *        The request body for CreateBackend.
     * @return Result of the CreateBackend operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.CreateBackend
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateBackend" target="_top">AWS
     *      API Documentation</a>
     */
    CreateBackendResult createBackend(CreateBackendRequest createBackendRequest);

    /**
     * <p>
     * Creates a new backend API resource.
     * </p>
     * 
     * @param createBackendAPIRequest
     *        The request body for CreateBackendAPI.
     * @return Result of the CreateBackendAPI operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.CreateBackendAPI
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateBackendAPI"
     *      target="_top">AWS API Documentation</a>
     */
    CreateBackendAPIResult createBackendAPI(CreateBackendAPIRequest createBackendAPIRequest);

    /**
     * <p>
     * Creates a new backend authentication resource.
     * </p>
     * 
     * @param createBackendAuthRequest
     *        The request body for CreateBackendAuth.
     * @return Result of the CreateBackendAuth operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.CreateBackendAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateBackendAuth"
     *      target="_top">AWS API Documentation</a>
     */
    CreateBackendAuthResult createBackendAuth(CreateBackendAuthRequest createBackendAuthRequest);

    /**
     * <p>
     * Creates a config object for a backend.
     * </p>
     * 
     * @param createBackendConfigRequest
     *        The request body for CreateBackendConfig.
     * @return Result of the CreateBackendConfig operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.CreateBackendConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateBackendConfig"
     *      target="_top">AWS API Documentation</a>
     */
    CreateBackendConfigResult createBackendConfig(CreateBackendConfigRequest createBackendConfigRequest);

    /**
     * <p>
     * Generates a one-time challenge code to authenticate a user into your Amplify Admin UI.
     * </p>
     * 
     * @param createTokenRequest
     * @return Result of the CreateToken operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.CreateToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateToken" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTokenResult createToken(CreateTokenRequest createTokenRequest);

    /**
     * <p>
     * Removes an existing environment from your Amplify project.
     * </p>
     * 
     * @param deleteBackendRequest
     * @return Result of the DeleteBackend operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.DeleteBackend
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/DeleteBackend" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteBackendResult deleteBackend(DeleteBackendRequest deleteBackendRequest);

    /**
     * <p>
     * Deletes an existing backend API resource.
     * </p>
     * 
     * @param deleteBackendAPIRequest
     *        The request body for DeleteBackendAPI.
     * @return Result of the DeleteBackendAPI operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.DeleteBackendAPI
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/DeleteBackendAPI"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteBackendAPIResult deleteBackendAPI(DeleteBackendAPIRequest deleteBackendAPIRequest);

    /**
     * <p>
     * Deletes an existing backend authentication resource.
     * </p>
     * 
     * @param deleteBackendAuthRequest
     *        The request body for DeleteBackendAuth.
     * @return Result of the DeleteBackendAuth operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.DeleteBackendAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/DeleteBackendAuth"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteBackendAuthResult deleteBackendAuth(DeleteBackendAuthRequest deleteBackendAuthRequest);

    /**
     * <p>
     * Deletes the challenge token based on the given appId and sessionId.
     * </p>
     * 
     * @param deleteTokenRequest
     * @return Result of the DeleteToken operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.DeleteToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/DeleteToken" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTokenResult deleteToken(DeleteTokenRequest deleteTokenRequest);

    /**
     * <p>
     * Generates a model schema for an existing backend API resource.
     * </p>
     * 
     * @param generateBackendAPIModelsRequest
     *        The request body for GenerateBackendAPIModels.
     * @return Result of the GenerateBackendAPIModels operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.GenerateBackendAPIModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GenerateBackendAPIModels"
     *      target="_top">AWS API Documentation</a>
     */
    GenerateBackendAPIModelsResult generateBackendAPIModels(GenerateBackendAPIModelsRequest generateBackendAPIModelsRequest);

    /**
     * <p>
     * Provides project-level details for your Amplify UI project.
     * </p>
     * 
     * @param getBackendRequest
     *        The request body for GetBackend.
     * @return Result of the GetBackend operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.GetBackend
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetBackend" target="_top">AWS API
     *      Documentation</a>
     */
    GetBackendResult getBackend(GetBackendRequest getBackendRequest);

    /**
     * <p>
     * Gets the details for a backend API.
     * </p>
     * 
     * @param getBackendAPIRequest
     *        The request body for GetBackendAPI.
     * @return Result of the GetBackendAPI operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.GetBackendAPI
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetBackendAPI" target="_top">AWS
     *      API Documentation</a>
     */
    GetBackendAPIResult getBackendAPI(GetBackendAPIRequest getBackendAPIRequest);

    /**
     * <p>
     * Generates a model schema for existing backend API resource.
     * </p>
     * 
     * @param getBackendAPIModelsRequest
     *        The request body for GetBackendAPIModels.
     * @return Result of the GetBackendAPIModels operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.GetBackendAPIModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetBackendAPIModels"
     *      target="_top">AWS API Documentation</a>
     */
    GetBackendAPIModelsResult getBackendAPIModels(GetBackendAPIModelsRequest getBackendAPIModelsRequest);

    /**
     * <p>
     * Gets a backend auth details.
     * </p>
     * 
     * @param getBackendAuthRequest
     *        The request body for GetBackendAuth.
     * @return Result of the GetBackendAuth operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.GetBackendAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetBackendAuth" target="_top">AWS
     *      API Documentation</a>
     */
    GetBackendAuthResult getBackendAuth(GetBackendAuthRequest getBackendAuthRequest);

    /**
     * <p>
     * Returns information about a specific job.
     * </p>
     * 
     * @param getBackendJobRequest
     * @return Result of the GetBackendJob operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.GetBackendJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetBackendJob" target="_top">AWS
     *      API Documentation</a>
     */
    GetBackendJobResult getBackendJob(GetBackendJobRequest getBackendJobRequest);

    /**
     * <p>
     * Gets the challenge token based on the given appId and sessionId.
     * </p>
     * 
     * @param getTokenRequest
     * @return Result of the GetToken operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.GetToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetToken" target="_top">AWS API
     *      Documentation</a>
     */
    GetTokenResult getToken(GetTokenRequest getTokenRequest);

    /**
     * <p>
     * Imports an existing backend authentication resource.
     * </p>
     * 
     * @param importBackendAuthRequest
     *        The request body for ImportBackendAuth.
     * @return Result of the ImportBackendAuth operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.ImportBackendAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/ImportBackendAuth"
     *      target="_top">AWS API Documentation</a>
     */
    ImportBackendAuthResult importBackendAuth(ImportBackendAuthRequest importBackendAuthRequest);

    /**
     * <p>
     * Lists the jobs for the backend of an Amplify app.
     * </p>
     * 
     * @param listBackendJobsRequest
     *        The request body for ListBackendJobs.
     * @return Result of the ListBackendJobs operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.ListBackendJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/ListBackendJobs" target="_top">AWS
     *      API Documentation</a>
     */
    ListBackendJobsResult listBackendJobs(ListBackendJobsRequest listBackendJobsRequest);

    /**
     * <p>
     * Removes all backend environments from your Amplify project.
     * </p>
     * 
     * @param removeAllBackendsRequest
     *        The request body for RemoveAllBackends.
     * @return Result of the RemoveAllBackends operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.RemoveAllBackends
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/RemoveAllBackends"
     *      target="_top">AWS API Documentation</a>
     */
    RemoveAllBackendsResult removeAllBackends(RemoveAllBackendsRequest removeAllBackendsRequest);

    /**
     * <p>
     * Removes the AWS resources required to access the Amplify Admin UI.
     * </p>
     * 
     * @param removeBackendConfigRequest
     * @return Result of the RemoveBackendConfig operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.RemoveBackendConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/RemoveBackendConfig"
     *      target="_top">AWS API Documentation</a>
     */
    RemoveBackendConfigResult removeBackendConfig(RemoveBackendConfigRequest removeBackendConfigRequest);

    /**
     * <p>
     * Updates an existing backend API resource.
     * </p>
     * 
     * @param updateBackendAPIRequest
     *        The request body for UpdateBackendAPI.
     * @return Result of the UpdateBackendAPI operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.UpdateBackendAPI
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/UpdateBackendAPI"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateBackendAPIResult updateBackendAPI(UpdateBackendAPIRequest updateBackendAPIRequest);

    /**
     * <p>
     * Updates an existing backend authentication resource.
     * </p>
     * 
     * @param updateBackendAuthRequest
     *        The request body for UpdateBackendAuth.
     * @return Result of the UpdateBackendAuth operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.UpdateBackendAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/UpdateBackendAuth"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateBackendAuthResult updateBackendAuth(UpdateBackendAuthRequest updateBackendAuthRequest);

    /**
     * <p>
     * Updates the AWS resources required to access the Amplify Admin UI.
     * </p>
     * 
     * @param updateBackendConfigRequest
     *        The request body for UpdateBackendConfig.
     * @return Result of the UpdateBackendConfig operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.UpdateBackendConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/UpdateBackendConfig"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateBackendConfigResult updateBackendConfig(UpdateBackendConfigRequest updateBackendConfigRequest);

    /**
     * <p>
     * Updates a specific job.
     * </p>
     * 
     * @param updateBackendJobRequest
     *        The request body for GetBackendJob.
     * @return Result of the UpdateBackendJob operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws GatewayTimeoutException
     *         504 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @sample AWSAmplifyBackend.UpdateBackendJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/UpdateBackendJob"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateBackendJobResult updateBackendJob(UpdateBackendJobRequest updateBackendJobRequest);

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
