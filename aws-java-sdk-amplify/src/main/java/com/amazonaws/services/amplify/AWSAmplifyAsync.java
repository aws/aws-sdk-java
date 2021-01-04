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
package com.amazonaws.services.amplify;

import javax.annotation.Generated;

import com.amazonaws.services.amplify.model.*;

/**
 * Interface for accessing Amplify asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.amplify.AbstractAWSAmplifyAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amplify enables developers to develop and deploy cloud-powered mobile and web apps. The Amplify Console provides a
 * continuous delivery and hosting service for web applications. For more information, see the <a
 * href="https://docs.aws.amazon.com/amplify/latest/userguide/welcome.html">Amplify Console User Guide</a>. The Amplify
 * Framework is a comprehensive set of SDKs, libraries, tools, and documentation for client app development. For more
 * information, see the <a href="https://docs.amplify.aws/">Amplify Framework.</a>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAmplifyAsync extends AWSAmplify {

    /**
     * <p>
     * Creates a new Amplify app.
     * </p>
     * 
     * @param createAppRequest
     *        The request structure used to create apps in Amplify.
     * @return A Java Future containing the result of the CreateApp operation returned by the service.
     * @sample AWSAmplifyAsync.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAppResult> createAppAsync(CreateAppRequest createAppRequest);

    /**
     * <p>
     * Creates a new Amplify app.
     * </p>
     * 
     * @param createAppRequest
     *        The request structure used to create apps in Amplify.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApp operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAppResult> createAppAsync(CreateAppRequest createAppRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAppRequest, CreateAppResult> asyncHandler);

    /**
     * <p>
     * Creates a new backend environment for an Amplify app.
     * </p>
     * 
     * @param createBackendEnvironmentRequest
     *        The request structure for the backend environment create request.
     * @return A Java Future containing the result of the CreateBackendEnvironment operation returned by the service.
     * @sample AWSAmplifyAsync.CreateBackendEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateBackendEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBackendEnvironmentResult> createBackendEnvironmentAsync(CreateBackendEnvironmentRequest createBackendEnvironmentRequest);

    /**
     * <p>
     * Creates a new backend environment for an Amplify app.
     * </p>
     * 
     * @param createBackendEnvironmentRequest
     *        The request structure for the backend environment create request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBackendEnvironment operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.CreateBackendEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateBackendEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBackendEnvironmentResult> createBackendEnvironmentAsync(CreateBackendEnvironmentRequest createBackendEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBackendEnvironmentRequest, CreateBackendEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Creates a new branch for an Amplify app.
     * </p>
     * 
     * @param createBranchRequest
     *        The request structure for the create branch request.
     * @return A Java Future containing the result of the CreateBranch operation returned by the service.
     * @sample AWSAmplifyAsync.CreateBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateBranch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBranchResult> createBranchAsync(CreateBranchRequest createBranchRequest);

    /**
     * <p>
     * Creates a new branch for an Amplify app.
     * </p>
     * 
     * @param createBranchRequest
     *        The request structure for the create branch request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBranch operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.CreateBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateBranch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBranchResult> createBranchAsync(CreateBranchRequest createBranchRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBranchRequest, CreateBranchResult> asyncHandler);

    /**
     * <p>
     * Creates a deployment for a manually deployed Amplify app. Manually deployed apps are not connected to a
     * repository.
     * </p>
     * 
     * @param createDeploymentRequest
     *        The request structure for the create a new deployment request.
     * @return A Java Future containing the result of the CreateDeployment operation returned by the service.
     * @sample AWSAmplifyAsync.CreateDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest createDeploymentRequest);

    /**
     * <p>
     * Creates a deployment for a manually deployed Amplify app. Manually deployed apps are not connected to a
     * repository.
     * </p>
     * 
     * @param createDeploymentRequest
     *        The request structure for the create a new deployment request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDeployment operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.CreateDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest createDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler);

    /**
     * <p>
     * Creates a new domain association for an Amplify app. This action associates a custom domain with the Amplify app
     * </p>
     * 
     * @param createDomainAssociationRequest
     *        The request structure for the create domain association request.
     * @return A Java Future containing the result of the CreateDomainAssociation operation returned by the service.
     * @sample AWSAmplifyAsync.CreateDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateDomainAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDomainAssociationResult> createDomainAssociationAsync(CreateDomainAssociationRequest createDomainAssociationRequest);

    /**
     * <p>
     * Creates a new domain association for an Amplify app. This action associates a custom domain with the Amplify app
     * </p>
     * 
     * @param createDomainAssociationRequest
     *        The request structure for the create domain association request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDomainAssociation operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.CreateDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateDomainAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDomainAssociationResult> createDomainAssociationAsync(CreateDomainAssociationRequest createDomainAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDomainAssociationRequest, CreateDomainAssociationResult> asyncHandler);

    /**
     * <p>
     * Creates a new webhook on an Amplify app.
     * </p>
     * 
     * @param createWebhookRequest
     *        The request structure for the create webhook request.
     * @return A Java Future containing the result of the CreateWebhook operation returned by the service.
     * @sample AWSAmplifyAsync.CreateWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWebhookResult> createWebhookAsync(CreateWebhookRequest createWebhookRequest);

    /**
     * <p>
     * Creates a new webhook on an Amplify app.
     * </p>
     * 
     * @param createWebhookRequest
     *        The request structure for the create webhook request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWebhook operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.CreateWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWebhookResult> createWebhookAsync(CreateWebhookRequest createWebhookRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWebhookRequest, CreateWebhookResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing Amplify app specified by an app ID.
     * </p>
     * 
     * @param deleteAppRequest
     *        Describes the request structure for the delete app request.
     * @return A Java Future containing the result of the DeleteApp operation returned by the service.
     * @sample AWSAmplifyAsync.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest deleteAppRequest);

    /**
     * <p>
     * Deletes an existing Amplify app specified by an app ID.
     * </p>
     * 
     * @param deleteAppRequest
     *        Describes the request structure for the delete app request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApp operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest deleteAppRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppRequest, DeleteAppResult> asyncHandler);

    /**
     * <p>
     * Deletes a backend environment for an Amplify app.
     * </p>
     * 
     * @param deleteBackendEnvironmentRequest
     *        The request structure for the delete backend environment request.
     * @return A Java Future containing the result of the DeleteBackendEnvironment operation returned by the service.
     * @sample AWSAmplifyAsync.DeleteBackendEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteBackendEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackendEnvironmentResult> deleteBackendEnvironmentAsync(DeleteBackendEnvironmentRequest deleteBackendEnvironmentRequest);

    /**
     * <p>
     * Deletes a backend environment for an Amplify app.
     * </p>
     * 
     * @param deleteBackendEnvironmentRequest
     *        The request structure for the delete backend environment request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBackendEnvironment operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.DeleteBackendEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteBackendEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackendEnvironmentResult> deleteBackendEnvironmentAsync(DeleteBackendEnvironmentRequest deleteBackendEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBackendEnvironmentRequest, DeleteBackendEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Deletes a branch for an Amplify app.
     * </p>
     * 
     * @param deleteBranchRequest
     *        The request structure for the delete branch request.
     * @return A Java Future containing the result of the DeleteBranch operation returned by the service.
     * @sample AWSAmplifyAsync.DeleteBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteBranch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBranchResult> deleteBranchAsync(DeleteBranchRequest deleteBranchRequest);

    /**
     * <p>
     * Deletes a branch for an Amplify app.
     * </p>
     * 
     * @param deleteBranchRequest
     *        The request structure for the delete branch request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBranch operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.DeleteBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteBranch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBranchResult> deleteBranchAsync(DeleteBranchRequest deleteBranchRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBranchRequest, DeleteBranchResult> asyncHandler);

    /**
     * <p>
     * Deletes a domain association for an Amplify app.
     * </p>
     * 
     * @param deleteDomainAssociationRequest
     *        The request structure for the delete domain association request.
     * @return A Java Future containing the result of the DeleteDomainAssociation operation returned by the service.
     * @sample AWSAmplifyAsync.DeleteDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteDomainAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDomainAssociationResult> deleteDomainAssociationAsync(DeleteDomainAssociationRequest deleteDomainAssociationRequest);

    /**
     * <p>
     * Deletes a domain association for an Amplify app.
     * </p>
     * 
     * @param deleteDomainAssociationRequest
     *        The request structure for the delete domain association request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDomainAssociation operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.DeleteDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteDomainAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDomainAssociationResult> deleteDomainAssociationAsync(DeleteDomainAssociationRequest deleteDomainAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainAssociationRequest, DeleteDomainAssociationResult> asyncHandler);

    /**
     * <p>
     * Deletes a job for a branch of an Amplify app.
     * </p>
     * 
     * @param deleteJobRequest
     *        The request structure for the delete job request.
     * @return A Java Future containing the result of the DeleteJob operation returned by the service.
     * @sample AWSAmplifyAsync.DeleteJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteJobResult> deleteJobAsync(DeleteJobRequest deleteJobRequest);

    /**
     * <p>
     * Deletes a job for a branch of an Amplify app.
     * </p>
     * 
     * @param deleteJobRequest
     *        The request structure for the delete job request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteJob operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.DeleteJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteJobResult> deleteJobAsync(DeleteJobRequest deleteJobRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteJobRequest, DeleteJobResult> asyncHandler);

    /**
     * <p>
     * Deletes a webhook.
     * </p>
     * 
     * @param deleteWebhookRequest
     *        The request structure for the delete webhook request.
     * @return A Java Future containing the result of the DeleteWebhook operation returned by the service.
     * @sample AWSAmplifyAsync.DeleteWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWebhookResult> deleteWebhookAsync(DeleteWebhookRequest deleteWebhookRequest);

    /**
     * <p>
     * Deletes a webhook.
     * </p>
     * 
     * @param deleteWebhookRequest
     *        The request structure for the delete webhook request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWebhook operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.DeleteWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWebhookResult> deleteWebhookAsync(DeleteWebhookRequest deleteWebhookRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWebhookRequest, DeleteWebhookResult> asyncHandler);

    /**
     * <p>
     * Returns the website access logs for a specific time range using a presigned URL.
     * </p>
     * 
     * @param generateAccessLogsRequest
     *        The request structure for the generate access logs request.
     * @return A Java Future containing the result of the GenerateAccessLogs operation returned by the service.
     * @sample AWSAmplifyAsync.GenerateAccessLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GenerateAccessLogs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GenerateAccessLogsResult> generateAccessLogsAsync(GenerateAccessLogsRequest generateAccessLogsRequest);

    /**
     * <p>
     * Returns the website access logs for a specific time range using a presigned URL.
     * </p>
     * 
     * @param generateAccessLogsRequest
     *        The request structure for the generate access logs request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GenerateAccessLogs operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.GenerateAccessLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GenerateAccessLogs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GenerateAccessLogsResult> generateAccessLogsAsync(GenerateAccessLogsRequest generateAccessLogsRequest,
            com.amazonaws.handlers.AsyncHandler<GenerateAccessLogsRequest, GenerateAccessLogsResult> asyncHandler);

    /**
     * <p>
     * Returns an existing Amplify app by appID.
     * </p>
     * 
     * @param getAppRequest
     *        The request structure for the get app request.
     * @return A Java Future containing the result of the GetApp operation returned by the service.
     * @sample AWSAmplifyAsync.GetApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAppResult> getAppAsync(GetAppRequest getAppRequest);

    /**
     * <p>
     * Returns an existing Amplify app by appID.
     * </p>
     * 
     * @param getAppRequest
     *        The request structure for the get app request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApp operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.GetApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAppResult> getAppAsync(GetAppRequest getAppRequest,
            com.amazonaws.handlers.AsyncHandler<GetAppRequest, GetAppResult> asyncHandler);

    /**
     * <p>
     * Returns the artifact info that corresponds to an artifact id.
     * </p>
     * 
     * @param getArtifactUrlRequest
     *        Returns the request structure for the get artifact request.
     * @return A Java Future containing the result of the GetArtifactUrl operation returned by the service.
     * @sample AWSAmplifyAsync.GetArtifactUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetArtifactUrl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetArtifactUrlResult> getArtifactUrlAsync(GetArtifactUrlRequest getArtifactUrlRequest);

    /**
     * <p>
     * Returns the artifact info that corresponds to an artifact id.
     * </p>
     * 
     * @param getArtifactUrlRequest
     *        Returns the request structure for the get artifact request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetArtifactUrl operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.GetArtifactUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetArtifactUrl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetArtifactUrlResult> getArtifactUrlAsync(GetArtifactUrlRequest getArtifactUrlRequest,
            com.amazonaws.handlers.AsyncHandler<GetArtifactUrlRequest, GetArtifactUrlResult> asyncHandler);

    /**
     * <p>
     * Returns a backend environment for an Amplify app.
     * </p>
     * 
     * @param getBackendEnvironmentRequest
     *        The request structure for the get backend environment request.
     * @return A Java Future containing the result of the GetBackendEnvironment operation returned by the service.
     * @sample AWSAmplifyAsync.GetBackendEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetBackendEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetBackendEnvironmentResult> getBackendEnvironmentAsync(GetBackendEnvironmentRequest getBackendEnvironmentRequest);

    /**
     * <p>
     * Returns a backend environment for an Amplify app.
     * </p>
     * 
     * @param getBackendEnvironmentRequest
     *        The request structure for the get backend environment request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBackendEnvironment operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.GetBackendEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetBackendEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetBackendEnvironmentResult> getBackendEnvironmentAsync(GetBackendEnvironmentRequest getBackendEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<GetBackendEnvironmentRequest, GetBackendEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Returns a branch for an Amplify app.
     * </p>
     * 
     * @param getBranchRequest
     *        The request structure for the get branch request.
     * @return A Java Future containing the result of the GetBranch operation returned by the service.
     * @sample AWSAmplifyAsync.GetBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetBranch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBranchResult> getBranchAsync(GetBranchRequest getBranchRequest);

    /**
     * <p>
     * Returns a branch for an Amplify app.
     * </p>
     * 
     * @param getBranchRequest
     *        The request structure for the get branch request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBranch operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.GetBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetBranch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBranchResult> getBranchAsync(GetBranchRequest getBranchRequest,
            com.amazonaws.handlers.AsyncHandler<GetBranchRequest, GetBranchResult> asyncHandler);

    /**
     * <p>
     * Returns the domain information for an Amplify app.
     * </p>
     * 
     * @param getDomainAssociationRequest
     *        The request structure for the get domain association request.
     * @return A Java Future containing the result of the GetDomainAssociation operation returned by the service.
     * @sample AWSAmplifyAsync.GetDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetDomainAssociation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDomainAssociationResult> getDomainAssociationAsync(GetDomainAssociationRequest getDomainAssociationRequest);

    /**
     * <p>
     * Returns the domain information for an Amplify app.
     * </p>
     * 
     * @param getDomainAssociationRequest
     *        The request structure for the get domain association request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDomainAssociation operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.GetDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetDomainAssociation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDomainAssociationResult> getDomainAssociationAsync(GetDomainAssociationRequest getDomainAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<GetDomainAssociationRequest, GetDomainAssociationResult> asyncHandler);

    /**
     * <p>
     * Returns a job for a branch of an Amplify app.
     * </p>
     * 
     * @param getJobRequest
     *        The request structure for the get job request.
     * @return A Java Future containing the result of the GetJob operation returned by the service.
     * @sample AWSAmplifyAsync.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobResult> getJobAsync(GetJobRequest getJobRequest);

    /**
     * <p>
     * Returns a job for a branch of an Amplify app.
     * </p>
     * 
     * @param getJobRequest
     *        The request structure for the get job request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetJob operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobResult> getJobAsync(GetJobRequest getJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetJobRequest, GetJobResult> asyncHandler);

    /**
     * <p>
     * Returns the webhook information that corresponds to a specified webhook ID.
     * </p>
     * 
     * @param getWebhookRequest
     *        The request structure for the get webhook request.
     * @return A Java Future containing the result of the GetWebhook operation returned by the service.
     * @sample AWSAmplifyAsync.GetWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWebhookResult> getWebhookAsync(GetWebhookRequest getWebhookRequest);

    /**
     * <p>
     * Returns the webhook information that corresponds to a specified webhook ID.
     * </p>
     * 
     * @param getWebhookRequest
     *        The request structure for the get webhook request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWebhook operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.GetWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWebhookResult> getWebhookAsync(GetWebhookRequest getWebhookRequest,
            com.amazonaws.handlers.AsyncHandler<GetWebhookRequest, GetWebhookResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the existing Amplify apps.
     * </p>
     * 
     * @param listAppsRequest
     *        The request structure for the list apps request.
     * @return A Java Future containing the result of the ListApps operation returned by the service.
     * @sample AWSAmplifyAsync.ListApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListApps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAppsResult> listAppsAsync(ListAppsRequest listAppsRequest);

    /**
     * <p>
     * Returns a list of the existing Amplify apps.
     * </p>
     * 
     * @param listAppsRequest
     *        The request structure for the list apps request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApps operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.ListApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListApps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAppsResult> listAppsAsync(ListAppsRequest listAppsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppsRequest, ListAppsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of artifacts for a specified app, branch, and job.
     * </p>
     * 
     * @param listArtifactsRequest
     *        Describes the request structure for the list artifacts request.
     * @return A Java Future containing the result of the ListArtifacts operation returned by the service.
     * @sample AWSAmplifyAsync.ListArtifacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListArtifacts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListArtifactsResult> listArtifactsAsync(ListArtifactsRequest listArtifactsRequest);

    /**
     * <p>
     * Returns a list of artifacts for a specified app, branch, and job.
     * </p>
     * 
     * @param listArtifactsRequest
     *        Describes the request structure for the list artifacts request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListArtifacts operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.ListArtifacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListArtifacts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListArtifactsResult> listArtifactsAsync(ListArtifactsRequest listArtifactsRequest,
            com.amazonaws.handlers.AsyncHandler<ListArtifactsRequest, ListArtifactsResult> asyncHandler);

    /**
     * <p>
     * Lists the backend environments for an Amplify app.
     * </p>
     * 
     * @param listBackendEnvironmentsRequest
     *        The request structure for the list backend environments request.
     * @return A Java Future containing the result of the ListBackendEnvironments operation returned by the service.
     * @sample AWSAmplifyAsync.ListBackendEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListBackendEnvironments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBackendEnvironmentsResult> listBackendEnvironmentsAsync(ListBackendEnvironmentsRequest listBackendEnvironmentsRequest);

    /**
     * <p>
     * Lists the backend environments for an Amplify app.
     * </p>
     * 
     * @param listBackendEnvironmentsRequest
     *        The request structure for the list backend environments request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBackendEnvironments operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.ListBackendEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListBackendEnvironments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBackendEnvironmentsResult> listBackendEnvironmentsAsync(ListBackendEnvironmentsRequest listBackendEnvironmentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBackendEnvironmentsRequest, ListBackendEnvironmentsResult> asyncHandler);

    /**
     * <p>
     * Lists the branches of an Amplify app.
     * </p>
     * 
     * @param listBranchesRequest
     *        The request structure for the list branches request.
     * @return A Java Future containing the result of the ListBranches operation returned by the service.
     * @sample AWSAmplifyAsync.ListBranches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListBranches" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBranchesResult> listBranchesAsync(ListBranchesRequest listBranchesRequest);

    /**
     * <p>
     * Lists the branches of an Amplify app.
     * </p>
     * 
     * @param listBranchesRequest
     *        The request structure for the list branches request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBranches operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.ListBranches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListBranches" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBranchesResult> listBranchesAsync(ListBranchesRequest listBranchesRequest,
            com.amazonaws.handlers.AsyncHandler<ListBranchesRequest, ListBranchesResult> asyncHandler);

    /**
     * <p>
     * Returns the domain associations for an Amplify app.
     * </p>
     * 
     * @param listDomainAssociationsRequest
     *        The request structure for the list domain associations request.
     * @return A Java Future containing the result of the ListDomainAssociations operation returned by the service.
     * @sample AWSAmplifyAsync.ListDomainAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListDomainAssociations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDomainAssociationsResult> listDomainAssociationsAsync(ListDomainAssociationsRequest listDomainAssociationsRequest);

    /**
     * <p>
     * Returns the domain associations for an Amplify app.
     * </p>
     * 
     * @param listDomainAssociationsRequest
     *        The request structure for the list domain associations request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDomainAssociations operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.ListDomainAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListDomainAssociations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDomainAssociationsResult> listDomainAssociationsAsync(ListDomainAssociationsRequest listDomainAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDomainAssociationsRequest, ListDomainAssociationsResult> asyncHandler);

    /**
     * <p>
     * Lists the jobs for a branch of an Amplify app.
     * </p>
     * 
     * @param listJobsRequest
     *        The request structure for the list jobs request.
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AWSAmplifyAsync.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * Lists the jobs for a branch of an Amplify app.
     * </p>
     * 
     * @param listJobsRequest
     *        The request structure for the list jobs request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of tags for a specified Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        The request structure to use to list tags for a resource.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSAmplifyAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of tags for a specified Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        The request structure to use to list tags for a resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Returns a list of webhooks for an Amplify app.
     * </p>
     * 
     * @param listWebhooksRequest
     *        The request structure for the list webhooks request.
     * @return A Java Future containing the result of the ListWebhooks operation returned by the service.
     * @sample AWSAmplifyAsync.ListWebhooks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListWebhooks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWebhooksResult> listWebhooksAsync(ListWebhooksRequest listWebhooksRequest);

    /**
     * <p>
     * Returns a list of webhooks for an Amplify app.
     * </p>
     * 
     * @param listWebhooksRequest
     *        The request structure for the list webhooks request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWebhooks operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.ListWebhooks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListWebhooks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWebhooksResult> listWebhooksAsync(ListWebhooksRequest listWebhooksRequest,
            com.amazonaws.handlers.AsyncHandler<ListWebhooksRequest, ListWebhooksResult> asyncHandler);

    /**
     * <p>
     * Starts a deployment for a manually deployed app. Manually deployed apps are not connected to a repository.
     * </p>
     * 
     * @param startDeploymentRequest
     *        The request structure for the start a deployment request.
     * @return A Java Future containing the result of the StartDeployment operation returned by the service.
     * @sample AWSAmplifyAsync.StartDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/StartDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartDeploymentResult> startDeploymentAsync(StartDeploymentRequest startDeploymentRequest);

    /**
     * <p>
     * Starts a deployment for a manually deployed app. Manually deployed apps are not connected to a repository.
     * </p>
     * 
     * @param startDeploymentRequest
     *        The request structure for the start a deployment request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartDeployment operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.StartDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/StartDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartDeploymentResult> startDeploymentAsync(StartDeploymentRequest startDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<StartDeploymentRequest, StartDeploymentResult> asyncHandler);

    /**
     * <p>
     * Starts a new job for a branch of an Amplify app.
     * </p>
     * 
     * @param startJobRequest
     *        The request structure for the start job request.
     * @return A Java Future containing the result of the StartJob operation returned by the service.
     * @sample AWSAmplifyAsync.StartJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/StartJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartJobResult> startJobAsync(StartJobRequest startJobRequest);

    /**
     * <p>
     * Starts a new job for a branch of an Amplify app.
     * </p>
     * 
     * @param startJobRequest
     *        The request structure for the start job request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartJob operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.StartJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/StartJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartJobResult> startJobAsync(StartJobRequest startJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartJobRequest, StartJobResult> asyncHandler);

    /**
     * <p>
     * Stops a job that is in progress for a branch of an Amplify app.
     * </p>
     * 
     * @param stopJobRequest
     *        The request structure for the stop job request.
     * @return A Java Future containing the result of the StopJob operation returned by the service.
     * @sample AWSAmplifyAsync.StopJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/StopJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopJobResult> stopJobAsync(StopJobRequest stopJobRequest);

    /**
     * <p>
     * Stops a job that is in progress for a branch of an Amplify app.
     * </p>
     * 
     * @param stopJobRequest
     *        The request structure for the stop job request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopJob operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.StopJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/StopJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopJobResult> stopJobAsync(StopJobRequest stopJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopJobRequest, StopJobResult> asyncHandler);

    /**
     * <p>
     * Tags the resource with a tag key and value.
     * </p>
     * 
     * @param tagResourceRequest
     *        The request structure to tag a resource with a tag key and value.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSAmplifyAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tags the resource with a tag key and value.
     * </p>
     * 
     * @param tagResourceRequest
     *        The request structure to tag a resource with a tag key and value.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Untags a resource with a specified Amazon Resource Name (ARN).
     * </p>
     * 
     * @param untagResourceRequest
     *        The request structure for the untag resource request.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSAmplifyAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Untags a resource with a specified Amazon Resource Name (ARN).
     * </p>
     * 
     * @param untagResourceRequest
     *        The request structure for the untag resource request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an existing Amplify app.
     * </p>
     * 
     * @param updateAppRequest
     *        The request structure for the update app request.
     * @return A Java Future containing the result of the UpdateApp operation returned by the service.
     * @sample AWSAmplifyAsync.UpdateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppResult> updateAppAsync(UpdateAppRequest updateAppRequest);

    /**
     * <p>
     * Updates an existing Amplify app.
     * </p>
     * 
     * @param updateAppRequest
     *        The request structure for the update app request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApp operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.UpdateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppResult> updateAppAsync(UpdateAppRequest updateAppRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAppRequest, UpdateAppResult> asyncHandler);

    /**
     * <p>
     * Updates a branch for an Amplify app.
     * </p>
     * 
     * @param updateBranchRequest
     *        The request structure for the update branch request.
     * @return A Java Future containing the result of the UpdateBranch operation returned by the service.
     * @sample AWSAmplifyAsync.UpdateBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateBranch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateBranchResult> updateBranchAsync(UpdateBranchRequest updateBranchRequest);

    /**
     * <p>
     * Updates a branch for an Amplify app.
     * </p>
     * 
     * @param updateBranchRequest
     *        The request structure for the update branch request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBranch operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.UpdateBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateBranch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateBranchResult> updateBranchAsync(UpdateBranchRequest updateBranchRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBranchRequest, UpdateBranchResult> asyncHandler);

    /**
     * <p>
     * Creates a new domain association for an Amplify app.
     * </p>
     * 
     * @param updateDomainAssociationRequest
     *        The request structure for the update domain association request.
     * @return A Java Future containing the result of the UpdateDomainAssociation operation returned by the service.
     * @sample AWSAmplifyAsync.UpdateDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateDomainAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDomainAssociationResult> updateDomainAssociationAsync(UpdateDomainAssociationRequest updateDomainAssociationRequest);

    /**
     * <p>
     * Creates a new domain association for an Amplify app.
     * </p>
     * 
     * @param updateDomainAssociationRequest
     *        The request structure for the update domain association request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDomainAssociation operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.UpdateDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateDomainAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDomainAssociationResult> updateDomainAssociationAsync(UpdateDomainAssociationRequest updateDomainAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDomainAssociationRequest, UpdateDomainAssociationResult> asyncHandler);

    /**
     * <p>
     * Updates a webhook.
     * </p>
     * 
     * @param updateWebhookRequest
     *        The request structure for the update webhook request.
     * @return A Java Future containing the result of the UpdateWebhook operation returned by the service.
     * @sample AWSAmplifyAsync.UpdateWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWebhookResult> updateWebhookAsync(UpdateWebhookRequest updateWebhookRequest);

    /**
     * <p>
     * Updates a webhook.
     * </p>
     * 
     * @param updateWebhookRequest
     *        The request structure for the update webhook request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWebhook operation returned by the service.
     * @sample AWSAmplifyAsyncHandler.UpdateWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWebhookResult> updateWebhookAsync(UpdateWebhookRequest updateWebhookRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWebhookRequest, UpdateWebhookResult> asyncHandler);

}
