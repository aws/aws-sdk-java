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

import com.amazonaws.services.emrcontainers.model.*;

/**
 * Interface for accessing Amazon EMR Containers asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.emrcontainers.AbstractAmazonEMRContainersAsync} instead.
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
public interface AmazonEMRContainersAsync extends AmazonEMRContainers {

    /**
     * <p>
     * Cancels a job run. A job run is a unit of work, such as a Spark jar, PySpark script, or SparkSQL query, that you
     * submit to Amazon EMR on EKS.
     * </p>
     * 
     * @param cancelJobRunRequest
     * @return A Java Future containing the result of the CancelJobRun operation returned by the service.
     * @sample AmazonEMRContainersAsync.CancelJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/CancelJobRun" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelJobRunResult> cancelJobRunAsync(CancelJobRunRequest cancelJobRunRequest);

    /**
     * <p>
     * Cancels a job run. A job run is a unit of work, such as a Spark jar, PySpark script, or SparkSQL query, that you
     * submit to Amazon EMR on EKS.
     * </p>
     * 
     * @param cancelJobRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelJobRun operation returned by the service.
     * @sample AmazonEMRContainersAsyncHandler.CancelJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/CancelJobRun" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelJobRunResult> cancelJobRunAsync(CancelJobRunRequest cancelJobRunRequest,
            com.amazonaws.handlers.AsyncHandler<CancelJobRunRequest, CancelJobRunResult> asyncHandler);

    /**
     * <p>
     * Creates a managed endpoint. A managed endpoint is a gateway that connects EMR Studio to Amazon EMR on EKS so that
     * EMR Studio can communicate with your virtual cluster.
     * </p>
     * 
     * @param createManagedEndpointRequest
     * @return A Java Future containing the result of the CreateManagedEndpoint operation returned by the service.
     * @sample AmazonEMRContainersAsync.CreateManagedEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/CreateManagedEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateManagedEndpointResult> createManagedEndpointAsync(CreateManagedEndpointRequest createManagedEndpointRequest);

    /**
     * <p>
     * Creates a managed endpoint. A managed endpoint is a gateway that connects EMR Studio to Amazon EMR on EKS so that
     * EMR Studio can communicate with your virtual cluster.
     * </p>
     * 
     * @param createManagedEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateManagedEndpoint operation returned by the service.
     * @sample AmazonEMRContainersAsyncHandler.CreateManagedEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/CreateManagedEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateManagedEndpointResult> createManagedEndpointAsync(CreateManagedEndpointRequest createManagedEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<CreateManagedEndpointRequest, CreateManagedEndpointResult> asyncHandler);

    /**
     * <p>
     * Creates a virtual cluster. Virtual cluster is a managed entity on Amazon EMR on EKS. You can create, describe,
     * list and delete virtual clusters. They do not consume any additional resource in your system. A single virtual
     * cluster maps to a single Kubernetes namespace. Given this relationship, you can model virtual clusters the same
     * way you model Kubernetes namespaces to meet your requirements.
     * </p>
     * 
     * @param createVirtualClusterRequest
     * @return A Java Future containing the result of the CreateVirtualCluster operation returned by the service.
     * @sample AmazonEMRContainersAsync.CreateVirtualCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/CreateVirtualCluster"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVirtualClusterResult> createVirtualClusterAsync(CreateVirtualClusterRequest createVirtualClusterRequest);

    /**
     * <p>
     * Creates a virtual cluster. Virtual cluster is a managed entity on Amazon EMR on EKS. You can create, describe,
     * list and delete virtual clusters. They do not consume any additional resource in your system. A single virtual
     * cluster maps to a single Kubernetes namespace. Given this relationship, you can model virtual clusters the same
     * way you model Kubernetes namespaces to meet your requirements.
     * </p>
     * 
     * @param createVirtualClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVirtualCluster operation returned by the service.
     * @sample AmazonEMRContainersAsyncHandler.CreateVirtualCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/CreateVirtualCluster"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVirtualClusterResult> createVirtualClusterAsync(CreateVirtualClusterRequest createVirtualClusterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVirtualClusterRequest, CreateVirtualClusterResult> asyncHandler);

    /**
     * <p>
     * Deletes a managed endpoint. A managed endpoint is a gateway that connects EMR Studio to Amazon EMR on EKS so that
     * EMR Studio can communicate with your virtual cluster.
     * </p>
     * 
     * @param deleteManagedEndpointRequest
     * @return A Java Future containing the result of the DeleteManagedEndpoint operation returned by the service.
     * @sample AmazonEMRContainersAsync.DeleteManagedEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/DeleteManagedEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteManagedEndpointResult> deleteManagedEndpointAsync(DeleteManagedEndpointRequest deleteManagedEndpointRequest);

    /**
     * <p>
     * Deletes a managed endpoint. A managed endpoint is a gateway that connects EMR Studio to Amazon EMR on EKS so that
     * EMR Studio can communicate with your virtual cluster.
     * </p>
     * 
     * @param deleteManagedEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteManagedEndpoint operation returned by the service.
     * @sample AmazonEMRContainersAsyncHandler.DeleteManagedEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/DeleteManagedEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteManagedEndpointResult> deleteManagedEndpointAsync(DeleteManagedEndpointRequest deleteManagedEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteManagedEndpointRequest, DeleteManagedEndpointResult> asyncHandler);

    /**
     * <p>
     * Deletes a virtual cluster. Virtual cluster is a managed entity on Amazon EMR on EKS. You can create, describe,
     * list and delete virtual clusters. They do not consume any additional resource in your system. A single virtual
     * cluster maps to a single Kubernetes namespace. Given this relationship, you can model virtual clusters the same
     * way you model Kubernetes namespaces to meet your requirements.
     * </p>
     * 
     * @param deleteVirtualClusterRequest
     * @return A Java Future containing the result of the DeleteVirtualCluster operation returned by the service.
     * @sample AmazonEMRContainersAsync.DeleteVirtualCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/DeleteVirtualCluster"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVirtualClusterResult> deleteVirtualClusterAsync(DeleteVirtualClusterRequest deleteVirtualClusterRequest);

    /**
     * <p>
     * Deletes a virtual cluster. Virtual cluster is a managed entity on Amazon EMR on EKS. You can create, describe,
     * list and delete virtual clusters. They do not consume any additional resource in your system. A single virtual
     * cluster maps to a single Kubernetes namespace. Given this relationship, you can model virtual clusters the same
     * way you model Kubernetes namespaces to meet your requirements.
     * </p>
     * 
     * @param deleteVirtualClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVirtualCluster operation returned by the service.
     * @sample AmazonEMRContainersAsyncHandler.DeleteVirtualCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/DeleteVirtualCluster"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVirtualClusterResult> deleteVirtualClusterAsync(DeleteVirtualClusterRequest deleteVirtualClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVirtualClusterRequest, DeleteVirtualClusterResult> asyncHandler);

    /**
     * <p>
     * Displays detailed information about a job run. A job run is a unit of work, such as a Spark jar, PySpark script,
     * or SparkSQL query, that you submit to Amazon EMR on EKS.
     * </p>
     * 
     * @param describeJobRunRequest
     * @return A Java Future containing the result of the DescribeJobRun operation returned by the service.
     * @sample AmazonEMRContainersAsync.DescribeJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/DescribeJobRun" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeJobRunResult> describeJobRunAsync(DescribeJobRunRequest describeJobRunRequest);

    /**
     * <p>
     * Displays detailed information about a job run. A job run is a unit of work, such as a Spark jar, PySpark script,
     * or SparkSQL query, that you submit to Amazon EMR on EKS.
     * </p>
     * 
     * @param describeJobRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeJobRun operation returned by the service.
     * @sample AmazonEMRContainersAsyncHandler.DescribeJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/DescribeJobRun" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeJobRunResult> describeJobRunAsync(DescribeJobRunRequest describeJobRunRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeJobRunRequest, DescribeJobRunResult> asyncHandler);

    /**
     * <p>
     * Displays detailed information about a managed endpoint. A managed endpoint is a gateway that connects EMR Studio
     * to Amazon EMR on EKS so that EMR Studio can communicate with your virtual cluster.
     * </p>
     * 
     * @param describeManagedEndpointRequest
     * @return A Java Future containing the result of the DescribeManagedEndpoint operation returned by the service.
     * @sample AmazonEMRContainersAsync.DescribeManagedEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/DescribeManagedEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeManagedEndpointResult> describeManagedEndpointAsync(DescribeManagedEndpointRequest describeManagedEndpointRequest);

    /**
     * <p>
     * Displays detailed information about a managed endpoint. A managed endpoint is a gateway that connects EMR Studio
     * to Amazon EMR on EKS so that EMR Studio can communicate with your virtual cluster.
     * </p>
     * 
     * @param describeManagedEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeManagedEndpoint operation returned by the service.
     * @sample AmazonEMRContainersAsyncHandler.DescribeManagedEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/DescribeManagedEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeManagedEndpointResult> describeManagedEndpointAsync(DescribeManagedEndpointRequest describeManagedEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeManagedEndpointRequest, DescribeManagedEndpointResult> asyncHandler);

    /**
     * <p>
     * Displays detailed information about a specified virtual cluster. Virtual cluster is a managed entity on Amazon
     * EMR on EKS. You can create, describe, list and delete virtual clusters. They do not consume any additional
     * resource in your system. A single virtual cluster maps to a single Kubernetes namespace. Given this relationship,
     * you can model virtual clusters the same way you model Kubernetes namespaces to meet your requirements.
     * </p>
     * 
     * @param describeVirtualClusterRequest
     * @return A Java Future containing the result of the DescribeVirtualCluster operation returned by the service.
     * @sample AmazonEMRContainersAsync.DescribeVirtualCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/DescribeVirtualCluster"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVirtualClusterResult> describeVirtualClusterAsync(DescribeVirtualClusterRequest describeVirtualClusterRequest);

    /**
     * <p>
     * Displays detailed information about a specified virtual cluster. Virtual cluster is a managed entity on Amazon
     * EMR on EKS. You can create, describe, list and delete virtual clusters. They do not consume any additional
     * resource in your system. A single virtual cluster maps to a single Kubernetes namespace. Given this relationship,
     * you can model virtual clusters the same way you model Kubernetes namespaces to meet your requirements.
     * </p>
     * 
     * @param describeVirtualClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVirtualCluster operation returned by the service.
     * @sample AmazonEMRContainersAsyncHandler.DescribeVirtualCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/DescribeVirtualCluster"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVirtualClusterResult> describeVirtualClusterAsync(DescribeVirtualClusterRequest describeVirtualClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVirtualClusterRequest, DescribeVirtualClusterResult> asyncHandler);

    /**
     * <p>
     * Lists job runs based on a set of parameters. A job run is a unit of work, such as a Spark jar, PySpark script, or
     * SparkSQL query, that you submit to Amazon EMR on EKS.
     * </p>
     * 
     * @param listJobRunsRequest
     * @return A Java Future containing the result of the ListJobRuns operation returned by the service.
     * @sample AmazonEMRContainersAsync.ListJobRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/ListJobRuns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobRunsResult> listJobRunsAsync(ListJobRunsRequest listJobRunsRequest);

    /**
     * <p>
     * Lists job runs based on a set of parameters. A job run is a unit of work, such as a Spark jar, PySpark script, or
     * SparkSQL query, that you submit to Amazon EMR on EKS.
     * </p>
     * 
     * @param listJobRunsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJobRuns operation returned by the service.
     * @sample AmazonEMRContainersAsyncHandler.ListJobRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/ListJobRuns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobRunsResult> listJobRunsAsync(ListJobRunsRequest listJobRunsRequest,
            com.amazonaws.handlers.AsyncHandler<ListJobRunsRequest, ListJobRunsResult> asyncHandler);

    /**
     * <p>
     * Lists managed endpoints based on a set of parameters. A managed endpoint is a gateway that connects EMR Studio to
     * Amazon EMR on EKS so that EMR Studio can communicate with your virtual cluster.
     * </p>
     * 
     * @param listManagedEndpointsRequest
     * @return A Java Future containing the result of the ListManagedEndpoints operation returned by the service.
     * @sample AmazonEMRContainersAsync.ListManagedEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/ListManagedEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListManagedEndpointsResult> listManagedEndpointsAsync(ListManagedEndpointsRequest listManagedEndpointsRequest);

    /**
     * <p>
     * Lists managed endpoints based on a set of parameters. A managed endpoint is a gateway that connects EMR Studio to
     * Amazon EMR on EKS so that EMR Studio can communicate with your virtual cluster.
     * </p>
     * 
     * @param listManagedEndpointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListManagedEndpoints operation returned by the service.
     * @sample AmazonEMRContainersAsyncHandler.ListManagedEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/ListManagedEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListManagedEndpointsResult> listManagedEndpointsAsync(ListManagedEndpointsRequest listManagedEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<ListManagedEndpointsRequest, ListManagedEndpointsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags assigned to the resources.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonEMRContainersAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags assigned to the resources.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonEMRContainersAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists information about the specified virtual cluster. Virtual cluster is a managed entity on Amazon EMR on EKS.
     * You can create, describe, list and delete virtual clusters. They do not consume any additional resource in your
     * system. A single virtual cluster maps to a single Kubernetes namespace. Given this relationship, you can model
     * virtual clusters the same way you model Kubernetes namespaces to meet your requirements.
     * </p>
     * 
     * @param listVirtualClustersRequest
     * @return A Java Future containing the result of the ListVirtualClusters operation returned by the service.
     * @sample AmazonEMRContainersAsync.ListVirtualClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/ListVirtualClusters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVirtualClustersResult> listVirtualClustersAsync(ListVirtualClustersRequest listVirtualClustersRequest);

    /**
     * <p>
     * Lists information about the specified virtual cluster. Virtual cluster is a managed entity on Amazon EMR on EKS.
     * You can create, describe, list and delete virtual clusters. They do not consume any additional resource in your
     * system. A single virtual cluster maps to a single Kubernetes namespace. Given this relationship, you can model
     * virtual clusters the same way you model Kubernetes namespaces to meet your requirements.
     * </p>
     * 
     * @param listVirtualClustersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVirtualClusters operation returned by the service.
     * @sample AmazonEMRContainersAsyncHandler.ListVirtualClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/ListVirtualClusters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVirtualClustersResult> listVirtualClustersAsync(ListVirtualClustersRequest listVirtualClustersRequest,
            com.amazonaws.handlers.AsyncHandler<ListVirtualClustersRequest, ListVirtualClustersResult> asyncHandler);

    /**
     * <p>
     * Starts a job run. A job run is a unit of work, such as a Spark jar, PySpark script, or SparkSQL query, that you
     * submit to Amazon EMR on EKS.
     * </p>
     * 
     * @param startJobRunRequest
     * @return A Java Future containing the result of the StartJobRun operation returned by the service.
     * @sample AmazonEMRContainersAsync.StartJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/StartJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartJobRunResult> startJobRunAsync(StartJobRunRequest startJobRunRequest);

    /**
     * <p>
     * Starts a job run. A job run is a unit of work, such as a Spark jar, PySpark script, or SparkSQL query, that you
     * submit to Amazon EMR on EKS.
     * </p>
     * 
     * @param startJobRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartJobRun operation returned by the service.
     * @sample AmazonEMRContainersAsyncHandler.StartJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/StartJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartJobRunResult> startJobRunAsync(StartJobRunRequest startJobRunRequest,
            com.amazonaws.handlers.AsyncHandler<StartJobRunRequest, StartJobRunResult> asyncHandler);

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
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonEMRContainersAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonEMRContainersAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from resources.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonEMRContainersAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from resources.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonEMRContainersAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

}
