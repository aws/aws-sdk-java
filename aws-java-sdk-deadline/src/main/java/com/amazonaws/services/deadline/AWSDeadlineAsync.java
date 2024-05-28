/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline;

import javax.annotation.Generated;

import com.amazonaws.services.deadline.model.*;

/**
 * Interface for accessing AWSDeadlineCloud asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.deadline.AbstractAWSDeadlineAsync} instead.
 * </p>
 * <p>
 * <p>
 * The Amazon Web Services Deadline Cloud API provides infrastructure and centralized management for your projects. Use
 * the Deadline Cloud API to onboard users, assign projects, and attach permissions specific to their job function.
 * </p>
 * <p>
 * With Deadline Cloud, content production teams can deploy resources for their workforce securely in the cloud,
 * reducing the costs of added physical infrastructure. Keep your content production operations secure, while allowing
 * your contributors to access the tools they need, such as scalable high-speed storage, licenses, and cost management
 * services.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSDeadlineAsync extends AWSDeadline {

    /**
     * <p>
     * Assigns a farm membership level to a member.
     * </p>
     * 
     * @param associateMemberToFarmRequest
     * @return A Java Future containing the result of the AssociateMemberToFarm operation returned by the service.
     * @sample AWSDeadlineAsync.AssociateMemberToFarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssociateMemberToFarm" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateMemberToFarmResult> associateMemberToFarmAsync(AssociateMemberToFarmRequest associateMemberToFarmRequest);

    /**
     * <p>
     * Assigns a farm membership level to a member.
     * </p>
     * 
     * @param associateMemberToFarmRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateMemberToFarm operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.AssociateMemberToFarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssociateMemberToFarm" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateMemberToFarmResult> associateMemberToFarmAsync(AssociateMemberToFarmRequest associateMemberToFarmRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateMemberToFarmRequest, AssociateMemberToFarmResult> asyncHandler);

    /**
     * <p>
     * Assigns a fleet membership level to a member.
     * </p>
     * 
     * @param associateMemberToFleetRequest
     * @return A Java Future containing the result of the AssociateMemberToFleet operation returned by the service.
     * @sample AWSDeadlineAsync.AssociateMemberToFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssociateMemberToFleet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateMemberToFleetResult> associateMemberToFleetAsync(AssociateMemberToFleetRequest associateMemberToFleetRequest);

    /**
     * <p>
     * Assigns a fleet membership level to a member.
     * </p>
     * 
     * @param associateMemberToFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateMemberToFleet operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.AssociateMemberToFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssociateMemberToFleet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateMemberToFleetResult> associateMemberToFleetAsync(AssociateMemberToFleetRequest associateMemberToFleetRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateMemberToFleetRequest, AssociateMemberToFleetResult> asyncHandler);

    /**
     * <p>
     * Assigns a job membership level to a member
     * </p>
     * 
     * @param associateMemberToJobRequest
     * @return A Java Future containing the result of the AssociateMemberToJob operation returned by the service.
     * @sample AWSDeadlineAsync.AssociateMemberToJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssociateMemberToJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateMemberToJobResult> associateMemberToJobAsync(AssociateMemberToJobRequest associateMemberToJobRequest);

    /**
     * <p>
     * Assigns a job membership level to a member
     * </p>
     * 
     * @param associateMemberToJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateMemberToJob operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.AssociateMemberToJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssociateMemberToJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateMemberToJobResult> associateMemberToJobAsync(AssociateMemberToJobRequest associateMemberToJobRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateMemberToJobRequest, AssociateMemberToJobResult> asyncHandler);

    /**
     * <p>
     * Assigns a queue membership level to a member
     * </p>
     * 
     * @param associateMemberToQueueRequest
     * @return A Java Future containing the result of the AssociateMemberToQueue operation returned by the service.
     * @sample AWSDeadlineAsync.AssociateMemberToQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssociateMemberToQueue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateMemberToQueueResult> associateMemberToQueueAsync(AssociateMemberToQueueRequest associateMemberToQueueRequest);

    /**
     * <p>
     * Assigns a queue membership level to a member
     * </p>
     * 
     * @param associateMemberToQueueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateMemberToQueue operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.AssociateMemberToQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssociateMemberToQueue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateMemberToQueueResult> associateMemberToQueueAsync(AssociateMemberToQueueRequest associateMemberToQueueRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateMemberToQueueRequest, AssociateMemberToQueueResult> asyncHandler);

    /**
     * <p>
     * Get Amazon Web Services credentials from the fleet role. The IAM permissions of the credentials are scoped down
     * to have read-only access.
     * </p>
     * 
     * @param assumeFleetRoleForReadRequest
     * @return A Java Future containing the result of the AssumeFleetRoleForRead operation returned by the service.
     * @sample AWSDeadlineAsync.AssumeFleetRoleForRead
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssumeFleetRoleForRead"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssumeFleetRoleForReadResult> assumeFleetRoleForReadAsync(AssumeFleetRoleForReadRequest assumeFleetRoleForReadRequest);

    /**
     * <p>
     * Get Amazon Web Services credentials from the fleet role. The IAM permissions of the credentials are scoped down
     * to have read-only access.
     * </p>
     * 
     * @param assumeFleetRoleForReadRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssumeFleetRoleForRead operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.AssumeFleetRoleForRead
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssumeFleetRoleForRead"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssumeFleetRoleForReadResult> assumeFleetRoleForReadAsync(AssumeFleetRoleForReadRequest assumeFleetRoleForReadRequest,
            com.amazonaws.handlers.AsyncHandler<AssumeFleetRoleForReadRequest, AssumeFleetRoleForReadResult> asyncHandler);

    /**
     * <p>
     * Get credentials from the fleet role for a worker.
     * </p>
     * 
     * @param assumeFleetRoleForWorkerRequest
     * @return A Java Future containing the result of the AssumeFleetRoleForWorker operation returned by the service.
     * @sample AWSDeadlineAsync.AssumeFleetRoleForWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssumeFleetRoleForWorker"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssumeFleetRoleForWorkerResult> assumeFleetRoleForWorkerAsync(AssumeFleetRoleForWorkerRequest assumeFleetRoleForWorkerRequest);

    /**
     * <p>
     * Get credentials from the fleet role for a worker.
     * </p>
     * 
     * @param assumeFleetRoleForWorkerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssumeFleetRoleForWorker operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.AssumeFleetRoleForWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssumeFleetRoleForWorker"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssumeFleetRoleForWorkerResult> assumeFleetRoleForWorkerAsync(AssumeFleetRoleForWorkerRequest assumeFleetRoleForWorkerRequest,
            com.amazonaws.handlers.AsyncHandler<AssumeFleetRoleForWorkerRequest, AssumeFleetRoleForWorkerResult> asyncHandler);

    /**
     * <p>
     * Gets Amazon Web Services credentials from the queue role. The IAM permissions of the credentials are scoped down
     * to have read-only access.
     * </p>
     * 
     * @param assumeQueueRoleForReadRequest
     * @return A Java Future containing the result of the AssumeQueueRoleForRead operation returned by the service.
     * @sample AWSDeadlineAsync.AssumeQueueRoleForRead
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssumeQueueRoleForRead"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssumeQueueRoleForReadResult> assumeQueueRoleForReadAsync(AssumeQueueRoleForReadRequest assumeQueueRoleForReadRequest);

    /**
     * <p>
     * Gets Amazon Web Services credentials from the queue role. The IAM permissions of the credentials are scoped down
     * to have read-only access.
     * </p>
     * 
     * @param assumeQueueRoleForReadRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssumeQueueRoleForRead operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.AssumeQueueRoleForRead
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssumeQueueRoleForRead"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssumeQueueRoleForReadResult> assumeQueueRoleForReadAsync(AssumeQueueRoleForReadRequest assumeQueueRoleForReadRequest,
            com.amazonaws.handlers.AsyncHandler<AssumeQueueRoleForReadRequest, AssumeQueueRoleForReadResult> asyncHandler);

    /**
     * <p>
     * Allows a user to assume a role for a queue.
     * </p>
     * 
     * @param assumeQueueRoleForUserRequest
     * @return A Java Future containing the result of the AssumeQueueRoleForUser operation returned by the service.
     * @sample AWSDeadlineAsync.AssumeQueueRoleForUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssumeQueueRoleForUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssumeQueueRoleForUserResult> assumeQueueRoleForUserAsync(AssumeQueueRoleForUserRequest assumeQueueRoleForUserRequest);

    /**
     * <p>
     * Allows a user to assume a role for a queue.
     * </p>
     * 
     * @param assumeQueueRoleForUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssumeQueueRoleForUser operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.AssumeQueueRoleForUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssumeQueueRoleForUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssumeQueueRoleForUserResult> assumeQueueRoleForUserAsync(AssumeQueueRoleForUserRequest assumeQueueRoleForUserRequest,
            com.amazonaws.handlers.AsyncHandler<AssumeQueueRoleForUserRequest, AssumeQueueRoleForUserResult> asyncHandler);

    /**
     * <p>
     * Allows a worker to assume a queue role.
     * </p>
     * 
     * @param assumeQueueRoleForWorkerRequest
     * @return A Java Future containing the result of the AssumeQueueRoleForWorker operation returned by the service.
     * @sample AWSDeadlineAsync.AssumeQueueRoleForWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssumeQueueRoleForWorker"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssumeQueueRoleForWorkerResult> assumeQueueRoleForWorkerAsync(AssumeQueueRoleForWorkerRequest assumeQueueRoleForWorkerRequest);

    /**
     * <p>
     * Allows a worker to assume a queue role.
     * </p>
     * 
     * @param assumeQueueRoleForWorkerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssumeQueueRoleForWorker operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.AssumeQueueRoleForWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssumeQueueRoleForWorker"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssumeQueueRoleForWorkerResult> assumeQueueRoleForWorkerAsync(AssumeQueueRoleForWorkerRequest assumeQueueRoleForWorkerRequest,
            com.amazonaws.handlers.AsyncHandler<AssumeQueueRoleForWorkerRequest, AssumeQueueRoleForWorkerResult> asyncHandler);

    /**
     * <p>
     * Get batched job details for a worker.
     * </p>
     * 
     * @param batchGetJobEntityRequest
     * @return A Java Future containing the result of the BatchGetJobEntity operation returned by the service.
     * @sample AWSDeadlineAsync.BatchGetJobEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/BatchGetJobEntity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetJobEntityResult> batchGetJobEntityAsync(BatchGetJobEntityRequest batchGetJobEntityRequest);

    /**
     * <p>
     * Get batched job details for a worker.
     * </p>
     * 
     * @param batchGetJobEntityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetJobEntity operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.BatchGetJobEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/BatchGetJobEntity" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetJobEntityResult> batchGetJobEntityAsync(BatchGetJobEntityRequest batchGetJobEntityRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetJobEntityRequest, BatchGetJobEntityResult> asyncHandler);

    /**
     * <p>
     * Copies a job template to an Amazon S3 bucket.
     * </p>
     * 
     * @param copyJobTemplateRequest
     * @return A Java Future containing the result of the CopyJobTemplate operation returned by the service.
     * @sample AWSDeadlineAsync.CopyJobTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CopyJobTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CopyJobTemplateResult> copyJobTemplateAsync(CopyJobTemplateRequest copyJobTemplateRequest);

    /**
     * <p>
     * Copies a job template to an Amazon S3 bucket.
     * </p>
     * 
     * @param copyJobTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopyJobTemplate operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.CopyJobTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CopyJobTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CopyJobTemplateResult> copyJobTemplateAsync(CopyJobTemplateRequest copyJobTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CopyJobTemplateRequest, CopyJobTemplateResult> asyncHandler);

    /**
     * <p>
     * Creates a budget to set spending thresholds for your rendering activity.
     * </p>
     * 
     * @param createBudgetRequest
     * @return A Java Future containing the result of the CreateBudget operation returned by the service.
     * @sample AWSDeadlineAsync.CreateBudget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateBudget" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBudgetResult> createBudgetAsync(CreateBudgetRequest createBudgetRequest);

    /**
     * <p>
     * Creates a budget to set spending thresholds for your rendering activity.
     * </p>
     * 
     * @param createBudgetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBudget operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.CreateBudget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateBudget" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBudgetResult> createBudgetAsync(CreateBudgetRequest createBudgetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBudgetRequest, CreateBudgetResult> asyncHandler);

    /**
     * <p>
     * Creates a farm to allow space for queues and fleets. Farms are the space where the components of your renders
     * gather and are pieced together in the cloud. Farms contain budgets and allow you to enforce permissions. Deadline
     * Cloud farms are a useful container for large projects.
     * </p>
     * 
     * @param createFarmRequest
     * @return A Java Future containing the result of the CreateFarm operation returned by the service.
     * @sample AWSDeadlineAsync.CreateFarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateFarm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFarmResult> createFarmAsync(CreateFarmRequest createFarmRequest);

    /**
     * <p>
     * Creates a farm to allow space for queues and fleets. Farms are the space where the components of your renders
     * gather and are pieced together in the cloud. Farms contain budgets and allow you to enforce permissions. Deadline
     * Cloud farms are a useful container for large projects.
     * </p>
     * 
     * @param createFarmRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFarm operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.CreateFarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateFarm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFarmResult> createFarmAsync(CreateFarmRequest createFarmRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFarmRequest, CreateFarmResult> asyncHandler);

    /**
     * <p>
     * Creates a fleet. Fleets gather information relating to compute, or capacity, for renders within your farms. You
     * can choose to manage your own capacity or opt to have fleets fully managed by Deadline Cloud.
     * </p>
     * 
     * @param createFleetRequest
     * @return A Java Future containing the result of the CreateFleet operation returned by the service.
     * @sample AWSDeadlineAsync.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest createFleetRequest);

    /**
     * <p>
     * Creates a fleet. Fleets gather information relating to compute, or capacity, for renders within your farms. You
     * can choose to manage your own capacity or opt to have fleets fully managed by Deadline Cloud.
     * </p>
     * 
     * @param createFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFleet operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest createFleetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFleetRequest, CreateFleetResult> asyncHandler);

    /**
     * <p>
     * Creates a job. A job is a render submission submitted by a user. It contains specific job properties outlined as
     * steps and tasks.
     * </p>
     * 
     * @param createJobRequest
     * @return A Java Future containing the result of the CreateJob operation returned by the service.
     * @sample AWSDeadlineAsync.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest);

    /**
     * <p>
     * Creates a job. A job is a render submission submitted by a user. It contains specific job properties outlined as
     * steps and tasks.
     * </p>
     * 
     * @param createJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateJob operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateJobRequest, CreateJobResult> asyncHandler);

    /**
     * <p>
     * Creates a license endpoint to integrate your various licensed software used for rendering on Deadline Cloud.
     * </p>
     * 
     * @param createLicenseEndpointRequest
     * @return A Java Future containing the result of the CreateLicenseEndpoint operation returned by the service.
     * @sample AWSDeadlineAsync.CreateLicenseEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateLicenseEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateLicenseEndpointResult> createLicenseEndpointAsync(CreateLicenseEndpointRequest createLicenseEndpointRequest);

    /**
     * <p>
     * Creates a license endpoint to integrate your various licensed software used for rendering on Deadline Cloud.
     * </p>
     * 
     * @param createLicenseEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLicenseEndpoint operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.CreateLicenseEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateLicenseEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateLicenseEndpointResult> createLicenseEndpointAsync(CreateLicenseEndpointRequest createLicenseEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLicenseEndpointRequest, CreateLicenseEndpointResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Web Services Deadline Cloud monitor that you can use to view your farms, queues, and fleets.
     * After you submit a job, you can track the progress of the tasks and steps that make up the job, and then download
     * the job's results.
     * </p>
     * 
     * @param createMonitorRequest
     * @return A Java Future containing the result of the CreateMonitor operation returned by the service.
     * @sample AWSDeadlineAsync.CreateMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMonitorResult> createMonitorAsync(CreateMonitorRequest createMonitorRequest);

    /**
     * <p>
     * Creates an Amazon Web Services Deadline Cloud monitor that you can use to view your farms, queues, and fleets.
     * After you submit a job, you can track the progress of the tasks and steps that make up the job, and then download
     * the job's results.
     * </p>
     * 
     * @param createMonitorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMonitor operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.CreateMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMonitorResult> createMonitorAsync(CreateMonitorRequest createMonitorRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMonitorRequest, CreateMonitorResult> asyncHandler);

    /**
     * <p>
     * Creates a queue to coordinate the order in which jobs run on a farm. A queue can also specify where to pull
     * resources and indicate where to output completed jobs.
     * </p>
     * 
     * @param createQueueRequest
     * @return A Java Future containing the result of the CreateQueue operation returned by the service.
     * @sample AWSDeadlineAsync.CreateQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateQueueResult> createQueueAsync(CreateQueueRequest createQueueRequest);

    /**
     * <p>
     * Creates a queue to coordinate the order in which jobs run on a farm. A queue can also specify where to pull
     * resources and indicate where to output completed jobs.
     * </p>
     * 
     * @param createQueueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateQueue operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.CreateQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateQueueResult> createQueueAsync(CreateQueueRequest createQueueRequest,
            com.amazonaws.handlers.AsyncHandler<CreateQueueRequest, CreateQueueResult> asyncHandler);

    /**
     * <p>
     * Creates an environment for a queue that defines how jobs in the queue run.
     * </p>
     * 
     * @param createQueueEnvironmentRequest
     * @return A Java Future containing the result of the CreateQueueEnvironment operation returned by the service.
     * @sample AWSDeadlineAsync.CreateQueueEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateQueueEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateQueueEnvironmentResult> createQueueEnvironmentAsync(CreateQueueEnvironmentRequest createQueueEnvironmentRequest);

    /**
     * <p>
     * Creates an environment for a queue that defines how jobs in the queue run.
     * </p>
     * 
     * @param createQueueEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateQueueEnvironment operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.CreateQueueEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateQueueEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateQueueEnvironmentResult> createQueueEnvironmentAsync(CreateQueueEnvironmentRequest createQueueEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateQueueEnvironmentRequest, CreateQueueEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Creates an association between a queue and a fleet.
     * </p>
     * 
     * @param createQueueFleetAssociationRequest
     * @return A Java Future containing the result of the CreateQueueFleetAssociation operation returned by the service.
     * @sample AWSDeadlineAsync.CreateQueueFleetAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateQueueFleetAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateQueueFleetAssociationResult> createQueueFleetAssociationAsync(
            CreateQueueFleetAssociationRequest createQueueFleetAssociationRequest);

    /**
     * <p>
     * Creates an association between a queue and a fleet.
     * </p>
     * 
     * @param createQueueFleetAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateQueueFleetAssociation operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.CreateQueueFleetAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateQueueFleetAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateQueueFleetAssociationResult> createQueueFleetAssociationAsync(
            CreateQueueFleetAssociationRequest createQueueFleetAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateQueueFleetAssociationRequest, CreateQueueFleetAssociationResult> asyncHandler);

    /**
     * <p>
     * Creates a storage profile that specifies the operating system, file type, and file location of resources used on
     * a farm.
     * </p>
     * 
     * @param createStorageProfileRequest
     * @return A Java Future containing the result of the CreateStorageProfile operation returned by the service.
     * @sample AWSDeadlineAsync.CreateStorageProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateStorageProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateStorageProfileResult> createStorageProfileAsync(CreateStorageProfileRequest createStorageProfileRequest);

    /**
     * <p>
     * Creates a storage profile that specifies the operating system, file type, and file location of resources used on
     * a farm.
     * </p>
     * 
     * @param createStorageProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStorageProfile operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.CreateStorageProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateStorageProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateStorageProfileResult> createStorageProfileAsync(CreateStorageProfileRequest createStorageProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStorageProfileRequest, CreateStorageProfileResult> asyncHandler);

    /**
     * <p>
     * Creates a worker. A worker tells your instance how much processing power (vCPU), and memory (GiB) you’ll need to
     * assemble the digital assets held within a particular instance. You can specify certain instance types to use, or
     * let the worker know which instances types to exclude.
     * </p>
     * 
     * @param createWorkerRequest
     * @return A Java Future containing the result of the CreateWorker operation returned by the service.
     * @sample AWSDeadlineAsync.CreateWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateWorker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkerResult> createWorkerAsync(CreateWorkerRequest createWorkerRequest);

    /**
     * <p>
     * Creates a worker. A worker tells your instance how much processing power (vCPU), and memory (GiB) you’ll need to
     * assemble the digital assets held within a particular instance. You can specify certain instance types to use, or
     * let the worker know which instances types to exclude.
     * </p>
     * 
     * @param createWorkerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorker operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.CreateWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateWorker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkerResult> createWorkerAsync(CreateWorkerRequest createWorkerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkerRequest, CreateWorkerResult> asyncHandler);

    /**
     * <p>
     * Deletes a budget.
     * </p>
     * 
     * @param deleteBudgetRequest
     * @return A Java Future containing the result of the DeleteBudget operation returned by the service.
     * @sample AWSDeadlineAsync.DeleteBudget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteBudget" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBudgetResult> deleteBudgetAsync(DeleteBudgetRequest deleteBudgetRequest);

    /**
     * <p>
     * Deletes a budget.
     * </p>
     * 
     * @param deleteBudgetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBudget operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.DeleteBudget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteBudget" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBudgetResult> deleteBudgetAsync(DeleteBudgetRequest deleteBudgetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBudgetRequest, DeleteBudgetResult> asyncHandler);

    /**
     * <p>
     * Deletes a farm.
     * </p>
     * 
     * @param deleteFarmRequest
     * @return A Java Future containing the result of the DeleteFarm operation returned by the service.
     * @sample AWSDeadlineAsync.DeleteFarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteFarm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFarmResult> deleteFarmAsync(DeleteFarmRequest deleteFarmRequest);

    /**
     * <p>
     * Deletes a farm.
     * </p>
     * 
     * @param deleteFarmRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFarm operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.DeleteFarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteFarm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFarmResult> deleteFarmAsync(DeleteFarmRequest deleteFarmRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFarmRequest, DeleteFarmResult> asyncHandler);

    /**
     * <p>
     * Deletes a fleet.
     * </p>
     * 
     * @param deleteFleetRequest
     * @return A Java Future containing the result of the DeleteFleet operation returned by the service.
     * @sample AWSDeadlineAsync.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest deleteFleetRequest);

    /**
     * <p>
     * Deletes a fleet.
     * </p>
     * 
     * @param deleteFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFleet operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest deleteFleetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFleetRequest, DeleteFleetResult> asyncHandler);

    /**
     * <p>
     * Deletes a license endpoint.
     * </p>
     * 
     * @param deleteLicenseEndpointRequest
     * @return A Java Future containing the result of the DeleteLicenseEndpoint operation returned by the service.
     * @sample AWSDeadlineAsync.DeleteLicenseEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteLicenseEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLicenseEndpointResult> deleteLicenseEndpointAsync(DeleteLicenseEndpointRequest deleteLicenseEndpointRequest);

    /**
     * <p>
     * Deletes a license endpoint.
     * </p>
     * 
     * @param deleteLicenseEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLicenseEndpoint operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.DeleteLicenseEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteLicenseEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLicenseEndpointResult> deleteLicenseEndpointAsync(DeleteLicenseEndpointRequest deleteLicenseEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLicenseEndpointRequest, DeleteLicenseEndpointResult> asyncHandler);

    /**
     * <p>
     * Deletes a metered product.
     * </p>
     * 
     * @param deleteMeteredProductRequest
     * @return A Java Future containing the result of the DeleteMeteredProduct operation returned by the service.
     * @sample AWSDeadlineAsync.DeleteMeteredProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteMeteredProduct" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMeteredProductResult> deleteMeteredProductAsync(DeleteMeteredProductRequest deleteMeteredProductRequest);

    /**
     * <p>
     * Deletes a metered product.
     * </p>
     * 
     * @param deleteMeteredProductRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMeteredProduct operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.DeleteMeteredProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteMeteredProduct" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMeteredProductResult> deleteMeteredProductAsync(DeleteMeteredProductRequest deleteMeteredProductRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMeteredProductRequest, DeleteMeteredProductResult> asyncHandler);

    /**
     * <p>
     * Removes a Deadline Cloud monitor. After you delete a monitor, you can create a new one and attach farms to the
     * monitor.
     * </p>
     * 
     * @param deleteMonitorRequest
     * @return A Java Future containing the result of the DeleteMonitor operation returned by the service.
     * @sample AWSDeadlineAsync.DeleteMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMonitorResult> deleteMonitorAsync(DeleteMonitorRequest deleteMonitorRequest);

    /**
     * <p>
     * Removes a Deadline Cloud monitor. After you delete a monitor, you can create a new one and attach farms to the
     * monitor.
     * </p>
     * 
     * @param deleteMonitorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMonitor operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.DeleteMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMonitorResult> deleteMonitorAsync(DeleteMonitorRequest deleteMonitorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMonitorRequest, DeleteMonitorResult> asyncHandler);

    /**
     * <p>
     * Deletes a queue.
     * </p>
     * 
     * @param deleteQueueRequest
     * @return A Java Future containing the result of the DeleteQueue operation returned by the service.
     * @sample AWSDeadlineAsync.DeleteQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteQueueResult> deleteQueueAsync(DeleteQueueRequest deleteQueueRequest);

    /**
     * <p>
     * Deletes a queue.
     * </p>
     * 
     * @param deleteQueueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteQueue operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.DeleteQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteQueueResult> deleteQueueAsync(DeleteQueueRequest deleteQueueRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteQueueRequest, DeleteQueueResult> asyncHandler);

    /**
     * <p>
     * Deletes a queue environment.
     * </p>
     * 
     * @param deleteQueueEnvironmentRequest
     * @return A Java Future containing the result of the DeleteQueueEnvironment operation returned by the service.
     * @sample AWSDeadlineAsync.DeleteQueueEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteQueueEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteQueueEnvironmentResult> deleteQueueEnvironmentAsync(DeleteQueueEnvironmentRequest deleteQueueEnvironmentRequest);

    /**
     * <p>
     * Deletes a queue environment.
     * </p>
     * 
     * @param deleteQueueEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteQueueEnvironment operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.DeleteQueueEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteQueueEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteQueueEnvironmentResult> deleteQueueEnvironmentAsync(DeleteQueueEnvironmentRequest deleteQueueEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteQueueEnvironmentRequest, DeleteQueueEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Deletes a queue-fleet association.
     * </p>
     * 
     * @param deleteQueueFleetAssociationRequest
     * @return A Java Future containing the result of the DeleteQueueFleetAssociation operation returned by the service.
     * @sample AWSDeadlineAsync.DeleteQueueFleetAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteQueueFleetAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteQueueFleetAssociationResult> deleteQueueFleetAssociationAsync(
            DeleteQueueFleetAssociationRequest deleteQueueFleetAssociationRequest);

    /**
     * <p>
     * Deletes a queue-fleet association.
     * </p>
     * 
     * @param deleteQueueFleetAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteQueueFleetAssociation operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.DeleteQueueFleetAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteQueueFleetAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteQueueFleetAssociationResult> deleteQueueFleetAssociationAsync(
            DeleteQueueFleetAssociationRequest deleteQueueFleetAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteQueueFleetAssociationRequest, DeleteQueueFleetAssociationResult> asyncHandler);

    /**
     * <p>
     * Deletes a storage profile.
     * </p>
     * 
     * @param deleteStorageProfileRequest
     * @return A Java Future containing the result of the DeleteStorageProfile operation returned by the service.
     * @sample AWSDeadlineAsync.DeleteStorageProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteStorageProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteStorageProfileResult> deleteStorageProfileAsync(DeleteStorageProfileRequest deleteStorageProfileRequest);

    /**
     * <p>
     * Deletes a storage profile.
     * </p>
     * 
     * @param deleteStorageProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStorageProfile operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.DeleteStorageProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteStorageProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteStorageProfileResult> deleteStorageProfileAsync(DeleteStorageProfileRequest deleteStorageProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStorageProfileRequest, DeleteStorageProfileResult> asyncHandler);

    /**
     * <p>
     * Deletes a worker.
     * </p>
     * 
     * @param deleteWorkerRequest
     * @return A Java Future containing the result of the DeleteWorker operation returned by the service.
     * @sample AWSDeadlineAsync.DeleteWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteWorker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkerResult> deleteWorkerAsync(DeleteWorkerRequest deleteWorkerRequest);

    /**
     * <p>
     * Deletes a worker.
     * </p>
     * 
     * @param deleteWorkerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWorker operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.DeleteWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteWorker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkerResult> deleteWorkerAsync(DeleteWorkerRequest deleteWorkerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkerRequest, DeleteWorkerResult> asyncHandler);

    /**
     * <p>
     * Disassociates a member from a farm.
     * </p>
     * 
     * @param disassociateMemberFromFarmRequest
     * @return A Java Future containing the result of the DisassociateMemberFromFarm operation returned by the service.
     * @sample AWSDeadlineAsync.DisassociateMemberFromFarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DisassociateMemberFromFarm"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMemberFromFarmResult> disassociateMemberFromFarmAsync(
            DisassociateMemberFromFarmRequest disassociateMemberFromFarmRequest);

    /**
     * <p>
     * Disassociates a member from a farm.
     * </p>
     * 
     * @param disassociateMemberFromFarmRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateMemberFromFarm operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.DisassociateMemberFromFarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DisassociateMemberFromFarm"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMemberFromFarmResult> disassociateMemberFromFarmAsync(
            DisassociateMemberFromFarmRequest disassociateMemberFromFarmRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateMemberFromFarmRequest, DisassociateMemberFromFarmResult> asyncHandler);

    /**
     * <p>
     * Disassociates a member from a fleet.
     * </p>
     * 
     * @param disassociateMemberFromFleetRequest
     * @return A Java Future containing the result of the DisassociateMemberFromFleet operation returned by the service.
     * @sample AWSDeadlineAsync.DisassociateMemberFromFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DisassociateMemberFromFleet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMemberFromFleetResult> disassociateMemberFromFleetAsync(
            DisassociateMemberFromFleetRequest disassociateMemberFromFleetRequest);

    /**
     * <p>
     * Disassociates a member from a fleet.
     * </p>
     * 
     * @param disassociateMemberFromFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateMemberFromFleet operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.DisassociateMemberFromFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DisassociateMemberFromFleet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMemberFromFleetResult> disassociateMemberFromFleetAsync(
            DisassociateMemberFromFleetRequest disassociateMemberFromFleetRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateMemberFromFleetRequest, DisassociateMemberFromFleetResult> asyncHandler);

    /**
     * <p>
     * Disassociates a member from a job.
     * </p>
     * 
     * @param disassociateMemberFromJobRequest
     * @return A Java Future containing the result of the DisassociateMemberFromJob operation returned by the service.
     * @sample AWSDeadlineAsync.DisassociateMemberFromJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DisassociateMemberFromJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMemberFromJobResult> disassociateMemberFromJobAsync(
            DisassociateMemberFromJobRequest disassociateMemberFromJobRequest);

    /**
     * <p>
     * Disassociates a member from a job.
     * </p>
     * 
     * @param disassociateMemberFromJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateMemberFromJob operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.DisassociateMemberFromJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DisassociateMemberFromJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMemberFromJobResult> disassociateMemberFromJobAsync(
            DisassociateMemberFromJobRequest disassociateMemberFromJobRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateMemberFromJobRequest, DisassociateMemberFromJobResult> asyncHandler);

    /**
     * <p>
     * Disassociates a member from a queue.
     * </p>
     * 
     * @param disassociateMemberFromQueueRequest
     * @return A Java Future containing the result of the DisassociateMemberFromQueue operation returned by the service.
     * @sample AWSDeadlineAsync.DisassociateMemberFromQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DisassociateMemberFromQueue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMemberFromQueueResult> disassociateMemberFromQueueAsync(
            DisassociateMemberFromQueueRequest disassociateMemberFromQueueRequest);

    /**
     * <p>
     * Disassociates a member from a queue.
     * </p>
     * 
     * @param disassociateMemberFromQueueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateMemberFromQueue operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.DisassociateMemberFromQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DisassociateMemberFromQueue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMemberFromQueueResult> disassociateMemberFromQueueAsync(
            DisassociateMemberFromQueueRequest disassociateMemberFromQueueRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateMemberFromQueueRequest, DisassociateMemberFromQueueResult> asyncHandler);

    /**
     * <p>
     * Get a budget.
     * </p>
     * 
     * @param getBudgetRequest
     * @return A Java Future containing the result of the GetBudget operation returned by the service.
     * @sample AWSDeadlineAsync.GetBudget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetBudget" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBudgetResult> getBudgetAsync(GetBudgetRequest getBudgetRequest);

    /**
     * <p>
     * Get a budget.
     * </p>
     * 
     * @param getBudgetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBudget operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.GetBudget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetBudget" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBudgetResult> getBudgetAsync(GetBudgetRequest getBudgetRequest,
            com.amazonaws.handlers.AsyncHandler<GetBudgetRequest, GetBudgetResult> asyncHandler);

    /**
     * <p>
     * Get a farm.
     * </p>
     * 
     * @param getFarmRequest
     * @return A Java Future containing the result of the GetFarm operation returned by the service.
     * @sample AWSDeadlineAsync.GetFarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetFarm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFarmResult> getFarmAsync(GetFarmRequest getFarmRequest);

    /**
     * <p>
     * Get a farm.
     * </p>
     * 
     * @param getFarmRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFarm operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.GetFarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetFarm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFarmResult> getFarmAsync(GetFarmRequest getFarmRequest,
            com.amazonaws.handlers.AsyncHandler<GetFarmRequest, GetFarmResult> asyncHandler);

    /**
     * <p>
     * Get a fleet.
     * </p>
     * 
     * @param getFleetRequest
     * @return A Java Future containing the result of the GetFleet operation returned by the service.
     * @sample AWSDeadlineAsync.GetFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFleetResult> getFleetAsync(GetFleetRequest getFleetRequest);

    /**
     * <p>
     * Get a fleet.
     * </p>
     * 
     * @param getFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFleet operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.GetFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFleetResult> getFleetAsync(GetFleetRequest getFleetRequest,
            com.amazonaws.handlers.AsyncHandler<GetFleetRequest, GetFleetResult> asyncHandler);

    /**
     * <p>
     * Gets a Deadline Cloud job.
     * </p>
     * 
     * @param getJobRequest
     * @return A Java Future containing the result of the GetJob operation returned by the service.
     * @sample AWSDeadlineAsync.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobResult> getJobAsync(GetJobRequest getJobRequest);

    /**
     * <p>
     * Gets a Deadline Cloud job.
     * </p>
     * 
     * @param getJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetJob operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobResult> getJobAsync(GetJobRequest getJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetJobRequest, GetJobResult> asyncHandler);

    /**
     * <p>
     * Gets a licence endpoint.
     * </p>
     * 
     * @param getLicenseEndpointRequest
     * @return A Java Future containing the result of the GetLicenseEndpoint operation returned by the service.
     * @sample AWSDeadlineAsync.GetLicenseEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetLicenseEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLicenseEndpointResult> getLicenseEndpointAsync(GetLicenseEndpointRequest getLicenseEndpointRequest);

    /**
     * <p>
     * Gets a licence endpoint.
     * </p>
     * 
     * @param getLicenseEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLicenseEndpoint operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.GetLicenseEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetLicenseEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLicenseEndpointResult> getLicenseEndpointAsync(GetLicenseEndpointRequest getLicenseEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<GetLicenseEndpointRequest, GetLicenseEndpointResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified monitor.
     * </p>
     * 
     * @param getMonitorRequest
     * @return A Java Future containing the result of the GetMonitor operation returned by the service.
     * @sample AWSDeadlineAsync.GetMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMonitorResult> getMonitorAsync(GetMonitorRequest getMonitorRequest);

    /**
     * <p>
     * Gets information about the specified monitor.
     * </p>
     * 
     * @param getMonitorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMonitor operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.GetMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMonitorResult> getMonitorAsync(GetMonitorRequest getMonitorRequest,
            com.amazonaws.handlers.AsyncHandler<GetMonitorRequest, GetMonitorResult> asyncHandler);

    /**
     * <p>
     * Gets a queue.
     * </p>
     * 
     * @param getQueueRequest
     * @return A Java Future containing the result of the GetQueue operation returned by the service.
     * @sample AWSDeadlineAsync.GetQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetQueueResult> getQueueAsync(GetQueueRequest getQueueRequest);

    /**
     * <p>
     * Gets a queue.
     * </p>
     * 
     * @param getQueueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetQueue operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.GetQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetQueueResult> getQueueAsync(GetQueueRequest getQueueRequest,
            com.amazonaws.handlers.AsyncHandler<GetQueueRequest, GetQueueResult> asyncHandler);

    /**
     * <p>
     * Gets a queue environment.
     * </p>
     * 
     * @param getQueueEnvironmentRequest
     * @return A Java Future containing the result of the GetQueueEnvironment operation returned by the service.
     * @sample AWSDeadlineAsync.GetQueueEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetQueueEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetQueueEnvironmentResult> getQueueEnvironmentAsync(GetQueueEnvironmentRequest getQueueEnvironmentRequest);

    /**
     * <p>
     * Gets a queue environment.
     * </p>
     * 
     * @param getQueueEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetQueueEnvironment operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.GetQueueEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetQueueEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetQueueEnvironmentResult> getQueueEnvironmentAsync(GetQueueEnvironmentRequest getQueueEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<GetQueueEnvironmentRequest, GetQueueEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Gets a queue-fleet association.
     * </p>
     * 
     * @param getQueueFleetAssociationRequest
     * @return A Java Future containing the result of the GetQueueFleetAssociation operation returned by the service.
     * @sample AWSDeadlineAsync.GetQueueFleetAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetQueueFleetAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetQueueFleetAssociationResult> getQueueFleetAssociationAsync(GetQueueFleetAssociationRequest getQueueFleetAssociationRequest);

    /**
     * <p>
     * Gets a queue-fleet association.
     * </p>
     * 
     * @param getQueueFleetAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetQueueFleetAssociation operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.GetQueueFleetAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetQueueFleetAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetQueueFleetAssociationResult> getQueueFleetAssociationAsync(GetQueueFleetAssociationRequest getQueueFleetAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<GetQueueFleetAssociationRequest, GetQueueFleetAssociationResult> asyncHandler);

    /**
     * <p>
     * Gets a session.
     * </p>
     * 
     * @param getSessionRequest
     * @return A Java Future containing the result of the GetSession operation returned by the service.
     * @sample AWSDeadlineAsync.GetSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSessionResult> getSessionAsync(GetSessionRequest getSessionRequest);

    /**
     * <p>
     * Gets a session.
     * </p>
     * 
     * @param getSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSession operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.GetSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSessionResult> getSessionAsync(GetSessionRequest getSessionRequest,
            com.amazonaws.handlers.AsyncHandler<GetSessionRequest, GetSessionResult> asyncHandler);

    /**
     * <p>
     * Gets a session action for the job.
     * </p>
     * 
     * @param getSessionActionRequest
     * @return A Java Future containing the result of the GetSessionAction operation returned by the service.
     * @sample AWSDeadlineAsync.GetSessionAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetSessionAction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSessionActionResult> getSessionActionAsync(GetSessionActionRequest getSessionActionRequest);

    /**
     * <p>
     * Gets a session action for the job.
     * </p>
     * 
     * @param getSessionActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSessionAction operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.GetSessionAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetSessionAction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSessionActionResult> getSessionActionAsync(GetSessionActionRequest getSessionActionRequest,
            com.amazonaws.handlers.AsyncHandler<GetSessionActionRequest, GetSessionActionResult> asyncHandler);

    /**
     * <p>
     * Gets a set of statistics for queues or farms. Before you can call the
     * <code>GetSessionStatisticsAggregation</code> operation, you must first call the
     * <code>StartSessionsStatisticsAggregation</code> operation. Statistics are available for 1 hour after you call the
     * <code>StartSessionsStatisticsAggregation</code> operation.
     * </p>
     * 
     * @param getSessionsStatisticsAggregationRequest
     * @return A Java Future containing the result of the GetSessionsStatisticsAggregation operation returned by the
     *         service.
     * @sample AWSDeadlineAsync.GetSessionsStatisticsAggregation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetSessionsStatisticsAggregation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSessionsStatisticsAggregationResult> getSessionsStatisticsAggregationAsync(
            GetSessionsStatisticsAggregationRequest getSessionsStatisticsAggregationRequest);

    /**
     * <p>
     * Gets a set of statistics for queues or farms. Before you can call the
     * <code>GetSessionStatisticsAggregation</code> operation, you must first call the
     * <code>StartSessionsStatisticsAggregation</code> operation. Statistics are available for 1 hour after you call the
     * <code>StartSessionsStatisticsAggregation</code> operation.
     * </p>
     * 
     * @param getSessionsStatisticsAggregationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSessionsStatisticsAggregation operation returned by the
     *         service.
     * @sample AWSDeadlineAsyncHandler.GetSessionsStatisticsAggregation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetSessionsStatisticsAggregation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSessionsStatisticsAggregationResult> getSessionsStatisticsAggregationAsync(
            GetSessionsStatisticsAggregationRequest getSessionsStatisticsAggregationRequest,
            com.amazonaws.handlers.AsyncHandler<GetSessionsStatisticsAggregationRequest, GetSessionsStatisticsAggregationResult> asyncHandler);

    /**
     * <p>
     * Gets a step.
     * </p>
     * 
     * @param getStepRequest
     * @return A Java Future containing the result of the GetStep operation returned by the service.
     * @sample AWSDeadlineAsync.GetStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetStep" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStepResult> getStepAsync(GetStepRequest getStepRequest);

    /**
     * <p>
     * Gets a step.
     * </p>
     * 
     * @param getStepRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStep operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.GetStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetStep" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStepResult> getStepAsync(GetStepRequest getStepRequest,
            com.amazonaws.handlers.AsyncHandler<GetStepRequest, GetStepResult> asyncHandler);

    /**
     * <p>
     * Gets a storage profile.
     * </p>
     * 
     * @param getStorageProfileRequest
     * @return A Java Future containing the result of the GetStorageProfile operation returned by the service.
     * @sample AWSDeadlineAsync.GetStorageProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetStorageProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStorageProfileResult> getStorageProfileAsync(GetStorageProfileRequest getStorageProfileRequest);

    /**
     * <p>
     * Gets a storage profile.
     * </p>
     * 
     * @param getStorageProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStorageProfile operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.GetStorageProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetStorageProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStorageProfileResult> getStorageProfileAsync(GetStorageProfileRequest getStorageProfileRequest,
            com.amazonaws.handlers.AsyncHandler<GetStorageProfileRequest, GetStorageProfileResult> asyncHandler);

    /**
     * <p>
     * Gets a storage profile for a queue.
     * </p>
     * 
     * @param getStorageProfileForQueueRequest
     * @return A Java Future containing the result of the GetStorageProfileForQueue operation returned by the service.
     * @sample AWSDeadlineAsync.GetStorageProfileForQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetStorageProfileForQueue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetStorageProfileForQueueResult> getStorageProfileForQueueAsync(
            GetStorageProfileForQueueRequest getStorageProfileForQueueRequest);

    /**
     * <p>
     * Gets a storage profile for a queue.
     * </p>
     * 
     * @param getStorageProfileForQueueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStorageProfileForQueue operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.GetStorageProfileForQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetStorageProfileForQueue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetStorageProfileForQueueResult> getStorageProfileForQueueAsync(
            GetStorageProfileForQueueRequest getStorageProfileForQueueRequest,
            com.amazonaws.handlers.AsyncHandler<GetStorageProfileForQueueRequest, GetStorageProfileForQueueResult> asyncHandler);

    /**
     * <p>
     * Gets a task.
     * </p>
     * 
     * @param getTaskRequest
     * @return A Java Future containing the result of the GetTask operation returned by the service.
     * @sample AWSDeadlineAsync.GetTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTaskResult> getTaskAsync(GetTaskRequest getTaskRequest);

    /**
     * <p>
     * Gets a task.
     * </p>
     * 
     * @param getTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTask operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.GetTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTaskResult> getTaskAsync(GetTaskRequest getTaskRequest,
            com.amazonaws.handlers.AsyncHandler<GetTaskRequest, GetTaskResult> asyncHandler);

    /**
     * <p>
     * Gets a worker.
     * </p>
     * 
     * @param getWorkerRequest
     * @return A Java Future containing the result of the GetWorker operation returned by the service.
     * @sample AWSDeadlineAsync.GetWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetWorker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWorkerResult> getWorkerAsync(GetWorkerRequest getWorkerRequest);

    /**
     * <p>
     * Gets a worker.
     * </p>
     * 
     * @param getWorkerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWorker operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.GetWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetWorker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWorkerResult> getWorkerAsync(GetWorkerRequest getWorkerRequest,
            com.amazonaws.handlers.AsyncHandler<GetWorkerRequest, GetWorkerResult> asyncHandler);

    /**
     * <p>
     * A list of the available metered products.
     * </p>
     * 
     * @param listAvailableMeteredProductsRequest
     * @return A Java Future containing the result of the ListAvailableMeteredProducts operation returned by the
     *         service.
     * @sample AWSDeadlineAsync.ListAvailableMeteredProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListAvailableMeteredProducts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAvailableMeteredProductsResult> listAvailableMeteredProductsAsync(
            ListAvailableMeteredProductsRequest listAvailableMeteredProductsRequest);

    /**
     * <p>
     * A list of the available metered products.
     * </p>
     * 
     * @param listAvailableMeteredProductsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAvailableMeteredProducts operation returned by the
     *         service.
     * @sample AWSDeadlineAsyncHandler.ListAvailableMeteredProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListAvailableMeteredProducts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAvailableMeteredProductsResult> listAvailableMeteredProductsAsync(
            ListAvailableMeteredProductsRequest listAvailableMeteredProductsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAvailableMeteredProductsRequest, ListAvailableMeteredProductsResult> asyncHandler);

    /**
     * <p>
     * A list of budgets in a farm.
     * </p>
     * 
     * @param listBudgetsRequest
     * @return A Java Future containing the result of the ListBudgets operation returned by the service.
     * @sample AWSDeadlineAsync.ListBudgets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListBudgets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBudgetsResult> listBudgetsAsync(ListBudgetsRequest listBudgetsRequest);

    /**
     * <p>
     * A list of budgets in a farm.
     * </p>
     * 
     * @param listBudgetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBudgets operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.ListBudgets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListBudgets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBudgetsResult> listBudgetsAsync(ListBudgetsRequest listBudgetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBudgetsRequest, ListBudgetsResult> asyncHandler);

    /**
     * <p>
     * Lists the members of a farm.
     * </p>
     * 
     * @param listFarmMembersRequest
     * @return A Java Future containing the result of the ListFarmMembers operation returned by the service.
     * @sample AWSDeadlineAsync.ListFarmMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListFarmMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFarmMembersResult> listFarmMembersAsync(ListFarmMembersRequest listFarmMembersRequest);

    /**
     * <p>
     * Lists the members of a farm.
     * </p>
     * 
     * @param listFarmMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFarmMembers operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.ListFarmMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListFarmMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFarmMembersResult> listFarmMembersAsync(ListFarmMembersRequest listFarmMembersRequest,
            com.amazonaws.handlers.AsyncHandler<ListFarmMembersRequest, ListFarmMembersResult> asyncHandler);

    /**
     * <p>
     * Lists farms.
     * </p>
     * 
     * @param listFarmsRequest
     * @return A Java Future containing the result of the ListFarms operation returned by the service.
     * @sample AWSDeadlineAsync.ListFarms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListFarms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFarmsResult> listFarmsAsync(ListFarmsRequest listFarmsRequest);

    /**
     * <p>
     * Lists farms.
     * </p>
     * 
     * @param listFarmsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFarms operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.ListFarms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListFarms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFarmsResult> listFarmsAsync(ListFarmsRequest listFarmsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFarmsRequest, ListFarmsResult> asyncHandler);

    /**
     * <p>
     * Lists fleet members.
     * </p>
     * 
     * @param listFleetMembersRequest
     * @return A Java Future containing the result of the ListFleetMembers operation returned by the service.
     * @sample AWSDeadlineAsync.ListFleetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListFleetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFleetMembersResult> listFleetMembersAsync(ListFleetMembersRequest listFleetMembersRequest);

    /**
     * <p>
     * Lists fleet members.
     * </p>
     * 
     * @param listFleetMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFleetMembers operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.ListFleetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListFleetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFleetMembersResult> listFleetMembersAsync(ListFleetMembersRequest listFleetMembersRequest,
            com.amazonaws.handlers.AsyncHandler<ListFleetMembersRequest, ListFleetMembersResult> asyncHandler);

    /**
     * <p>
     * Lists fleets.
     * </p>
     * 
     * @param listFleetsRequest
     * @return A Java Future containing the result of the ListFleets operation returned by the service.
     * @sample AWSDeadlineAsync.ListFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListFleets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(ListFleetsRequest listFleetsRequest);

    /**
     * <p>
     * Lists fleets.
     * </p>
     * 
     * @param listFleetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFleets operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.ListFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListFleets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(ListFleetsRequest listFleetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFleetsRequest, ListFleetsResult> asyncHandler);

    /**
     * <p>
     * Lists members on a job.
     * </p>
     * 
     * @param listJobMembersRequest
     * @return A Java Future containing the result of the ListJobMembers operation returned by the service.
     * @sample AWSDeadlineAsync.ListJobMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListJobMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobMembersResult> listJobMembersAsync(ListJobMembersRequest listJobMembersRequest);

    /**
     * <p>
     * Lists members on a job.
     * </p>
     * 
     * @param listJobMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJobMembers operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.ListJobMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListJobMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobMembersResult> listJobMembersAsync(ListJobMembersRequest listJobMembersRequest,
            com.amazonaws.handlers.AsyncHandler<ListJobMembersRequest, ListJobMembersResult> asyncHandler);

    /**
     * <p>
     * Lists jobs.
     * </p>
     * 
     * @param listJobsRequest
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AWSDeadlineAsync.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * Lists jobs.
     * </p>
     * 
     * @param listJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler);

    /**
     * <p>
     * Lists license endpoints.
     * </p>
     * 
     * @param listLicenseEndpointsRequest
     * @return A Java Future containing the result of the ListLicenseEndpoints operation returned by the service.
     * @sample AWSDeadlineAsync.ListLicenseEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListLicenseEndpoints" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListLicenseEndpointsResult> listLicenseEndpointsAsync(ListLicenseEndpointsRequest listLicenseEndpointsRequest);

    /**
     * <p>
     * Lists license endpoints.
     * </p>
     * 
     * @param listLicenseEndpointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLicenseEndpoints operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.ListLicenseEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListLicenseEndpoints" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListLicenseEndpointsResult> listLicenseEndpointsAsync(ListLicenseEndpointsRequest listLicenseEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLicenseEndpointsRequest, ListLicenseEndpointsResult> asyncHandler);

    /**
     * <p>
     * Lists metered products.
     * </p>
     * 
     * @param listMeteredProductsRequest
     * @return A Java Future containing the result of the ListMeteredProducts operation returned by the service.
     * @sample AWSDeadlineAsync.ListMeteredProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListMeteredProducts" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListMeteredProductsResult> listMeteredProductsAsync(ListMeteredProductsRequest listMeteredProductsRequest);

    /**
     * <p>
     * Lists metered products.
     * </p>
     * 
     * @param listMeteredProductsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMeteredProducts operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.ListMeteredProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListMeteredProducts" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListMeteredProductsResult> listMeteredProductsAsync(ListMeteredProductsRequest listMeteredProductsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMeteredProductsRequest, ListMeteredProductsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of your monitors in Deadline Cloud.
     * </p>
     * 
     * @param listMonitorsRequest
     * @return A Java Future containing the result of the ListMonitors operation returned by the service.
     * @sample AWSDeadlineAsync.ListMonitors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListMonitors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMonitorsResult> listMonitorsAsync(ListMonitorsRequest listMonitorsRequest);

    /**
     * <p>
     * Gets a list of your monitors in Deadline Cloud.
     * </p>
     * 
     * @param listMonitorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMonitors operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.ListMonitors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListMonitors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMonitorsResult> listMonitorsAsync(ListMonitorsRequest listMonitorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMonitorsRequest, ListMonitorsResult> asyncHandler);

    /**
     * <p>
     * Lists queue environments.
     * </p>
     * 
     * @param listQueueEnvironmentsRequest
     * @return A Java Future containing the result of the ListQueueEnvironments operation returned by the service.
     * @sample AWSDeadlineAsync.ListQueueEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListQueueEnvironments" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListQueueEnvironmentsResult> listQueueEnvironmentsAsync(ListQueueEnvironmentsRequest listQueueEnvironmentsRequest);

    /**
     * <p>
     * Lists queue environments.
     * </p>
     * 
     * @param listQueueEnvironmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListQueueEnvironments operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.ListQueueEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListQueueEnvironments" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListQueueEnvironmentsResult> listQueueEnvironmentsAsync(ListQueueEnvironmentsRequest listQueueEnvironmentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListQueueEnvironmentsRequest, ListQueueEnvironmentsResult> asyncHandler);

    /**
     * <p>
     * Lists queue-fleet associations.
     * </p>
     * 
     * @param listQueueFleetAssociationsRequest
     * @return A Java Future containing the result of the ListQueueFleetAssociations operation returned by the service.
     * @sample AWSDeadlineAsync.ListQueueFleetAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListQueueFleetAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListQueueFleetAssociationsResult> listQueueFleetAssociationsAsync(
            ListQueueFleetAssociationsRequest listQueueFleetAssociationsRequest);

    /**
     * <p>
     * Lists queue-fleet associations.
     * </p>
     * 
     * @param listQueueFleetAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListQueueFleetAssociations operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.ListQueueFleetAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListQueueFleetAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListQueueFleetAssociationsResult> listQueueFleetAssociationsAsync(
            ListQueueFleetAssociationsRequest listQueueFleetAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListQueueFleetAssociationsRequest, ListQueueFleetAssociationsResult> asyncHandler);

    /**
     * <p>
     * Lists the members in a queue.
     * </p>
     * 
     * @param listQueueMembersRequest
     * @return A Java Future containing the result of the ListQueueMembers operation returned by the service.
     * @sample AWSDeadlineAsync.ListQueueMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListQueueMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListQueueMembersResult> listQueueMembersAsync(ListQueueMembersRequest listQueueMembersRequest);

    /**
     * <p>
     * Lists the members in a queue.
     * </p>
     * 
     * @param listQueueMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListQueueMembers operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.ListQueueMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListQueueMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListQueueMembersResult> listQueueMembersAsync(ListQueueMembersRequest listQueueMembersRequest,
            com.amazonaws.handlers.AsyncHandler<ListQueueMembersRequest, ListQueueMembersResult> asyncHandler);

    /**
     * <p>
     * Lists queues.
     * </p>
     * 
     * @param listQueuesRequest
     * @return A Java Future containing the result of the ListQueues operation returned by the service.
     * @sample AWSDeadlineAsync.ListQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListQueues" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(ListQueuesRequest listQueuesRequest);

    /**
     * <p>
     * Lists queues.
     * </p>
     * 
     * @param listQueuesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListQueues operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.ListQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListQueues" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(ListQueuesRequest listQueuesRequest,
            com.amazonaws.handlers.AsyncHandler<ListQueuesRequest, ListQueuesResult> asyncHandler);

    /**
     * <p>
     * Lists session actions.
     * </p>
     * 
     * @param listSessionActionsRequest
     * @return A Java Future containing the result of the ListSessionActions operation returned by the service.
     * @sample AWSDeadlineAsync.ListSessionActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListSessionActions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSessionActionsResult> listSessionActionsAsync(ListSessionActionsRequest listSessionActionsRequest);

    /**
     * <p>
     * Lists session actions.
     * </p>
     * 
     * @param listSessionActionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSessionActions operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.ListSessionActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListSessionActions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSessionActionsResult> listSessionActionsAsync(ListSessionActionsRequest listSessionActionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSessionActionsRequest, ListSessionActionsResult> asyncHandler);

    /**
     * <p>
     * Lists sessions.
     * </p>
     * 
     * @param listSessionsRequest
     * @return A Java Future containing the result of the ListSessions operation returned by the service.
     * @sample AWSDeadlineAsync.ListSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListSessions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSessionsResult> listSessionsAsync(ListSessionsRequest listSessionsRequest);

    /**
     * <p>
     * Lists sessions.
     * </p>
     * 
     * @param listSessionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSessions operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.ListSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListSessions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSessionsResult> listSessionsAsync(ListSessionsRequest listSessionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSessionsRequest, ListSessionsResult> asyncHandler);

    /**
     * <p>
     * Lists sessions for a worker.
     * </p>
     * 
     * @param listSessionsForWorkerRequest
     * @return A Java Future containing the result of the ListSessionsForWorker operation returned by the service.
     * @sample AWSDeadlineAsync.ListSessionsForWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListSessionsForWorker" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSessionsForWorkerResult> listSessionsForWorkerAsync(ListSessionsForWorkerRequest listSessionsForWorkerRequest);

    /**
     * <p>
     * Lists sessions for a worker.
     * </p>
     * 
     * @param listSessionsForWorkerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSessionsForWorker operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.ListSessionsForWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListSessionsForWorker" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSessionsForWorkerResult> listSessionsForWorkerAsync(ListSessionsForWorkerRequest listSessionsForWorkerRequest,
            com.amazonaws.handlers.AsyncHandler<ListSessionsForWorkerRequest, ListSessionsForWorkerResult> asyncHandler);

    /**
     * <p>
     * Lists step consumers.
     * </p>
     * 
     * @param listStepConsumersRequest
     * @return A Java Future containing the result of the ListStepConsumers operation returned by the service.
     * @sample AWSDeadlineAsync.ListStepConsumers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListStepConsumers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStepConsumersResult> listStepConsumersAsync(ListStepConsumersRequest listStepConsumersRequest);

    /**
     * <p>
     * Lists step consumers.
     * </p>
     * 
     * @param listStepConsumersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStepConsumers operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.ListStepConsumers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListStepConsumers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStepConsumersResult> listStepConsumersAsync(ListStepConsumersRequest listStepConsumersRequest,
            com.amazonaws.handlers.AsyncHandler<ListStepConsumersRequest, ListStepConsumersResult> asyncHandler);

    /**
     * <p>
     * Lists the dependencies for a step.
     * </p>
     * 
     * @param listStepDependenciesRequest
     * @return A Java Future containing the result of the ListStepDependencies operation returned by the service.
     * @sample AWSDeadlineAsync.ListStepDependencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListStepDependencies" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListStepDependenciesResult> listStepDependenciesAsync(ListStepDependenciesRequest listStepDependenciesRequest);

    /**
     * <p>
     * Lists the dependencies for a step.
     * </p>
     * 
     * @param listStepDependenciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStepDependencies operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.ListStepDependencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListStepDependencies" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListStepDependenciesResult> listStepDependenciesAsync(ListStepDependenciesRequest listStepDependenciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListStepDependenciesRequest, ListStepDependenciesResult> asyncHandler);

    /**
     * <p>
     * Lists steps for a job.
     * </p>
     * 
     * @param listStepsRequest
     * @return A Java Future containing the result of the ListSteps operation returned by the service.
     * @sample AWSDeadlineAsync.ListSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListSteps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStepsResult> listStepsAsync(ListStepsRequest listStepsRequest);

    /**
     * <p>
     * Lists steps for a job.
     * </p>
     * 
     * @param listStepsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSteps operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.ListSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListSteps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStepsResult> listStepsAsync(ListStepsRequest listStepsRequest,
            com.amazonaws.handlers.AsyncHandler<ListStepsRequest, ListStepsResult> asyncHandler);

    /**
     * <p>
     * Lists storage profiles.
     * </p>
     * 
     * @param listStorageProfilesRequest
     * @return A Java Future containing the result of the ListStorageProfiles operation returned by the service.
     * @sample AWSDeadlineAsync.ListStorageProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListStorageProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListStorageProfilesResult> listStorageProfilesAsync(ListStorageProfilesRequest listStorageProfilesRequest);

    /**
     * <p>
     * Lists storage profiles.
     * </p>
     * 
     * @param listStorageProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStorageProfiles operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.ListStorageProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListStorageProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListStorageProfilesResult> listStorageProfilesAsync(ListStorageProfilesRequest listStorageProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<ListStorageProfilesRequest, ListStorageProfilesResult> asyncHandler);

    /**
     * <p>
     * Lists storage profiles for a queue.
     * </p>
     * 
     * @param listStorageProfilesForQueueRequest
     * @return A Java Future containing the result of the ListStorageProfilesForQueue operation returned by the service.
     * @sample AWSDeadlineAsync.ListStorageProfilesForQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListStorageProfilesForQueue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListStorageProfilesForQueueResult> listStorageProfilesForQueueAsync(
            ListStorageProfilesForQueueRequest listStorageProfilesForQueueRequest);

    /**
     * <p>
     * Lists storage profiles for a queue.
     * </p>
     * 
     * @param listStorageProfilesForQueueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStorageProfilesForQueue operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.ListStorageProfilesForQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListStorageProfilesForQueue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListStorageProfilesForQueueResult> listStorageProfilesForQueueAsync(
            ListStorageProfilesForQueueRequest listStorageProfilesForQueueRequest,
            com.amazonaws.handlers.AsyncHandler<ListStorageProfilesForQueueRequest, ListStorageProfilesForQueueResult> asyncHandler);

    /**
     * <p>
     * Lists tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSDeadlineAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists tasks for a job.
     * </p>
     * 
     * @param listTasksRequest
     * @return A Java Future containing the result of the ListTasks operation returned by the service.
     * @sample AWSDeadlineAsync.ListTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListTasks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTasksResult> listTasksAsync(ListTasksRequest listTasksRequest);

    /**
     * <p>
     * Lists tasks for a job.
     * </p>
     * 
     * @param listTasksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTasks operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.ListTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListTasks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTasksResult> listTasksAsync(ListTasksRequest listTasksRequest,
            com.amazonaws.handlers.AsyncHandler<ListTasksRequest, ListTasksResult> asyncHandler);

    /**
     * <p>
     * Lists workers.
     * </p>
     * 
     * @param listWorkersRequest
     * @return A Java Future containing the result of the ListWorkers operation returned by the service.
     * @sample AWSDeadlineAsync.ListWorkers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListWorkers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWorkersResult> listWorkersAsync(ListWorkersRequest listWorkersRequest);

    /**
     * <p>
     * Lists workers.
     * </p>
     * 
     * @param listWorkersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkers operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.ListWorkers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListWorkers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWorkersResult> listWorkersAsync(ListWorkersRequest listWorkersRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkersRequest, ListWorkersResult> asyncHandler);

    /**
     * <p>
     * Adds a metered product.
     * </p>
     * 
     * @param putMeteredProductRequest
     * @return A Java Future containing the result of the PutMeteredProduct operation returned by the service.
     * @sample AWSDeadlineAsync.PutMeteredProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/PutMeteredProduct" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutMeteredProductResult> putMeteredProductAsync(PutMeteredProductRequest putMeteredProductRequest);

    /**
     * <p>
     * Adds a metered product.
     * </p>
     * 
     * @param putMeteredProductRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutMeteredProduct operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.PutMeteredProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/PutMeteredProduct" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutMeteredProductResult> putMeteredProductAsync(PutMeteredProductRequest putMeteredProductRequest,
            com.amazonaws.handlers.AsyncHandler<PutMeteredProductRequest, PutMeteredProductResult> asyncHandler);

    /**
     * <p>
     * Searches for jobs.
     * </p>
     * 
     * @param searchJobsRequest
     * @return A Java Future containing the result of the SearchJobs operation returned by the service.
     * @sample AWSDeadlineAsync.SearchJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SearchJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchJobsResult> searchJobsAsync(SearchJobsRequest searchJobsRequest);

    /**
     * <p>
     * Searches for jobs.
     * </p>
     * 
     * @param searchJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchJobs operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.SearchJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SearchJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchJobsResult> searchJobsAsync(SearchJobsRequest searchJobsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchJobsRequest, SearchJobsResult> asyncHandler);

    /**
     * <p>
     * Searches for steps.
     * </p>
     * 
     * @param searchStepsRequest
     * @return A Java Future containing the result of the SearchSteps operation returned by the service.
     * @sample AWSDeadlineAsync.SearchSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SearchSteps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchStepsResult> searchStepsAsync(SearchStepsRequest searchStepsRequest);

    /**
     * <p>
     * Searches for steps.
     * </p>
     * 
     * @param searchStepsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchSteps operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.SearchSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SearchSteps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchStepsResult> searchStepsAsync(SearchStepsRequest searchStepsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchStepsRequest, SearchStepsResult> asyncHandler);

    /**
     * <p>
     * Searches for tasks.
     * </p>
     * 
     * @param searchTasksRequest
     * @return A Java Future containing the result of the SearchTasks operation returned by the service.
     * @sample AWSDeadlineAsync.SearchTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SearchTasks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchTasksResult> searchTasksAsync(SearchTasksRequest searchTasksRequest);

    /**
     * <p>
     * Searches for tasks.
     * </p>
     * 
     * @param searchTasksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchTasks operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.SearchTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SearchTasks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchTasksResult> searchTasksAsync(SearchTasksRequest searchTasksRequest,
            com.amazonaws.handlers.AsyncHandler<SearchTasksRequest, SearchTasksResult> asyncHandler);

    /**
     * <p>
     * Searches for workers.
     * </p>
     * 
     * @param searchWorkersRequest
     * @return A Java Future containing the result of the SearchWorkers operation returned by the service.
     * @sample AWSDeadlineAsync.SearchWorkers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SearchWorkers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchWorkersResult> searchWorkersAsync(SearchWorkersRequest searchWorkersRequest);

    /**
     * <p>
     * Searches for workers.
     * </p>
     * 
     * @param searchWorkersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchWorkers operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.SearchWorkers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SearchWorkers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchWorkersResult> searchWorkersAsync(SearchWorkersRequest searchWorkersRequest,
            com.amazonaws.handlers.AsyncHandler<SearchWorkersRequest, SearchWorkersResult> asyncHandler);

    /**
     * <p>
     * Starts an asynchronous request for getting aggregated statistics about queues and farms. Get the statistics using
     * the <code>GetSessionsStatisticsAggregation</code> operation. Statistics are available for 1 hour after you call
     * the <code>StartSessionsStatisticsAggregation</code> operation.
     * </p>
     * 
     * @param startSessionsStatisticsAggregationRequest
     * @return A Java Future containing the result of the StartSessionsStatisticsAggregation operation returned by the
     *         service.
     * @sample AWSDeadlineAsync.StartSessionsStatisticsAggregation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/StartSessionsStatisticsAggregation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartSessionsStatisticsAggregationResult> startSessionsStatisticsAggregationAsync(
            StartSessionsStatisticsAggregationRequest startSessionsStatisticsAggregationRequest);

    /**
     * <p>
     * Starts an asynchronous request for getting aggregated statistics about queues and farms. Get the statistics using
     * the <code>GetSessionsStatisticsAggregation</code> operation. Statistics are available for 1 hour after you call
     * the <code>StartSessionsStatisticsAggregation</code> operation.
     * </p>
     * 
     * @param startSessionsStatisticsAggregationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartSessionsStatisticsAggregation operation returned by the
     *         service.
     * @sample AWSDeadlineAsyncHandler.StartSessionsStatisticsAggregation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/StartSessionsStatisticsAggregation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartSessionsStatisticsAggregationResult> startSessionsStatisticsAggregationAsync(
            StartSessionsStatisticsAggregationRequest startSessionsStatisticsAggregationRequest,
            com.amazonaws.handlers.AsyncHandler<StartSessionsStatisticsAggregationRequest, StartSessionsStatisticsAggregationResult> asyncHandler);

    /**
     * <p>
     * Tags a resource using the resource's ARN and desired tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSDeadlineAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tags a resource using the resource's ARN and desired tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag from a resource using the resource's ARN and tag to remove.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSDeadlineAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag from a resource using the resource's ARN and tag to remove.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a budget that sets spending thresholds for rendering activity.
     * </p>
     * 
     * @param updateBudgetRequest
     * @return A Java Future containing the result of the UpdateBudget operation returned by the service.
     * @sample AWSDeadlineAsync.UpdateBudget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateBudget" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateBudgetResult> updateBudgetAsync(UpdateBudgetRequest updateBudgetRequest);

    /**
     * <p>
     * Updates a budget that sets spending thresholds for rendering activity.
     * </p>
     * 
     * @param updateBudgetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBudget operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.UpdateBudget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateBudget" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateBudgetResult> updateBudgetAsync(UpdateBudgetRequest updateBudgetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBudgetRequest, UpdateBudgetResult> asyncHandler);

    /**
     * <p>
     * Updates a farm.
     * </p>
     * 
     * @param updateFarmRequest
     * @return A Java Future containing the result of the UpdateFarm operation returned by the service.
     * @sample AWSDeadlineAsync.UpdateFarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateFarm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFarmResult> updateFarmAsync(UpdateFarmRequest updateFarmRequest);

    /**
     * <p>
     * Updates a farm.
     * </p>
     * 
     * @param updateFarmRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFarm operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.UpdateFarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateFarm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFarmResult> updateFarmAsync(UpdateFarmRequest updateFarmRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFarmRequest, UpdateFarmResult> asyncHandler);

    /**
     * <p>
     * Updates a fleet.
     * </p>
     * 
     * @param updateFleetRequest
     * @return A Java Future containing the result of the UpdateFleet operation returned by the service.
     * @sample AWSDeadlineAsync.UpdateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFleetResult> updateFleetAsync(UpdateFleetRequest updateFleetRequest);

    /**
     * <p>
     * Updates a fleet.
     * </p>
     * 
     * @param updateFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFleet operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.UpdateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFleetResult> updateFleetAsync(UpdateFleetRequest updateFleetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFleetRequest, UpdateFleetResult> asyncHandler);

    /**
     * <p>
     * Updates a job.
     * </p>
     * 
     * @param updateJobRequest
     * @return A Java Future containing the result of the UpdateJob operation returned by the service.
     * @sample AWSDeadlineAsync.UpdateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateJobResult> updateJobAsync(UpdateJobRequest updateJobRequest);

    /**
     * <p>
     * Updates a job.
     * </p>
     * 
     * @param updateJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateJob operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.UpdateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateJobResult> updateJobAsync(UpdateJobRequest updateJobRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateJobRequest, UpdateJobResult> asyncHandler);

    /**
     * <p>
     * Modifies the settings for a Deadline Cloud monitor. You can modify one or all of the settings when you call
     * <code>UpdateMonitor</code>.
     * </p>
     * 
     * @param updateMonitorRequest
     * @return A Java Future containing the result of the UpdateMonitor operation returned by the service.
     * @sample AWSDeadlineAsync.UpdateMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateMonitorResult> updateMonitorAsync(UpdateMonitorRequest updateMonitorRequest);

    /**
     * <p>
     * Modifies the settings for a Deadline Cloud monitor. You can modify one or all of the settings when you call
     * <code>UpdateMonitor</code>.
     * </p>
     * 
     * @param updateMonitorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMonitor operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.UpdateMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateMonitorResult> updateMonitorAsync(UpdateMonitorRequest updateMonitorRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMonitorRequest, UpdateMonitorResult> asyncHandler);

    /**
     * <p>
     * Updates a queue.
     * </p>
     * 
     * @param updateQueueRequest
     * @return A Java Future containing the result of the UpdateQueue operation returned by the service.
     * @sample AWSDeadlineAsync.UpdateQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateQueueResult> updateQueueAsync(UpdateQueueRequest updateQueueRequest);

    /**
     * <p>
     * Updates a queue.
     * </p>
     * 
     * @param updateQueueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateQueue operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.UpdateQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateQueueResult> updateQueueAsync(UpdateQueueRequest updateQueueRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateQueueRequest, UpdateQueueResult> asyncHandler);

    /**
     * <p>
     * Updates the queue environment.
     * </p>
     * 
     * @param updateQueueEnvironmentRequest
     * @return A Java Future containing the result of the UpdateQueueEnvironment operation returned by the service.
     * @sample AWSDeadlineAsync.UpdateQueueEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateQueueEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateQueueEnvironmentResult> updateQueueEnvironmentAsync(UpdateQueueEnvironmentRequest updateQueueEnvironmentRequest);

    /**
     * <p>
     * Updates the queue environment.
     * </p>
     * 
     * @param updateQueueEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateQueueEnvironment operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.UpdateQueueEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateQueueEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateQueueEnvironmentResult> updateQueueEnvironmentAsync(UpdateQueueEnvironmentRequest updateQueueEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateQueueEnvironmentRequest, UpdateQueueEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Updates a queue-fleet association.
     * </p>
     * 
     * @param updateQueueFleetAssociationRequest
     * @return A Java Future containing the result of the UpdateQueueFleetAssociation operation returned by the service.
     * @sample AWSDeadlineAsync.UpdateQueueFleetAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateQueueFleetAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateQueueFleetAssociationResult> updateQueueFleetAssociationAsync(
            UpdateQueueFleetAssociationRequest updateQueueFleetAssociationRequest);

    /**
     * <p>
     * Updates a queue-fleet association.
     * </p>
     * 
     * @param updateQueueFleetAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateQueueFleetAssociation operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.UpdateQueueFleetAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateQueueFleetAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateQueueFleetAssociationResult> updateQueueFleetAssociationAsync(
            UpdateQueueFleetAssociationRequest updateQueueFleetAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateQueueFleetAssociationRequest, UpdateQueueFleetAssociationResult> asyncHandler);

    /**
     * <p>
     * Updates a session.
     * </p>
     * 
     * @param updateSessionRequest
     * @return A Java Future containing the result of the UpdateSession operation returned by the service.
     * @sample AWSDeadlineAsync.UpdateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSessionResult> updateSessionAsync(UpdateSessionRequest updateSessionRequest);

    /**
     * <p>
     * Updates a session.
     * </p>
     * 
     * @param updateSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSession operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.UpdateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSessionResult> updateSessionAsync(UpdateSessionRequest updateSessionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSessionRequest, UpdateSessionResult> asyncHandler);

    /**
     * <p>
     * Updates a step.
     * </p>
     * 
     * @param updateStepRequest
     * @return A Java Future containing the result of the UpdateStep operation returned by the service.
     * @sample AWSDeadlineAsync.UpdateStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateStep" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateStepResult> updateStepAsync(UpdateStepRequest updateStepRequest);

    /**
     * <p>
     * Updates a step.
     * </p>
     * 
     * @param updateStepRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStep operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.UpdateStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateStep" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateStepResult> updateStepAsync(UpdateStepRequest updateStepRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStepRequest, UpdateStepResult> asyncHandler);

    /**
     * <p>
     * Updates a storage profile.
     * </p>
     * 
     * @param updateStorageProfileRequest
     * @return A Java Future containing the result of the UpdateStorageProfile operation returned by the service.
     * @sample AWSDeadlineAsync.UpdateStorageProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateStorageProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateStorageProfileResult> updateStorageProfileAsync(UpdateStorageProfileRequest updateStorageProfileRequest);

    /**
     * <p>
     * Updates a storage profile.
     * </p>
     * 
     * @param updateStorageProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStorageProfile operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.UpdateStorageProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateStorageProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateStorageProfileResult> updateStorageProfileAsync(UpdateStorageProfileRequest updateStorageProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStorageProfileRequest, UpdateStorageProfileResult> asyncHandler);

    /**
     * <p>
     * Updates a task.
     * </p>
     * 
     * @param updateTaskRequest
     * @return A Java Future containing the result of the UpdateTask operation returned by the service.
     * @sample AWSDeadlineAsync.UpdateTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTaskResult> updateTaskAsync(UpdateTaskRequest updateTaskRequest);

    /**
     * <p>
     * Updates a task.
     * </p>
     * 
     * @param updateTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTask operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.UpdateTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTaskResult> updateTaskAsync(UpdateTaskRequest updateTaskRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTaskRequest, UpdateTaskResult> asyncHandler);

    /**
     * <p>
     * Updates a worker.
     * </p>
     * 
     * @param updateWorkerRequest
     * @return A Java Future containing the result of the UpdateWorker operation returned by the service.
     * @sample AWSDeadlineAsync.UpdateWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateWorker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkerResult> updateWorkerAsync(UpdateWorkerRequest updateWorkerRequest);

    /**
     * <p>
     * Updates a worker.
     * </p>
     * 
     * @param updateWorkerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWorker operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.UpdateWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateWorker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkerResult> updateWorkerAsync(UpdateWorkerRequest updateWorkerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkerRequest, UpdateWorkerResult> asyncHandler);

    /**
     * <p>
     * Updates the schedule for a worker.
     * </p>
     * 
     * @param updateWorkerScheduleRequest
     * @return A Java Future containing the result of the UpdateWorkerSchedule operation returned by the service.
     * @sample AWSDeadlineAsync.UpdateWorkerSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateWorkerSchedule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkerScheduleResult> updateWorkerScheduleAsync(UpdateWorkerScheduleRequest updateWorkerScheduleRequest);

    /**
     * <p>
     * Updates the schedule for a worker.
     * </p>
     * 
     * @param updateWorkerScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWorkerSchedule operation returned by the service.
     * @sample AWSDeadlineAsyncHandler.UpdateWorkerSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateWorkerSchedule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkerScheduleResult> updateWorkerScheduleAsync(UpdateWorkerScheduleRequest updateWorkerScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkerScheduleRequest, UpdateWorkerScheduleResult> asyncHandler);

}
