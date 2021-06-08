/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * You can use the Amazon Elastic Block Store (Amazon EBS) direct APIs to create EBS snapshots, write data directly to
 * your snapshots, read data on your snapshots, and identify the differences or changes between two snapshots. If you’re
 * an independent software vendor (ISV) who offers backup services for Amazon EBS, the EBS direct APIs make it more
 * efficient and cost-effective to track incremental changes on your EBS volumes through snapshots. This can be done
 * without having to create new volumes from snapshots, and then use Amazon Elastic Compute Cloud (Amazon EC2) instances
 * to compare the differences.
 * </p>
 * <p>
 * You can create incremental snapshots directly from data on-premises into EBS volumes and the cloud to use for quick
 * disaster recovery. With the ability to write and read snapshots, you can write your on-premises data to an EBS
 * snapshot during a disaster. Then after recovery, you can restore it back to AWS or on-premises from the snapshot. You
 * no longer need to build and maintain complex mechanisms to copy data to and from Amazon EBS.
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
     * Seals and completes the snapshot after all of the required blocks of data have been written to it. Completing the
     * snapshot changes the status to <code>completed</code>. You cannot write new blocks to a snapshot after it has
     * been completed.
     * </p>
     * 
     * @param completeSnapshotRequest
     * @return Result of the CompleteSnapshot operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints of the EBS direct APIs.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws RequestThrottledException
     *         The number of API requests has exceed the maximum allowed API request throttling limit.
     * @throws ServiceQuotaExceededException
     *         Your current service quotas do not allow you to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AmazonEBS.CompleteSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/CompleteSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    CompleteSnapshotResult completeSnapshot(CompleteSnapshotRequest completeSnapshotRequest);

    /**
     * <p>
     * Returns the data in a block in an Amazon Elastic Block Store snapshot.
     * </p>
     * 
     * @param getSnapshotBlockRequest
     * @return Result of the GetSnapshotBlock operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints of the EBS direct APIs.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws RequestThrottledException
     *         The number of API requests has exceed the maximum allowed API request throttling limit.
     * @throws ServiceQuotaExceededException
     *         Your current service quotas do not allow you to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AmazonEBS.GetSnapshotBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/GetSnapshotBlock" target="_top">AWS API
     *      Documentation</a>
     */
    GetSnapshotBlockResult getSnapshotBlock(GetSnapshotBlockRequest getSnapshotBlockRequest);

    /**
     * <p>
     * Returns information about the blocks that are different between two Amazon Elastic Block Store snapshots of the
     * same volume/snapshot lineage.
     * </p>
     * 
     * @param listChangedBlocksRequest
     * @return Result of the ListChangedBlocks operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints of the EBS direct APIs.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws RequestThrottledException
     *         The number of API requests has exceed the maximum allowed API request throttling limit.
     * @throws ServiceQuotaExceededException
     *         Your current service quotas do not allow you to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AmazonEBS.ListChangedBlocks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/ListChangedBlocks" target="_top">AWS API
     *      Documentation</a>
     */
    ListChangedBlocksResult listChangedBlocks(ListChangedBlocksRequest listChangedBlocksRequest);

    /**
     * <p>
     * Returns information about the blocks in an Amazon Elastic Block Store snapshot.
     * </p>
     * 
     * @param listSnapshotBlocksRequest
     * @return Result of the ListSnapshotBlocks operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints of the EBS direct APIs.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws RequestThrottledException
     *         The number of API requests has exceed the maximum allowed API request throttling limit.
     * @throws ServiceQuotaExceededException
     *         Your current service quotas do not allow you to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AmazonEBS.ListSnapshotBlocks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/ListSnapshotBlocks" target="_top">AWS API
     *      Documentation</a>
     */
    ListSnapshotBlocksResult listSnapshotBlocks(ListSnapshotBlocksRequest listSnapshotBlocksRequest);

    /**
     * <p>
     * Writes a block of data to a snapshot. If the specified block contains data, the existing data is overwritten. The
     * target snapshot must be in the <code>pending</code> state.
     * </p>
     * <p>
     * Data written to a snapshot must be aligned with 512-byte sectors.
     * </p>
     * 
     * @param putSnapshotBlockRequest
     * @return Result of the PutSnapshotBlock operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints of the EBS direct APIs.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws RequestThrottledException
     *         The number of API requests has exceed the maximum allowed API request throttling limit.
     * @throws ServiceQuotaExceededException
     *         Your current service quotas do not allow you to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AmazonEBS.PutSnapshotBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/PutSnapshotBlock" target="_top">AWS API
     *      Documentation</a>
     */
    PutSnapshotBlockResult putSnapshotBlock(PutSnapshotBlockRequest putSnapshotBlockRequest);

    /**
     * <p>
     * Creates a new Amazon EBS snapshot. The new snapshot enters the <code>pending</code> state after the request
     * completes.
     * </p>
     * <p>
     * After creating the snapshot, use <a
     * href="https://docs.aws.amazon.com/ebs/latest/APIReference/API_PutSnapshotBlock.html"> PutSnapshotBlock</a> to
     * write blocks of data to the snapshot.
     * </p>
     * 
     * @param startSnapshotRequest
     * @return Result of the StartSnapshot operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints of the EBS direct APIs.
     * @throws RequestThrottledException
     *         The number of API requests has exceed the maximum allowed API request throttling limit.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceQuotaExceededException
     *         Your current service quotas do not allow you to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ConcurrentLimitExceededException
     *         You have reached the limit for concurrent API requests. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-accessing-snapshot.html#ebsapi-performance"
     *         >Optimizing performance of the EBS direct APIs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @throws ConflictException
     *         The request uses the same client token as a previous, but non-identical request.
     * @sample AmazonEBS.StartSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/StartSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    StartSnapshotResult startSnapshot(StartSnapshotRequest startSnapshotRequest);

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
