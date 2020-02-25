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
 * 
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
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @throws ServiceUnavailableException
     *         <p>
     *         503 response
     *         </p>
     * @throws TooManyRequestsException
     *         <p>
     *         429 response
     *         </p>
     * @throws ConflictException
     *         <p>
     *         This cluster name already exists. Retry your request using another name.
     *         </p>
     * @sample AWSKafka.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    CreateClusterResult createCluster(CreateClusterRequest createClusterRequest);

    /**
     * <p>
     * Creates a new MSK configuration.
     * </p>
     * 
     * @param createConfigurationRequest
     * @return Result of the CreateConfiguration operation returned by the service.
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @throws ServiceUnavailableException
     *         <p>
     *         503 response
     *         </p>
     * @throws TooManyRequestsException
     *         <p>
     *         429 response
     *         </p>
     * @throws ConflictException
     *         <p>
     *         This cluster name already exists. Retry your request using another name.
     *         </p>
     * @sample AWSKafka.CreateConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/CreateConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    CreateConfigurationResult createConfiguration(CreateConfigurationRequest createConfigurationRequest);

    /**
     * <p>
     * Deletes the MSK cluster specified by the Amazon Resource Name (ARN) in the request.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return Result of the DeleteCluster operation returned by the service.
     * @throws NotFoundException
     *         <p>
     *         The resource could not be found due to incorrect input. Correct the input, then retry the request.
     *         </p>
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
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
     *         <p>
     *         The resource could not be found due to incorrect input. Correct the input, then retry the request.
     *         </p>
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @sample AWSKafka.DescribeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DescribeCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeClusterResult describeCluster(DescribeClusterRequest describeClusterRequest);

    /**
     * <p>
     * Returns a description of the cluster operation specified by the ARN.
     * </p>
     * 
     * @param describeClusterOperationRequest
     * @return Result of the DescribeClusterOperation operation returned by the service.
     * @throws NotFoundException
     *         <p>
     *         The resource could not be found due to incorrect input. Correct the input, then retry the request.
     *         </p>
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @sample AWSKafka.DescribeClusterOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DescribeClusterOperation" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeClusterOperationResult describeClusterOperation(DescribeClusterOperationRequest describeClusterOperationRequest);

    /**
     * <p>
     * Returns a description of this MSK configuration.
     * </p>
     * 
     * @param describeConfigurationRequest
     * @return Result of the DescribeConfiguration operation returned by the service.
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @throws NotFoundException
     *         <p>
     *         The resource could not be found due to incorrect input. Correct the input, then retry the request.
     *         </p>
     * @throws ServiceUnavailableException
     *         <p>
     *         503 response
     *         </p>
     * @sample AWSKafka.DescribeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DescribeConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeConfigurationResult describeConfiguration(DescribeConfigurationRequest describeConfigurationRequest);

    /**
     * <p>
     * Returns a description of this revision of the configuration.
     * </p>
     * 
     * @param describeConfigurationRevisionRequest
     * @return Result of the DescribeConfigurationRevision operation returned by the service.
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @throws NotFoundException
     *         <p>
     *         The resource could not be found due to incorrect input. Correct the input, then retry the request.
     *         </p>
     * @throws ServiceUnavailableException
     *         <p>
     *         503 response
     *         </p>
     * @sample AWSKafka.DescribeConfigurationRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DescribeConfigurationRevision"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeConfigurationRevisionResult describeConfigurationRevision(DescribeConfigurationRevisionRequest describeConfigurationRevisionRequest);

    /**
     * <p>
     * A list of brokers that a client application can use to bootstrap.
     * </p>
     * 
     * @param getBootstrapBrokersRequest
     * @return Result of the GetBootstrapBrokers operation returned by the service.
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ConflictException
     *         <p>
     *         This cluster name already exists. Retry your request using another name.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @sample AWSKafka.GetBootstrapBrokers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/GetBootstrapBrokers" target="_top">AWS API
     *      Documentation</a>
     */
    GetBootstrapBrokersResult getBootstrapBrokers(GetBootstrapBrokersRequest getBootstrapBrokersRequest);

    /**
     * <p>
     * Returns a list of all the operations that have been performed on the specified MSK cluster.
     * </p>
     * 
     * @param listClusterOperationsRequest
     * @return Result of the ListClusterOperations operation returned by the service.
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @sample AWSKafka.ListClusterOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListClusterOperations" target="_top">AWS
     *      API Documentation</a>
     */
    ListClusterOperationsResult listClusterOperations(ListClusterOperationsRequest listClusterOperationsRequest);

    /**
     * <p>
     * Returns a list of all the MSK clusters in the current Region.
     * </p>
     * 
     * @param listClustersRequest
     * @return Result of the ListClusters operation returned by the service.
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @sample AWSKafka.ListClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListClusters" target="_top">AWS API
     *      Documentation</a>
     */
    ListClustersResult listClusters(ListClustersRequest listClustersRequest);

    /**
     * <p>
     * Returns a list of all the MSK configurations in this Region.
     * </p>
     * 
     * @param listConfigurationRevisionsRequest
     * @return Result of the ListConfigurationRevisions operation returned by the service.
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @throws NotFoundException
     *         <p>
     *         The resource could not be found due to incorrect input. Correct the input, then retry the request.
     *         </p>
     * @throws ServiceUnavailableException
     *         <p>
     *         503 response
     *         </p>
     * @sample AWSKafka.ListConfigurationRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListConfigurationRevisions"
     *      target="_top">AWS API Documentation</a>
     */
    ListConfigurationRevisionsResult listConfigurationRevisions(ListConfigurationRevisionsRequest listConfigurationRevisionsRequest);

    /**
     * <p>
     * Returns a list of all the MSK configurations in this Region.
     * </p>
     * 
     * @param listConfigurationsRequest
     * @return Result of the ListConfigurations operation returned by the service.
     * @throws ServiceUnavailableException
     *         <p>
     *         503 response
     *         </p>
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @sample AWSKafka.ListConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListConfigurations" target="_top">AWS API
     *      Documentation</a>
     */
    ListConfigurationsResult listConfigurations(ListConfigurationsRequest listConfigurationsRequest);

    /**
     * <p>
     * Returns a list of Kafka versions.
     * </p>
     * 
     * @param listKafkaVersionsRequest
     * @return Result of the ListKafkaVersions operation returned by the service.
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @sample AWSKafka.ListKafkaVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListKafkaVersions" target="_top">AWS API
     *      Documentation</a>
     */
    ListKafkaVersionsResult listKafkaVersions(ListKafkaVersionsRequest listKafkaVersionsRequest);

    /**
     * <p>
     * Returns a list of the broker nodes in the cluster.
     * </p>
     * 
     * @param listNodesRequest
     * @return Result of the ListNodes operation returned by the service.
     * @throws NotFoundException
     *         <p>
     *         The resource could not be found due to incorrect input. Correct the input, then retry the request.
     *         </p>
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @sample AWSKafka.ListNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListNodes" target="_top">AWS API
     *      Documentation</a>
     */
    ListNodesResult listNodes(ListNodesRequest listNodesRequest);

    /**
     * <p>
     * Returns a list of the tags associated with the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws NotFoundException
     *         <p>
     *         The resource could not be found due to incorrect input. Correct the input, then retry the request.
     *         </p>
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @sample AWSKafka.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Adds tags to the specified MSK resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws NotFoundException
     *         <p>
     *         The resource could not be found due to incorrect input. Correct the input, then retry the request.
     *         </p>
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @sample AWSKafka.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the tags associated with the keys that are provided in the query.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws NotFoundException
     *         <p>
     *         The resource could not be found due to incorrect input. Correct the input, then retry the request.
     *         </p>
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @sample AWSKafka.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the number of broker nodes in the cluster.
     * </p>
     * 
     * @param updateBrokerCountRequest
     * @return Result of the UpdateBrokerCount operation returned by the service.
     * @throws ServiceUnavailableException
     *         <p>
     *         503 response
     *         </p>
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @sample AWSKafka.UpdateBrokerCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UpdateBrokerCount" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateBrokerCountResult updateBrokerCount(UpdateBrokerCountRequest updateBrokerCountRequest);

    /**
     * <p>
     * Updates the EBS storage associated with MSK brokers.
     * </p>
     * 
     * @param updateBrokerStorageRequest
     * @return Result of the UpdateBrokerStorage operation returned by the service.
     * @throws ServiceUnavailableException
     *         <p>
     *         503 response
     *         </p>
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @sample AWSKafka.UpdateBrokerStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UpdateBrokerStorage" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateBrokerStorageResult updateBrokerStorage(UpdateBrokerStorageRequest updateBrokerStorageRequest);

    /**
     * <p>
     * Updates the cluster with the configuration that is specified in the request body.
     * </p>
     * 
     * @param updateClusterConfigurationRequest
     * @return Result of the UpdateClusterConfiguration operation returned by the service.
     * @throws BadRequestException
     *         <p>
     *         The request isn't valid because the input is incorrect. Correct your input and then submit it again.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         The request is not authorized. The provided credentials couldn't be validated.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         There was an unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         Access forbidden. Check your credentials and then retry your request.
     *         </p>
     * @throws NotFoundException
     *         <p>
     *         The resource could not be found due to incorrect input. Correct the input, then retry the request.
     *         </p>
     * @throws ServiceUnavailableException
     *         <p>
     *         503 response
     *         </p>
     * @sample AWSKafka.UpdateClusterConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UpdateClusterConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateClusterConfigurationResult updateClusterConfiguration(UpdateClusterConfigurationRequest updateClusterConfigurationRequest);

    /**
     * <p>
     * Updates the monitoring settings for the cluster. You can use this operation to specify which Apache Kafka metrics
     * you want Amazon MSK to send to Amazon CloudWatch. You can also specify settings for open monitoring with
     * Prometheus.
     * </p>
     * 
     * @param updateMonitoringRequest
     *        Request body for UpdateMonitoring.
     * @return Result of the UpdateMonitoring operation returned by the service.
     * @throws ServiceUnavailableException
     *         <p>
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     *         </p>
     * @throws BadRequestException
     *         <p>
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     *         </p>
     * @throws UnauthorizedException
     *         <p>
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     *         </p>
     * @throws InternalServerErrorException
     *         <p>
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     *         </p>
     * @throws ForbiddenException
     *         <p>
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     *         </p>
     * @sample AWSKafka.UpdateMonitoring
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UpdateMonitoring" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateMonitoringResult updateMonitoring(UpdateMonitoringRequest updateMonitoringRequest);

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
