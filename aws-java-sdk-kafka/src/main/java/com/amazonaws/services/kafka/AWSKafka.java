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
package com.amazonaws.services.kafka;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.kafka.model.*;

/**
 * Interface for accessing Kafka.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.kafka.AbstractAWSKafka} instead.
 * </p>
 * <p>
 * <p>
 * The operations for managing an Amazon MSK cluster.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSKafka {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "kafka";

    /**
     * <p>
     * Creates a new MSK cluster.
     * </p>
     * 
     * @param createClusterRequest
     * @return Result of the CreateCluster operation returned by the service.
     * @throws BadRequestException
     *         Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     * @throws UnauthorizedException
     *         The request is not authorized. The provided credentials couldn't be validated.
     * @throws ForbiddenException
     *         Access forbidden. Check your credentials and then retry your request.
     * @throws ServiceUnavailableException
     *         503 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws ConflictException
     *         This cluster name already exists. Retry your request using another name.
     * @sample AWSKafka.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    CreateClusterResult createCluster(CreateClusterRequest createClusterRequest);

    /**
     * <p>
     * Deletes the MSK cluster specified by the Amazon Resource Name (ARN) in the request.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return Result of the DeleteCluster operation returned by the service.
     * @throws NotFoundException
     *         The resource could not be found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         Access forbidden. Check your credentials and then retry your request.
     * @sample AWSKafka.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DeleteCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteClusterResult deleteCluster(DeleteClusterRequest deleteClusterRequest);

    /**
     * <p>
     * Returns a description of the MSK cluster whose Amazon Resource Name (ARN) is specified in the request.
     * </p>
     * 
     * @param describeClusterRequest
     * @return Result of the DescribeCluster operation returned by the service.
     * @throws NotFoundException
     *         The resource could not be found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         Bad request due to incorrect input. Correct your request and then retry it.
     * @throws UnauthorizedException
     *         The request is not authorized. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         Access forbidden. Check your credentials and then retry your request.
     * @sample AWSKafka.DescribeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DescribeCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeClusterResult describeCluster(DescribeClusterRequest describeClusterRequest);

    /**
     * <p>
     * A list of brokers that a client application can use to bootstrap.
     * </p>
     * 
     * @param getBootstrapBrokersRequest
     * @return Result of the GetBootstrapBrokers operation returned by the service.
     * @throws BadRequestException
     *         Bad request due to incorrect input. Correct your request and then retry it.
     * @throws UnauthorizedException
     *         The request is not authorized. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ConflictException
     *         This cluster name already exists. Retry your request using another name.
     * @throws ForbiddenException
     *         Access forbidden. Check your credentials and then retry your request.
     * @sample AWSKafka.GetBootstrapBrokers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/GetBootstrapBrokers" target="_top">AWS API
     *      Documentation</a>
     */
    GetBootstrapBrokersResult getBootstrapBrokers(GetBootstrapBrokersRequest getBootstrapBrokersRequest);

    /**
     * <p>
     * Returns a list of clusters in an account.
     * </p>
     * 
     * @param listClustersRequest
     * @return Result of the ListClusters operation returned by the service.
     * @throws BadRequestException
     *         Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     * @throws UnauthorizedException
     *         The request is not authorized. The provided credentials couldn't be validated.
     * @throws ForbiddenException
     *         Access forbidden. Check your credentials and then retry your request.
     * @sample AWSKafka.ListClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListClusters" target="_top">AWS API
     *      Documentation</a>
     */
    ListClustersResult listClusters(ListClustersRequest listClustersRequest);

    /**
     * <p>
     * Returns a list of the broker nodes in the cluster.
     * </p>
     * 
     * @param listNodesRequest
     * @return Result of the ListNodes operation returned by the service.
     * @throws NotFoundException
     *         The resource could not be found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         Access forbidden. Check your credentials and then retry your request.
     * @sample AWSKafka.ListNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListNodes" target="_top">AWS API
     *      Documentation</a>
     */
    ListNodesResult listNodes(ListNodesRequest listNodesRequest);

    /**
     * <p>
     * Returns a list of tags attached to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws NotFoundException
     *         The resource could not be found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafka.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Tag a resource with given tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws NotFoundException
     *         The resource could not be found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafka.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Remove tags of a resource by given tag keys.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws NotFoundException
     *         The resource could not be found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafka.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UntagResource" target="_top">AWS API
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
