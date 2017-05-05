/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

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
 * AWS OpsWorks for Chef Automate is a service that runs and manages configuration management servers.
 * </p>
 * <p>
 * <b>Glossary of terms</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Server</b>: A configuration management server that can be highly-available. The configuration manager runs on your
 * instances by using various AWS services, such as Amazon Elastic Compute Cloud (EC2), and potentially Amazon
 * Relational Database Service (RDS). A server is a generic abstraction over the configuration manager that you want to
 * use, much like Amazon RDS. In AWS OpsWorks for Chef Automate, you do not start or stop servers. After you create
 * servers, they continue to run until they are deleted.
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
 * <b>Endpoints</b>
 * </p>
 * <p>
 * AWS OpsWorks for Chef Automate supports the following endpoints, all HTTPS. You must connect to one of the following
 * endpoints. Chef servers can only be accessed or managed within the endpoint in which they are created.
 * </p>
 * <ul>
 * <li>
 * <p>
 * opsworks-cm.us-east-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.us-west-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.eu-west-1.amazonaws.com
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Throttling limits</b>
 * </p>
 * <p>
 * All API operations allow for five requests per second with a burst of 10 requests per second.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSOpsWorksCMAsync extends AWSOpsWorksCM {

    /**
     * <p>
     * Associates a new node with the Chef server. This command is an alternative to <code>knife bootstrap</code>. For
     * more information about how to disassociate a node, see <a>DisassociateNode</a>.
     * </p>
     * <p>
     * A node can can only be associated with servers that are in a <code>HEALTHY</code> state. Otherwise, an
     * <code>InvalidStateException</code> is thrown. A <code>ResourceNotFoundException</code> is thrown when the server
     * does not exist. A <code>ValidationException</code> is raised when parameters of the request are not valid. The
     * AssociateNode API call can be integrated into Auto Scaling configurations, AWS Cloudformation templates, or the
     * user data of a server's instance.
     * </p>
     * <p>
     * Example:
     * <code>aws opsworks-cm associate-node --server-name <i>MyServer</i> --node-name <i>MyManagedNode</i> --engine-attributes "Name=<i>MyOrganization</i>,Value=default" "Name=<i>Chef_node_public_key</i>,Value=<i>Public_key_contents</i>"</code>
     * </p>
     * 
     * @param associateNodeRequest
     * @return A Java Future containing the result of the AssociateNode operation returned by the service.
     * @sample AWSOpsWorksCMAsync.AssociateNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/AssociateNode" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateNodeResult> associateNodeAsync(AssociateNodeRequest associateNodeRequest);

    /**
     * <p>
     * Associates a new node with the Chef server. This command is an alternative to <code>knife bootstrap</code>. For
     * more information about how to disassociate a node, see <a>DisassociateNode</a>.
     * </p>
     * <p>
     * A node can can only be associated with servers that are in a <code>HEALTHY</code> state. Otherwise, an
     * <code>InvalidStateException</code> is thrown. A <code>ResourceNotFoundException</code> is thrown when the server
     * does not exist. A <code>ValidationException</code> is raised when parameters of the request are not valid. The
     * AssociateNode API call can be integrated into Auto Scaling configurations, AWS Cloudformation templates, or the
     * user data of a server's instance.
     * </p>
     * <p>
     * Example:
     * <code>aws opsworks-cm associate-node --server-name <i>MyServer</i> --node-name <i>MyManagedNode</i> --engine-attributes "Name=<i>MyOrganization</i>,Value=default" "Name=<i>Chef_node_public_key</i>,Value=<i>Public_key_contents</i>"</code>
     * </p>
     * 
     * @param associateNodeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateNode operation returned by the service.
     * @sample AWSOpsWorksCMAsyncHandler.AssociateNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/AssociateNode" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateNodeResult> associateNodeAsync(AssociateNodeRequest associateNodeRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateNodeRequest, AssociateNodeResult> asyncHandler);

    /**
     * <p>
     * Creates an application-level backup of a server. While the server is in the <code>BACKING_UP</code> state, the
     * server cannot be changed, and no additional backup can be created.
     * </p>
     * <p>
     * Backups can be created for servers in <code>RUNNING</code>, <code>HEALTHY</code>, and <code>UNHEALTHY</code>
     * states. By default, you can create a maximum of 50 manual backups.
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * A <code>LimitExceededException</code> is thrown when the maximum number of manual backups is reached. An
     * <code>InvalidStateException</code> is thrown when the server is not in any of the following states: RUNNING,
     * HEALTHY, or UNHEALTHY. A <code>ResourceNotFoundException</code> is thrown when the server is not found. A
     * <code>ValidationException</code> is thrown when parameters of the request are not valid.
     * </p>
     * 
     * @param createBackupRequest
     * @return A Java Future containing the result of the CreateBackup operation returned by the service.
     * @sample AWSOpsWorksCMAsync.CreateBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/CreateBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBackupResult> createBackupAsync(CreateBackupRequest createBackupRequest);

    /**
     * <p>
     * Creates an application-level backup of a server. While the server is in the <code>BACKING_UP</code> state, the
     * server cannot be changed, and no additional backup can be created.
     * </p>
     * <p>
     * Backups can be created for servers in <code>RUNNING</code>, <code>HEALTHY</code>, and <code>UNHEALTHY</code>
     * states. By default, you can create a maximum of 50 manual backups.
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * A <code>LimitExceededException</code> is thrown when the maximum number of manual backups is reached. An
     * <code>InvalidStateException</code> is thrown when the server is not in any of the following states: RUNNING,
     * HEALTHY, or UNHEALTHY. A <code>ResourceNotFoundException</code> is thrown when the server is not found. A
     * <code>ValidationException</code> is thrown when parameters of the request are not valid.
     * </p>
     * 
     * @param createBackupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBackup operation returned by the service.
     * @sample AWSOpsWorksCMAsyncHandler.CreateBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/CreateBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBackupResult> createBackupAsync(CreateBackupRequest createBackupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBackupRequest, CreateBackupResult> asyncHandler);

    /**
     * <p>
     * Creates and immedately starts a new server. The server is ready to use when it is in the <code>HEALTHY</code>
     * state. By default, you can create a maximum of 10 servers.
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * A <code>LimitExceededException</code> is thrown when you have created the maximum number of servers (10). A
     * <code>ResourceAlreadyExistsException</code> is thrown when a server with the same name already exists in the
     * account. A <code>ResourceNotFoundException</code> is thrown when you specify a backup ID that is not valid or is
     * for a backup that does not exist. A <code>ValidationException</code> is thrown when parameters of the request are
     * not valid.
     * </p>
     * <p>
     * If you do not specify a security group by adding the <code>SecurityGroupIds</code> parameter, AWS OpsWorks
     * creates a new security group. The default security group opens the Chef server to the world on TCP port 443. If a
     * KeyName is present, AWS OpsWorks enables SSH access. SSH is also open to the world on TCP port 22.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/CreateServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateServerResult> createServerAsync(CreateServerRequest createServerRequest);

    /**
     * <p>
     * Creates and immedately starts a new server. The server is ready to use when it is in the <code>HEALTHY</code>
     * state. By default, you can create a maximum of 10 servers.
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * A <code>LimitExceededException</code> is thrown when you have created the maximum number of servers (10). A
     * <code>ResourceAlreadyExistsException</code> is thrown when a server with the same name already exists in the
     * account. A <code>ResourceNotFoundException</code> is thrown when you specify a backup ID that is not valid or is
     * for a backup that does not exist. A <code>ValidationException</code> is thrown when parameters of the request are
     * not valid.
     * </p>
     * <p>
     * If you do not specify a security group by adding the <code>SecurityGroupIds</code> parameter, AWS OpsWorks
     * creates a new security group. The default security group opens the Chef server to the world on TCP port 443. If a
     * KeyName is present, AWS OpsWorks enables SSH access. SSH is also open to the world on TCP port 22.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/CreateServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateServerResult> createServerAsync(CreateServerRequest createServerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateServerRequest, CreateServerResult> asyncHandler);

    /**
     * <p>
     * Deletes a backup. You can delete both manual and automated backups. This operation is asynchronous.
     * </p>
     * <p>
     * An <code>InvalidStateException</code> is thrown when a backup deletion is already in progress. A
     * <code>ResourceNotFoundException</code> is thrown when the backup does not exist. A
     * <code>ValidationException</code> is thrown when parameters of the request are not valid.
     * </p>
     * 
     * @param deleteBackupRequest
     * @return A Java Future containing the result of the DeleteBackup operation returned by the service.
     * @sample AWSOpsWorksCMAsync.DeleteBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DeleteBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest deleteBackupRequest);

    /**
     * <p>
     * Deletes a backup. You can delete both manual and automated backups. This operation is asynchronous.
     * </p>
     * <p>
     * An <code>InvalidStateException</code> is thrown when a backup deletion is already in progress. A
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DeleteBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest deleteBackupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBackupRequest, DeleteBackupResult> asyncHandler);

    /**
     * <p>
     * Deletes the server and the underlying AWS CloudFormation stack (including the server's EC2 instance). When you
     * run this command, the server state is updated to <code>DELETING</code>. After the server is deleted, it is no
     * longer returned by <code>DescribeServer</code> requests. If the AWS CloudFormation stack cannot be deleted, the
     * server cannot be deleted.
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * An <code>InvalidStateException</code> is thrown when a server deletion is already in progress. A
     * <code>ResourceNotFoundException</code> is thrown when the server does not exist. A
     * <code>ValidationException</code> is raised when parameters of the request are not valid.
     * </p>
     * <p>
     * </p>
     * 
     * @param deleteServerRequest
     * @return A Java Future containing the result of the DeleteServer operation returned by the service.
     * @sample AWSOpsWorksCMAsync.DeleteServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DeleteServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteServerResult> deleteServerAsync(DeleteServerRequest deleteServerRequest);

    /**
     * <p>
     * Deletes the server and the underlying AWS CloudFormation stack (including the server's EC2 instance). When you
     * run this command, the server state is updated to <code>DELETING</code>. After the server is deleted, it is no
     * longer returned by <code>DescribeServer</code> requests. If the AWS CloudFormation stack cannot be deleted, the
     * server cannot be deleted.
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * An <code>InvalidStateException</code> is thrown when a server deletion is already in progress. A
     * <code>ResourceNotFoundException</code> is thrown when the server does not exist. A
     * <code>ValidationException</code> is raised when parameters of the request are not valid.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DeleteServer" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DescribeAccountAttributes"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DescribeAccountAttributes"
     *      target="_top">AWS API Documentation</a>
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
     * <code>ValidationException</code> is raised when parameters of the request are not valid.
     * </p>
     * 
     * @param describeBackupsRequest
     * @return A Java Future containing the result of the DescribeBackups operation returned by the service.
     * @sample AWSOpsWorksCMAsync.DescribeBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DescribeBackups" target="_top">AWS API
     *      Documentation</a>
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
     * <code>ValidationException</code> is raised when parameters of the request are not valid.
     * </p>
     * 
     * @param describeBackupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBackups operation returned by the service.
     * @sample AWSOpsWorksCMAsyncHandler.DescribeBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DescribeBackups" target="_top">AWS API
     *      Documentation</a>
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
     * <code>ValidationException</code> is raised when parameters of the request are not valid.
     * </p>
     * 
     * @param describeEventsRequest
     * @return A Java Future containing the result of the DescribeEvents operation returned by the service.
     * @sample AWSOpsWorksCMAsync.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
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
     * <code>ValidationException</code> is raised when parameters of the request are not valid.
     * </p>
     * 
     * @param describeEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEvents operation returned by the service.
     * @sample AWSOpsWorksCMAsyncHandler.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest describeEventsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler);

    /**
     * <p>
     * Returns the current status of an existing association or disassociation request.
     * </p>
     * <p>
     * A <code>ResourceNotFoundException</code> is thrown when no recent association or disassociation request with the
     * specified token is found, or when the server does not exist. A <code>ValidationException</code> is raised when
     * parameters of the request are not valid.
     * </p>
     * 
     * @param describeNodeAssociationStatusRequest
     * @return A Java Future containing the result of the DescribeNodeAssociationStatus operation returned by the
     *         service.
     * @sample AWSOpsWorksCMAsync.DescribeNodeAssociationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DescribeNodeAssociationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNodeAssociationStatusResult> describeNodeAssociationStatusAsync(
            DescribeNodeAssociationStatusRequest describeNodeAssociationStatusRequest);

    /**
     * <p>
     * Returns the current status of an existing association or disassociation request.
     * </p>
     * <p>
     * A <code>ResourceNotFoundException</code> is thrown when no recent association or disassociation request with the
     * specified token is found, or when the server does not exist. A <code>ValidationException</code> is raised when
     * parameters of the request are not valid.
     * </p>
     * 
     * @param describeNodeAssociationStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeNodeAssociationStatus operation returned by the
     *         service.
     * @sample AWSOpsWorksCMAsyncHandler.DescribeNodeAssociationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DescribeNodeAssociationStatus"
     *      target="_top">AWS API Documentation</a>
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
     * <code>ValidationException</code> is raised when parameters of the request are not valid.
     * </p>
     * 
     * @param describeServersRequest
     * @return A Java Future containing the result of the DescribeServers operation returned by the service.
     * @sample AWSOpsWorksCMAsync.DescribeServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DescribeServers" target="_top">AWS API
     *      Documentation</a>
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
     * <code>ValidationException</code> is raised when parameters of the request are not valid.
     * </p>
     * 
     * @param describeServersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeServers operation returned by the service.
     * @sample AWSOpsWorksCMAsyncHandler.DescribeServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DescribeServers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeServersResult> describeServersAsync(DescribeServersRequest describeServersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeServersRequest, DescribeServersResult> asyncHandler);

    /**
     * <p>
     * Disassociates a node from a Chef server, and removes the node from the Chef server's managed nodes. After a node
     * is disassociated, the node key pair is no longer valid for accessing the Chef API. For more information about how
     * to associate a node, see <a>AssociateNode</a>.
     * </p>
     * <p>
     * A node can can only be disassociated from a server that is in a <code>HEALTHY</code> state. Otherwise, an
     * <code>InvalidStateException</code> is thrown. A <code>ResourceNotFoundException</code> is thrown when the server
     * does not exist. A <code>ValidationException</code> is raised when parameters of the request are not valid.
     * </p>
     * 
     * @param disassociateNodeRequest
     * @return A Java Future containing the result of the DisassociateNode operation returned by the service.
     * @sample AWSOpsWorksCMAsync.DisassociateNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DisassociateNode" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateNodeResult> disassociateNodeAsync(DisassociateNodeRequest disassociateNodeRequest);

    /**
     * <p>
     * Disassociates a node from a Chef server, and removes the node from the Chef server's managed nodes. After a node
     * is disassociated, the node key pair is no longer valid for accessing the Chef API. For more information about how
     * to associate a node, see <a>AssociateNode</a>.
     * </p>
     * <p>
     * A node can can only be disassociated from a server that is in a <code>HEALTHY</code> state. Otherwise, an
     * <code>InvalidStateException</code> is thrown. A <code>ResourceNotFoundException</code> is thrown when the server
     * does not exist. A <code>ValidationException</code> is raised when parameters of the request are not valid.
     * </p>
     * 
     * @param disassociateNodeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateNode operation returned by the service.
     * @sample AWSOpsWorksCMAsyncHandler.DisassociateNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DisassociateNode" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateNodeResult> disassociateNodeAsync(DisassociateNodeRequest disassociateNodeRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateNodeRequest, DisassociateNodeResult> asyncHandler);

    /**
     * <p>
     * Restores a backup to a server that is in a <code>CONNECTION_LOST</code>, <code>HEALTHY</code>,
     * <code>RUNNING</code>, <code>UNHEALTHY</code>, or <code>TERMINATED</code> state. When you run RestoreServer, the
     * server's EC2 instance is deleted, and a new EC2 instance is configured. RestoreServer maintains the existing
     * server endpoint, so configuration management of the server's client devices (nodes) should continue to work.
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * An <code>InvalidStateException</code> is thrown when the server is not in a valid state. A
     * <code>ResourceNotFoundException</code> is thrown when the server does not exist. A
     * <code>ValidationException</code> is raised when parameters of the request are not valid.
     * </p>
     * 
     * @param restoreServerRequest
     * @return A Java Future containing the result of the RestoreServer operation returned by the service.
     * @sample AWSOpsWorksCMAsync.RestoreServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/RestoreServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RestoreServerResult> restoreServerAsync(RestoreServerRequest restoreServerRequest);

    /**
     * <p>
     * Restores a backup to a server that is in a <code>CONNECTION_LOST</code>, <code>HEALTHY</code>,
     * <code>RUNNING</code>, <code>UNHEALTHY</code>, or <code>TERMINATED</code> state. When you run RestoreServer, the
     * server's EC2 instance is deleted, and a new EC2 instance is configured. RestoreServer maintains the existing
     * server endpoint, so configuration management of the server's client devices (nodes) should continue to work.
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * An <code>InvalidStateException</code> is thrown when the server is not in a valid state. A
     * <code>ResourceNotFoundException</code> is thrown when the server does not exist. A
     * <code>ValidationException</code> is raised when parameters of the request are not valid.
     * </p>
     * 
     * @param restoreServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreServer operation returned by the service.
     * @sample AWSOpsWorksCMAsyncHandler.RestoreServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/RestoreServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RestoreServerResult> restoreServerAsync(RestoreServerRequest restoreServerRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreServerRequest, RestoreServerResult> asyncHandler);

    /**
     * <p>
     * Manually starts server maintenance. This command can be useful if an earlier maintenance attempt failed, and the
     * underlying cause of maintenance failure has been resolved. The server is in an <code>UNDER_MAINTENANCE</code>
     * state while maintenance is in progress.
     * </p>
     * <p>
     * Maintenance can only be started on servers in <code>HEALTHY</code> and <code>UNHEALTHY</code> states. Otherwise,
     * an <code>InvalidStateException</code> is thrown. A <code>ResourceNotFoundException</code> is thrown when the
     * server does not exist. A <code>ValidationException</code> is raised when parameters of the request are not valid.
     * </p>
     * 
     * @param startMaintenanceRequest
     * @return A Java Future containing the result of the StartMaintenance operation returned by the service.
     * @sample AWSOpsWorksCMAsync.StartMaintenance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/StartMaintenance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartMaintenanceResult> startMaintenanceAsync(StartMaintenanceRequest startMaintenanceRequest);

    /**
     * <p>
     * Manually starts server maintenance. This command can be useful if an earlier maintenance attempt failed, and the
     * underlying cause of maintenance failure has been resolved. The server is in an <code>UNDER_MAINTENANCE</code>
     * state while maintenance is in progress.
     * </p>
     * <p>
     * Maintenance can only be started on servers in <code>HEALTHY</code> and <code>UNHEALTHY</code> states. Otherwise,
     * an <code>InvalidStateException</code> is thrown. A <code>ResourceNotFoundException</code> is thrown when the
     * server does not exist. A <code>ValidationException</code> is raised when parameters of the request are not valid.
     * </p>
     * 
     * @param startMaintenanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartMaintenance operation returned by the service.
     * @sample AWSOpsWorksCMAsyncHandler.StartMaintenance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/StartMaintenance" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/UpdateServer" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/UpdateServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateServerResult> updateServerAsync(UpdateServerRequest updateServerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServerRequest, UpdateServerResult> asyncHandler);

    /**
     * <p>
     * Updates engine-specific attributes on a specified server. The server enters the <code>MODIFYING</code> state when
     * this operation is in progress. Only one update can occur at a time. You can use this command to reset the Chef
     * server's private key (<code>CHEF_PIVOTAL_KEY</code>).
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * This operation can only be called for servers in <code>HEALTHY</code> or <code>UNHEALTHY</code> states.
     * Otherwise, an <code>InvalidStateException</code> is raised. A <code>ResourceNotFoundException</code> is thrown
     * when the server does not exist. A <code>ValidationException</code> is raised when parameters of the request are
     * not valid.
     * </p>
     * 
     * @param updateServerEngineAttributesRequest
     * @return A Java Future containing the result of the UpdateServerEngineAttributes operation returned by the
     *         service.
     * @sample AWSOpsWorksCMAsync.UpdateServerEngineAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/UpdateServerEngineAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServerEngineAttributesResult> updateServerEngineAttributesAsync(
            UpdateServerEngineAttributesRequest updateServerEngineAttributesRequest);

    /**
     * <p>
     * Updates engine-specific attributes on a specified server. The server enters the <code>MODIFYING</code> state when
     * this operation is in progress. Only one update can occur at a time. You can use this command to reset the Chef
     * server's private key (<code>CHEF_PIVOTAL_KEY</code>).
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * This operation can only be called for servers in <code>HEALTHY</code> or <code>UNHEALTHY</code> states.
     * Otherwise, an <code>InvalidStateException</code> is raised. A <code>ResourceNotFoundException</code> is thrown
     * when the server does not exist. A <code>ValidationException</code> is raised when parameters of the request are
     * not valid.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/UpdateServerEngineAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServerEngineAttributesResult> updateServerEngineAttributesAsync(
            UpdateServerEngineAttributesRequest updateServerEngineAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServerEngineAttributesRequest, UpdateServerEngineAttributesResult> asyncHandler);

}
