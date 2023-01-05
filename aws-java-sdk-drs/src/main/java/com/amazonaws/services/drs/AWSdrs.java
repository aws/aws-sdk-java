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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.drs.model.*;

/**
 * Interface for accessing drs.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.drs.AbstractAWSdrs} instead.
 * </p>
 * <p>
 * <p>
 * AWS Elastic Disaster Recovery Service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSdrs {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "drs";

    /**
     * <p>
     * Create an extended source server in the target Account based on the source server in staging account.
     * </p>
     * 
     * @param createExtendedSourceServerRequest
     * @return Result of the CreateExtendedSourceServer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ServiceQuotaExceededException
     *         The request could not be completed because its exceeded the service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.CreateExtendedSourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/CreateExtendedSourceServer" target="_top">AWS
     *      API Documentation</a>
     */
    CreateExtendedSourceServerResult createExtendedSourceServer(CreateExtendedSourceServerRequest createExtendedSourceServerRequest);

    /**
     * <p>
     * Creates a new ReplicationConfigurationTemplate.
     * </p>
     * 
     * @param createReplicationConfigurationTemplateRequest
     * @return Result of the CreateReplicationConfigurationTemplate operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ServiceQuotaExceededException
     *         The request could not be completed because its exceeded the service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.CreateReplicationConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/CreateReplicationConfigurationTemplate"
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
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.DeleteJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DeleteJob" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteJobResult deleteJob(DeleteJobRequest deleteJobRequest);

    /**
     * <p>
     * Deletes a single Recovery Instance by ID. This deletes the Recovery Instance resource from Elastic Disaster
     * Recovery. The Recovery Instance must be disconnected first in order to delete it.
     * </p>
     * 
     * @param deleteRecoveryInstanceRequest
     * @return Result of the DeleteRecoveryInstance operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.DeleteRecoveryInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DeleteRecoveryInstance" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRecoveryInstanceResult deleteRecoveryInstance(DeleteRecoveryInstanceRequest deleteRecoveryInstanceRequest);

    /**
     * <p>
     * Deletes a single Replication Configuration Template by ID
     * </p>
     * 
     * @param deleteReplicationConfigurationTemplateRequest
     * @return Result of the DeleteReplicationConfigurationTemplate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.DeleteReplicationConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DeleteReplicationConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteReplicationConfigurationTemplateResult deleteReplicationConfigurationTemplate(
            DeleteReplicationConfigurationTemplateRequest deleteReplicationConfigurationTemplateRequest);

    /**
     * <p>
     * Deletes a single Source Server by ID. The Source Server must be disconnected first.
     * </p>
     * 
     * @param deleteSourceServerRequest
     * @return Result of the DeleteSourceServer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.DeleteSourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DeleteSourceServer" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSourceServerResult deleteSourceServer(DeleteSourceServerRequest deleteSourceServerRequest);

    /**
     * <p>
     * Retrieves a detailed Job log with pagination.
     * </p>
     * 
     * @param describeJobLogItemsRequest
     * @return Result of the DescribeJobLogItems operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.DescribeJobLogItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeJobLogItems" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeJobLogItemsResult describeJobLogItems(DescribeJobLogItemsRequest describeJobLogItemsRequest);

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
     * @return Result of the DescribeJobs operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.DescribeJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeJobs" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeJobsResult describeJobs(DescribeJobsRequest describeJobsRequest);

    /**
     * <p>
     * Lists all Recovery Instances or multiple Recovery Instances by ID.
     * </p>
     * 
     * @param describeRecoveryInstancesRequest
     * @return Result of the DescribeRecoveryInstances operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.DescribeRecoveryInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeRecoveryInstances" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeRecoveryInstancesResult describeRecoveryInstances(DescribeRecoveryInstancesRequest describeRecoveryInstancesRequest);

    /**
     * <p>
     * Lists all Recovery Snapshots for a single Source Server.
     * </p>
     * 
     * @param describeRecoverySnapshotsRequest
     * @return Result of the DescribeRecoverySnapshots operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.DescribeRecoverySnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeRecoverySnapshots" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeRecoverySnapshotsResult describeRecoverySnapshots(DescribeRecoverySnapshotsRequest describeRecoverySnapshotsRequest);

    /**
     * <p>
     * Lists all ReplicationConfigurationTemplates, filtered by Source Server IDs.
     * </p>
     * 
     * @param describeReplicationConfigurationTemplatesRequest
     * @return Result of the DescribeReplicationConfigurationTemplates operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.DescribeReplicationConfigurationTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeReplicationConfigurationTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeReplicationConfigurationTemplatesResult describeReplicationConfigurationTemplates(
            DescribeReplicationConfigurationTemplatesRequest describeReplicationConfigurationTemplatesRequest);

    /**
     * <p>
     * Lists all Source Servers or multiple Source Servers filtered by ID.
     * </p>
     * 
     * @param describeSourceServersRequest
     * @return Result of the DescribeSourceServers operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.DescribeSourceServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeSourceServers" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeSourceServersResult describeSourceServers(DescribeSourceServersRequest describeSourceServersRequest);

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
     * @return Result of the DisconnectRecoveryInstance operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.DisconnectRecoveryInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DisconnectRecoveryInstance" target="_top">AWS
     *      API Documentation</a>
     */
    DisconnectRecoveryInstanceResult disconnectRecoveryInstance(DisconnectRecoveryInstanceRequest disconnectRecoveryInstanceRequest);

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
     * @return Result of the DisconnectSourceServer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.DisconnectSourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DisconnectSourceServer" target="_top">AWS API
     *      Documentation</a>
     */
    DisconnectSourceServerResult disconnectSourceServer(DisconnectSourceServerRequest disconnectSourceServerRequest);

    /**
     * <p>
     * Lists all Failback ReplicationConfigurations, filtered by Recovery Instance ID.
     * </p>
     * 
     * @param getFailbackReplicationConfigurationRequest
     * @return Result of the GetFailbackReplicationConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.GetFailbackReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/GetFailbackReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetFailbackReplicationConfigurationResult getFailbackReplicationConfiguration(
            GetFailbackReplicationConfigurationRequest getFailbackReplicationConfigurationRequest);

    /**
     * <p>
     * Gets a LaunchConfiguration, filtered by Source Server IDs.
     * </p>
     * 
     * @param getLaunchConfigurationRequest
     * @return Result of the GetLaunchConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.GetLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/GetLaunchConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    GetLaunchConfigurationResult getLaunchConfiguration(GetLaunchConfigurationRequest getLaunchConfigurationRequest);

    /**
     * <p>
     * Gets a ReplicationConfiguration, filtered by Source Server ID.
     * </p>
     * 
     * @param getReplicationConfigurationRequest
     * @return Result of the GetReplicationConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.GetReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/GetReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetReplicationConfigurationResult getReplicationConfiguration(GetReplicationConfigurationRequest getReplicationConfigurationRequest);

    /**
     * <p>
     * Initialize Elastic Disaster Recovery.
     * </p>
     * 
     * @param initializeServiceRequest
     * @return Result of the InitializeService operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @sample AWSdrs.InitializeService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/InitializeService" target="_top">AWS API
     *      Documentation</a>
     */
    InitializeServiceResult initializeService(InitializeServiceRequest initializeServiceRequest);

    /**
     * <p>
     * Returns a list of source servers on a staging account that are extensible, which means that: a. The source server
     * is not already extended into this Account. b. The source server on the Account we’re reading from is not an
     * extension of another source server.
     * </p>
     * 
     * @param listExtensibleSourceServersRequest
     * @return Result of the ListExtensibleSourceServers operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.ListExtensibleSourceServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/ListExtensibleSourceServers"
     *      target="_top">AWS API Documentation</a>
     */
    ListExtensibleSourceServersResult listExtensibleSourceServers(ListExtensibleSourceServersRequest listExtensibleSourceServersRequest);

    /**
     * <p>
     * Returns an array of staging accounts for existing extended source servers.
     * </p>
     * 
     * @param listStagingAccountsRequest
     * @return Result of the ListStagingAccounts operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.ListStagingAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/ListStagingAccounts" target="_top">AWS API
     *      Documentation</a>
     */
    ListStagingAccountsResult listStagingAccounts(ListStagingAccountsRequest listStagingAccountsRequest);

    /**
     * <p>
     * List all tags for your Elastic Disaster Recovery resources.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @sample AWSdrs.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Causes the data replication initiation sequence to begin immediately upon next Handshake for the specified Source
     * Server ID, regardless of when the previous initiation started. This command will work only if the Source Server
     * is stalled or is in a DISCONNECTED or STOPPED state.
     * </p>
     * 
     * @param retryDataReplicationRequest
     * @return Result of the RetryDataReplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.RetryDataReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/RetryDataReplication" target="_top">AWS API
     *      Documentation</a>
     */
    RetryDataReplicationResult retryDataReplication(RetryDataReplicationRequest retryDataReplicationRequest);

    /**
     * <p>
     * Start replication to origin / target region - applies only to protected instances that originated in EC2. For
     * recovery instances on target region - starts replication back to origin region. For failback instances on origin
     * region - starts replication to target region to re-protect them.
     * </p>
     * 
     * @param reverseReplicationRequest
     * @return Result of the ReverseReplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.ReverseReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/ReverseReplication" target="_top">AWS API
     *      Documentation</a>
     */
    ReverseReplicationResult reverseReplication(ReverseReplicationRequest reverseReplicationRequest);

    /**
     * <p>
     * Initiates a Job for launching the machine that is being failed back to from the specified Recovery Instance. This
     * will run conversion on the failback client and will reboot your machine, thus completing the failback process.
     * </p>
     * 
     * @param startFailbackLaunchRequest
     * @return Result of the StartFailbackLaunch operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ServiceQuotaExceededException
     *         The request could not be completed because its exceeded the service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.StartFailbackLaunch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StartFailbackLaunch" target="_top">AWS API
     *      Documentation</a>
     */
    StartFailbackLaunchResult startFailbackLaunch(StartFailbackLaunchRequest startFailbackLaunchRequest);

    /**
     * <p>
     * Launches Recovery Instances for the specified Source Servers. For each Source Server you may choose a point in
     * time snapshot to launch from, or use an on demand snapshot.
     * </p>
     * 
     * @param startRecoveryRequest
     * @return Result of the StartRecovery operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ServiceQuotaExceededException
     *         The request could not be completed because its exceeded the service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.StartRecovery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StartRecovery" target="_top">AWS API
     *      Documentation</a>
     */
    StartRecoveryResult startRecovery(StartRecoveryRequest startRecoveryRequest);

    /**
     * <p>
     * Starts replication for a stopped Source Server. This action would make the Source Server protected again and
     * restart billing for it.
     * </p>
     * 
     * @param startReplicationRequest
     * @return Result of the StartReplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.StartReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StartReplication" target="_top">AWS API
     *      Documentation</a>
     */
    StartReplicationResult startReplication(StartReplicationRequest startReplicationRequest);

    /**
     * <p>
     * Stops the failback process for a specified Recovery Instance. This changes the Failback State of the Recovery
     * Instance back to FAILBACK_NOT_STARTED.
     * </p>
     * 
     * @param stopFailbackRequest
     * @return Result of the StopFailback operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.StopFailback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StopFailback" target="_top">AWS API
     *      Documentation</a>
     */
    StopFailbackResult stopFailback(StopFailbackRequest stopFailbackRequest);

    /**
     * <p>
     * Stops replication for a Source Server. This action would make the Source Server unprotected, delete its existing
     * snapshots and stop billing for it.
     * </p>
     * 
     * @param stopReplicationRequest
     * @return Result of the StopReplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.StopReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StopReplication" target="_top">AWS API
     *      Documentation</a>
     */
    StopReplicationResult stopReplication(StopReplicationRequest stopReplicationRequest);

    /**
     * <p>
     * Adds or overwrites only the specified tags for the specified Elastic Disaster Recovery resource or resources.
     * When you specify an existing tag key, the value is overwritten with the new value. Each resource can have a
     * maximum of 50 tags. Each tag consists of a key and optional value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @sample AWSdrs.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Initiates a Job for terminating the EC2 resources associated with the specified Recovery Instances, and then will
     * delete the Recovery Instances from the Elastic Disaster Recovery service.
     * </p>
     * 
     * @param terminateRecoveryInstancesRequest
     * @return Result of the TerminateRecoveryInstances operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ServiceQuotaExceededException
     *         The request could not be completed because its exceeded the service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.TerminateRecoveryInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/TerminateRecoveryInstances" target="_top">AWS
     *      API Documentation</a>
     */
    TerminateRecoveryInstancesResult terminateRecoveryInstances(TerminateRecoveryInstancesRequest terminateRecoveryInstancesRequest);

    /**
     * <p>
     * Deletes the specified set of tags from the specified set of Elastic Disaster Recovery resources.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @sample AWSdrs.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Allows you to update the failback replication configuration of a Recovery Instance by ID.
     * </p>
     * 
     * @param updateFailbackReplicationConfigurationRequest
     * @return Result of the UpdateFailbackReplicationConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.UpdateFailbackReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/UpdateFailbackReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateFailbackReplicationConfigurationResult updateFailbackReplicationConfiguration(
            UpdateFailbackReplicationConfigurationRequest updateFailbackReplicationConfigurationRequest);

    /**
     * <p>
     * Updates a LaunchConfiguration by Source Server ID.
     * </p>
     * 
     * @param updateLaunchConfigurationRequest
     * @return Result of the UpdateLaunchConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.UpdateLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/UpdateLaunchConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateLaunchConfigurationResult updateLaunchConfiguration(UpdateLaunchConfigurationRequest updateLaunchConfigurationRequest);

    /**
     * <p>
     * Allows you to update a ReplicationConfiguration by Source Server ID.
     * </p>
     * 
     * @param updateReplicationConfigurationRequest
     * @return Result of the UpdateReplicationConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.UpdateReplicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/UpdateReplicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateReplicationConfigurationResult updateReplicationConfiguration(UpdateReplicationConfigurationRequest updateReplicationConfigurationRequest);

    /**
     * <p>
     * Updates a ReplicationConfigurationTemplate by ID.
     * </p>
     * 
     * @param updateReplicationConfigurationTemplateRequest
     * @return Result of the UpdateReplicationConfigurationTemplate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource for this operation was not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service.
     * @throws UninitializedAccountException
     *         The account performing the request has not been initialized.
     * @sample AWSdrs.UpdateReplicationConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/UpdateReplicationConfigurationTemplate"
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
