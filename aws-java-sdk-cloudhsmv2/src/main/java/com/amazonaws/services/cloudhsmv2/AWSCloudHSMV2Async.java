/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudhsmv2;

import javax.annotation.Generated;

import com.amazonaws.services.cloudhsmv2.model.*;

/**
 * Interface for accessing CloudHSM V2 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudhsmv2.AbstractAWSCloudHSMV2Async} instead.
 * </p>
 * <p>
 * <p>
 * For more information about AWS CloudHSM, see <a href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a> and the <a
 * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCloudHSMV2Async extends AWSCloudHSMV2 {

    /**
     * <p>
     * Copy an AWS CloudHSM cluster backup to a different region.
     * </p>
     * 
     * @param copyBackupToRegionRequest
     * @return A Java Future containing the result of the CopyBackupToRegion operation returned by the service.
     * @sample AWSCloudHSMV2Async.CopyBackupToRegion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CopyBackupToRegion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CopyBackupToRegionResult> copyBackupToRegionAsync(CopyBackupToRegionRequest copyBackupToRegionRequest);

    /**
     * <p>
     * Copy an AWS CloudHSM cluster backup to a different region.
     * </p>
     * 
     * @param copyBackupToRegionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopyBackupToRegion operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.CopyBackupToRegion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CopyBackupToRegion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CopyBackupToRegionResult> copyBackupToRegionAsync(CopyBackupToRegionRequest copyBackupToRegionRequest,
            com.amazonaws.handlers.AsyncHandler<CopyBackupToRegionRequest, CopyBackupToRegionResult> asyncHandler);

    /**
     * <p>
     * Creates a new AWS CloudHSM cluster.
     * </p>
     * 
     * @param createClusterRequest
     * @return A Java Future containing the result of the CreateCluster operation returned by the service.
     * @sample AWSCloudHSMV2Async.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest createClusterRequest);

    /**
     * <p>
     * Creates a new AWS CloudHSM cluster.
     * </p>
     * 
     * @param createClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCluster operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest createClusterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateClusterRequest, CreateClusterResult> asyncHandler);

    /**
     * <p>
     * Creates a new hardware security module (HSM) in the specified AWS CloudHSM cluster.
     * </p>
     * 
     * @param createHsmRequest
     * @return A Java Future containing the result of the CreateHsm operation returned by the service.
     * @sample AWSCloudHSMV2Async.CreateHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CreateHsm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateHsmResult> createHsmAsync(CreateHsmRequest createHsmRequest);

    /**
     * <p>
     * Creates a new hardware security module (HSM) in the specified AWS CloudHSM cluster.
     * </p>
     * 
     * @param createHsmRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateHsm operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.CreateHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CreateHsm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateHsmResult> createHsmAsync(CreateHsmRequest createHsmRequest,
            com.amazonaws.handlers.AsyncHandler<CreateHsmRequest, CreateHsmResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified AWS CloudHSM backup. A backup can be restored up to 7 days after the DeleteBackup request.
     * For more information on restoring a backup, see <a>RestoreBackup</a>
     * </p>
     * 
     * @param deleteBackupRequest
     * @return A Java Future containing the result of the DeleteBackup operation returned by the service.
     * @sample AWSCloudHSMV2Async.DeleteBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest deleteBackupRequest);

    /**
     * <p>
     * Deletes a specified AWS CloudHSM backup. A backup can be restored up to 7 days after the DeleteBackup request.
     * For more information on restoring a backup, see <a>RestoreBackup</a>
     * </p>
     * 
     * @param deleteBackupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBackup operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.DeleteBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest deleteBackupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBackupRequest, DeleteBackupResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified AWS CloudHSM cluster. Before you can delete a cluster, you must delete all HSMs in the
     * cluster. To see if the cluster contains any HSMs, use <a>DescribeClusters</a>. To delete an HSM, use
     * <a>DeleteHsm</a>.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return A Java Future containing the result of the DeleteCluster operation returned by the service.
     * @sample AWSCloudHSMV2Async.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest deleteClusterRequest);

    /**
     * <p>
     * Deletes the specified AWS CloudHSM cluster. Before you can delete a cluster, you must delete all HSMs in the
     * cluster. To see if the cluster contains any HSMs, use <a>DescribeClusters</a>. To delete an HSM, use
     * <a>DeleteHsm</a>.
     * </p>
     * 
     * @param deleteClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCluster operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest deleteClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteClusterRequest, DeleteClusterResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified HSM. To specify an HSM, you can use its identifier (ID), the IP address of the HSM's
     * elastic network interface (ENI), or the ID of the HSM's ENI. You need to specify only one of these values. To
     * find these values, use <a>DescribeClusters</a>.
     * </p>
     * 
     * @param deleteHsmRequest
     * @return A Java Future containing the result of the DeleteHsm operation returned by the service.
     * @sample AWSCloudHSMV2Async.DeleteHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteHsm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteHsmResult> deleteHsmAsync(DeleteHsmRequest deleteHsmRequest);

    /**
     * <p>
     * Deletes the specified HSM. To specify an HSM, you can use its identifier (ID), the IP address of the HSM's
     * elastic network interface (ENI), or the ID of the HSM's ENI. You need to specify only one of these values. To
     * find these values, use <a>DescribeClusters</a>.
     * </p>
     * 
     * @param deleteHsmRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteHsm operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.DeleteHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteHsm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteHsmResult> deleteHsmAsync(DeleteHsmRequest deleteHsmRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteHsmRequest, DeleteHsmResult> asyncHandler);

    /**
     * <p>
     * Gets information about backups of AWS CloudHSM clusters.
     * </p>
     * <p>
     * This is a paginated operation, which means that each response might contain only a subset of all the backups.
     * When the response contains only a subset of backups, it includes a <code>NextToken</code> value. Use this value
     * in a subsequent <code>DescribeBackups</code> request to get more backups. When you receive a response with no
     * <code>NextToken</code> (or an empty or null value), that means there are no more backups to get.
     * </p>
     * 
     * @param describeBackupsRequest
     * @return A Java Future containing the result of the DescribeBackups operation returned by the service.
     * @sample AWSCloudHSMV2Async.DescribeBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DescribeBackups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBackupsResult> describeBackupsAsync(DescribeBackupsRequest describeBackupsRequest);

    /**
     * <p>
     * Gets information about backups of AWS CloudHSM clusters.
     * </p>
     * <p>
     * This is a paginated operation, which means that each response might contain only a subset of all the backups.
     * When the response contains only a subset of backups, it includes a <code>NextToken</code> value. Use this value
     * in a subsequent <code>DescribeBackups</code> request to get more backups. When you receive a response with no
     * <code>NextToken</code> (or an empty or null value), that means there are no more backups to get.
     * </p>
     * 
     * @param describeBackupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBackups operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.DescribeBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DescribeBackups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBackupsResult> describeBackupsAsync(DescribeBackupsRequest describeBackupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBackupsRequest, DescribeBackupsResult> asyncHandler);

    /**
     * <p>
     * Gets information about AWS CloudHSM clusters.
     * </p>
     * <p>
     * This is a paginated operation, which means that each response might contain only a subset of all the clusters.
     * When the response contains only a subset of clusters, it includes a <code>NextToken</code> value. Use this value
     * in a subsequent <code>DescribeClusters</code> request to get more clusters. When you receive a response with no
     * <code>NextToken</code> (or an empty or null value), that means there are no more clusters to get.
     * </p>
     * 
     * @param describeClustersRequest
     * @return A Java Future containing the result of the DescribeClusters operation returned by the service.
     * @sample AWSCloudHSMV2Async.DescribeClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DescribeClusters" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync(DescribeClustersRequest describeClustersRequest);

    /**
     * <p>
     * Gets information about AWS CloudHSM clusters.
     * </p>
     * <p>
     * This is a paginated operation, which means that each response might contain only a subset of all the clusters.
     * When the response contains only a subset of clusters, it includes a <code>NextToken</code> value. Use this value
     * in a subsequent <code>DescribeClusters</code> request to get more clusters. When you receive a response with no
     * <code>NextToken</code> (or an empty or null value), that means there are no more clusters to get.
     * </p>
     * 
     * @param describeClustersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeClusters operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.DescribeClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DescribeClusters" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync(DescribeClustersRequest describeClustersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeClustersRequest, DescribeClustersResult> asyncHandler);

    /**
     * <p>
     * Claims an AWS CloudHSM cluster by submitting the cluster certificate issued by your issuing certificate authority
     * (CA) and the CA's root certificate. Before you can claim a cluster, you must sign the cluster's certificate
     * signing request (CSR) with your issuing CA. To get the cluster's CSR, use <a>DescribeClusters</a>.
     * </p>
     * 
     * @param initializeClusterRequest
     * @return A Java Future containing the result of the InitializeCluster operation returned by the service.
     * @sample AWSCloudHSMV2Async.InitializeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/InitializeCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<InitializeClusterResult> initializeClusterAsync(InitializeClusterRequest initializeClusterRequest);

    /**
     * <p>
     * Claims an AWS CloudHSM cluster by submitting the cluster certificate issued by your issuing certificate authority
     * (CA) and the CA's root certificate. Before you can claim a cluster, you must sign the cluster's certificate
     * signing request (CSR) with your issuing CA. To get the cluster's CSR, use <a>DescribeClusters</a>.
     * </p>
     * 
     * @param initializeClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InitializeCluster operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.InitializeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/InitializeCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<InitializeClusterResult> initializeClusterAsync(InitializeClusterRequest initializeClusterRequest,
            com.amazonaws.handlers.AsyncHandler<InitializeClusterRequest, InitializeClusterResult> asyncHandler);

    /**
     * <p>
     * Gets a list of tags for the specified AWS CloudHSM cluster.
     * </p>
     * <p>
     * This is a paginated operation, which means that each response might contain only a subset of all the tags. When
     * the response contains only a subset of tags, it includes a <code>NextToken</code> value. Use this value in a
     * subsequent <code>ListTags</code> request to get more tags. When you receive a response with no
     * <code>NextToken</code> (or an empty or null value), that means there are no more tags to get.
     * </p>
     * 
     * @param listTagsRequest
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AWSCloudHSMV2Async.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Gets a list of tags for the specified AWS CloudHSM cluster.
     * </p>
     * <p>
     * This is a paginated operation, which means that each response might contain only a subset of all the tags. When
     * the response contains only a subset of tags, it includes a <code>NextToken</code> value. Use this value in a
     * subsequent <code>ListTags</code> request to get more tags. When you receive a response with no
     * <code>NextToken</code> (or an empty or null value), that means there are no more tags to get.
     * </p>
     * 
     * @param listTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler);

    /**
     * <p>
     * Restores a specified AWS CloudHSM backup that is in the <code>PENDING_DELETION</code> state. For more information
     * on deleting a backup, see <a>DeleteBackup</a>.
     * </p>
     * 
     * @param restoreBackupRequest
     * @return A Java Future containing the result of the RestoreBackup operation returned by the service.
     * @sample AWSCloudHSMV2Async.RestoreBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/RestoreBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RestoreBackupResult> restoreBackupAsync(RestoreBackupRequest restoreBackupRequest);

    /**
     * <p>
     * Restores a specified AWS CloudHSM backup that is in the <code>PENDING_DELETION</code> state. For more information
     * on deleting a backup, see <a>DeleteBackup</a>.
     * </p>
     * 
     * @param restoreBackupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreBackup operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.RestoreBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/RestoreBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RestoreBackupResult> restoreBackupAsync(RestoreBackupRequest restoreBackupRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreBackupRequest, RestoreBackupResult> asyncHandler);

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified AWS CloudHSM cluster.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSCloudHSMV2Async.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified AWS CloudHSM cluster.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tag or tags from the specified AWS CloudHSM cluster.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSCloudHSMV2Async.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the specified tag or tags from the specified AWS CloudHSM cluster.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

}
