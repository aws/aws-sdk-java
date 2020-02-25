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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.ebs.model.*;

/**
 * Interface for accessing Amazon EBS.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ebs.AbstractAmazonEBS} instead.
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
public interface AmazonEBS {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "ebs";

    /**
     * <p>
     * Returns the data in a block in an Amazon Elastic Block Store snapshot.
     * </p>
     * 
     * @param getSnapshotBlockRequest
     * @return Result of the GetSnapshotBlock operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints of the EBS direct APIs.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonEBS.GetSnapshotBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/GetSnapshotBlock" target="_top">AWS API
     *      Documentation</a>
     */
    GetSnapshotBlockResult getSnapshotBlock(GetSnapshotBlockRequest getSnapshotBlockRequest);

    /**
     * <p>
     * Returns the block indexes and block tokens for blocks that are different between two Amazon Elastic Block Store
     * snapshots of the same volume/snapshot lineage.
     * </p>
     * 
     * @param listChangedBlocksRequest
     * @return Result of the ListChangedBlocks operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints of the EBS direct APIs.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonEBS.ListChangedBlocks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/ListChangedBlocks" target="_top">AWS API
     *      Documentation</a>
     */
    ListChangedBlocksResult listChangedBlocks(ListChangedBlocksRequest listChangedBlocksRequest);

    /**
     * <p>
     * Returns the block indexes and block tokens for blocks in an Amazon Elastic Block Store snapshot.
     * </p>
     * 
     * @param listSnapshotBlocksRequest
     * @return Result of the ListSnapshotBlocks operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints of the EBS direct APIs.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AmazonEBS.ListSnapshotBlocks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/ListSnapshotBlocks" target="_top">AWS API
     *      Documentation</a>
     */
    ListSnapshotBlocksResult listSnapshotBlocks(ListSnapshotBlocksRequest listSnapshotBlocksRequest);

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
