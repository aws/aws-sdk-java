/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworkscm;

import com.amazonaws.services.opsworkscm.model.*;

/**
 * Interface for accessing OpsWorksCM asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.opsworkscm.AbstractAWSOpsWorksCMAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS OpsWorks for Chef Automate</fullname>
 * <p>
 * A service that runs and manages configuration management servers.
 * </p>
 * <p>
 * Glossary of terms
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Server</b>: A server is a configuration management server, and can be highly-available. The configuration manager
 * runs on your instances by using various AWS services, such as Amazon Elastic Compute Cloud (EC2), and potentially
 * Amazon Relational Database Service (RDS). A server is a generic abstraction over the configuration manager that you
 * want to use, much like Amazon RDS. In AWS OpsWorks for Chef Automate, you do not start or stop servers. After you
 * create servers, they continue to run until they are deleted.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Engine</b>: The specific configuration manager that you want to use (such as <code>Chef</code>) is the engine.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Backup</b>: This is an application-level backup of the data that the configuration manager stores. A backup
 * creates a .tar.gz file that is stored in an Amazon Simple Storage Service (S3) bucket in your account. AWS OpsWorks
 * for Chef Automate creates the S3 bucket when you launch the first instance. A backup maintains a snapshot of all of a
 * server's important attributes at the time of the backup.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Events</b>: Events are always related to a server. Events are written during server creation, when health checks
 * run, when backups are created, etc. When you delete a server, the server's events are also deleted.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>AccountAttributes</b>: Every account has attributes that are assigned in the AWS OpsWorks for Chef Automate
 * database. These attributes store information about configuration limits (servers, backups, etc.) and your customer
 * account.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Throttling limits
 * </p>
 * <p>
 * All API operations allow for 5 requests per second with a burst of 10 requests per second.
 * </p>
 */
public interface AWSOpsWorksCMAsync extends AWSOpsWorksCM {

    /**
     * @param associateNodeRequest
     * @return A Java Future containing the result of the AssociateNode operation returned by the service.
     * @sample AWSOpsWorksCMAsync.AssociateNode
     */
    java.util.concurrent.Future<AssociateNodeResult> associateNodeAsync(AssociateNodeRequest associateNodeRequest);

    /**
     * @param associateNodeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateNode operation returned by the service.
     * @sample AWSOpsWorksCMAsyncHandler.AssociateNode
     */
    java.util.concurrent.Future<AssociateNodeResult> associateNodeAsync(AssociateNodeRequest associateNodeRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateNodeRequest, AssociateNodeResult> asyncHandler);

    /**
     * <p>
     * Creates an application-level backup of a server. While the server is <code>BACKING_UP</code>, the server can not
     * be modified and no additional backup can be created.
     * </p>
     * <p>
     * Backups can be created for <code>RUNNING</code>, <code>HEALTHY</code> and <code>UNHEALTHY</code> servers.
     * </p>
     * <p>
     * This operation is asnychronous.
     * </p>
     * <p>
     * By default 50 manual backups can be created.
     * </p>
     * <p>
     * A <code>LimitExceededException</code> is thrown then the maximum number of manual backup is reached. A
     * <code>InvalidStateException</code> is thrown when the server is not in any of RUNNING, HEALTHY, UNHEALTHY. A
     * <code>ResourceNotFoundException</code> is thrown when the server is not found. A <code>ValidationException</code>
     * is thrown when parameters of the request are not valid.
     * </p>
     * 
     * @param createBackupRequest
     * @return A Java Future containing the result of the CreateBackup operation returned by the service.
     * @sample AWSOpsWorksCMAsync.CreateBackup
     */
    java.util.concurrent.Future<CreateBackupResult> createBackupAsync(CreateBackupRequest createBackupRequest);

    /**
     * <p>
     * Creates an application-level backup of a server. While the server is <code>BACKING_UP</code>, the server can not
     * be modified and no additional backup can be created.
     * </p>
     * <p>
     * Backups can be created for <code>RUNNING</code>, <code>HEALTHY</code> and <code>UNHEALTHY</code> servers.
     * </p>
     * <p>
     * This operation is asnychronous.
     * </p>
     * <p>
     * By default 50 manual backups can be created.
     * </p>
     * <p>
     * A <code>LimitExceededException</code> is thrown then the maximum number of manual backup is reached. A
     * <code>InvalidStateException</code> is thrown when the server is not in any of RUNNING, HEALTHY, UNHEALTHY. A
     * <code>ResourceNotFoundException</code> is thrown when the server is not found. A <code>ValidationException</code>
     * is thrown when parameters of the request are not valid.
     * </p>
     * 
     * @param createBackupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBackup operation returned by the service.
     * @sample AWSOpsWorksCMAsyncHandler.CreateBackup
     */
    java.util.concurrent.Future<CreateBackupResult> createBackupAsync(CreateBackupRequest createBackupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBackupRequest, CreateBackupResult> asyncHandler);

    /**
     * <p>
     * Creates and immedately starts a new Server. The server can be used once it has reached the <code>HEALTHY</code>
     * state.
     * </p>
     * <p>
     * This operation is asnychronous.
     * </p>
     * <p>
     * A <code>LimitExceededException</code> is thrown then the maximum number of server backup is reached. A
     * <code>ResourceAlreadyExistsException</code> is raise when a server with the same name already exists in the
     * account. A <code>ResourceNotFoundException</code> is thrown when a backupId is passed, but the backup does not
     * exist. A <code>ValidationException</code> is thrown when parameters of the request are not valid.
     * </p>
     * <p>
     * By default 10 servers can be created. A <code>LimitExceededException</code> is raised when the limit is exceeded.
     * </p>
     * <p>
     * When no security groups are provided by using <code>SecurityGroupIds</code>, AWS OpsWorks creates a new security
     * group. This security group opens the Chef server to the world on TCP port 443. If a KeyName is present, SSH
     * access is enabled. SSH is also open to the world on TCP port 22.
     * </p>
     * <p>
     * By default, the Chef Server is accessible from any IP address. We recommend that you update your security group
     * rules to allow access from known IP addresses and address ranges only. To edit security group rules, open
     * Security Groups in the navigation pane of the EC2 management console.
     * </p>
     * 
     * @param createServerRequest
     * @return A Java Future containing the result of the CreateServer operation returned by the service.
     * @sample AWSOpsWorksCMAsync.CreateServer
     */
    java.util.concurrent.Future<CreateServerResult> createServerAsync(CreateServerRequest createServerRequest);

    /**
     * <p>
     * Creates and immedately starts a new Server. The server can be used once it has reached the <code>HEALTHY</code>
     * state.
     * </p>
     * <p>
     * This operation is asnychronous.
     * </p>
     * <p>
     * A <code>LimitExceededException</code> is thrown then the maximum number of server backup is reached. A
     * <code>ResourceAlreadyExistsException</code> is raise when a server with the same name already exists in the
     * account. A <code>ResourceNotFoundException</code> is thrown when a backupId is passed, but the backup does not
     * exist. A <code>ValidationException</code> is thrown when parameters of the request are not valid.
     * </p>
     * <p>
     * By default 10 servers can be created. A <code>LimitExceededException</code> is raised when the limit is exceeded.
     * </p>
     * <p>
     * When no security groups are provided by using <code>SecurityGroupIds</code>, AWS OpsWorks creates a new security
     * group. This security group opens the Chef server to the world on TCP port 443. If a KeyName is present, SSH
     * access is enabled. SSH is also open to the world on TCP port 22.
     * </p>
     * <p>
     * By default, the Chef Server is accessible from any IP address. We recommend that you update your security group
     * rules to allow access from known IP addresses and address ranges only. To edit security group rules, open
     * Security Groups in the navigation pane of the EC2 management console.
     * </p>
     * 
     * @param createServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateServer operation returned by the service.
     * @sample AWSOpsWorksCMAsyncHandler.CreateServer
     */
    java.util.concurrent.Future<CreateServerResult> createServerAsync(CreateServerRequest createServerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateServerRequest, CreateServerResult> asyncHandler);

    /**
     * <p>
     * Deletes a backup. You can delete both manual and automated backups.
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * A <code>InvalidStateException</code> is thrown then a backup is already deleting. A
     * <code>ResourceNotFoundException</code> is thrown when the backup does not exist. A
     * <code>ValidationException</code> is thrown when parameters of the request are not valid.
     * </p>
     * 
     * @param deleteBackupRequest
     * @return A Java Future containing the result of the DeleteBackup operation returned by the service.
     * @sample AWSOpsWorksCMAsync.DeleteBackup
     */
    java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest deleteBackupRequest);

    /**
     * <p>
     * Deletes a backup. You can delete both manual and automated backups.
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * A <code>InvalidStateException</code> is thrown then a backup is already deleting. A
     * <code>ResourceNotFoundException</code> is thrown when the backup does not exist. A
     * <code>ValidationException</code> is thrown when parameters of the request are not valid.
     * </p>
     * 
     * @param deleteBackupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBackup operation returned by the service.
     * @sample AWSOpsWorksCMAsyncHandler.DeleteBackup
     */
    java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest deleteBackupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBackupRequest, DeleteBackupResult> asyncHandler);

    /**
     * <p>
     * Deletes the server and the underlying AWS CloudFormation stack (including the server's EC2 instance). The server
     * status updated to <code>DELETING</code>. Once the server is successfully deleted, it will no longer be returned
     * by <code>DescribeServer</code> requests. If the AWS CloudFormation stack cannot be deleted, the server cannot be
     * deleted.
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * A <code>InvalidStateException</code> is thrown then a server is already deleting. A
     * <code>ResourceNotFoundException</code> is thrown when the server does not exist. A
     * <code>ValidationException</code> is raised when parameters of the request are invalid.
     * </p>
     * <p>
     * </p>
     * 
     * @param deleteServerRequest
     * @return A Java Future containing the result of the DeleteServer operation returned by the service.
     * @sample AWSOpsWorksCMAsync.DeleteServer
     */
    java.util.concurrent.Future<DeleteServerResult> deleteServerAsync(DeleteServerRequest deleteServerRequest);

    /**
     * <p>
     * Deletes the server and the underlying AWS CloudFormation stack (including the server's EC2 instance). The server
     * status updated to <code>DELETING</code>. Once the server is successfully deleted, it will no longer be returned
     * by <code>DescribeServer</code> requests. If the AWS CloudFormation stack cannot be deleted, the server cannot be
     * deleted.
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * A <code>InvalidStateException</code> is thrown then a server is already deleting. A
     * <code>ResourceNotFoundException</code> is thrown when the server does not exist. A
     * <code>ValidationException</code> is raised when parameters of the request are invalid.
     * </p>
     * <p>
     * </p>
     * 
     * @param deleteServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteServer operation returned by the service.
     * @sample AWSOpsWorksCMAsyncHandler.DeleteServer
     */
    java.util.concurrent.Future<DeleteServerResult> deleteServerAsync(DeleteServerRequest deleteServerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteServerRequest, DeleteServerResult> asyncHandler);

    /**
     * <p>
     * Describes your account attributes, and creates requests to increase limits before they are reached or exceeded.
     * </p>
     * <p>
     * This operation is synchronous.
     * </p>
     * 
     * @param describeAccountAttributesRequest
     * @return A Java Future containing the result of the DescribeAccountAttributes operation returned by the service.
     * @sample AWSOpsWorksCMAsync.DescribeAccountAttributes
     */
    java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(
            DescribeAccountAttributesRequest describeAccountAttributesRequest);

    /**
     * <p>
     * Describes your account attributes, and creates requests to increase limits before they are reached or exceeded.
     * </p>
     * <p>
     * This operation is synchronous.
     * </p>
     * 
     * @param describeAccountAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountAttributes operation returned by the service.
     * @sample AWSOpsWorksCMAsyncHandler.DescribeAccountAttributes
     */
    java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(
            DescribeAccountAttributesRequest describeAccountAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountAttributesRequest, DescribeAccountAttributesResult> asyncHandler);

    /**
     * <p>
     * Describes backups. The results are ordered by time, with newest backups first. If you do not specify a BackupId
     * or ServerName, the command returns all backups.
     * </p>
     * <p>
     * This operation is synchronous.
     * </p>
     * <p>
     * A <code>ResourceNotFoundException</code> is thrown when the backup does not exist. A
     * <code>ValidationException</code> is raised when parameters of the request are invalid.
     * </p>
     * 
     * @param describeBackupsRequest
     * @return A Java Future containing the result of the DescribeBackups operation returned by the service.
     * @sample AWSOpsWorksCMAsync.DescribeBackups
     */
    java.util.concurrent.Future<DescribeBackupsResult> describeBackupsAsync(DescribeBackupsRequest describeBackupsRequest);

    /**
     * <p>
     * Describes backups. The results are ordered by time, with newest backups first. If you do not specify a BackupId
     * or ServerName, the command returns all backups.
     * </p>
     * <p>
     * This operation is synchronous.
     * </p>
     * <p>
     * A <code>ResourceNotFoundException</code> is thrown when the backup does not exist. A
     * <code>ValidationException</code> is raised when parameters of the request are invalid.
     * </p>
     * 
     * @param describeBackupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBackups operation returned by the service.
     * @sample AWSOpsWorksCMAsyncHandler.DescribeBackups
     */
    java.util.concurrent.Future<DescribeBackupsResult> describeBackupsAsync(DescribeBackupsRequest describeBackupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBackupsRequest, DescribeBackupsResult> asyncHandler);

    /**
     * <p>
     * Describes events for a specified server. Results are ordered by time, with newest events first.
     * </p>
     * <p>
     * This operation is synchronous.
     * </p>
     * <p>
     * A <code>ResourceNotFoundException</code> is thrown when the server does not exist. A
     * <code>ValidationException</code> is raised when parameters of the request are invalid.
     * </p>
     * 
     * @param describeEventsRequest
     * @return A Java Future containing the result of the DescribeEvents operation returned by the service.
     * @sample AWSOpsWorksCMAsync.DescribeEvents
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest describeEventsRequest);

    /**
     * <p>
     * Describes events for a specified server. Results are ordered by time, with newest events first.
     * </p>
     * <p>
     * This operation is synchronous.
     * </p>
     * <p>
     * A <code>ResourceNotFoundException</code> is thrown when the server does not exist. A
     * <code>ValidationException</code> is raised when parameters of the request are invalid.
     * </p>
     * 
     * @param describeEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEvents operation returned by the service.
     * @sample AWSOpsWorksCMAsyncHandler.DescribeEvents
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest describeEventsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler);

    /**
     * @param describeNodeAssociationStatusRequest
     * @return A Java Future containing the result of the DescribeNodeAssociationStatus operation returned by the
     *         service.
     * @sample AWSOpsWorksCMAsync.DescribeNodeAssociationStatus
     */
    java.util.concurrent.Future<DescribeNodeAssociationStatusResult> describeNodeAssociationStatusAsync(
            DescribeNodeAssociationStatusRequest describeNodeAssociationStatusRequest);

    /**
     * @param describeNodeAssociationStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeNodeAssociationStatus operation returned by the
     *         service.
     * @sample AWSOpsWorksCMAsyncHandler.DescribeNodeAssociationStatus
     */
    java.util.concurrent.Future<DescribeNodeAssociationStatusResult> describeNodeAssociationStatusAsync(
            DescribeNodeAssociationStatusRequest describeNodeAssociationStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeNodeAssociationStatusRequest, DescribeNodeAssociationStatusResult> asyncHandler);

    /**
     * <p>
     * Lists all configuration management servers that are identified with your account. Only the stored results from
     * Amazon DynamoDB are returned. AWS OpsWorks for Chef Automate does not query other services.
     * </p>
     * <p>
     * This operation is synchronous.
     * </p>
     * <p>
     * A <code>ResourceNotFoundException</code> is thrown when the server does not exist. A
     * <code>ValidationException</code> is raised when parameters of the request are invalid.
     * </p>
     * 
     * @param describeServersRequest
     * @return A Java Future containing the result of the DescribeServers operation returned by the service.
     * @sample AWSOpsWorksCMAsync.DescribeServers
     */
    java.util.concurrent.Future<DescribeServersResult> describeServersAsync(DescribeServersRequest describeServersRequest);

    /**
     * <p>
     * Lists all configuration management servers that are identified with your account. Only the stored results from
     * Amazon DynamoDB are returned. AWS OpsWorks for Chef Automate does not query other services.
     * </p>
     * <p>
     * This operation is synchronous.
     * </p>
     * <p>
     * A <code>ResourceNotFoundException</code> is thrown when the server does not exist. A
     * <code>ValidationException</code> is raised when parameters of the request are invalid.
     * </p>
     * 
     * @param describeServersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeServers operation returned by the service.
     * @sample AWSOpsWorksCMAsyncHandler.DescribeServers
     */
    java.util.concurrent.Future<DescribeServersResult> describeServersAsync(DescribeServersRequest describeServersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeServersRequest, DescribeServersResult> asyncHandler);

    /**
     * @param disassociateNodeRequest
     * @return A Java Future containing the result of the DisassociateNode operation returned by the service.
     * @sample AWSOpsWorksCMAsync.DisassociateNode
     */
    java.util.concurrent.Future<DisassociateNodeResult> disassociateNodeAsync(DisassociateNodeRequest disassociateNodeRequest);

    /**
     * @param disassociateNodeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateNode operation returned by the service.
     * @sample AWSOpsWorksCMAsyncHandler.DisassociateNode
     */
    java.util.concurrent.Future<DisassociateNodeResult> disassociateNodeAsync(DisassociateNodeRequest disassociateNodeRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateNodeRequest, DisassociateNodeResult> asyncHandler);

    /**
     * <p>
     * Restores a backup to a server that is in a <code>RUNNING</code>, <code>FAILED</code>, or <code>HEALTHY</code>
     * state. When you run RestoreServer, the server's EC2 instance is deleted, and a new EC2 instance is configured.
     * RestoreServer maintains the existing server endpoint, so configuration management of all of the server's client
     * devices should continue to work.
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * A <code>InvalidStateException</code> is thrown when the server is not in a valid state. A
     * <code>ResourceNotFoundException</code> is thrown when the server does not exist. A
     * <code>ValidationException</code> is raised when parameters of the request are invalid.
     * </p>
     * 
     * @param restoreServerRequest
     * @return A Java Future containing the result of the RestoreServer operation returned by the service.
     * @sample AWSOpsWorksCMAsync.RestoreServer
     */
    java.util.concurrent.Future<RestoreServerResult> restoreServerAsync(RestoreServerRequest restoreServerRequest);

    /**
     * <p>
     * Restores a backup to a server that is in a <code>RUNNING</code>, <code>FAILED</code>, or <code>HEALTHY</code>
     * state. When you run RestoreServer, the server's EC2 instance is deleted, and a new EC2 instance is configured.
     * RestoreServer maintains the existing server endpoint, so configuration management of all of the server's client
     * devices should continue to work.
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * A <code>InvalidStateException</code> is thrown when the server is not in a valid state. A
     * <code>ResourceNotFoundException</code> is thrown when the server does not exist. A
     * <code>ValidationException</code> is raised when parameters of the request are invalid.
     * </p>
     * 
     * @param restoreServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreServer operation returned by the service.
     * @sample AWSOpsWorksCMAsyncHandler.RestoreServer
     */
    java.util.concurrent.Future<RestoreServerResult> restoreServerAsync(RestoreServerRequest restoreServerRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreServerRequest, RestoreServerResult> asyncHandler);

    /**
     * <p>
     * Manually starts server maintenance. This command can be useful if an earlier maintenance attempt failed, and the
     * underlying cause of maintenance failure has been resolved. The server will switch to
     * <code>UNDER_MAINTENANCE</code> state, while maintenace is in progress.
     * </p>
     * <p>
     * Maintenace can only be started for <code>HEALTHY</code> and <code>UNHEALTHY</code> servers. A
     * <code>InvalidStateException</code> is thrown otherwise. A <code>ResourceNotFoundException</code> is thrown when
     * the server does not exist. A <code>ValidationException</code> is raised when parameters of the request are
     * invalid.
     * </p>
     * 
     * @param startMaintenanceRequest
     * @return A Java Future containing the result of the StartMaintenance operation returned by the service.
     * @sample AWSOpsWorksCMAsync.StartMaintenance
     */
    java.util.concurrent.Future<StartMaintenanceResult> startMaintenanceAsync(StartMaintenanceRequest startMaintenanceRequest);

    /**
     * <p>
     * Manually starts server maintenance. This command can be useful if an earlier maintenance attempt failed, and the
     * underlying cause of maintenance failure has been resolved. The server will switch to
     * <code>UNDER_MAINTENANCE</code> state, while maintenace is in progress.
     * </p>
     * <p>
     * Maintenace can only be started for <code>HEALTHY</code> and <code>UNHEALTHY</code> servers. A
     * <code>InvalidStateException</code> is thrown otherwise. A <code>ResourceNotFoundException</code> is thrown when
     * the server does not exist. A <code>ValidationException</code> is raised when parameters of the request are
     * invalid.
     * </p>
     * 
     * @param startMaintenanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartMaintenance operation returned by the service.
     * @sample AWSOpsWorksCMAsyncHandler.StartMaintenance
     */
    java.util.concurrent.Future<StartMaintenanceResult> startMaintenanceAsync(StartMaintenanceRequest startMaintenanceRequest,
            com.amazonaws.handlers.AsyncHandler<StartMaintenanceRequest, StartMaintenanceResult> asyncHandler);

    /**
     * <p>
     * Updates settings for a server.
     * </p>
     * <p>
     * This operation is synchronous.
     * </p>
     * 
     * @param updateServerRequest
     * @return A Java Future containing the result of the UpdateServer operation returned by the service.
     * @sample AWSOpsWorksCMAsync.UpdateServer
     */
    java.util.concurrent.Future<UpdateServerResult> updateServerAsync(UpdateServerRequest updateServerRequest);

    /**
     * <p>
     * Updates settings for a server.
     * </p>
     * <p>
     * This operation is synchronous.
     * </p>
     * 
     * @param updateServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateServer operation returned by the service.
     * @sample AWSOpsWorksCMAsyncHandler.UpdateServer
     */
    java.util.concurrent.Future<UpdateServerResult> updateServerAsync(UpdateServerRequest updateServerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServerRequest, UpdateServerResult> asyncHandler);

    /**
     * <p>
     * Updates engine specific attributes on a specified server. Server will enter the <code>MODIFYING</code> state when
     * this operation is in progress. Only one update can take place at a time.
     * </p>
     * <p>
     * This operation can be use to reset Chef Server main API key (<code>CHEF_PIVOTAL_KEY</code>).
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * </p>
     * <p>
     * This operation can only be called for <code>HEALTHY</code> and <code>UNHEALTHY</code> servers. Otherwise a
     * <code>InvalidStateException</code> is raised. A <code>ResourceNotFoundException</code> is thrown when the server
     * does not exist. A <code>ValidationException</code> is raised when parameters of the request are invalid.
     * </p>
     * 
     * @param updateServerEngineAttributesRequest
     * @return A Java Future containing the result of the UpdateServerEngineAttributes operation returned by the
     *         service.
     * @sample AWSOpsWorksCMAsync.UpdateServerEngineAttributes
     */
    java.util.concurrent.Future<UpdateServerEngineAttributesResult> updateServerEngineAttributesAsync(
            UpdateServerEngineAttributesRequest updateServerEngineAttributesRequest);

    /**
     * <p>
     * Updates engine specific attributes on a specified server. Server will enter the <code>MODIFYING</code> state when
     * this operation is in progress. Only one update can take place at a time.
     * </p>
     * <p>
     * This operation can be use to reset Chef Server main API key (<code>CHEF_PIVOTAL_KEY</code>).
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * </p>
     * <p>
     * This operation can only be called for <code>HEALTHY</code> and <code>UNHEALTHY</code> servers. Otherwise a
     * <code>InvalidStateException</code> is raised. A <code>ResourceNotFoundException</code> is thrown when the server
     * does not exist. A <code>ValidationException</code> is raised when parameters of the request are invalid.
     * </p>
     * 
     * @param updateServerEngineAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateServerEngineAttributes operation returned by the
     *         service.
     * @sample AWSOpsWorksCMAsyncHandler.UpdateServerEngineAttributes
     */
    java.util.concurrent.Future<UpdateServerEngineAttributesResult> updateServerEngineAttributesAsync(
            UpdateServerEngineAttributesRequest updateServerEngineAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServerEngineAttributesRequest, UpdateServerEngineAttributesResult> asyncHandler);

}
