/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce;

import com.amazonaws.services.elasticmapreduce.model.*;

/**
 * Interface for accessing Amazon EMR asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.elasticmapreduce.AbstractAmazonElasticMapReduceAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon EMR is a web service that makes it easy to process large amounts of data efficiently. Amazon EMR uses Hadoop
 * processing combined with several AWS products to do tasks such as web indexing, data mining, log file analysis,
 * machine learning, scientific simulation, and data warehousing.
 * </p>
 */
public interface AmazonElasticMapReduceAsync extends AmazonElasticMapReduce {

    /**
     * <p>
     * Adds one or more instance groups to a running cluster.
     * </p>
     * 
     * @param addInstanceGroupsRequest
     *        Input to an AddInstanceGroups call.
     * @return A Java Future containing the result of the AddInstanceGroups operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.AddInstanceGroups
     */
    java.util.concurrent.Future<AddInstanceGroupsResult> addInstanceGroupsAsync(AddInstanceGroupsRequest addInstanceGroupsRequest);

    /**
     * <p>
     * Adds one or more instance groups to a running cluster.
     * </p>
     * 
     * @param addInstanceGroupsRequest
     *        Input to an AddInstanceGroups call.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddInstanceGroups operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.AddInstanceGroups
     */
    java.util.concurrent.Future<AddInstanceGroupsResult> addInstanceGroupsAsync(AddInstanceGroupsRequest addInstanceGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<AddInstanceGroupsRequest, AddInstanceGroupsResult> asyncHandler);

    /**
     * <p>
     * AddJobFlowSteps adds new steps to a running job flow. A maximum of 256 steps are allowed in each job flow.
     * </p>
     * <p>
     * If your job flow is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps
     * to process your data. You can bypass the 256-step limitation in various ways, including using the SSH shell to
     * connect to the master node and submitting queries directly to the software running on the master node, such as
     * Hive and Hadoop. For more information on how to do this, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/AddMoreThan256Steps.html">Add More than
     * 256 Steps to a Job Flow</a> in the <i>Amazon EMR Developer's Guide</i>.
     * </p>
     * <p>
     * A step specifies the location of a JAR file stored either on the master node of the job flow or in Amazon S3.
     * Each step is performed by the main function of the main class of the JAR file. The main class can be specified
     * either in the manifest of the JAR or by using the MainFunction parameter of the step.
     * </p>
     * <p>
     * Amazon EMR executes each step in the order listed. For a step to be considered complete, the main function must
     * exit with a zero exit code and all Hadoop jobs started while the step was running must have completed and run
     * successfully.
     * </p>
     * <p>
     * You can only add steps to a job flow that is in one of the following states: STARTING, BOOTSTRAPPING, RUNNING, or
     * WAITING.
     * </p>
     * 
     * @param addJobFlowStepsRequest
     *        The input argument to the <a>AddJobFlowSteps</a> operation.
     * @return A Java Future containing the result of the AddJobFlowSteps operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.AddJobFlowSteps
     */
    java.util.concurrent.Future<AddJobFlowStepsResult> addJobFlowStepsAsync(AddJobFlowStepsRequest addJobFlowStepsRequest);

    /**
     * <p>
     * AddJobFlowSteps adds new steps to a running job flow. A maximum of 256 steps are allowed in each job flow.
     * </p>
     * <p>
     * If your job flow is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps
     * to process your data. You can bypass the 256-step limitation in various ways, including using the SSH shell to
     * connect to the master node and submitting queries directly to the software running on the master node, such as
     * Hive and Hadoop. For more information on how to do this, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/AddMoreThan256Steps.html">Add More than
     * 256 Steps to a Job Flow</a> in the <i>Amazon EMR Developer's Guide</i>.
     * </p>
     * <p>
     * A step specifies the location of a JAR file stored either on the master node of the job flow or in Amazon S3.
     * Each step is performed by the main function of the main class of the JAR file. The main class can be specified
     * either in the manifest of the JAR or by using the MainFunction parameter of the step.
     * </p>
     * <p>
     * Amazon EMR executes each step in the order listed. For a step to be considered complete, the main function must
     * exit with a zero exit code and all Hadoop jobs started while the step was running must have completed and run
     * successfully.
     * </p>
     * <p>
     * You can only add steps to a job flow that is in one of the following states: STARTING, BOOTSTRAPPING, RUNNING, or
     * WAITING.
     * </p>
     * 
     * @param addJobFlowStepsRequest
     *        The input argument to the <a>AddJobFlowSteps</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddJobFlowSteps operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.AddJobFlowSteps
     */
    java.util.concurrent.Future<AddJobFlowStepsResult> addJobFlowStepsAsync(AddJobFlowStepsRequest addJobFlowStepsRequest,
            com.amazonaws.handlers.AsyncHandler<AddJobFlowStepsRequest, AddJobFlowStepsResult> asyncHandler);

    /**
     * <p>
     * Adds tags to an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as grouping
     * clusters to track your Amazon EMR resource allocation costs. For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-plan-tags.html">Tagging Amazon EMR
     * Resources</a>.
     * </p>
     * 
     * @param addTagsRequest
     *        This input identifies a cluster and a list of tags to attach.
     * @return A Java Future containing the result of the AddTags operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.AddTags
     */
    java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest);

    /**
     * <p>
     * Adds tags to an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as grouping
     * clusters to track your Amazon EMR resource allocation costs. For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-plan-tags.html">Tagging Amazon EMR
     * Resources</a>.
     * </p>
     * 
     * @param addTagsRequest
     *        This input identifies a cluster and a list of tags to attach.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTags operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.AddTags
     */
    java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler);

    /**
     * <p>
     * Cancels a pending step or steps in a running cluster. Available only in Amazon EMR versions 4.8.0 and later,
     * excluding version 5.0.0. A maximum of 256 steps are allowed in each CancelSteps request. CancelSteps is
     * idempotent but asynchronous; it does not guarantee a step will be canceled, even if the request is successfully
     * submitted. You can only cancel steps that are in a <code>PENDING</code> state.
     * </p>
     * 
     * @param cancelStepsRequest
     *        The input argument to the <a>CancelSteps</a> operation.
     * @return A Java Future containing the result of the CancelSteps operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.CancelSteps
     */
    java.util.concurrent.Future<CancelStepsResult> cancelStepsAsync(CancelStepsRequest cancelStepsRequest);

    /**
     * <p>
     * Cancels a pending step or steps in a running cluster. Available only in Amazon EMR versions 4.8.0 and later,
     * excluding version 5.0.0. A maximum of 256 steps are allowed in each CancelSteps request. CancelSteps is
     * idempotent but asynchronous; it does not guarantee a step will be canceled, even if the request is successfully
     * submitted. You can only cancel steps that are in a <code>PENDING</code> state.
     * </p>
     * 
     * @param cancelStepsRequest
     *        The input argument to the <a>CancelSteps</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelSteps operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.CancelSteps
     */
    java.util.concurrent.Future<CancelStepsResult> cancelStepsAsync(CancelStepsRequest cancelStepsRequest,
            com.amazonaws.handlers.AsyncHandler<CancelStepsRequest, CancelStepsResult> asyncHandler);

    /**
     * <p>
     * Creates a security configuration, which is stored in the service and can be specified when a cluster is created.
     * </p>
     * 
     * @param createSecurityConfigurationRequest
     * @return A Java Future containing the result of the CreateSecurityConfiguration operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.CreateSecurityConfiguration
     */
    java.util.concurrent.Future<CreateSecurityConfigurationResult> createSecurityConfigurationAsync(
            CreateSecurityConfigurationRequest createSecurityConfigurationRequest);

    /**
     * <p>
     * Creates a security configuration, which is stored in the service and can be specified when a cluster is created.
     * </p>
     * 
     * @param createSecurityConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSecurityConfiguration operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.CreateSecurityConfiguration
     */
    java.util.concurrent.Future<CreateSecurityConfigurationResult> createSecurityConfigurationAsync(
            CreateSecurityConfigurationRequest createSecurityConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSecurityConfigurationRequest, CreateSecurityConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes a security configuration.
     * </p>
     * 
     * @param deleteSecurityConfigurationRequest
     * @return A Java Future containing the result of the DeleteSecurityConfiguration operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.DeleteSecurityConfiguration
     */
    java.util.concurrent.Future<DeleteSecurityConfigurationResult> deleteSecurityConfigurationAsync(
            DeleteSecurityConfigurationRequest deleteSecurityConfigurationRequest);

    /**
     * <p>
     * Deletes a security configuration.
     * </p>
     * 
     * @param deleteSecurityConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSecurityConfiguration operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.DeleteSecurityConfiguration
     */
    java.util.concurrent.Future<DeleteSecurityConfigurationResult> deleteSecurityConfigurationAsync(
            DeleteSecurityConfigurationRequest deleteSecurityConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSecurityConfigurationRequest, DeleteSecurityConfigurationResult> asyncHandler);

    /**
     * <p>
     * Provides cluster-level details including status, hardware and software configuration, VPC settings, and so on.
     * For information about the cluster steps, see <a>ListSteps</a>.
     * </p>
     * 
     * @param describeClusterRequest
     *        This input determines which cluster to describe.
     * @return A Java Future containing the result of the DescribeCluster operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.DescribeCluster
     */
    java.util.concurrent.Future<DescribeClusterResult> describeClusterAsync(DescribeClusterRequest describeClusterRequest);

    /**
     * <p>
     * Provides cluster-level details including status, hardware and software configuration, VPC settings, and so on.
     * For information about the cluster steps, see <a>ListSteps</a>.
     * </p>
     * 
     * @param describeClusterRequest
     *        This input determines which cluster to describe.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCluster operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.DescribeCluster
     */
    java.util.concurrent.Future<DescribeClusterResult> describeClusterAsync(DescribeClusterRequest describeClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterRequest, DescribeClusterResult> asyncHandler);

    /**
     * <p>
     * This API is deprecated and will eventually be removed. We recommend you use <a>ListClusters</a>,
     * <a>DescribeCluster</a>, <a>ListSteps</a>, <a>ListInstanceGroups</a> and <a>ListBootstrapActions</a> instead.
     * </p>
     * <p>
     * DescribeJobFlows returns a list of job flows that match all of the supplied parameters. The parameters can
     * include a list of job flow IDs, job flow states, and restrictions on job flow creation date and time.
     * </p>
     * <p>
     * Regardless of supplied parameters, only job flows created within the last two months are returned.
     * </p>
     * <p>
     * If no parameters are supplied, then job flows matching either of the following criteria are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Job flows created and completed in the last two weeks
     * </p>
     * </li>
     * <li>
     * <p>
     * Job flows created within the last two months that are in one of the following states: <code>RUNNING</code>,
     * <code>WAITING</code>, <code>SHUTTING_DOWN</code>, <code>STARTING</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon EMR can return a maximum of 512 job flow descriptions.
     * </p>
     * 
     * @param describeJobFlowsRequest
     *        The input for the <a>DescribeJobFlows</a> operation.
     * @return A Java Future containing the result of the DescribeJobFlows operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.DescribeJobFlows
     */
    @Deprecated
    java.util.concurrent.Future<DescribeJobFlowsResult> describeJobFlowsAsync(DescribeJobFlowsRequest describeJobFlowsRequest);

    /**
     * <p>
     * This API is deprecated and will eventually be removed. We recommend you use <a>ListClusters</a>,
     * <a>DescribeCluster</a>, <a>ListSteps</a>, <a>ListInstanceGroups</a> and <a>ListBootstrapActions</a> instead.
     * </p>
     * <p>
     * DescribeJobFlows returns a list of job flows that match all of the supplied parameters. The parameters can
     * include a list of job flow IDs, job flow states, and restrictions on job flow creation date and time.
     * </p>
     * <p>
     * Regardless of supplied parameters, only job flows created within the last two months are returned.
     * </p>
     * <p>
     * If no parameters are supplied, then job flows matching either of the following criteria are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Job flows created and completed in the last two weeks
     * </p>
     * </li>
     * <li>
     * <p>
     * Job flows created within the last two months that are in one of the following states: <code>RUNNING</code>,
     * <code>WAITING</code>, <code>SHUTTING_DOWN</code>, <code>STARTING</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon EMR can return a maximum of 512 job flow descriptions.
     * </p>
     * 
     * @param describeJobFlowsRequest
     *        The input for the <a>DescribeJobFlows</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeJobFlows operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.DescribeJobFlows
     */
    @Deprecated
    java.util.concurrent.Future<DescribeJobFlowsResult> describeJobFlowsAsync(DescribeJobFlowsRequest describeJobFlowsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeJobFlowsRequest, DescribeJobFlowsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeJobFlows operation.
     *
     * @see #describeJobFlowsAsync(DescribeJobFlowsRequest)
     */
    @Deprecated
    java.util.concurrent.Future<DescribeJobFlowsResult> describeJobFlowsAsync();

    /**
     * Simplified method form for invoking the DescribeJobFlows operation with an AsyncHandler.
     *
     * @see #describeJobFlowsAsync(DescribeJobFlowsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeJobFlowsResult> describeJobFlowsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeJobFlowsRequest, DescribeJobFlowsResult> asyncHandler);

    /**
     * <p>
     * Provides the details of a security configuration by returning the configuration JSON.
     * </p>
     * 
     * @param describeSecurityConfigurationRequest
     * @return A Java Future containing the result of the DescribeSecurityConfiguration operation returned by the
     *         service.
     * @sample AmazonElasticMapReduceAsync.DescribeSecurityConfiguration
     */
    java.util.concurrent.Future<DescribeSecurityConfigurationResult> describeSecurityConfigurationAsync(
            DescribeSecurityConfigurationRequest describeSecurityConfigurationRequest);

    /**
     * <p>
     * Provides the details of a security configuration by returning the configuration JSON.
     * </p>
     * 
     * @param describeSecurityConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSecurityConfiguration operation returned by the
     *         service.
     * @sample AmazonElasticMapReduceAsyncHandler.DescribeSecurityConfiguration
     */
    java.util.concurrent.Future<DescribeSecurityConfigurationResult> describeSecurityConfigurationAsync(
            DescribeSecurityConfigurationRequest describeSecurityConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSecurityConfigurationRequest, DescribeSecurityConfigurationResult> asyncHandler);

    /**
     * <p>
     * Provides more detail about the cluster step.
     * </p>
     * 
     * @param describeStepRequest
     *        This input determines which step to describe.
     * @return A Java Future containing the result of the DescribeStep operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.DescribeStep
     */
    java.util.concurrent.Future<DescribeStepResult> describeStepAsync(DescribeStepRequest describeStepRequest);

    /**
     * <p>
     * Provides more detail about the cluster step.
     * </p>
     * 
     * @param describeStepRequest
     *        This input determines which step to describe.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStep operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.DescribeStep
     */
    java.util.concurrent.Future<DescribeStepResult> describeStepAsync(DescribeStepRequest describeStepRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStepRequest, DescribeStepResult> asyncHandler);

    /**
     * <p>
     * Provides information about the bootstrap actions associated with a cluster.
     * </p>
     * 
     * @param listBootstrapActionsRequest
     *        This input determines which bootstrap actions to retrieve.
     * @return A Java Future containing the result of the ListBootstrapActions operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.ListBootstrapActions
     */
    java.util.concurrent.Future<ListBootstrapActionsResult> listBootstrapActionsAsync(ListBootstrapActionsRequest listBootstrapActionsRequest);

    /**
     * <p>
     * Provides information about the bootstrap actions associated with a cluster.
     * </p>
     * 
     * @param listBootstrapActionsRequest
     *        This input determines which bootstrap actions to retrieve.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBootstrapActions operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.ListBootstrapActions
     */
    java.util.concurrent.Future<ListBootstrapActionsResult> listBootstrapActionsAsync(ListBootstrapActionsRequest listBootstrapActionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBootstrapActionsRequest, ListBootstrapActionsResult> asyncHandler);

    /**
     * <p>
     * Provides the status of all clusters visible to this AWS account. Allows you to filter the list of clusters based
     * on certain criteria; for example, filtering by cluster creation date and time or by status. This call returns a
     * maximum of 50 clusters per call, but returns a marker to track the paging of the cluster list across multiple
     * ListClusters calls.
     * </p>
     * 
     * @param listClustersRequest
     *        This input determines how the ListClusters action filters the list of clusters that it returns.
     * @return A Java Future containing the result of the ListClusters operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.ListClusters
     */
    java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest listClustersRequest);

    /**
     * <p>
     * Provides the status of all clusters visible to this AWS account. Allows you to filter the list of clusters based
     * on certain criteria; for example, filtering by cluster creation date and time or by status. This call returns a
     * maximum of 50 clusters per call, but returns a marker to track the paging of the cluster list across multiple
     * ListClusters calls.
     * </p>
     * 
     * @param listClustersRequest
     *        This input determines how the ListClusters action filters the list of clusters that it returns.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListClusters operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.ListClusters
     */
    java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest listClustersRequest,
            com.amazonaws.handlers.AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListClusters operation.
     *
     * @see #listClustersAsync(ListClustersRequest)
     */
    java.util.concurrent.Future<ListClustersResult> listClustersAsync();

    /**
     * Simplified method form for invoking the ListClusters operation with an AsyncHandler.
     *
     * @see #listClustersAsync(ListClustersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListClustersResult> listClustersAsync(com.amazonaws.handlers.AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler);

    /**
     * <p>
     * Provides all available details about the instance groups in a cluster.
     * </p>
     * 
     * @param listInstanceGroupsRequest
     *        This input determines which instance groups to retrieve.
     * @return A Java Future containing the result of the ListInstanceGroups operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.ListInstanceGroups
     */
    java.util.concurrent.Future<ListInstanceGroupsResult> listInstanceGroupsAsync(ListInstanceGroupsRequest listInstanceGroupsRequest);

    /**
     * <p>
     * Provides all available details about the instance groups in a cluster.
     * </p>
     * 
     * @param listInstanceGroupsRequest
     *        This input determines which instance groups to retrieve.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInstanceGroups operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.ListInstanceGroups
     */
    java.util.concurrent.Future<ListInstanceGroupsResult> listInstanceGroupsAsync(ListInstanceGroupsRequest listInstanceGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInstanceGroupsRequest, ListInstanceGroupsResult> asyncHandler);

    /**
     * <p>
     * Provides information about the cluster instances that Amazon EMR provisions on behalf of a user when it creates
     * the cluster. For example, this operation indicates when the EC2 instances reach the Ready state, when instances
     * become available to Amazon EMR to use for jobs, and the IP addresses for cluster instances, etc.
     * </p>
     * 
     * @param listInstancesRequest
     *        This input determines which instances to list.
     * @return A Java Future containing the result of the ListInstances operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.ListInstances
     */
    java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest listInstancesRequest);

    /**
     * <p>
     * Provides information about the cluster instances that Amazon EMR provisions on behalf of a user when it creates
     * the cluster. For example, this operation indicates when the EC2 instances reach the Ready state, when instances
     * become available to Amazon EMR to use for jobs, and the IP addresses for cluster instances, etc.
     * </p>
     * 
     * @param listInstancesRequest
     *        This input determines which instances to list.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInstances operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.ListInstances
     */
    java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest listInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListInstancesRequest, ListInstancesResult> asyncHandler);

    /**
     * <p>
     * Lists all the security configurations visible to this account, providing their creation dates and times, and
     * their names. This call returns a maximum of 50 clusters per call, but returns a marker to track the paging of the
     * cluster list across multiple ListSecurityConfigurations calls.
     * </p>
     * 
     * @param listSecurityConfigurationsRequest
     * @return A Java Future containing the result of the ListSecurityConfigurations operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.ListSecurityConfigurations
     */
    java.util.concurrent.Future<ListSecurityConfigurationsResult> listSecurityConfigurationsAsync(
            ListSecurityConfigurationsRequest listSecurityConfigurationsRequest);

    /**
     * <p>
     * Lists all the security configurations visible to this account, providing their creation dates and times, and
     * their names. This call returns a maximum of 50 clusters per call, but returns a marker to track the paging of the
     * cluster list across multiple ListSecurityConfigurations calls.
     * </p>
     * 
     * @param listSecurityConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSecurityConfigurations operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.ListSecurityConfigurations
     */
    java.util.concurrent.Future<ListSecurityConfigurationsResult> listSecurityConfigurationsAsync(
            ListSecurityConfigurationsRequest listSecurityConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSecurityConfigurationsRequest, ListSecurityConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Provides a list of steps for the cluster in reverse order unless you specify stepIds with the request.
     * </p>
     * 
     * @param listStepsRequest
     *        This input determines which steps to list.
     * @return A Java Future containing the result of the ListSteps operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.ListSteps
     */
    java.util.concurrent.Future<ListStepsResult> listStepsAsync(ListStepsRequest listStepsRequest);

    /**
     * <p>
     * Provides a list of steps for the cluster in reverse order unless you specify stepIds with the request.
     * </p>
     * 
     * @param listStepsRequest
     *        This input determines which steps to list.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSteps operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.ListSteps
     */
    java.util.concurrent.Future<ListStepsResult> listStepsAsync(ListStepsRequest listStepsRequest,
            com.amazonaws.handlers.AsyncHandler<ListStepsRequest, ListStepsResult> asyncHandler);

    /**
     * <p>
     * ModifyInstanceGroups modifies the number of nodes and configuration settings of an instance group. The input
     * parameters include the new target instance count for the group and the instance group ID. The call will either
     * succeed or fail atomically.
     * </p>
     * 
     * @param modifyInstanceGroupsRequest
     *        Change the size of some instance groups.
     * @return A Java Future containing the result of the ModifyInstanceGroups operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.ModifyInstanceGroups
     */
    java.util.concurrent.Future<ModifyInstanceGroupsResult> modifyInstanceGroupsAsync(ModifyInstanceGroupsRequest modifyInstanceGroupsRequest);

    /**
     * <p>
     * ModifyInstanceGroups modifies the number of nodes and configuration settings of an instance group. The input
     * parameters include the new target instance count for the group and the instance group ID. The call will either
     * succeed or fail atomically.
     * </p>
     * 
     * @param modifyInstanceGroupsRequest
     *        Change the size of some instance groups.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyInstanceGroups operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.ModifyInstanceGroups
     */
    java.util.concurrent.Future<ModifyInstanceGroupsResult> modifyInstanceGroupsAsync(ModifyInstanceGroupsRequest modifyInstanceGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyInstanceGroupsRequest, ModifyInstanceGroupsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ModifyInstanceGroups operation.
     *
     * @see #modifyInstanceGroupsAsync(ModifyInstanceGroupsRequest)
     */
    java.util.concurrent.Future<ModifyInstanceGroupsResult> modifyInstanceGroupsAsync();

    /**
     * Simplified method form for invoking the ModifyInstanceGroups operation with an AsyncHandler.
     *
     * @see #modifyInstanceGroupsAsync(ModifyInstanceGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ModifyInstanceGroupsResult> modifyInstanceGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<ModifyInstanceGroupsRequest, ModifyInstanceGroupsResult> asyncHandler);

    /**
     * <p>
     * Creates or updates an automatic scaling policy for a core instance group or task instance group in an Amazon EMR
     * cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances
     * in response to the value of a CloudWatch metric.
     * </p>
     * 
     * @param putAutoScalingPolicyRequest
     * @return A Java Future containing the result of the PutAutoScalingPolicy operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.PutAutoScalingPolicy
     */
    java.util.concurrent.Future<PutAutoScalingPolicyResult> putAutoScalingPolicyAsync(PutAutoScalingPolicyRequest putAutoScalingPolicyRequest);

    /**
     * <p>
     * Creates or updates an automatic scaling policy for a core instance group or task instance group in an Amazon EMR
     * cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances
     * in response to the value of a CloudWatch metric.
     * </p>
     * 
     * @param putAutoScalingPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAutoScalingPolicy operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.PutAutoScalingPolicy
     */
    java.util.concurrent.Future<PutAutoScalingPolicyResult> putAutoScalingPolicyAsync(PutAutoScalingPolicyRequest putAutoScalingPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutAutoScalingPolicyRequest, PutAutoScalingPolicyResult> asyncHandler);

    /**
     * <p>
     * Removes an automatic scaling policy from a specified instance group within an EMR cluster.
     * </p>
     * 
     * @param removeAutoScalingPolicyRequest
     * @return A Java Future containing the result of the RemoveAutoScalingPolicy operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.RemoveAutoScalingPolicy
     */
    java.util.concurrent.Future<RemoveAutoScalingPolicyResult> removeAutoScalingPolicyAsync(RemoveAutoScalingPolicyRequest removeAutoScalingPolicyRequest);

    /**
     * <p>
     * Removes an automatic scaling policy from a specified instance group within an EMR cluster.
     * </p>
     * 
     * @param removeAutoScalingPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveAutoScalingPolicy operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.RemoveAutoScalingPolicy
     */
    java.util.concurrent.Future<RemoveAutoScalingPolicyResult> removeAutoScalingPolicyAsync(RemoveAutoScalingPolicyRequest removeAutoScalingPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveAutoScalingPolicyRequest, RemoveAutoScalingPolicyResult> asyncHandler);

    /**
     * <p>
     * Removes tags from an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as
     * grouping clusters to track your Amazon EMR resource allocation costs. For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-plan-tags.html">Tagging Amazon EMR
     * Resources</a>.
     * </p>
     * <p>
     * The following example removes the stack tag with value Prod from a cluster:
     * </p>
     * 
     * @param removeTagsRequest
     *        This input identifies a cluster and a list of tags to remove.
     * @return A Java Future containing the result of the RemoveTags operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.RemoveTags
     */
    java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest);

    /**
     * <p>
     * Removes tags from an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as
     * grouping clusters to track your Amazon EMR resource allocation costs. For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-plan-tags.html">Tagging Amazon EMR
     * Resources</a>.
     * </p>
     * <p>
     * The following example removes the stack tag with value Prod from a cluster:
     * </p>
     * 
     * @param removeTagsRequest
     *        This input identifies a cluster and a list of tags to remove.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTags operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.RemoveTags
     */
    java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler);

    /**
     * <p>
     * RunJobFlow creates and starts running a new job flow. The job flow will run the steps specified. After the job
     * flow completes, the cluster is stopped and the HDFS partition is lost. To prevent loss of data, configure the
     * last step of the job flow to store results in Amazon S3. If the <a>JobFlowInstancesConfig</a>
     * <code>KeepJobFlowAliveWhenNoSteps</code> parameter is set to <code>TRUE</code>, the job flow will transition to
     * the WAITING state rather than shutting down after the steps have completed.
     * </p>
     * <p>
     * For additional protection, you can set the <a>JobFlowInstancesConfig</a> <code>TerminationProtected</code>
     * parameter to <code>TRUE</code> to lock the job flow and prevent it from being terminated by API call, user
     * intervention, or in the event of a job flow error.
     * </p>
     * <p>
     * A maximum of 256 steps are allowed in each job flow.
     * </p>
     * <p>
     * If your job flow is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps
     * to process your data. You can bypass the 256-step limitation in various ways, including using the SSH shell to
     * connect to the master node and submitting queries directly to the software running on the master node, such as
     * Hive and Hadoop. For more information on how to do this, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/Management/Guide/AddMoreThan256Steps.html">Add More than
     * 256 Steps to a Job Flow</a> in the <i>Amazon EMR Management Guide</i>.
     * </p>
     * <p>
     * For long running job flows, we recommend that you periodically store your results.
     * </p>
     * 
     * @param runJobFlowRequest
     *        Input to the <a>RunJobFlow</a> operation.
     * @return A Java Future containing the result of the RunJobFlow operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.RunJobFlow
     */
    java.util.concurrent.Future<RunJobFlowResult> runJobFlowAsync(RunJobFlowRequest runJobFlowRequest);

    /**
     * <p>
     * RunJobFlow creates and starts running a new job flow. The job flow will run the steps specified. After the job
     * flow completes, the cluster is stopped and the HDFS partition is lost. To prevent loss of data, configure the
     * last step of the job flow to store results in Amazon S3. If the <a>JobFlowInstancesConfig</a>
     * <code>KeepJobFlowAliveWhenNoSteps</code> parameter is set to <code>TRUE</code>, the job flow will transition to
     * the WAITING state rather than shutting down after the steps have completed.
     * </p>
     * <p>
     * For additional protection, you can set the <a>JobFlowInstancesConfig</a> <code>TerminationProtected</code>
     * parameter to <code>TRUE</code> to lock the job flow and prevent it from being terminated by API call, user
     * intervention, or in the event of a job flow error.
     * </p>
     * <p>
     * A maximum of 256 steps are allowed in each job flow.
     * </p>
     * <p>
     * If your job flow is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps
     * to process your data. You can bypass the 256-step limitation in various ways, including using the SSH shell to
     * connect to the master node and submitting queries directly to the software running on the master node, such as
     * Hive and Hadoop. For more information on how to do this, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/Management/Guide/AddMoreThan256Steps.html">Add More than
     * 256 Steps to a Job Flow</a> in the <i>Amazon EMR Management Guide</i>.
     * </p>
     * <p>
     * For long running job flows, we recommend that you periodically store your results.
     * </p>
     * 
     * @param runJobFlowRequest
     *        Input to the <a>RunJobFlow</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RunJobFlow operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.RunJobFlow
     */
    java.util.concurrent.Future<RunJobFlowResult> runJobFlowAsync(RunJobFlowRequest runJobFlowRequest,
            com.amazonaws.handlers.AsyncHandler<RunJobFlowRequest, RunJobFlowResult> asyncHandler);

    /**
     * <p>
     * SetTerminationProtection locks a job flow so the EC2 instances in the cluster cannot be terminated by user
     * intervention, an API call, or in the event of a job-flow error. The cluster still terminates upon successful
     * completion of the job flow. Calling SetTerminationProtection on a job flow is analogous to calling the Amazon EC2
     * DisableAPITermination API on all of the EC2 instances in a cluster.
     * </p>
     * <p>
     * SetTerminationProtection is used to prevent accidental termination of a job flow and to ensure that in the event
     * of an error, the instances will persist so you can recover any data stored in their ephemeral instance storage.
     * </p>
     * <p>
     * To terminate a job flow that has been locked by setting SetTerminationProtection to <code>true</code>, you must
     * first unlock the job flow by a subsequent call to SetTerminationProtection in which you set the value to
     * <code>false</code>.
     * </p>
     * <p>
     * For more information, see<a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/UsingEMR_TerminationProtection.html"
     * >Protecting a Job Flow from Termination</a> in the <i>Amazon EMR Guide.</i>
     * </p>
     * 
     * @param setTerminationProtectionRequest
     *        The input argument to the <a>TerminationProtection</a> operation.
     * @return A Java Future containing the result of the SetTerminationProtection operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.SetTerminationProtection
     */
    java.util.concurrent.Future<SetTerminationProtectionResult> setTerminationProtectionAsync(SetTerminationProtectionRequest setTerminationProtectionRequest);

    /**
     * <p>
     * SetTerminationProtection locks a job flow so the EC2 instances in the cluster cannot be terminated by user
     * intervention, an API call, or in the event of a job-flow error. The cluster still terminates upon successful
     * completion of the job flow. Calling SetTerminationProtection on a job flow is analogous to calling the Amazon EC2
     * DisableAPITermination API on all of the EC2 instances in a cluster.
     * </p>
     * <p>
     * SetTerminationProtection is used to prevent accidental termination of a job flow and to ensure that in the event
     * of an error, the instances will persist so you can recover any data stored in their ephemeral instance storage.
     * </p>
     * <p>
     * To terminate a job flow that has been locked by setting SetTerminationProtection to <code>true</code>, you must
     * first unlock the job flow by a subsequent call to SetTerminationProtection in which you set the value to
     * <code>false</code>.
     * </p>
     * <p>
     * For more information, see<a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/UsingEMR_TerminationProtection.html"
     * >Protecting a Job Flow from Termination</a> in the <i>Amazon EMR Guide.</i>
     * </p>
     * 
     * @param setTerminationProtectionRequest
     *        The input argument to the <a>TerminationProtection</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetTerminationProtection operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.SetTerminationProtection
     */
    java.util.concurrent.Future<SetTerminationProtectionResult> setTerminationProtectionAsync(SetTerminationProtectionRequest setTerminationProtectionRequest,
            com.amazonaws.handlers.AsyncHandler<SetTerminationProtectionRequest, SetTerminationProtectionResult> asyncHandler);

    /**
     * <p>
     * Sets whether all AWS Identity and Access Management (IAM) users under your account can access the specified job
     * flows. This action works on running job flows. You can also set the visibility of a job flow when you launch it
     * using the <code>VisibleToAllUsers</code> parameter of <a>RunJobFlow</a>. The SetVisibleToAllUsers action can be
     * called only by an IAM user who created the job flow or the AWS account that owns the job flow.
     * </p>
     * 
     * @param setVisibleToAllUsersRequest
     *        The input to the SetVisibleToAllUsers action.
     * @return A Java Future containing the result of the SetVisibleToAllUsers operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.SetVisibleToAllUsers
     */
    java.util.concurrent.Future<SetVisibleToAllUsersResult> setVisibleToAllUsersAsync(SetVisibleToAllUsersRequest setVisibleToAllUsersRequest);

    /**
     * <p>
     * Sets whether all AWS Identity and Access Management (IAM) users under your account can access the specified job
     * flows. This action works on running job flows. You can also set the visibility of a job flow when you launch it
     * using the <code>VisibleToAllUsers</code> parameter of <a>RunJobFlow</a>. The SetVisibleToAllUsers action can be
     * called only by an IAM user who created the job flow or the AWS account that owns the job flow.
     * </p>
     * 
     * @param setVisibleToAllUsersRequest
     *        The input to the SetVisibleToAllUsers action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetVisibleToAllUsers operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.SetVisibleToAllUsers
     */
    java.util.concurrent.Future<SetVisibleToAllUsersResult> setVisibleToAllUsersAsync(SetVisibleToAllUsersRequest setVisibleToAllUsersRequest,
            com.amazonaws.handlers.AsyncHandler<SetVisibleToAllUsersRequest, SetVisibleToAllUsersResult> asyncHandler);

    /**
     * <p>
     * TerminateJobFlows shuts a list of job flows down. When a job flow is shut down, any step not yet completed is
     * canceled and the EC2 instances on which the job flow is running are stopped. Any log files not already saved are
     * uploaded to Amazon S3 if a LogUri was specified when the job flow was created.
     * </p>
     * <p>
     * The maximum number of JobFlows allowed is 10. The call to TerminateJobFlows is asynchronous. Depending on the
     * configuration of the job flow, it may take up to 1-5 minutes for the job flow to completely terminate and release
     * allocated resources, such as Amazon EC2 instances.
     * </p>
     * 
     * @param terminateJobFlowsRequest
     *        Input to the <a>TerminateJobFlows</a> operation.
     * @return A Java Future containing the result of the TerminateJobFlows operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.TerminateJobFlows
     */
    java.util.concurrent.Future<TerminateJobFlowsResult> terminateJobFlowsAsync(TerminateJobFlowsRequest terminateJobFlowsRequest);

    /**
     * <p>
     * TerminateJobFlows shuts a list of job flows down. When a job flow is shut down, any step not yet completed is
     * canceled and the EC2 instances on which the job flow is running are stopped. Any log files not already saved are
     * uploaded to Amazon S3 if a LogUri was specified when the job flow was created.
     * </p>
     * <p>
     * The maximum number of JobFlows allowed is 10. The call to TerminateJobFlows is asynchronous. Depending on the
     * configuration of the job flow, it may take up to 1-5 minutes for the job flow to completely terminate and release
     * allocated resources, such as Amazon EC2 instances.
     * </p>
     * 
     * @param terminateJobFlowsRequest
     *        Input to the <a>TerminateJobFlows</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TerminateJobFlows operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.TerminateJobFlows
     */
    java.util.concurrent.Future<TerminateJobFlowsResult> terminateJobFlowsAsync(TerminateJobFlowsRequest terminateJobFlowsRequest,
            com.amazonaws.handlers.AsyncHandler<TerminateJobFlowsRequest, TerminateJobFlowsResult> asyncHandler);

}
