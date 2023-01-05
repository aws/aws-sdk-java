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
package com.amazonaws.services.finspacedata;

import javax.annotation.Generated;

import com.amazonaws.services.finspacedata.model.*;

/**
 * Interface for accessing FinSpace Data asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.finspacedata.AbstractAWSFinSpaceDataAsync} instead.
 * </p>
 * <p>
 * <p>
 * The FinSpace APIs let you take actions inside the FinSpace.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSFinSpaceDataAsync extends AWSFinSpaceData {

    /**
     * <p>
     * Adds a user account to a permission group to grant permissions for actions a user can perform in FinSpace.
     * </p>
     * 
     * @param associateUserToPermissionGroupRequest
     * @return A Java Future containing the result of the AssociateUserToPermissionGroup operation returned by the
     *         service.
     * @sample AWSFinSpaceDataAsync.AssociateUserToPermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/AssociateUserToPermissionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateUserToPermissionGroupResult> associateUserToPermissionGroupAsync(
            AssociateUserToPermissionGroupRequest associateUserToPermissionGroupRequest);

    /**
     * <p>
     * Adds a user account to a permission group to grant permissions for actions a user can perform in FinSpace.
     * </p>
     * 
     * @param associateUserToPermissionGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateUserToPermissionGroup operation returned by the
     *         service.
     * @sample AWSFinSpaceDataAsyncHandler.AssociateUserToPermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/AssociateUserToPermissionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateUserToPermissionGroupResult> associateUserToPermissionGroupAsync(
            AssociateUserToPermissionGroupRequest associateUserToPermissionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateUserToPermissionGroupRequest, AssociateUserToPermissionGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a new Changeset in a FinSpace Dataset.
     * </p>
     * 
     * @param createChangesetRequest
     *        The request for a CreateChangeset operation.
     * @return A Java Future containing the result of the CreateChangeset operation returned by the service.
     * @sample AWSFinSpaceDataAsync.CreateChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateChangesetResult> createChangesetAsync(CreateChangesetRequest createChangesetRequest);

    /**
     * <p>
     * Creates a new Changeset in a FinSpace Dataset.
     * </p>
     * 
     * @param createChangesetRequest
     *        The request for a CreateChangeset operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateChangeset operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.CreateChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateChangesetResult> createChangesetAsync(CreateChangesetRequest createChangesetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateChangesetRequest, CreateChangesetResult> asyncHandler);

    /**
     * <p>
     * Creates a Dataview for a Dataset.
     * </p>
     * 
     * @param createDataViewRequest
     *        Request for creating a data view.
     * @return A Java Future containing the result of the CreateDataView operation returned by the service.
     * @sample AWSFinSpaceDataAsync.CreateDataView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateDataView" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDataViewResult> createDataViewAsync(CreateDataViewRequest createDataViewRequest);

    /**
     * <p>
     * Creates a Dataview for a Dataset.
     * </p>
     * 
     * @param createDataViewRequest
     *        Request for creating a data view.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataView operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.CreateDataView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateDataView" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDataViewResult> createDataViewAsync(CreateDataViewRequest createDataViewRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDataViewRequest, CreateDataViewResult> asyncHandler);

    /**
     * <p>
     * Creates a new FinSpace Dataset.
     * </p>
     * 
     * @param createDatasetRequest
     *        The request for a CreateDataset operation
     * @return A Java Future containing the result of the CreateDataset operation returned by the service.
     * @sample AWSFinSpaceDataAsync.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest createDatasetRequest);

    /**
     * <p>
     * Creates a new FinSpace Dataset.
     * </p>
     * 
     * @param createDatasetRequest
     *        The request for a CreateDataset operation
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataset operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest createDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDatasetRequest, CreateDatasetResult> asyncHandler);

    /**
     * <p>
     * Creates a group of permissions for various actions that a user can perform in FinSpace.
     * </p>
     * 
     * @param createPermissionGroupRequest
     * @return A Java Future containing the result of the CreatePermissionGroup operation returned by the service.
     * @sample AWSFinSpaceDataAsync.CreatePermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreatePermissionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePermissionGroupResult> createPermissionGroupAsync(CreatePermissionGroupRequest createPermissionGroupRequest);

    /**
     * <p>
     * Creates a group of permissions for various actions that a user can perform in FinSpace.
     * </p>
     * 
     * @param createPermissionGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePermissionGroup operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.CreatePermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreatePermissionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePermissionGroupResult> createPermissionGroupAsync(CreatePermissionGroupRequest createPermissionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePermissionGroupRequest, CreatePermissionGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a new user in FinSpace.
     * </p>
     * 
     * @param createUserRequest
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AWSFinSpaceDataAsync.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Creates a new user in FinSpace.
     * </p>
     * 
     * @param createUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler);

    /**
     * <p>
     * Deletes a FinSpace Dataset.
     * </p>
     * 
     * @param deleteDatasetRequest
     *        The request for a DeleteDataset operation.
     * @return A Java Future containing the result of the DeleteDataset operation returned by the service.
     * @sample AWSFinSpaceDataAsync.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/DeleteDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest);

    /**
     * <p>
     * Deletes a FinSpace Dataset.
     * </p>
     * 
     * @param deleteDatasetRequest
     *        The request for a DeleteDataset operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataset operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/DeleteDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDatasetRequest, DeleteDatasetResult> asyncHandler);

    /**
     * <p>
     * Deletes a permission group. This action is irreversible.
     * </p>
     * 
     * @param deletePermissionGroupRequest
     * @return A Java Future containing the result of the DeletePermissionGroup operation returned by the service.
     * @sample AWSFinSpaceDataAsync.DeletePermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/DeletePermissionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePermissionGroupResult> deletePermissionGroupAsync(DeletePermissionGroupRequest deletePermissionGroupRequest);

    /**
     * <p>
     * Deletes a permission group. This action is irreversible.
     * </p>
     * 
     * @param deletePermissionGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePermissionGroup operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.DeletePermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/DeletePermissionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePermissionGroupResult> deletePermissionGroupAsync(DeletePermissionGroupRequest deletePermissionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePermissionGroupRequest, DeletePermissionGroupResult> asyncHandler);

    /**
     * <p>
     * Denies access to the FinSpace web application and API for the specified user.
     * </p>
     * 
     * @param disableUserRequest
     * @return A Java Future containing the result of the DisableUser operation returned by the service.
     * @sample AWSFinSpaceDataAsync.DisableUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/DisableUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableUserResult> disableUserAsync(DisableUserRequest disableUserRequest);

    /**
     * <p>
     * Denies access to the FinSpace web application and API for the specified user.
     * </p>
     * 
     * @param disableUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableUser operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.DisableUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/DisableUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableUserResult> disableUserAsync(DisableUserRequest disableUserRequest,
            com.amazonaws.handlers.AsyncHandler<DisableUserRequest, DisableUserResult> asyncHandler);

    /**
     * <p>
     * Removes a user account from a permission group.
     * </p>
     * 
     * @param disassociateUserFromPermissionGroupRequest
     * @return A Java Future containing the result of the DisassociateUserFromPermissionGroup operation returned by the
     *         service.
     * @sample AWSFinSpaceDataAsync.DisassociateUserFromPermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/DisassociateUserFromPermissionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateUserFromPermissionGroupResult> disassociateUserFromPermissionGroupAsync(
            DisassociateUserFromPermissionGroupRequest disassociateUserFromPermissionGroupRequest);

    /**
     * <p>
     * Removes a user account from a permission group.
     * </p>
     * 
     * @param disassociateUserFromPermissionGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateUserFromPermissionGroup operation returned by the
     *         service.
     * @sample AWSFinSpaceDataAsyncHandler.DisassociateUserFromPermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/DisassociateUserFromPermissionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateUserFromPermissionGroupResult> disassociateUserFromPermissionGroupAsync(
            DisassociateUserFromPermissionGroupRequest disassociateUserFromPermissionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateUserFromPermissionGroupRequest, DisassociateUserFromPermissionGroupResult> asyncHandler);

    /**
     * <p>
     * Allows the specified user to access the FinSpace web application and API.
     * </p>
     * 
     * @param enableUserRequest
     * @return A Java Future containing the result of the EnableUser operation returned by the service.
     * @sample AWSFinSpaceDataAsync.EnableUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/EnableUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableUserResult> enableUserAsync(EnableUserRequest enableUserRequest);

    /**
     * <p>
     * Allows the specified user to access the FinSpace web application and API.
     * </p>
     * 
     * @param enableUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableUser operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.EnableUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/EnableUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableUserResult> enableUserAsync(EnableUserRequest enableUserRequest,
            com.amazonaws.handlers.AsyncHandler<EnableUserRequest, EnableUserResult> asyncHandler);

    /**
     * <p>
     * Get information about a Changeset.
     * </p>
     * 
     * @param getChangesetRequest
     *        Request to describe a changeset.
     * @return A Java Future containing the result of the GetChangeset operation returned by the service.
     * @sample AWSFinSpaceDataAsync.GetChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetChangesetResult> getChangesetAsync(GetChangesetRequest getChangesetRequest);

    /**
     * <p>
     * Get information about a Changeset.
     * </p>
     * 
     * @param getChangesetRequest
     *        Request to describe a changeset.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetChangeset operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.GetChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetChangesetResult> getChangesetAsync(GetChangesetRequest getChangesetRequest,
            com.amazonaws.handlers.AsyncHandler<GetChangesetRequest, GetChangesetResult> asyncHandler);

    /**
     * <p>
     * Gets information about a Dataview.
     * </p>
     * 
     * @param getDataViewRequest
     *        Request for retrieving a data view detail. Grouped / accessible within a dataset by its dataset id.
     * @return A Java Future containing the result of the GetDataView operation returned by the service.
     * @sample AWSFinSpaceDataAsync.GetDataView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetDataView" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDataViewResult> getDataViewAsync(GetDataViewRequest getDataViewRequest);

    /**
     * <p>
     * Gets information about a Dataview.
     * </p>
     * 
     * @param getDataViewRequest
     *        Request for retrieving a data view detail. Grouped / accessible within a dataset by its dataset id.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataView operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.GetDataView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetDataView" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDataViewResult> getDataViewAsync(GetDataViewRequest getDataViewRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataViewRequest, GetDataViewResult> asyncHandler);

    /**
     * <p>
     * Returns information about a Dataset.
     * </p>
     * 
     * @param getDatasetRequest
     *        Request for the GetDataset operation.
     * @return A Java Future containing the result of the GetDataset operation returned by the service.
     * @sample AWSFinSpaceDataAsync.GetDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDatasetResult> getDatasetAsync(GetDatasetRequest getDatasetRequest);

    /**
     * <p>
     * Returns information about a Dataset.
     * </p>
     * 
     * @param getDatasetRequest
     *        Request for the GetDataset operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataset operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.GetDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDatasetResult> getDatasetAsync(GetDatasetRequest getDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<GetDatasetRequest, GetDatasetResult> asyncHandler);

    /**
     * <p>
     * Returns the credentials to access the external Dataview from an S3 location. To call this API:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must retrieve the programmatic credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must be a member of a FinSpace user group, where the dataset that you want to access has
     * <code>Read Dataset Data</code> permissions.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getExternalDataViewAccessDetailsRequest
     * @return A Java Future containing the result of the GetExternalDataViewAccessDetails operation returned by the
     *         service.
     * @sample AWSFinSpaceDataAsync.GetExternalDataViewAccessDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetExternalDataViewAccessDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetExternalDataViewAccessDetailsResult> getExternalDataViewAccessDetailsAsync(
            GetExternalDataViewAccessDetailsRequest getExternalDataViewAccessDetailsRequest);

    /**
     * <p>
     * Returns the credentials to access the external Dataview from an S3 location. To call this API:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must retrieve the programmatic credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must be a member of a FinSpace user group, where the dataset that you want to access has
     * <code>Read Dataset Data</code> permissions.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getExternalDataViewAccessDetailsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetExternalDataViewAccessDetails operation returned by the
     *         service.
     * @sample AWSFinSpaceDataAsyncHandler.GetExternalDataViewAccessDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetExternalDataViewAccessDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetExternalDataViewAccessDetailsResult> getExternalDataViewAccessDetailsAsync(
            GetExternalDataViewAccessDetailsRequest getExternalDataViewAccessDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<GetExternalDataViewAccessDetailsRequest, GetExternalDataViewAccessDetailsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details of a specific permission group.
     * </p>
     * 
     * @param getPermissionGroupRequest
     * @return A Java Future containing the result of the GetPermissionGroup operation returned by the service.
     * @sample AWSFinSpaceDataAsync.GetPermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetPermissionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPermissionGroupResult> getPermissionGroupAsync(GetPermissionGroupRequest getPermissionGroupRequest);

    /**
     * <p>
     * Retrieves the details of a specific permission group.
     * </p>
     * 
     * @param getPermissionGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPermissionGroup operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.GetPermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetPermissionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPermissionGroupResult> getPermissionGroupAsync(GetPermissionGroupRequest getPermissionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetPermissionGroupRequest, GetPermissionGroupResult> asyncHandler);

    /**
     * <p>
     * Request programmatic credentials to use with FinSpace SDK.
     * </p>
     * 
     * @param getProgrammaticAccessCredentialsRequest
     *        Request for GetProgrammaticAccessCredentials operation
     * @return A Java Future containing the result of the GetProgrammaticAccessCredentials operation returned by the
     *         service.
     * @sample AWSFinSpaceDataAsync.GetProgrammaticAccessCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetProgrammaticAccessCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetProgrammaticAccessCredentialsResult> getProgrammaticAccessCredentialsAsync(
            GetProgrammaticAccessCredentialsRequest getProgrammaticAccessCredentialsRequest);

    /**
     * <p>
     * Request programmatic credentials to use with FinSpace SDK.
     * </p>
     * 
     * @param getProgrammaticAccessCredentialsRequest
     *        Request for GetProgrammaticAccessCredentials operation
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProgrammaticAccessCredentials operation returned by the
     *         service.
     * @sample AWSFinSpaceDataAsyncHandler.GetProgrammaticAccessCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetProgrammaticAccessCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetProgrammaticAccessCredentialsResult> getProgrammaticAccessCredentialsAsync(
            GetProgrammaticAccessCredentialsRequest getProgrammaticAccessCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<GetProgrammaticAccessCredentialsRequest, GetProgrammaticAccessCredentialsResult> asyncHandler);

    /**
     * <p>
     * Retrieves details for a specific user.
     * </p>
     * 
     * @param getUserRequest
     * @return A Java Future containing the result of the GetUser operation returned by the service.
     * @sample AWSFinSpaceDataAsync.GetUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetUserResult> getUserAsync(GetUserRequest getUserRequest);

    /**
     * <p>
     * Retrieves details for a specific user.
     * </p>
     * 
     * @param getUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUser operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.GetUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetUserResult> getUserAsync(GetUserRequest getUserRequest,
            com.amazonaws.handlers.AsyncHandler<GetUserRequest, GetUserResult> asyncHandler);

    /**
     * <p>
     * A temporary Amazon S3 location, where you can copy your files from a source location to stage or use as a scratch
     * space in FinSpace notebook.
     * </p>
     * 
     * @param getWorkingLocationRequest
     * @return A Java Future containing the result of the GetWorkingLocation operation returned by the service.
     * @sample AWSFinSpaceDataAsync.GetWorkingLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetWorkingLocation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetWorkingLocationResult> getWorkingLocationAsync(GetWorkingLocationRequest getWorkingLocationRequest);

    /**
     * <p>
     * A temporary Amazon S3 location, where you can copy your files from a source location to stage or use as a scratch
     * space in FinSpace notebook.
     * </p>
     * 
     * @param getWorkingLocationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWorkingLocation operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.GetWorkingLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetWorkingLocation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetWorkingLocationResult> getWorkingLocationAsync(GetWorkingLocationRequest getWorkingLocationRequest,
            com.amazonaws.handlers.AsyncHandler<GetWorkingLocationRequest, GetWorkingLocationResult> asyncHandler);

    /**
     * <p>
     * Lists the FinSpace Changesets for a Dataset.
     * </p>
     * 
     * @param listChangesetsRequest
     *        Request to ListChangesetsRequest. It exposes minimal query filters.
     * @return A Java Future containing the result of the ListChangesets operation returned by the service.
     * @sample AWSFinSpaceDataAsync.ListChangesets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListChangesets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChangesetsResult> listChangesetsAsync(ListChangesetsRequest listChangesetsRequest);

    /**
     * <p>
     * Lists the FinSpace Changesets for a Dataset.
     * </p>
     * 
     * @param listChangesetsRequest
     *        Request to ListChangesetsRequest. It exposes minimal query filters.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChangesets operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.ListChangesets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListChangesets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChangesetsResult> listChangesetsAsync(ListChangesetsRequest listChangesetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListChangesetsRequest, ListChangesetsResult> asyncHandler);

    /**
     * <p>
     * Lists all available Dataviews for a Dataset.
     * </p>
     * 
     * @param listDataViewsRequest
     *        Request for a list data views.
     * @return A Java Future containing the result of the ListDataViews operation returned by the service.
     * @sample AWSFinSpaceDataAsync.ListDataViews
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListDataViews" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDataViewsResult> listDataViewsAsync(ListDataViewsRequest listDataViewsRequest);

    /**
     * <p>
     * Lists all available Dataviews for a Dataset.
     * </p>
     * 
     * @param listDataViewsRequest
     *        Request for a list data views.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataViews operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.ListDataViews
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListDataViews" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDataViewsResult> listDataViewsAsync(ListDataViewsRequest listDataViewsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataViewsRequest, ListDataViewsResult> asyncHandler);

    /**
     * <p>
     * Lists all of the active Datasets that a user has access to.
     * </p>
     * 
     * @param listDatasetsRequest
     *        Request for the ListDatasets operation.
     * @return A Java Future containing the result of the ListDatasets operation returned by the service.
     * @sample AWSFinSpaceDataAsync.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListDatasets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest listDatasetsRequest);

    /**
     * <p>
     * Lists all of the active Datasets that a user has access to.
     * </p>
     * 
     * @param listDatasetsRequest
     *        Request for the ListDatasets operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDatasets operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListDatasets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest listDatasetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDatasetsRequest, ListDatasetsResult> asyncHandler);

    /**
     * <p>
     * Lists all available permission groups in FinSpace.
     * </p>
     * 
     * @param listPermissionGroupsRequest
     * @return A Java Future containing the result of the ListPermissionGroups operation returned by the service.
     * @sample AWSFinSpaceDataAsync.ListPermissionGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListPermissionGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionGroupsResult> listPermissionGroupsAsync(ListPermissionGroupsRequest listPermissionGroupsRequest);

    /**
     * <p>
     * Lists all available permission groups in FinSpace.
     * </p>
     * 
     * @param listPermissionGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPermissionGroups operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.ListPermissionGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListPermissionGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionGroupsResult> listPermissionGroupsAsync(ListPermissionGroupsRequest listPermissionGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPermissionGroupsRequest, ListPermissionGroupsResult> asyncHandler);

    /**
     * <p>
     * Lists all the permission groups that are associated with a specific user account.
     * </p>
     * 
     * @param listPermissionGroupsByUserRequest
     * @return A Java Future containing the result of the ListPermissionGroupsByUser operation returned by the service.
     * @sample AWSFinSpaceDataAsync.ListPermissionGroupsByUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListPermissionGroupsByUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionGroupsByUserResult> listPermissionGroupsByUserAsync(
            ListPermissionGroupsByUserRequest listPermissionGroupsByUserRequest);

    /**
     * <p>
     * Lists all the permission groups that are associated with a specific user account.
     * </p>
     * 
     * @param listPermissionGroupsByUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPermissionGroupsByUser operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.ListPermissionGroupsByUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListPermissionGroupsByUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionGroupsByUserResult> listPermissionGroupsByUserAsync(
            ListPermissionGroupsByUserRequest listPermissionGroupsByUserRequest,
            com.amazonaws.handlers.AsyncHandler<ListPermissionGroupsByUserRequest, ListPermissionGroupsByUserResult> asyncHandler);

    /**
     * <p>
     * Lists all available user accounts in FinSpace.
     * </p>
     * 
     * @param listUsersRequest
     * @return A Java Future containing the result of the ListUsers operation returned by the service.
     * @sample AWSFinSpaceDataAsync.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest);

    /**
     * <p>
     * Lists all available user accounts in FinSpace.
     * </p>
     * 
     * @param listUsersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUsers operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest,
            com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler);

    /**
     * <p>
     * Lists details of all the users in a specific permission group.
     * </p>
     * 
     * @param listUsersByPermissionGroupRequest
     * @return A Java Future containing the result of the ListUsersByPermissionGroup operation returned by the service.
     * @sample AWSFinSpaceDataAsync.ListUsersByPermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListUsersByPermissionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListUsersByPermissionGroupResult> listUsersByPermissionGroupAsync(
            ListUsersByPermissionGroupRequest listUsersByPermissionGroupRequest);

    /**
     * <p>
     * Lists details of all the users in a specific permission group.
     * </p>
     * 
     * @param listUsersByPermissionGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUsersByPermissionGroup operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.ListUsersByPermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListUsersByPermissionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListUsersByPermissionGroupResult> listUsersByPermissionGroupAsync(
            ListUsersByPermissionGroupRequest listUsersByPermissionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ListUsersByPermissionGroupRequest, ListUsersByPermissionGroupResult> asyncHandler);

    /**
     * <p>
     * Resets the password for a specified user ID and generates a temporary one. Only a superuser can reset password
     * for other users. Resetting the password immediately invalidates the previous password associated with the user.
     * </p>
     * 
     * @param resetUserPasswordRequest
     * @return A Java Future containing the result of the ResetUserPassword operation returned by the service.
     * @sample AWSFinSpaceDataAsync.ResetUserPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ResetUserPassword" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResetUserPasswordResult> resetUserPasswordAsync(ResetUserPasswordRequest resetUserPasswordRequest);

    /**
     * <p>
     * Resets the password for a specified user ID and generates a temporary one. Only a superuser can reset password
     * for other users. Resetting the password immediately invalidates the previous password associated with the user.
     * </p>
     * 
     * @param resetUserPasswordRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResetUserPassword operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.ResetUserPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ResetUserPassword" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResetUserPasswordResult> resetUserPasswordAsync(ResetUserPasswordRequest resetUserPasswordRequest,
            com.amazonaws.handlers.AsyncHandler<ResetUserPasswordRequest, ResetUserPasswordResult> asyncHandler);

    /**
     * <p>
     * Updates a FinSpace Changeset.
     * </p>
     * 
     * @param updateChangesetRequest
     *        Request to update an existing changeset.
     * @return A Java Future containing the result of the UpdateChangeset operation returned by the service.
     * @sample AWSFinSpaceDataAsync.UpdateChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/UpdateChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateChangesetResult> updateChangesetAsync(UpdateChangesetRequest updateChangesetRequest);

    /**
     * <p>
     * Updates a FinSpace Changeset.
     * </p>
     * 
     * @param updateChangesetRequest
     *        Request to update an existing changeset.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateChangeset operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.UpdateChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/UpdateChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateChangesetResult> updateChangesetAsync(UpdateChangesetRequest updateChangesetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateChangesetRequest, UpdateChangesetResult> asyncHandler);

    /**
     * <p>
     * Updates a FinSpace Dataset.
     * </p>
     * 
     * @param updateDatasetRequest
     *        The request for an UpdateDataset operation
     * @return A Java Future containing the result of the UpdateDataset operation returned by the service.
     * @sample AWSFinSpaceDataAsync.UpdateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/UpdateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatasetResult> updateDatasetAsync(UpdateDatasetRequest updateDatasetRequest);

    /**
     * <p>
     * Updates a FinSpace Dataset.
     * </p>
     * 
     * @param updateDatasetRequest
     *        The request for an UpdateDataset operation
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDataset operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.UpdateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/UpdateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatasetResult> updateDatasetAsync(UpdateDatasetRequest updateDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDatasetRequest, UpdateDatasetResult> asyncHandler);

    /**
     * <p>
     * Modifies the details of a permission group. You cannot modify a <code>permissionGroupID</code>.
     * </p>
     * 
     * @param updatePermissionGroupRequest
     * @return A Java Future containing the result of the UpdatePermissionGroup operation returned by the service.
     * @sample AWSFinSpaceDataAsync.UpdatePermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/UpdatePermissionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePermissionGroupResult> updatePermissionGroupAsync(UpdatePermissionGroupRequest updatePermissionGroupRequest);

    /**
     * <p>
     * Modifies the details of a permission group. You cannot modify a <code>permissionGroupID</code>.
     * </p>
     * 
     * @param updatePermissionGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePermissionGroup operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.UpdatePermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/UpdatePermissionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePermissionGroupResult> updatePermissionGroupAsync(UpdatePermissionGroupRequest updatePermissionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePermissionGroupRequest, UpdatePermissionGroupResult> asyncHandler);

    /**
     * <p>
     * Modifies the details of the specified user account. You cannot update the <code>userId</code> for a user.
     * </p>
     * 
     * @param updateUserRequest
     * @return A Java Future containing the result of the UpdateUser operation returned by the service.
     * @sample AWSFinSpaceDataAsync.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest updateUserRequest);

    /**
     * <p>
     * Modifies the details of the specified user account. You cannot update the <code>userId</code> for a user.
     * </p>
     * 
     * @param updateUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUser operation returned by the service.
     * @sample AWSFinSpaceDataAsyncHandler.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest updateUserRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserRequest, UpdateUserResult> asyncHandler);

}
