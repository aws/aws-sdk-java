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
package com.amazonaws.services.migrationhub;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.migrationhub.model.*;

/**
 * Interface for accessing AWS Migration Hub.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.migrationhub.AbstractAWSMigrationHub} instead.
 * </p>
 * <p>
 * <p>
 * The AWS Migration Hub API methods help to obtain server and application migration status and integrate your
 * resource-specific migration tool by providing a programmatic interface to Migration Hub.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMigrationHub {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "mgh";

    /**
     * <p>
     * Associates a created artifact of an AWS cloud resource, the target receiving the migration, with the migration
     * task performed by a migration tool. This API has the following traits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Migration tools can call the <code>AssociateCreatedArtifact</code> operation to indicate which AWS artifact is
     * associated with a migration task.
     * </p>
     * </li>
     * <li>
     * <p>
     * The created artifact name must be provided in ARN (Amazon Resource Name) format which will contain information
     * about type and region; for example: <code>arn:aws:ec2:us-east-1:488216288981:image/ami-6d0ba87b</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Examples of the AWS resource behind the created artifact are, AMI's, EC2 instance, or DMS endpoint, etc.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associateCreatedArtifactRequest
     * @return Result of the AssociateCreatedArtifact operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws DryRunOperationException
     *         Exception raised to indicate a successfully authorized action when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws UnauthorizedOperationException
     *         Exception raised to indicate a request was not authorized when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.AssociateCreatedArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/AssociateCreatedArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateCreatedArtifactResult associateCreatedArtifact(AssociateCreatedArtifactRequest associateCreatedArtifactRequest);

    /**
     * <p>
     * Associates a discovered resource ID from Application Discovery Service (ADS) with a migration task.
     * </p>
     * 
     * @param associateDiscoveredResourceRequest
     * @return Result of the AssociateDiscoveredResource operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws DryRunOperationException
     *         Exception raised to indicate a successfully authorized action when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws UnauthorizedOperationException
     *         Exception raised to indicate a request was not authorized when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws PolicyErrorException
     *         Exception raised when there are problems accessing ADS (Application Discovery Service); most likely due
     *         to a misconfigured policy or the <code>migrationhub-discovery</code> role is missing or not configured
     *         correctly.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.AssociateDiscoveredResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/AssociateDiscoveredResource"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateDiscoveredResourceResult associateDiscoveredResource(AssociateDiscoveredResourceRequest associateDiscoveredResourceRequest);

    /**
     * <p>
     * Creates a progress update stream which is an AWS resource used for access control as well as a namespace for
     * migration task names that is implicitly linked to your AWS account. It must uniquely identify the migration tool
     * as it is used for all updates made by the tool; however, it does not need to be unique for each AWS account
     * because it is scoped to the AWS account.
     * </p>
     * 
     * @param createProgressUpdateStreamRequest
     * @return Result of the CreateProgressUpdateStream operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws DryRunOperationException
     *         Exception raised to indicate a successfully authorized action when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws UnauthorizedOperationException
     *         Exception raised to indicate a request was not authorized when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @sample AWSMigrationHub.CreateProgressUpdateStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/CreateProgressUpdateStream"
     *      target="_top">AWS API Documentation</a>
     */
    CreateProgressUpdateStreamResult createProgressUpdateStream(CreateProgressUpdateStreamRequest createProgressUpdateStreamRequest);

    /**
     * <p>
     * Deletes a progress update stream, including all of its tasks, which was previously created as an AWS resource
     * used for access control. This API has the following traits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The only parameter needed for <code>DeleteProgressUpdateStream</code> is the stream name (same as a
     * <code>CreateProgressUpdateStream</code> call).
     * </p>
     * </li>
     * <li>
     * <p>
     * The call will return, and a background process will asynchronously delete the stream and all of its resources
     * (tasks, associated resources, resource attributes, created artifacts).
     * </p>
     * </li>
     * <li>
     * <p>
     * If the stream takes time to be deleted, it might still show up on a <code>ListProgressUpdateStreams</code> call.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateProgressUpdateStream</code>, <code>ImportMigrationTask</code>, <code>NotifyMigrationTaskState</code>,
     * and all Associate[*] APIs realted to the tasks belonging to the stream will throw "InvalidInputException" if the
     * stream of the same name is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * Once the stream and all of its resources are deleted, <code>CreateProgressUpdateStream</code> for a stream of the
     * same name will succeed, and that stream will be an entirely new logical resource (without any resources
     * associated with the old stream).
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteProgressUpdateStreamRequest
     * @return Result of the DeleteProgressUpdateStream operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws DryRunOperationException
     *         Exception raised to indicate a successfully authorized action when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws UnauthorizedOperationException
     *         Exception raised to indicate a request was not authorized when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.DeleteProgressUpdateStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/DeleteProgressUpdateStream"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteProgressUpdateStreamResult deleteProgressUpdateStream(DeleteProgressUpdateStreamRequest deleteProgressUpdateStreamRequest);

    /**
     * <p>
     * Gets the migration status of an application.
     * </p>
     * 
     * @param describeApplicationStateRequest
     * @return Result of the DescribeApplicationState operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws PolicyErrorException
     *         Exception raised when there are problems accessing ADS (Application Discovery Service); most likely due
     *         to a misconfigured policy or the <code>migrationhub-discovery</code> role is missing or not configured
     *         correctly.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.DescribeApplicationState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/DescribeApplicationState"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeApplicationStateResult describeApplicationState(DescribeApplicationStateRequest describeApplicationStateRequest);

    /**
     * <p>
     * Retrieves a list of all attributes associated with a specific migration task.
     * </p>
     * 
     * @param describeMigrationTaskRequest
     * @return Result of the DescribeMigrationTask operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.DescribeMigrationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/DescribeMigrationTask"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeMigrationTaskResult describeMigrationTask(DescribeMigrationTaskRequest describeMigrationTaskRequest);

    /**
     * <p>
     * Disassociates a created artifact of an AWS resource with a migration task performed by a migration tool that was
     * previously associated. This API has the following traits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A migration user can call the <code>DisassociateCreatedArtifacts</code> operation to disassociate a created AWS
     * Artifact from a migration task.
     * </p>
     * </li>
     * <li>
     * <p>
     * The created artifact name must be provided in ARN (Amazon Resource Name) format which will contain information
     * about type and region; for example: <code>arn:aws:ec2:us-east-1:488216288981:image/ami-6d0ba87b</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Examples of the AWS resource behind the created artifact are, AMI's, EC2 instance, or RDS instance, etc.
     * </p>
     * </li>
     * </ul>
     * 
     * @param disassociateCreatedArtifactRequest
     * @return Result of the DisassociateCreatedArtifact operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws DryRunOperationException
     *         Exception raised to indicate a successfully authorized action when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws UnauthorizedOperationException
     *         Exception raised to indicate a request was not authorized when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.DisassociateCreatedArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/DisassociateCreatedArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateCreatedArtifactResult disassociateCreatedArtifact(DisassociateCreatedArtifactRequest disassociateCreatedArtifactRequest);

    /**
     * <p>
     * Disassociate an Application Discovery Service (ADS) discovered resource from a migration task.
     * </p>
     * 
     * @param disassociateDiscoveredResourceRequest
     * @return Result of the DisassociateDiscoveredResource operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws DryRunOperationException
     *         Exception raised to indicate a successfully authorized action when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws UnauthorizedOperationException
     *         Exception raised to indicate a request was not authorized when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.DisassociateDiscoveredResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/DisassociateDiscoveredResource"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateDiscoveredResourceResult disassociateDiscoveredResource(DisassociateDiscoveredResourceRequest disassociateDiscoveredResourceRequest);

    /**
     * <p>
     * Registers a new migration task which represents a server, database, etc., being migrated to AWS by a migration
     * tool.
     * </p>
     * <p>
     * This API is a prerequisite to calling the <code>NotifyMigrationTaskState</code> API as the migration tool must
     * first register the migration task with Migration Hub.
     * </p>
     * 
     * @param importMigrationTaskRequest
     * @return Result of the ImportMigrationTask operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws DryRunOperationException
     *         Exception raised to indicate a successfully authorized action when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws UnauthorizedOperationException
     *         Exception raised to indicate a request was not authorized when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.ImportMigrationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ImportMigrationTask"
     *      target="_top">AWS API Documentation</a>
     */
    ImportMigrationTaskResult importMigrationTask(ImportMigrationTaskRequest importMigrationTaskRequest);

    /**
     * <p>
     * Lists the created artifacts attached to a given migration task in an update stream. This API has the following
     * traits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Gets the list of the created artifacts while migration is taking place.
     * </p>
     * </li>
     * <li>
     * <p>
     * Shows the artifacts created by the migration tool that was associated by the
     * <code>AssociateCreatedArtifact</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lists created artifacts in a paginated interface.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listCreatedArtifactsRequest
     * @return Result of the ListCreatedArtifacts operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.ListCreatedArtifacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ListCreatedArtifacts"
     *      target="_top">AWS API Documentation</a>
     */
    ListCreatedArtifactsResult listCreatedArtifacts(ListCreatedArtifactsRequest listCreatedArtifactsRequest);

    /**
     * <p>
     * Lists discovered resources associated with the given <code>MigrationTask</code>.
     * </p>
     * 
     * @param listDiscoveredResourcesRequest
     * @return Result of the ListDiscoveredResources operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.ListDiscoveredResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ListDiscoveredResources"
     *      target="_top">AWS API Documentation</a>
     */
    ListDiscoveredResourcesResult listDiscoveredResources(ListDiscoveredResourcesRequest listDiscoveredResourcesRequest);

    /**
     * <p>
     * Lists all, or filtered by resource name, migration tasks associated with the user account making this call. This
     * API has the following traits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can show a summary list of the most recent migration tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can show a summary list of migration tasks associated with a given discovered resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lists migration tasks in a paginated interface.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listMigrationTasksRequest
     * @return Result of the ListMigrationTasks operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws PolicyErrorException
     *         Exception raised when there are problems accessing ADS (Application Discovery Service); most likely due
     *         to a misconfigured policy or the <code>migrationhub-discovery</code> role is missing or not configured
     *         correctly.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.ListMigrationTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ListMigrationTasks"
     *      target="_top">AWS API Documentation</a>
     */
    ListMigrationTasksResult listMigrationTasks(ListMigrationTasksRequest listMigrationTasksRequest);

    /**
     * <p>
     * Lists progress update streams associated with the user account making this call.
     * </p>
     * 
     * @param listProgressUpdateStreamsRequest
     * @return Result of the ListProgressUpdateStreams operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @sample AWSMigrationHub.ListProgressUpdateStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ListProgressUpdateStreams"
     *      target="_top">AWS API Documentation</a>
     */
    ListProgressUpdateStreamsResult listProgressUpdateStreams(ListProgressUpdateStreamsRequest listProgressUpdateStreamsRequest);

    /**
     * <p>
     * Sets the migration state of an application. For a given application identified by the value passed to
     * <code>ApplicationId</code>, its status is set or updated by passing one of three values to <code>Status</code>:
     * <code>NOT_STARTED | IN_PROGRESS | COMPLETED</code>.
     * </p>
     * 
     * @param notifyApplicationStateRequest
     * @return Result of the NotifyApplicationState operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws DryRunOperationException
     *         Exception raised to indicate a successfully authorized action when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws UnauthorizedOperationException
     *         Exception raised to indicate a request was not authorized when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws PolicyErrorException
     *         Exception raised when there are problems accessing ADS (Application Discovery Service); most likely due
     *         to a misconfigured policy or the <code>migrationhub-discovery</code> role is missing or not configured
     *         correctly.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.NotifyApplicationState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/NotifyApplicationState"
     *      target="_top">AWS API Documentation</a>
     */
    NotifyApplicationStateResult notifyApplicationState(NotifyApplicationStateRequest notifyApplicationStateRequest);

    /**
     * <p>
     * Notifies Migration Hub of the current status, progress, or other detail regarding a migration task. This API has
     * the following traits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Migration tools will call the <code>NotifyMigrationTaskState</code> API to share the latest progress and status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MigrationTaskName</code> is used for addressing updates to the correct target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProgressUpdateStream</code> is used for access control and to provide a namespace for each migration tool.
     * </p>
     * </li>
     * </ul>
     * 
     * @param notifyMigrationTaskStateRequest
     * @return Result of the NotifyMigrationTaskState operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws DryRunOperationException
     *         Exception raised to indicate a successfully authorized action when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws UnauthorizedOperationException
     *         Exception raised to indicate a request was not authorized when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.NotifyMigrationTaskState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/NotifyMigrationTaskState"
     *      target="_top">AWS API Documentation</a>
     */
    NotifyMigrationTaskStateResult notifyMigrationTaskState(NotifyMigrationTaskStateRequest notifyMigrationTaskStateRequest);

    /**
     * <p>
     * Provides identifying details of the resource being migrated so that it can be associated in the Application
     * Discovery Service (ADS)'s repository. This association occurs asynchronously after
     * <code>PutResourceAttributes</code> returns.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * Keep in mind that subsequent calls to PutResourceAttributes will override previously stored attributes. For
     * example, if it is first called with a MAC address, but later, it is desired to <i>add</i> an IP address, it will
     * then be required to call it with <i>both</i> the IP and MAC addresses to prevent overiding the MAC address.
     * </p>
     * </li>
     * <li>
     * <p>
     * Note the instructions regarding the special use case of the <a href=
     * "https://docs.aws.amazon.com/migrationhub/latest/ug/API_PutResourceAttributes.html#migrationhub-PutResourceAttributes-request-ResourceAttributeList"
     * > <code>ResourceAttributeList</code> </a> parameter when specifying any "VM" related value.
     * </p>
     * </li>
     * </ul>
     * </important> <note>
     * <p>
     * Because this is an asynchronous call, it will always return 200, whether an association occurs or not. To confirm
     * if an association was found based on the provided details, call <code>ListDiscoveredResources</code>.
     * </p>
     * </note>
     * 
     * @param putResourceAttributesRequest
     * @return Result of the PutResourceAttributes operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws DryRunOperationException
     *         Exception raised to indicate a successfully authorized action when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws UnauthorizedOperationException
     *         Exception raised to indicate a request was not authorized when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.PutResourceAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/PutResourceAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    PutResourceAttributesResult putResourceAttributes(PutResourceAttributesRequest putResourceAttributesRequest);

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
