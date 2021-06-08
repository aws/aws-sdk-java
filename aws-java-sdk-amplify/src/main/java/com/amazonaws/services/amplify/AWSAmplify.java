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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.amplify.model.*;

/**
 * Interface for accessing Amplify.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.amplify.AbstractAWSAmplify} instead.
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
public interface AWSAmplify {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "amplify";

    /**
     * <p>
     * Creates a new Amplify app.
     * </p>
     * 
     * @param createAppRequest
     *        The request structure used to create apps in Amplify.
     * @return Result of the CreateApp operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @throws DependentServiceFailureException
     *         An operation failed because a dependent service threw an exception.
     * @sample AWSAmplify.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAppResult createApp(CreateAppRequest createAppRequest);

    /**
     * <p>
     * Creates a new backend environment for an Amplify app.
     * </p>
     * 
     * @param createBackendEnvironmentRequest
     *        The request structure for the backend environment create request.
     * @return Result of the CreateBackendEnvironment operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.CreateBackendEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateBackendEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    CreateBackendEnvironmentResult createBackendEnvironment(CreateBackendEnvironmentRequest createBackendEnvironmentRequest);

    /**
     * <p>
     * Creates a new branch for an Amplify app.
     * </p>
     * 
     * @param createBranchRequest
     *        The request structure for the create branch request.
     * @return Result of the CreateBranch operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @throws DependentServiceFailureException
     *         An operation failed because a dependent service threw an exception.
     * @sample AWSAmplify.CreateBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateBranch" target="_top">AWS API
     *      Documentation</a>
     */
    CreateBranchResult createBranch(CreateBranchRequest createBranchRequest);

    /**
     * <p>
     * Creates a deployment for a manually deployed Amplify app. Manually deployed apps are not connected to a
     * repository.
     * </p>
     * 
     * @param createDeploymentRequest
     *        The request structure for the create a new deployment request.
     * @return Result of the CreateDeployment operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.CreateDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDeploymentResult createDeployment(CreateDeploymentRequest createDeploymentRequest);

    /**
     * <p>
     * Creates a new domain association for an Amplify app. This action associates a custom domain with the Amplify app
     * </p>
     * 
     * @param createDomainAssociationRequest
     *        The request structure for the create domain association request.
     * @return Result of the CreateDomainAssociation operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @throws DependentServiceFailureException
     *         An operation failed because a dependent service threw an exception.
     * @sample AWSAmplify.CreateDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateDomainAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDomainAssociationResult createDomainAssociation(CreateDomainAssociationRequest createDomainAssociationRequest);

    /**
     * <p>
     * Creates a new webhook on an Amplify app.
     * </p>
     * 
     * @param createWebhookRequest
     *        The request structure for the create webhook request.
     * @return Result of the CreateWebhook operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @throws DependentServiceFailureException
     *         An operation failed because a dependent service threw an exception.
     * @sample AWSAmplify.CreateWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    CreateWebhookResult createWebhook(CreateWebhookRequest createWebhookRequest);

    /**
     * <p>
     * Deletes an existing Amplify app specified by an app ID.
     * </p>
     * 
     * @param deleteAppRequest
     *        Describes the request structure for the delete app request.
     * @return Result of the DeleteApp operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws DependentServiceFailureException
     *         An operation failed because a dependent service threw an exception.
     * @sample AWSAmplify.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAppResult deleteApp(DeleteAppRequest deleteAppRequest);

    /**
     * <p>
     * Deletes a backend environment for an Amplify app.
     * </p>
     * 
     * @param deleteBackendEnvironmentRequest
     *        The request structure for the delete backend environment request.
     * @return Result of the DeleteBackendEnvironment operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws DependentServiceFailureException
     *         An operation failed because a dependent service threw an exception.
     * @sample AWSAmplify.DeleteBackendEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteBackendEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteBackendEnvironmentResult deleteBackendEnvironment(DeleteBackendEnvironmentRequest deleteBackendEnvironmentRequest);

    /**
     * <p>
     * Deletes a branch for an Amplify app.
     * </p>
     * 
     * @param deleteBranchRequest
     *        The request structure for the delete branch request.
     * @return Result of the DeleteBranch operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws DependentServiceFailureException
     *         An operation failed because a dependent service threw an exception.
     * @sample AWSAmplify.DeleteBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteBranch" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteBranchResult deleteBranch(DeleteBranchRequest deleteBranchRequest);

    /**
     * <p>
     * Deletes a domain association for an Amplify app.
     * </p>
     * 
     * @param deleteDomainAssociationRequest
     *        The request structure for the delete domain association request.
     * @return Result of the DeleteDomainAssociation operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws DependentServiceFailureException
     *         An operation failed because a dependent service threw an exception.
     * @sample AWSAmplify.DeleteDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteDomainAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDomainAssociationResult deleteDomainAssociation(DeleteDomainAssociationRequest deleteDomainAssociationRequest);

    /**
     * <p>
     * Deletes a job for a branch of an Amplify app.
     * </p>
     * 
     * @param deleteJobRequest
     *        The request structure for the delete job request.
     * @return Result of the DeleteJob operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.DeleteJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteJob" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteJobResult deleteJob(DeleteJobRequest deleteJobRequest);

    /**
     * <p>
     * Deletes a webhook.
     * </p>
     * 
     * @param deleteWebhookRequest
     *        The request structure for the delete webhook request.
     * @return Result of the DeleteWebhook operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.DeleteWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteWebhookResult deleteWebhook(DeleteWebhookRequest deleteWebhookRequest);

    /**
     * <p>
     * Returns the website access logs for a specific time range using a presigned URL.
     * </p>
     * 
     * @param generateAccessLogsRequest
     *        The request structure for the generate access logs request.
     * @return Result of the GenerateAccessLogs operation returned by the service.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @sample AWSAmplify.GenerateAccessLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GenerateAccessLogs" target="_top">AWS API
     *      Documentation</a>
     */
    GenerateAccessLogsResult generateAccessLogs(GenerateAccessLogsRequest generateAccessLogsRequest);

    /**
     * <p>
     * Returns an existing Amplify app by appID.
     * </p>
     * 
     * @param getAppRequest
     *        The request structure for the get app request.
     * @return Result of the GetApp operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @sample AWSAmplify.GetApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetApp" target="_top">AWS API
     *      Documentation</a>
     */
    GetAppResult getApp(GetAppRequest getAppRequest);

    /**
     * <p>
     * Returns the artifact info that corresponds to an artifact id.
     * </p>
     * 
     * @param getArtifactUrlRequest
     *        Returns the request structure for the get artifact request.
     * @return Result of the GetArtifactUrl operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.GetArtifactUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetArtifactUrl" target="_top">AWS API
     *      Documentation</a>
     */
    GetArtifactUrlResult getArtifactUrl(GetArtifactUrlRequest getArtifactUrlRequest);

    /**
     * <p>
     * Returns a backend environment for an Amplify app.
     * </p>
     * 
     * @param getBackendEnvironmentRequest
     *        The request structure for the get backend environment request.
     * @return Result of the GetBackendEnvironment operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @sample AWSAmplify.GetBackendEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetBackendEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    GetBackendEnvironmentResult getBackendEnvironment(GetBackendEnvironmentRequest getBackendEnvironmentRequest);

    /**
     * <p>
     * Returns a branch for an Amplify app.
     * </p>
     * 
     * @param getBranchRequest
     *        The request structure for the get branch request.
     * @return Result of the GetBranch operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @sample AWSAmplify.GetBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetBranch" target="_top">AWS API
     *      Documentation</a>
     */
    GetBranchResult getBranch(GetBranchRequest getBranchRequest);

    /**
     * <p>
     * Returns the domain information for an Amplify app.
     * </p>
     * 
     * @param getDomainAssociationRequest
     *        The request structure for the get domain association request.
     * @return Result of the GetDomainAssociation operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @sample AWSAmplify.GetDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetDomainAssociation" target="_top">AWS
     *      API Documentation</a>
     */
    GetDomainAssociationResult getDomainAssociation(GetDomainAssociationRequest getDomainAssociationRequest);

    /**
     * <p>
     * Returns a job for a branch of an Amplify app.
     * </p>
     * 
     * @param getJobRequest
     *        The request structure for the get job request.
     * @return Result of the GetJob operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    GetJobResult getJob(GetJobRequest getJobRequest);

    /**
     * <p>
     * Returns the webhook information that corresponds to a specified webhook ID.
     * </p>
     * 
     * @param getWebhookRequest
     *        The request structure for the get webhook request.
     * @return Result of the GetWebhook operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.GetWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    GetWebhookResult getWebhook(GetWebhookRequest getWebhookRequest);

    /**
     * <p>
     * Returns a list of the existing Amplify apps.
     * </p>
     * 
     * @param listAppsRequest
     *        The request structure for the list apps request.
     * @return Result of the ListApps operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @sample AWSAmplify.ListApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListApps" target="_top">AWS API
     *      Documentation</a>
     */
    ListAppsResult listApps(ListAppsRequest listAppsRequest);

    /**
     * <p>
     * Returns a list of artifacts for a specified app, branch, and job.
     * </p>
     * 
     * @param listArtifactsRequest
     *        Describes the request structure for the list artifacts request.
     * @return Result of the ListArtifacts operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.ListArtifacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListArtifacts" target="_top">AWS API
     *      Documentation</a>
     */
    ListArtifactsResult listArtifacts(ListArtifactsRequest listArtifactsRequest);

    /**
     * <p>
     * Lists the backend environments for an Amplify app.
     * </p>
     * 
     * @param listBackendEnvironmentsRequest
     *        The request structure for the list backend environments request.
     * @return Result of the ListBackendEnvironments operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @sample AWSAmplify.ListBackendEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListBackendEnvironments"
     *      target="_top">AWS API Documentation</a>
     */
    ListBackendEnvironmentsResult listBackendEnvironments(ListBackendEnvironmentsRequest listBackendEnvironmentsRequest);

    /**
     * <p>
     * Lists the branches of an Amplify app.
     * </p>
     * 
     * @param listBranchesRequest
     *        The request structure for the list branches request.
     * @return Result of the ListBranches operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @sample AWSAmplify.ListBranches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListBranches" target="_top">AWS API
     *      Documentation</a>
     */
    ListBranchesResult listBranches(ListBranchesRequest listBranchesRequest);

    /**
     * <p>
     * Returns the domain associations for an Amplify app.
     * </p>
     * 
     * @param listDomainAssociationsRequest
     *        The request structure for the list domain associations request.
     * @return Result of the ListDomainAssociations operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @sample AWSAmplify.ListDomainAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListDomainAssociations" target="_top">AWS
     *      API Documentation</a>
     */
    ListDomainAssociationsResult listDomainAssociations(ListDomainAssociationsRequest listDomainAssociationsRequest);

    /**
     * <p>
     * Lists the jobs for a branch of an Amplify app.
     * </p>
     * 
     * @param listJobsRequest
     *        The request structure for the list jobs request.
     * @return Result of the ListJobs operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListJobsResult listJobs(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * Returns a list of tags for a specified Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        The request structure to use to list tags for a resource.
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws ResourceNotFoundException
     *         An operation failed due to a non-existent resource.
     * @sample AWSAmplify.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of webhooks for an Amplify app.
     * </p>
     * 
     * @param listWebhooksRequest
     *        The request structure for the list webhooks request.
     * @return Result of the ListWebhooks operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.ListWebhooks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListWebhooks" target="_top">AWS API
     *      Documentation</a>
     */
    ListWebhooksResult listWebhooks(ListWebhooksRequest listWebhooksRequest);

    /**
     * <p>
     * Starts a deployment for a manually deployed app. Manually deployed apps are not connected to a repository.
     * </p>
     * 
     * @param startDeploymentRequest
     *        The request structure for the start a deployment request.
     * @return Result of the StartDeployment operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.StartDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/StartDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    StartDeploymentResult startDeployment(StartDeploymentRequest startDeploymentRequest);

    /**
     * <p>
     * Starts a new job for a branch of an Amplify app.
     * </p>
     * 
     * @param startJobRequest
     *        The request structure for the start job request.
     * @return Result of the StartJob operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.StartJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/StartJob" target="_top">AWS API
     *      Documentation</a>
     */
    StartJobResult startJob(StartJobRequest startJobRequest);

    /**
     * <p>
     * Stops a job that is in progress for a branch of an Amplify app.
     * </p>
     * 
     * @param stopJobRequest
     *        The request structure for the stop job request.
     * @return Result of the StopJob operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws LimitExceededException
     *         A resource could not be created because service quotas were exceeded.
     * @sample AWSAmplify.StopJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/StopJob" target="_top">AWS API
     *      Documentation</a>
     */
    StopJobResult stopJob(StopJobRequest stopJobRequest);

    /**
     * <p>
     * Tags the resource with a tag key and value.
     * </p>
     * 
     * @param tagResourceRequest
     *        The request structure to tag a resource with a tag key and value.
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws ResourceNotFoundException
     *         An operation failed due to a non-existent resource.
     * @sample AWSAmplify.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Untags a resource with a specified Amazon Resource Name (ARN).
     * </p>
     * 
     * @param untagResourceRequest
     *        The request structure for the untag resource request.
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws ResourceNotFoundException
     *         An operation failed due to a non-existent resource.
     * @sample AWSAmplify.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an existing Amplify app.
     * </p>
     * 
     * @param updateAppRequest
     *        The request structure for the update app request.
     * @return Result of the UpdateApp operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @sample AWSAmplify.UpdateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateApp" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAppResult updateApp(UpdateAppRequest updateAppRequest);

    /**
     * <p>
     * Updates a branch for an Amplify app.
     * </p>
     * 
     * @param updateBranchRequest
     *        The request structure for the update branch request.
     * @return Result of the UpdateBranch operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws DependentServiceFailureException
     *         An operation failed because a dependent service threw an exception.
     * @sample AWSAmplify.UpdateBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateBranch" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateBranchResult updateBranch(UpdateBranchRequest updateBranchRequest);

    /**
     * <p>
     * Creates a new domain association for an Amplify app.
     * </p>
     * 
     * @param updateDomainAssociationRequest
     *        The request structure for the update domain association request.
     * @return Result of the UpdateDomainAssociation operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws DependentServiceFailureException
     *         An operation failed because a dependent service threw an exception.
     * @sample AWSAmplify.UpdateDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateDomainAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDomainAssociationResult updateDomainAssociation(UpdateDomainAssociationRequest updateDomainAssociationRequest);

    /**
     * <p>
     * Updates a webhook.
     * </p>
     * 
     * @param updateWebhookRequest
     *        The request structure for the update webhook request.
     * @return Result of the UpdateWebhook operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @throws UnauthorizedException
     *         An operation failed due to a lack of access.
     * @throws NotFoundException
     *         An entity was not found during an operation.
     * @throws InternalFailureException
     *         The service failed to perform an operation due to an internal issue.
     * @throws DependentServiceFailureException
     *         An operation failed because a dependent service threw an exception.
     * @sample AWSAmplify.UpdateWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateWebhookResult updateWebhook(UpdateWebhookRequest updateWebhookRequest);

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
