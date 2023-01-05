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
package com.amazonaws.services.docdbelastic;

import javax.annotation.Generated;

import com.amazonaws.services.docdbelastic.model.*;

/**
 * Interface for accessing DocDB Elastic asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.docdbelastic.AbstractAmazonDocDBElasticAsync} instead.
 * </p>
 * <p>
 * <p>
 * The new Amazon Elastic DocumentDB service endpoint.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonDocDBElasticAsync extends AmazonDocDBElastic {

    /**
     * <p>
     * Creates a new Elastic DocumentDB cluster and returns its Cluster structure.
     * </p>
     * 
     * @param createClusterRequest
     * @return A Java Future containing the result of the CreateCluster operation returned by the service.
     * @sample AmazonDocDBElasticAsync.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/CreateCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest createClusterRequest);

    /**
     * <p>
     * Creates a new Elastic DocumentDB cluster and returns its Cluster structure.
     * </p>
     * 
     * @param createClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCluster operation returned by the service.
     * @sample AmazonDocDBElasticAsyncHandler.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/CreateCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest createClusterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateClusterRequest, CreateClusterResult> asyncHandler);

    /**
     * <p>
     * Creates a snapshot of a cluster.
     * </p>
     * 
     * @param createClusterSnapshotRequest
     * @return A Java Future containing the result of the CreateClusterSnapshot operation returned by the service.
     * @sample AmazonDocDBElasticAsync.CreateClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/CreateClusterSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateClusterSnapshotResult> createClusterSnapshotAsync(CreateClusterSnapshotRequest createClusterSnapshotRequest);

    /**
     * <p>
     * Creates a snapshot of a cluster.
     * </p>
     * 
     * @param createClusterSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateClusterSnapshot operation returned by the service.
     * @sample AmazonDocDBElasticAsyncHandler.CreateClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/CreateClusterSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateClusterSnapshotResult> createClusterSnapshotAsync(CreateClusterSnapshotRequest createClusterSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateClusterSnapshotRequest, CreateClusterSnapshotResult> asyncHandler);

    /**
     * <p>
     * Delete a Elastic DocumentDB cluster.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return A Java Future containing the result of the DeleteCluster operation returned by the service.
     * @sample AmazonDocDBElasticAsync.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/DeleteCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest deleteClusterRequest);

    /**
     * <p>
     * Delete a Elastic DocumentDB cluster.
     * </p>
     * 
     * @param deleteClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCluster operation returned by the service.
     * @sample AmazonDocDBElasticAsyncHandler.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/DeleteCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest deleteClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteClusterRequest, DeleteClusterResult> asyncHandler);

    /**
     * <p>
     * Delete a Elastic DocumentDB snapshot.
     * </p>
     * 
     * @param deleteClusterSnapshotRequest
     * @return A Java Future containing the result of the DeleteClusterSnapshot operation returned by the service.
     * @sample AmazonDocDBElasticAsync.DeleteClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/DeleteClusterSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteClusterSnapshotResult> deleteClusterSnapshotAsync(DeleteClusterSnapshotRequest deleteClusterSnapshotRequest);

    /**
     * <p>
     * Delete a Elastic DocumentDB snapshot.
     * </p>
     * 
     * @param deleteClusterSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteClusterSnapshot operation returned by the service.
     * @sample AmazonDocDBElasticAsyncHandler.DeleteClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/DeleteClusterSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteClusterSnapshotResult> deleteClusterSnapshotAsync(DeleteClusterSnapshotRequest deleteClusterSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteClusterSnapshotRequest, DeleteClusterSnapshotResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific Elastic DocumentDB cluster.
     * </p>
     * 
     * @param getClusterRequest
     * @return A Java Future containing the result of the GetCluster operation returned by the service.
     * @sample AmazonDocDBElasticAsync.GetCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/GetCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetClusterResult> getClusterAsync(GetClusterRequest getClusterRequest);

    /**
     * <p>
     * Returns information about a specific Elastic DocumentDB cluster.
     * </p>
     * 
     * @param getClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCluster operation returned by the service.
     * @sample AmazonDocDBElasticAsyncHandler.GetCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/GetCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetClusterResult> getClusterAsync(GetClusterRequest getClusterRequest,
            com.amazonaws.handlers.AsyncHandler<GetClusterRequest, GetClusterResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific Elastic DocumentDB snapshot
     * </p>
     * 
     * @param getClusterSnapshotRequest
     * @return A Java Future containing the result of the GetClusterSnapshot operation returned by the service.
     * @sample AmazonDocDBElasticAsync.GetClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/GetClusterSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetClusterSnapshotResult> getClusterSnapshotAsync(GetClusterSnapshotRequest getClusterSnapshotRequest);

    /**
     * <p>
     * Returns information about a specific Elastic DocumentDB snapshot
     * </p>
     * 
     * @param getClusterSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetClusterSnapshot operation returned by the service.
     * @sample AmazonDocDBElasticAsyncHandler.GetClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/GetClusterSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetClusterSnapshotResult> getClusterSnapshotAsync(GetClusterSnapshotRequest getClusterSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<GetClusterSnapshotRequest, GetClusterSnapshotResult> asyncHandler);

    /**
     * <p>
     * Returns information about Elastic DocumentDB snapshots for a specified cluster.
     * </p>
     * 
     * @param listClusterSnapshotsRequest
     * @return A Java Future containing the result of the ListClusterSnapshots operation returned by the service.
     * @sample AmazonDocDBElasticAsync.ListClusterSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/ListClusterSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListClusterSnapshotsResult> listClusterSnapshotsAsync(ListClusterSnapshotsRequest listClusterSnapshotsRequest);

    /**
     * <p>
     * Returns information about Elastic DocumentDB snapshots for a specified cluster.
     * </p>
     * 
     * @param listClusterSnapshotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListClusterSnapshots operation returned by the service.
     * @sample AmazonDocDBElasticAsyncHandler.ListClusterSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/ListClusterSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListClusterSnapshotsResult> listClusterSnapshotsAsync(ListClusterSnapshotsRequest listClusterSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<ListClusterSnapshotsRequest, ListClusterSnapshotsResult> asyncHandler);

    /**
     * <p>
     * Returns information about provisioned Elastic DocumentDB clusters.
     * </p>
     * 
     * @param listClustersRequest
     * @return A Java Future containing the result of the ListClusters operation returned by the service.
     * @sample AmazonDocDBElasticAsync.ListClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/ListClusters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest listClustersRequest);

    /**
     * <p>
     * Returns information about provisioned Elastic DocumentDB clusters.
     * </p>
     * 
     * @param listClustersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListClusters operation returned by the service.
     * @sample AmazonDocDBElasticAsyncHandler.ListClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/ListClusters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest listClustersRequest,
            com.amazonaws.handlers.AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler);

    /**
     * <p>
     * Lists all tags on a Elastic DocumentDB resource
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonDocDBElasticAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all tags on a Elastic DocumentDB resource
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonDocDBElasticAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Restores a Elastic DocumentDB cluster from a snapshot.
     * </p>
     * 
     * @param restoreClusterFromSnapshotRequest
     * @return A Java Future containing the result of the RestoreClusterFromSnapshot operation returned by the service.
     * @sample AmazonDocDBElasticAsync.RestoreClusterFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/RestoreClusterFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RestoreClusterFromSnapshotResult> restoreClusterFromSnapshotAsync(
            RestoreClusterFromSnapshotRequest restoreClusterFromSnapshotRequest);

    /**
     * <p>
     * Restores a Elastic DocumentDB cluster from a snapshot.
     * </p>
     * 
     * @param restoreClusterFromSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreClusterFromSnapshot operation returned by the service.
     * @sample AmazonDocDBElasticAsyncHandler.RestoreClusterFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/RestoreClusterFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RestoreClusterFromSnapshotResult> restoreClusterFromSnapshotAsync(
            RestoreClusterFromSnapshotRequest restoreClusterFromSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreClusterFromSnapshotRequest, RestoreClusterFromSnapshotResult> asyncHandler);

    /**
     * <p>
     * Adds metadata tags to a Elastic DocumentDB resource
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonDocDBElasticAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds metadata tags to a Elastic DocumentDB resource
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonDocDBElasticAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes metadata tags to a Elastic DocumentDB resource
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonDocDBElasticAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes metadata tags to a Elastic DocumentDB resource
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonDocDBElasticAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Modifies a Elastic DocumentDB cluster. This includes updating admin-username/password, upgrading API version
     * setting up a backup window and maintenance window
     * </p>
     * 
     * @param updateClusterRequest
     * @return A Java Future containing the result of the UpdateCluster operation returned by the service.
     * @sample AmazonDocDBElasticAsync.UpdateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/UpdateCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateClusterResult> updateClusterAsync(UpdateClusterRequest updateClusterRequest);

    /**
     * <p>
     * Modifies a Elastic DocumentDB cluster. This includes updating admin-username/password, upgrading API version
     * setting up a backup window and maintenance window
     * </p>
     * 
     * @param updateClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCluster operation returned by the service.
     * @sample AmazonDocDBElasticAsyncHandler.UpdateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/UpdateCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateClusterResult> updateClusterAsync(UpdateClusterRequest updateClusterRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateClusterRequest, UpdateClusterResult> asyncHandler);

}
