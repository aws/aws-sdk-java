/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticmapreduce;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.elasticmapreduce.model.*;

/**
 * Interface for accessing AmazonElasticMapReduce asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * <p>
 * This is the <i>Amazon Elastic MapReduce API Reference</i> . This guide provides descriptions and samples of the Amazon Elastic MapReduce APIs.
 * </p>
 * <p>
 * Amazon Elastic MapReduce (Amazon EMR) is a web service that makes it easy to process large amounts of data efficiently. Amazon EMR uses Hadoop
 * processing combined with several AWS products to do tasks such as web indexing, data mining, log file analysis, machine learning, scientific
 * simulation, and data warehousing.
 * </p>
 */
public interface AmazonElasticMapReduceAsync extends AmazonElasticMapReduce {
    /**
     * <p>
     * Provides information about the bootstrap actions associated with a
     * cluster.
     * </p>
     *
     * @param listBootstrapActionsRequest Container for the necessary
     *           parameters to execute the ListBootstrapActions operation on
     *           AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         ListBootstrapActions service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListBootstrapActionsResult> listBootstrapActionsAsync(ListBootstrapActionsRequest listBootstrapActionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information about the bootstrap actions associated with a
     * cluster.
     * </p>
     *
     * @param listBootstrapActionsRequest Container for the necessary
     *           parameters to execute the ListBootstrapActions operation on
     *           AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListBootstrapActions service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListBootstrapActionsResult> listBootstrapActionsAsync(ListBootstrapActionsRequest listBootstrapActionsRequest,
            AsyncHandler<ListBootstrapActionsRequest, ListBootstrapActionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets whether all AWS Identity and Access Management (IAM) users under
     * your account can access the specified job flows. This action works on
     * running job flows. You can also set the visibility of a job flow when
     * you launch it using the <code>VisibleToAllUsers</code> parameter of
     * RunJobFlow. The SetVisibleToAllUsers action can be called only by an
     * IAM user who created the job flow or the AWS account that owns the job
     * flow.
     * </p>
     *
     * @param setVisibleToAllUsersRequest Container for the necessary
     *           parameters to execute the SetVisibleToAllUsers operation on
     *           AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         SetVisibleToAllUsers service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setVisibleToAllUsersAsync(SetVisibleToAllUsersRequest setVisibleToAllUsersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets whether all AWS Identity and Access Management (IAM) users under
     * your account can access the specified job flows. This action works on
     * running job flows. You can also set the visibility of a job flow when
     * you launch it using the <code>VisibleToAllUsers</code> parameter of
     * RunJobFlow. The SetVisibleToAllUsers action can be called only by an
     * IAM user who created the job flow or the AWS account that owns the job
     * flow.
     * </p>
     *
     * @param setVisibleToAllUsersRequest Container for the necessary
     *           parameters to execute the SetVisibleToAllUsers operation on
     *           AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetVisibleToAllUsers service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setVisibleToAllUsersAsync(SetVisibleToAllUsersRequest setVisibleToAllUsersRequest,
            AsyncHandler<SetVisibleToAllUsersRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides a list of steps for the cluster.
     * </p>
     *
     * @param listStepsRequest Container for the necessary parameters to
     *           execute the ListSteps operation on AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         ListSteps service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListStepsResult> listStepsAsync(ListStepsRequest listStepsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides a list of steps for the cluster.
     * </p>
     *
     * @param listStepsRequest Container for the necessary parameters to
     *           execute the ListSteps operation on AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListSteps service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListStepsResult> listStepsAsync(ListStepsRequest listStepsRequest,
            AsyncHandler<ListStepsRequest, ListStepsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * AddJobFlowSteps adds new steps to a running job flow. A maximum of
     * 256 steps are allowed in each job flow.
     * </p>
     * <p>
     * If your job flow is long-running (such as a Hive data warehouse) or
     * complex, you may require more than 256 steps to process your data. You
     * can bypass the 256-step limitation in various ways, including using
     * the SSH shell to connect to the master node and submitting queries
     * directly to the software running on the master node, such as Hive and
     * Hadoop. For more information on how to do this, go to <a
     * .com/ElasticMapReduce/latest/DeveloperGuide/AddMoreThan256Steps.html">
     * Add More than 256 Steps to a Job Flow </a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide</i> .
     * </p>
     * <p>
     * A step specifies the location of a JAR file stored either on the
     * master node of the job flow or in Amazon S3. Each step is performed by
     * the main function of the main class of the JAR file. The main class
     * can be specified either in the manifest of the JAR or by using the
     * MainFunction parameter of the step.
     * </p>
     * <p>
     * Elastic MapReduce executes each step in the order listed. For a step
     * to be considered complete, the main function must exit with a zero
     * exit code and all Hadoop jobs started while the step was running must
     * have completed and run successfully.
     * </p>
     * <p>
     * You can only add steps to a job flow that is in one of the following
     * states: STARTING, BOOTSTRAPPING, RUNNING, or WAITING.
     * </p>
     *
     * @param addJobFlowStepsRequest Container for the necessary parameters
     *           to execute the AddJobFlowSteps operation on AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         AddJobFlowSteps service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddJobFlowStepsResult> addJobFlowStepsAsync(AddJobFlowStepsRequest addJobFlowStepsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * AddJobFlowSteps adds new steps to a running job flow. A maximum of
     * 256 steps are allowed in each job flow.
     * </p>
     * <p>
     * If your job flow is long-running (such as a Hive data warehouse) or
     * complex, you may require more than 256 steps to process your data. You
     * can bypass the 256-step limitation in various ways, including using
     * the SSH shell to connect to the master node and submitting queries
     * directly to the software running on the master node, such as Hive and
     * Hadoop. For more information on how to do this, go to <a
     * .com/ElasticMapReduce/latest/DeveloperGuide/AddMoreThan256Steps.html">
     * Add More than 256 Steps to a Job Flow </a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide</i> .
     * </p>
     * <p>
     * A step specifies the location of a JAR file stored either on the
     * master node of the job flow or in Amazon S3. Each step is performed by
     * the main function of the main class of the JAR file. The main class
     * can be specified either in the manifest of the JAR or by using the
     * MainFunction parameter of the step.
     * </p>
     * <p>
     * Elastic MapReduce executes each step in the order listed. For a step
     * to be considered complete, the main function must exit with a zero
     * exit code and all Hadoop jobs started while the step was running must
     * have completed and run successfully.
     * </p>
     * <p>
     * You can only add steps to a job flow that is in one of the following
     * states: STARTING, BOOTSTRAPPING, RUNNING, or WAITING.
     * </p>
     *
     * @param addJobFlowStepsRequest Container for the necessary parameters
     *           to execute the AddJobFlowSteps operation on AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AddJobFlowSteps service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddJobFlowStepsResult> addJobFlowStepsAsync(AddJobFlowStepsRequest addJobFlowStepsRequest,
            AsyncHandler<AddJobFlowStepsRequest, AddJobFlowStepsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides more detail about the cluster step.
     * </p>
     *
     * @param describeStepRequest Container for the necessary parameters to
     *           execute the DescribeStep operation on AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStep service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStepResult> describeStepAsync(DescribeStepRequest describeStepRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides more detail about the cluster step.
     * </p>
     *
     * @param describeStepRequest Container for the necessary parameters to
     *           execute the DescribeStep operation on AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStep service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStepResult> describeStepAsync(DescribeStepRequest describeStepRequest,
            AsyncHandler<DescribeStepRequest, DescribeStepResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides the status of all clusters visible to this AWS account.
     * Allows you to filter the list of clusters based on certain criteria;
     * for example, filtering by cluster creation date and time or by status.
     * This call returns a maximum of 50 clusters per call, but returns a
     * marker to track the paging of the cluster list across multiple
     * ListClusters calls.
     * </p>
     *
     * @param listClustersRequest Container for the necessary parameters to
     *           execute the ListClusters operation on AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         ListClusters service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListClustersResult> listClustersAsync(ListClustersRequest listClustersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides the status of all clusters visible to this AWS account.
     * Allows you to filter the list of clusters based on certain criteria;
     * for example, filtering by cluster creation date and time or by status.
     * This call returns a maximum of 50 clusters per call, but returns a
     * marker to track the paging of the cluster list across multiple
     * ListClusters calls.
     * </p>
     *
     * @param listClustersRequest Container for the necessary parameters to
     *           execute the ListClusters operation on AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListClusters service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListClustersResult> listClustersAsync(ListClustersRequest listClustersRequest,
            AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides all available details about the instance groups in a cluster.
     * </p>
     *
     * @param listInstanceGroupsRequest Container for the necessary
     *           parameters to execute the ListInstanceGroups operation on
     *           AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         ListInstanceGroups service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListInstanceGroupsResult> listInstanceGroupsAsync(ListInstanceGroupsRequest listInstanceGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides all available details about the instance groups in a cluster.
     * </p>
     *
     * @param listInstanceGroupsRequest Container for the necessary
     *           parameters to execute the ListInstanceGroups operation on
     *           AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListInstanceGroups service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListInstanceGroupsResult> listInstanceGroupsAsync(ListInstanceGroupsRequest listInstanceGroupsRequest,
            AsyncHandler<ListInstanceGroupsRequest, ListInstanceGroupsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * ModifyInstanceGroups modifies the number of nodes and configuration
     * settings of an instance group. The input parameters include the new
     * target instance count for the group and the instance group ID. The
     * call will either succeed or fail atomically.
     * </p>
     *
     * @param modifyInstanceGroupsRequest Container for the necessary
     *           parameters to execute the ModifyInstanceGroups operation on
     *           AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyInstanceGroups service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> modifyInstanceGroupsAsync(ModifyInstanceGroupsRequest modifyInstanceGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * ModifyInstanceGroups modifies the number of nodes and configuration
     * settings of an instance group. The input parameters include the new
     * target instance count for the group and the instance group ID. The
     * call will either succeed or fail atomically.
     * </p>
     *
     * @param modifyInstanceGroupsRequest Container for the necessary
     *           parameters to execute the ModifyInstanceGroups operation on
     *           AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyInstanceGroups service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> modifyInstanceGroupsAsync(ModifyInstanceGroupsRequest modifyInstanceGroupsRequest,
            AsyncHandler<ModifyInstanceGroupsRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information about the cluster instances that Amazon EMR
     * provisions on behalf of a user when it creates the cluster. For
     * example, this operation indicates when the EC2 instances reach the
     * Ready state, when instances become available to Amazon EMR to use for
     * jobs, and the IP addresses for cluster instances, etc.
     * </p>
     *
     * @param listInstancesRequest Container for the necessary parameters to
     *           execute the ListInstances operation on AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         ListInstances service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest listInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information about the cluster instances that Amazon EMR
     * provisions on behalf of a user when it creates the cluster. For
     * example, this operation indicates when the EC2 instances reach the
     * Ready state, when instances become available to Amazon EMR to use for
     * jobs, and the IP addresses for cluster instances, etc.
     * </p>
     *
     * @param listInstancesRequest Container for the necessary parameters to
     *           execute the ListInstances operation on AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListInstances service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest listInstancesRequest,
            AsyncHandler<ListInstancesRequest, ListInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * AddInstanceGroups adds an instance group to a running cluster.
     * </p>
     *
     * @param addInstanceGroupsRequest Container for the necessary parameters
     *           to execute the AddInstanceGroups operation on AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         AddInstanceGroups service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddInstanceGroupsResult> addInstanceGroupsAsync(AddInstanceGroupsRequest addInstanceGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * AddInstanceGroups adds an instance group to a running cluster.
     * </p>
     *
     * @param addInstanceGroupsRequest Container for the necessary parameters
     *           to execute the AddInstanceGroups operation on AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AddInstanceGroups service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddInstanceGroupsResult> addInstanceGroupsAsync(AddInstanceGroupsRequest addInstanceGroupsRequest,
            AsyncHandler<AddInstanceGroupsRequest, AddInstanceGroupsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * TerminateJobFlows shuts a list of job flows down. When a job flow is
     * shut down, any step not yet completed is canceled and the EC2
     * instances on which the job flow is running are stopped. Any log files
     * not already saved are uploaded to Amazon S3 if a LogUri was specified
     * when the job flow was created.
     * </p>
     * <p>
     * The call to TerminateJobFlows is asynchronous. Depending on the
     * configuration of the job flow, it may take up to 5-20 minutes for the
     * job flow to completely terminate and release allocated resources, such
     * as Amazon EC2 instances.
     * </p>
     *
     * @param terminateJobFlowsRequest Container for the necessary parameters
     *           to execute the TerminateJobFlows operation on AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         TerminateJobFlows service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> terminateJobFlowsAsync(TerminateJobFlowsRequest terminateJobFlowsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * TerminateJobFlows shuts a list of job flows down. When a job flow is
     * shut down, any step not yet completed is canceled and the EC2
     * instances on which the job flow is running are stopped. Any log files
     * not already saved are uploaded to Amazon S3 if a LogUri was specified
     * when the job flow was created.
     * </p>
     * <p>
     * The call to TerminateJobFlows is asynchronous. Depending on the
     * configuration of the job flow, it may take up to 5-20 minutes for the
     * job flow to completely terminate and release allocated resources, such
     * as Amazon EC2 instances.
     * </p>
     *
     * @param terminateJobFlowsRequest Container for the necessary parameters
     *           to execute the TerminateJobFlows operation on AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         TerminateJobFlows service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> terminateJobFlowsAsync(TerminateJobFlowsRequest terminateJobFlowsRequest,
            AsyncHandler<TerminateJobFlowsRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * DescribeJobFlows returns a list of job flows that match all of the
     * supplied parameters. The parameters can include a list of job flow
     * IDs, job flow states, and restrictions on job flow creation date and
     * time.
     * </p>
     * <p>
     * Regardless of supplied parameters, only job flows created within the
     * last two months are returned.
     * </p>
     * <p>
     * If no parameters are supplied, then job flows matching either of the
     * following criteria are returned:
     * </p>
     * 
     * <ul>
     * <li>Job flows created and completed in the last two weeks</li>
     * <li> Job flows created within the last two months that are in one of
     * the following states: <code>RUNNING</code> ,
     * <code>WAITING</code> ,
     * <code>SHUTTING_DOWN</code> ,
     * 
     * <code>STARTING</code> </li>
     * 
     * </ul>
     * <p>
     * Amazon Elastic MapReduce can return a maximum of 512 job flow
     * descriptions.
     * </p>
     *
     * @param describeJobFlowsRequest Container for the necessary parameters
     *           to execute the DescribeJobFlows operation on AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeJobFlows service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    @Deprecated
    public Future<DescribeJobFlowsResult> describeJobFlowsAsync(DescribeJobFlowsRequest describeJobFlowsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * DescribeJobFlows returns a list of job flows that match all of the
     * supplied parameters. The parameters can include a list of job flow
     * IDs, job flow states, and restrictions on job flow creation date and
     * time.
     * </p>
     * <p>
     * Regardless of supplied parameters, only job flows created within the
     * last two months are returned.
     * </p>
     * <p>
     * If no parameters are supplied, then job flows matching either of the
     * following criteria are returned:
     * </p>
     * 
     * <ul>
     * <li>Job flows created and completed in the last two weeks</li>
     * <li> Job flows created within the last two months that are in one of
     * the following states: <code>RUNNING</code> ,
     * <code>WAITING</code> ,
     * <code>SHUTTING_DOWN</code> ,
     * 
     * <code>STARTING</code> </li>
     * 
     * </ul>
     * <p>
     * Amazon Elastic MapReduce can return a maximum of 512 job flow
     * descriptions.
     * </p>
     *
     * @param describeJobFlowsRequest Container for the necessary parameters
     *           to execute the DescribeJobFlows operation on AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeJobFlows service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeJobFlowsResult> describeJobFlowsAsync(DescribeJobFlowsRequest describeJobFlowsRequest,
            AsyncHandler<DescribeJobFlowsRequest, DescribeJobFlowsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * SetTerminationProtection locks a job flow so the Amazon EC2 instances
     * in the cluster cannot be terminated by user intervention, an API call,
     * or in the event of a job-flow error. The cluster still terminates upon
     * successful completion of the job flow. Calling
     * SetTerminationProtection on a job flow is analogous to calling the
     * Amazon EC2 DisableAPITermination API on all of the EC2 instances in a
     * cluster.
     * </p>
     * <p>
     * SetTerminationProtection is used to prevent accidental termination of
     * a job flow and to ensure that in the event of an error, the instances
     * will persist so you can recover any data stored in their ephemeral
     * instance storage.
     * </p>
     * <p>
     * To terminate a job flow that has been locked by setting
     * SetTerminationProtection to <code>true</code> ,
     * you must first unlock the job flow by a subsequent call to
     * SetTerminationProtection in which you set the value to
     * <code>false</code> .
     * </p>
     * <p>
     * For more information, go to <a
     * cMapReduce/latest/DeveloperGuide/UsingEMR_TerminationProtection.html">
     * Protecting a Job Flow from Termination </a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide.</i>
     * </p>
     *
     * @param setTerminationProtectionRequest Container for the necessary
     *           parameters to execute the SetTerminationProtection operation on
     *           AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         SetTerminationProtection service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setTerminationProtectionAsync(SetTerminationProtectionRequest setTerminationProtectionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * SetTerminationProtection locks a job flow so the Amazon EC2 instances
     * in the cluster cannot be terminated by user intervention, an API call,
     * or in the event of a job-flow error. The cluster still terminates upon
     * successful completion of the job flow. Calling
     * SetTerminationProtection on a job flow is analogous to calling the
     * Amazon EC2 DisableAPITermination API on all of the EC2 instances in a
     * cluster.
     * </p>
     * <p>
     * SetTerminationProtection is used to prevent accidental termination of
     * a job flow and to ensure that in the event of an error, the instances
     * will persist so you can recover any data stored in their ephemeral
     * instance storage.
     * </p>
     * <p>
     * To terminate a job flow that has been locked by setting
     * SetTerminationProtection to <code>true</code> ,
     * you must first unlock the job flow by a subsequent call to
     * SetTerminationProtection in which you set the value to
     * <code>false</code> .
     * </p>
     * <p>
     * For more information, go to <a
     * cMapReduce/latest/DeveloperGuide/UsingEMR_TerminationProtection.html">
     * Protecting a Job Flow from Termination </a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide.</i>
     * </p>
     *
     * @param setTerminationProtectionRequest Container for the necessary
     *           parameters to execute the SetTerminationProtection operation on
     *           AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetTerminationProtection service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setTerminationProtectionAsync(SetTerminationProtectionRequest setTerminationProtectionRequest,
            AsyncHandler<SetTerminationProtectionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * RunJobFlow creates and starts running a new job flow. The job flow
     * will run the steps specified. Once the job flow completes, the cluster
     * is stopped and the HDFS partition is lost. To prevent loss of data,
     * configure the last step of the job flow to store results in Amazon S3.
     * If the JobFlowInstancesConfig <code>KeepJobFlowAliveWhenNoSteps</code>
     * parameter is set to <code>TRUE</code> , the job flow will transition
     * to the WAITING state rather than shutting down once the steps have
     * completed.
     * </p>
     * <p>
     * For additional protection, you can set the JobFlowInstancesConfig
     * <code>TerminationProtected</code> parameter to <code>TRUE</code> to
     * lock the job flow and prevent it from being terminated by API call,
     * user intervention, or in the event of a job flow error.
     * </p>
     * <p>
     * A maximum of 256 steps are allowed in each job flow.
     * </p>
     * <p>
     * If your job flow is long-running (such as a Hive data warehouse) or
     * complex, you may require more than 256 steps to process your data. You
     * can bypass the 256-step limitation in various ways, including using
     * the SSH shell to connect to the master node and submitting queries
     * directly to the software running on the master node, such as Hive and
     * Hadoop. For more information on how to do this, go to <a
     * .com/ElasticMapReduce/latest/DeveloperGuide/AddMoreThan256Steps.html">
     * Add More than 256 Steps to a Job Flow </a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide</i> .
     * </p>
     * <p>
     * For long running job flows, we recommend that you periodically store
     * your results.
     * </p>
     *
     * @param runJobFlowRequest Container for the necessary parameters to
     *           execute the RunJobFlow operation on AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         RunJobFlow service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RunJobFlowResult> runJobFlowAsync(RunJobFlowRequest runJobFlowRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * RunJobFlow creates and starts running a new job flow. The job flow
     * will run the steps specified. Once the job flow completes, the cluster
     * is stopped and the HDFS partition is lost. To prevent loss of data,
     * configure the last step of the job flow to store results in Amazon S3.
     * If the JobFlowInstancesConfig <code>KeepJobFlowAliveWhenNoSteps</code>
     * parameter is set to <code>TRUE</code> , the job flow will transition
     * to the WAITING state rather than shutting down once the steps have
     * completed.
     * </p>
     * <p>
     * For additional protection, you can set the JobFlowInstancesConfig
     * <code>TerminationProtected</code> parameter to <code>TRUE</code> to
     * lock the job flow and prevent it from being terminated by API call,
     * user intervention, or in the event of a job flow error.
     * </p>
     * <p>
     * A maximum of 256 steps are allowed in each job flow.
     * </p>
     * <p>
     * If your job flow is long-running (such as a Hive data warehouse) or
     * complex, you may require more than 256 steps to process your data. You
     * can bypass the 256-step limitation in various ways, including using
     * the SSH shell to connect to the master node and submitting queries
     * directly to the software running on the master node, such as Hive and
     * Hadoop. For more information on how to do this, go to <a
     * .com/ElasticMapReduce/latest/DeveloperGuide/AddMoreThan256Steps.html">
     * Add More than 256 Steps to a Job Flow </a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide</i> .
     * </p>
     * <p>
     * For long running job flows, we recommend that you periodically store
     * your results.
     * </p>
     *
     * @param runJobFlowRequest Container for the necessary parameters to
     *           execute the RunJobFlow operation on AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RunJobFlow service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RunJobFlowResult> runJobFlowAsync(RunJobFlowRequest runJobFlowRequest,
            AsyncHandler<RunJobFlowRequest, RunJobFlowResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides cluster-level details including status, hardware and software
     * configuration, VPC settings, and so on. For information about the
     * cluster steps, see ListSteps.
     * </p>
     *
     * @param describeClusterRequest Container for the necessary parameters
     *           to execute the DescribeCluster operation on AmazonElasticMapReduce.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCluster service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClusterResult> describeClusterAsync(DescribeClusterRequest describeClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides cluster-level details including status, hardware and software
     * configuration, VPC settings, and so on. For information about the
     * cluster steps, see ListSteps.
     * </p>
     *
     * @param describeClusterRequest Container for the necessary parameters
     *           to execute the DescribeCluster operation on AmazonElasticMapReduce.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCluster service method, as returned by AmazonElasticMapReduce.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeClusterResult> describeClusterAsync(DescribeClusterRequest describeClusterRequest,
            AsyncHandler<DescribeClusterRequest, DescribeClusterResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

}
        