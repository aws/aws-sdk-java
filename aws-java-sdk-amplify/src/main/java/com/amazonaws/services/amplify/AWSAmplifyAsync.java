/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Amplify is a fully managed continuous deployment and hosting service for modern web apps.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAmplifyAsync extends AWSAmplify {

    /**
     * <p>
     * Creates a new Amplify App.
     * </p>
     * 
     * @param createAppRequest
     *        Request structure used to create Apps in Amplify.
     * @return A Java Future containing the result of the CreateApp operation returned by the service.
     * @sample AWSAmplifyAsync.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAppResult> createAppAsync(CreateAppRequest createAppRequest);

    /**
     * <p>
     * Creates a new Amplify App.
     * </p>
     * 
     * @param createAppRequest
     *        Request structure used to create Apps in Amplify.
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
     * Creates a new backend environment for an Amplify App.
     * </p>
     * 
     * @param createBackendEnvironmentRequest
     *        Request structure for a backend environment create request.
     * @return A Java Future containing the result of the CreateBackendEnvironment operation returned by the service.
     * @sample AWSAmplifyAsync.CreateBackendEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateBackendEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBackendEnvironmentResult> createBackendEnvironmentAsync(CreateBackendEnvironmentRequest createBackendEnvironmentRequest);

    /**
     * <p>
     * Creates a new backend environment for an Amplify App.
     * </p>
     * 
     * @param createBackendEnvironmentRequest
     *        Request structure for a backend environment create request.
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
     * Creates a new Branch for an Amplify App.
     * </p>
     * 
     * @param createBranchRequest
     *        Request structure for a branch create request.
     * @return A Java Future containing the result of the CreateBranch operation returned by the service.
     * @sample AWSAmplifyAsync.CreateBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateBranch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBranchResult> createBranchAsync(CreateBranchRequest createBranchRequest);

    /**
     * <p>
     * Creates a new Branch for an Amplify App.
     * </p>
     * 
     * @param createBranchRequest
     *        Request structure for a branch create request.
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
     * Create a deployment for manual deploy apps. (Apps are not connected to repository)
     * </p>
     * 
     * @param createDeploymentRequest
     *        Request structure for create a new deployment.
     * @return A Java Future containing the result of the CreateDeployment operation returned by the service.
     * @sample AWSAmplifyAsync.CreateDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest createDeploymentRequest);

    /**
     * <p>
     * Create a deployment for manual deploy apps. (Apps are not connected to repository)
     * </p>
     * 
     * @param createDeploymentRequest
     *        Request structure for create a new deployment.
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
     * Create a new DomainAssociation on an App
     * </p>
     * 
     * @param createDomainAssociationRequest
     *        Request structure for create Domain Association request.
     * @return A Java Future containing the result of the CreateDomainAssociation operation returned by the service.
     * @sample AWSAmplifyAsync.CreateDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateDomainAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDomainAssociationResult> createDomainAssociationAsync(CreateDomainAssociationRequest createDomainAssociationRequest);

    /**
     * <p>
     * Create a new DomainAssociation on an App
     * </p>
     * 
     * @param createDomainAssociationRequest
     *        Request structure for create Domain Association request.
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
     * Create a new webhook on an App.
     * </p>
     * 
     * @param createWebhookRequest
     *        Request structure for create webhook request.
     * @return A Java Future containing the result of the CreateWebhook operation returned by the service.
     * @sample AWSAmplifyAsync.CreateWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWebhookResult> createWebhookAsync(CreateWebhookRequest createWebhookRequest);

    /**
     * <p>
     * Create a new webhook on an App.
     * </p>
     * 
     * @param createWebhookRequest
     *        Request structure for create webhook request.
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
     * Delete an existing Amplify App by appId.
     * </p>
     * 
     * @param deleteAppRequest
     *        Request structure for an Amplify App delete request.
     * @return A Java Future containing the result of the DeleteApp operation returned by the service.
     * @sample AWSAmplifyAsync.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest deleteAppRequest);

    /**
     * <p>
     * Delete an existing Amplify App by appId.
     * </p>
     * 
     * @param deleteAppRequest
     *        Request structure for an Amplify App delete request.
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
     * Delete backend environment for an Amplify App.
     * </p>
     * 
     * @param deleteBackendEnvironmentRequest
     *        Request structure for delete backend environment request.
     * @return A Java Future containing the result of the DeleteBackendEnvironment operation returned by the service.
     * @sample AWSAmplifyAsync.DeleteBackendEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteBackendEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackendEnvironmentResult> deleteBackendEnvironmentAsync(DeleteBackendEnvironmentRequest deleteBackendEnvironmentRequest);

    /**
     * <p>
     * Delete backend environment for an Amplify App.
     * </p>
     * 
     * @param deleteBackendEnvironmentRequest
     *        Request structure for delete backend environment request.
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
     * Deletes a branch for an Amplify App.
     * </p>
     * 
     * @param deleteBranchRequest
     *        Request structure for delete branch request.
     * @return A Java Future containing the result of the DeleteBranch operation returned by the service.
     * @sample AWSAmplifyAsync.DeleteBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteBranch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBranchResult> deleteBranchAsync(DeleteBranchRequest deleteBranchRequest);

    /**
     * <p>
     * Deletes a branch for an Amplify App.
     * </p>
     * 
     * @param deleteBranchRequest
     *        Request structure for delete branch request.
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
     * Deletes a DomainAssociation.
     * </p>
     * 
     * @param deleteDomainAssociationRequest
     *        Request structure for the delete Domain Association request.
     * @return A Java Future containing the result of the DeleteDomainAssociation operation returned by the service.
     * @sample AWSAmplifyAsync.DeleteDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteDomainAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDomainAssociationResult> deleteDomainAssociationAsync(DeleteDomainAssociationRequest deleteDomainAssociationRequest);

    /**
     * <p>
     * Deletes a DomainAssociation.
     * </p>
     * 
     * @param deleteDomainAssociationRequest
     *        Request structure for the delete Domain Association request.
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
     * Delete a job, for an Amplify branch, part of Amplify App.
     * </p>
     * 
     * @param deleteJobRequest
     *        Request structure for delete job request.
     * @return A Java Future containing the result of the DeleteJob operation returned by the service.
     * @sample AWSAmplifyAsync.DeleteJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteJobResult> deleteJobAsync(DeleteJobRequest deleteJobRequest);

    /**
     * <p>
     * Delete a job, for an Amplify branch, part of Amplify App.
     * </p>
     * 
     * @param deleteJobRequest
     *        Request structure for delete job request.
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
     *        Request structure for the delete webhook request.
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
     *        Request structure for the delete webhook request.
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
     * Retrieve website access logs for a specific time range via a pre-signed URL.
     * </p>
     * 
     * @param generateAccessLogsRequest
     *        Request structure for the generate access logs request.
     * @return A Java Future containing the result of the GenerateAccessLogs operation returned by the service.
     * @sample AWSAmplifyAsync.GenerateAccessLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GenerateAccessLogs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GenerateAccessLogsResult> generateAccessLogsAsync(GenerateAccessLogsRequest generateAccessLogsRequest);

    /**
     * <p>
     * Retrieve website access logs for a specific time range via a pre-signed URL.
     * </p>
     * 
     * @param generateAccessLogsRequest
     *        Request structure for the generate access logs request.
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
     * Retrieves an existing Amplify App by appId.
     * </p>
     * 
     * @param getAppRequest
     *        Request structure for get App request.
     * @return A Java Future containing the result of the GetApp operation returned by the service.
     * @sample AWSAmplifyAsync.GetApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAppResult> getAppAsync(GetAppRequest getAppRequest);

    /**
     * <p>
     * Retrieves an existing Amplify App by appId.
     * </p>
     * 
     * @param getAppRequest
     *        Request structure for get App request.
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
     * Retrieves artifact info that corresponds to a artifactId.
     * </p>
     * 
     * @param getArtifactUrlRequest
     *        Request structure for the get artifact request.
     * @return A Java Future containing the result of the GetArtifactUrl operation returned by the service.
     * @sample AWSAmplifyAsync.GetArtifactUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetArtifactUrl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetArtifactUrlResult> getArtifactUrlAsync(GetArtifactUrlRequest getArtifactUrlRequest);

    /**
     * <p>
     * Retrieves artifact info that corresponds to a artifactId.
     * </p>
     * 
     * @param getArtifactUrlRequest
     *        Request structure for the get artifact request.
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
     * Retrieves a backend environment for an Amplify App.
     * </p>
     * 
     * @param getBackendEnvironmentRequest
     *        Request structure for get backend environment request.
     * @return A Java Future containing the result of the GetBackendEnvironment operation returned by the service.
     * @sample AWSAmplifyAsync.GetBackendEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetBackendEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetBackendEnvironmentResult> getBackendEnvironmentAsync(GetBackendEnvironmentRequest getBackendEnvironmentRequest);

    /**
     * <p>
     * Retrieves a backend environment for an Amplify App.
     * </p>
     * 
     * @param getBackendEnvironmentRequest
     *        Request structure for get backend environment request.
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
     * Retrieves a branch for an Amplify App.
     * </p>
     * 
     * @param getBranchRequest
     *        Request structure for get branch request.
     * @return A Java Future containing the result of the GetBranch operation returned by the service.
     * @sample AWSAmplifyAsync.GetBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetBranch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBranchResult> getBranchAsync(GetBranchRequest getBranchRequest);

    /**
     * <p>
     * Retrieves a branch for an Amplify App.
     * </p>
     * 
     * @param getBranchRequest
     *        Request structure for get branch request.
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
     * Retrieves domain info that corresponds to an appId and domainName.
     * </p>
     * 
     * @param getDomainAssociationRequest
     *        Request structure for the get Domain Association request.
     * @return A Java Future containing the result of the GetDomainAssociation operation returned by the service.
     * @sample AWSAmplifyAsync.GetDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetDomainAssociation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDomainAssociationResult> getDomainAssociationAsync(GetDomainAssociationRequest getDomainAssociationRequest);

    /**
     * <p>
     * Retrieves domain info that corresponds to an appId and domainName.
     * </p>
     * 
     * @param getDomainAssociationRequest
     *        Request structure for the get Domain Association request.
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
     * Get a job for a branch, part of an Amplify App.
     * </p>
     * 
     * @param getJobRequest
     *        Request structure for get job request.
     * @return A Java Future containing the result of the GetJob operation returned by the service.
     * @sample AWSAmplifyAsync.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobResult> getJobAsync(GetJobRequest getJobRequest);

    /**
     * <p>
     * Get a job for a branch, part of an Amplify App.
     * </p>
     * 
     * @param getJobRequest
     *        Request structure for get job request.
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
     * Retrieves webhook info that corresponds to a webhookId.
     * </p>
     * 
     * @param getWebhookRequest
     *        Request structure for the get webhook request.
     * @return A Java Future containing the result of the GetWebhook operation returned by the service.
     * @sample AWSAmplifyAsync.GetWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWebhookResult> getWebhookAsync(GetWebhookRequest getWebhookRequest);

    /**
     * <p>
     * Retrieves webhook info that corresponds to a webhookId.
     * </p>
     * 
     * @param getWebhookRequest
     *        Request structure for the get webhook request.
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
     * Lists existing Amplify Apps.
     * </p>
     * 
     * @param listAppsRequest
     *        Request structure for an Amplify App list request.
     * @return A Java Future containing the result of the ListApps operation returned by the service.
     * @sample AWSAmplifyAsync.ListApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListApps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAppsResult> listAppsAsync(ListAppsRequest listAppsRequest);

    /**
     * <p>
     * Lists existing Amplify Apps.
     * </p>
     * 
     * @param listAppsRequest
     *        Request structure for an Amplify App list request.
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
     * List artifacts with an app, a branch, a job and an artifact type.
     * </p>
     * 
     * @param listArtifactsRequest
     *        Request structure for the list artifacts request.
     * @return A Java Future containing the result of the ListArtifacts operation returned by the service.
     * @sample AWSAmplifyAsync.ListArtifacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListArtifacts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListArtifactsResult> listArtifactsAsync(ListArtifactsRequest listArtifactsRequest);

    /**
     * <p>
     * List artifacts with an app, a branch, a job and an artifact type.
     * </p>
     * 
     * @param listArtifactsRequest
     *        Request structure for the list artifacts request.
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
     * Lists backend environments for an Amplify App.
     * </p>
     * 
     * @param listBackendEnvironmentsRequest
     *        Request structure for list backend environments request.
     * @return A Java Future containing the result of the ListBackendEnvironments operation returned by the service.
     * @sample AWSAmplifyAsync.ListBackendEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListBackendEnvironments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBackendEnvironmentsResult> listBackendEnvironmentsAsync(ListBackendEnvironmentsRequest listBackendEnvironmentsRequest);

    /**
     * <p>
     * Lists backend environments for an Amplify App.
     * </p>
     * 
     * @param listBackendEnvironmentsRequest
     *        Request structure for list backend environments request.
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
     * Lists branches for an Amplify App.
     * </p>
     * 
     * @param listBranchesRequest
     *        Request structure for list branches request.
     * @return A Java Future containing the result of the ListBranches operation returned by the service.
     * @sample AWSAmplifyAsync.ListBranches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListBranches" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBranchesResult> listBranchesAsync(ListBranchesRequest listBranchesRequest);

    /**
     * <p>
     * Lists branches for an Amplify App.
     * </p>
     * 
     * @param listBranchesRequest
     *        Request structure for list branches request.
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
     * List domains with an app
     * </p>
     * 
     * @param listDomainAssociationsRequest
     *        Request structure for the list Domain Associations request.
     * @return A Java Future containing the result of the ListDomainAssociations operation returned by the service.
     * @sample AWSAmplifyAsync.ListDomainAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListDomainAssociations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDomainAssociationsResult> listDomainAssociationsAsync(ListDomainAssociationsRequest listDomainAssociationsRequest);

    /**
     * <p>
     * List domains with an app
     * </p>
     * 
     * @param listDomainAssociationsRequest
     *        Request structure for the list Domain Associations request.
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
     * List Jobs for a branch, part of an Amplify App.
     * </p>
     * 
     * @param listJobsRequest
     *        Request structure for list job request.
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AWSAmplifyAsync.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * List Jobs for a branch, part of an Amplify App.
     * </p>
     * 
     * @param listJobsRequest
     *        Request structure for list job request.
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
     * List tags for resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        Request structure used to list tags for resource.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSAmplifyAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List tags for resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        Request structure used to list tags for resource.
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
     * List webhooks with an app.
     * </p>
     * 
     * @param listWebhooksRequest
     *        Request structure for the list webhooks request.
     * @return A Java Future containing the result of the ListWebhooks operation returned by the service.
     * @sample AWSAmplifyAsync.ListWebhooks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListWebhooks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWebhooksResult> listWebhooksAsync(ListWebhooksRequest listWebhooksRequest);

    /**
     * <p>
     * List webhooks with an app.
     * </p>
     * 
     * @param listWebhooksRequest
     *        Request structure for the list webhooks request.
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
     * Start a deployment for manual deploy apps. (Apps are not connected to repository)
     * </p>
     * 
     * @param startDeploymentRequest
     *        Request structure for start a deployment.
     * @return A Java Future containing the result of the StartDeployment operation returned by the service.
     * @sample AWSAmplifyAsync.StartDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/StartDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartDeploymentResult> startDeploymentAsync(StartDeploymentRequest startDeploymentRequest);

    /**
     * <p>
     * Start a deployment for manual deploy apps. (Apps are not connected to repository)
     * </p>
     * 
     * @param startDeploymentRequest
     *        Request structure for start a deployment.
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
     * Starts a new job for a branch, part of an Amplify App.
     * </p>
     * 
     * @param startJobRequest
     *        Request structure for Start job request.
     * @return A Java Future containing the result of the StartJob operation returned by the service.
     * @sample AWSAmplifyAsync.StartJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/StartJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartJobResult> startJobAsync(StartJobRequest startJobRequest);

    /**
     * <p>
     * Starts a new job for a branch, part of an Amplify App.
     * </p>
     * 
     * @param startJobRequest
     *        Request structure for Start job request.
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
     * Stop a job that is in progress, for an Amplify branch, part of Amplify App.
     * </p>
     * 
     * @param stopJobRequest
     *        Request structure for stop job request.
     * @return A Java Future containing the result of the StopJob operation returned by the service.
     * @sample AWSAmplifyAsync.StopJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/StopJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopJobResult> stopJobAsync(StopJobRequest stopJobRequest);

    /**
     * <p>
     * Stop a job that is in progress, for an Amplify branch, part of Amplify App.
     * </p>
     * 
     * @param stopJobRequest
     *        Request structure for stop job request.
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
     * Tag resource with tag key and value.
     * </p>
     * 
     * @param tagResourceRequest
     *        Request structure used to tag resource.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSAmplifyAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tag resource with tag key and value.
     * </p>
     * 
     * @param tagResourceRequest
     *        Request structure used to tag resource.
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
     * Untag resource with resourceArn.
     * </p>
     * 
     * @param untagResourceRequest
     *        Request structure used to untag resource.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSAmplifyAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Untag resource with resourceArn.
     * </p>
     * 
     * @param untagResourceRequest
     *        Request structure used to untag resource.
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
     * Updates an existing Amplify App.
     * </p>
     * 
     * @param updateAppRequest
     *        Request structure for update App request.
     * @return A Java Future containing the result of the UpdateApp operation returned by the service.
     * @sample AWSAmplifyAsync.UpdateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppResult> updateAppAsync(UpdateAppRequest updateAppRequest);

    /**
     * <p>
     * Updates an existing Amplify App.
     * </p>
     * 
     * @param updateAppRequest
     *        Request structure for update App request.
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
     * Updates a branch for an Amplify App.
     * </p>
     * 
     * @param updateBranchRequest
     *        Request structure for update branch request.
     * @return A Java Future containing the result of the UpdateBranch operation returned by the service.
     * @sample AWSAmplifyAsync.UpdateBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateBranch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateBranchResult> updateBranchAsync(UpdateBranchRequest updateBranchRequest);

    /**
     * <p>
     * Updates a branch for an Amplify App.
     * </p>
     * 
     * @param updateBranchRequest
     *        Request structure for update branch request.
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
     * Create a new DomainAssociation on an App
     * </p>
     * 
     * @param updateDomainAssociationRequest
     *        Request structure for update Domain Association request.
     * @return A Java Future containing the result of the UpdateDomainAssociation operation returned by the service.
     * @sample AWSAmplifyAsync.UpdateDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateDomainAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDomainAssociationResult> updateDomainAssociationAsync(UpdateDomainAssociationRequest updateDomainAssociationRequest);

    /**
     * <p>
     * Create a new DomainAssociation on an App
     * </p>
     * 
     * @param updateDomainAssociationRequest
     *        Request structure for update Domain Association request.
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
     * Update a webhook.
     * </p>
     * 
     * @param updateWebhookRequest
     *        Request structure for update webhook request.
     * @return A Java Future containing the result of the UpdateWebhook operation returned by the service.
     * @sample AWSAmplifyAsync.UpdateWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWebhookResult> updateWebhookAsync(UpdateWebhookRequest updateWebhookRequest);

    /**
     * <p>
     * Update a webhook.
     * </p>
     * 
     * @param updateWebhookRequest
     *        Request structure for update webhook request.
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
