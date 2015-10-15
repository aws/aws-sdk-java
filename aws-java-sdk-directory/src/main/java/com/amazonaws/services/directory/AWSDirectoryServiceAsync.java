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

import com.amazonaws.services.directory.model.*;

/**
 * Interface for accessing Directory Service asynchronously. Each asynchronous
 * method will return a Java Future object representing the asynchronous
 * operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Directory Service</fullname>
 * <p>
 * This is the <i>AWS Directory Service API Reference</i>. This guide provides
 * detailed information about AWS Directory Service operations, data types,
 * parameters, and errors.
 * </p>
 */
public interface AWSDirectoryServiceAsync extends AWSDirectoryService {

    /**
     * <p>
     * Creates an AD Connector to connect an on-premises directory.
     * </p>
     * 
     * @param connectDirectoryRequest
     *        Contains the inputs for the <a>ConnectDirectory</a> operation.
     * @return A Java Future containing the result of the ConnectDirectory
     *         operation returned by the service.
     */
    java.util.concurrent.Future<ConnectDirectoryResult> connectDirectoryAsync(
            ConnectDirectoryRequest connectDirectoryRequest);

    /**
     * <p>
     * Creates an AD Connector to connect an on-premises directory.
     * </p>
     * 
     * @param connectDirectoryRequest
     *        Contains the inputs for the <a>ConnectDirectory</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ConnectDirectory
     *         operation returned by the service.
     */
    java.util.concurrent.Future<ConnectDirectoryResult> connectDirectoryAsync(
            ConnectDirectoryRequest connectDirectoryRequest,
            com.amazonaws.handlers.AsyncHandler<ConnectDirectoryRequest, ConnectDirectoryResult> asyncHandler);

    /**
     * <p>
     * Creates an alias for a directory and assigns the alias to the directory.
     * The alias is used to construct the access URL for the directory, such as
     * <code>http://&#x3C;alias&#x3E;.awsapps.com</code>.
     * </p>
     * <important>
     * <p>
     * After an alias has been created, it cannot be deleted or reused, so this
     * operation should only be used when absolutely necessary.
     * </p>
     * </important>
     * 
     * @param createAliasRequest
     *        Contains the inputs for the <a>CreateAlias</a> operation.
     * @return A Java Future containing the result of the CreateAlias operation
     *         returned by the service.
     */
    java.util.concurrent.Future<CreateAliasResult> createAliasAsync(
            CreateAliasRequest createAliasRequest);

    /**
     * <p>
     * Creates an alias for a directory and assigns the alias to the directory.
     * The alias is used to construct the access URL for the directory, such as
     * <code>http://&#x3C;alias&#x3E;.awsapps.com</code>.
     * </p>
     * <important>
     * <p>
     * After an alias has been created, it cannot be deleted or reused, so this
     * operation should only be used when absolutely necessary.
     * </p>
     * </important>
     * 
     * @param createAliasRequest
     *        Contains the inputs for the <a>CreateAlias</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAlias operation
     *         returned by the service.
     */
    java.util.concurrent.Future<CreateAliasResult> createAliasAsync(
            CreateAliasRequest createAliasRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler);

    /**
     * <p>
     * Creates a computer account in the specified directory, and joins the
     * computer to the directory.
     * </p>
     * 
     * @param createComputerRequest
     *        Contains the inputs for the <a>CreateComputer</a> operation.
     * @return A Java Future containing the result of the CreateComputer
     *         operation returned by the service.
     */
    java.util.concurrent.Future<CreateComputerResult> createComputerAsync(
            CreateComputerRequest createComputerRequest);

    /**
     * <p>
     * Creates a computer account in the specified directory, and joins the
     * computer to the directory.
     * </p>
     * 
     * @param createComputerRequest
     *        Contains the inputs for the <a>CreateComputer</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateComputer
     *         operation returned by the service.
     */
    java.util.concurrent.Future<CreateComputerResult> createComputerAsync(
            CreateComputerRequest createComputerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateComputerRequest, CreateComputerResult> asyncHandler);

    /**
     * <p>
     * Creates a Simple AD directory.
     * </p>
     * 
     * @param createDirectoryRequest
     *        Contains the inputs for the <a>CreateDirectory</a> operation.
     * @return A Java Future containing the result of the CreateDirectory
     *         operation returned by the service.
     */
    java.util.concurrent.Future<CreateDirectoryResult> createDirectoryAsync(
            CreateDirectoryRequest createDirectoryRequest);

    /**
     * <p>
     * Creates a Simple AD directory.
     * </p>
     * 
     * @param createDirectoryRequest
     *        Contains the inputs for the <a>CreateDirectory</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDirectory
     *         operation returned by the service.
     */
    java.util.concurrent.Future<CreateDirectoryResult> createDirectoryAsync(
            CreateDirectoryRequest createDirectoryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDirectoryRequest, CreateDirectoryResult> asyncHandler);

    /**
     * <p>
     * Creates a snapshot of an existing directory.
     * </p>
     * <p>
     * You cannot take snapshots of extended or connected directories.
     * </p>
     * 
     * @param createSnapshotRequest
     *        Contains the inputs for the <a>CreateSnapshot</a> operation.
     * @return A Java Future containing the result of the CreateSnapshot
     *         operation returned by the service.
     */
    java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(
            CreateSnapshotRequest createSnapshotRequest);

    /**
     * <p>
     * Creates a snapshot of an existing directory.
     * </p>
     * <p>
     * You cannot take snapshots of extended or connected directories.
     * </p>
     * 
     * @param createSnapshotRequest
     *        Contains the inputs for the <a>CreateSnapshot</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSnapshot
     *         operation returned by the service.
     */
    java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(
            CreateSnapshotRequest createSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler);

    /**
     * <p>
     * Deletes an AWS Directory Service directory.
     * </p>
     * 
     * @param deleteDirectoryRequest
     *        Contains the inputs for the <a>DeleteDirectory</a> operation.
     * @return A Java Future containing the result of the DeleteDirectory
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DeleteDirectoryResult> deleteDirectoryAsync(
            DeleteDirectoryRequest deleteDirectoryRequest);

    /**
     * <p>
     * Deletes an AWS Directory Service directory.
     * </p>
     * 
     * @param deleteDirectoryRequest
     *        Contains the inputs for the <a>DeleteDirectory</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDirectory
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DeleteDirectoryResult> deleteDirectoryAsync(
            DeleteDirectoryRequest deleteDirectoryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDirectoryRequest, DeleteDirectoryResult> asyncHandler);

    /**
     * <p>
     * Deletes a directory snapshot.
     * </p>
     * 
     * @param deleteSnapshotRequest
     *        Contains the inputs for the <a>DeleteSnapshot</a> operation.
     * @return A Java Future containing the result of the DeleteSnapshot
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(
            DeleteSnapshotRequest deleteSnapshotRequest);

    /**
     * <p>
     * Deletes a directory snapshot.
     * </p>
     * 
     * @param deleteSnapshotRequest
     *        Contains the inputs for the <a>DeleteSnapshot</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSnapshot
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(
            DeleteSnapshotRequest deleteSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSnapshotRequest, DeleteSnapshotResult> asyncHandler);

    /**
     * <p>
     * Obtains information about the directories that belong to this account.
     * </p>
     * <p>
     * You can retrieve information about specific directories by passing the
     * directory identifiers in the <i>DirectoryIds</i> parameter. Otherwise,
     * all directories that belong to the current account are returned.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <i>NextToken</i>
     * request and response parameters. If more results are available, the
     * <i>DescribeDirectoriesResult.NextToken</i> member contains a token that
     * you pass in the next call to <a>DescribeDirectories</a> to retrieve the
     * next set of items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the
     * <i>Limit</i> parameter.
     * </p>
     * 
     * @param describeDirectoriesRequest
     *        Contains the inputs for the <a>DescribeDirectories</a> operation.
     * @return A Java Future containing the result of the DescribeDirectories
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DescribeDirectoriesResult> describeDirectoriesAsync(
            DescribeDirectoriesRequest describeDirectoriesRequest);

    /**
     * <p>
     * Obtains information about the directories that belong to this account.
     * </p>
     * <p>
     * You can retrieve information about specific directories by passing the
     * directory identifiers in the <i>DirectoryIds</i> parameter. Otherwise,
     * all directories that belong to the current account are returned.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <i>NextToken</i>
     * request and response parameters. If more results are available, the
     * <i>DescribeDirectoriesResult.NextToken</i> member contains a token that
     * you pass in the next call to <a>DescribeDirectories</a> to retrieve the
     * next set of items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the
     * <i>Limit</i> parameter.
     * </p>
     * 
     * @param describeDirectoriesRequest
     *        Contains the inputs for the <a>DescribeDirectories</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDirectories
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DescribeDirectoriesResult> describeDirectoriesAsync(
            DescribeDirectoriesRequest describeDirectoriesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDirectoriesRequest, DescribeDirectoriesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeDirectories operation.
     *
     * @see #describeDirectoriesAsync(DescribeDirectoriesRequest)
     */
    java.util.concurrent.Future<DescribeDirectoriesResult> describeDirectoriesAsync();

    /**
     * Simplified method form for invoking the DescribeDirectories operation
     * with an AsyncHandler.
     *
     * @see #describeDirectoriesAsync(DescribeDirectoriesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeDirectoriesResult> describeDirectoriesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDirectoriesRequest, DescribeDirectoriesResult> asyncHandler);

    /**
     * <p>
     * Obtains information about the directory snapshots that belong to this
     * account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <i>NextToken</i>
     * request and response parameters. If more results are available, the
     * <i>DescribeSnapshots.NextToken</i> member contains a token that you pass
     * in the next call to <a>DescribeSnapshots</a> to retrieve the next set of
     * items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the
     * <i>Limit</i> parameter.
     * </p>
     * 
     * @param describeSnapshotsRequest
     *        Contains the inputs for the <a>DescribeSnapshots</a> operation.
     * @return A Java Future containing the result of the DescribeSnapshots
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(
            DescribeSnapshotsRequest describeSnapshotsRequest);

    /**
     * <p>
     * Obtains information about the directory snapshots that belong to this
     * account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <i>NextToken</i>
     * request and response parameters. If more results are available, the
     * <i>DescribeSnapshots.NextToken</i> member contains a token that you pass
     * in the next call to <a>DescribeSnapshots</a> to retrieve the next set of
     * items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the
     * <i>Limit</i> parameter.
     * </p>
     * 
     * @param describeSnapshotsRequest
     *        Contains the inputs for the <a>DescribeSnapshots</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSnapshots
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(
            DescribeSnapshotsRequest describeSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeSnapshots operation.
     *
     * @see #describeSnapshotsAsync(DescribeSnapshotsRequest)
     */
    java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync();

    /**
     * Simplified method form for invoking the DescribeSnapshots operation with
     * an AsyncHandler.
     *
     * @see #describeSnapshotsAsync(DescribeSnapshotsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler);

    /**
     * <p>
     * Disables multi-factor authentication (MFA) with Remote Authentication
     * Dial In User Service (RADIUS) for an AD Connector directory.
     * </p>
     * 
     * @param disableRadiusRequest
     *        Contains the inputs for the <a>DisableRadius</a> operation.
     * @return A Java Future containing the result of the DisableRadius
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DisableRadiusResult> disableRadiusAsync(
            DisableRadiusRequest disableRadiusRequest);

    /**
     * <p>
     * Disables multi-factor authentication (MFA) with Remote Authentication
     * Dial In User Service (RADIUS) for an AD Connector directory.
     * </p>
     * 
     * @param disableRadiusRequest
     *        Contains the inputs for the <a>DisableRadius</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableRadius
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DisableRadiusResult> disableRadiusAsync(
            DisableRadiusRequest disableRadiusRequest,
            com.amazonaws.handlers.AsyncHandler<DisableRadiusRequest, DisableRadiusResult> asyncHandler);

    /**
     * <p>
     * Disables single-sign on for a directory.
     * </p>
     * 
     * @param disableSsoRequest
     *        Contains the inputs for the <a>DisableSso</a> operation.
     * @return A Java Future containing the result of the DisableSso operation
     *         returned by the service.
     */
    java.util.concurrent.Future<DisableSsoResult> disableSsoAsync(
            DisableSsoRequest disableSsoRequest);

    /**
     * <p>
     * Disables single-sign on for a directory.
     * </p>
     * 
     * @param disableSsoRequest
     *        Contains the inputs for the <a>DisableSso</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableSso operation
     *         returned by the service.
     */
    java.util.concurrent.Future<DisableSsoResult> disableSsoAsync(
            DisableSsoRequest disableSsoRequest,
            com.amazonaws.handlers.AsyncHandler<DisableSsoRequest, DisableSsoResult> asyncHandler);

    /**
     * <p>
     * Enables multi-factor authentication (MFA) with Remote Authentication Dial
     * In User Service (RADIUS) for an AD Connector directory.
     * </p>
     * 
     * @param enableRadiusRequest
     *        Contains the inputs for the <a>EnableRadius</a> operation.
     * @return A Java Future containing the result of the EnableRadius operation
     *         returned by the service.
     */
    java.util.concurrent.Future<EnableRadiusResult> enableRadiusAsync(
            EnableRadiusRequest enableRadiusRequest);

    /**
     * <p>
     * Enables multi-factor authentication (MFA) with Remote Authentication Dial
     * In User Service (RADIUS) for an AD Connector directory.
     * </p>
     * 
     * @param enableRadiusRequest
     *        Contains the inputs for the <a>EnableRadius</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableRadius operation
     *         returned by the service.
     */
    java.util.concurrent.Future<EnableRadiusResult> enableRadiusAsync(
            EnableRadiusRequest enableRadiusRequest,
            com.amazonaws.handlers.AsyncHandler<EnableRadiusRequest, EnableRadiusResult> asyncHandler);

    /**
     * <p>
     * Enables single-sign on for a directory.
     * </p>
     * 
     * @param enableSsoRequest
     *        Contains the inputs for the <a>EnableSso</a> operation.
     * @return A Java Future containing the result of the EnableSso operation
     *         returned by the service.
     */
    java.util.concurrent.Future<EnableSsoResult> enableSsoAsync(
            EnableSsoRequest enableSsoRequest);

    /**
     * <p>
     * Enables single-sign on for a directory.
     * </p>
     * 
     * @param enableSsoRequest
     *        Contains the inputs for the <a>EnableSso</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableSso operation
     *         returned by the service.
     */
    java.util.concurrent.Future<EnableSsoResult> enableSsoAsync(
            EnableSsoRequest enableSsoRequest,
            com.amazonaws.handlers.AsyncHandler<EnableSsoRequest, EnableSsoResult> asyncHandler);

    /**
     * <p>
     * Obtains directory limit information for the current region.
     * </p>
     * 
     * @param getDirectoryLimitsRequest
     *        Contains the inputs for the <a>GetDirectoryLimits</a> operation.
     * @return A Java Future containing the result of the GetDirectoryLimits
     *         operation returned by the service.
     */
    java.util.concurrent.Future<GetDirectoryLimitsResult> getDirectoryLimitsAsync(
            GetDirectoryLimitsRequest getDirectoryLimitsRequest);

    /**
     * <p>
     * Obtains directory limit information for the current region.
     * </p>
     * 
     * @param getDirectoryLimitsRequest
     *        Contains the inputs for the <a>GetDirectoryLimits</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDirectoryLimits
     *         operation returned by the service.
     */
    java.util.concurrent.Future<GetDirectoryLimitsResult> getDirectoryLimitsAsync(
            GetDirectoryLimitsRequest getDirectoryLimitsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDirectoryLimitsRequest, GetDirectoryLimitsResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetDirectoryLimits operation.
     *
     * @see #getDirectoryLimitsAsync(GetDirectoryLimitsRequest)
     */
    java.util.concurrent.Future<GetDirectoryLimitsResult> getDirectoryLimitsAsync();

    /**
     * Simplified method form for invoking the GetDirectoryLimits operation with
     * an AsyncHandler.
     *
     * @see #getDirectoryLimitsAsync(GetDirectoryLimitsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetDirectoryLimitsResult> getDirectoryLimitsAsync(
            com.amazonaws.handlers.AsyncHandler<GetDirectoryLimitsRequest, GetDirectoryLimitsResult> asyncHandler);

    /**
     * <p>
     * Obtains the manual snapshot limits for a directory.
     * </p>
     * 
     * @param getSnapshotLimitsRequest
     *        Contains the inputs for the <a>GetSnapshotLimits</a> operation.
     * @return A Java Future containing the result of the GetSnapshotLimits
     *         operation returned by the service.
     */
    java.util.concurrent.Future<GetSnapshotLimitsResult> getSnapshotLimitsAsync(
            GetSnapshotLimitsRequest getSnapshotLimitsRequest);

    /**
     * <p>
     * Obtains the manual snapshot limits for a directory.
     * </p>
     * 
     * @param getSnapshotLimitsRequest
     *        Contains the inputs for the <a>GetSnapshotLimits</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSnapshotLimits
     *         operation returned by the service.
     */
    java.util.concurrent.Future<GetSnapshotLimitsResult> getSnapshotLimitsAsync(
            GetSnapshotLimitsRequest getSnapshotLimitsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSnapshotLimitsRequest, GetSnapshotLimitsResult> asyncHandler);

    /**
     * <p>
     * Restores a directory using an existing directory snapshot.
     * </p>
     * <p>
     * When you restore a directory from a snapshot, any changes made to the
     * directory after the snapshot date are overwritten.
     * </p>
     * <p>
     * This action returns as soon as the restore operation is initiated. You
     * can monitor the progress of the restore operation by calling the
     * <a>DescribeDirectories</a> operation with the directory identifier. When
     * the <b>DirectoryDescription.Stage</b> value changes to
     * <code>Active</code>, the restore operation is complete.
     * </p>
     * 
     * @param restoreFromSnapshotRequest
     *        An object representing the inputs for the
     *        <a>RestoreFromSnapshot</a> operation.
     * @return A Java Future containing the result of the RestoreFromSnapshot
     *         operation returned by the service.
     */
    java.util.concurrent.Future<RestoreFromSnapshotResult> restoreFromSnapshotAsync(
            RestoreFromSnapshotRequest restoreFromSnapshotRequest);

    /**
     * <p>
     * Restores a directory using an existing directory snapshot.
     * </p>
     * <p>
     * When you restore a directory from a snapshot, any changes made to the
     * directory after the snapshot date are overwritten.
     * </p>
     * <p>
     * This action returns as soon as the restore operation is initiated. You
     * can monitor the progress of the restore operation by calling the
     * <a>DescribeDirectories</a> operation with the directory identifier. When
     * the <b>DirectoryDescription.Stage</b> value changes to
     * <code>Active</code>, the restore operation is complete.
     * </p>
     * 
     * @param restoreFromSnapshotRequest
     *        An object representing the inputs for the
     *        <a>RestoreFromSnapshot</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreFromSnapshot
     *         operation returned by the service.
     */
    java.util.concurrent.Future<RestoreFromSnapshotResult> restoreFromSnapshotAsync(
            RestoreFromSnapshotRequest restoreFromSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreFromSnapshotRequest, RestoreFromSnapshotResult> asyncHandler);

    /**
     * <p>
     * Updates the Remote Authentication Dial In User Service (RADIUS) server
     * information for an AD Connector directory.
     * </p>
     * 
     * @param updateRadiusRequest
     *        Contains the inputs for the <a>UpdateRadius</a> operation.
     * @return A Java Future containing the result of the UpdateRadius operation
     *         returned by the service.
     */
    java.util.concurrent.Future<UpdateRadiusResult> updateRadiusAsync(
            UpdateRadiusRequest updateRadiusRequest);

    /**
     * <p>
     * Updates the Remote Authentication Dial In User Service (RADIUS) server
     * information for an AD Connector directory.
     * </p>
     * 
     * @param updateRadiusRequest
     *        Contains the inputs for the <a>UpdateRadius</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRadius operation
     *         returned by the service.
     */
    java.util.concurrent.Future<UpdateRadiusResult> updateRadiusAsync(
            UpdateRadiusRequest updateRadiusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRadiusRequest, UpdateRadiusResult> asyncHandler);

}
