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
package com.amazonaws.services.docdbelastic;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.docdbelastic.model.*;

/**
 * Interface for accessing DocDB Elastic.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.docdbelastic.AbstractAmazonDocDBElastic} instead.
 * </p>
 * <p>
 * <p>
 * <fullname>Amazon DocumentDB elastic clusters</fullname>
 * <p>
 * Amazon DocumentDB elastic-clusters support workloads with millions of reads/writes per second and petabytes of
 * storage capacity. Amazon DocumentDB elastic clusters also simplify how developers interact with Amazon DocumentDB
 * elastic-clusters by eliminating the need to choose, manage or upgrade instances.
 * </p>
 * <p>
 * Amazon DocumentDB elastic-clusters were created to:
 * </p>
 * <ul>
 * <li>
 * <p>
 * provide a solution for customers looking for a database that provides virtually limitless scale with rich query
 * capabilities and MongoDB API compatibility.
 * </p>
 * </li>
 * <li>
 * <p>
 * give customers higher connection limits, and to reduce downtime from patching.
 * </p>
 * </li>
 * <li>
 * <p>
 * continue investing in a cloud-native, elastic, and class leading architecture for JSON workloads.
 * </p>
 * </li>
 * </ul>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonDocDBElastic {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "docdb-elastic";

    /**
     * <p>
     * Copies a snapshot of an elastic cluster.
     * </p>
     * 
     * @param copyClusterSnapshotRequest
     * @return Result of the CopyClusterSnapshot operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws ServiceQuotaExceededException
     *         The service quota for the action was exceeded.
     * @throws ConflictException
     *         There was an access conflict.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ResourceNotFoundException
     *         The specified resource could not be located.
     * @throws AccessDeniedException
     *         An exception that occurs when there are not sufficient permissions to perform an action.
     * @sample AmazonDocDBElastic.CopyClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/CopyClusterSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    CopyClusterSnapshotResult copyClusterSnapshot(CopyClusterSnapshotRequest copyClusterSnapshotRequest);

    /**
     * <p>
     * Creates a new Amazon DocumentDB elastic cluster and returns its cluster structure.
     * </p>
     * 
     * @param createClusterRequest
     * @return Result of the CreateCluster operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws ServiceQuotaExceededException
     *         The service quota for the action was exceeded.
     * @throws ConflictException
     *         There was an access conflict.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws AccessDeniedException
     *         An exception that occurs when there are not sufficient permissions to perform an action.
     * @sample AmazonDocDBElastic.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/CreateCluster" target="_top">AWS
     *      API Documentation</a>
     */
    CreateClusterResult createCluster(CreateClusterRequest createClusterRequest);

    /**
     * <p>
     * Creates a snapshot of an elastic cluster.
     * </p>
     * 
     * @param createClusterSnapshotRequest
     * @return Result of the CreateClusterSnapshot operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws ServiceQuotaExceededException
     *         The service quota for the action was exceeded.
     * @throws ConflictException
     *         There was an access conflict.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ResourceNotFoundException
     *         The specified resource could not be located.
     * @throws AccessDeniedException
     *         An exception that occurs when there are not sufficient permissions to perform an action.
     * @sample AmazonDocDBElastic.CreateClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/CreateClusterSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    CreateClusterSnapshotResult createClusterSnapshot(CreateClusterSnapshotRequest createClusterSnapshotRequest);

    /**
     * <p>
     * Delete an elastic cluster.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return Result of the DeleteCluster operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws ConflictException
     *         There was an access conflict.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ResourceNotFoundException
     *         The specified resource could not be located.
     * @throws AccessDeniedException
     *         An exception that occurs when there are not sufficient permissions to perform an action.
     * @sample AmazonDocDBElastic.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/DeleteCluster" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteClusterResult deleteCluster(DeleteClusterRequest deleteClusterRequest);

    /**
     * <p>
     * Delete an elastic cluster snapshot.
     * </p>
     * 
     * @param deleteClusterSnapshotRequest
     * @return Result of the DeleteClusterSnapshot operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws ConflictException
     *         There was an access conflict.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ResourceNotFoundException
     *         The specified resource could not be located.
     * @throws AccessDeniedException
     *         An exception that occurs when there are not sufficient permissions to perform an action.
     * @sample AmazonDocDBElastic.DeleteClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/DeleteClusterSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteClusterSnapshotResult deleteClusterSnapshot(DeleteClusterSnapshotRequest deleteClusterSnapshotRequest);

    /**
     * <p>
     * Returns information about a specific elastic cluster.
     * </p>
     * 
     * @param getClusterRequest
     * @return Result of the GetCluster operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ResourceNotFoundException
     *         The specified resource could not be located.
     * @throws AccessDeniedException
     *         An exception that occurs when there are not sufficient permissions to perform an action.
     * @sample AmazonDocDBElastic.GetCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/GetCluster" target="_top">AWS API
     *      Documentation</a>
     */
    GetClusterResult getCluster(GetClusterRequest getClusterRequest);

    /**
     * <p>
     * Returns information about a specific elastic cluster snapshot
     * </p>
     * 
     * @param getClusterSnapshotRequest
     * @return Result of the GetClusterSnapshot operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ResourceNotFoundException
     *         The specified resource could not be located.
     * @throws AccessDeniedException
     *         An exception that occurs when there are not sufficient permissions to perform an action.
     * @sample AmazonDocDBElastic.GetClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/GetClusterSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    GetClusterSnapshotResult getClusterSnapshot(GetClusterSnapshotRequest getClusterSnapshotRequest);

    /**
     * <p>
     * Returns information about snapshots for a specified elastic cluster.
     * </p>
     * 
     * @param listClusterSnapshotsRequest
     * @return Result of the ListClusterSnapshots operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws AccessDeniedException
     *         An exception that occurs when there are not sufficient permissions to perform an action.
     * @sample AmazonDocDBElastic.ListClusterSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/ListClusterSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    ListClusterSnapshotsResult listClusterSnapshots(ListClusterSnapshotsRequest listClusterSnapshotsRequest);

    /**
     * <p>
     * Returns information about provisioned Amazon DocumentDB elastic clusters.
     * </p>
     * 
     * @param listClustersRequest
     * @return Result of the ListClusters operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws AccessDeniedException
     *         An exception that occurs when there are not sufficient permissions to perform an action.
     * @sample AmazonDocDBElastic.ListClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/ListClusters" target="_top">AWS API
     *      Documentation</a>
     */
    ListClustersResult listClusters(ListClustersRequest listClustersRequest);

    /**
     * <p>
     * Lists all tags on a elastic cluster resource
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ResourceNotFoundException
     *         The specified resource could not be located.
     * @sample AmazonDocDBElastic.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Restores an elastic cluster from a snapshot.
     * </p>
     * 
     * @param restoreClusterFromSnapshotRequest
     * @return Result of the RestoreClusterFromSnapshot operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws ServiceQuotaExceededException
     *         The service quota for the action was exceeded.
     * @throws ConflictException
     *         There was an access conflict.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ResourceNotFoundException
     *         The specified resource could not be located.
     * @throws AccessDeniedException
     *         An exception that occurs when there are not sufficient permissions to perform an action.
     * @sample AmazonDocDBElastic.RestoreClusterFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/RestoreClusterFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    RestoreClusterFromSnapshotResult restoreClusterFromSnapshot(RestoreClusterFromSnapshotRequest restoreClusterFromSnapshotRequest);

    /**
     * <p>
     * Restarts the stopped elastic cluster that is specified by <code>clusterARN</code>.
     * </p>
     * 
     * @param startClusterRequest
     * @return Result of the StartCluster operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ResourceNotFoundException
     *         The specified resource could not be located.
     * @throws AccessDeniedException
     *         An exception that occurs when there are not sufficient permissions to perform an action.
     * @sample AmazonDocDBElastic.StartCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/StartCluster" target="_top">AWS API
     *      Documentation</a>
     */
    StartClusterResult startCluster(StartClusterRequest startClusterRequest);

    /**
     * <p>
     * Stops the running elastic cluster that is specified by <code>clusterArn</code>. The elastic cluster must be in
     * the <i>available</i> state.
     * </p>
     * 
     * @param stopClusterRequest
     * @return Result of the StopCluster operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ResourceNotFoundException
     *         The specified resource could not be located.
     * @throws AccessDeniedException
     *         An exception that occurs when there are not sufficient permissions to perform an action.
     * @sample AmazonDocDBElastic.StopCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/StopCluster" target="_top">AWS API
     *      Documentation</a>
     */
    StopClusterResult stopCluster(StopClusterRequest stopClusterRequest);

    /**
     * <p>
     * Adds metadata tags to an elastic cluster resource
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ResourceNotFoundException
     *         The specified resource could not be located.
     * @sample AmazonDocDBElastic.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes metadata tags from an elastic cluster resource
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ResourceNotFoundException
     *         The specified resource could not be located.
     * @sample AmazonDocDBElastic.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Modifies an elastic cluster. This includes updating admin-username/password, upgrading the API version, and
     * setting up a backup window and maintenance window
     * </p>
     * 
     * @param updateClusterRequest
     * @return Result of the UpdateCluster operation returned by the service.
     * @throws ThrottlingException
     *         ThrottlingException will be thrown when request was denied due to request throttling.
     * @throws ValidationException
     *         A structure defining a validation exception.
     * @throws ConflictException
     *         There was an access conflict.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ResourceNotFoundException
     *         The specified resource could not be located.
     * @throws AccessDeniedException
     *         An exception that occurs when there are not sufficient permissions to perform an action.
     * @sample AmazonDocDBElastic.UpdateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/UpdateCluster" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateClusterResult updateCluster(UpdateClusterRequest updateClusterRequest);

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
