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
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
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
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

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
     * @return Result of the AssociateNode operation returned by the service.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.AssociateNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/AssociateNode" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateNodeResult associateNode(AssociateNodeRequest associateNodeRequest);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/CreateBackup" target="_top">AWS API
     *      Documentation</a>
     */
    CreateBackupResult createBackup(CreateBackupRequest createBackupRequest);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/CreateServer" target="_top">AWS API
     *      Documentation</a>
     */
    CreateServerResult createServer(CreateServerRequest createServerRequest);

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
     * @return Result of the DeleteBackup operation returned by the service.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.DeleteBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DeleteBackup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteBackupResult deleteBackup(DeleteBackupRequest deleteBackupRequest);

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
     * @return Result of the DeleteServer operation returned by the service.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.DeleteServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DeleteServer" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DescribeAccountAttributes"
     *      target="_top">AWS API Documentation</a>
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
     * <code>ValidationException</code> is raised when parameters of the request are not valid.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DescribeBackups" target="_top">AWS API
     *      Documentation</a>
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
     * <code>ValidationException</code> is raised when parameters of the request are not valid.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest);

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
     * @return Result of the DescribeNodeAssociationStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.DescribeNodeAssociationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DescribeNodeAssociationStatus"
     *      target="_top">AWS API Documentation</a>
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
     * <code>ValidationException</code> is raised when parameters of the request are not valid.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DescribeServers" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeServersResult describeServers(DescribeServersRequest describeServersRequest);

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
     * @return Result of the DisassociateNode operation returned by the service.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.DisassociateNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DisassociateNode" target="_top">AWS
     *      API Documentation</a>
     */
    DisassociateNodeResult disassociateNode(DisassociateNodeRequest disassociateNodeRequest);

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
     * @return Result of the RestoreServer operation returned by the service.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.RestoreServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/RestoreServer" target="_top">AWS API
     *      Documentation</a>
     */
    RestoreServerResult restoreServer(RestoreServerRequest restoreServerRequest);

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
     * @return Result of the StartMaintenance operation returned by the service.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.StartMaintenance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/StartMaintenance" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/UpdateServer" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateServerResult updateServer(UpdateServerRequest updateServerRequest);

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
     * @return Result of the UpdateServerEngineAttributes operation returned by the service.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.UpdateServerEngineAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/UpdateServerEngineAttributes"
     *      target="_top">AWS API Documentation</a>
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
