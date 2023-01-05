/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.drs;

import javax.annotation.Generated;

import com.amazonaws.services.drs.model.*;

/**
 * Interface for accessing drs asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.drs.AbstractAWSdrsAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS Elastic Disaster Recovery Service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSdrsAsync extends AWSdrs {

    /**
     * <p>
     * Create an extended source server in the target Account based on the source server in staging account.
     * </p>
     * 
     * @param createExtendedSourceServerRequest
     * @return A Java Future containing the result of the CreateExtendedSourceServer operation returned by the service.
     * @sample AWSdrsAsync.CreateExtendedSourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/CreateExtendedSourceServer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateExtendedSourceServerResult> createExtendedSourceServerAsync(
            CreateExtendedSourceServerRequest createExtendedSourceServerRequest);

    /**
     * <p>
     * Create an extended source server in the target Account based on the source server in staging account.
     * </p>
     * 
     * @param createExtendedSourceServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateExtendedSourceServer operation returned by the service.
     * @sample AWSdrsAsyncHandler.CreateExtendedSourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/CreateExtendedSourceServer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateExtendedSourceServerResult> createExtendedSourceServerAsync(
            CreateExtendedSourceServerRequest createExtendedSourceServerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateExtendedSourceServerRequest, CreateExtendedSourceServerResult> asyncHandler);

    /**
     * <p>
     * Creates a new ReplicationConfigurationTemplate.
     * </p>
     * 
     * @param createReplicationConfigurationTemplateRequest
     * @return A Java Future containing the result of the CreateReplicationConfigurationTemplate operation returned by
     *         the service.
     * @sample AWSdrsAsync.CreateReplicationConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/CreateReplicationConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateReplicationConfigurationTemplateResult> createReplicationConfigurationTemplateAsync(
            CreateReplicationConfigurationTemplateRequest createReplicationConfigurationTemplateRequest);

    /**
     * <p>
     * Creates a new ReplicationConfigurationTemplate.
     * </p>
     * 
     * @param createReplicationConfigurationTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateReplicationConfigurationTemplate operation returned by
     *         the service.
     * @sample AWSdrsAsyncHandler.CreateReplicationConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/CreateReplicationConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateReplicationConfigurationTemplateResult> createReplicationConfigurationTemplateAsync(
            CreateReplicationConfigurationTemplateRequest createReplicationConfigurationTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReplicationConfigurationTemplateRequest, CreateReplicationConfigurationTemplateResult> asyncHandler);

    /**
     * <p>
     * Deletes a single Job by ID.
     * </p>
     * 
     * @param deleteJobRequest
     * @return A Java Future containing the result of the DeleteJob operation returned by the service.
     * @sample AWSdrsAsync.DeleteJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DeleteJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteJobResult> deleteJobAsync(DeleteJobRequest deleteJobRequest);

    /**
     * <p>
     * Deletes a single Job by ID.
     * </p>
     * 
     * @param deleteJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteJob operation returned by the service.
     * @sample AWSdrsAsyncHandler.DeleteJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DeleteJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteJobResult> deleteJobAsync(DeleteJobRequest deleteJobRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteJobRequest, DeleteJobResult> asyncHandler);

    /**
     * <p>
     * Deletes a single Recovery Instance by ID. This deletes the Recovery Instance resource from Elastic Disaster
     * Recovery. The Recovery Instance must be disconnected first in order to delete it.
     * </p>
     * 
     * @param deleteRecoveryInstanceRequest
     * @return A Java Future containing the result of the DeleteRecoveryInstance operation returned by the service.
     * @sample AWSdrsAsync.DeleteRecoveryInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DeleteRecoveryInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRecoveryInstanceResult> deleteRecoveryInstanceAsync(DeleteRecoveryInstanceRequest deleteRecoveryInstanceRequest);

    /**
     * <p>
     * Deletes a single Recovery Instance by ID. This deletes the Recovery Instance resource from Elastic Disaster
     * Recovery. The Recovery Instance must be disconnected first in order to delete it.
     * </p>
     * 
     * @param deleteRecoveryInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRecoveryInstance operation returned by the service.
     * @sample AWSdrsAsyncHandler.DeleteRecoveryInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DeleteRecoveryInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRecoveryInstanceResult> deleteRecoveryInstanceAsync(DeleteRecoveryInstanceRequest deleteRecoveryInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRecoveryInstanceRequest, DeleteRecoveryInstanceResult> asyncHandler);

    /**
     * <p>
     * Deletes a single Replication Configuration Template by ID
     * </p>
     * 
     * @param deleteReplicationConfigurationTemplateRequest
     * @return A Java Future containing the result of the DeleteReplicationConfigurationTemplate operation returned by
     *         the service.
     * @sample AWSdrsAsync.DeleteReplicationConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DeleteReplicationConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReplicationConfigurationTemplateResult> deleteReplicationConfigurationTemplateAsync(
            DeleteReplicationConfigurationTemplateRequest deleteReplicationConfigurationTemplateRequest);

    /**
     * <p>
     * Deletes a single Replication Configuration Template by ID
     * </p>
     * 
     * @param deleteReplicationConfigurationTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReplicationConfigurationTemplate operation returned by
     *         the service.
     * @sample AWSdrsAsyncHandler.DeleteReplicationConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DeleteReplicationConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReplicationConfigurationTemplateResult> deleteReplicationConfigurationTemplateAsync(
            DeleteReplicationConfigurationTemplateRequest deleteReplicationConfigurationTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReplicationConfigurationTemplateRequest, DeleteReplicationConfigurationTemplateResult> asyncHandler);

    /**
     * <p>
     * Deletes a single Source Server by ID. The Source Server must be disconnected first.
     * </p>
     * 
     * @param deleteSourceServerRequest
     * @return A Java Future containing the result of the DeleteSourceServer operation returned by the service.
     * @sample AWSdrsAsync.DeleteSourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DeleteSourceServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSourceServerResult> deleteSourceServerAsync(DeleteSourceServerRequest deleteSourceServerRequest);

    /**
     * <p>
     * Deletes a single Source Server by ID. The Source Server must be disconnected first.
     * </p>
     * 
     * @param deleteSourceServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSourceServer operation returned by the service.
     * @sample AWSdrsAsyncHandler.DeleteSourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DeleteSourceServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSourceServerResult> deleteSourceServerAsync(DeleteSourceServerRequest deleteSourceServerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSourceServerRequest, DeleteSourceServerResult> asyncHandler);

    /**
     * <p>
     * Retrieves a detailed Job log with pagination.
     * </p>
     * 
     * @param describeJobLogItemsRequest
     * @return A Java Future containing the result of the DescribeJobLogItems operation returned by the service.
     * @sample AWSdrsAsync.DescribeJobLogItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeJobLogItems" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeJobLogItemsResult> describeJobLogItemsAsync(DescribeJobLogItemsRequest describeJobLogItemsRequest);

    /**
     * <p>
     * Retrieves a detailed Job log with pagination.
     * </p>
     * 
     * @param describeJobLogItemsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeJobLogItems operation returned by the service.
     * @sample AWSdrsAsyncHandler.DescribeJobLogItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeJobLogItems" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeJobLogItemsResult> describeJobLogItemsAsync(DescribeJobLogItemsRequest describeJobLogItemsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeJobLogItemsRequest, DescribeJobLogItemsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of Jobs. Use the JobsID and fromDate and toDate filters to limit which jobs are returned. The
     * response is sorted by creationDataTime - latest date first. Jobs are created by the StartRecovery,
     * TerminateRecoveryInstances and StartFailbackLaunch APIs. Jobs are also created by DiagnosticLaunch and
     * TerminateDiagnosticInstances, which are APIs available only to *Support* and only used in response to relevant
     * support tickets.
     * </p>
     * 
     * @param describeJobsRequest
     * @return A Java Future containing the result of the DescribeJobs operation returned by the service.
     * @sample AWSdrsAsync.DescribeJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeJobsResult> describeJobsAsync(DescribeJobsRequest describeJobsRequest);

    /**
     * <p>
     * Returns a list of Jobs. Use the JobsID and fromDate and toDate filters to limit which jobs are returned. The
     * response is sorted by creationDataTime - latest date first. Jobs are created by the StartRecovery,
     * TerminateRecoveryInstances and StartFailbackLaunch APIs. Jobs are also created by DiagnosticLaunch and
     * TerminateDiagnosticInstances, which are APIs available only to *Support* and only used in response to relevant
     * support tickets.
     * </p>
     * 
     * @param describeJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeJobs operation returned by the service.
     * @sample AWSdrsAsyncHandler.DescribeJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeJobsResult> describeJobsAsync(DescribeJobsRequest describeJobsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeJobsRequest, DescribeJobsResult> asyncHandler);

    /**
     * <p>
     * Lists all Recovery Instances or multiple Recovery Instances by ID.
     * </p>
     * 
     * @param describeRecoveryInstancesRequest
     * @return A Java Future containing the result of the DescribeRecoveryInstances operation returned by the service.
     * @sample AWSdrsAsync.DescribeRecoveryInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeRecoveryInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRecoveryInstancesResult> describeRecoveryInstancesAsync(
            DescribeRecoveryInstancesRequest describeRecoveryInstancesRequest);

    /**
     * <p>
     * Lists all Recovery Instances or multiple Recovery Instances by ID.
     * </p>
     * 
     * @param describeRecoveryInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRecoveryInstances operation returned by the service.
     * @sample AWSdrsAsyncHandler.DescribeRecoveryInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeRecoveryInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRecoveryInstancesResult> describeRecoveryInstancesAsync(
            DescribeRecoveryInstancesRequest describeRecoveryInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRecoveryInstancesRequest, DescribeRecoveryInstancesResult> asyncHandler);

    /**
     * <p>
     * Lists all Recovery Snapshots for a single Source Server.
     * </p>
     * 
     * @param describeRecoverySnapshotsRequest
     * @return A Java Future containing the result of the DescribeRecoverySnapshots operation returned by the service.
     * @sample AWSdrsAsync.DescribeRecoverySnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeRecoverySnapshots" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRecoverySnapshotsResult> describeRecoverySnapshotsAsync(
            DescribeRecoverySnapshotsRequest describeRecoverySnapshotsRequest);

    /**
     * <p>
     * Lists all Recovery Snapshots for a single Source Server.
     * </p>
     * 
     * @param describeRecoverySnapshotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRecoverySnapshots operation returned by the service.
     * @sample AWSdrsAsyncHandler.DescribeRecoverySnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeRecoverySnapshots" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRecoverySnapshotsResult> describeRecoverySnapshotsAsync(
            DescribeRecoverySnapshotsRequest describeRecoverySnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRecoverySnapshotsRequest, DescribeRecoverySnapshotsResult> asyncHandler);

    /**
     * <p>
     * Lists all ReplicationConfigurationTemplates, filtered by Source Server IDs.
     * </p>
     * 
     * @param describeReplicationConfigurationTemplatesRequest
     * @return A Java Future containing the result of the DescribeReplicationConfigurationTemplates operation returned
     *         by the service.
     * @sample AWSdrsAsync.DescribeReplicationConfigurationTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeReplicationConfigurationTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReplicationConfigurationTemplatesResult> describeReplicationConfigurationTemplatesAsync(
            DescribeReplicationConfigurationTemplatesRequest describeReplicationConfigurationTemplatesRequest);

    /**
     * <p>
     * Lists all ReplicationConfigurationTemplates, filtered by Source Server IDs.
     * </p>
     * 
     * @param describeReplicationConfigurationTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReplicationConfigurationTemplates operation returned
     *         by the service.
     * @sample AWSdrsAsyncHandler.DescribeReplicationConfigurationTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeReplicationConfigurationTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReplicationConfigurationTemplatesResult> describeReplicationConfigurationTemplatesAsync(
            DescribeReplicationConfigurationTemplatesRequest describeReplicationConfigurationTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReplicationConfigurationTemplatesRequest, DescribeReplicationConfigurationTemplatesResult> asyncHandler);

    /**
     * <p>
     * Lists all Source Servers or multiple Source Servers filtered by ID.
     * </p>
     * 
     * @param describeSourceServersRequest
     * @return A Java Future containing the result of the DescribeSourceServers operation returned by the service.
     * @sample AWSdrsAsync.DescribeSourceServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeSourceServers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSourceServersResult> describeSourceServersAsync(DescribeSourceServersRequest describeSourceServersRequest);

    /**
     * <p>
     * Lists all Source Servers or multiple Source Servers filtered by ID.
     * </p>
     * 
     * @param describeSourceServersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSourceServers operation returned by the service.
     * @sample AWSdrsAsyncHandler.DescribeSourceServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeSourceServers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSourceServersResult> describeSourceServersAsync(DescribeSourceServersRequest describeSourceServersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSourceServersRequest, DescribeSourceServersResult> asyncHandler);

    /**
     * <p>
     * Disconnect a Recovery Instance from Elastic Disaster Recovery. Data replication is stopped immediately. All AWS
     * resources created by Elastic Disaster Recovery for enabling the replication of the Recovery Instance will be
     * terminated / deleted within 90 minutes. If the agent on the Recovery Instance has not been prevented from
     * communicating with the Elastic Disaster Recovery service, then it will receive a command to uninstall itself
     * (within approximately 10 minutes). The following properties of the Recovery Instance will be changed immediately:
     * dataReplicationInfo.dataReplicationState will be set to DISCONNECTED; The totalStorageBytes property for each of
     * dataReplicationInfo.replicatedDisks will be set to zero; dataReplicationInfo.lagDuration and
     * dataReplicationInfo.lagDuration will be nullified.
     * </p>
     * 
     * @param disconnectRecoveryInstanceRequest
     * @return A Java Future containing the result of the DisconnectRecoveryInstance operation returned by the service.
     * @sample AWSdrsAsync.DisconnectRecoveryInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DisconnectRecoveryInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisconnectRecoveryInstanceResult> disconnectRecoveryInstanceAsync(
            DisconnectRecoveryInstanceRequest disconnectRecoveryInstanceRequest);

    /**
     * <p>
     * Disconnect a Recovery Instance from Elastic Disaster Recovery. Data replication is stopped immediately. All AWS
     * resources created by Elastic Disaster Recovery for enabling the replication of the Recovery Instance will be
     * terminated / deleted within 90 minutes. If the agent on the Recovery Instance has not been prevented from
     * communicating with the Elastic Disaster Recovery service, then it will receive a command to uninstall itself
     * (within approximately 10 minutes). The following properties of the Recovery Instance will be changed immediately:
     * dataReplicationInfo.dataReplicationState will be set to DISCONNECTED; The totalStorageBytes property for each of
     * dataReplicationInfo.replicatedDisks will be set to zero; dataReplicationInfo.lagDuration and
     * dataReplicationInfo.lagDuration will be nullified.
     * </p>
     * 
     * @param disconnectRecoveryInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisconnectRecoveryInstance operation returned by the service.
     * @sample AWSdrsAsyncHandler.DisconnectRecoveryInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DisconnectRecoveryInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisconnectRecoveryInstanceResult> disconnectRecoveryInstanceAsync(
            DisconnectRecoveryInstanceRequest disconnectRecoveryInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DisconnectRecoveryInstanceRequest, DisconnectRecoveryInstanceResult> asyncHandler);

    /**
     * <p>
     * Disconnects a specific Source Server from Elastic Disaster Recovery. Data replication is stopped immediately. All
     * AWS resources created by Elastic Disaster Recovery for enabling the replication of the Source Server will be
     * terminated / deleted within 90 minutes. You cannot disconnect a Source Server if it has a Recovery Instance. If
     * the agent on the Source Server has not been prevented from communicating with the Elastic Disaster Recovery
     * service, then it will receive a command to uninstall itself (within approximately 10 minutes). The following
     * properties of the SourceServer will be changed immediately: dataReplicationInfo.dataReplicationState will be set
     * to DISCONNECTED; The totalStorageBytes property for each of dataReplicationInfo.replicatedDisks will be set to
     * zero; dataReplicationInfo.lagDuration and dataReplicationInfo.lagDuration will be nullified.
     * </p>
     * 
     * @param disconnectSourceServerRequest
     * @return A Java Future containing the result of the DisconnectSourceServer operation returned by the service.
     * @sample AWSdrsAsync.DisconnectSourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DisconnectSourceServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisconnectSourceServerResult> disconnectSourceServerAsync(DisconnectSourceServerRequest disconnectSourceServerRequest);

    /**
     * <p>
     * Disconnects a specific Source Server from Elastic Disaster Recovery. Data replication is stopped immediately. All
     * AWS resources created by Elastic Disaster Recovery for enabling the replication of the Source Server will be
     * terminated / deleted within 90 minutes. You cannot disconnect a Source Server if it has a Recovery Instance. If
     * the agent on the Source Server has not been prevented from communicating with the Elastic Disaster Recovery
     * service, then it will receive a command to uninstall itself (within approximately 10 minutes). The following
     * properties of the SourceServer will be changed immediately: dataReplicationInfo.dataReplicationState will be set
     * to DISCONNECTED; The totalStorageBytes property for each of dataReplicationInfo.replicatedDisks will be set to
     * zero; dataReplicationInfo.lagDuration and dataReplicationInfo.lagDuration will be nullified.
     * </p>
     * 
     * @param disconnectSourceServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisconnectSourceServer operation returned by the service.
     * @sample AWSdrsAsyncHandler.DisconnectSourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DisconnectSourceServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisconnectSourceServerResult> disconnectSourceServerAsync(DisconnectSourceServerRequest disconnectSourceServerRequest,
            com.amazonaws.handlers.AsyncHandler<DisconnectSourceServerRequest, DisconnectSourceServerResult> asyncHandler);

    /**
     * <p>
     * Lists all Failback ReplicationConfigurations, filtered by Recovery Instance ID.
     * </p>
     * 
     * @param getFailbackReplicationConfigurationRequest
     * @return A Java Future containing the result of the GetFailbackReplicationConfiguration operation returned by the
     *         service.
     * @sample AWSdrsAsync.GetFailbackReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/GetFailbackReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFailbackReplicationConfigurationResult> getFailbackReplicationConfigurationAsync(
            GetFailbackReplicationConfigurationRequest getFailbackReplicationConfigurationRequest);

    /**
     * <p>
     * Lists all Failback ReplicationConfigurations, filtered by Recovery Instance ID.
     * </p>
     * 
     * @param getFailbackReplicationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFailbackReplicationConfiguration operation returned by the
     *         service.
     * @sample AWSdrsAsyncHandler.GetFailbackReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/GetFailbackReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFailbackReplicationConfigurationResult> getFailbackReplicationConfigurationAsync(
            GetFailbackReplicationConfigurationRequest getFailbackReplicationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetFailbackReplicationConfigurationRequest, GetFailbackReplicationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets a LaunchConfiguration, filtered by Source Server IDs.
     * </p>
     * 
     * @param getLaunchConfigurationRequest
     * @return A Java Future containing the result of the GetLaunchConfiguration operation returned by the service.
     * @sample AWSdrsAsync.GetLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/GetLaunchConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLaunchConfigurationResult> getLaunchConfigurationAsync(GetLaunchConfigurationRequest getLaunchConfigurationRequest);

    /**
     * <p>
     * Gets a LaunchConfiguration, filtered by Source Server IDs.
     * </p>
     * 
     * @param getLaunchConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLaunchConfiguration operation returned by the service.
     * @sample AWSdrsAsyncHandler.GetLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/GetLaunchConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLaunchConfigurationResult> getLaunchConfigurationAsync(GetLaunchConfigurationRequest getLaunchConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetLaunchConfigurationRequest, GetLaunchConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets a ReplicationConfiguration, filtered by Source Server ID.
     * </p>
     * 
     * @param getReplicationConfigurationRequest
     * @return A Java Future containing the result of the GetReplicationConfiguration operation returned by the service.
     * @sample AWSdrsAsync.GetReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/GetReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReplicationConfigurationResult> getReplicationConfigurationAsync(
            GetReplicationConfigurationRequest getReplicationConfigurationRequest);

    /**
     * <p>
     * Gets a ReplicationConfiguration, filtered by Source Server ID.
     * </p>
     * 
     * @param getReplicationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReplicationConfiguration operation returned by the service.
     * @sample AWSdrsAsyncHandler.GetReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/GetReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReplicationConfigurationResult> getReplicationConfigurationAsync(
            GetReplicationConfigurationRequest getReplicationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetReplicationConfigurationRequest, GetReplicationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Initialize Elastic Disaster Recovery.
     * </p>
     * 
     * @param initializeServiceRequest
     * @return A Java Future containing the result of the InitializeService operation returned by the service.
     * @sample AWSdrsAsync.InitializeService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/InitializeService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InitializeServiceResult> initializeServiceAsync(InitializeServiceRequest initializeServiceRequest);

    /**
     * <p>
     * Initialize Elastic Disaster Recovery.
     * </p>
     * 
     * @param initializeServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InitializeService operation returned by the service.
     * @sample AWSdrsAsyncHandler.InitializeService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/InitializeService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InitializeServiceResult> initializeServiceAsync(InitializeServiceRequest initializeServiceRequest,
            com.amazonaws.handlers.AsyncHandler<InitializeServiceRequest, InitializeServiceResult> asyncHandler);

    /**
     * <p>
     * Returns a list of source servers on a staging account that are extensible, which means that: a. The source server
     * is not already extended into this Account. b. The source server on the Account we’re reading from is not an
     * extension of another source server.
     * </p>
     * 
     * @param listExtensibleSourceServersRequest
     * @return A Java Future containing the result of the ListExtensibleSourceServers operation returned by the service.
     * @sample AWSdrsAsync.ListExtensibleSourceServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/ListExtensibleSourceServers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListExtensibleSourceServersResult> listExtensibleSourceServersAsync(
            ListExtensibleSourceServersRequest listExtensibleSourceServersRequest);

    /**
     * <p>
     * Returns a list of source servers on a staging account that are extensible, which means that: a. The source server
     * is not already extended into this Account. b. The source server on the Account we’re reading from is not an
     * extension of another source server.
     * </p>
     * 
     * @param listExtensibleSourceServersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListExtensibleSourceServers operation returned by the service.
     * @sample AWSdrsAsyncHandler.ListExtensibleSourceServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/ListExtensibleSourceServers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListExtensibleSourceServersResult> listExtensibleSourceServersAsync(
            ListExtensibleSourceServersRequest listExtensibleSourceServersRequest,
            com.amazonaws.handlers.AsyncHandler<ListExtensibleSourceServersRequest, ListExtensibleSourceServersResult> asyncHandler);

    /**
     * <p>
     * Returns an array of staging accounts for existing extended source servers.
     * </p>
     * 
     * @param listStagingAccountsRequest
     * @return A Java Future containing the result of the ListStagingAccounts operation returned by the service.
     * @sample AWSdrsAsync.ListStagingAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/ListStagingAccounts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStagingAccountsResult> listStagingAccountsAsync(ListStagingAccountsRequest listStagingAccountsRequest);

    /**
     * <p>
     * Returns an array of staging accounts for existing extended source servers.
     * </p>
     * 
     * @param listStagingAccountsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStagingAccounts operation returned by the service.
     * @sample AWSdrsAsyncHandler.ListStagingAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/ListStagingAccounts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStagingAccountsResult> listStagingAccountsAsync(ListStagingAccountsRequest listStagingAccountsRequest,
            com.amazonaws.handlers.AsyncHandler<ListStagingAccountsRequest, ListStagingAccountsResult> asyncHandler);

    /**
     * <p>
     * List all tags for your Elastic Disaster Recovery resources.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSdrsAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List all tags for your Elastic Disaster Recovery resources.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSdrsAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Causes the data replication initiation sequence to begin immediately upon next Handshake for the specified Source
     * Server ID, regardless of when the previous initiation started. This command will work only if the Source Server
     * is stalled or is in a DISCONNECTED or STOPPED state.
     * </p>
     * 
     * @param retryDataReplicationRequest
     * @return A Java Future containing the result of the RetryDataReplication operation returned by the service.
     * @sample AWSdrsAsync.RetryDataReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/RetryDataReplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RetryDataReplicationResult> retryDataReplicationAsync(RetryDataReplicationRequest retryDataReplicationRequest);

    /**
     * <p>
     * Causes the data replication initiation sequence to begin immediately upon next Handshake for the specified Source
     * Server ID, regardless of when the previous initiation started. This command will work only if the Source Server
     * is stalled or is in a DISCONNECTED or STOPPED state.
     * </p>
     * 
     * @param retryDataReplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RetryDataReplication operation returned by the service.
     * @sample AWSdrsAsyncHandler.RetryDataReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/RetryDataReplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RetryDataReplicationResult> retryDataReplicationAsync(RetryDataReplicationRequest retryDataReplicationRequest,
            com.amazonaws.handlers.AsyncHandler<RetryDataReplicationRequest, RetryDataReplicationResult> asyncHandler);

    /**
     * <p>
     * Start replication to origin / target region - applies only to protected instances that originated in EC2. For
     * recovery instances on target region - starts replication back to origin region. For failback instances on origin
     * region - starts replication to target region to re-protect them.
     * </p>
     * 
     * @param reverseReplicationRequest
     * @return A Java Future containing the result of the ReverseReplication operation returned by the service.
     * @sample AWSdrsAsync.ReverseReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/ReverseReplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReverseReplicationResult> reverseReplicationAsync(ReverseReplicationRequest reverseReplicationRequest);

    /**
     * <p>
     * Start replication to origin / target region - applies only to protected instances that originated in EC2. For
     * recovery instances on target region - starts replication back to origin region. For failback instances on origin
     * region - starts replication to target region to re-protect them.
     * </p>
     * 
     * @param reverseReplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReverseReplication operation returned by the service.
     * @sample AWSdrsAsyncHandler.ReverseReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/ReverseReplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReverseReplicationResult> reverseReplicationAsync(ReverseReplicationRequest reverseReplicationRequest,
            com.amazonaws.handlers.AsyncHandler<ReverseReplicationRequest, ReverseReplicationResult> asyncHandler);

    /**
     * <p>
     * Initiates a Job for launching the machine that is being failed back to from the specified Recovery Instance. This
     * will run conversion on the failback client and will reboot your machine, thus completing the failback process.
     * </p>
     * 
     * @param startFailbackLaunchRequest
     * @return A Java Future containing the result of the StartFailbackLaunch operation returned by the service.
     * @sample AWSdrsAsync.StartFailbackLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StartFailbackLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartFailbackLaunchResult> startFailbackLaunchAsync(StartFailbackLaunchRequest startFailbackLaunchRequest);

    /**
     * <p>
     * Initiates a Job for launching the machine that is being failed back to from the specified Recovery Instance. This
     * will run conversion on the failback client and will reboot your machine, thus completing the failback process.
     * </p>
     * 
     * @param startFailbackLaunchRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartFailbackLaunch operation returned by the service.
     * @sample AWSdrsAsyncHandler.StartFailbackLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StartFailbackLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartFailbackLaunchResult> startFailbackLaunchAsync(StartFailbackLaunchRequest startFailbackLaunchRequest,
            com.amazonaws.handlers.AsyncHandler<StartFailbackLaunchRequest, StartFailbackLaunchResult> asyncHandler);

    /**
     * <p>
     * Launches Recovery Instances for the specified Source Servers. For each Source Server you may choose a point in
     * time snapshot to launch from, or use an on demand snapshot.
     * </p>
     * 
     * @param startRecoveryRequest
     * @return A Java Future containing the result of the StartRecovery operation returned by the service.
     * @sample AWSdrsAsync.StartRecovery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StartRecovery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartRecoveryResult> startRecoveryAsync(StartRecoveryRequest startRecoveryRequest);

    /**
     * <p>
     * Launches Recovery Instances for the specified Source Servers. For each Source Server you may choose a point in
     * time snapshot to launch from, or use an on demand snapshot.
     * </p>
     * 
     * @param startRecoveryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartRecovery operation returned by the service.
     * @sample AWSdrsAsyncHandler.StartRecovery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StartRecovery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartRecoveryResult> startRecoveryAsync(StartRecoveryRequest startRecoveryRequest,
            com.amazonaws.handlers.AsyncHandler<StartRecoveryRequest, StartRecoveryResult> asyncHandler);

    /**
     * <p>
     * Starts replication for a stopped Source Server. This action would make the Source Server protected again and
     * restart billing for it.
     * </p>
     * 
     * @param startReplicationRequest
     * @return A Java Future containing the result of the StartReplication operation returned by the service.
     * @sample AWSdrsAsync.StartReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StartReplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartReplicationResult> startReplicationAsync(StartReplicationRequest startReplicationRequest);

    /**
     * <p>
     * Starts replication for a stopped Source Server. This action would make the Source Server protected again and
     * restart billing for it.
     * </p>
     * 
     * @param startReplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartReplication operation returned by the service.
     * @sample AWSdrsAsyncHandler.StartReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StartReplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartReplicationResult> startReplicationAsync(StartReplicationRequest startReplicationRequest,
            com.amazonaws.handlers.AsyncHandler<StartReplicationRequest, StartReplicationResult> asyncHandler);

    /**
     * <p>
     * Stops the failback process for a specified Recovery Instance. This changes the Failback State of the Recovery
     * Instance back to FAILBACK_NOT_STARTED.
     * </p>
     * 
     * @param stopFailbackRequest
     * @return A Java Future containing the result of the StopFailback operation returned by the service.
     * @sample AWSdrsAsync.StopFailback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StopFailback" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopFailbackResult> stopFailbackAsync(StopFailbackRequest stopFailbackRequest);

    /**
     * <p>
     * Stops the failback process for a specified Recovery Instance. This changes the Failback State of the Recovery
     * Instance back to FAILBACK_NOT_STARTED.
     * </p>
     * 
     * @param stopFailbackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopFailback operation returned by the service.
     * @sample AWSdrsAsyncHandler.StopFailback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StopFailback" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopFailbackResult> stopFailbackAsync(StopFailbackRequest stopFailbackRequest,
            com.amazonaws.handlers.AsyncHandler<StopFailbackRequest, StopFailbackResult> asyncHandler);

    /**
     * <p>
     * Stops replication for a Source Server. This action would make the Source Server unprotected, delete its existing
     * snapshots and stop billing for it.
     * </p>
     * 
     * @param stopReplicationRequest
     * @return A Java Future containing the result of the StopReplication operation returned by the service.
     * @sample AWSdrsAsync.StopReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StopReplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopReplicationResult> stopReplicationAsync(StopReplicationRequest stopReplicationRequest);

    /**
     * <p>
     * Stops replication for a Source Server. This action would make the Source Server unprotected, delete its existing
     * snapshots and stop billing for it.
     * </p>
     * 
     * @param stopReplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopReplication operation returned by the service.
     * @sample AWSdrsAsyncHandler.StopReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StopReplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopReplicationResult> stopReplicationAsync(StopReplicationRequest stopReplicationRequest,
            com.amazonaws.handlers.AsyncHandler<StopReplicationRequest, StopReplicationResult> asyncHandler);

    /**
     * <p>
     * Adds or overwrites only the specified tags for the specified Elastic Disaster Recovery resource or resources.
     * When you specify an existing tag key, the value is overwritten with the new value. Each resource can have a
     * maximum of 50 tags. Each tag consists of a key and optional value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSdrsAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds or overwrites only the specified tags for the specified Elastic Disaster Recovery resource or resources.
     * When you specify an existing tag key, the value is overwritten with the new value. Each resource can have a
     * maximum of 50 tags. Each tag consists of a key and optional value.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSdrsAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Initiates a Job for terminating the EC2 resources associated with the specified Recovery Instances, and then will
     * delete the Recovery Instances from the Elastic Disaster Recovery service.
     * </p>
     * 
     * @param terminateRecoveryInstancesRequest
     * @return A Java Future containing the result of the TerminateRecoveryInstances operation returned by the service.
     * @sample AWSdrsAsync.TerminateRecoveryInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/TerminateRecoveryInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TerminateRecoveryInstancesResult> terminateRecoveryInstancesAsync(
            TerminateRecoveryInstancesRequest terminateRecoveryInstancesRequest);

    /**
     * <p>
     * Initiates a Job for terminating the EC2 resources associated with the specified Recovery Instances, and then will
     * delete the Recovery Instances from the Elastic Disaster Recovery service.
     * </p>
     * 
     * @param terminateRecoveryInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TerminateRecoveryInstances operation returned by the service.
     * @sample AWSdrsAsyncHandler.TerminateRecoveryInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/TerminateRecoveryInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TerminateRecoveryInstancesResult> terminateRecoveryInstancesAsync(
            TerminateRecoveryInstancesRequest terminateRecoveryInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<TerminateRecoveryInstancesRequest, TerminateRecoveryInstancesResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified set of tags from the specified set of Elastic Disaster Recovery resources.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSdrsAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Deletes the specified set of tags from the specified set of Elastic Disaster Recovery resources.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSdrsAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Allows you to update the failback replication configuration of a Recovery Instance by ID.
     * </p>
     * 
     * @param updateFailbackReplicationConfigurationRequest
     * @return A Java Future containing the result of the UpdateFailbackReplicationConfiguration operation returned by
     *         the service.
     * @sample AWSdrsAsync.UpdateFailbackReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/UpdateFailbackReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFailbackReplicationConfigurationResult> updateFailbackReplicationConfigurationAsync(
            UpdateFailbackReplicationConfigurationRequest updateFailbackReplicationConfigurationRequest);

    /**
     * <p>
     * Allows you to update the failback replication configuration of a Recovery Instance by ID.
     * </p>
     * 
     * @param updateFailbackReplicationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFailbackReplicationConfiguration operation returned by
     *         the service.
     * @sample AWSdrsAsyncHandler.UpdateFailbackReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/UpdateFailbackReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFailbackReplicationConfigurationResult> updateFailbackReplicationConfigurationAsync(
            UpdateFailbackReplicationConfigurationRequest updateFailbackReplicationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFailbackReplicationConfigurationRequest, UpdateFailbackReplicationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates a LaunchConfiguration by Source Server ID.
     * </p>
     * 
     * @param updateLaunchConfigurationRequest
     * @return A Java Future containing the result of the UpdateLaunchConfiguration operation returned by the service.
     * @sample AWSdrsAsync.UpdateLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/UpdateLaunchConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLaunchConfigurationResult> updateLaunchConfigurationAsync(
            UpdateLaunchConfigurationRequest updateLaunchConfigurationRequest);

    /**
     * <p>
     * Updates a LaunchConfiguration by Source Server ID.
     * </p>
     * 
     * @param updateLaunchConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLaunchConfiguration operation returned by the service.
     * @sample AWSdrsAsyncHandler.UpdateLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/UpdateLaunchConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLaunchConfigurationResult> updateLaunchConfigurationAsync(
            UpdateLaunchConfigurationRequest updateLaunchConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLaunchConfigurationRequest, UpdateLaunchConfigurationResult> asyncHandler);

    /**
     * <p>
     * Allows you to update a ReplicationConfiguration by Source Server ID.
     * </p>
     * 
     * @param updateReplicationConfigurationRequest
     * @return A Java Future containing the result of the UpdateReplicationConfiguration operation returned by the
     *         service.
     * @sample AWSdrsAsync.UpdateReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/UpdateReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReplicationConfigurationResult> updateReplicationConfigurationAsync(
            UpdateReplicationConfigurationRequest updateReplicationConfigurationRequest);

    /**
     * <p>
     * Allows you to update a ReplicationConfiguration by Source Server ID.
     * </p>
     * 
     * @param updateReplicationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateReplicationConfiguration operation returned by the
     *         service.
     * @sample AWSdrsAsyncHandler.UpdateReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/UpdateReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReplicationConfigurationResult> updateReplicationConfigurationAsync(
            UpdateReplicationConfigurationRequest updateReplicationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateReplicationConfigurationRequest, UpdateReplicationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates a ReplicationConfigurationTemplate by ID.
     * </p>
     * 
     * @param updateReplicationConfigurationTemplateRequest
     * @return A Java Future containing the result of the UpdateReplicationConfigurationTemplate operation returned by
     *         the service.
     * @sample AWSdrsAsync.UpdateReplicationConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/UpdateReplicationConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReplicationConfigurationTemplateResult> updateReplicationConfigurationTemplateAsync(
            UpdateReplicationConfigurationTemplateRequest updateReplicationConfigurationTemplateRequest);

    /**
     * <p>
     * Updates a ReplicationConfigurationTemplate by ID.
     * </p>
     * 
     * @param updateReplicationConfigurationTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateReplicationConfigurationTemplate operation returned by
     *         the service.
     * @sample AWSdrsAsyncHandler.UpdateReplicationConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/UpdateReplicationConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReplicationConfigurationTemplateResult> updateReplicationConfigurationTemplateAsync(
            UpdateReplicationConfigurationTemplateRequest updateReplicationConfigurationTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateReplicationConfigurationTemplateRequest, UpdateReplicationConfigurationTemplateResult> asyncHandler);

}
