/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ebs;

import javax.annotation.Generated;

import com.amazonaws.services.ebs.model.*;

/**
 * Interface for accessing Amazon EBS asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ebs.AbstractAmazonEBSAsync} instead.
 * </p>
 * <p>
 * <p>
 * You can use the Amazon Elastic Block Store (EBS) direct APIs to directly read the data on your EBS snapshots, and
 * identify the difference between two snapshots. You can view the details of blocks in an EBS snapshot, compare the
 * block difference between two snapshots, and directly access the data in a snapshot. If you’re an independent software
 * vendor (ISV) who offers backup services for EBS, the EBS direct APIs make it easier and more cost-effective to track
 * incremental changes on your EBS volumes via EBS snapshots. This can be done without having to create new volumes from
 * EBS snapshots.
 * </p>
 * <p>
 * This API reference provides detailed information about the actions, data types, parameters, and errors of the EBS
 * direct APIs. For more information about the elements that make up the EBS direct APIs, and examples of how to use
 * them effectively, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-accessing-snapshot.html">Accessing the Contents of an
 * EBS Snapshot</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>. For more information about the supported AWS
 * Regions, endpoints, and service quotas for the EBS direct APIs, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/ebs-service.html">Amazon Elastic Block Store Endpoints and
 * Quotas</a> in the <i>AWS General Reference</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonEBSAsync extends AmazonEBS {

    /**
     * <p>
     * Returns the data in a block in an Amazon Elastic Block Store snapshot.
     * </p>
     * 
     * @param getSnapshotBlockRequest
     * @return A Java Future containing the result of the GetSnapshotBlock operation returned by the service.
     * @sample AmazonEBSAsync.GetSnapshotBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/GetSnapshotBlock" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSnapshotBlockResult> getSnapshotBlockAsync(GetSnapshotBlockRequest getSnapshotBlockRequest);

    /**
     * <p>
     * Returns the data in a block in an Amazon Elastic Block Store snapshot.
     * </p>
     * 
     * @param getSnapshotBlockRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSnapshotBlock operation returned by the service.
     * @sample AmazonEBSAsyncHandler.GetSnapshotBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/GetSnapshotBlock" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSnapshotBlockResult> getSnapshotBlockAsync(GetSnapshotBlockRequest getSnapshotBlockRequest,
            com.amazonaws.handlers.AsyncHandler<GetSnapshotBlockRequest, GetSnapshotBlockResult> asyncHandler);

    /**
     * <p>
     * Returns the block indexes and block tokens for blocks that are different between two Amazon Elastic Block Store
     * snapshots of the same volume/snapshot lineage.
     * </p>
     * 
     * @param listChangedBlocksRequest
     * @return A Java Future containing the result of the ListChangedBlocks operation returned by the service.
     * @sample AmazonEBSAsync.ListChangedBlocks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/ListChangedBlocks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChangedBlocksResult> listChangedBlocksAsync(ListChangedBlocksRequest listChangedBlocksRequest);

    /**
     * <p>
     * Returns the block indexes and block tokens for blocks that are different between two Amazon Elastic Block Store
     * snapshots of the same volume/snapshot lineage.
     * </p>
     * 
     * @param listChangedBlocksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChangedBlocks operation returned by the service.
     * @sample AmazonEBSAsyncHandler.ListChangedBlocks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/ListChangedBlocks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChangedBlocksResult> listChangedBlocksAsync(ListChangedBlocksRequest listChangedBlocksRequest,
            com.amazonaws.handlers.AsyncHandler<ListChangedBlocksRequest, ListChangedBlocksResult> asyncHandler);

    /**
     * <p>
     * Returns the block indexes and block tokens for blocks in an Amazon Elastic Block Store snapshot.
     * </p>
     * 
     * @param listSnapshotBlocksRequest
     * @return A Java Future containing the result of the ListSnapshotBlocks operation returned by the service.
     * @sample AmazonEBSAsync.ListSnapshotBlocks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/ListSnapshotBlocks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSnapshotBlocksResult> listSnapshotBlocksAsync(ListSnapshotBlocksRequest listSnapshotBlocksRequest);

    /**
     * <p>
     * Returns the block indexes and block tokens for blocks in an Amazon Elastic Block Store snapshot.
     * </p>
     * 
     * @param listSnapshotBlocksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSnapshotBlocks operation returned by the service.
     * @sample AmazonEBSAsyncHandler.ListSnapshotBlocks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/ListSnapshotBlocks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSnapshotBlocksResult> listSnapshotBlocksAsync(ListSnapshotBlocksRequest listSnapshotBlocksRequest,
            com.amazonaws.handlers.AsyncHandler<ListSnapshotBlocksRequest, ListSnapshotBlocksResult> asyncHandler);

}
