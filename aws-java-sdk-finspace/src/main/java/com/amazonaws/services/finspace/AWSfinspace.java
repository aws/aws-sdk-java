/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.finspace;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.finspace.model.*;

/**
 * Interface for accessing finspace.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.finspace.AbstractAWSfinspace} instead.
 * </p>
 * <p>
 * <p>
 * The FinSpace management service provides the APIs for managing FinSpace environments.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSfinspace {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "finspace";

    /**
     * <p>
     * Create a new FinSpace environment.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @return Result of the CreateEnvironment operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use Service Quotas to request a service quota increase.
     * @throws LimitExceededException
     *         A service limit or quota is exceeded.
     * @sample AWSfinspace.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    CreateEnvironmentResult createEnvironment(CreateEnvironmentRequest createEnvironmentRequest);

    /**
     * <p>
     * Creates a changeset for a kdb database. A changeset allows you to add and delete existing files by using an
     * ordered list of change requests.
     * </p>
     * 
     * @param createKxChangesetRequest
     * @return Result of the CreateKxChangeset operation returned by the service.
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
     *         There was a conflict with this action, and it could not be completed.
     * @throws LimitExceededException
     *         A service limit or quota is exceeded.
     * @sample AWSfinspace.CreateKxChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    CreateKxChangesetResult createKxChangeset(CreateKxChangesetRequest createKxChangesetRequest);

    /**
     * <p>
     * Creates a new kdb cluster.
     * </p>
     * 
     * @param createKxClusterRequest
     * @return Result of the CreateKxCluster operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws LimitExceededException
     *         A service limit or quota is exceeded.
     * @throws ConflictException
     *         There was a conflict with this action, and it could not be completed.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSfinspace.CreateKxCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxCluster" target="_top">AWS API
     *      Documentation</a>
     */
    CreateKxClusterResult createKxCluster(CreateKxClusterRequest createKxClusterRequest);

    /**
     * <p>
     * Creates a new kdb database in the environment.
     * </p>
     * 
     * @param createKxDatabaseRequest
     * @return Result of the CreateKxDatabase operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         There was a conflict with this action, and it could not be completed.
     * @throws ResourceAlreadyExistsException
     *         The specified resource group already exists.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws LimitExceededException
     *         A service limit or quota is exceeded.
     * @sample AWSfinspace.CreateKxDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    CreateKxDatabaseResult createKxDatabase(CreateKxDatabaseRequest createKxDatabaseRequest);

    /**
     * <p>
     * Creates a snapshot of kdb database with tiered storage capabilities and a pre-warmed cache, ready for mounting on
     * kdb clusters. Dataviews are only available for clusters running on a scaling group. They are not supported on
     * dedicated clusters.
     * </p>
     * 
     * @param createKxDataviewRequest
     * @return Result of the CreateKxDataview operation returned by the service.
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
     *         There was a conflict with this action, and it could not be completed.
     * @throws LimitExceededException
     *         A service limit or quota is exceeded.
     * @throws ResourceAlreadyExistsException
     *         The specified resource group already exists.
     * @sample AWSfinspace.CreateKxDataview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxDataview" target="_top">AWS API
     *      Documentation</a>
     */
    CreateKxDataviewResult createKxDataview(CreateKxDataviewRequest createKxDataviewRequest);

    /**
     * <p>
     * Creates a managed kdb environment for the account.
     * </p>
     * 
     * @param createKxEnvironmentRequest
     * @return Result of the CreateKxEnvironment operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use Service Quotas to request a service quota increase.
     * @throws LimitExceededException
     *         A service limit or quota is exceeded.
     * @throws ConflictException
     *         There was a conflict with this action, and it could not be completed.
     * @sample AWSfinspace.CreateKxEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    CreateKxEnvironmentResult createKxEnvironment(CreateKxEnvironmentRequest createKxEnvironmentRequest);

    /**
     * <p>
     * Creates a new scaling group.
     * </p>
     * 
     * @param createKxScalingGroupRequest
     * @return Result of the CreateKxScalingGroup operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws LimitExceededException
     *         A service limit or quota is exceeded.
     * @throws ConflictException
     *         There was a conflict with this action, and it could not be completed.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSfinspace.CreateKxScalingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxScalingGroup" target="_top">AWS
     *      API Documentation</a>
     */
    CreateKxScalingGroupResult createKxScalingGroup(CreateKxScalingGroupRequest createKxScalingGroupRequest);

    /**
     * <p>
     * Creates a user in FinSpace kdb environment with an associated IAM role.
     * </p>
     * 
     * @param createKxUserRequest
     * @return Result of the CreateKxUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceAlreadyExistsException
     *         The specified resource group already exists.
     * @throws LimitExceededException
     *         A service limit or quota is exceeded.
     * @throws ConflictException
     *         There was a conflict with this action, and it could not be completed.
     * @sample AWSfinspace.CreateKxUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxUser" target="_top">AWS API
     *      Documentation</a>
     */
    CreateKxUserResult createKxUser(CreateKxUserRequest createKxUserRequest);

    /**
     * <p>
     * Creates a new volume with a specific amount of throughput and storage capacity.
     * </p>
     * 
     * @param createKxVolumeRequest
     * @return Result of the CreateKxVolume operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws LimitExceededException
     *         A service limit or quota is exceeded.
     * @throws ConflictException
     *         There was a conflict with this action, and it could not be completed.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ResourceAlreadyExistsException
     *         The specified resource group already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSfinspace.CreateKxVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxVolume" target="_top">AWS API
     *      Documentation</a>
     */
    CreateKxVolumeResult createKxVolume(CreateKxVolumeRequest createKxVolumeRequest);

    /**
     * <p>
     * Delete an FinSpace environment.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @return Result of the DeleteEnvironment operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSfinspace.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/DeleteEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    DeleteEnvironmentResult deleteEnvironment(DeleteEnvironmentRequest deleteEnvironmentRequest);

    /**
     * <p>
     * Deletes a kdb cluster.
     * </p>
     * 
     * @param deleteKxClusterRequest
     * @return Result of the DeleteKxCluster operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws LimitExceededException
     *         A service limit or quota is exceeded.
     * @throws ConflictException
     *         There was a conflict with this action, and it could not be completed.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSfinspace.DeleteKxCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/DeleteKxCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteKxClusterResult deleteKxCluster(DeleteKxClusterRequest deleteKxClusterRequest);

    /**
     * <p>
     * Deletes the specified nodes from a cluster.
     * </p>
     * 
     * @param deleteKxClusterNodeRequest
     * @return Result of the DeleteKxClusterNode operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSfinspace.DeleteKxClusterNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/DeleteKxClusterNode" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteKxClusterNodeResult deleteKxClusterNode(DeleteKxClusterNodeRequest deleteKxClusterNodeRequest);

    /**
     * <p>
     * Deletes the specified database and all of its associated data. This action is irreversible. You must copy any
     * data out of the database before deleting it if the data is to be retained.
     * </p>
     * 
     * @param deleteKxDatabaseRequest
     * @return Result of the DeleteKxDatabase operation returned by the service.
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
     *         There was a conflict with this action, and it could not be completed.
     * @sample AWSfinspace.DeleteKxDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/DeleteKxDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteKxDatabaseResult deleteKxDatabase(DeleteKxDatabaseRequest deleteKxDatabaseRequest);

    /**
     * <p>
     * Deletes the specified dataview. Before deleting a dataview, make sure that it is not in use by any cluster.
     * </p>
     * 
     * @param deleteKxDataviewRequest
     * @return Result of the DeleteKxDataview operation returned by the service.
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
     *         There was a conflict with this action, and it could not be completed.
     * @sample AWSfinspace.DeleteKxDataview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/DeleteKxDataview" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteKxDataviewResult deleteKxDataview(DeleteKxDataviewRequest deleteKxDataviewRequest);

    /**
     * <p>
     * Deletes the kdb environment. This action is irreversible. Deleting a kdb environment will remove all the
     * associated data and any services running in it.
     * </p>
     * 
     * @param deleteKxEnvironmentRequest
     * @return Result of the DeleteKxEnvironment operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         There was a conflict with this action, and it could not be completed.
     * @sample AWSfinspace.DeleteKxEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/DeleteKxEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteKxEnvironmentResult deleteKxEnvironment(DeleteKxEnvironmentRequest deleteKxEnvironmentRequest);

    /**
     * <p>
     * Deletes the specified scaling group. This action is irreversible. You cannot delete a scaling group until all the
     * clusters running on it have been deleted.
     * </p>
     * 
     * @param deleteKxScalingGroupRequest
     * @return Result of the DeleteKxScalingGroup operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws LimitExceededException
     *         A service limit or quota is exceeded.
     * @throws ConflictException
     *         There was a conflict with this action, and it could not be completed.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSfinspace.DeleteKxScalingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/DeleteKxScalingGroup" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteKxScalingGroupResult deleteKxScalingGroup(DeleteKxScalingGroupRequest deleteKxScalingGroupRequest);

    /**
     * <p>
     * Deletes a user in the specified kdb environment.
     * </p>
     * 
     * @param deleteKxUserRequest
     * @return Result of the DeleteKxUser operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         There was a conflict with this action, and it could not be completed.
     * @sample AWSfinspace.DeleteKxUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/DeleteKxUser" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteKxUserResult deleteKxUser(DeleteKxUserRequest deleteKxUserRequest);

    /**
     * <p>
     * Deletes a volume. You can only delete a volume if it's not attached to a cluster or a dataview. When a volume is
     * deleted, any data on the volume is lost. This action is irreversible.
     * </p>
     * 
     * @param deleteKxVolumeRequest
     * @return Result of the DeleteKxVolume operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws LimitExceededException
     *         A service limit or quota is exceeded.
     * @throws ConflictException
     *         There was a conflict with this action, and it could not be completed.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSfinspace.DeleteKxVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/DeleteKxVolume" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteKxVolumeResult deleteKxVolume(DeleteKxVolumeRequest deleteKxVolumeRequest);

    /**
     * <p>
     * Returns the FinSpace environment object.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @return Result of the GetEnvironment operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSfinspace.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    GetEnvironmentResult getEnvironment(GetEnvironmentRequest getEnvironmentRequest);

    /**
     * <p>
     * Returns information about a kdb changeset.
     * </p>
     * 
     * @param getKxChangesetRequest
     * @return Result of the GetKxChangeset operation returned by the service.
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
     * @sample AWSfinspace.GetKxChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetKxChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    GetKxChangesetResult getKxChangeset(GetKxChangesetRequest getKxChangesetRequest);

    /**
     * <p>
     * Retrieves information about a kdb cluster.
     * </p>
     * 
     * @param getKxClusterRequest
     * @return Result of the GetKxCluster operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws LimitExceededException
     *         A service limit or quota is exceeded.
     * @throws ConflictException
     *         There was a conflict with this action, and it could not be completed.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSfinspace.GetKxCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetKxCluster" target="_top">AWS API
     *      Documentation</a>
     */
    GetKxClusterResult getKxCluster(GetKxClusterRequest getKxClusterRequest);

    /**
     * <p>
     * Retrieves a connection string for a user to connect to a kdb cluster. You must call this API using the same role
     * that you have defined while creating a user.
     * </p>
     * 
     * @param getKxConnectionStringRequest
     * @return Result of the GetKxConnectionString operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSfinspace.GetKxConnectionString
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetKxConnectionString" target="_top">AWS
     *      API Documentation</a>
     */
    GetKxConnectionStringResult getKxConnectionString(GetKxConnectionStringRequest getKxConnectionStringRequest);

    /**
     * <p>
     * Returns database information for the specified environment ID.
     * </p>
     * 
     * @param getKxDatabaseRequest
     * @return Result of the GetKxDatabase operation returned by the service.
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
     * @sample AWSfinspace.GetKxDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetKxDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    GetKxDatabaseResult getKxDatabase(GetKxDatabaseRequest getKxDatabaseRequest);

    /**
     * <p>
     * Retrieves details of the dataview.
     * </p>
     * 
     * @param getKxDataviewRequest
     * @return Result of the GetKxDataview operation returned by the service.
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
     * @sample AWSfinspace.GetKxDataview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetKxDataview" target="_top">AWS API
     *      Documentation</a>
     */
    GetKxDataviewResult getKxDataview(GetKxDataviewRequest getKxDataviewRequest);

    /**
     * <p>
     * Retrieves all the information for the specified kdb environment.
     * </p>
     * 
     * @param getKxEnvironmentRequest
     * @return Result of the GetKxEnvironment operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         There was a conflict with this action, and it could not be completed.
     * @sample AWSfinspace.GetKxEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetKxEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    GetKxEnvironmentResult getKxEnvironment(GetKxEnvironmentRequest getKxEnvironmentRequest);

    /**
     * <p>
     * Retrieves details of a scaling group.
     * </p>
     * 
     * @param getKxScalingGroupRequest
     * @return Result of the GetKxScalingGroup operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws LimitExceededException
     *         A service limit or quota is exceeded.
     * @throws ConflictException
     *         There was a conflict with this action, and it could not be completed.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSfinspace.GetKxScalingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetKxScalingGroup" target="_top">AWS API
     *      Documentation</a>
     */
    GetKxScalingGroupResult getKxScalingGroup(GetKxScalingGroupRequest getKxScalingGroupRequest);

    /**
     * <p>
     * Retrieves information about the specified kdb user.
     * </p>
     * 
     * @param getKxUserRequest
     * @return Result of the GetKxUser operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSfinspace.GetKxUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetKxUser" target="_top">AWS API
     *      Documentation</a>
     */
    GetKxUserResult getKxUser(GetKxUserRequest getKxUserRequest);

    /**
     * <p>
     * Retrieves the information about the volume.
     * </p>
     * 
     * @param getKxVolumeRequest
     * @return Result of the GetKxVolume operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws LimitExceededException
     *         A service limit or quota is exceeded.
     * @throws ConflictException
     *         There was a conflict with this action, and it could not be completed.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSfinspace.GetKxVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetKxVolume" target="_top">AWS API
     *      Documentation</a>
     */
    GetKxVolumeResult getKxVolume(GetKxVolumeRequest getKxVolumeRequest);

    /**
     * <p>
     * A list of all of your FinSpace environments.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return Result of the ListEnvironments operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSfinspace.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    ListEnvironmentsResult listEnvironments(ListEnvironmentsRequest listEnvironmentsRequest);

    /**
     * <p>
     * Returns a list of all the changesets for a database.
     * </p>
     * 
     * @param listKxChangesetsRequest
     * @return Result of the ListKxChangesets operation returned by the service.
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
     * @sample AWSfinspace.ListKxChangesets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxChangesets" target="_top">AWS API
     *      Documentation</a>
     */
    ListKxChangesetsResult listKxChangesets(ListKxChangesetsRequest listKxChangesetsRequest);

    /**
     * <p>
     * Lists all the nodes in a kdb cluster.
     * </p>
     * 
     * @param listKxClusterNodesRequest
     * @return Result of the ListKxClusterNodes operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws LimitExceededException
     *         A service limit or quota is exceeded.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSfinspace.ListKxClusterNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxClusterNodes" target="_top">AWS
     *      API Documentation</a>
     */
    ListKxClusterNodesResult listKxClusterNodes(ListKxClusterNodesRequest listKxClusterNodesRequest);

    /**
     * <p>
     * Returns a list of clusters.
     * </p>
     * 
     * @param listKxClustersRequest
     * @return Result of the ListKxClusters operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws LimitExceededException
     *         A service limit or quota is exceeded.
     * @throws ConflictException
     *         There was a conflict with this action, and it could not be completed.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSfinspace.ListKxClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxClusters" target="_top">AWS API
     *      Documentation</a>
     */
    ListKxClustersResult listKxClusters(ListKxClustersRequest listKxClustersRequest);

    /**
     * <p>
     * Returns a list of all the databases in the kdb environment.
     * </p>
     * 
     * @param listKxDatabasesRequest
     * @return Result of the ListKxDatabases operation returned by the service.
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
     * @sample AWSfinspace.ListKxDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxDatabases" target="_top">AWS API
     *      Documentation</a>
     */
    ListKxDatabasesResult listKxDatabases(ListKxDatabasesRequest listKxDatabasesRequest);

    /**
     * <p>
     * Returns a list of all the dataviews in the database.
     * </p>
     * 
     * @param listKxDataviewsRequest
     * @return Result of the ListKxDataviews operation returned by the service.
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
     * @sample AWSfinspace.ListKxDataviews
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxDataviews" target="_top">AWS API
     *      Documentation</a>
     */
    ListKxDataviewsResult listKxDataviews(ListKxDataviewsRequest listKxDataviewsRequest);

    /**
     * <p>
     * Returns a list of kdb environments created in an account.
     * </p>
     * 
     * @param listKxEnvironmentsRequest
     * @return Result of the ListKxEnvironments operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSfinspace.ListKxEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxEnvironments" target="_top">AWS
     *      API Documentation</a>
     */
    ListKxEnvironmentsResult listKxEnvironments(ListKxEnvironmentsRequest listKxEnvironmentsRequest);

    /**
     * <p>
     * Returns a list of scaling groups in a kdb environment.
     * </p>
     * 
     * @param listKxScalingGroupsRequest
     * @return Result of the ListKxScalingGroups operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws LimitExceededException
     *         A service limit or quota is exceeded.
     * @throws ConflictException
     *         There was a conflict with this action, and it could not be completed.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSfinspace.ListKxScalingGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxScalingGroups" target="_top">AWS
     *      API Documentation</a>
     */
    ListKxScalingGroupsResult listKxScalingGroups(ListKxScalingGroupsRequest listKxScalingGroupsRequest);

    /**
     * <p>
     * Lists all the users in a kdb environment.
     * </p>
     * 
     * @param listKxUsersRequest
     * @return Result of the ListKxUsers operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSfinspace.ListKxUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxUsers" target="_top">AWS API
     *      Documentation</a>
     */
    ListKxUsersResult listKxUsers(ListKxUsersRequest listKxUsersRequest);

    /**
     * <p>
     * Lists all the volumes in a kdb environment.
     * </p>
     * 
     * @param listKxVolumesRequest
     * @return Result of the ListKxVolumes operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws LimitExceededException
     *         A service limit or quota is exceeded.
     * @throws ConflictException
     *         There was a conflict with this action, and it could not be completed.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSfinspace.ListKxVolumes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxVolumes" target="_top">AWS API
     *      Documentation</a>
     */
    ListKxVolumesResult listKxVolumes(ListKxVolumesRequest listKxVolumesRequest);

    /**
     * <p>
     * A list of all tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws InvalidRequestException
     *         The request is invalid. Something is wrong with the input to the request.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSfinspace.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Adds metadata tags to a FinSpace resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws InvalidRequestException
     *         The request is invalid. Something is wrong with the input to the request.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSfinspace.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes metadata tags from a FinSpace resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws InvalidRequestException
     *         The request is invalid. Something is wrong with the input to the request.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSfinspace.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Update your FinSpace environment.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @return Result of the UpdateEnvironment operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSfinspace.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    UpdateEnvironmentResult updateEnvironment(UpdateEnvironmentRequest updateEnvironmentRequest);

    /**
     * <p>
     * Allows you to update code configuration on a running cluster. By using this API you can update the code, the
     * initialization script path, and the command line arguments for a specific cluster. The configuration that you
     * want to update will override any existing configurations on the cluster.
     * </p>
     * 
     * @param updateKxClusterCodeConfigurationRequest
     * @return Result of the UpdateKxClusterCodeConfiguration operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws LimitExceededException
     *         A service limit or quota is exceeded.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         There was a conflict with this action, and it could not be completed.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSfinspace.UpdateKxClusterCodeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateKxClusterCodeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateKxClusterCodeConfigurationResult updateKxClusterCodeConfiguration(UpdateKxClusterCodeConfigurationRequest updateKxClusterCodeConfigurationRequest);

    /**
     * <p>
     * Updates the databases mounted on a kdb cluster, which includes the <code>changesetId</code> and all the dbPaths
     * to be cached. This API does not allow you to change a database name or add a database if you created a cluster
     * without one.
     * </p>
     * <p>
     * Using this API you can point a cluster to a different changeset and modify a list of partitions being cached.
     * </p>
     * 
     * @param updateKxClusterDatabasesRequest
     * @return Result of the UpdateKxClusterDatabases operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws LimitExceededException
     *         A service limit or quota is exceeded.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         There was a conflict with this action, and it could not be completed.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSfinspace.UpdateKxClusterDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateKxClusterDatabases"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateKxClusterDatabasesResult updateKxClusterDatabases(UpdateKxClusterDatabasesRequest updateKxClusterDatabasesRequest);

    /**
     * <p>
     * Updates information for the given kdb database.
     * </p>
     * 
     * @param updateKxDatabaseRequest
     * @return Result of the UpdateKxDatabase operation returned by the service.
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
     *         There was a conflict with this action, and it could not be completed.
     * @sample AWSfinspace.UpdateKxDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateKxDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateKxDatabaseResult updateKxDatabase(UpdateKxDatabaseRequest updateKxDatabaseRequest);

    /**
     * <p>
     * Updates the specified dataview. The dataviews get automatically updated when any new changesets are ingested.
     * Each update of the dataview creates a new version, including changeset details and cache configurations
     * </p>
     * 
     * @param updateKxDataviewRequest
     * @return Result of the UpdateKxDataview operation returned by the service.
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
     *         There was a conflict with this action, and it could not be completed.
     * @throws ResourceAlreadyExistsException
     *         The specified resource group already exists.
     * @sample AWSfinspace.UpdateKxDataview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateKxDataview" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateKxDataviewResult updateKxDataview(UpdateKxDataviewRequest updateKxDataviewRequest);

    /**
     * <p>
     * Updates information for the given kdb environment.
     * </p>
     * 
     * @param updateKxEnvironmentRequest
     * @return Result of the UpdateKxEnvironment operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         There was a conflict with this action, and it could not be completed.
     * @sample AWSfinspace.UpdateKxEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateKxEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateKxEnvironmentResult updateKxEnvironment(UpdateKxEnvironmentRequest updateKxEnvironmentRequest);

    /**
     * <p>
     * Updates environment network to connect to your internal network by using a transit gateway. This API supports
     * request to create a transit gateway attachment from FinSpace VPC to your transit gateway ID and create a custom
     * Route-53 outbound resolvers.
     * </p>
     * <p>
     * Once you send a request to update a network, you cannot change it again. Network update might require termination
     * of any clusters that are running in the existing network.
     * </p>
     * 
     * @param updateKxEnvironmentNetworkRequest
     * @return Result of the UpdateKxEnvironmentNetwork operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         There was a conflict with this action, and it could not be completed.
     * @sample AWSfinspace.UpdateKxEnvironmentNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateKxEnvironmentNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateKxEnvironmentNetworkResult updateKxEnvironmentNetwork(UpdateKxEnvironmentNetworkRequest updateKxEnvironmentNetworkRequest);

    /**
     * <p>
     * Updates the user details. You can only update the IAM role associated with a user.
     * </p>
     * 
     * @param updateKxUserRequest
     * @return Result of the UpdateKxUser operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws LimitExceededException
     *         A service limit or quota is exceeded.
     * @throws ConflictException
     *         There was a conflict with this action, and it could not be completed.
     * @sample AWSfinspace.UpdateKxUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateKxUser" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateKxUserResult updateKxUser(UpdateKxUserRequest updateKxUserRequest);

    /**
     * <p>
     * Updates the throughput or capacity of a volume. During the update process, the filesystem might be unavailable
     * for a few minutes. You can retry any operations after the update is complete.
     * </p>
     * 
     * @param updateKxVolumeRequest
     * @return Result of the UpdateKxVolume operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws LimitExceededException
     *         A service limit or quota is exceeded.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         There was a conflict with this action, and it could not be completed.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSfinspace.UpdateKxVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateKxVolume" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateKxVolumeResult updateKxVolume(UpdateKxVolumeRequest updateKxVolumeRequest);

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
