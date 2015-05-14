/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.directory;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.directory.model.*;

/**
 * Interface for accessing AWSDirectoryService.
 * AWS Directory Service <p>
 * This is the <i>AWS Directory Service API Reference</i> . This guide
 * provides detailed information about AWS Directory Service operations,
 * data types, parameters, and errors.
 * </p>
 */
public interface AWSDirectoryService {

    /**
     * Overrides the default endpoint for this client ("https://ds.us-east-1.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "ds.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://ds.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "ds.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://ds.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSDirectoryService#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Obtains information about the directory snapshots that belong to this
     * account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <i>NextToken</i> request and response parameters. If more results are
     * available, the <i>DescribeSnapshots.NextToken</i> member contains a
     * token that you pass in the next call to DescribeSnapshots to retrieve
     * the next set of items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the
     * <i>Limit</i> parameter.
     * </p>
     *
     * @param describeSnapshotsRequest Container for the necessary parameters
     *           to execute the DescribeSnapshots service method on
     *           AWSDirectoryService.
     * 
     * @return The response from the DescribeSnapshots service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws InvalidParameterException
     * @throws InvalidNextTokenException
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSnapshotsResult describeSnapshots(DescribeSnapshotsRequest describeSnapshotsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an alias for a directory and assigns the alias to the
     * directory. The alias is used to construct the access URL for the
     * directory, such as <code>http://<alias>.awsapps.com</code> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b> After an alias has been created, it cannot be
     * deleted or reused, so this operation should only be used when
     * absolutely necessary.
     * </p>
     *
     * @param createAliasRequest Container for the necessary parameters to
     *           execute the CreateAlias service method on AWSDirectoryService.
     * 
     * @return The response from the CreateAlias service method, as returned
     *         by AWSDirectoryService.
     * 
     * @throws InvalidParameterException
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws EntityAlreadyExistsException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateAliasResult createAlias(CreateAliasRequest createAliasRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a directory snapshot.
     * </p>
     *
     * @param deleteSnapshotRequest Container for the necessary parameters to
     *           execute the DeleteSnapshot service method on AWSDirectoryService.
     * 
     * @return The response from the DeleteSnapshot service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws InvalidParameterException
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteSnapshotResult deleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the Remote Authentication Dial In User Service (RADIUS)
     * server information for an AD Connector directory.
     * </p>
     *
     * @param updateRadiusRequest Container for the necessary parameters to
     *           execute the UpdateRadius service method on AWSDirectoryService.
     * 
     * @return The response from the UpdateRadius service method, as returned
     *         by AWSDirectoryService.
     * 
     * @throws InvalidParameterException
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateRadiusResult updateRadius(UpdateRadiusRequest updateRadiusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Obtains information about the directories that belong to this
     * account.
     * </p>
     * <p>
     * You can retrieve information about specific directories by passing
     * the directory identifiers in the <i>DirectoryIds</i> parameter.
     * Otherwise, all directories that belong to the current account are
     * returned.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <i>NextToken</i> request and response parameters. If more results are
     * available, the <i>DescribeDirectoriesResult.NextToken</i> member
     * contains a token that you pass in the next call to DescribeDirectories
     * to retrieve the next set of items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the
     * <i>Limit</i> parameter.
     * </p>
     *
     * @param describeDirectoriesRequest Container for the necessary
     *           parameters to execute the DescribeDirectories service method on
     *           AWSDirectoryService.
     * 
     * @return The response from the DescribeDirectories service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws InvalidParameterException
     * @throws InvalidNextTokenException
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDirectoriesResult describeDirectories(DescribeDirectoriesRequest describeDirectoriesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an AD Connector to connect an on-premises directory.
     * </p>
     *
     * @param connectDirectoryRequest Container for the necessary parameters
     *           to execute the ConnectDirectory service method on AWSDirectoryService.
     * 
     * @return The response from the ConnectDirectory service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws InvalidParameterException
     * @throws DirectoryLimitExceededException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ConnectDirectoryResult connectDirectory(ConnectDirectoryRequest connectDirectoryRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a snapshot of an existing directory.
     * </p>
     * <p>
     * You cannot take snapshots of extended or connected directories.
     * </p>
     *
     * @param createSnapshotRequest Container for the necessary parameters to
     *           execute the CreateSnapshot service method on AWSDirectoryService.
     * 
     * @return The response from the CreateSnapshot service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws InvalidParameterException
     * @throws EntityDoesNotExistException
     * @throws SnapshotLimitExceededException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateSnapshotResult createSnapshot(CreateSnapshotRequest createSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an AWS Directory Service directory.
     * </p>
     *
     * @param deleteDirectoryRequest Container for the necessary parameters
     *           to execute the DeleteDirectory service method on AWSDirectoryService.
     * 
     * @return The response from the DeleteDirectory service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteDirectoryResult deleteDirectory(DeleteDirectoryRequest deleteDirectoryRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Obtains directory limit information for the current region.
     * </p>
     *
     * @param getDirectoryLimitsRequest Container for the necessary
     *           parameters to execute the GetDirectoryLimits service method on
     *           AWSDirectoryService.
     * 
     * @return The response from the GetDirectoryLimits service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetDirectoryLimitsResult getDirectoryLimits(GetDirectoryLimitsRequest getDirectoryLimitsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disables single-sign on for a directory.
     * </p>
     *
     * @param disableSsoRequest Container for the necessary parameters to
     *           execute the DisableSso service method on AWSDirectoryService.
     * 
     * @return The response from the DisableSso service method, as returned
     *         by AWSDirectoryService.
     * 
     * @throws InsufficientPermissionsException
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws AuthenticationFailedException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DisableSsoResult disableSso(DisableSsoRequest disableSsoRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables multi-factor authentication (MFA) with Remote Authentication
     * Dial In User Service (RADIUS) for an AD Connector directory.
     * </p>
     *
     * @param enableRadiusRequest Container for the necessary parameters to
     *           execute the EnableRadius service method on AWSDirectoryService.
     * 
     * @return The response from the EnableRadius service method, as returned
     *         by AWSDirectoryService.
     * 
     * @throws InvalidParameterException
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws EntityAlreadyExistsException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EnableRadiusResult enableRadius(EnableRadiusRequest enableRadiusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a computer account in the specified directory, and joins the
     * computer to the directory.
     * </p>
     *
     * @param createComputerRequest Container for the necessary parameters to
     *           execute the CreateComputer service method on AWSDirectoryService.
     * 
     * @return The response from the CreateComputer service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws UnsupportedOperationException
     * @throws InvalidParameterException
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws DirectoryUnavailableException
     * @throws AuthenticationFailedException
     * @throws EntityAlreadyExistsException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateComputerResult createComputer(CreateComputerRequest createComputerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables single-sign on for a directory.
     * </p>
     *
     * @param enableSsoRequest Container for the necessary parameters to
     *           execute the EnableSso service method on AWSDirectoryService.
     * 
     * @return The response from the EnableSso service method, as returned by
     *         AWSDirectoryService.
     * 
     * @throws InsufficientPermissionsException
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws AuthenticationFailedException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EnableSsoResult enableSso(EnableSsoRequest enableSsoRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a Simple AD directory.
     * </p>
     *
     * @param createDirectoryRequest Container for the necessary parameters
     *           to execute the CreateDirectory service method on AWSDirectoryService.
     * 
     * @return The response from the CreateDirectory service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws InvalidParameterException
     * @throws DirectoryLimitExceededException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateDirectoryResult createDirectory(CreateDirectoryRequest createDirectoryRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Restores a directory using an existing directory snapshot.
     * </p>
     * <p>
     * When you restore a directory from a snapshot, any changes made to the
     * directory after the snapshot date are overwritten.
     * </p>
     * <p>
     * This action returns as soon as the restore operation is initiated.
     * You can monitor the progress of the restore operation by calling the
     * DescribeDirectories operation with the directory identifier. When the
     * <b>DirectoryDescription.Stage</b> value changes to <code>Active</code>
     * , the restore operation is complete.
     * </p>
     *
     * @param restoreFromSnapshotRequest Container for the necessary
     *           parameters to execute the RestoreFromSnapshot service method on
     *           AWSDirectoryService.
     * 
     * @return The response from the RestoreFromSnapshot service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws InvalidParameterException
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RestoreFromSnapshotResult restoreFromSnapshot(RestoreFromSnapshotRequest restoreFromSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disables multi-factor authentication (MFA) with Remote Authentication
     * Dial In User Service (RADIUS) for an AD Connector directory.
     * </p>
     *
     * @param disableRadiusRequest Container for the necessary parameters to
     *           execute the DisableRadius service method on AWSDirectoryService.
     * 
     * @return The response from the DisableRadius service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DisableRadiusResult disableRadius(DisableRadiusRequest disableRadiusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Obtains the manual snapshot limits for a directory.
     * </p>
     *
     * @param getSnapshotLimitsRequest Container for the necessary parameters
     *           to execute the GetSnapshotLimits service method on
     *           AWSDirectoryService.
     * 
     * @return The response from the GetSnapshotLimits service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetSnapshotLimitsResult getSnapshotLimits(GetSnapshotLimitsRequest getSnapshotLimitsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Obtains information about the directory snapshots that belong to this
     * account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <i>NextToken</i> request and response parameters. If more results are
     * available, the <i>DescribeSnapshots.NextToken</i> member contains a
     * token that you pass in the next call to DescribeSnapshots to retrieve
     * the next set of items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the
     * <i>Limit</i> parameter.
     * </p>
     * 
     * @return The response from the DescribeSnapshots service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws InvalidParameterException
     * @throws InvalidNextTokenException
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSnapshotsResult describeSnapshots() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Obtains information about the directories that belong to this
     * account.
     * </p>
     * <p>
     * You can retrieve information about specific directories by passing
     * the directory identifiers in the <i>DirectoryIds</i> parameter.
     * Otherwise, all directories that belong to the current account are
     * returned.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <i>NextToken</i> request and response parameters. If more results are
     * available, the <i>DescribeDirectoriesResult.NextToken</i> member
     * contains a token that you pass in the next call to DescribeDirectories
     * to retrieve the next set of items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the
     * <i>Limit</i> parameter.
     * </p>
     * 
     * @return The response from the DescribeDirectories service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws InvalidParameterException
     * @throws InvalidNextTokenException
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDirectoriesResult describeDirectories() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Obtains directory limit information for the current region.
     * </p>
     * 
     * @return The response from the GetDirectoryLimits service method, as
     *         returned by AWSDirectoryService.
     * 
     * @throws EntityDoesNotExistException
     * @throws ServiceException
     * @throws ClientException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetDirectoryLimitsResult getDirectoryLimits() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
        