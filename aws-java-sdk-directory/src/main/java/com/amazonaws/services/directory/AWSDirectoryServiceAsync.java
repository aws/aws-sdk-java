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

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.directory.model.*;

/**
 * Interface for accessing AWSDirectoryService asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * AWS Directory Service <p>
 * This is the <i>AWS Directory Service API Reference</i> . This guide
 * provides detailed information about AWS Directory Service operations,
 * data types, parameters, and errors.
 * </p>
 */
public interface AWSDirectoryServiceAsync extends AWSDirectoryService {
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
     *           to execute the DescribeSnapshots operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSnapshots service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest describeSnapshotsRequest) 
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
     * @param describeSnapshotsRequest Container for the necessary parameters
     *           to execute the DescribeSnapshots operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSnapshots service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest describeSnapshotsRequest,
            AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler)
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
     *           execute the CreateAlias operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         CreateAlias service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateAliasResult> createAliasAsync(CreateAliasRequest createAliasRequest) 
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
     *           execute the CreateAlias operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateAlias service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateAliasResult> createAliasAsync(CreateAliasRequest createAliasRequest,
            AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a directory snapshot.
     * </p>
     *
     * @param deleteSnapshotRequest Container for the necessary parameters to
     *           execute the DeleteSnapshot operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSnapshot service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteSnapshotResult> deleteSnapshotAsync(DeleteSnapshotRequest deleteSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a directory snapshot.
     * </p>
     *
     * @param deleteSnapshotRequest Container for the necessary parameters to
     *           execute the DeleteSnapshot operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSnapshot service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteSnapshotResult> deleteSnapshotAsync(DeleteSnapshotRequest deleteSnapshotRequest,
            AsyncHandler<DeleteSnapshotRequest, DeleteSnapshotResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the Remote Authentication Dial In User Service (RADIUS)
     * server information for an AD Connector directory.
     * </p>
     *
     * @param updateRadiusRequest Container for the necessary parameters to
     *           execute the UpdateRadius operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateRadius service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateRadiusResult> updateRadiusAsync(UpdateRadiusRequest updateRadiusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the Remote Authentication Dial In User Service (RADIUS)
     * server information for an AD Connector directory.
     * </p>
     *
     * @param updateRadiusRequest Container for the necessary parameters to
     *           execute the UpdateRadius operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateRadius service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateRadiusResult> updateRadiusAsync(UpdateRadiusRequest updateRadiusRequest,
            AsyncHandler<UpdateRadiusRequest, UpdateRadiusResult> asyncHandler)
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
     *           parameters to execute the DescribeDirectories operation on
     *           AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDirectories service method, as returned by
     *         AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDirectoriesResult> describeDirectoriesAsync(DescribeDirectoriesRequest describeDirectoriesRequest) 
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
     *           parameters to execute the DescribeDirectories operation on
     *           AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDirectories service method, as returned by
     *         AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDirectoriesResult> describeDirectoriesAsync(DescribeDirectoriesRequest describeDirectoriesRequest,
            AsyncHandler<DescribeDirectoriesRequest, DescribeDirectoriesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an AD Connector to connect an on-premises directory.
     * </p>
     *
     * @param connectDirectoryRequest Container for the necessary parameters
     *           to execute the ConnectDirectory operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         ConnectDirectory service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ConnectDirectoryResult> connectDirectoryAsync(ConnectDirectoryRequest connectDirectoryRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an AD Connector to connect an on-premises directory.
     * </p>
     *
     * @param connectDirectoryRequest Container for the necessary parameters
     *           to execute the ConnectDirectory operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ConnectDirectory service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ConnectDirectoryResult> connectDirectoryAsync(ConnectDirectoryRequest connectDirectoryRequest,
            AsyncHandler<ConnectDirectoryRequest, ConnectDirectoryResult> asyncHandler)
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
     *           execute the CreateSnapshot operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         CreateSnapshot service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest createSnapshotRequest) 
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
     *           execute the CreateSnapshot operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateSnapshot service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest createSnapshotRequest,
            AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an AWS Directory Service directory.
     * </p>
     *
     * @param deleteDirectoryRequest Container for the necessary parameters
     *           to execute the DeleteDirectory operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDirectory service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDirectoryResult> deleteDirectoryAsync(DeleteDirectoryRequest deleteDirectoryRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an AWS Directory Service directory.
     * </p>
     *
     * @param deleteDirectoryRequest Container for the necessary parameters
     *           to execute the DeleteDirectory operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDirectory service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDirectoryResult> deleteDirectoryAsync(DeleteDirectoryRequest deleteDirectoryRequest,
            AsyncHandler<DeleteDirectoryRequest, DeleteDirectoryResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Obtains directory limit information for the current region.
     * </p>
     *
     * @param getDirectoryLimitsRequest Container for the necessary
     *           parameters to execute the GetDirectoryLimits operation on
     *           AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         GetDirectoryLimits service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDirectoryLimitsResult> getDirectoryLimitsAsync(GetDirectoryLimitsRequest getDirectoryLimitsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Obtains directory limit information for the current region.
     * </p>
     *
     * @param getDirectoryLimitsRequest Container for the necessary
     *           parameters to execute the GetDirectoryLimits operation on
     *           AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetDirectoryLimits service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDirectoryLimitsResult> getDirectoryLimitsAsync(GetDirectoryLimitsRequest getDirectoryLimitsRequest,
            AsyncHandler<GetDirectoryLimitsRequest, GetDirectoryLimitsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disables single-sign on for a directory.
     * </p>
     *
     * @param disableSsoRequest Container for the necessary parameters to
     *           execute the DisableSso operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         DisableSso service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DisableSsoResult> disableSsoAsync(DisableSsoRequest disableSsoRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disables single-sign on for a directory.
     * </p>
     *
     * @param disableSsoRequest Container for the necessary parameters to
     *           execute the DisableSso operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DisableSso service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DisableSsoResult> disableSsoAsync(DisableSsoRequest disableSsoRequest,
            AsyncHandler<DisableSsoRequest, DisableSsoResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables multi-factor authentication (MFA) with Remote Authentication
     * Dial In User Service (RADIUS) for an AD Connector directory.
     * </p>
     *
     * @param enableRadiusRequest Container for the necessary parameters to
     *           execute the EnableRadius operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         EnableRadius service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EnableRadiusResult> enableRadiusAsync(EnableRadiusRequest enableRadiusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables multi-factor authentication (MFA) with Remote Authentication
     * Dial In User Service (RADIUS) for an AD Connector directory.
     * </p>
     *
     * @param enableRadiusRequest Container for the necessary parameters to
     *           execute the EnableRadius operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         EnableRadius service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EnableRadiusResult> enableRadiusAsync(EnableRadiusRequest enableRadiusRequest,
            AsyncHandler<EnableRadiusRequest, EnableRadiusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a computer account in the specified directory, and joins the
     * computer to the directory.
     * </p>
     *
     * @param createComputerRequest Container for the necessary parameters to
     *           execute the CreateComputer operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         CreateComputer service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateComputerResult> createComputerAsync(CreateComputerRequest createComputerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a computer account in the specified directory, and joins the
     * computer to the directory.
     * </p>
     *
     * @param createComputerRequest Container for the necessary parameters to
     *           execute the CreateComputer operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateComputer service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateComputerResult> createComputerAsync(CreateComputerRequest createComputerRequest,
            AsyncHandler<CreateComputerRequest, CreateComputerResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables single-sign on for a directory.
     * </p>
     *
     * @param enableSsoRequest Container for the necessary parameters to
     *           execute the EnableSso operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         EnableSso service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EnableSsoResult> enableSsoAsync(EnableSsoRequest enableSsoRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables single-sign on for a directory.
     * </p>
     *
     * @param enableSsoRequest Container for the necessary parameters to
     *           execute the EnableSso operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         EnableSso service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EnableSsoResult> enableSsoAsync(EnableSsoRequest enableSsoRequest,
            AsyncHandler<EnableSsoRequest, EnableSsoResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a Simple AD directory.
     * </p>
     *
     * @param createDirectoryRequest Container for the necessary parameters
     *           to execute the CreateDirectory operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDirectory service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDirectoryResult> createDirectoryAsync(CreateDirectoryRequest createDirectoryRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a Simple AD directory.
     * </p>
     *
     * @param createDirectoryRequest Container for the necessary parameters
     *           to execute the CreateDirectory operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDirectory service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDirectoryResult> createDirectoryAsync(CreateDirectoryRequest createDirectoryRequest,
            AsyncHandler<CreateDirectoryRequest, CreateDirectoryResult> asyncHandler)
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
     *           parameters to execute the RestoreFromSnapshot operation on
     *           AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         RestoreFromSnapshot service method, as returned by
     *         AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RestoreFromSnapshotResult> restoreFromSnapshotAsync(RestoreFromSnapshotRequest restoreFromSnapshotRequest) 
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
     *           parameters to execute the RestoreFromSnapshot operation on
     *           AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RestoreFromSnapshot service method, as returned by
     *         AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RestoreFromSnapshotResult> restoreFromSnapshotAsync(RestoreFromSnapshotRequest restoreFromSnapshotRequest,
            AsyncHandler<RestoreFromSnapshotRequest, RestoreFromSnapshotResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disables multi-factor authentication (MFA) with Remote Authentication
     * Dial In User Service (RADIUS) for an AD Connector directory.
     * </p>
     *
     * @param disableRadiusRequest Container for the necessary parameters to
     *           execute the DisableRadius operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         DisableRadius service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DisableRadiusResult> disableRadiusAsync(DisableRadiusRequest disableRadiusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disables multi-factor authentication (MFA) with Remote Authentication
     * Dial In User Service (RADIUS) for an AD Connector directory.
     * </p>
     *
     * @param disableRadiusRequest Container for the necessary parameters to
     *           execute the DisableRadius operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DisableRadius service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DisableRadiusResult> disableRadiusAsync(DisableRadiusRequest disableRadiusRequest,
            AsyncHandler<DisableRadiusRequest, DisableRadiusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Obtains the manual snapshot limits for a directory.
     * </p>
     *
     * @param getSnapshotLimitsRequest Container for the necessary parameters
     *           to execute the GetSnapshotLimits operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         GetSnapshotLimits service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetSnapshotLimitsResult> getSnapshotLimitsAsync(GetSnapshotLimitsRequest getSnapshotLimitsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Obtains the manual snapshot limits for a directory.
     * </p>
     *
     * @param getSnapshotLimitsRequest Container for the necessary parameters
     *           to execute the GetSnapshotLimits operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetSnapshotLimits service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetSnapshotLimitsResult> getSnapshotLimitsAsync(GetSnapshotLimitsRequest getSnapshotLimitsRequest,
            AsyncHandler<GetSnapshotLimitsRequest, GetSnapshotLimitsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        