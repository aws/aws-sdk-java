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
package com.amazonaws.services.emrcontainers;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.emrcontainers.model.*;

/**
 * Interface for accessing Amazon EMR Containers.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.emrcontainers.AbstractAmazonEMRContainers} instead.
 * </p>
 * <p>
 * <p>
 * Amazon EMR on EKS provides a deployment option for Amazon EMR that allows you to run open-source big data frameworks
 * on Amazon Elastic Kubernetes Service (Amazon EKS). With this deployment option, you can focus on running analytics
 * workloads while Amazon EMR on EKS builds, configures, and manages containers for open-source applications. For more
 * information about Amazon EMR on EKS concepts and tasks, see <a
 * href="https://docs.aws.amazon.com/emr/latest/EMR-on-EKS-DevelopmentGuide/emr-eks.html">What is Amazon EMR on EKS</a>.
 * </p>
 * <p>
 * <i>Amazon EMR containers</i> is the API name for Amazon EMR on EKS. The <code>emr-containers</code> prefix is used in
 * the following scenarios:
 * </p>
 * <ul>
 * <li>
 * <p>
 * It is the prefix in the CLI commands for Amazon EMR on EKS. For example,
 * <code>aws emr-containers start-job-run</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * It is the prefix before IAM policy actions for Amazon EMR on EKS. For example,
 * <code>"Action": [ "emr-containers:StartJobRun"]</code>. For more information, see <a href=
 * "https://docs.aws.amazon.com/emr/latest/EMR-on-EKS-DevelopmentGuide/security_iam_service-with-iam.html#security_iam_service-with-iam-id-based-policies-actions"
 * >Policy actions for Amazon EMR on EKS</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * It is the prefix used in Amazon EMR on EKS service endpoints. For example,
 * <code>emr-containers.us-east-2.amazonaws.com</code>. For more information, see <a
 * href="https://docs.aws.amazon.com/emr/latest/EMR-on-EKS-DevelopmentGuide/service-quotas.html#service-endpoints"
 * >Amazon EMR on EKS Service Endpoints</a>.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonEMRContainers {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "emr-containers";

    /**
     * <p>
     * Cancels a job run. A job run is a unit of work, such as a Spark jar, PySpark script, or SparkSQL query, that you
     * submit to Amazon EMR on EKS.
     * </p>
     * 
     * @param cancelJobRunRequest
     * @return Result of the CancelJobRun operation returned by the service.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @sample AmazonEMRContainers.CancelJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/CancelJobRun" target="_top">AWS
     *      API Documentation</a>
     */
    CancelJobRunResult cancelJobRun(CancelJobRunRequest cancelJobRunRequest);

    /**
     * <p>
     * Creates a managed endpoint. A managed endpoint is a gateway that connects EMR Studio to Amazon EMR on EKS so that
     * EMR Studio can communicate with your virtual cluster.
     * </p>
     * 
     * @param createManagedEndpointRequest
     * @return Result of the CreateManagedEndpoint operation returned by the service.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @sample AmazonEMRContainers.CreateManagedEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/CreateManagedEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    CreateManagedEndpointResult createManagedEndpoint(CreateManagedEndpointRequest createManagedEndpointRequest);

    /**
     * <p>
     * Creates a virtual cluster. Virtual cluster is a managed entity on Amazon EMR on EKS. You can create, describe,
     * list and delete virtual clusters. They do not consume any additional resource in your system. A single virtual
     * cluster maps to a single Kubernetes namespace. Given this relationship, you can model virtual clusters the same
     * way you model Kubernetes namespaces to meet your requirements.
     * </p>
     * 
     * @param createVirtualClusterRequest
     * @return Result of the CreateVirtualCluster operation returned by the service.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @sample AmazonEMRContainers.CreateVirtualCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/CreateVirtualCluster"
     *      target="_top">AWS API Documentation</a>
     */
    CreateVirtualClusterResult createVirtualCluster(CreateVirtualClusterRequest createVirtualClusterRequest);

    /**
     * <p>
     * Deletes a managed endpoint. A managed endpoint is a gateway that connects EMR Studio to Amazon EMR on EKS so that
     * EMR Studio can communicate with your virtual cluster.
     * </p>
     * 
     * @param deleteManagedEndpointRequest
     * @return Result of the DeleteManagedEndpoint operation returned by the service.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @sample AmazonEMRContainers.DeleteManagedEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/DeleteManagedEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteManagedEndpointResult deleteManagedEndpoint(DeleteManagedEndpointRequest deleteManagedEndpointRequest);

    /**
     * <p>
     * Deletes a virtual cluster. Virtual cluster is a managed entity on Amazon EMR on EKS. You can create, describe,
     * list and delete virtual clusters. They do not consume any additional resource in your system. A single virtual
     * cluster maps to a single Kubernetes namespace. Given this relationship, you can model virtual clusters the same
     * way you model Kubernetes namespaces to meet your requirements.
     * </p>
     * 
     * @param deleteVirtualClusterRequest
     * @return Result of the DeleteVirtualCluster operation returned by the service.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @sample AmazonEMRContainers.DeleteVirtualCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/DeleteVirtualCluster"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVirtualClusterResult deleteVirtualCluster(DeleteVirtualClusterRequest deleteVirtualClusterRequest);

    /**
     * <p>
     * Displays detailed information about a job run. A job run is a unit of work, such as a Spark jar, PySpark script,
     * or SparkSQL query, that you submit to Amazon EMR on EKS.
     * </p>
     * 
     * @param describeJobRunRequest
     * @return Result of the DescribeJobRun operation returned by the service.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @sample AmazonEMRContainers.DescribeJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/DescribeJobRun" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeJobRunResult describeJobRun(DescribeJobRunRequest describeJobRunRequest);

    /**
     * <p>
     * Displays detailed information about a managed endpoint. A managed endpoint is a gateway that connects EMR Studio
     * to Amazon EMR on EKS so that EMR Studio can communicate with your virtual cluster.
     * </p>
     * 
     * @param describeManagedEndpointRequest
     * @return Result of the DescribeManagedEndpoint operation returned by the service.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @sample AmazonEMRContainers.DescribeManagedEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/DescribeManagedEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeManagedEndpointResult describeManagedEndpoint(DescribeManagedEndpointRequest describeManagedEndpointRequest);

    /**
     * <p>
     * Displays detailed information about a specified virtual cluster. Virtual cluster is a managed entity on Amazon
     * EMR on EKS. You can create, describe, list and delete virtual clusters. They do not consume any additional
     * resource in your system. A single virtual cluster maps to a single Kubernetes namespace. Given this relationship,
     * you can model virtual clusters the same way you model Kubernetes namespaces to meet your requirements.
     * </p>
     * 
     * @param describeVirtualClusterRequest
     * @return Result of the DescribeVirtualCluster operation returned by the service.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @sample AmazonEMRContainers.DescribeVirtualCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/DescribeVirtualCluster"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeVirtualClusterResult describeVirtualCluster(DescribeVirtualClusterRequest describeVirtualClusterRequest);

    /**
     * <p>
     * Lists job runs based on a set of parameters. A job run is a unit of work, such as a Spark jar, PySpark script, or
     * SparkSQL query, that you submit to Amazon EMR on EKS.
     * </p>
     * 
     * @param listJobRunsRequest
     * @return Result of the ListJobRuns operation returned by the service.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @sample AmazonEMRContainers.ListJobRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/ListJobRuns" target="_top">AWS API
     *      Documentation</a>
     */
    ListJobRunsResult listJobRuns(ListJobRunsRequest listJobRunsRequest);

    /**
     * <p>
     * Lists managed endpoints based on a set of parameters. A managed endpoint is a gateway that connects EMR Studio to
     * Amazon EMR on EKS so that EMR Studio can communicate with your virtual cluster.
     * </p>
     * 
     * @param listManagedEndpointsRequest
     * @return Result of the ListManagedEndpoints operation returned by the service.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @sample AmazonEMRContainers.ListManagedEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/ListManagedEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    ListManagedEndpointsResult listManagedEndpoints(ListManagedEndpointsRequest listManagedEndpointsRequest);

    /**
     * <p>
     * Lists the tags assigned to the resources.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonEMRContainers.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists information about the specified virtual cluster. Virtual cluster is a managed entity on Amazon EMR on EKS.
     * You can create, describe, list and delete virtual clusters. They do not consume any additional resource in your
     * system. A single virtual cluster maps to a single Kubernetes namespace. Given this relationship, you can model
     * virtual clusters the same way you model Kubernetes namespaces to meet your requirements.
     * </p>
     * 
     * @param listVirtualClustersRequest
     * @return Result of the ListVirtualClusters operation returned by the service.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @sample AmazonEMRContainers.ListVirtualClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/ListVirtualClusters"
     *      target="_top">AWS API Documentation</a>
     */
    ListVirtualClustersResult listVirtualClusters(ListVirtualClustersRequest listVirtualClustersRequest);

    /**
     * <p>
     * Starts a job run. A job run is a unit of work, such as a Spark jar, PySpark script, or SparkSQL query, that you
     * submit to Amazon EMR on EKS.
     * </p>
     * 
     * @param startJobRunRequest
     * @return Result of the StartJobRun operation returned by the service.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @sample AmazonEMRContainers.StartJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/StartJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    StartJobRunResult startJobRun(StartJobRunRequest startJobRunRequest);

    /**
     * <p>
     * Assigns tags to resources. A tag is a label that you assign to an AWS resource. Each tag consists of a key and an
     * optional value, both of which you define. Tags enable you to categorize your AWS resources by attributes such as
     * purpose, owner, or environment. When you have many resources of the same type, you can quickly identify a
     * specific resource based on the tags you've assigned to it. For example, you can define a set of tags for your
     * Amazon EMR on EKS clusters to help you track each cluster's owner and stack level. We recommend that you devise a
     * consistent set of tag keys for each resource type. You can then search and filter the resources based on the tags
     * that you add.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonEMRContainers.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from resources.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonEMRContainers.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
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
