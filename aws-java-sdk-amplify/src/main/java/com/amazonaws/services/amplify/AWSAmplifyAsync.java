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
     * Retrieves a branch for an Amplify App.
     * </p>
     * 
     * @param getBranchRequest
     *        Result structure for get branch request.
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
     *        Result structure for get branch request.
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

}
