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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.finspacedata.model.*;

/**
 * Interface for accessing FinSpace Data.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.finspacedata.AbstractAWSFinSpaceData} instead.
 * </p>
 * <p>
 * <p>
 * The FinSpace APIs let you take actions inside the FinSpace.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSFinSpaceData {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "finspace-api";

    /**
     * <p>
     * Adds a user account to a permission group to grant permissions for actions a user can perform in FinSpace.
     * </p>
     * 
     * @param associateUserToPermissionGroupRequest
     * @return Result of the AssociateUserToPermissionGroup operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.AssociateUserToPermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/AssociateUserToPermissionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateUserToPermissionGroupResult associateUserToPermissionGroup(AssociateUserToPermissionGroupRequest associateUserToPermissionGroupRequest);

    /**
     * <p>
     * Creates a new Changeset in a FinSpace Dataset.
     * </p>
     * 
     * @param createChangesetRequest
     *        The request for a CreateChangeset operation.
     * @return Result of the CreateChangeset operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws LimitExceededException
     *         A limit has exceeded.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.CreateChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    CreateChangesetResult createChangeset(CreateChangesetRequest createChangesetRequest);

    /**
     * <p>
     * Creates a Dataview for a Dataset.
     * </p>
     * 
     * @param createDataViewRequest
     *        Request for creating a data view.
     * @return Result of the CreateDataView operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws LimitExceededException
     *         A limit has exceeded.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSFinSpaceData.CreateDataView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateDataView" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDataViewResult createDataView(CreateDataViewRequest createDataViewRequest);

    /**
     * <p>
     * Creates a new FinSpace Dataset.
     * </p>
     * 
     * @param createDatasetRequest
     *        The request for a CreateDataset operation
     * @return Result of the CreateDataset operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws LimitExceededException
     *         A limit has exceeded.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSFinSpaceData.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDatasetResult createDataset(CreateDatasetRequest createDatasetRequest);

    /**
     * <p>
     * Creates a group of permissions for various actions that a user can perform in FinSpace.
     * </p>
     * 
     * @param createPermissionGroupRequest
     * @return Result of the CreatePermissionGroup operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws LimitExceededException
     *         A limit has exceeded.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.CreatePermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreatePermissionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    CreatePermissionGroupResult createPermissionGroup(CreatePermissionGroupRequest createPermissionGroupRequest);

    /**
     * <p>
     * Creates a new user in FinSpace.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws LimitExceededException
     *         A limit has exceeded.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    CreateUserResult createUser(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Deletes a FinSpace Dataset.
     * </p>
     * 
     * @param deleteDatasetRequest
     *        The request for a DeleteDataset operation.
     * @return Result of the DeleteDataset operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws LimitExceededException
     *         A limit has exceeded.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/DeleteDataset" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDatasetResult deleteDataset(DeleteDatasetRequest deleteDatasetRequest);

    /**
     * <p>
     * Deletes a permission group. This action is irreversible.
     * </p>
     * 
     * @param deletePermissionGroupRequest
     * @return Result of the DeletePermissionGroup operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws LimitExceededException
     *         A limit has exceeded.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.DeletePermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/DeletePermissionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    DeletePermissionGroupResult deletePermissionGroup(DeletePermissionGroupRequest deletePermissionGroupRequest);

    /**
     * <p>
     * Denies access to the FinSpace web application and API for the specified user.
     * </p>
     * 
     * @param disableUserRequest
     * @return Result of the DisableUser operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.DisableUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/DisableUser" target="_top">AWS API
     *      Documentation</a>
     */
    DisableUserResult disableUser(DisableUserRequest disableUserRequest);

    /**
     * <p>
     * Removes a user account from a permission group.
     * </p>
     * 
     * @param disassociateUserFromPermissionGroupRequest
     * @return Result of the DisassociateUserFromPermissionGroup operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.DisassociateUserFromPermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/DisassociateUserFromPermissionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateUserFromPermissionGroupResult disassociateUserFromPermissionGroup(
            DisassociateUserFromPermissionGroupRequest disassociateUserFromPermissionGroupRequest);

    /**
     * <p>
     * Allows the specified user to access the FinSpace web application and API.
     * </p>
     * 
     * @param enableUserRequest
     * @return Result of the EnableUser operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws LimitExceededException
     *         A limit has exceeded.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.EnableUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/EnableUser" target="_top">AWS API
     *      Documentation</a>
     */
    EnableUserResult enableUser(EnableUserRequest enableUserRequest);

    /**
     * <p>
     * Get information about a Changeset.
     * </p>
     * 
     * @param getChangesetRequest
     *        Request to describe a changeset.
     * @return Result of the GetChangeset operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.GetChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    GetChangesetResult getChangeset(GetChangesetRequest getChangesetRequest);

    /**
     * <p>
     * Gets information about a Dataview.
     * </p>
     * 
     * @param getDataViewRequest
     *        Request for retrieving a data view detail. Grouped / accessible within a dataset by its dataset id.
     * @return Result of the GetDataView operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.GetDataView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetDataView" target="_top">AWS API
     *      Documentation</a>
     */
    GetDataViewResult getDataView(GetDataViewRequest getDataViewRequest);

    /**
     * <p>
     * Returns information about a Dataset.
     * </p>
     * 
     * @param getDatasetRequest
     *        Request for the GetDataset operation.
     * @return Result of the GetDataset operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.GetDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetDataset" target="_top">AWS API
     *      Documentation</a>
     */
    GetDatasetResult getDataset(GetDatasetRequest getDatasetRequest);

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
     * @return Result of the GetExternalDataViewAccessDetails operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSFinSpaceData.GetExternalDataViewAccessDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetExternalDataViewAccessDetails"
     *      target="_top">AWS API Documentation</a>
     */
    GetExternalDataViewAccessDetailsResult getExternalDataViewAccessDetails(GetExternalDataViewAccessDetailsRequest getExternalDataViewAccessDetailsRequest);

    /**
     * <p>
     * Retrieves the details of a specific permission group.
     * </p>
     * 
     * @param getPermissionGroupRequest
     * @return Result of the GetPermissionGroup operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSFinSpaceData.GetPermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetPermissionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    GetPermissionGroupResult getPermissionGroup(GetPermissionGroupRequest getPermissionGroupRequest);

    /**
     * <p>
     * Request programmatic credentials to use with FinSpace SDK.
     * </p>
     * 
     * @param getProgrammaticAccessCredentialsRequest
     *        Request for GetProgrammaticAccessCredentials operation
     * @return Result of the GetProgrammaticAccessCredentials operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSFinSpaceData.GetProgrammaticAccessCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetProgrammaticAccessCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    GetProgrammaticAccessCredentialsResult getProgrammaticAccessCredentials(GetProgrammaticAccessCredentialsRequest getProgrammaticAccessCredentialsRequest);

    /**
     * <p>
     * Retrieves details for a specific user.
     * </p>
     * 
     * @param getUserRequest
     * @return Result of the GetUser operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSFinSpaceData.GetUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetUser" target="_top">AWS API
     *      Documentation</a>
     */
    GetUserResult getUser(GetUserRequest getUserRequest);

    /**
     * <p>
     * A temporary Amazon S3 location, where you can copy your files from a source location to stage or use as a scratch
     * space in FinSpace notebook.
     * </p>
     * 
     * @param getWorkingLocationRequest
     * @return Result of the GetWorkingLocation operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSFinSpaceData.GetWorkingLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetWorkingLocation" target="_top">AWS
     *      API Documentation</a>
     */
    GetWorkingLocationResult getWorkingLocation(GetWorkingLocationRequest getWorkingLocationRequest);

    /**
     * <p>
     * Lists the FinSpace Changesets for a Dataset.
     * </p>
     * 
     * @param listChangesetsRequest
     *        Request to ListChangesetsRequest. It exposes minimal query filters.
     * @return Result of the ListChangesets operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.ListChangesets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListChangesets" target="_top">AWS API
     *      Documentation</a>
     */
    ListChangesetsResult listChangesets(ListChangesetsRequest listChangesetsRequest);

    /**
     * <p>
     * Lists all available Dataviews for a Dataset.
     * </p>
     * 
     * @param listDataViewsRequest
     *        Request for a list data views.
     * @return Result of the ListDataViews operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.ListDataViews
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListDataViews" target="_top">AWS API
     *      Documentation</a>
     */
    ListDataViewsResult listDataViews(ListDataViewsRequest listDataViewsRequest);

    /**
     * <p>
     * Lists all of the active Datasets that a user has access to.
     * </p>
     * 
     * @param listDatasetsRequest
     *        Request for the ListDatasets operation.
     * @return Result of the ListDatasets operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSFinSpaceData.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListDatasets" target="_top">AWS API
     *      Documentation</a>
     */
    ListDatasetsResult listDatasets(ListDatasetsRequest listDatasetsRequest);

    /**
     * <p>
     * Lists all available permission groups in FinSpace.
     * </p>
     * 
     * @param listPermissionGroupsRequest
     * @return Result of the ListPermissionGroups operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSFinSpaceData.ListPermissionGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListPermissionGroups" target="_top">AWS
     *      API Documentation</a>
     */
    ListPermissionGroupsResult listPermissionGroups(ListPermissionGroupsRequest listPermissionGroupsRequest);

    /**
     * <p>
     * Lists all the permission groups that are associated with a specific user account.
     * </p>
     * 
     * @param listPermissionGroupsByUserRequest
     * @return Result of the ListPermissionGroupsByUser operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSFinSpaceData.ListPermissionGroupsByUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListPermissionGroupsByUser"
     *      target="_top">AWS API Documentation</a>
     */
    ListPermissionGroupsByUserResult listPermissionGroupsByUser(ListPermissionGroupsByUserRequest listPermissionGroupsByUserRequest);

    /**
     * <p>
     * Lists all available user accounts in FinSpace.
     * </p>
     * 
     * @param listUsersRequest
     * @return Result of the ListUsers operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSFinSpaceData.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    ListUsersResult listUsers(ListUsersRequest listUsersRequest);

    /**
     * <p>
     * Lists details of all the users in a specific permission group.
     * </p>
     * 
     * @param listUsersByPermissionGroupRequest
     * @return Result of the ListUsersByPermissionGroup operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSFinSpaceData.ListUsersByPermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListUsersByPermissionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    ListUsersByPermissionGroupResult listUsersByPermissionGroup(ListUsersByPermissionGroupRequest listUsersByPermissionGroupRequest);

    /**
     * <p>
     * Resets the password for a specified user ID and generates a temporary one. Only a superuser can reset password
     * for other users. Resetting the password immediately invalidates the previous password associated with the user.
     * </p>
     * 
     * @param resetUserPasswordRequest
     * @return Result of the ResetUserPassword operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.ResetUserPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ResetUserPassword" target="_top">AWS API
     *      Documentation</a>
     */
    ResetUserPasswordResult resetUserPassword(ResetUserPasswordRequest resetUserPasswordRequest);

    /**
     * <p>
     * Updates a FinSpace Changeset.
     * </p>
     * 
     * @param updateChangesetRequest
     *        Request to update an existing changeset.
     * @return Result of the UpdateChangeset operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.UpdateChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/UpdateChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateChangesetResult updateChangeset(UpdateChangesetRequest updateChangesetRequest);

    /**
     * <p>
     * Updates a FinSpace Dataset.
     * </p>
     * 
     * @param updateDatasetRequest
     *        The request for an UpdateDataset operation
     * @return Result of the UpdateDataset operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSFinSpaceData.UpdateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/UpdateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateDatasetResult updateDataset(UpdateDatasetRequest updateDatasetRequest);

    /**
     * <p>
     * Modifies the details of a permission group. You cannot modify a <code>permissionGroupID</code>.
     * </p>
     * 
     * @param updatePermissionGroupRequest
     * @return Result of the UpdatePermissionGroup operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.UpdatePermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/UpdatePermissionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    UpdatePermissionGroupResult updatePermissionGroup(UpdatePermissionGroupRequest updatePermissionGroupRequest);

    /**
     * <p>
     * Modifies the details of the specified user account. You cannot update the <code>userId</code> for a user.
     * </p>
     * 
     * @param updateUserRequest
     * @return Result of the UpdateUser operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateUserResult updateUser(UpdateUserRequest updateUserRequest);

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
