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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.opsworkscm.model.*;

/**
 * Interface for accessing OpsWorksCM.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.opsworkscm.AbstractAWSOpsWorksCM} instead.
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
public interface AWSOpsWorksCM {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "opsworks-cm";

    /**
     * Overrides the default endpoint for this client ("opsworks-cm.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "opsworks-cm.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "opsworks-cm.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol
     * from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "opsworks-cm.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "opsworks-cm.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSOpsWorksCM#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

    /**
     * @param associateNodeRequest
     * @return Result of the AssociateNode operation returned by the service.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.AssociateNode
     */
    AssociateNodeResult associateNode(AssociateNodeRequest associateNodeRequest);

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
     * @return Result of the CreateBackup operation returned by the service.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @throws LimitExceededException
     *         The limit of servers or backups has been reached.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.CreateBackup
     */
    CreateBackupResult createBackup(CreateBackupRequest createBackupRequest);

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
     * @return Result of the CreateServer operation returned by the service.
     * @throws LimitExceededException
     *         The limit of servers or backups has been reached.
     * @throws ResourceAlreadyExistsException
     *         The requested resource cannot be created because it already exists.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.CreateServer
     */
    CreateServerResult createServer(CreateServerRequest createServerRequest);

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
     * @return Result of the DeleteBackup operation returned by the service.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.DeleteBackup
     */
    DeleteBackupResult deleteBackup(DeleteBackupRequest deleteBackupRequest);

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
     * @return Result of the DeleteServer operation returned by the service.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.DeleteServer
     */
    DeleteServerResult deleteServer(DeleteServerRequest deleteServerRequest);

    /**
     * <p>
     * Describes your account attributes, and creates requests to increase limits before they are reached or exceeded.
     * </p>
     * <p>
     * This operation is synchronous.
     * </p>
     * 
     * @param describeAccountAttributesRequest
     * @return Result of the DescribeAccountAttributes operation returned by the service.
     * @sample AWSOpsWorksCM.DescribeAccountAttributes
     */
    DescribeAccountAttributesResult describeAccountAttributes(DescribeAccountAttributesRequest describeAccountAttributesRequest);

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
     * @return Result of the DescribeBackups operation returned by the service.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws InvalidNextTokenException
     *         This occurs when the provided nextToken is not valid.
     * @sample AWSOpsWorksCM.DescribeBackups
     */
    DescribeBackupsResult describeBackups(DescribeBackupsRequest describeBackupsRequest);

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
     * @return Result of the DescribeEvents operation returned by the service.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @throws InvalidNextTokenException
     *         This occurs when the provided nextToken is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @sample AWSOpsWorksCM.DescribeEvents
     */
    DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest);

    /**
     * @param describeNodeAssociationStatusRequest
     * @return Result of the DescribeNodeAssociationStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.DescribeNodeAssociationStatus
     */
    DescribeNodeAssociationStatusResult describeNodeAssociationStatus(DescribeNodeAssociationStatusRequest describeNodeAssociationStatusRequest);

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
     * @return Result of the DescribeServers operation returned by the service.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws InvalidNextTokenException
     *         This occurs when the provided nextToken is not valid.
     * @sample AWSOpsWorksCM.DescribeServers
     */
    DescribeServersResult describeServers(DescribeServersRequest describeServersRequest);

    /**
     * @param disassociateNodeRequest
     * @return Result of the DisassociateNode operation returned by the service.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.DisassociateNode
     */
    DisassociateNodeResult disassociateNode(DisassociateNodeRequest disassociateNodeRequest);

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
     * @return Result of the RestoreServer operation returned by the service.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.RestoreServer
     */
    RestoreServerResult restoreServer(RestoreServerRequest restoreServerRequest);

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
     * @return Result of the StartMaintenance operation returned by the service.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.StartMaintenance
     */
    StartMaintenanceResult startMaintenance(StartMaintenanceRequest startMaintenanceRequest);

    /**
     * <p>
     * Updates settings for a server.
     * </p>
     * <p>
     * This operation is synchronous.
     * </p>
     * 
     * @param updateServerRequest
     * @return Result of the UpdateServer operation returned by the service.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.UpdateServer
     */
    UpdateServerResult updateServer(UpdateServerRequest updateServerRequest);

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
     * @return Result of the UpdateServerEngineAttributes operation returned by the service.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.UpdateServerEngineAttributes
     */
    UpdateServerEngineAttributesResult updateServerEngineAttributes(UpdateServerEngineAttributesRequest updateServerEngineAttributesRequest);

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
