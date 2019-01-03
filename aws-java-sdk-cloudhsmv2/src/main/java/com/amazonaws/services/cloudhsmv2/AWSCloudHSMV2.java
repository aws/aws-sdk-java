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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.cloudhsmv2.model.*;

/**
 * Interface for accessing CloudHSM V2.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudhsmv2.AbstractAWSCloudHSMV2} instead.
 * </p>
 * <p>
 * <p>
 * For more information about AWS CloudHSM, see <a href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a> and the <a
 * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCloudHSMV2 {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "cloudhsmv2";

    /**
     * <p>
     * Copy an AWS CloudHSM cluster backup to a different region.
     * </p>
     * 
     * @param copyBackupToRegionRequest
     * @return Result of the CopyBackupToRegion operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.CopyBackupToRegion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CopyBackupToRegion" target="_top">AWS
     *      API Documentation</a>
     */
    CopyBackupToRegionResult copyBackupToRegion(CopyBackupToRegionRequest copyBackupToRegionRequest);

    /**
     * <p>
     * Creates a new AWS CloudHSM cluster.
     * </p>
     * 
     * @param createClusterRequest
     * @return Result of the CreateCluster operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    CreateClusterResult createCluster(CreateClusterRequest createClusterRequest);

    /**
     * <p>
     * Creates a new hardware security module (HSM) in the specified AWS CloudHSM cluster.
     * </p>
     * 
     * @param createHsmRequest
     * @return Result of the CreateHsm operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.CreateHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CreateHsm" target="_top">AWS API
     *      Documentation</a>
     */
    CreateHsmResult createHsm(CreateHsmRequest createHsmRequest);

    /**
     * <p>
     * Deletes a specified AWS CloudHSM backup. A backup can be restored up to 7 days after the DeleteBackup request.
     * For more information on restoring a backup, see <a>RestoreBackup</a>
     * </p>
     * 
     * @param deleteBackupRequest
     * @return Result of the DeleteBackup operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.DeleteBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteBackup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteBackupResult deleteBackup(DeleteBackupRequest deleteBackupRequest);

    /**
     * <p>
     * Deletes the specified AWS CloudHSM cluster. Before you can delete a cluster, you must delete all HSMs in the
     * cluster. To see if the cluster contains any HSMs, use <a>DescribeClusters</a>. To delete an HSM, use
     * <a>DeleteHsm</a>.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return Result of the DeleteCluster operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteClusterResult deleteCluster(DeleteClusterRequest deleteClusterRequest);

    /**
     * <p>
     * Deletes the specified HSM. To specify an HSM, you can use its identifier (ID), the IP address of the HSM's
     * elastic network interface (ENI), or the ID of the HSM's ENI. You need to specify only one of these values. To
     * find these values, use <a>DescribeClusters</a>.
     * </p>
     * 
     * @param deleteHsmRequest
     * @return Result of the DeleteHsm operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.DeleteHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteHsm" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteHsmResult deleteHsm(DeleteHsmRequest deleteHsmRequest);

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
     * @return Result of the DescribeBackups operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.DescribeBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DescribeBackups" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeBackupsResult describeBackups(DescribeBackupsRequest describeBackupsRequest);

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
     * @return Result of the DescribeClusters operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.DescribeClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DescribeClusters" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeClustersResult describeClusters(DescribeClustersRequest describeClustersRequest);

    /**
     * <p>
     * Claims an AWS CloudHSM cluster by submitting the cluster certificate issued by your issuing certificate authority
     * (CA) and the CA's root certificate. Before you can claim a cluster, you must sign the cluster's certificate
     * signing request (CSR) with your issuing CA. To get the cluster's CSR, use <a>DescribeClusters</a>.
     * </p>
     * 
     * @param initializeClusterRequest
     * @return Result of the InitializeCluster operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.InitializeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/InitializeCluster" target="_top">AWS
     *      API Documentation</a>
     */
    InitializeClusterResult initializeCluster(InitializeClusterRequest initializeClusterRequest);

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
     * @return Result of the ListTags operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsResult listTags(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Restores a specified AWS CloudHSM backup that is in the <code>PENDING_DELETION</code> state. For more information
     * on deleting a backup, see <a>DeleteBackup</a>.
     * </p>
     * 
     * @param restoreBackupRequest
     * @return Result of the RestoreBackup operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.RestoreBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/RestoreBackup" target="_top">AWS API
     *      Documentation</a>
     */
    RestoreBackupResult restoreBackup(RestoreBackupRequest restoreBackupRequest);

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified AWS CloudHSM cluster.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the specified tag or tags from the specified AWS CloudHSM cluster.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
