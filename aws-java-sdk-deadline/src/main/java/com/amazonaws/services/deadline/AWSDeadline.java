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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.deadline.model.*;
import com.amazonaws.services.deadline.waiters.AWSDeadlineWaiters;

/**
 * Interface for accessing AWSDeadlineCloud.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.deadline.AbstractAWSDeadline} instead.
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
public interface AWSDeadline {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "deadline";

    /**
     * <p>
     * Assigns a farm membership level to a member.
     * </p>
     * 
     * @param associateMemberToFarmRequest
     * @return Result of the AssociateMemberToFarm operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.AssociateMemberToFarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssociateMemberToFarm" target="_top">AWS
     *      API Documentation</a>
     */
    AssociateMemberToFarmResult associateMemberToFarm(AssociateMemberToFarmRequest associateMemberToFarmRequest);

    /**
     * <p>
     * Assigns a fleet membership level to a member.
     * </p>
     * 
     * @param associateMemberToFleetRequest
     * @return Result of the AssociateMemberToFleet operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.AssociateMemberToFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssociateMemberToFleet"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateMemberToFleetResult associateMemberToFleet(AssociateMemberToFleetRequest associateMemberToFleetRequest);

    /**
     * <p>
     * Assigns a job membership level to a member
     * </p>
     * 
     * @param associateMemberToJobRequest
     * @return Result of the AssociateMemberToJob operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.AssociateMemberToJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssociateMemberToJob" target="_top">AWS
     *      API Documentation</a>
     */
    AssociateMemberToJobResult associateMemberToJob(AssociateMemberToJobRequest associateMemberToJobRequest);

    /**
     * <p>
     * Assigns a queue membership level to a member
     * </p>
     * 
     * @param associateMemberToQueueRequest
     * @return Result of the AssociateMemberToQueue operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.AssociateMemberToQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssociateMemberToQueue"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateMemberToQueueResult associateMemberToQueue(AssociateMemberToQueueRequest associateMemberToQueueRequest);

    /**
     * <p>
     * Get Amazon Web Services credentials from the fleet role. The IAM permissions of the credentials are scoped down
     * to have read-only access.
     * </p>
     * 
     * @param assumeFleetRoleForReadRequest
     * @return Result of the AssumeFleetRoleForRead operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.AssumeFleetRoleForRead
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssumeFleetRoleForRead"
     *      target="_top">AWS API Documentation</a>
     */
    AssumeFleetRoleForReadResult assumeFleetRoleForRead(AssumeFleetRoleForReadRequest assumeFleetRoleForReadRequest);

    /**
     * <p>
     * Get credentials from the fleet role for a worker.
     * </p>
     * 
     * @param assumeFleetRoleForWorkerRequest
     * @return Result of the AssumeFleetRoleForWorker operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.AssumeFleetRoleForWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssumeFleetRoleForWorker"
     *      target="_top">AWS API Documentation</a>
     */
    AssumeFleetRoleForWorkerResult assumeFleetRoleForWorker(AssumeFleetRoleForWorkerRequest assumeFleetRoleForWorkerRequest);

    /**
     * <p>
     * Gets Amazon Web Services credentials from the queue role. The IAM permissions of the credentials are scoped down
     * to have read-only access.
     * </p>
     * 
     * @param assumeQueueRoleForReadRequest
     * @return Result of the AssumeQueueRoleForRead operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.AssumeQueueRoleForRead
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssumeQueueRoleForRead"
     *      target="_top">AWS API Documentation</a>
     */
    AssumeQueueRoleForReadResult assumeQueueRoleForRead(AssumeQueueRoleForReadRequest assumeQueueRoleForReadRequest);

    /**
     * <p>
     * Allows a user to assume a role for a queue.
     * </p>
     * 
     * @param assumeQueueRoleForUserRequest
     * @return Result of the AssumeQueueRoleForUser operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.AssumeQueueRoleForUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssumeQueueRoleForUser"
     *      target="_top">AWS API Documentation</a>
     */
    AssumeQueueRoleForUserResult assumeQueueRoleForUser(AssumeQueueRoleForUserRequest assumeQueueRoleForUserRequest);

    /**
     * <p>
     * Allows a worker to assume a queue role.
     * </p>
     * 
     * @param assumeQueueRoleForWorkerRequest
     * @return Result of the AssumeQueueRoleForWorker operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.AssumeQueueRoleForWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssumeQueueRoleForWorker"
     *      target="_top">AWS API Documentation</a>
     */
    AssumeQueueRoleForWorkerResult assumeQueueRoleForWorker(AssumeQueueRoleForWorkerRequest assumeQueueRoleForWorkerRequest);

    /**
     * <p>
     * Get batched job details for a worker.
     * </p>
     * 
     * @param batchGetJobEntityRequest
     * @return Result of the BatchGetJobEntity operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.BatchGetJobEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/BatchGetJobEntity" target="_top">AWS API
     *      Documentation</a>
     */
    BatchGetJobEntityResult batchGetJobEntity(BatchGetJobEntityRequest batchGetJobEntityRequest);

    /**
     * <p>
     * Copies a job template to an Amazon S3 bucket.
     * </p>
     * 
     * @param copyJobTemplateRequest
     * @return Result of the CopyJobTemplate operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.CopyJobTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CopyJobTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    CopyJobTemplateResult copyJobTemplate(CopyJobTemplateRequest copyJobTemplateRequest);

    /**
     * <p>
     * Creates a budget to set spending thresholds for your rendering activity.
     * </p>
     * 
     * @param createBudgetRequest
     * @return Result of the CreateBudget operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.CreateBudget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateBudget" target="_top">AWS API
     *      Documentation</a>
     */
    CreateBudgetResult createBudget(CreateBudgetRequest createBudgetRequest);

    /**
     * <p>
     * Creates a farm to allow space for queues and fleets. Farms are the space where the components of your renders
     * gather and are pieced together in the cloud. Farms contain budgets and allow you to enforce permissions. Deadline
     * Cloud farms are a useful container for large projects.
     * </p>
     * 
     * @param createFarmRequest
     * @return Result of the CreateFarm operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.CreateFarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateFarm" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFarmResult createFarm(CreateFarmRequest createFarmRequest);

    /**
     * <p>
     * Creates a fleet. Fleets gather information relating to compute, or capacity, for renders within your farms. You
     * can choose to manage your own capacity or opt to have fleets fully managed by Deadline Cloud.
     * </p>
     * 
     * @param createFleetRequest
     * @return Result of the CreateFleet operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFleetResult createFleet(CreateFleetRequest createFleetRequest);

    /**
     * <p>
     * Creates a job. A job is a render submission submitted by a user. It contains specific job properties outlined as
     * steps and tasks.
     * </p>
     * 
     * @param createJobRequest
     * @return Result of the CreateJob operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    CreateJobResult createJob(CreateJobRequest createJobRequest);

    /**
     * <p>
     * Creates a license endpoint to integrate your various licensed software used for rendering on Deadline Cloud.
     * </p>
     * 
     * @param createLicenseEndpointRequest
     * @return Result of the CreateLicenseEndpoint operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.CreateLicenseEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateLicenseEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    CreateLicenseEndpointResult createLicenseEndpoint(CreateLicenseEndpointRequest createLicenseEndpointRequest);

    /**
     * <p>
     * Creates an Amazon Web Services Deadline Cloud monitor that you can use to view your farms, queues, and fleets.
     * After you submit a job, you can track the progress of the tasks and steps that make up the job, and then download
     * the job's results.
     * </p>
     * 
     * @param createMonitorRequest
     * @return Result of the CreateMonitor operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.CreateMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    CreateMonitorResult createMonitor(CreateMonitorRequest createMonitorRequest);

    /**
     * <p>
     * Creates a queue to coordinate the order in which jobs run on a farm. A queue can also specify where to pull
     * resources and indicate where to output completed jobs.
     * </p>
     * 
     * @param createQueueRequest
     * @return Result of the CreateQueue operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.CreateQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateQueue" target="_top">AWS API
     *      Documentation</a>
     */
    CreateQueueResult createQueue(CreateQueueRequest createQueueRequest);

    /**
     * <p>
     * Creates an environment for a queue that defines how jobs in the queue run.
     * </p>
     * 
     * @param createQueueEnvironmentRequest
     * @return Result of the CreateQueueEnvironment operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.CreateQueueEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateQueueEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    CreateQueueEnvironmentResult createQueueEnvironment(CreateQueueEnvironmentRequest createQueueEnvironmentRequest);

    /**
     * <p>
     * Creates an association between a queue and a fleet.
     * </p>
     * 
     * @param createQueueFleetAssociationRequest
     * @return Result of the CreateQueueFleetAssociation operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.CreateQueueFleetAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateQueueFleetAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    CreateQueueFleetAssociationResult createQueueFleetAssociation(CreateQueueFleetAssociationRequest createQueueFleetAssociationRequest);

    /**
     * <p>
     * Creates a storage profile that specifies the operating system, file type, and file location of resources used on
     * a farm.
     * </p>
     * 
     * @param createStorageProfileRequest
     * @return Result of the CreateStorageProfile operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.CreateStorageProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateStorageProfile" target="_top">AWS
     *      API Documentation</a>
     */
    CreateStorageProfileResult createStorageProfile(CreateStorageProfileRequest createStorageProfileRequest);

    /**
     * <p>
     * Creates a worker. A worker tells your instance how much processing power (vCPU), and memory (GiB) you’ll need to
     * assemble the digital assets held within a particular instance. You can specify certain instance types to use, or
     * let the worker know which instances types to exclude.
     * </p>
     * 
     * @param createWorkerRequest
     * @return Result of the CreateWorker operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.CreateWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateWorker" target="_top">AWS API
     *      Documentation</a>
     */
    CreateWorkerResult createWorker(CreateWorkerRequest createWorkerRequest);

    /**
     * <p>
     * Deletes a budget.
     * </p>
     * 
     * @param deleteBudgetRequest
     * @return Result of the DeleteBudget operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DeleteBudget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteBudget" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteBudgetResult deleteBudget(DeleteBudgetRequest deleteBudgetRequest);

    /**
     * <p>
     * Deletes a farm.
     * </p>
     * 
     * @param deleteFarmRequest
     * @return Result of the DeleteFarm operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DeleteFarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteFarm" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFarmResult deleteFarm(DeleteFarmRequest deleteFarmRequest);

    /**
     * <p>
     * Deletes a fleet.
     * </p>
     * 
     * @param deleteFleetRequest
     * @return Result of the DeleteFleet operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFleetResult deleteFleet(DeleteFleetRequest deleteFleetRequest);

    /**
     * <p>
     * Deletes a license endpoint.
     * </p>
     * 
     * @param deleteLicenseEndpointRequest
     * @return Result of the DeleteLicenseEndpoint operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DeleteLicenseEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteLicenseEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteLicenseEndpointResult deleteLicenseEndpoint(DeleteLicenseEndpointRequest deleteLicenseEndpointRequest);

    /**
     * <p>
     * Deletes a metered product.
     * </p>
     * 
     * @param deleteMeteredProductRequest
     * @return Result of the DeleteMeteredProduct operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DeleteMeteredProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteMeteredProduct" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteMeteredProductResult deleteMeteredProduct(DeleteMeteredProductRequest deleteMeteredProductRequest);

    /**
     * <p>
     * Removes a Deadline Cloud monitor. After you delete a monitor, you can create a new one and attach farms to the
     * monitor.
     * </p>
     * 
     * @param deleteMonitorRequest
     * @return Result of the DeleteMonitor operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DeleteMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteMonitorResult deleteMonitor(DeleteMonitorRequest deleteMonitorRequest);

    /**
     * <p>
     * Deletes a queue.
     * </p>
     * 
     * @param deleteQueueRequest
     * @return Result of the DeleteQueue operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DeleteQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteQueue" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteQueueResult deleteQueue(DeleteQueueRequest deleteQueueRequest);

    /**
     * <p>
     * Deletes a queue environment.
     * </p>
     * 
     * @param deleteQueueEnvironmentRequest
     * @return Result of the DeleteQueueEnvironment operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DeleteQueueEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteQueueEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteQueueEnvironmentResult deleteQueueEnvironment(DeleteQueueEnvironmentRequest deleteQueueEnvironmentRequest);

    /**
     * <p>
     * Deletes a queue-fleet association.
     * </p>
     * 
     * @param deleteQueueFleetAssociationRequest
     * @return Result of the DeleteQueueFleetAssociation operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DeleteQueueFleetAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteQueueFleetAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteQueueFleetAssociationResult deleteQueueFleetAssociation(DeleteQueueFleetAssociationRequest deleteQueueFleetAssociationRequest);

    /**
     * <p>
     * Deletes a storage profile.
     * </p>
     * 
     * @param deleteStorageProfileRequest
     * @return Result of the DeleteStorageProfile operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DeleteStorageProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteStorageProfile" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteStorageProfileResult deleteStorageProfile(DeleteStorageProfileRequest deleteStorageProfileRequest);

    /**
     * <p>
     * Deletes a worker.
     * </p>
     * 
     * @param deleteWorkerRequest
     * @return Result of the DeleteWorker operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DeleteWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteWorker" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteWorkerResult deleteWorker(DeleteWorkerRequest deleteWorkerRequest);

    /**
     * <p>
     * Disassociates a member from a farm.
     * </p>
     * 
     * @param disassociateMemberFromFarmRequest
     * @return Result of the DisassociateMemberFromFarm operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DisassociateMemberFromFarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DisassociateMemberFromFarm"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateMemberFromFarmResult disassociateMemberFromFarm(DisassociateMemberFromFarmRequest disassociateMemberFromFarmRequest);

    /**
     * <p>
     * Disassociates a member from a fleet.
     * </p>
     * 
     * @param disassociateMemberFromFleetRequest
     * @return Result of the DisassociateMemberFromFleet operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DisassociateMemberFromFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DisassociateMemberFromFleet"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateMemberFromFleetResult disassociateMemberFromFleet(DisassociateMemberFromFleetRequest disassociateMemberFromFleetRequest);

    /**
     * <p>
     * Disassociates a member from a job.
     * </p>
     * 
     * @param disassociateMemberFromJobRequest
     * @return Result of the DisassociateMemberFromJob operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DisassociateMemberFromJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DisassociateMemberFromJob"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateMemberFromJobResult disassociateMemberFromJob(DisassociateMemberFromJobRequest disassociateMemberFromJobRequest);

    /**
     * <p>
     * Disassociates a member from a queue.
     * </p>
     * 
     * @param disassociateMemberFromQueueRequest
     * @return Result of the DisassociateMemberFromQueue operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DisassociateMemberFromQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DisassociateMemberFromQueue"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateMemberFromQueueResult disassociateMemberFromQueue(DisassociateMemberFromQueueRequest disassociateMemberFromQueueRequest);

    /**
     * <p>
     * Get a budget.
     * </p>
     * 
     * @param getBudgetRequest
     * @return Result of the GetBudget operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetBudget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetBudget" target="_top">AWS API
     *      Documentation</a>
     */
    GetBudgetResult getBudget(GetBudgetRequest getBudgetRequest);

    /**
     * <p>
     * Get a farm.
     * </p>
     * 
     * @param getFarmRequest
     * @return Result of the GetFarm operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetFarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetFarm" target="_top">AWS API
     *      Documentation</a>
     */
    GetFarmResult getFarm(GetFarmRequest getFarmRequest);

    /**
     * <p>
     * Get a fleet.
     * </p>
     * 
     * @param getFleetRequest
     * @return Result of the GetFleet operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetFleet" target="_top">AWS API
     *      Documentation</a>
     */
    GetFleetResult getFleet(GetFleetRequest getFleetRequest);

    /**
     * <p>
     * Gets a Deadline Cloud job.
     * </p>
     * 
     * @param getJobRequest
     * @return Result of the GetJob operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    GetJobResult getJob(GetJobRequest getJobRequest);

    /**
     * <p>
     * Gets a licence endpoint.
     * </p>
     * 
     * @param getLicenseEndpointRequest
     * @return Result of the GetLicenseEndpoint operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetLicenseEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetLicenseEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    GetLicenseEndpointResult getLicenseEndpoint(GetLicenseEndpointRequest getLicenseEndpointRequest);

    /**
     * <p>
     * Gets information about the specified monitor.
     * </p>
     * 
     * @param getMonitorRequest
     * @return Result of the GetMonitor operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    GetMonitorResult getMonitor(GetMonitorRequest getMonitorRequest);

    /**
     * <p>
     * Gets a queue.
     * </p>
     * 
     * @param getQueueRequest
     * @return Result of the GetQueue operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetQueue" target="_top">AWS API
     *      Documentation</a>
     */
    GetQueueResult getQueue(GetQueueRequest getQueueRequest);

    /**
     * <p>
     * Gets a queue environment.
     * </p>
     * 
     * @param getQueueEnvironmentRequest
     * @return Result of the GetQueueEnvironment operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetQueueEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetQueueEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    GetQueueEnvironmentResult getQueueEnvironment(GetQueueEnvironmentRequest getQueueEnvironmentRequest);

    /**
     * <p>
     * Gets a queue-fleet association.
     * </p>
     * 
     * @param getQueueFleetAssociationRequest
     * @return Result of the GetQueueFleetAssociation operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetQueueFleetAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetQueueFleetAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    GetQueueFleetAssociationResult getQueueFleetAssociation(GetQueueFleetAssociationRequest getQueueFleetAssociationRequest);

    /**
     * <p>
     * Gets a session.
     * </p>
     * 
     * @param getSessionRequest
     * @return Result of the GetSession operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetSession" target="_top">AWS API
     *      Documentation</a>
     */
    GetSessionResult getSession(GetSessionRequest getSessionRequest);

    /**
     * <p>
     * Gets a session action for the job.
     * </p>
     * 
     * @param getSessionActionRequest
     * @return Result of the GetSessionAction operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetSessionAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetSessionAction" target="_top">AWS API
     *      Documentation</a>
     */
    GetSessionActionResult getSessionAction(GetSessionActionRequest getSessionActionRequest);

    /**
     * <p>
     * Gets a set of statistics for queues or farms. Before you can call the
     * <code>GetSessionStatisticsAggregation</code> operation, you must first call the
     * <code>StartSessionsStatisticsAggregation</code> operation. Statistics are available for 1 hour after you call the
     * <code>StartSessionsStatisticsAggregation</code> operation.
     * </p>
     * 
     * @param getSessionsStatisticsAggregationRequest
     * @return Result of the GetSessionsStatisticsAggregation operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetSessionsStatisticsAggregation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetSessionsStatisticsAggregation"
     *      target="_top">AWS API Documentation</a>
     */
    GetSessionsStatisticsAggregationResult getSessionsStatisticsAggregation(GetSessionsStatisticsAggregationRequest getSessionsStatisticsAggregationRequest);

    /**
     * <p>
     * Gets a step.
     * </p>
     * 
     * @param getStepRequest
     * @return Result of the GetStep operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetStep" target="_top">AWS API
     *      Documentation</a>
     */
    GetStepResult getStep(GetStepRequest getStepRequest);

    /**
     * <p>
     * Gets a storage profile.
     * </p>
     * 
     * @param getStorageProfileRequest
     * @return Result of the GetStorageProfile operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetStorageProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetStorageProfile" target="_top">AWS API
     *      Documentation</a>
     */
    GetStorageProfileResult getStorageProfile(GetStorageProfileRequest getStorageProfileRequest);

    /**
     * <p>
     * Gets a storage profile for a queue.
     * </p>
     * 
     * @param getStorageProfileForQueueRequest
     * @return Result of the GetStorageProfileForQueue operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetStorageProfileForQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetStorageProfileForQueue"
     *      target="_top">AWS API Documentation</a>
     */
    GetStorageProfileForQueueResult getStorageProfileForQueue(GetStorageProfileForQueueRequest getStorageProfileForQueueRequest);

    /**
     * <p>
     * Gets a task.
     * </p>
     * 
     * @param getTaskRequest
     * @return Result of the GetTask operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetTask" target="_top">AWS API
     *      Documentation</a>
     */
    GetTaskResult getTask(GetTaskRequest getTaskRequest);

    /**
     * <p>
     * Gets a worker.
     * </p>
     * 
     * @param getWorkerRequest
     * @return Result of the GetWorker operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetWorker" target="_top">AWS API
     *      Documentation</a>
     */
    GetWorkerResult getWorker(GetWorkerRequest getWorkerRequest);

    /**
     * <p>
     * A list of the available metered products.
     * </p>
     * 
     * @param listAvailableMeteredProductsRequest
     * @return Result of the ListAvailableMeteredProducts operation returned by the service.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @sample AWSDeadline.ListAvailableMeteredProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListAvailableMeteredProducts"
     *      target="_top">AWS API Documentation</a>
     */
    ListAvailableMeteredProductsResult listAvailableMeteredProducts(ListAvailableMeteredProductsRequest listAvailableMeteredProductsRequest);

    /**
     * <p>
     * A list of budgets in a farm.
     * </p>
     * 
     * @param listBudgetsRequest
     * @return Result of the ListBudgets operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListBudgets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListBudgets" target="_top">AWS API
     *      Documentation</a>
     */
    ListBudgetsResult listBudgets(ListBudgetsRequest listBudgetsRequest);

    /**
     * <p>
     * Lists the members of a farm.
     * </p>
     * 
     * @param listFarmMembersRequest
     * @return Result of the ListFarmMembers operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListFarmMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListFarmMembers" target="_top">AWS API
     *      Documentation</a>
     */
    ListFarmMembersResult listFarmMembers(ListFarmMembersRequest listFarmMembersRequest);

    /**
     * <p>
     * Lists farms.
     * </p>
     * 
     * @param listFarmsRequest
     * @return Result of the ListFarms operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListFarms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListFarms" target="_top">AWS API
     *      Documentation</a>
     */
    ListFarmsResult listFarms(ListFarmsRequest listFarmsRequest);

    /**
     * <p>
     * Lists fleet members.
     * </p>
     * 
     * @param listFleetMembersRequest
     * @return Result of the ListFleetMembers operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListFleetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListFleetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    ListFleetMembersResult listFleetMembers(ListFleetMembersRequest listFleetMembersRequest);

    /**
     * <p>
     * Lists fleets.
     * </p>
     * 
     * @param listFleetsRequest
     * @return Result of the ListFleets operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListFleets" target="_top">AWS API
     *      Documentation</a>
     */
    ListFleetsResult listFleets(ListFleetsRequest listFleetsRequest);

    /**
     * <p>
     * Lists members on a job.
     * </p>
     * 
     * @param listJobMembersRequest
     * @return Result of the ListJobMembers operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListJobMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListJobMembers" target="_top">AWS API
     *      Documentation</a>
     */
    ListJobMembersResult listJobMembers(ListJobMembersRequest listJobMembersRequest);

    /**
     * <p>
     * Lists jobs.
     * </p>
     * 
     * @param listJobsRequest
     * @return Result of the ListJobs operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListJobsResult listJobs(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * Lists license endpoints.
     * </p>
     * 
     * @param listLicenseEndpointsRequest
     * @return Result of the ListLicenseEndpoints operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListLicenseEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListLicenseEndpoints" target="_top">AWS
     *      API Documentation</a>
     */
    ListLicenseEndpointsResult listLicenseEndpoints(ListLicenseEndpointsRequest listLicenseEndpointsRequest);

    /**
     * <p>
     * Lists metered products.
     * </p>
     * 
     * @param listMeteredProductsRequest
     * @return Result of the ListMeteredProducts operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListMeteredProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListMeteredProducts" target="_top">AWS
     *      API Documentation</a>
     */
    ListMeteredProductsResult listMeteredProducts(ListMeteredProductsRequest listMeteredProductsRequest);

    /**
     * <p>
     * Gets a list of your monitors in Deadline Cloud.
     * </p>
     * 
     * @param listMonitorsRequest
     * @return Result of the ListMonitors operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListMonitors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListMonitors" target="_top">AWS API
     *      Documentation</a>
     */
    ListMonitorsResult listMonitors(ListMonitorsRequest listMonitorsRequest);

    /**
     * <p>
     * Lists queue environments.
     * </p>
     * 
     * @param listQueueEnvironmentsRequest
     * @return Result of the ListQueueEnvironments operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListQueueEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListQueueEnvironments" target="_top">AWS
     *      API Documentation</a>
     */
    ListQueueEnvironmentsResult listQueueEnvironments(ListQueueEnvironmentsRequest listQueueEnvironmentsRequest);

    /**
     * <p>
     * Lists queue-fleet associations.
     * </p>
     * 
     * @param listQueueFleetAssociationsRequest
     * @return Result of the ListQueueFleetAssociations operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @sample AWSDeadline.ListQueueFleetAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListQueueFleetAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    ListQueueFleetAssociationsResult listQueueFleetAssociations(ListQueueFleetAssociationsRequest listQueueFleetAssociationsRequest);

    /**
     * <p>
     * Lists the members in a queue.
     * </p>
     * 
     * @param listQueueMembersRequest
     * @return Result of the ListQueueMembers operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListQueueMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListQueueMembers" target="_top">AWS API
     *      Documentation</a>
     */
    ListQueueMembersResult listQueueMembers(ListQueueMembersRequest listQueueMembersRequest);

    /**
     * <p>
     * Lists queues.
     * </p>
     * 
     * @param listQueuesRequest
     * @return Result of the ListQueues operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListQueues" target="_top">AWS API
     *      Documentation</a>
     */
    ListQueuesResult listQueues(ListQueuesRequest listQueuesRequest);

    /**
     * <p>
     * Lists session actions.
     * </p>
     * 
     * @param listSessionActionsRequest
     * @return Result of the ListSessionActions operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListSessionActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListSessionActions" target="_top">AWS
     *      API Documentation</a>
     */
    ListSessionActionsResult listSessionActions(ListSessionActionsRequest listSessionActionsRequest);

    /**
     * <p>
     * Lists sessions.
     * </p>
     * 
     * @param listSessionsRequest
     * @return Result of the ListSessions operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListSessions" target="_top">AWS API
     *      Documentation</a>
     */
    ListSessionsResult listSessions(ListSessionsRequest listSessionsRequest);

    /**
     * <p>
     * Lists sessions for a worker.
     * </p>
     * 
     * @param listSessionsForWorkerRequest
     * @return Result of the ListSessionsForWorker operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListSessionsForWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListSessionsForWorker" target="_top">AWS
     *      API Documentation</a>
     */
    ListSessionsForWorkerResult listSessionsForWorker(ListSessionsForWorkerRequest listSessionsForWorkerRequest);

    /**
     * <p>
     * Lists step consumers.
     * </p>
     * 
     * @param listStepConsumersRequest
     * @return Result of the ListStepConsumers operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListStepConsumers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListStepConsumers" target="_top">AWS API
     *      Documentation</a>
     */
    ListStepConsumersResult listStepConsumers(ListStepConsumersRequest listStepConsumersRequest);

    /**
     * <p>
     * Lists the dependencies for a step.
     * </p>
     * 
     * @param listStepDependenciesRequest
     * @return Result of the ListStepDependencies operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListStepDependencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListStepDependencies" target="_top">AWS
     *      API Documentation</a>
     */
    ListStepDependenciesResult listStepDependencies(ListStepDependenciesRequest listStepDependenciesRequest);

    /**
     * <p>
     * Lists steps for a job.
     * </p>
     * 
     * @param listStepsRequest
     * @return Result of the ListSteps operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListSteps" target="_top">AWS API
     *      Documentation</a>
     */
    ListStepsResult listSteps(ListStepsRequest listStepsRequest);

    /**
     * <p>
     * Lists storage profiles.
     * </p>
     * 
     * @param listStorageProfilesRequest
     * @return Result of the ListStorageProfiles operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListStorageProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListStorageProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    ListStorageProfilesResult listStorageProfiles(ListStorageProfilesRequest listStorageProfilesRequest);

    /**
     * <p>
     * Lists storage profiles for a queue.
     * </p>
     * 
     * @param listStorageProfilesForQueueRequest
     * @return Result of the ListStorageProfilesForQueue operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListStorageProfilesForQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListStorageProfilesForQueue"
     *      target="_top">AWS API Documentation</a>
     */
    ListStorageProfilesForQueueResult listStorageProfilesForQueue(ListStorageProfilesForQueueRequest listStorageProfilesForQueueRequest);

    /**
     * <p>
     * Lists tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists tasks for a job.
     * </p>
     * 
     * @param listTasksRequest
     * @return Result of the ListTasks operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListTasks" target="_top">AWS API
     *      Documentation</a>
     */
    ListTasksResult listTasks(ListTasksRequest listTasksRequest);

    /**
     * <p>
     * Lists workers.
     * </p>
     * 
     * @param listWorkersRequest
     * @return Result of the ListWorkers operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListWorkers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListWorkers" target="_top">AWS API
     *      Documentation</a>
     */
    ListWorkersResult listWorkers(ListWorkersRequest listWorkersRequest);

    /**
     * <p>
     * Adds a metered product.
     * </p>
     * 
     * @param putMeteredProductRequest
     * @return Result of the PutMeteredProduct operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.PutMeteredProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/PutMeteredProduct" target="_top">AWS API
     *      Documentation</a>
     */
    PutMeteredProductResult putMeteredProduct(PutMeteredProductRequest putMeteredProductRequest);

    /**
     * <p>
     * Searches for jobs.
     * </p>
     * 
     * @param searchJobsRequest
     * @return Result of the SearchJobs operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.SearchJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SearchJobs" target="_top">AWS API
     *      Documentation</a>
     */
    SearchJobsResult searchJobs(SearchJobsRequest searchJobsRequest);

    /**
     * <p>
     * Searches for steps.
     * </p>
     * 
     * @param searchStepsRequest
     * @return Result of the SearchSteps operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.SearchSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SearchSteps" target="_top">AWS API
     *      Documentation</a>
     */
    SearchStepsResult searchSteps(SearchStepsRequest searchStepsRequest);

    /**
     * <p>
     * Searches for tasks.
     * </p>
     * 
     * @param searchTasksRequest
     * @return Result of the SearchTasks operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.SearchTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SearchTasks" target="_top">AWS API
     *      Documentation</a>
     */
    SearchTasksResult searchTasks(SearchTasksRequest searchTasksRequest);

    /**
     * <p>
     * Searches for workers.
     * </p>
     * 
     * @param searchWorkersRequest
     * @return Result of the SearchWorkers operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.SearchWorkers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SearchWorkers" target="_top">AWS API
     *      Documentation</a>
     */
    SearchWorkersResult searchWorkers(SearchWorkersRequest searchWorkersRequest);

    /**
     * <p>
     * Starts an asynchronous request for getting aggregated statistics about queues and farms. Get the statistics using
     * the <code>GetSessionsStatisticsAggregation</code> operation. Statistics are available for 1 hour after you call
     * the <code>StartSessionsStatisticsAggregation</code> operation.
     * </p>
     * 
     * @param startSessionsStatisticsAggregationRequest
     * @return Result of the StartSessionsStatisticsAggregation operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.StartSessionsStatisticsAggregation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/StartSessionsStatisticsAggregation"
     *      target="_top">AWS API Documentation</a>
     */
    StartSessionsStatisticsAggregationResult startSessionsStatisticsAggregation(
            StartSessionsStatisticsAggregationRequest startSessionsStatisticsAggregationRequest);

    /**
     * <p>
     * Tags a resource using the resource's ARN and desired tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag from a resource using the resource's ARN and tag to remove.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a budget that sets spending thresholds for rendering activity.
     * </p>
     * 
     * @param updateBudgetRequest
     * @return Result of the UpdateBudget operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateBudget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateBudget" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateBudgetResult updateBudget(UpdateBudgetRequest updateBudgetRequest);

    /**
     * <p>
     * Updates a farm.
     * </p>
     * 
     * @param updateFarmRequest
     * @return Result of the UpdateFarm operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateFarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateFarm" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFarmResult updateFarm(UpdateFarmRequest updateFarmRequest);

    /**
     * <p>
     * Updates a fleet.
     * </p>
     * 
     * @param updateFleetRequest
     * @return Result of the UpdateFleet operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.UpdateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFleetResult updateFleet(UpdateFleetRequest updateFleetRequest);

    /**
     * <p>
     * Updates a job.
     * </p>
     * 
     * @param updateJobRequest
     * @return Result of the UpdateJob operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateJob" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateJobResult updateJob(UpdateJobRequest updateJobRequest);

    /**
     * <p>
     * Modifies the settings for a Deadline Cloud monitor. You can modify one or all of the settings when you call
     * <code>UpdateMonitor</code>.
     * </p>
     * 
     * @param updateMonitorRequest
     * @return Result of the UpdateMonitor operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateMonitorResult updateMonitor(UpdateMonitorRequest updateMonitorRequest);

    /**
     * <p>
     * Updates a queue.
     * </p>
     * 
     * @param updateQueueRequest
     * @return Result of the UpdateQueue operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateQueue" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateQueueResult updateQueue(UpdateQueueRequest updateQueueRequest);

    /**
     * <p>
     * Updates the queue environment.
     * </p>
     * 
     * @param updateQueueEnvironmentRequest
     * @return Result of the UpdateQueueEnvironment operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateQueueEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateQueueEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateQueueEnvironmentResult updateQueueEnvironment(UpdateQueueEnvironmentRequest updateQueueEnvironmentRequest);

    /**
     * <p>
     * Updates a queue-fleet association.
     * </p>
     * 
     * @param updateQueueFleetAssociationRequest
     * @return Result of the UpdateQueueFleetAssociation operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateQueueFleetAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateQueueFleetAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateQueueFleetAssociationResult updateQueueFleetAssociation(UpdateQueueFleetAssociationRequest updateQueueFleetAssociationRequest);

    /**
     * <p>
     * Updates a session.
     * </p>
     * 
     * @param updateSessionRequest
     * @return Result of the UpdateSession operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateSession" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateSessionResult updateSession(UpdateSessionRequest updateSessionRequest);

    /**
     * <p>
     * Updates a step.
     * </p>
     * 
     * @param updateStepRequest
     * @return Result of the UpdateStep operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateStep" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateStepResult updateStep(UpdateStepRequest updateStepRequest);

    /**
     * <p>
     * Updates a storage profile.
     * </p>
     * 
     * @param updateStorageProfileRequest
     * @return Result of the UpdateStorageProfile operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateStorageProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateStorageProfile" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateStorageProfileResult updateStorageProfile(UpdateStorageProfileRequest updateStorageProfileRequest);

    /**
     * <p>
     * Updates a task.
     * </p>
     * 
     * @param updateTaskRequest
     * @return Result of the UpdateTask operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateTask" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateTaskResult updateTask(UpdateTaskRequest updateTaskRequest);

    /**
     * <p>
     * Updates a worker.
     * </p>
     * 
     * @param updateWorkerRequest
     * @return Result of the UpdateWorker operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateWorker" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateWorkerResult updateWorker(UpdateWorkerRequest updateWorkerRequest);

    /**
     * <p>
     * Updates the schedule for a worker.
     * </p>
     * 
     * @param updateWorkerScheduleRequest
     * @return Result of the UpdateWorkerSchedule operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateWorkerSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateWorkerSchedule" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateWorkerScheduleResult updateWorkerSchedule(UpdateWorkerScheduleRequest updateWorkerScheduleRequest);

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

    AWSDeadlineWaiters waiters();

}
