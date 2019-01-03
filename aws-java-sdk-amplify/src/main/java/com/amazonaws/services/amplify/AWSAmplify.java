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
 * Amplify is a fully managed continuous deployment and hosting service for modern web apps.
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
     * Creates a new Amplify App.
     * </p>
     * 
     * @param createAppRequest
     *        Request structure used to create Apps in Amplify.
     * @return Result of the CreateApp operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         Exception thrown when a resource could not be created because of service limits.
     * @throws DependentServiceFailureException
     *         Exception thrown when an operation fails due to a dependent service throwing an exception.
     * @sample AWSAmplify.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAppResult createApp(CreateAppRequest createAppRequest);

    /**
     * <p>
     * Creates a new Branch for an Amplify App.
     * </p>
     * 
     * @param createBranchRequest
     *        Request structure for a branch create request.
     * @return Result of the CreateBranch operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         Exception thrown when a resource could not be created because of service limits.
     * @throws DependentServiceFailureException
     *         Exception thrown when an operation fails due to a dependent service throwing an exception.
     * @sample AWSAmplify.CreateBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateBranch" target="_top">AWS API
     *      Documentation</a>
     */
    CreateBranchResult createBranch(CreateBranchRequest createBranchRequest);

    /**
     * <p>
     * Create a new DomainAssociation on an App
     * </p>
     * 
     * @param createDomainAssociationRequest
     *        Request structure for create Domain Association request.
     * @return Result of the CreateDomainAssociation operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         Exception thrown when a resource could not be created because of service limits.
     * @throws DependentServiceFailureException
     *         Exception thrown when an operation fails due to a dependent service throwing an exception.
     * @sample AWSAmplify.CreateDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateDomainAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDomainAssociationResult createDomainAssociation(CreateDomainAssociationRequest createDomainAssociationRequest);

    /**
     * <p>
     * Delete an existing Amplify App by appId.
     * </p>
     * 
     * @param deleteAppRequest
     *        Request structure for an Amplify App delete request.
     * @return Result of the DeleteApp operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws DependentServiceFailureException
     *         Exception thrown when an operation fails due to a dependent service throwing an exception.
     * @sample AWSAmplify.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAppResult deleteApp(DeleteAppRequest deleteAppRequest);

    /**
     * <p>
     * Deletes a branch for an Amplify App.
     * </p>
     * 
     * @param deleteBranchRequest
     *        Request structure for delete branch request.
     * @return Result of the DeleteBranch operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws DependentServiceFailureException
     *         Exception thrown when an operation fails due to a dependent service throwing an exception.
     * @sample AWSAmplify.DeleteBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteBranch" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteBranchResult deleteBranch(DeleteBranchRequest deleteBranchRequest);

    /**
     * <p>
     * Deletes a DomainAssociation.
     * </p>
     * 
     * @param deleteDomainAssociationRequest
     *        Request structure for the delete Domain Association request.
     * @return Result of the DeleteDomainAssociation operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws DependentServiceFailureException
     *         Exception thrown when an operation fails due to a dependent service throwing an exception.
     * @sample AWSAmplify.DeleteDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteDomainAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDomainAssociationResult deleteDomainAssociation(DeleteDomainAssociationRequest deleteDomainAssociationRequest);

    /**
     * <p>
     * Delete a job, for an Amplify branch, part of Amplify App.
     * </p>
     * 
     * @param deleteJobRequest
     *        Request structure for delete job request.
     * @return Result of the DeleteJob operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws LimitExceededException
     *         Exception thrown when a resource could not be created because of service limits.
     * @sample AWSAmplify.DeleteJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteJob" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteJobResult deleteJob(DeleteJobRequest deleteJobRequest);

    /**
     * <p>
     * Retrieves an existing Amplify App by appId.
     * </p>
     * 
     * @param getAppRequest
     *        Request structure for get App request.
     * @return Result of the GetApp operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @sample AWSAmplify.GetApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetApp" target="_top">AWS API
     *      Documentation</a>
     */
    GetAppResult getApp(GetAppRequest getAppRequest);

    /**
     * <p>
     * Retrieves a branch for an Amplify App.
     * </p>
     * 
     * @param getBranchRequest
     *        Result structure for get branch request.
     * @return Result of the GetBranch operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @sample AWSAmplify.GetBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetBranch" target="_top">AWS API
     *      Documentation</a>
     */
    GetBranchResult getBranch(GetBranchRequest getBranchRequest);

    /**
     * <p>
     * Retrieves domain info that corresponds to an appId and domainName.
     * </p>
     * 
     * @param getDomainAssociationRequest
     *        Request structure for the get Domain Association request.
     * @return Result of the GetDomainAssociation operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @sample AWSAmplify.GetDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetDomainAssociation" target="_top">AWS
     *      API Documentation</a>
     */
    GetDomainAssociationResult getDomainAssociation(GetDomainAssociationRequest getDomainAssociationRequest);

    /**
     * <p>
     * Get a job for a branch, part of an Amplify App.
     * </p>
     * 
     * @param getJobRequest
     *        Request structure for get job request.
     * @return Result of the GetJob operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws LimitExceededException
     *         Exception thrown when a resource could not be created because of service limits.
     * @sample AWSAmplify.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    GetJobResult getJob(GetJobRequest getJobRequest);

    /**
     * <p>
     * Lists existing Amplify Apps.
     * </p>
     * 
     * @param listAppsRequest
     *        Request structure for an Amplify App list request.
     * @return Result of the ListApps operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @sample AWSAmplify.ListApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListApps" target="_top">AWS API
     *      Documentation</a>
     */
    ListAppsResult listApps(ListAppsRequest listAppsRequest);

    /**
     * <p>
     * Lists branches for an Amplify App.
     * </p>
     * 
     * @param listBranchesRequest
     *        Request structure for list branches request.
     * @return Result of the ListBranches operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @sample AWSAmplify.ListBranches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListBranches" target="_top">AWS API
     *      Documentation</a>
     */
    ListBranchesResult listBranches(ListBranchesRequest listBranchesRequest);

    /**
     * <p>
     * List domains with an app
     * </p>
     * 
     * @param listDomainAssociationsRequest
     *        Request structure for the list Domain Associations request.
     * @return Result of the ListDomainAssociations operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @sample AWSAmplify.ListDomainAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListDomainAssociations" target="_top">AWS
     *      API Documentation</a>
     */
    ListDomainAssociationsResult listDomainAssociations(ListDomainAssociationsRequest listDomainAssociationsRequest);

    /**
     * <p>
     * List Jobs for a branch, part of an Amplify App.
     * </p>
     * 
     * @param listJobsRequest
     *        Request structure for list job request.
     * @return Result of the ListJobs operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         Exception thrown when a resource could not be created because of service limits.
     * @sample AWSAmplify.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListJobsResult listJobs(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * Starts a new job for a branch, part of an Amplify App.
     * </p>
     * 
     * @param startJobRequest
     *        Request structure for Start job request.
     * @return Result of the StartJob operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws LimitExceededException
     *         Exception thrown when a resource could not be created because of service limits.
     * @sample AWSAmplify.StartJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/StartJob" target="_top">AWS API
     *      Documentation</a>
     */
    StartJobResult startJob(StartJobRequest startJobRequest);

    /**
     * <p>
     * Stop a job that is in progress, for an Amplify branch, part of Amplify App.
     * </p>
     * 
     * @param stopJobRequest
     *        Request structure for stop job request.
     * @return Result of the StopJob operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws LimitExceededException
     *         Exception thrown when a resource could not be created because of service limits.
     * @sample AWSAmplify.StopJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/StopJob" target="_top">AWS API
     *      Documentation</a>
     */
    StopJobResult stopJob(StopJobRequest stopJobRequest);

    /**
     * <p>
     * Updates an existing Amplify App.
     * </p>
     * 
     * @param updateAppRequest
     *        Request structure for update App request.
     * @return Result of the UpdateApp operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @sample AWSAmplify.UpdateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateApp" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAppResult updateApp(UpdateAppRequest updateAppRequest);

    /**
     * <p>
     * Updates a branch for an Amplify App.
     * </p>
     * 
     * @param updateBranchRequest
     *        Request structure for update branch request.
     * @return Result of the UpdateBranch operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws DependentServiceFailureException
     *         Exception thrown when an operation fails due to a dependent service throwing an exception.
     * @sample AWSAmplify.UpdateBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateBranch" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateBranchResult updateBranch(UpdateBranchRequest updateBranchRequest);

    /**
     * <p>
     * Create a new DomainAssociation on an App
     * </p>
     * 
     * @param updateDomainAssociationRequest
     *        Request structure for update Domain Association request.
     * @return Result of the UpdateDomainAssociation operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws DependentServiceFailureException
     *         Exception thrown when an operation fails due to a dependent service throwing an exception.
     * @sample AWSAmplify.UpdateDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateDomainAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDomainAssociationResult updateDomainAssociation(UpdateDomainAssociationRequest updateDomainAssociationRequest);

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
