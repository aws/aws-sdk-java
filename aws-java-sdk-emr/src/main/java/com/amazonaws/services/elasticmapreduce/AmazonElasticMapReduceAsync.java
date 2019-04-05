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
package com.amazonaws.services.elasticmapreduce;

import javax.annotation.Generated;

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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonElasticMapReduceAsync extends AmazonElasticMapReduce {

    /**
     * <p>
     * Adds an instance fleet to a running cluster.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x.
     * </p>
     * </note>
     * 
     * @param addInstanceFleetRequest
     * @return A Java Future containing the result of the AddInstanceFleet operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.AddInstanceFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/AddInstanceFleet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddInstanceFleetResult> addInstanceFleetAsync(AddInstanceFleetRequest addInstanceFleetRequest);

    /**
     * <p>
     * Adds an instance fleet to a running cluster.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x.
     * </p>
     * </note>
     * 
     * @param addInstanceFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddInstanceFleet operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.AddInstanceFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/AddInstanceFleet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddInstanceFleetResult> addInstanceFleetAsync(AddInstanceFleetRequest addInstanceFleetRequest,
            com.amazonaws.handlers.AsyncHandler<AddInstanceFleetRequest, AddInstanceFleetResult> asyncHandler);

    /**
     * <p>
     * Adds one or more instance groups to a running cluster.
     * </p>
     * 
     * @param addInstanceGroupsRequest
     *        Input to an AddInstanceGroups call.
     * @return A Java Future containing the result of the AddInstanceGroups operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.AddInstanceGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/AddInstanceGroups"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/AddInstanceGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddInstanceGroupsResult> addInstanceGroupsAsync(AddInstanceGroupsRequest addInstanceGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<AddInstanceGroupsRequest, AddInstanceGroupsResult> asyncHandler);

    /**
     * <p>
     * AddJobFlowSteps adds new steps to a running cluster. A maximum of 256 steps are allowed in each job flow.
     * </p>
     * <p>
     * If your cluster is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps
     * to process your data. You can bypass the 256-step limitation in various ways, including using SSH to connect to
     * the master node and submitting queries directly to the software running on the master node, such as Hive and
     * Hadoop. For more information on how to do this, see <a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/AddMoreThan256Steps.html">Add More than 256 Steps to
     * a Cluster</a> in the <i>Amazon EMR Management Guide</i>.
     * </p>
     * <p>
     * A step specifies the location of a JAR file stored either on the master node of the cluster or in Amazon S3. Each
     * step is performed by the main function of the main class of the JAR file. The main class can be specified either
     * in the manifest of the JAR or by using the MainFunction parameter of the step.
     * </p>
     * <p>
     * Amazon EMR executes each step in the order listed. For a step to be considered complete, the main function must
     * exit with a zero exit code and all Hadoop jobs started while the step was running must have completed and run
     * successfully.
     * </p>
     * <p>
     * You can only add steps to a cluster that is in one of the following states: STARTING, BOOTSTRAPPING, RUNNING, or
     * WAITING.
     * </p>
     * 
     * @param addJobFlowStepsRequest
     *        The input argument to the <a>AddJobFlowSteps</a> operation.
     * @return A Java Future containing the result of the AddJobFlowSteps operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.AddJobFlowSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/AddJobFlowSteps"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddJobFlowStepsResult> addJobFlowStepsAsync(AddJobFlowStepsRequest addJobFlowStepsRequest);

    /**
     * <p>
     * AddJobFlowSteps adds new steps to a running cluster. A maximum of 256 steps are allowed in each job flow.
     * </p>
     * <p>
     * If your cluster is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps
     * to process your data. You can bypass the 256-step limitation in various ways, including using SSH to connect to
     * the master node and submitting queries directly to the software running on the master node, such as Hive and
     * Hadoop. For more information on how to do this, see <a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/AddMoreThan256Steps.html">Add More than 256 Steps to
     * a Cluster</a> in the <i>Amazon EMR Management Guide</i>.
     * </p>
     * <p>
     * A step specifies the location of a JAR file stored either on the master node of the cluster or in Amazon S3. Each
     * step is performed by the main function of the main class of the JAR file. The main class can be specified either
     * in the manifest of the JAR or by using the MainFunction parameter of the step.
     * </p>
     * <p>
     * Amazon EMR executes each step in the order listed. For a step to be considered complete, the main function must
     * exit with a zero exit code and all Hadoop jobs started while the step was running must have completed and run
     * successfully.
     * </p>
     * <p>
     * You can only add steps to a cluster that is in one of the following states: STARTING, BOOTSTRAPPING, RUNNING, or
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/AddJobFlowSteps"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddJobFlowStepsResult> addJobFlowStepsAsync(AddJobFlowStepsRequest addJobFlowStepsRequest,
            com.amazonaws.handlers.AsyncHandler<AddJobFlowStepsRequest, AddJobFlowStepsResult> asyncHandler);

    /**
     * <p>
     * Adds tags to an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as grouping
     * clusters to track your Amazon EMR resource allocation costs. For more information, see <a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html">Tag Clusters</a>.
     * </p>
     * 
     * @param addTagsRequest
     *        This input identifies a cluster and a list of tags to attach.
     * @return A Java Future containing the result of the AddTags operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.AddTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/AddTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest);

    /**
     * <p>
     * Adds tags to an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as grouping
     * clusters to track your Amazon EMR resource allocation costs. For more information, see <a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html">Tag Clusters</a>.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/AddTags" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/CancelSteps" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/CancelSteps" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/CreateSecurityConfiguration"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/CreateSecurityConfiguration"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/DeleteSecurityConfiguration"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/DeleteSecurityConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSecurityConfigurationResult> deleteSecurityConfigurationAsync(
            DeleteSecurityConfigurationRequest deleteSecurityConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSecurityConfigurationRequest, DeleteSecurityConfigurationResult> asyncHandler);

    /**
     * <p>
     * Provides cluster-level details including status, hardware and software configuration, VPC settings, and so on.
     * </p>
     * 
     * @param describeClusterRequest
     *        This input determines which cluster to describe.
     * @return A Java Future containing the result of the DescribeCluster operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.DescribeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/DescribeCluster"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClusterResult> describeClusterAsync(DescribeClusterRequest describeClusterRequest);

    /**
     * <p>
     * Provides cluster-level details including status, hardware and software configuration, VPC settings, and so on.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/DescribeCluster"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/DescribeJobFlows"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/DescribeJobFlows"
     *      target="_top">AWS API Documentation</a>
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
    @Deprecated
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/DescribeSecurityConfiguration"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/DescribeSecurityConfiguration"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/DescribeStep" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/DescribeStep" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListBootstrapActions"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListBootstrapActions"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListClusters" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListClusters" target="_top">AWS
     *      API Documentation</a>
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
     * Lists all available details about the instance fleets in a cluster.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x
     * versions.
     * </p>
     * </note>
     * 
     * @param listInstanceFleetsRequest
     * @return A Java Future containing the result of the ListInstanceFleets operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.ListInstanceFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListInstanceFleets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInstanceFleetsResult> listInstanceFleetsAsync(ListInstanceFleetsRequest listInstanceFleetsRequest);

    /**
     * <p>
     * Lists all available details about the instance fleets in a cluster.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x
     * versions.
     * </p>
     * </note>
     * 
     * @param listInstanceFleetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInstanceFleets operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.ListInstanceFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListInstanceFleets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInstanceFleetsResult> listInstanceFleetsAsync(ListInstanceFleetsRequest listInstanceFleetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInstanceFleetsRequest, ListInstanceFleetsResult> asyncHandler);

    /**
     * <p>
     * Provides all available details about the instance groups in a cluster.
     * </p>
     * 
     * @param listInstanceGroupsRequest
     *        This input determines which instance groups to retrieve.
     * @return A Java Future containing the result of the ListInstanceGroups operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.ListInstanceGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListInstanceGroups"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListInstanceGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInstanceGroupsResult> listInstanceGroupsAsync(ListInstanceGroupsRequest listInstanceGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInstanceGroupsRequest, ListInstanceGroupsResult> asyncHandler);

    /**
     * <p>
     * Provides information for all active EC2 instances and EC2 instances terminated in the last 30 days, up to a
     * maximum of 2,000. EC2 instances in any of the following states are considered active: AWAITING_FULFILLMENT,
     * PROVISIONING, BOOTSTRAPPING, RUNNING.
     * </p>
     * 
     * @param listInstancesRequest
     *        This input determines which instances to list.
     * @return A Java Future containing the result of the ListInstances operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.ListInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest listInstancesRequest);

    /**
     * <p>
     * Provides information for all active EC2 instances and EC2 instances terminated in the last 30 days, up to a
     * maximum of 2,000. EC2 instances in any of the following states are considered active: AWAITING_FULFILLMENT,
     * PROVISIONING, BOOTSTRAPPING, RUNNING.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListInstances" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListSecurityConfigurations"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListSecurityConfigurations"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListSteps" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListSteps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStepsResult> listStepsAsync(ListStepsRequest listStepsRequest,
            com.amazonaws.handlers.AsyncHandler<ListStepsRequest, ListStepsResult> asyncHandler);

    /**
     * <p>
     * Modifies the target On-Demand and target Spot capacities for the instance fleet with the specified
     * InstanceFleetID within the cluster specified using ClusterID. The call either succeeds or fails atomically.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x
     * versions.
     * </p>
     * </note>
     * 
     * @param modifyInstanceFleetRequest
     * @return A Java Future containing the result of the ModifyInstanceFleet operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.ModifyInstanceFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ModifyInstanceFleet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyInstanceFleetResult> modifyInstanceFleetAsync(ModifyInstanceFleetRequest modifyInstanceFleetRequest);

    /**
     * <p>
     * Modifies the target On-Demand and target Spot capacities for the instance fleet with the specified
     * InstanceFleetID within the cluster specified using ClusterID. The call either succeeds or fails atomically.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x
     * versions.
     * </p>
     * </note>
     * 
     * @param modifyInstanceFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyInstanceFleet operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.ModifyInstanceFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ModifyInstanceFleet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyInstanceFleetResult> modifyInstanceFleetAsync(ModifyInstanceFleetRequest modifyInstanceFleetRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyInstanceFleetRequest, ModifyInstanceFleetResult> asyncHandler);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ModifyInstanceGroups"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ModifyInstanceGroups"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/PutAutoScalingPolicy"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/PutAutoScalingPolicy"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/RemoveAutoScalingPolicy"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/RemoveAutoScalingPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveAutoScalingPolicyResult> removeAutoScalingPolicyAsync(RemoveAutoScalingPolicyRequest removeAutoScalingPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveAutoScalingPolicyRequest, RemoveAutoScalingPolicyResult> asyncHandler);

    /**
     * <p>
     * Removes tags from an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as
     * grouping clusters to track your Amazon EMR resource allocation costs. For more information, see <a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html">Tag Clusters</a>.
     * </p>
     * <p>
     * The following example removes the stack tag with value Prod from a cluster:
     * </p>
     * 
     * @param removeTagsRequest
     *        This input identifies a cluster and a list of tags to remove.
     * @return A Java Future containing the result of the RemoveTags operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.RemoveTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/RemoveTags" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest);

    /**
     * <p>
     * Removes tags from an Amazon EMR resource. Tags make it easier to associate clusters in various ways, such as
     * grouping clusters to track your Amazon EMR resource allocation costs. For more information, see <a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html">Tag Clusters</a>.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/RemoveTags" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler);

    /**
     * <p>
     * RunJobFlow creates and starts running a new cluster (job flow). The cluster runs the steps specified. After the
     * steps complete, the cluster stops and the HDFS partition is lost. To prevent loss of data, configure the last
     * step of the job flow to store results in Amazon S3. If the <a>JobFlowInstancesConfig</a>
     * <code>KeepJobFlowAliveWhenNoSteps</code> parameter is set to <code>TRUE</code>, the cluster transitions to the
     * WAITING state rather than shutting down after the steps have completed.
     * </p>
     * <p>
     * For additional protection, you can set the <a>JobFlowInstancesConfig</a> <code>TerminationProtected</code>
     * parameter to <code>TRUE</code> to lock the cluster and prevent it from being terminated by API call, user
     * intervention, or in the event of a job flow error.
     * </p>
     * <p>
     * A maximum of 256 steps are allowed in each job flow.
     * </p>
     * <p>
     * If your cluster is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps
     * to process your data. You can bypass the 256-step limitation in various ways, including using the SSH shell to
     * connect to the master node and submitting queries directly to the software running on the master node, such as
     * Hive and Hadoop. For more information on how to do this, see <a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/AddMoreThan256Steps.html">Add More than 256 Steps to
     * a Cluster</a> in the <i>Amazon EMR Management Guide</i>.
     * </p>
     * <p>
     * For long running clusters, we recommend that you periodically store your results.
     * </p>
     * <note>
     * <p>
     * The instance fleets configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x
     * versions. The RunJobFlow request can contain InstanceFleets parameters or InstanceGroups parameters, but not
     * both.
     * </p>
     * </note>
     * 
     * @param runJobFlowRequest
     *        Input to the <a>RunJobFlow</a> operation.
     * @return A Java Future containing the result of the RunJobFlow operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.RunJobFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/RunJobFlow" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RunJobFlowResult> runJobFlowAsync(RunJobFlowRequest runJobFlowRequest);

    /**
     * <p>
     * RunJobFlow creates and starts running a new cluster (job flow). The cluster runs the steps specified. After the
     * steps complete, the cluster stops and the HDFS partition is lost. To prevent loss of data, configure the last
     * step of the job flow to store results in Amazon S3. If the <a>JobFlowInstancesConfig</a>
     * <code>KeepJobFlowAliveWhenNoSteps</code> parameter is set to <code>TRUE</code>, the cluster transitions to the
     * WAITING state rather than shutting down after the steps have completed.
     * </p>
     * <p>
     * For additional protection, you can set the <a>JobFlowInstancesConfig</a> <code>TerminationProtected</code>
     * parameter to <code>TRUE</code> to lock the cluster and prevent it from being terminated by API call, user
     * intervention, or in the event of a job flow error.
     * </p>
     * <p>
     * A maximum of 256 steps are allowed in each job flow.
     * </p>
     * <p>
     * If your cluster is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps
     * to process your data. You can bypass the 256-step limitation in various ways, including using the SSH shell to
     * connect to the master node and submitting queries directly to the software running on the master node, such as
     * Hive and Hadoop. For more information on how to do this, see <a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/AddMoreThan256Steps.html">Add More than 256 Steps to
     * a Cluster</a> in the <i>Amazon EMR Management Guide</i>.
     * </p>
     * <p>
     * For long running clusters, we recommend that you periodically store your results.
     * </p>
     * <note>
     * <p>
     * The instance fleets configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x
     * versions. The RunJobFlow request can contain InstanceFleets parameters or InstanceGroups parameters, but not
     * both.
     * </p>
     * </note>
     * 
     * @param runJobFlowRequest
     *        Input to the <a>RunJobFlow</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RunJobFlow operation returned by the service.
     * @sample AmazonElasticMapReduceAsyncHandler.RunJobFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/RunJobFlow" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RunJobFlowResult> runJobFlowAsync(RunJobFlowRequest runJobFlowRequest,
            com.amazonaws.handlers.AsyncHandler<RunJobFlowRequest, RunJobFlowResult> asyncHandler);

    /**
     * <p>
     * SetTerminationProtection locks a cluster (job flow) so the EC2 instances in the cluster cannot be terminated by
     * user intervention, an API call, or in the event of a job-flow error. The cluster still terminates upon successful
     * completion of the job flow. Calling <code>SetTerminationProtection</code> on a cluster is similar to calling the
     * Amazon EC2 <code>DisableAPITermination</code> API on all EC2 instances in a cluster.
     * </p>
     * <p>
     * <code>SetTerminationProtection</code> is used to prevent accidental termination of a cluster and to ensure that
     * in the event of an error, the instances persist so that you can recover any data stored in their ephemeral
     * instance storage.
     * </p>
     * <p>
     * To terminate a cluster that has been locked by setting <code>SetTerminationProtection</code> to <code>true</code>
     * , you must first unlock the job flow by a subsequent call to <code>SetTerminationProtection</code> in which you
     * set the value to <code>false</code>.
     * </p>
     * <p>
     * For more information, see<a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/UsingEMR_TerminationProtection.html">Managing
     * Cluster Termination</a> in the <i>Amazon EMR Management Guide</i>.
     * </p>
     * 
     * @param setTerminationProtectionRequest
     *        The input argument to the <a>TerminationProtection</a> operation.
     * @return A Java Future containing the result of the SetTerminationProtection operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.SetTerminationProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/SetTerminationProtection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetTerminationProtectionResult> setTerminationProtectionAsync(SetTerminationProtectionRequest setTerminationProtectionRequest);

    /**
     * <p>
     * SetTerminationProtection locks a cluster (job flow) so the EC2 instances in the cluster cannot be terminated by
     * user intervention, an API call, or in the event of a job-flow error. The cluster still terminates upon successful
     * completion of the job flow. Calling <code>SetTerminationProtection</code> on a cluster is similar to calling the
     * Amazon EC2 <code>DisableAPITermination</code> API on all EC2 instances in a cluster.
     * </p>
     * <p>
     * <code>SetTerminationProtection</code> is used to prevent accidental termination of a cluster and to ensure that
     * in the event of an error, the instances persist so that you can recover any data stored in their ephemeral
     * instance storage.
     * </p>
     * <p>
     * To terminate a cluster that has been locked by setting <code>SetTerminationProtection</code> to <code>true</code>
     * , you must first unlock the job flow by a subsequent call to <code>SetTerminationProtection</code> in which you
     * set the value to <code>false</code>.
     * </p>
     * <p>
     * For more information, see<a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/UsingEMR_TerminationProtection.html">Managing
     * Cluster Termination</a> in the <i>Amazon EMR Management Guide</i>.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/SetTerminationProtection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetTerminationProtectionResult> setTerminationProtectionAsync(SetTerminationProtectionRequest setTerminationProtectionRequest,
            com.amazonaws.handlers.AsyncHandler<SetTerminationProtectionRequest, SetTerminationProtectionResult> asyncHandler);

    /**
     * <p>
     * Sets whether all AWS Identity and Access Management (IAM) users under your account can access the specified
     * clusters (job flows). This action works on running clusters. You can also set the visibility of a cluster when
     * you launch it using the <code>VisibleToAllUsers</code> parameter of <a>RunJobFlow</a>. The SetVisibleToAllUsers
     * action can be called only by an IAM user who created the cluster or the AWS account that owns the cluster.
     * </p>
     * 
     * @param setVisibleToAllUsersRequest
     *        The input to the SetVisibleToAllUsers action.
     * @return A Java Future containing the result of the SetVisibleToAllUsers operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.SetVisibleToAllUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/SetVisibleToAllUsers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetVisibleToAllUsersResult> setVisibleToAllUsersAsync(SetVisibleToAllUsersRequest setVisibleToAllUsersRequest);

    /**
     * <p>
     * Sets whether all AWS Identity and Access Management (IAM) users under your account can access the specified
     * clusters (job flows). This action works on running clusters. You can also set the visibility of a cluster when
     * you launch it using the <code>VisibleToAllUsers</code> parameter of <a>RunJobFlow</a>. The SetVisibleToAllUsers
     * action can be called only by an IAM user who created the cluster or the AWS account that owns the cluster.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/SetVisibleToAllUsers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetVisibleToAllUsersResult> setVisibleToAllUsersAsync(SetVisibleToAllUsersRequest setVisibleToAllUsersRequest,
            com.amazonaws.handlers.AsyncHandler<SetVisibleToAllUsersRequest, SetVisibleToAllUsersResult> asyncHandler);

    /**
     * <p>
     * TerminateJobFlows shuts a list of clusters (job flows) down. When a job flow is shut down, any step not yet
     * completed is canceled and the EC2 instances on which the cluster is running are stopped. Any log files not
     * already saved are uploaded to Amazon S3 if a LogUri was specified when the cluster was created.
     * </p>
     * <p>
     * The maximum number of clusters allowed is 10. The call to <code>TerminateJobFlows</code> is asynchronous.
     * Depending on the configuration of the cluster, it may take up to 1-5 minutes for the cluster to completely
     * terminate and release allocated resources, such as Amazon EC2 instances.
     * </p>
     * 
     * @param terminateJobFlowsRequest
     *        Input to the <a>TerminateJobFlows</a> operation.
     * @return A Java Future containing the result of the TerminateJobFlows operation returned by the service.
     * @sample AmazonElasticMapReduceAsync.TerminateJobFlows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/TerminateJobFlows"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TerminateJobFlowsResult> terminateJobFlowsAsync(TerminateJobFlowsRequest terminateJobFlowsRequest);

    /**
     * <p>
     * TerminateJobFlows shuts a list of clusters (job flows) down. When a job flow is shut down, any step not yet
     * completed is canceled and the EC2 instances on which the cluster is running are stopped. Any log files not
     * already saved are uploaded to Amazon S3 if a LogUri was specified when the cluster was created.
     * </p>
     * <p>
     * The maximum number of clusters allowed is 10. The call to <code>TerminateJobFlows</code> is asynchronous.
     * Depending on the configuration of the cluster, it may take up to 1-5 minutes for the cluster to completely
     * terminate and release allocated resources, such as Amazon EC2 instances.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/TerminateJobFlows"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TerminateJobFlowsResult> terminateJobFlowsAsync(TerminateJobFlowsRequest terminateJobFlowsRequest,
            com.amazonaws.handlers.AsyncHandler<TerminateJobFlowsRequest, TerminateJobFlowsResult> asyncHandler);

}
