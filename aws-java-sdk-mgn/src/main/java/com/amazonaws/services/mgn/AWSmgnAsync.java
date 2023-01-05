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
package com.amazonaws.services.mgn;

import javax.annotation.Generated;

import com.amazonaws.services.mgn.model.*;

/**
 * Interface for accessing mgn asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mgn.AbstractAWSmgnAsync} instead.
 * </p>
 * <p>
 * <p>
 * The Application Migration Service service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSmgnAsync extends AWSmgn {

    /**
     * <p>
     * Archive application.
     * </p>
     * 
     * @param archiveApplicationRequest
     * @return A Java Future containing the result of the ArchiveApplication operation returned by the service.
     * @sample AWSmgnAsync.ArchiveApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ArchiveApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ArchiveApplicationResult> archiveApplicationAsync(ArchiveApplicationRequest archiveApplicationRequest);

    /**
     * <p>
     * Archive application.
     * </p>
     * 
     * @param archiveApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ArchiveApplication operation returned by the service.
     * @sample AWSmgnAsyncHandler.ArchiveApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ArchiveApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ArchiveApplicationResult> archiveApplicationAsync(ArchiveApplicationRequest archiveApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<ArchiveApplicationRequest, ArchiveApplicationResult> asyncHandler);

    /**
     * <p>
     * Archive wave.
     * </p>
     * 
     * @param archiveWaveRequest
     * @return A Java Future containing the result of the ArchiveWave operation returned by the service.
     * @sample AWSmgnAsync.ArchiveWave
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ArchiveWave" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ArchiveWaveResult> archiveWaveAsync(ArchiveWaveRequest archiveWaveRequest);

    /**
     * <p>
     * Archive wave.
     * </p>
     * 
     * @param archiveWaveRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ArchiveWave operation returned by the service.
     * @sample AWSmgnAsyncHandler.ArchiveWave
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ArchiveWave" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ArchiveWaveResult> archiveWaveAsync(ArchiveWaveRequest archiveWaveRequest,
            com.amazonaws.handlers.AsyncHandler<ArchiveWaveRequest, ArchiveWaveResult> asyncHandler);

    /**
     * <p>
     * Associate applications to wave.
     * </p>
     * 
     * @param associateApplicationsRequest
     * @return A Java Future containing the result of the AssociateApplications operation returned by the service.
     * @sample AWSmgnAsync.AssociateApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/AssociateApplications" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateApplicationsResult> associateApplicationsAsync(AssociateApplicationsRequest associateApplicationsRequest);

    /**
     * <p>
     * Associate applications to wave.
     * </p>
     * 
     * @param associateApplicationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateApplications operation returned by the service.
     * @sample AWSmgnAsyncHandler.AssociateApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/AssociateApplications" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateApplicationsResult> associateApplicationsAsync(AssociateApplicationsRequest associateApplicationsRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateApplicationsRequest, AssociateApplicationsResult> asyncHandler);

    /**
     * <p>
     * Associate source servers to application.
     * </p>
     * 
     * @param associateSourceServersRequest
     * @return A Java Future containing the result of the AssociateSourceServers operation returned by the service.
     * @sample AWSmgnAsync.AssociateSourceServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/AssociateSourceServers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateSourceServersResult> associateSourceServersAsync(AssociateSourceServersRequest associateSourceServersRequest);

    /**
     * <p>
     * Associate source servers to application.
     * </p>
     * 
     * @param associateSourceServersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateSourceServers operation returned by the service.
     * @sample AWSmgnAsyncHandler.AssociateSourceServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/AssociateSourceServers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateSourceServersResult> associateSourceServersAsync(AssociateSourceServersRequest associateSourceServersRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateSourceServersRequest, AssociateSourceServersResult> asyncHandler);

    /**
     * <p>
     * Allows the user to set the SourceServer.LifeCycle.state property for specific Source Server IDs to one of the
     * following: READY_FOR_TEST or READY_FOR_CUTOVER. This command only works if the Source Server is already
     * launchable (dataReplicationInfo.lagDuration is not null.)
     * </p>
     * 
     * @param changeServerLifeCycleStateRequest
     * @return A Java Future containing the result of the ChangeServerLifeCycleState operation returned by the service.
     * @sample AWSmgnAsync.ChangeServerLifeCycleState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ChangeServerLifeCycleState" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ChangeServerLifeCycleStateResult> changeServerLifeCycleStateAsync(
            ChangeServerLifeCycleStateRequest changeServerLifeCycleStateRequest);

    /**
     * <p>
     * Allows the user to set the SourceServer.LifeCycle.state property for specific Source Server IDs to one of the
     * following: READY_FOR_TEST or READY_FOR_CUTOVER. This command only works if the Source Server is already
     * launchable (dataReplicationInfo.lagDuration is not null.)
     * </p>
     * 
     * @param changeServerLifeCycleStateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ChangeServerLifeCycleState operation returned by the service.
     * @sample AWSmgnAsyncHandler.ChangeServerLifeCycleState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ChangeServerLifeCycleState" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ChangeServerLifeCycleStateResult> changeServerLifeCycleStateAsync(
            ChangeServerLifeCycleStateRequest changeServerLifeCycleStateRequest,
            com.amazonaws.handlers.AsyncHandler<ChangeServerLifeCycleStateRequest, ChangeServerLifeCycleStateResult> asyncHandler);

    /**
     * <p>
     * Create application.
     * </p>
     * 
     * @param createApplicationRequest
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AWSmgnAsync.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/CreateApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Create application.
     * </p>
     * 
     * @param createApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AWSmgnAsyncHandler.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/CreateApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler);

    /**
     * <p>
     * Creates a new Launch Configuration Template.
     * </p>
     * 
     * @param createLaunchConfigurationTemplateRequest
     * @return A Java Future containing the result of the CreateLaunchConfigurationTemplate operation returned by the
     *         service.
     * @sample AWSmgnAsync.CreateLaunchConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/CreateLaunchConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLaunchConfigurationTemplateResult> createLaunchConfigurationTemplateAsync(
            CreateLaunchConfigurationTemplateRequest createLaunchConfigurationTemplateRequest);

    /**
     * <p>
     * Creates a new Launch Configuration Template.
     * </p>
     * 
     * @param createLaunchConfigurationTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLaunchConfigurationTemplate operation returned by the
     *         service.
     * @sample AWSmgnAsyncHandler.CreateLaunchConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/CreateLaunchConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLaunchConfigurationTemplateResult> createLaunchConfigurationTemplateAsync(
            CreateLaunchConfigurationTemplateRequest createLaunchConfigurationTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLaunchConfigurationTemplateRequest, CreateLaunchConfigurationTemplateResult> asyncHandler);

    /**
     * <p>
     * Creates a new ReplicationConfigurationTemplate.
     * </p>
     * 
     * @param createReplicationConfigurationTemplateRequest
     * @return A Java Future containing the result of the CreateReplicationConfigurationTemplate operation returned by
     *         the service.
     * @sample AWSmgnAsync.CreateReplicationConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/CreateReplicationConfigurationTemplate"
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
     * @sample AWSmgnAsyncHandler.CreateReplicationConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/CreateReplicationConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateReplicationConfigurationTemplateResult> createReplicationConfigurationTemplateAsync(
            CreateReplicationConfigurationTemplateRequest createReplicationConfigurationTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReplicationConfigurationTemplateRequest, CreateReplicationConfigurationTemplateResult> asyncHandler);

    /**
     * <p>
     * Create wave.
     * </p>
     * 
     * @param createWaveRequest
     * @return A Java Future containing the result of the CreateWave operation returned by the service.
     * @sample AWSmgnAsync.CreateWave
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/CreateWave" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWaveResult> createWaveAsync(CreateWaveRequest createWaveRequest);

    /**
     * <p>
     * Create wave.
     * </p>
     * 
     * @param createWaveRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWave operation returned by the service.
     * @sample AWSmgnAsyncHandler.CreateWave
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/CreateWave" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWaveResult> createWaveAsync(CreateWaveRequest createWaveRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWaveRequest, CreateWaveResult> asyncHandler);

    /**
     * <p>
     * Delete application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AWSmgnAsync.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Delete application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AWSmgnAsyncHandler.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler);

    /**
     * <p>
     * Deletes a single Job by ID.
     * </p>
     * 
     * @param deleteJobRequest
     * @return A Java Future containing the result of the DeleteJob operation returned by the service.
     * @sample AWSmgnAsync.DeleteJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteJob" target="_top">AWS API
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
     * @sample AWSmgnAsyncHandler.DeleteJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteJobResult> deleteJobAsync(DeleteJobRequest deleteJobRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteJobRequest, DeleteJobResult> asyncHandler);

    /**
     * <p>
     * Deletes a single Launch Configuration Template by ID.
     * </p>
     * 
     * @param deleteLaunchConfigurationTemplateRequest
     * @return A Java Future containing the result of the DeleteLaunchConfigurationTemplate operation returned by the
     *         service.
     * @sample AWSmgnAsync.DeleteLaunchConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteLaunchConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLaunchConfigurationTemplateResult> deleteLaunchConfigurationTemplateAsync(
            DeleteLaunchConfigurationTemplateRequest deleteLaunchConfigurationTemplateRequest);

    /**
     * <p>
     * Deletes a single Launch Configuration Template by ID.
     * </p>
     * 
     * @param deleteLaunchConfigurationTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLaunchConfigurationTemplate operation returned by the
     *         service.
     * @sample AWSmgnAsyncHandler.DeleteLaunchConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteLaunchConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLaunchConfigurationTemplateResult> deleteLaunchConfigurationTemplateAsync(
            DeleteLaunchConfigurationTemplateRequest deleteLaunchConfigurationTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLaunchConfigurationTemplateRequest, DeleteLaunchConfigurationTemplateResult> asyncHandler);

    /**
     * <p>
     * Deletes a single Replication Configuration Template by ID
     * </p>
     * 
     * @param deleteReplicationConfigurationTemplateRequest
     * @return A Java Future containing the result of the DeleteReplicationConfigurationTemplate operation returned by
     *         the service.
     * @sample AWSmgnAsync.DeleteReplicationConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteReplicationConfigurationTemplate"
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
     * @sample AWSmgnAsyncHandler.DeleteReplicationConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteReplicationConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReplicationConfigurationTemplateResult> deleteReplicationConfigurationTemplateAsync(
            DeleteReplicationConfigurationTemplateRequest deleteReplicationConfigurationTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReplicationConfigurationTemplateRequest, DeleteReplicationConfigurationTemplateResult> asyncHandler);

    /**
     * <p>
     * Deletes a single source server by ID.
     * </p>
     * 
     * @param deleteSourceServerRequest
     * @return A Java Future containing the result of the DeleteSourceServer operation returned by the service.
     * @sample AWSmgnAsync.DeleteSourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteSourceServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSourceServerResult> deleteSourceServerAsync(DeleteSourceServerRequest deleteSourceServerRequest);

    /**
     * <p>
     * Deletes a single source server by ID.
     * </p>
     * 
     * @param deleteSourceServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSourceServer operation returned by the service.
     * @sample AWSmgnAsyncHandler.DeleteSourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteSourceServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSourceServerResult> deleteSourceServerAsync(DeleteSourceServerRequest deleteSourceServerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSourceServerRequest, DeleteSourceServerResult> asyncHandler);

    /**
     * <p>
     * Deletes a given vCenter client by ID.
     * </p>
     * 
     * @param deleteVcenterClientRequest
     * @return A Java Future containing the result of the DeleteVcenterClient operation returned by the service.
     * @sample AWSmgnAsync.DeleteVcenterClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteVcenterClient" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteVcenterClientResult> deleteVcenterClientAsync(DeleteVcenterClientRequest deleteVcenterClientRequest);

    /**
     * <p>
     * Deletes a given vCenter client by ID.
     * </p>
     * 
     * @param deleteVcenterClientRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVcenterClient operation returned by the service.
     * @sample AWSmgnAsyncHandler.DeleteVcenterClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteVcenterClient" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteVcenterClientResult> deleteVcenterClientAsync(DeleteVcenterClientRequest deleteVcenterClientRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVcenterClientRequest, DeleteVcenterClientResult> asyncHandler);

    /**
     * <p>
     * Delete wave.
     * </p>
     * 
     * @param deleteWaveRequest
     * @return A Java Future containing the result of the DeleteWave operation returned by the service.
     * @sample AWSmgnAsync.DeleteWave
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteWave" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWaveResult> deleteWaveAsync(DeleteWaveRequest deleteWaveRequest);

    /**
     * <p>
     * Delete wave.
     * </p>
     * 
     * @param deleteWaveRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWave operation returned by the service.
     * @sample AWSmgnAsyncHandler.DeleteWave
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteWave" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWaveResult> deleteWaveAsync(DeleteWaveRequest deleteWaveRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWaveRequest, DeleteWaveResult> asyncHandler);

    /**
     * <p>
     * Retrieves detailed job log items with paging.
     * </p>
     * 
     * @param describeJobLogItemsRequest
     * @return A Java Future containing the result of the DescribeJobLogItems operation returned by the service.
     * @sample AWSmgnAsync.DescribeJobLogItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeJobLogItems" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeJobLogItemsResult> describeJobLogItemsAsync(DescribeJobLogItemsRequest describeJobLogItemsRequest);

    /**
     * <p>
     * Retrieves detailed job log items with paging.
     * </p>
     * 
     * @param describeJobLogItemsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeJobLogItems operation returned by the service.
     * @sample AWSmgnAsyncHandler.DescribeJobLogItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeJobLogItems" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeJobLogItemsResult> describeJobLogItemsAsync(DescribeJobLogItemsRequest describeJobLogItemsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeJobLogItemsRequest, DescribeJobLogItemsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of Jobs. Use the JobsID and fromDate and toData filters to limit which jobs are returned. The
     * response is sorted by creationDataTime - latest date first. Jobs are normally created by the StartTest,
     * StartCutover, and TerminateTargetInstances APIs. Jobs are also created by DiagnosticLaunch and
     * TerminateDiagnosticInstances, which are APIs available only to *Support* and only used in response to relevant
     * support tickets.
     * </p>
     * 
     * @param describeJobsRequest
     * @return A Java Future containing the result of the DescribeJobs operation returned by the service.
     * @sample AWSmgnAsync.DescribeJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeJobsResult> describeJobsAsync(DescribeJobsRequest describeJobsRequest);

    /**
     * <p>
     * Returns a list of Jobs. Use the JobsID and fromDate and toData filters to limit which jobs are returned. The
     * response is sorted by creationDataTime - latest date first. Jobs are normally created by the StartTest,
     * StartCutover, and TerminateTargetInstances APIs. Jobs are also created by DiagnosticLaunch and
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
     * @sample AWSmgnAsyncHandler.DescribeJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeJobsResult> describeJobsAsync(DescribeJobsRequest describeJobsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeJobsRequest, DescribeJobsResult> asyncHandler);

    /**
     * <p>
     * Lists all Launch Configuration Templates, filtered by Launch Configuration Template IDs
     * </p>
     * 
     * @param describeLaunchConfigurationTemplatesRequest
     * @return A Java Future containing the result of the DescribeLaunchConfigurationTemplates operation returned by the
     *         service.
     * @sample AWSmgnAsync.DescribeLaunchConfigurationTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeLaunchConfigurationTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLaunchConfigurationTemplatesResult> describeLaunchConfigurationTemplatesAsync(
            DescribeLaunchConfigurationTemplatesRequest describeLaunchConfigurationTemplatesRequest);

    /**
     * <p>
     * Lists all Launch Configuration Templates, filtered by Launch Configuration Template IDs
     * </p>
     * 
     * @param describeLaunchConfigurationTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLaunchConfigurationTemplates operation returned by the
     *         service.
     * @sample AWSmgnAsyncHandler.DescribeLaunchConfigurationTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeLaunchConfigurationTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLaunchConfigurationTemplatesResult> describeLaunchConfigurationTemplatesAsync(
            DescribeLaunchConfigurationTemplatesRequest describeLaunchConfigurationTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLaunchConfigurationTemplatesRequest, DescribeLaunchConfigurationTemplatesResult> asyncHandler);

    /**
     * <p>
     * Lists all ReplicationConfigurationTemplates, filtered by Source Server IDs.
     * </p>
     * 
     * @param describeReplicationConfigurationTemplatesRequest
     * @return A Java Future containing the result of the DescribeReplicationConfigurationTemplates operation returned
     *         by the service.
     * @sample AWSmgnAsync.DescribeReplicationConfigurationTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeReplicationConfigurationTemplates"
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
     * @sample AWSmgnAsyncHandler.DescribeReplicationConfigurationTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeReplicationConfigurationTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReplicationConfigurationTemplatesResult> describeReplicationConfigurationTemplatesAsync(
            DescribeReplicationConfigurationTemplatesRequest describeReplicationConfigurationTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReplicationConfigurationTemplatesRequest, DescribeReplicationConfigurationTemplatesResult> asyncHandler);

    /**
     * <p>
     * Retrieves all SourceServers or multiple SourceServers by ID.
     * </p>
     * 
     * @param describeSourceServersRequest
     * @return A Java Future containing the result of the DescribeSourceServers operation returned by the service.
     * @sample AWSmgnAsync.DescribeSourceServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeSourceServers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSourceServersResult> describeSourceServersAsync(DescribeSourceServersRequest describeSourceServersRequest);

    /**
     * <p>
     * Retrieves all SourceServers or multiple SourceServers by ID.
     * </p>
     * 
     * @param describeSourceServersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSourceServers operation returned by the service.
     * @sample AWSmgnAsyncHandler.DescribeSourceServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeSourceServers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSourceServersResult> describeSourceServersAsync(DescribeSourceServersRequest describeSourceServersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSourceServersRequest, DescribeSourceServersResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the installed vCenter clients.
     * </p>
     * 
     * @param describeVcenterClientsRequest
     * @return A Java Future containing the result of the DescribeVcenterClients operation returned by the service.
     * @sample AWSmgnAsync.DescribeVcenterClients
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeVcenterClients" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVcenterClientsResult> describeVcenterClientsAsync(DescribeVcenterClientsRequest describeVcenterClientsRequest);

    /**
     * <p>
     * Returns a list of the installed vCenter clients.
     * </p>
     * 
     * @param describeVcenterClientsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVcenterClients operation returned by the service.
     * @sample AWSmgnAsyncHandler.DescribeVcenterClients
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeVcenterClients" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVcenterClientsResult> describeVcenterClientsAsync(DescribeVcenterClientsRequest describeVcenterClientsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVcenterClientsRequest, DescribeVcenterClientsResult> asyncHandler);

    /**
     * <p>
     * Disassociate applications from wave.
     * </p>
     * 
     * @param disassociateApplicationsRequest
     * @return A Java Future containing the result of the DisassociateApplications operation returned by the service.
     * @sample AWSmgnAsync.DisassociateApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DisassociateApplications" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateApplicationsResult> disassociateApplicationsAsync(DisassociateApplicationsRequest disassociateApplicationsRequest);

    /**
     * <p>
     * Disassociate applications from wave.
     * </p>
     * 
     * @param disassociateApplicationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateApplications operation returned by the service.
     * @sample AWSmgnAsyncHandler.DisassociateApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DisassociateApplications" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateApplicationsResult> disassociateApplicationsAsync(DisassociateApplicationsRequest disassociateApplicationsRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateApplicationsRequest, DisassociateApplicationsResult> asyncHandler);

    /**
     * <p>
     * Disassociate source servers from application.
     * </p>
     * 
     * @param disassociateSourceServersRequest
     * @return A Java Future containing the result of the DisassociateSourceServers operation returned by the service.
     * @sample AWSmgnAsync.DisassociateSourceServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DisassociateSourceServers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateSourceServersResult> disassociateSourceServersAsync(
            DisassociateSourceServersRequest disassociateSourceServersRequest);

    /**
     * <p>
     * Disassociate source servers from application.
     * </p>
     * 
     * @param disassociateSourceServersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateSourceServers operation returned by the service.
     * @sample AWSmgnAsyncHandler.DisassociateSourceServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DisassociateSourceServers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateSourceServersResult> disassociateSourceServersAsync(
            DisassociateSourceServersRequest disassociateSourceServersRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateSourceServersRequest, DisassociateSourceServersResult> asyncHandler);

    /**
     * <p>
     * Disconnects specific Source Servers from Application Migration Service. Data replication is stopped immediately.
     * All AWS resources created by Application Migration Service for enabling the replication of these source servers
     * will be terminated / deleted within 90 minutes. Launched Test or Cutover instances will NOT be terminated. If the
     * agent on the source server has not been prevented from communicating with the Application Migration Service
     * service, then it will receive a command to uninstall itself (within approximately 10 minutes). The following
     * properties of the SourceServer will be changed immediately: dataReplicationInfo.dataReplicationState will be set
     * to DISCONNECTED; The totalStorageBytes property for each of dataReplicationInfo.replicatedDisks will be set to
     * zero; dataReplicationInfo.lagDuration and dataReplicationInfo.lagDuration will be nullified.
     * </p>
     * 
     * @param disconnectFromServiceRequest
     * @return A Java Future containing the result of the DisconnectFromService operation returned by the service.
     * @sample AWSmgnAsync.DisconnectFromService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DisconnectFromService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisconnectFromServiceResult> disconnectFromServiceAsync(DisconnectFromServiceRequest disconnectFromServiceRequest);

    /**
     * <p>
     * Disconnects specific Source Servers from Application Migration Service. Data replication is stopped immediately.
     * All AWS resources created by Application Migration Service for enabling the replication of these source servers
     * will be terminated / deleted within 90 minutes. Launched Test or Cutover instances will NOT be terminated. If the
     * agent on the source server has not been prevented from communicating with the Application Migration Service
     * service, then it will receive a command to uninstall itself (within approximately 10 minutes). The following
     * properties of the SourceServer will be changed immediately: dataReplicationInfo.dataReplicationState will be set
     * to DISCONNECTED; The totalStorageBytes property for each of dataReplicationInfo.replicatedDisks will be set to
     * zero; dataReplicationInfo.lagDuration and dataReplicationInfo.lagDuration will be nullified.
     * </p>
     * 
     * @param disconnectFromServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisconnectFromService operation returned by the service.
     * @sample AWSmgnAsyncHandler.DisconnectFromService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DisconnectFromService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisconnectFromServiceResult> disconnectFromServiceAsync(DisconnectFromServiceRequest disconnectFromServiceRequest,
            com.amazonaws.handlers.AsyncHandler<DisconnectFromServiceRequest, DisconnectFromServiceResult> asyncHandler);

    /**
     * <p>
     * Finalizes the cutover immediately for specific Source Servers. All AWS resources created by Application Migration
     * Service for enabling the replication of these source servers will be terminated / deleted within 90 minutes.
     * Launched Test or Cutover instances will NOT be terminated. The AWS Replication Agent will receive a command to
     * uninstall itself (within 10 minutes). The following properties of the SourceServer will be changed immediately:
     * dataReplicationInfo.dataReplicationState will be changed to DISCONNECTED; The SourceServer.lifeCycle.state will
     * be changed to CUTOVER; The totalStorageBytes property fo each of dataReplicationInfo.replicatedDisks will be set
     * to zero; dataReplicationInfo.lagDuration and dataReplicationInfo.lagDuration will be nullified.
     * </p>
     * 
     * @param finalizeCutoverRequest
     * @return A Java Future containing the result of the FinalizeCutover operation returned by the service.
     * @sample AWSmgnAsync.FinalizeCutover
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/FinalizeCutover" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<FinalizeCutoverResult> finalizeCutoverAsync(FinalizeCutoverRequest finalizeCutoverRequest);

    /**
     * <p>
     * Finalizes the cutover immediately for specific Source Servers. All AWS resources created by Application Migration
     * Service for enabling the replication of these source servers will be terminated / deleted within 90 minutes.
     * Launched Test or Cutover instances will NOT be terminated. The AWS Replication Agent will receive a command to
     * uninstall itself (within 10 minutes). The following properties of the SourceServer will be changed immediately:
     * dataReplicationInfo.dataReplicationState will be changed to DISCONNECTED; The SourceServer.lifeCycle.state will
     * be changed to CUTOVER; The totalStorageBytes property fo each of dataReplicationInfo.replicatedDisks will be set
     * to zero; dataReplicationInfo.lagDuration and dataReplicationInfo.lagDuration will be nullified.
     * </p>
     * 
     * @param finalizeCutoverRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the FinalizeCutover operation returned by the service.
     * @sample AWSmgnAsyncHandler.FinalizeCutover
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/FinalizeCutover" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<FinalizeCutoverResult> finalizeCutoverAsync(FinalizeCutoverRequest finalizeCutoverRequest,
            com.amazonaws.handlers.AsyncHandler<FinalizeCutoverRequest, FinalizeCutoverResult> asyncHandler);

    /**
     * <p>
     * Lists all LaunchConfigurations available, filtered by Source Server IDs.
     * </p>
     * 
     * @param getLaunchConfigurationRequest
     * @return A Java Future containing the result of the GetLaunchConfiguration operation returned by the service.
     * @sample AWSmgnAsync.GetLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/GetLaunchConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLaunchConfigurationResult> getLaunchConfigurationAsync(GetLaunchConfigurationRequest getLaunchConfigurationRequest);

    /**
     * <p>
     * Lists all LaunchConfigurations available, filtered by Source Server IDs.
     * </p>
     * 
     * @param getLaunchConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLaunchConfiguration operation returned by the service.
     * @sample AWSmgnAsyncHandler.GetLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/GetLaunchConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLaunchConfigurationResult> getLaunchConfigurationAsync(GetLaunchConfigurationRequest getLaunchConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetLaunchConfigurationRequest, GetLaunchConfigurationResult> asyncHandler);

    /**
     * <p>
     * Lists all ReplicationConfigurations, filtered by Source Server ID.
     * </p>
     * 
     * @param getReplicationConfigurationRequest
     * @return A Java Future containing the result of the GetReplicationConfiguration operation returned by the service.
     * @sample AWSmgnAsync.GetReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/GetReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReplicationConfigurationResult> getReplicationConfigurationAsync(
            GetReplicationConfigurationRequest getReplicationConfigurationRequest);

    /**
     * <p>
     * Lists all ReplicationConfigurations, filtered by Source Server ID.
     * </p>
     * 
     * @param getReplicationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReplicationConfiguration operation returned by the service.
     * @sample AWSmgnAsyncHandler.GetReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/GetReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReplicationConfigurationResult> getReplicationConfigurationAsync(
            GetReplicationConfigurationRequest getReplicationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetReplicationConfigurationRequest, GetReplicationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Initialize Application Migration Service.
     * </p>
     * 
     * @param initializeServiceRequest
     * @return A Java Future containing the result of the InitializeService operation returned by the service.
     * @sample AWSmgnAsync.InitializeService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/InitializeService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InitializeServiceResult> initializeServiceAsync(InitializeServiceRequest initializeServiceRequest);

    /**
     * <p>
     * Initialize Application Migration Service.
     * </p>
     * 
     * @param initializeServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InitializeService operation returned by the service.
     * @sample AWSmgnAsyncHandler.InitializeService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/InitializeService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InitializeServiceResult> initializeServiceAsync(InitializeServiceRequest initializeServiceRequest,
            com.amazonaws.handlers.AsyncHandler<InitializeServiceRequest, InitializeServiceResult> asyncHandler);

    /**
     * <p>
     * Retrieves all applications or multiple applications by ID.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AWSmgnAsync.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ListApplications" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Retrieves all applications or multiple applications by ID.
     * </p>
     * 
     * @param listApplicationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AWSmgnAsyncHandler.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ListApplications" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler);

    /**
     * <p>
     * List source server post migration custom actions.
     * </p>
     * 
     * @param listSourceServerActionsRequest
     * @return A Java Future containing the result of the ListSourceServerActions operation returned by the service.
     * @sample AWSmgnAsync.ListSourceServerActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ListSourceServerActions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSourceServerActionsResult> listSourceServerActionsAsync(ListSourceServerActionsRequest listSourceServerActionsRequest);

    /**
     * <p>
     * List source server post migration custom actions.
     * </p>
     * 
     * @param listSourceServerActionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSourceServerActions operation returned by the service.
     * @sample AWSmgnAsyncHandler.ListSourceServerActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ListSourceServerActions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSourceServerActionsResult> listSourceServerActionsAsync(ListSourceServerActionsRequest listSourceServerActionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSourceServerActionsRequest, ListSourceServerActionsResult> asyncHandler);

    /**
     * <p>
     * List all tags for your Application Migration Service resources.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSmgnAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List all tags for your Application Migration Service resources.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSmgnAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * List template post migration custom actions.
     * </p>
     * 
     * @param listTemplateActionsRequest
     * @return A Java Future containing the result of the ListTemplateActions operation returned by the service.
     * @sample AWSmgnAsync.ListTemplateActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ListTemplateActions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTemplateActionsResult> listTemplateActionsAsync(ListTemplateActionsRequest listTemplateActionsRequest);

    /**
     * <p>
     * List template post migration custom actions.
     * </p>
     * 
     * @param listTemplateActionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTemplateActions operation returned by the service.
     * @sample AWSmgnAsyncHandler.ListTemplateActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ListTemplateActions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTemplateActionsResult> listTemplateActionsAsync(ListTemplateActionsRequest listTemplateActionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTemplateActionsRequest, ListTemplateActionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves all waves or multiple waves by ID.
     * </p>
     * 
     * @param listWavesRequest
     * @return A Java Future containing the result of the ListWaves operation returned by the service.
     * @sample AWSmgnAsync.ListWaves
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ListWaves" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWavesResult> listWavesAsync(ListWavesRequest listWavesRequest);

    /**
     * <p>
     * Retrieves all waves or multiple waves by ID.
     * </p>
     * 
     * @param listWavesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWaves operation returned by the service.
     * @sample AWSmgnAsyncHandler.ListWaves
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ListWaves" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWavesResult> listWavesAsync(ListWavesRequest listWavesRequest,
            com.amazonaws.handlers.AsyncHandler<ListWavesRequest, ListWavesResult> asyncHandler);

    /**
     * <p>
     * Archives specific Source Servers by setting the SourceServer.isArchived property to true for specified
     * SourceServers by ID. This command only works for SourceServers with a lifecycle. state which equals DISCONNECTED
     * or CUTOVER.
     * </p>
     * 
     * @param markAsArchivedRequest
     * @return A Java Future containing the result of the MarkAsArchived operation returned by the service.
     * @sample AWSmgnAsync.MarkAsArchived
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/MarkAsArchived" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<MarkAsArchivedResult> markAsArchivedAsync(MarkAsArchivedRequest markAsArchivedRequest);

    /**
     * <p>
     * Archives specific Source Servers by setting the SourceServer.isArchived property to true for specified
     * SourceServers by ID. This command only works for SourceServers with a lifecycle. state which equals DISCONNECTED
     * or CUTOVER.
     * </p>
     * 
     * @param markAsArchivedRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the MarkAsArchived operation returned by the service.
     * @sample AWSmgnAsyncHandler.MarkAsArchived
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/MarkAsArchived" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<MarkAsArchivedResult> markAsArchivedAsync(MarkAsArchivedRequest markAsArchivedRequest,
            com.amazonaws.handlers.AsyncHandler<MarkAsArchivedRequest, MarkAsArchivedResult> asyncHandler);

    /**
     * <p>
     * Put source server post migration custom action.
     * </p>
     * 
     * @param putSourceServerActionRequest
     * @return A Java Future containing the result of the PutSourceServerAction operation returned by the service.
     * @sample AWSmgnAsync.PutSourceServerAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/PutSourceServerAction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutSourceServerActionResult> putSourceServerActionAsync(PutSourceServerActionRequest putSourceServerActionRequest);

    /**
     * <p>
     * Put source server post migration custom action.
     * </p>
     * 
     * @param putSourceServerActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutSourceServerAction operation returned by the service.
     * @sample AWSmgnAsyncHandler.PutSourceServerAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/PutSourceServerAction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutSourceServerActionResult> putSourceServerActionAsync(PutSourceServerActionRequest putSourceServerActionRequest,
            com.amazonaws.handlers.AsyncHandler<PutSourceServerActionRequest, PutSourceServerActionResult> asyncHandler);

    /**
     * <p>
     * Put template post migration custom action.
     * </p>
     * 
     * @param putTemplateActionRequest
     * @return A Java Future containing the result of the PutTemplateAction operation returned by the service.
     * @sample AWSmgnAsync.PutTemplateAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/PutTemplateAction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutTemplateActionResult> putTemplateActionAsync(PutTemplateActionRequest putTemplateActionRequest);

    /**
     * <p>
     * Put template post migration custom action.
     * </p>
     * 
     * @param putTemplateActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutTemplateAction operation returned by the service.
     * @sample AWSmgnAsyncHandler.PutTemplateAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/PutTemplateAction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutTemplateActionResult> putTemplateActionAsync(PutTemplateActionRequest putTemplateActionRequest,
            com.amazonaws.handlers.AsyncHandler<PutTemplateActionRequest, PutTemplateActionResult> asyncHandler);

    /**
     * <p>
     * Remove source server post migration custom action.
     * </p>
     * 
     * @param removeSourceServerActionRequest
     * @return A Java Future containing the result of the RemoveSourceServerAction operation returned by the service.
     * @sample AWSmgnAsync.RemoveSourceServerAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/RemoveSourceServerAction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RemoveSourceServerActionResult> removeSourceServerActionAsync(RemoveSourceServerActionRequest removeSourceServerActionRequest);

    /**
     * <p>
     * Remove source server post migration custom action.
     * </p>
     * 
     * @param removeSourceServerActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveSourceServerAction operation returned by the service.
     * @sample AWSmgnAsyncHandler.RemoveSourceServerAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/RemoveSourceServerAction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RemoveSourceServerActionResult> removeSourceServerActionAsync(RemoveSourceServerActionRequest removeSourceServerActionRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveSourceServerActionRequest, RemoveSourceServerActionResult> asyncHandler);

    /**
     * <p>
     * Remove template post migration custom action.
     * </p>
     * 
     * @param removeTemplateActionRequest
     * @return A Java Future containing the result of the RemoveTemplateAction operation returned by the service.
     * @sample AWSmgnAsync.RemoveTemplateAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/RemoveTemplateAction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemoveTemplateActionResult> removeTemplateActionAsync(RemoveTemplateActionRequest removeTemplateActionRequest);

    /**
     * <p>
     * Remove template post migration custom action.
     * </p>
     * 
     * @param removeTemplateActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTemplateAction operation returned by the service.
     * @sample AWSmgnAsyncHandler.RemoveTemplateAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/RemoveTemplateAction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemoveTemplateActionResult> removeTemplateActionAsync(RemoveTemplateActionRequest removeTemplateActionRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTemplateActionRequest, RemoveTemplateActionResult> asyncHandler);

    /**
     * <p>
     * Causes the data replication initiation sequence to begin immediately upon next Handshake for specified
     * SourceServer IDs, regardless of when the previous initiation started. This command will not work if the
     * SourceServer is not stalled or is in a DISCONNECTED or STOPPED state.
     * </p>
     * 
     * @param retryDataReplicationRequest
     * @return A Java Future containing the result of the RetryDataReplication operation returned by the service.
     * @sample AWSmgnAsync.RetryDataReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/RetryDataReplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RetryDataReplicationResult> retryDataReplicationAsync(RetryDataReplicationRequest retryDataReplicationRequest);

    /**
     * <p>
     * Causes the data replication initiation sequence to begin immediately upon next Handshake for specified
     * SourceServer IDs, regardless of when the previous initiation started. This command will not work if the
     * SourceServer is not stalled or is in a DISCONNECTED or STOPPED state.
     * </p>
     * 
     * @param retryDataReplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RetryDataReplication operation returned by the service.
     * @sample AWSmgnAsyncHandler.RetryDataReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/RetryDataReplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RetryDataReplicationResult> retryDataReplicationAsync(RetryDataReplicationRequest retryDataReplicationRequest,
            com.amazonaws.handlers.AsyncHandler<RetryDataReplicationRequest, RetryDataReplicationResult> asyncHandler);

    /**
     * <p>
     * Launches a Cutover Instance for specific Source Servers. This command starts a LAUNCH job whose initiatedBy
     * property is StartCutover and changes the SourceServer.lifeCycle.state property to CUTTING_OVER.
     * </p>
     * 
     * @param startCutoverRequest
     * @return A Java Future containing the result of the StartCutover operation returned by the service.
     * @sample AWSmgnAsync.StartCutover
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/StartCutover" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartCutoverResult> startCutoverAsync(StartCutoverRequest startCutoverRequest);

    /**
     * <p>
     * Launches a Cutover Instance for specific Source Servers. This command starts a LAUNCH job whose initiatedBy
     * property is StartCutover and changes the SourceServer.lifeCycle.state property to CUTTING_OVER.
     * </p>
     * 
     * @param startCutoverRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartCutover operation returned by the service.
     * @sample AWSmgnAsyncHandler.StartCutover
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/StartCutover" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartCutoverResult> startCutoverAsync(StartCutoverRequest startCutoverRequest,
            com.amazonaws.handlers.AsyncHandler<StartCutoverRequest, StartCutoverResult> asyncHandler);

    /**
     * <p>
     * Starts replication for SNAPSHOT_SHIPPING agents.
     * </p>
     * 
     * @param startReplicationRequest
     * @return A Java Future containing the result of the StartReplication operation returned by the service.
     * @sample AWSmgnAsync.StartReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/StartReplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartReplicationResult> startReplicationAsync(StartReplicationRequest startReplicationRequest);

    /**
     * <p>
     * Starts replication for SNAPSHOT_SHIPPING agents.
     * </p>
     * 
     * @param startReplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartReplication operation returned by the service.
     * @sample AWSmgnAsyncHandler.StartReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/StartReplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartReplicationResult> startReplicationAsync(StartReplicationRequest startReplicationRequest,
            com.amazonaws.handlers.AsyncHandler<StartReplicationRequest, StartReplicationResult> asyncHandler);

    /**
     * <p>
     * Launches a Test Instance for specific Source Servers. This command starts a LAUNCH job whose initiatedBy property
     * is StartTest and changes the SourceServer.lifeCycle.state property to TESTING.
     * </p>
     * 
     * @param startTestRequest
     * @return A Java Future containing the result of the StartTest operation returned by the service.
     * @sample AWSmgnAsync.StartTest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/StartTest" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartTestResult> startTestAsync(StartTestRequest startTestRequest);

    /**
     * <p>
     * Launches a Test Instance for specific Source Servers. This command starts a LAUNCH job whose initiatedBy property
     * is StartTest and changes the SourceServer.lifeCycle.state property to TESTING.
     * </p>
     * 
     * @param startTestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartTest operation returned by the service.
     * @sample AWSmgnAsyncHandler.StartTest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/StartTest" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartTestResult> startTestAsync(StartTestRequest startTestRequest,
            com.amazonaws.handlers.AsyncHandler<StartTestRequest, StartTestResult> asyncHandler);

    /**
     * <p>
     * Adds or overwrites only the specified tags for the specified Application Migration Service resource or resources.
     * When you specify an existing tag key, the value is overwritten with the new value. Each resource can have a
     * maximum of 50 tags. Each tag consists of a key and optional value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSmgnAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds or overwrites only the specified tags for the specified Application Migration Service resource or resources.
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
     * @sample AWSmgnAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Starts a job that terminates specific launched EC2 Test and Cutover instances. This command will not work for any
     * Source Server with a lifecycle.state of TESTING, CUTTING_OVER, or CUTOVER.
     * </p>
     * 
     * @param terminateTargetInstancesRequest
     * @return A Java Future containing the result of the TerminateTargetInstances operation returned by the service.
     * @sample AWSmgnAsync.TerminateTargetInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/TerminateTargetInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TerminateTargetInstancesResult> terminateTargetInstancesAsync(TerminateTargetInstancesRequest terminateTargetInstancesRequest);

    /**
     * <p>
     * Starts a job that terminates specific launched EC2 Test and Cutover instances. This command will not work for any
     * Source Server with a lifecycle.state of TESTING, CUTTING_OVER, or CUTOVER.
     * </p>
     * 
     * @param terminateTargetInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TerminateTargetInstances operation returned by the service.
     * @sample AWSmgnAsyncHandler.TerminateTargetInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/TerminateTargetInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TerminateTargetInstancesResult> terminateTargetInstancesAsync(TerminateTargetInstancesRequest terminateTargetInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<TerminateTargetInstancesRequest, TerminateTargetInstancesResult> asyncHandler);

    /**
     * <p>
     * Unarchive application.
     * </p>
     * 
     * @param unarchiveApplicationRequest
     * @return A Java Future containing the result of the UnarchiveApplication operation returned by the service.
     * @sample AWSmgnAsync.UnarchiveApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UnarchiveApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UnarchiveApplicationResult> unarchiveApplicationAsync(UnarchiveApplicationRequest unarchiveApplicationRequest);

    /**
     * <p>
     * Unarchive application.
     * </p>
     * 
     * @param unarchiveApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UnarchiveApplication operation returned by the service.
     * @sample AWSmgnAsyncHandler.UnarchiveApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UnarchiveApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UnarchiveApplicationResult> unarchiveApplicationAsync(UnarchiveApplicationRequest unarchiveApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<UnarchiveApplicationRequest, UnarchiveApplicationResult> asyncHandler);

    /**
     * <p>
     * Unarchive wave.
     * </p>
     * 
     * @param unarchiveWaveRequest
     * @return A Java Future containing the result of the UnarchiveWave operation returned by the service.
     * @sample AWSmgnAsync.UnarchiveWave
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UnarchiveWave" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UnarchiveWaveResult> unarchiveWaveAsync(UnarchiveWaveRequest unarchiveWaveRequest);

    /**
     * <p>
     * Unarchive wave.
     * </p>
     * 
     * @param unarchiveWaveRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UnarchiveWave operation returned by the service.
     * @sample AWSmgnAsyncHandler.UnarchiveWave
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UnarchiveWave" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UnarchiveWaveResult> unarchiveWaveAsync(UnarchiveWaveRequest unarchiveWaveRequest,
            com.amazonaws.handlers.AsyncHandler<UnarchiveWaveRequest, UnarchiveWaveResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified set of tags from the specified set of Application Migration Service resources.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSmgnAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Deletes the specified set of tags from the specified set of Application Migration Service resources.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSmgnAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Update application.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AWSmgnAsync.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest);

    /**
     * <p>
     * Update application.
     * </p>
     * 
     * @param updateApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AWSmgnAsyncHandler.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler);

    /**
     * <p>
     * Updates multiple LaunchConfigurations by Source Server ID.
     * </p>
     * 
     * @param updateLaunchConfigurationRequest
     * @return A Java Future containing the result of the UpdateLaunchConfiguration operation returned by the service.
     * @sample AWSmgnAsync.UpdateLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateLaunchConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLaunchConfigurationResult> updateLaunchConfigurationAsync(
            UpdateLaunchConfigurationRequest updateLaunchConfigurationRequest);

    /**
     * <p>
     * Updates multiple LaunchConfigurations by Source Server ID.
     * </p>
     * 
     * @param updateLaunchConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLaunchConfiguration operation returned by the service.
     * @sample AWSmgnAsyncHandler.UpdateLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateLaunchConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLaunchConfigurationResult> updateLaunchConfigurationAsync(
            UpdateLaunchConfigurationRequest updateLaunchConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLaunchConfigurationRequest, UpdateLaunchConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates an existing Launch Configuration Template by ID.
     * </p>
     * 
     * @param updateLaunchConfigurationTemplateRequest
     * @return A Java Future containing the result of the UpdateLaunchConfigurationTemplate operation returned by the
     *         service.
     * @sample AWSmgnAsync.UpdateLaunchConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateLaunchConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLaunchConfigurationTemplateResult> updateLaunchConfigurationTemplateAsync(
            UpdateLaunchConfigurationTemplateRequest updateLaunchConfigurationTemplateRequest);

    /**
     * <p>
     * Updates an existing Launch Configuration Template by ID.
     * </p>
     * 
     * @param updateLaunchConfigurationTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLaunchConfigurationTemplate operation returned by the
     *         service.
     * @sample AWSmgnAsyncHandler.UpdateLaunchConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateLaunchConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLaunchConfigurationTemplateResult> updateLaunchConfigurationTemplateAsync(
            UpdateLaunchConfigurationTemplateRequest updateLaunchConfigurationTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLaunchConfigurationTemplateRequest, UpdateLaunchConfigurationTemplateResult> asyncHandler);

    /**
     * <p>
     * Allows you to update multiple ReplicationConfigurations by Source Server ID.
     * </p>
     * 
     * @param updateReplicationConfigurationRequest
     * @return A Java Future containing the result of the UpdateReplicationConfiguration operation returned by the
     *         service.
     * @sample AWSmgnAsync.UpdateReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReplicationConfigurationResult> updateReplicationConfigurationAsync(
            UpdateReplicationConfigurationRequest updateReplicationConfigurationRequest);

    /**
     * <p>
     * Allows you to update multiple ReplicationConfigurations by Source Server ID.
     * </p>
     * 
     * @param updateReplicationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateReplicationConfiguration operation returned by the
     *         service.
     * @sample AWSmgnAsyncHandler.UpdateReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReplicationConfigurationResult> updateReplicationConfigurationAsync(
            UpdateReplicationConfigurationRequest updateReplicationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateReplicationConfigurationRequest, UpdateReplicationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates multiple ReplicationConfigurationTemplates by ID.
     * </p>
     * 
     * @param updateReplicationConfigurationTemplateRequest
     * @return A Java Future containing the result of the UpdateReplicationConfigurationTemplate operation returned by
     *         the service.
     * @sample AWSmgnAsync.UpdateReplicationConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateReplicationConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReplicationConfigurationTemplateResult> updateReplicationConfigurationTemplateAsync(
            UpdateReplicationConfigurationTemplateRequest updateReplicationConfigurationTemplateRequest);

    /**
     * <p>
     * Updates multiple ReplicationConfigurationTemplates by ID.
     * </p>
     * 
     * @param updateReplicationConfigurationTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateReplicationConfigurationTemplate operation returned by
     *         the service.
     * @sample AWSmgnAsyncHandler.UpdateReplicationConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateReplicationConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReplicationConfigurationTemplateResult> updateReplicationConfigurationTemplateAsync(
            UpdateReplicationConfigurationTemplateRequest updateReplicationConfigurationTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateReplicationConfigurationTemplateRequest, UpdateReplicationConfigurationTemplateResult> asyncHandler);

    /**
     * <p>
     * Allows you to change between the AGENT_BASED replication type and the SNAPSHOT_SHIPPING replication type.
     * </p>
     * 
     * @param updateSourceServerReplicationTypeRequest
     * @return A Java Future containing the result of the UpdateSourceServerReplicationType operation returned by the
     *         service.
     * @sample AWSmgnAsync.UpdateSourceServerReplicationType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateSourceServerReplicationType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSourceServerReplicationTypeResult> updateSourceServerReplicationTypeAsync(
            UpdateSourceServerReplicationTypeRequest updateSourceServerReplicationTypeRequest);

    /**
     * <p>
     * Allows you to change between the AGENT_BASED replication type and the SNAPSHOT_SHIPPING replication type.
     * </p>
     * 
     * @param updateSourceServerReplicationTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSourceServerReplicationType operation returned by the
     *         service.
     * @sample AWSmgnAsyncHandler.UpdateSourceServerReplicationType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateSourceServerReplicationType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSourceServerReplicationTypeResult> updateSourceServerReplicationTypeAsync(
            UpdateSourceServerReplicationTypeRequest updateSourceServerReplicationTypeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSourceServerReplicationTypeRequest, UpdateSourceServerReplicationTypeResult> asyncHandler);

    /**
     * <p>
     * Update wave.
     * </p>
     * 
     * @param updateWaveRequest
     * @return A Java Future containing the result of the UpdateWave operation returned by the service.
     * @sample AWSmgnAsync.UpdateWave
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateWave" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWaveResult> updateWaveAsync(UpdateWaveRequest updateWaveRequest);

    /**
     * <p>
     * Update wave.
     * </p>
     * 
     * @param updateWaveRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWave operation returned by the service.
     * @sample AWSmgnAsyncHandler.UpdateWave
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateWave" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWaveResult> updateWaveAsync(UpdateWaveRequest updateWaveRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWaveRequest, UpdateWaveResult> asyncHandler);

}
