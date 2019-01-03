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

import com.amazonaws.services.migrationhub.model.*;

/**
 * Interface for accessing AWS Migration Hub asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.migrationhub.AbstractAWSMigrationHubAsync} instead.
 * </p>
 * <p>
 * <p>
 * The AWS Migration Hub API methods help to obtain server and application migration status and integrate your
 * resource-specific migration tool by providing a programmatic interface to Migration Hub.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMigrationHubAsync extends AWSMigrationHub {

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
     * @return A Java Future containing the result of the AssociateCreatedArtifact operation returned by the service.
     * @sample AWSMigrationHubAsync.AssociateCreatedArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/AssociateCreatedArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateCreatedArtifactResult> associateCreatedArtifactAsync(AssociateCreatedArtifactRequest associateCreatedArtifactRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateCreatedArtifact operation returned by the service.
     * @sample AWSMigrationHubAsyncHandler.AssociateCreatedArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/AssociateCreatedArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateCreatedArtifactResult> associateCreatedArtifactAsync(AssociateCreatedArtifactRequest associateCreatedArtifactRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateCreatedArtifactRequest, AssociateCreatedArtifactResult> asyncHandler);

    /**
     * <p>
     * Associates a discovered resource ID from Application Discovery Service (ADS) with a migration task.
     * </p>
     * 
     * @param associateDiscoveredResourceRequest
     * @return A Java Future containing the result of the AssociateDiscoveredResource operation returned by the service.
     * @sample AWSMigrationHubAsync.AssociateDiscoveredResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/AssociateDiscoveredResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateDiscoveredResourceResult> associateDiscoveredResourceAsync(
            AssociateDiscoveredResourceRequest associateDiscoveredResourceRequest);

    /**
     * <p>
     * Associates a discovered resource ID from Application Discovery Service (ADS) with a migration task.
     * </p>
     * 
     * @param associateDiscoveredResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateDiscoveredResource operation returned by the service.
     * @sample AWSMigrationHubAsyncHandler.AssociateDiscoveredResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/AssociateDiscoveredResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateDiscoveredResourceResult> associateDiscoveredResourceAsync(
            AssociateDiscoveredResourceRequest associateDiscoveredResourceRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateDiscoveredResourceRequest, AssociateDiscoveredResourceResult> asyncHandler);

    /**
     * <p>
     * Creates a progress update stream which is an AWS resource used for access control as well as a namespace for
     * migration task names that is implicitly linked to your AWS account. It must uniquely identify the migration tool
     * as it is used for all updates made by the tool; however, it does not need to be unique for each AWS account
     * because it is scoped to the AWS account.
     * </p>
     * 
     * @param createProgressUpdateStreamRequest
     * @return A Java Future containing the result of the CreateProgressUpdateStream operation returned by the service.
     * @sample AWSMigrationHubAsync.CreateProgressUpdateStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/CreateProgressUpdateStream"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateProgressUpdateStreamResult> createProgressUpdateStreamAsync(
            CreateProgressUpdateStreamRequest createProgressUpdateStreamRequest);

    /**
     * <p>
     * Creates a progress update stream which is an AWS resource used for access control as well as a namespace for
     * migration task names that is implicitly linked to your AWS account. It must uniquely identify the migration tool
     * as it is used for all updates made by the tool; however, it does not need to be unique for each AWS account
     * because it is scoped to the AWS account.
     * </p>
     * 
     * @param createProgressUpdateStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProgressUpdateStream operation returned by the service.
     * @sample AWSMigrationHubAsyncHandler.CreateProgressUpdateStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/CreateProgressUpdateStream"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateProgressUpdateStreamResult> createProgressUpdateStreamAsync(
            CreateProgressUpdateStreamRequest createProgressUpdateStreamRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProgressUpdateStreamRequest, CreateProgressUpdateStreamResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteProgressUpdateStream operation returned by the service.
     * @sample AWSMigrationHubAsync.DeleteProgressUpdateStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/DeleteProgressUpdateStream"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProgressUpdateStreamResult> deleteProgressUpdateStreamAsync(
            DeleteProgressUpdateStreamRequest deleteProgressUpdateStreamRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProgressUpdateStream operation returned by the service.
     * @sample AWSMigrationHubAsyncHandler.DeleteProgressUpdateStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/DeleteProgressUpdateStream"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProgressUpdateStreamResult> deleteProgressUpdateStreamAsync(
            DeleteProgressUpdateStreamRequest deleteProgressUpdateStreamRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProgressUpdateStreamRequest, DeleteProgressUpdateStreamResult> asyncHandler);

    /**
     * <p>
     * Gets the migration status of an application.
     * </p>
     * 
     * @param describeApplicationStateRequest
     * @return A Java Future containing the result of the DescribeApplicationState operation returned by the service.
     * @sample AWSMigrationHubAsync.DescribeApplicationState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/DescribeApplicationState"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeApplicationStateResult> describeApplicationStateAsync(DescribeApplicationStateRequest describeApplicationStateRequest);

    /**
     * <p>
     * Gets the migration status of an application.
     * </p>
     * 
     * @param describeApplicationStateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeApplicationState operation returned by the service.
     * @sample AWSMigrationHubAsyncHandler.DescribeApplicationState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/DescribeApplicationState"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeApplicationStateResult> describeApplicationStateAsync(DescribeApplicationStateRequest describeApplicationStateRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationStateRequest, DescribeApplicationStateResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of all attributes associated with a specific migration task.
     * </p>
     * 
     * @param describeMigrationTaskRequest
     * @return A Java Future containing the result of the DescribeMigrationTask operation returned by the service.
     * @sample AWSMigrationHubAsync.DescribeMigrationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/DescribeMigrationTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMigrationTaskResult> describeMigrationTaskAsync(DescribeMigrationTaskRequest describeMigrationTaskRequest);

    /**
     * <p>
     * Retrieves a list of all attributes associated with a specific migration task.
     * </p>
     * 
     * @param describeMigrationTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMigrationTask operation returned by the service.
     * @sample AWSMigrationHubAsyncHandler.DescribeMigrationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/DescribeMigrationTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMigrationTaskResult> describeMigrationTaskAsync(DescribeMigrationTaskRequest describeMigrationTaskRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMigrationTaskRequest, DescribeMigrationTaskResult> asyncHandler);

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
     * @return A Java Future containing the result of the DisassociateCreatedArtifact operation returned by the service.
     * @sample AWSMigrationHubAsync.DisassociateCreatedArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/DisassociateCreatedArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateCreatedArtifactResult> disassociateCreatedArtifactAsync(
            DisassociateCreatedArtifactRequest disassociateCreatedArtifactRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateCreatedArtifact operation returned by the service.
     * @sample AWSMigrationHubAsyncHandler.DisassociateCreatedArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/DisassociateCreatedArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateCreatedArtifactResult> disassociateCreatedArtifactAsync(
            DisassociateCreatedArtifactRequest disassociateCreatedArtifactRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateCreatedArtifactRequest, DisassociateCreatedArtifactResult> asyncHandler);

    /**
     * <p>
     * Disassociate an Application Discovery Service (ADS) discovered resource from a migration task.
     * </p>
     * 
     * @param disassociateDiscoveredResourceRequest
     * @return A Java Future containing the result of the DisassociateDiscoveredResource operation returned by the
     *         service.
     * @sample AWSMigrationHubAsync.DisassociateDiscoveredResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/DisassociateDiscoveredResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateDiscoveredResourceResult> disassociateDiscoveredResourceAsync(
            DisassociateDiscoveredResourceRequest disassociateDiscoveredResourceRequest);

    /**
     * <p>
     * Disassociate an Application Discovery Service (ADS) discovered resource from a migration task.
     * </p>
     * 
     * @param disassociateDiscoveredResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateDiscoveredResource operation returned by the
     *         service.
     * @sample AWSMigrationHubAsyncHandler.DisassociateDiscoveredResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/DisassociateDiscoveredResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateDiscoveredResourceResult> disassociateDiscoveredResourceAsync(
            DisassociateDiscoveredResourceRequest disassociateDiscoveredResourceRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateDiscoveredResourceRequest, DisassociateDiscoveredResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the ImportMigrationTask operation returned by the service.
     * @sample AWSMigrationHubAsync.ImportMigrationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ImportMigrationTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportMigrationTaskResult> importMigrationTaskAsync(ImportMigrationTaskRequest importMigrationTaskRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportMigrationTask operation returned by the service.
     * @sample AWSMigrationHubAsyncHandler.ImportMigrationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ImportMigrationTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportMigrationTaskResult> importMigrationTaskAsync(ImportMigrationTaskRequest importMigrationTaskRequest,
            com.amazonaws.handlers.AsyncHandler<ImportMigrationTaskRequest, ImportMigrationTaskResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListCreatedArtifacts operation returned by the service.
     * @sample AWSMigrationHubAsync.ListCreatedArtifacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ListCreatedArtifacts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCreatedArtifactsResult> listCreatedArtifactsAsync(ListCreatedArtifactsRequest listCreatedArtifactsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCreatedArtifacts operation returned by the service.
     * @sample AWSMigrationHubAsyncHandler.ListCreatedArtifacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ListCreatedArtifacts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCreatedArtifactsResult> listCreatedArtifactsAsync(ListCreatedArtifactsRequest listCreatedArtifactsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCreatedArtifactsRequest, ListCreatedArtifactsResult> asyncHandler);

    /**
     * <p>
     * Lists discovered resources associated with the given <code>MigrationTask</code>.
     * </p>
     * 
     * @param listDiscoveredResourcesRequest
     * @return A Java Future containing the result of the ListDiscoveredResources operation returned by the service.
     * @sample AWSMigrationHubAsync.ListDiscoveredResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ListDiscoveredResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDiscoveredResourcesResult> listDiscoveredResourcesAsync(ListDiscoveredResourcesRequest listDiscoveredResourcesRequest);

    /**
     * <p>
     * Lists discovered resources associated with the given <code>MigrationTask</code>.
     * </p>
     * 
     * @param listDiscoveredResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDiscoveredResources operation returned by the service.
     * @sample AWSMigrationHubAsyncHandler.ListDiscoveredResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ListDiscoveredResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDiscoveredResourcesResult> listDiscoveredResourcesAsync(ListDiscoveredResourcesRequest listDiscoveredResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDiscoveredResourcesRequest, ListDiscoveredResourcesResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListMigrationTasks operation returned by the service.
     * @sample AWSMigrationHubAsync.ListMigrationTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ListMigrationTasks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMigrationTasksResult> listMigrationTasksAsync(ListMigrationTasksRequest listMigrationTasksRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMigrationTasks operation returned by the service.
     * @sample AWSMigrationHubAsyncHandler.ListMigrationTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ListMigrationTasks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMigrationTasksResult> listMigrationTasksAsync(ListMigrationTasksRequest listMigrationTasksRequest,
            com.amazonaws.handlers.AsyncHandler<ListMigrationTasksRequest, ListMigrationTasksResult> asyncHandler);

    /**
     * <p>
     * Lists progress update streams associated with the user account making this call.
     * </p>
     * 
     * @param listProgressUpdateStreamsRequest
     * @return A Java Future containing the result of the ListProgressUpdateStreams operation returned by the service.
     * @sample AWSMigrationHubAsync.ListProgressUpdateStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ListProgressUpdateStreams"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProgressUpdateStreamsResult> listProgressUpdateStreamsAsync(
            ListProgressUpdateStreamsRequest listProgressUpdateStreamsRequest);

    /**
     * <p>
     * Lists progress update streams associated with the user account making this call.
     * </p>
     * 
     * @param listProgressUpdateStreamsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProgressUpdateStreams operation returned by the service.
     * @sample AWSMigrationHubAsyncHandler.ListProgressUpdateStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ListProgressUpdateStreams"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProgressUpdateStreamsResult> listProgressUpdateStreamsAsync(
            ListProgressUpdateStreamsRequest listProgressUpdateStreamsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProgressUpdateStreamsRequest, ListProgressUpdateStreamsResult> asyncHandler);

    /**
     * <p>
     * Sets the migration state of an application. For a given application identified by the value passed to
     * <code>ApplicationId</code>, its status is set or updated by passing one of three values to <code>Status</code>:
     * <code>NOT_STARTED | IN_PROGRESS | COMPLETED</code>.
     * </p>
     * 
     * @param notifyApplicationStateRequest
     * @return A Java Future containing the result of the NotifyApplicationState operation returned by the service.
     * @sample AWSMigrationHubAsync.NotifyApplicationState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/NotifyApplicationState"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<NotifyApplicationStateResult> notifyApplicationStateAsync(NotifyApplicationStateRequest notifyApplicationStateRequest);

    /**
     * <p>
     * Sets the migration state of an application. For a given application identified by the value passed to
     * <code>ApplicationId</code>, its status is set or updated by passing one of three values to <code>Status</code>:
     * <code>NOT_STARTED | IN_PROGRESS | COMPLETED</code>.
     * </p>
     * 
     * @param notifyApplicationStateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the NotifyApplicationState operation returned by the service.
     * @sample AWSMigrationHubAsyncHandler.NotifyApplicationState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/NotifyApplicationState"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<NotifyApplicationStateResult> notifyApplicationStateAsync(NotifyApplicationStateRequest notifyApplicationStateRequest,
            com.amazonaws.handlers.AsyncHandler<NotifyApplicationStateRequest, NotifyApplicationStateResult> asyncHandler);

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
     * @return A Java Future containing the result of the NotifyMigrationTaskState operation returned by the service.
     * @sample AWSMigrationHubAsync.NotifyMigrationTaskState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/NotifyMigrationTaskState"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<NotifyMigrationTaskStateResult> notifyMigrationTaskStateAsync(NotifyMigrationTaskStateRequest notifyMigrationTaskStateRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the NotifyMigrationTaskState operation returned by the service.
     * @sample AWSMigrationHubAsyncHandler.NotifyMigrationTaskState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/NotifyMigrationTaskState"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<NotifyMigrationTaskStateResult> notifyMigrationTaskStateAsync(NotifyMigrationTaskStateRequest notifyMigrationTaskStateRequest,
            com.amazonaws.handlers.AsyncHandler<NotifyMigrationTaskStateRequest, NotifyMigrationTaskStateResult> asyncHandler);

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
     * @return A Java Future containing the result of the PutResourceAttributes operation returned by the service.
     * @sample AWSMigrationHubAsync.PutResourceAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/PutResourceAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutResourceAttributesResult> putResourceAttributesAsync(PutResourceAttributesRequest putResourceAttributesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutResourceAttributes operation returned by the service.
     * @sample AWSMigrationHubAsyncHandler.PutResourceAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/PutResourceAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutResourceAttributesResult> putResourceAttributesAsync(PutResourceAttributesRequest putResourceAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<PutResourceAttributesRequest, PutResourceAttributesResult> asyncHandler);

}
