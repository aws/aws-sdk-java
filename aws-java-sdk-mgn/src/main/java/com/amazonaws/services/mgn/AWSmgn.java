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
package com.amazonaws.services.mgn;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.mgn.model.*;

/**
 * Interface for accessing mgn.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mgn.AbstractAWSmgn} instead.
 * </p>
 * <p>
 * <p>
 * The Application Migration Service service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSmgn {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "mgn";

    /**
     * <p>
     * Allows the user to set the SourceServer.LifeCycle.state property for specific Source Server IDs to one of the
     * following: READY_FOR_TEST or READY_FOR_CUTOVER. This command only works if the Source Server is already
     * launchable (dataReplicationInfo.lagDuration is not null.)
     * </p>
     * 
     * @param changeServerLifeCycleStateRequest
     * @return Result of the ChangeServerLifeCycleState operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.ChangeServerLifeCycleState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ChangeServerLifeCycleState" target="_top">AWS
     *      API Documentation</a>
     */
    ChangeServerLifeCycleStateResult changeServerLifeCycleState(ChangeServerLifeCycleStateRequest changeServerLifeCycleStateRequest);

    /**
     * <p>
     * Creates a new ReplicationConfigurationTemplate.
     * </p>
     * 
     * @param createReplicationConfigurationTemplateRequest
     * @return Result of the CreateReplicationConfigurationTemplate operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws AccessDeniedException
     *         Operating denied due to a file permission or access check error.
     * @sample AWSmgn.CreateReplicationConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/CreateReplicationConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    CreateReplicationConfigurationTemplateResult createReplicationConfigurationTemplate(
            CreateReplicationConfigurationTemplateRequest createReplicationConfigurationTemplateRequest);

    /**
     * <p>
     * Deletes a single Job by ID.
     * </p>
     * 
     * @param deleteJobRequest
     * @return Result of the DeleteJob operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.DeleteJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteJob" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteJobResult deleteJob(DeleteJobRequest deleteJobRequest);

    /**
     * <p>
     * Deletes a single Replication Configuration Template by ID
     * </p>
     * 
     * @param deleteReplicationConfigurationTemplateRequest
     * @return Result of the DeleteReplicationConfigurationTemplate operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.DeleteReplicationConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteReplicationConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteReplicationConfigurationTemplateResult deleteReplicationConfigurationTemplate(
            DeleteReplicationConfigurationTemplateRequest deleteReplicationConfigurationTemplateRequest);

    /**
     * <p>
     * Deletes a single source server by ID.
     * </p>
     * 
     * @param deleteSourceServerRequest
     * @return Result of the DeleteSourceServer operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.DeleteSourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteSourceServer" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSourceServerResult deleteSourceServer(DeleteSourceServerRequest deleteSourceServerRequest);

    /**
     * <p>
     * Retrieves detailed Job log with paging.
     * </p>
     * 
     * @param describeJobLogItemsRequest
     * @return Result of the DescribeJobLogItems operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ValidationException
     *         Validate exception.
     * @sample AWSmgn.DescribeJobLogItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeJobLogItems" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeJobLogItemsResult describeJobLogItems(DescribeJobLogItemsRequest describeJobLogItemsRequest);

    /**
     * <p>
     * Returns a list of Jobs. Use the JobsID and fromDate and toData filters to limit which jobs are returned. The
     * response is sorted by creationDataTime - latest date first. Jobs are normaly created by the StartTest,
     * StartCutover, and TerminateTargetInstances APIs. Jobs are also created by DiagnosticLaunch and
     * TerminateDiagnosticInstances, which are APIs available only to *Support* and only used in response to relevant
     * support tickets.
     * </p>
     * 
     * @param describeJobsRequest
     * @return Result of the DescribeJobs operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ValidationException
     *         Validate exception.
     * @sample AWSmgn.DescribeJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeJobs" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeJobsResult describeJobs(DescribeJobsRequest describeJobsRequest);

    /**
     * <p>
     * Lists all ReplicationConfigurationTemplates, filtered by Source Server IDs.
     * </p>
     * 
     * @param describeReplicationConfigurationTemplatesRequest
     * @return Result of the DescribeReplicationConfigurationTemplates operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ValidationException
     *         Validate exception.
     * @sample AWSmgn.DescribeReplicationConfigurationTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeReplicationConfigurationTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeReplicationConfigurationTemplatesResult describeReplicationConfigurationTemplates(
            DescribeReplicationConfigurationTemplatesRequest describeReplicationConfigurationTemplatesRequest);

    /**
     * <p>
     * Retrieves all SourceServers or multiple SourceServers by ID.
     * </p>
     * 
     * @param describeSourceServersRequest
     * @return Result of the DescribeSourceServers operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ValidationException
     *         Validate exception.
     * @sample AWSmgn.DescribeSourceServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeSourceServers" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeSourceServersResult describeSourceServers(DescribeSourceServersRequest describeSourceServersRequest);

    /**
     * <p>
     * Disconnects specific Source Servers from Application Migration Service. Data replication is stopped immediately.
     * All AWS resources created by Application Migration Service for enabling the replication of these source servers
     * will be terminated / deleted within 90 minutes. Launched Test or Cutover instances will NOT be terminated. If the
     * agent on the source server has not been prevented from communciating with the Application Migration Service
     * service, then it will receive a command to uninstall itself (within approximately 10 minutes). The following
     * properties of the SourceServer will be changed immediately: dataReplicationInfo.dataReplicationState will be set
     * to DISCONNECTED; The totalStorageBytes property for each of dataReplicationInfo.replicatedDisks will be set to
     * zero; dataReplicationInfo.lagDuration and dataReplicationInfo.lagDurationwill be nullified.
     * </p>
     * 
     * @param disconnectFromServiceRequest
     * @return Result of the DisconnectFromService operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.DisconnectFromService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DisconnectFromService" target="_top">AWS API
     *      Documentation</a>
     */
    DisconnectFromServiceResult disconnectFromService(DisconnectFromServiceRequest disconnectFromServiceRequest);

    /**
     * <p>
     * Finalizes the cutover immediately for specific Source Servers. All AWS resources created by Application Migration
     * Service for enabling the replication of these source servers will be terminated / deleted within 90 minutes.
     * Launched Test or Cutover instances will NOT be terminated. The AWS Replication Agent will receive a command to
     * uninstall itself (within 10 minutes). The following properties of the SourceServer will be changed immediately:
     * dataReplicationInfo.dataReplicationState will be to DISCONNECTED; The SourceServer.lifeCycle.state will be
     * changed to CUTOVER; The totalStorageBytes property fo each of dataReplicationInfo.replicatedDisks will be set to
     * zero; dataReplicationInfo.lagDuration and dataReplicationInfo.lagDurationwill be nullified.
     * </p>
     * 
     * @param finalizeCutoverRequest
     * @return Result of the FinalizeCutover operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.FinalizeCutover
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/FinalizeCutover" target="_top">AWS API
     *      Documentation</a>
     */
    FinalizeCutoverResult finalizeCutover(FinalizeCutoverRequest finalizeCutoverRequest);

    /**
     * <p>
     * Lists all LaunchConfigurations available, filtered by Source Server IDs.
     * </p>
     * 
     * @param getLaunchConfigurationRequest
     * @return Result of the GetLaunchConfiguration operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @sample AWSmgn.GetLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/GetLaunchConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    GetLaunchConfigurationResult getLaunchConfiguration(GetLaunchConfigurationRequest getLaunchConfigurationRequest);

    /**
     * <p>
     * Lists all ReplicationConfigurations, filtered by Source Server ID.
     * </p>
     * 
     * @param getReplicationConfigurationRequest
     * @return Result of the GetReplicationConfiguration operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @sample AWSmgn.GetReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/GetReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetReplicationConfigurationResult getReplicationConfiguration(GetReplicationConfigurationRequest getReplicationConfigurationRequest);

    /**
     * <p>
     * Initialize Application Migration Service.
     * </p>
     * 
     * @param initializeServiceRequest
     * @return Result of the InitializeService operation returned by the service.
     * @throws ValidationException
     *         Validate exception.
     * @throws AccessDeniedException
     *         Operating denied due to a file permission or access check error.
     * @sample AWSmgn.InitializeService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/InitializeService" target="_top">AWS API
     *      Documentation</a>
     */
    InitializeServiceResult initializeService(InitializeServiceRequest initializeServiceRequest);

    /**
     * <p>
     * List all tags for your Application Migration Service resources.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ThrottlingException
     *         Reached throttling quota exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws AccessDeniedException
     *         Operating denied due to a file permission or access check error.
     * @throws InternalServerException
     *         The server encountered an unexpected condition that prevented it from fulfilling the request.
     * @sample AWSmgn.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Archives specific Source Servers by setting the SourceServer.isArchived property to true for specified
     * SourceServers by ID. This command only works for SourceServers with a lifecycle.state which equals DISCONNECTED
     * or CUTOVER.
     * </p>
     * 
     * @param markAsArchivedRequest
     * @return Result of the MarkAsArchived operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.MarkAsArchived
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/MarkAsArchived" target="_top">AWS API
     *      Documentation</a>
     */
    MarkAsArchivedResult markAsArchived(MarkAsArchivedRequest markAsArchivedRequest);

    /**
     * <p>
     * Causes the data replication initiation sequence to begin immediately upon next Handshake for specified
     * SourceServer IDs, regardless of when the previous initiation started. This command will not work if the
     * SourceServer is not stalled or is in a DISCONNECTED or STOPPED state.
     * </p>
     * 
     * @param retryDataReplicationRequest
     * @return Result of the RetryDataReplication operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ValidationException
     *         Validate exception.
     * @sample AWSmgn.RetryDataReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/RetryDataReplication" target="_top">AWS API
     *      Documentation</a>
     */
    RetryDataReplicationResult retryDataReplication(RetryDataReplicationRequest retryDataReplicationRequest);

    /**
     * <p>
     * Launches a Cutover Instance for specific Source Servers. This command starts a LAUNCH job whose initiatedBy
     * property is StartCutover and changes the SourceServer.lifeCycle.state property to CUTTING_OVER.
     * </p>
     * 
     * @param startCutoverRequest
     * @return Result of the StartCutover operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.StartCutover
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/StartCutover" target="_top">AWS API
     *      Documentation</a>
     */
    StartCutoverResult startCutover(StartCutoverRequest startCutoverRequest);

    /**
     * <p>
     * Lauches a Test Instance for specific Source Servers. This command starts a LAUNCH job whose initiatedBy property
     * is StartTest and changes the SourceServer.lifeCycle.state property to TESTING.
     * </p>
     * 
     * @param startTestRequest
     * @return Result of the StartTest operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.StartTest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/StartTest" target="_top">AWS API
     *      Documentation</a>
     */
    StartTestResult startTest(StartTestRequest startTestRequest);

    /**
     * <p>
     * Adds or overwrites only the specified tags for the specified Application Migration Service resource or resources.
     * When you specify an existing tag key, the value is overwritten with the new value. Each resource can have a
     * maximum of 50 tags. Each tag consists of a key and optional value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ThrottlingException
     *         Reached throttling quota exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws AccessDeniedException
     *         Operating denied due to a file permission or access check error.
     * @throws InternalServerException
     *         The server encountered an unexpected condition that prevented it from fulfilling the request.
     * @sample AWSmgn.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Starts a job that terminates specific launched EC2 Test and Cutover instances. This command will not work for any
     * Source Server with a lifecycle.state of TESTING, CUTTING_OVER, or CUTOVER.
     * </p>
     * 
     * @param terminateTargetInstancesRequest
     * @return Result of the TerminateTargetInstances operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.TerminateTargetInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/TerminateTargetInstances" target="_top">AWS
     *      API Documentation</a>
     */
    TerminateTargetInstancesResult terminateTargetInstances(TerminateTargetInstancesRequest terminateTargetInstancesRequest);

    /**
     * <p>
     * Deletes the specified set of tags from the specified set of Application Migration Service resources.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ThrottlingException
     *         Reached throttling quota exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws AccessDeniedException
     *         Operating denied due to a file permission or access check error.
     * @throws InternalServerException
     *         The server encountered an unexpected condition that prevented it from fulfilling the request.
     * @sample AWSmgn.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates multiple LaunchConfigurations by Source Server ID.
     * </p>
     * 
     * @param updateLaunchConfigurationRequest
     * @return Result of the UpdateLaunchConfiguration operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.UpdateLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateLaunchConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateLaunchConfigurationResult updateLaunchConfiguration(UpdateLaunchConfigurationRequest updateLaunchConfigurationRequest);

    /**
     * <p>
     * Allows you to update multiple ReplicationConfigurations by Source Server ID.
     * </p>
     * 
     * @param updateReplicationConfigurationRequest
     * @return Result of the UpdateReplicationConfiguration operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws AccessDeniedException
     *         Operating denied due to a file permission or access check error.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AWSmgn.UpdateReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateReplicationConfigurationResult updateReplicationConfiguration(UpdateReplicationConfigurationRequest updateReplicationConfigurationRequest);

    /**
     * <p>
     * Updates multiple ReplicationConfigurationTemplates by ID.
     * </p>
     * 
     * @param updateReplicationConfigurationTemplateRequest
     * @return Result of the UpdateReplicationConfigurationTemplate operation returned by the service.
     * @throws UninitializedAccountException
     *         Unitialized account exception.
     * @throws ResourceNotFoundException
     *         Resource not found exception.
     * @throws ValidationException
     *         Validate exception.
     * @throws AccessDeniedException
     *         Operating denied due to a file permission or access check error.
     * @sample AWSmgn.UpdateReplicationConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateReplicationConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateReplicationConfigurationTemplateResult updateReplicationConfigurationTemplate(
            UpdateReplicationConfigurationTemplateRequest updateReplicationConfigurationTemplateRequest);

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
