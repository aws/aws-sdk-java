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
package com.amazonaws.services.directory;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.directory.model.*;

/**
 * Interface for accessing Directory Service.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.directory.AbstractAWSDirectoryService} instead.
 * </p>
 * <p>
 * <fullname>AWS Directory Service</fullname>
 * <p>
 * This is the <i>AWS Directory Service API Reference</i>. This guide provides detailed information about AWS Directory
 * Service operations, data types, parameters, and errors.
 * </p>
 */
public interface AWSDirectoryService {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "ds";

    /**
     * Overrides the default endpoint for this client ("https://ds.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "ds.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://ds.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol from this
     * client's {@link ClientConfiguration} will be used, which by default is HTTPS.
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
     *        The endpoint (ex: "ds.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://ds.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSDirectoryService#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
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
     * <p>
     * If the DNS server for your on-premises domain uses a publicly addressable IP address, you must add a CIDR address
     * block to correctly route traffic to and from your Microsoft AD on Amazon Web Services. <i>AddIpRoutes</i> adds
     * this address block. You can also use <i>AddIpRoutes</i> to facilitate routing traffic that uses public IP ranges
     * from your Microsoft AD on AWS to a peer VPC.
     * </p>
     * <p>
     * Before you call <i>AddIpRoutes</i>, ensure that all of the required permissions have been explicitly granted
     * through a policy. For details about what permissions are required to run the <i>AddIpRoutes</i> operation, see <a
     * href
     * ="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/UsingWithDS_IAM_ResourcePermissions.html">AWS
     * Directory Service API Permissions: Actions, Resources, and Conditions Reference</a>.
     * </p>
     * 
     * @param addIpRoutesRequest
     * @return Result of the AddIpRoutes operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws EntityAlreadyExistsException
     *         The specified entity already exists.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DirectoryUnavailableException
     *         The specified directory is unavailable or could not be found.
     * @throws IpRouteLimitExceededException
     *         The maximum allowed number of IP addresses was exceeded. The default limit is 100 IP address blocks.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.AddIpRoutes
     */
    AddIpRoutesResult addIpRoutes(AddIpRoutesRequest addIpRoutesRequest);

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified Amazon Directory Services directory. Each directory can
     * have a maximum of 50 tags. Each tag consists of a key and optional value. Tag keys must be unique to each
     * resource.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @return Result of the AddTagsToResource operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws TagLimitExceededException
     *         The maximum allowed number of tags was exceeded.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.AddTagsToResource
     */
    AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest);

    /**
     * <p>
     * Cancels an in-progress schema extension to a Microsoft AD directory. Once a schema extension has started
     * replicating to all domain controllers, the task can no longer be canceled. A schema extension can be canceled
     * during any of the following states; <code>Initializing</code>, <code>CreatingSnapshot</code>, and
     * <code>UpdatingSchema</code>.
     * </p>
     * 
     * @param cancelSchemaExtensionRequest
     * @return Result of the CancelSchemaExtension operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.CancelSchemaExtension
     */
    CancelSchemaExtensionResult cancelSchemaExtension(CancelSchemaExtensionRequest cancelSchemaExtensionRequest);

    /**
     * <p>
     * Creates an AD Connector to connect to an on-premises directory.
     * </p>
     * <p>
     * Before you call <i>ConnectDirectory</i>, ensure that all of the required permissions have been explicitly granted
     * through a policy. For details about what permissions are required to run the <i>ConnectDirectory</i> operation,
     * see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/UsingWithDS_IAM_ResourcePermissions.html"
     * >AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference</a>.
     * </p>
     * 
     * @param connectDirectoryRequest
     *        Contains the inputs for the <a>ConnectDirectory</a> operation.
     * @return Result of the ConnectDirectory operation returned by the service.
     * @throws DirectoryLimitExceededException
     *         The maximum number of directories in the region has been reached. You can use the
     *         <a>GetDirectoryLimits</a> operation to determine your directory limits in the region.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.ConnectDirectory
     */
    ConnectDirectoryResult connectDirectory(ConnectDirectoryRequest connectDirectoryRequest);

    /**
     * <p>
     * Creates an alias for a directory and assigns the alias to the directory. The alias is used to construct the
     * access URL for the directory, such as <code>http://&lt;alias&gt;.awsapps.com</code>.
     * </p>
     * <important>
     * <p>
     * After an alias has been created, it cannot be deleted or reused, so this operation should only be used when
     * absolutely necessary.
     * </p>
     * </important>
     * 
     * @param createAliasRequest
     *        Contains the inputs for the <a>CreateAlias</a> operation.
     * @return Result of the CreateAlias operation returned by the service.
     * @throws EntityAlreadyExistsException
     *         The specified entity already exists.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.CreateAlias
     */
    CreateAliasResult createAlias(CreateAliasRequest createAliasRequest);

    /**
     * <p>
     * Creates a computer account in the specified directory, and joins the computer to the directory.
     * </p>
     * 
     * @param createComputerRequest
     *        Contains the inputs for the <a>CreateComputer</a> operation.
     * @return Result of the CreateComputer operation returned by the service.
     * @throws AuthenticationFailedException
     *         An authentication error occurred.
     * @throws DirectoryUnavailableException
     *         The specified directory is unavailable or could not be found.
     * @throws EntityAlreadyExistsException
     *         The specified entity already exists.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.CreateComputer
     */
    CreateComputerResult createComputer(CreateComputerRequest createComputerRequest);

    /**
     * <p>
     * Creates a conditional forwarder associated with your AWS directory. Conditional forwarders are required in order
     * to set up a trust relationship with another domain. The conditional forwarder points to the trusted domain.
     * </p>
     * 
     * @param createConditionalForwarderRequest
     *        Initiates the creation of a conditional forwarder for your AWS Directory Service for Microsoft Active
     *        Directory. Conditional forwarders are required in order to set up a trust relationship with another
     *        domain.
     * @return Result of the CreateConditionalForwarder operation returned by the service.
     * @throws EntityAlreadyExistsException
     *         The specified entity already exists.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws DirectoryUnavailableException
     *         The specified directory is unavailable or could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.CreateConditionalForwarder
     */
    CreateConditionalForwarderResult createConditionalForwarder(CreateConditionalForwarderRequest createConditionalForwarderRequest);

    /**
     * <p>
     * Creates a Simple AD directory.
     * </p>
     * <p>
     * Before you call <i>CreateDirectory</i>, ensure that all of the required permissions have been explicitly granted
     * through a policy. For details about what permissions are required to run the <i>CreateDirectory</i> operation,
     * see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/UsingWithDS_IAM_ResourcePermissions.html"
     * >AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference</a>.
     * </p>
     * 
     * @param createDirectoryRequest
     *        Contains the inputs for the <a>CreateDirectory</a> operation.
     * @return Result of the CreateDirectory operation returned by the service.
     * @throws DirectoryLimitExceededException
     *         The maximum number of directories in the region has been reached. You can use the
     *         <a>GetDirectoryLimits</a> operation to determine your directory limits in the region.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.CreateDirectory
     */
    CreateDirectoryResult createDirectory(CreateDirectoryRequest createDirectoryRequest);

    /**
     * <p>
     * Creates a Microsoft AD in the AWS cloud.
     * </p>
     * <p>
     * Before you call <i>CreateMicrosoftAD</i>, ensure that all of the required permissions have been explicitly
     * granted through a policy. For details about what permissions are required to run the <i>CreateMicrosoftAD</i>
     * operation, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/UsingWithDS_IAM_ResourcePermissions.html"
     * >AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference</a>.
     * </p>
     * 
     * @param createMicrosoftADRequest
     *        Creates a Microsoft AD in the AWS cloud.
     * @return Result of the CreateMicrosoftAD operation returned by the service.
     * @throws DirectoryLimitExceededException
     *         The maximum number of directories in the region has been reached. You can use the
     *         <a>GetDirectoryLimits</a> operation to determine your directory limits in the region.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @sample AWSDirectoryService.CreateMicrosoftAD
     */
    CreateMicrosoftADResult createMicrosoftAD(CreateMicrosoftADRequest createMicrosoftADRequest);

    /**
     * <p>
     * Creates a snapshot of a Simple AD or Microsoft AD directory in the AWS cloud.
     * </p>
     * <note>
     * <p>
     * You cannot take snapshots of AD Connector directories.
     * </p>
     * </note>
     * 
     * @param createSnapshotRequest
     *        Contains the inputs for the <a>CreateSnapshot</a> operation.
     * @return Result of the CreateSnapshot operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws SnapshotLimitExceededException
     *         The maximum number of manual snapshots for the directory has been reached. You can use the
     *         <a>GetSnapshotLimits</a> operation to determine the snapshot limits for a directory.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.CreateSnapshot
     */
    CreateSnapshotResult createSnapshot(CreateSnapshotRequest createSnapshotRequest);

    /**
     * <p>
     * AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For example,
     * you can establish a trust between your Microsoft AD in the AWS cloud, and your existing on-premises Microsoft
     * Active Directory. This would allow you to provide users and groups access to resources in either domain, with a
     * single set of credentials.
     * </p>
     * <p>
     * This action initiates the creation of the AWS side of a trust relationship between a Microsoft AD in the AWS
     * cloud and an external domain.
     * </p>
     * 
     * @param createTrustRequest
     *        AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For
     *        example, you can establish a trust between your Microsoft AD in the AWS cloud, and your existing
     *        on-premises Microsoft Active Directory. This would allow you to provide users and groups access to
     *        resources in either domain, with a single set of credentials.</p>
     *        <p>
     *        This action initiates the creation of the AWS side of a trust relationship between a Microsoft AD in the
     *        AWS cloud and an external domain.
     * @return Result of the CreateTrust operation returned by the service.
     * @throws EntityAlreadyExistsException
     *         The specified entity already exists.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @sample AWSDirectoryService.CreateTrust
     */
    CreateTrustResult createTrust(CreateTrustRequest createTrustRequest);

    /**
     * <p>
     * Deletes a conditional forwarder that has been set up for your AWS directory.
     * </p>
     * 
     * @param deleteConditionalForwarderRequest
     *        Deletes a conditional forwarder.
     * @return Result of the DeleteConditionalForwarder operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws DirectoryUnavailableException
     *         The specified directory is unavailable or could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DeleteConditionalForwarder
     */
    DeleteConditionalForwarderResult deleteConditionalForwarder(DeleteConditionalForwarderRequest deleteConditionalForwarderRequest);

    /**
     * <p>
     * Deletes an AWS Directory Service directory.
     * </p>
     * <p>
     * Before you call <i>DeleteDirectory</i>, ensure that all of the required permissions have been explicitly granted
     * through a policy. For details about what permissions are required to run the <i>DeleteDirectory</i> operation,
     * see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/UsingWithDS_IAM_ResourcePermissions.html"
     * >AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference</a>.
     * </p>
     * 
     * @param deleteDirectoryRequest
     *        Contains the inputs for the <a>DeleteDirectory</a> operation.
     * @return Result of the DeleteDirectory operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DeleteDirectory
     */
    DeleteDirectoryResult deleteDirectory(DeleteDirectoryRequest deleteDirectoryRequest);

    /**
     * <p>
     * Deletes a directory snapshot.
     * </p>
     * 
     * @param deleteSnapshotRequest
     *        Contains the inputs for the <a>DeleteSnapshot</a> operation.
     * @return Result of the DeleteSnapshot operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DeleteSnapshot
     */
    DeleteSnapshotResult deleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest);

    /**
     * <p>
     * Deletes an existing trust relationship between your Microsoft AD in the AWS cloud and an external domain.
     * </p>
     * 
     * @param deleteTrustRequest
     *        Deletes the local side of an existing trust relationship between the Microsoft AD in the AWS cloud and the
     *        external domain.
     * @return Result of the DeleteTrust operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @sample AWSDirectoryService.DeleteTrust
     */
    DeleteTrustResult deleteTrust(DeleteTrustRequest deleteTrustRequest);

    /**
     * <p>
     * Removes the specified directory as a publisher to the specified SNS topic.
     * </p>
     * 
     * @param deregisterEventTopicRequest
     *        Removes the specified directory as a publisher to the specified SNS topic.
     * @return Result of the DeregisterEventTopic operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DeregisterEventTopic
     */
    DeregisterEventTopicResult deregisterEventTopic(DeregisterEventTopicRequest deregisterEventTopicRequest);

    /**
     * <p>
     * Obtains information about the conditional forwarders for this account.
     * </p>
     * <p>
     * If no input parameters are provided for RemoteDomainNames, this request describes all conditional forwarders for
     * the specified directory ID.
     * </p>
     * 
     * @param describeConditionalForwardersRequest
     *        Describes a conditional forwarder.
     * @return Result of the DescribeConditionalForwarders operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws DirectoryUnavailableException
     *         The specified directory is unavailable or could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DescribeConditionalForwarders
     */
    DescribeConditionalForwardersResult describeConditionalForwarders(DescribeConditionalForwardersRequest describeConditionalForwardersRequest);

    /**
     * <p>
     * Obtains information about the directories that belong to this account.
     * </p>
     * <p>
     * You can retrieve information about specific directories by passing the directory identifiers in the
     * <i>DirectoryIds</i> parameter. Otherwise, all directories that belong to the current account are returned.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <i>NextToken</i> request and response parameters. If more
     * results are available, the <i>DescribeDirectoriesResult.NextToken</i> member contains a token that you pass in
     * the next call to <a>DescribeDirectories</a> to retrieve the next set of items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the <i>Limit</i> parameter.
     * </p>
     * 
     * @param describeDirectoriesRequest
     *        Contains the inputs for the <a>DescribeDirectories</a> operation.
     * @return Result of the DescribeDirectories operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws InvalidNextTokenException
     *         The <i>NextToken</i> value is not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DescribeDirectories
     */
    DescribeDirectoriesResult describeDirectories(DescribeDirectoriesRequest describeDirectoriesRequest);

    /**
     * Simplified method form for invoking the DescribeDirectories operation.
     *
     * @see #describeDirectories(DescribeDirectoriesRequest)
     */
    DescribeDirectoriesResult describeDirectories();

    /**
     * <p>
     * Obtains information about which SNS topics receive status messages from the specified directory.
     * </p>
     * <p>
     * If no input parameters are provided, such as DirectoryId or TopicName, this request describes all of the
     * associations in the account.
     * </p>
     * 
     * @param describeEventTopicsRequest
     *        Describes event topics.
     * @return Result of the DescribeEventTopics operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DescribeEventTopics
     */
    DescribeEventTopicsResult describeEventTopics(DescribeEventTopicsRequest describeEventTopicsRequest);

    /**
     * <p>
     * Obtains information about the directory snapshots that belong to this account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <i>NextToken</i> request and response parameters. If more
     * results are available, the <i>DescribeSnapshots.NextToken</i> member contains a token that you pass in the next
     * call to <a>DescribeSnapshots</a> to retrieve the next set of items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the <i>Limit</i> parameter.
     * </p>
     * 
     * @param describeSnapshotsRequest
     *        Contains the inputs for the <a>DescribeSnapshots</a> operation.
     * @return Result of the DescribeSnapshots operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws InvalidNextTokenException
     *         The <i>NextToken</i> value is not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DescribeSnapshots
     */
    DescribeSnapshotsResult describeSnapshots(DescribeSnapshotsRequest describeSnapshotsRequest);

    /**
     * Simplified method form for invoking the DescribeSnapshots operation.
     *
     * @see #describeSnapshots(DescribeSnapshotsRequest)
     */
    DescribeSnapshotsResult describeSnapshots();

    /**
     * <p>
     * Obtains information about the trust relationships for this account.
     * </p>
     * <p>
     * If no input parameters are provided, such as DirectoryId or TrustIds, this request describes all the trust
     * relationships belonging to the account.
     * </p>
     * 
     * @param describeTrustsRequest
     *        Describes the trust relationships for a particular Microsoft AD in the AWS cloud. If no input parameters
     *        are are provided, such as directory ID or trust ID, this request describes all the trust relationships.
     * @return Result of the DescribeTrusts operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidNextTokenException
     *         The <i>NextToken</i> value is not valid.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @sample AWSDirectoryService.DescribeTrusts
     */
    DescribeTrustsResult describeTrusts(DescribeTrustsRequest describeTrustsRequest);

    /**
     * <p>
     * Disables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server
     * for an AD Connector directory.
     * </p>
     * 
     * @param disableRadiusRequest
     *        Contains the inputs for the <a>DisableRadius</a> operation.
     * @return Result of the DisableRadius operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DisableRadius
     */
    DisableRadiusResult disableRadius(DisableRadiusRequest disableRadiusRequest);

    /**
     * <p>
     * Disables single-sign on for a directory.
     * </p>
     * 
     * @param disableSsoRequest
     *        Contains the inputs for the <a>DisableSso</a> operation.
     * @return Result of the DisableSso operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InsufficientPermissionsException
     *         The account does not have sufficient permission to perform the operation.
     * @throws AuthenticationFailedException
     *         An authentication error occurred.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DisableSso
     */
    DisableSsoResult disableSso(DisableSsoRequest disableSsoRequest);

    /**
     * <p>
     * Enables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server for
     * an AD Connector directory.
     * </p>
     * 
     * @param enableRadiusRequest
     *        Contains the inputs for the <a>EnableRadius</a> operation.
     * @return Result of the EnableRadius operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws EntityAlreadyExistsException
     *         The specified entity already exists.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.EnableRadius
     */
    EnableRadiusResult enableRadius(EnableRadiusRequest enableRadiusRequest);

    /**
     * <p>
     * Enables single-sign on for a directory.
     * </p>
     * 
     * @param enableSsoRequest
     *        Contains the inputs for the <a>EnableSso</a> operation.
     * @return Result of the EnableSso operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InsufficientPermissionsException
     *         The account does not have sufficient permission to perform the operation.
     * @throws AuthenticationFailedException
     *         An authentication error occurred.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.EnableSso
     */
    EnableSsoResult enableSso(EnableSsoRequest enableSsoRequest);

    /**
     * <p>
     * Obtains directory limit information for the current region.
     * </p>
     * 
     * @param getDirectoryLimitsRequest
     *        Contains the inputs for the <a>GetDirectoryLimits</a> operation.
     * @return Result of the GetDirectoryLimits operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.GetDirectoryLimits
     */
    GetDirectoryLimitsResult getDirectoryLimits(GetDirectoryLimitsRequest getDirectoryLimitsRequest);

    /**
     * Simplified method form for invoking the GetDirectoryLimits operation.
     *
     * @see #getDirectoryLimits(GetDirectoryLimitsRequest)
     */
    GetDirectoryLimitsResult getDirectoryLimits();

    /**
     * <p>
     * Obtains the manual snapshot limits for a directory.
     * </p>
     * 
     * @param getSnapshotLimitsRequest
     *        Contains the inputs for the <a>GetSnapshotLimits</a> operation.
     * @return Result of the GetSnapshotLimits operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.GetSnapshotLimits
     */
    GetSnapshotLimitsResult getSnapshotLimits(GetSnapshotLimitsRequest getSnapshotLimitsRequest);

    /**
     * <p>
     * Lists the address blocks that you have added to a directory.
     * </p>
     * 
     * @param listIpRoutesRequest
     * @return Result of the ListIpRoutes operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidNextTokenException
     *         The <i>NextToken</i> value is not valid.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.ListIpRoutes
     */
    ListIpRoutesResult listIpRoutes(ListIpRoutesRequest listIpRoutesRequest);

    /**
     * <p>
     * Lists all schema extensions applied to a Microsoft AD Directory.
     * </p>
     * 
     * @param listSchemaExtensionsRequest
     * @return Result of the ListSchemaExtensions operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <i>NextToken</i> value is not valid.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.ListSchemaExtensions
     */
    ListSchemaExtensionsResult listSchemaExtensions(ListSchemaExtensionsRequest listSchemaExtensionsRequest);

    /**
     * <p>
     * Lists all tags on an Amazon Directory Services directory.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidNextTokenException
     *         The <i>NextToken</i> value is not valid.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.ListTagsForResource
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Associates a directory with an SNS topic. This establishes the directory as a publisher to the specified SNS
     * topic. You can then receive email or text (SMS) messages when the status of your directory changes. You get
     * notified if your directory goes from an Active status to an Impaired or Inoperable status. You also receive a
     * notification when the directory returns to an Active status.
     * </p>
     * 
     * @param registerEventTopicRequest
     *        Registers a new event topic.
     * @return Result of the RegisterEventTopic operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.RegisterEventTopic
     */
    RegisterEventTopicResult registerEventTopic(RegisterEventTopicRequest registerEventTopicRequest);

    /**
     * <p>
     * Removes IP address blocks from a directory.
     * </p>
     * 
     * @param removeIpRoutesRequest
     * @return Result of the RemoveIpRoutes operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DirectoryUnavailableException
     *         The specified directory is unavailable or could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.RemoveIpRoutes
     */
    RemoveIpRoutesResult removeIpRoutes(RemoveIpRoutesRequest removeIpRoutesRequest);

    /**
     * <p>
     * Removes tags from an Amazon Directory Services directory.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @return Result of the RemoveTagsFromResource operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.RemoveTagsFromResource
     */
    RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest removeTagsFromResourceRequest);

    /**
     * <p>
     * Restores a directory using an existing directory snapshot.
     * </p>
     * <p>
     * When you restore a directory from a snapshot, any changes made to the directory after the snapshot date are
     * overwritten.
     * </p>
     * <p>
     * This action returns as soon as the restore operation is initiated. You can monitor the progress of the restore
     * operation by calling the <a>DescribeDirectories</a> operation with the directory identifier. When the
     * <b>DirectoryDescription.Stage</b> value changes to <code>Active</code>, the restore operation is complete.
     * </p>
     * 
     * @param restoreFromSnapshotRequest
     *        An object representing the inputs for the <a>RestoreFromSnapshot</a> operation.
     * @return Result of the RestoreFromSnapshot operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.RestoreFromSnapshot
     */
    RestoreFromSnapshotResult restoreFromSnapshot(RestoreFromSnapshotRequest restoreFromSnapshotRequest);

    /**
     * <p>
     * Applies a schema extension to a Microsoft AD directory.
     * </p>
     * 
     * @param startSchemaExtensionRequest
     * @return Result of the StartSchemaExtension operation returned by the service.
     * @throws DirectoryUnavailableException
     *         The specified directory is unavailable or could not be found.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws SnapshotLimitExceededException
     *         The maximum number of manual snapshots for the directory has been reached. You can use the
     *         <a>GetSnapshotLimits</a> operation to determine the snapshot limits for a directory.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.StartSchemaExtension
     */
    StartSchemaExtensionResult startSchemaExtension(StartSchemaExtensionRequest startSchemaExtensionRequest);

    /**
     * <p>
     * Updates a conditional forwarder that has been set up for your AWS directory.
     * </p>
     * 
     * @param updateConditionalForwarderRequest
     *        Updates a conditional forwarder.
     * @return Result of the UpdateConditionalForwarder operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws DirectoryUnavailableException
     *         The specified directory is unavailable or could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.UpdateConditionalForwarder
     */
    UpdateConditionalForwarderResult updateConditionalForwarder(UpdateConditionalForwarderRequest updateConditionalForwarderRequest);

    /**
     * <p>
     * Updates the Remote Authentication Dial In User Service (RADIUS) server information for an AD Connector directory.
     * </p>
     * 
     * @param updateRadiusRequest
     *        Contains the inputs for the <a>UpdateRadius</a> operation.
     * @return Result of the UpdateRadius operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.UpdateRadius
     */
    UpdateRadiusResult updateRadius(UpdateRadiusRequest updateRadiusRequest);

    /**
     * <p>
     * AWS Directory Service for Microsoft Active Directory allows you to configure and verify trust relationships.
     * </p>
     * <p>
     * This action verifies a trust relationship between your Microsoft AD in the AWS cloud and an external domain.
     * </p>
     * 
     * @param verifyTrustRequest
     *        Initiates the verification of an existing trust relationship between a Microsoft AD in the AWS cloud and
     *        an external domain.
     * @return Result of the VerifyTrust operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @sample AWSDirectoryService.VerifyTrust
     */
    VerifyTrustResult verifyTrust(VerifyTrustRequest verifyTrustRequest);

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
