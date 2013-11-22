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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.elasticmapreduce.model.*;

/**
 * Interface for accessing AmazonElasticMapReduce.
 * <p>
 * This is the <i>Amazon Elastic MapReduce API Reference</i> . This guide provides descriptions and samples of the Amazon Elastic MapReduce APIs.
 * </p>
 * <p>
 * Amazon Elastic MapReduce (Amazon EMR) is a web service that makes it easy to process large amounts of data efficiently. Amazon EMR uses Hadoop
 * processing combined with several AWS products to do tasks such as web indexing, data mining, log file analysis, machine learning, scientific
 * simulation, and data warehousing.
 * </p>
 */
public interface AmazonElasticMapReduce {

    /**
     * Overrides the default endpoint for this client ("https://elasticmapreduce.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "elasticmapreduce.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://elasticmapreduce.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "elasticmapreduce.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://elasticmapreduce.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonElasticMapReduce#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Provides information about the bootstrap actions associated with a
     * cluster.
     * </p>
     *
     * @param listBootstrapActionsRequest Container for the necessary
     *           parameters to execute the ListBootstrapActions service method on
     *           AmazonElasticMapReduce.
     * 
     * @return The response from the ListBootstrapActions service method, as
     *         returned by AmazonElasticMapReduce.
     * 
     * @throws InternalServerException
     * @throws InvalidRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListBootstrapActionsResult listBootstrapActions(ListBootstrapActionsRequest listBootstrapActionsRequest) 
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
     *           parameters to execute the SetVisibleToAllUsers service method on
     *           AmazonElasticMapReduce.
     * 
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setVisibleToAllUsers(SetVisibleToAllUsersRequest setVisibleToAllUsersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides a list of steps for the cluster.
     * </p>
     *
     * @param listStepsRequest Container for the necessary parameters to
     *           execute the ListSteps service method on AmazonElasticMapReduce.
     * 
     * @return The response from the ListSteps service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     * @throws InternalServerException
     * @throws InvalidRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListStepsResult listSteps(ListStepsRequest listStepsRequest) 
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
     *           to execute the AddJobFlowSteps service method on
     *           AmazonElasticMapReduce.
     * 
     * @return The response from the AddJobFlowSteps service method, as
     *         returned by AmazonElasticMapReduce.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AddJobFlowStepsResult addJobFlowSteps(AddJobFlowStepsRequest addJobFlowStepsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides more detail about the cluster step.
     * </p>
     *
     * @param describeStepRequest Container for the necessary parameters to
     *           execute the DescribeStep service method on AmazonElasticMapReduce.
     * 
     * @return The response from the DescribeStep service method, as returned
     *         by AmazonElasticMapReduce.
     * 
     * @throws InternalServerException
     * @throws InvalidRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeStepResult describeStep(DescribeStepRequest describeStepRequest) 
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
     *           execute the ListClusters service method on AmazonElasticMapReduce.
     * 
     * @return The response from the ListClusters service method, as returned
     *         by AmazonElasticMapReduce.
     * 
     * @throws InternalServerException
     * @throws InvalidRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListClustersResult listClusters(ListClustersRequest listClustersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides all available details about the instance groups in a cluster.
     * </p>
     *
     * @param listInstanceGroupsRequest Container for the necessary
     *           parameters to execute the ListInstanceGroups service method on
     *           AmazonElasticMapReduce.
     * 
     * @return The response from the ListInstanceGroups service method, as
     *         returned by AmazonElasticMapReduce.
     * 
     * @throws InternalServerException
     * @throws InvalidRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListInstanceGroupsResult listInstanceGroups(ListInstanceGroupsRequest listInstanceGroupsRequest) 
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
     *           parameters to execute the ModifyInstanceGroups service method on
     *           AmazonElasticMapReduce.
     * 
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void modifyInstanceGroups(ModifyInstanceGroupsRequest modifyInstanceGroupsRequest) 
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
     *           execute the ListInstances service method on AmazonElasticMapReduce.
     * 
     * @return The response from the ListInstances service method, as
     *         returned by AmazonElasticMapReduce.
     * 
     * @throws InternalServerException
     * @throws InvalidRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListInstancesResult listInstances(ListInstancesRequest listInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * AddInstanceGroups adds an instance group to a running cluster.
     * </p>
     *
     * @param addInstanceGroupsRequest Container for the necessary parameters
     *           to execute the AddInstanceGroups service method on
     *           AmazonElasticMapReduce.
     * 
     * @return The response from the AddInstanceGroups service method, as
     *         returned by AmazonElasticMapReduce.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AddInstanceGroupsResult addInstanceGroups(AddInstanceGroupsRequest addInstanceGroupsRequest) 
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
     *           to execute the TerminateJobFlows service method on
     *           AmazonElasticMapReduce.
     * 
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void terminateJobFlows(TerminateJobFlowsRequest terminateJobFlowsRequest) 
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
     *           to execute the DescribeJobFlows service method on
     *           AmazonElasticMapReduce.
     * 
     * @return The response from the DescribeJobFlows service method, as
     *         returned by AmazonElasticMapReduce.
     * 
     * @throws InternalServerErrorException
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
    public DescribeJobFlowsResult describeJobFlows(DescribeJobFlowsRequest describeJobFlowsRequest) 
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
     *           parameters to execute the SetTerminationProtection service method on
     *           AmazonElasticMapReduce.
     * 
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setTerminationProtection(SetTerminationProtectionRequest setTerminationProtectionRequest) 
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
     *           execute the RunJobFlow service method on AmazonElasticMapReduce.
     * 
     * @return The response from the RunJobFlow service method, as returned
     *         by AmazonElasticMapReduce.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RunJobFlowResult runJobFlow(RunJobFlowRequest runJobFlowRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides cluster-level details including status, hardware and software
     * configuration, VPC settings, and so on. For information about the
     * cluster steps, see ListSteps.
     * </p>
     *
     * @param describeClusterRequest Container for the necessary parameters
     *           to execute the DescribeCluster service method on
     *           AmazonElasticMapReduce.
     * 
     * @return The response from the DescribeCluster service method, as
     *         returned by AmazonElasticMapReduce.
     * 
     * @throws InternalServerException
     * @throws InvalidRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClusterResult describeCluster(DescribeClusterRequest describeClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information about the bootstrap actions associated with a
     * cluster.
     * </p>
     * 
     * @return The response from the ListBootstrapActions service method, as
     *         returned by AmazonElasticMapReduce.
     * 
     * @throws InternalServerException
     * @throws InvalidRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListBootstrapActionsResult listBootstrapActions() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Provides a list of steps for the cluster.
     * </p>
     * 
     * @return The response from the ListSteps service method, as returned by
     *         AmazonElasticMapReduce.
     * 
     * @throws InternalServerException
     * @throws InvalidRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListStepsResult listSteps() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Provides more detail about the cluster step.
     * </p>
     * 
     * @return The response from the DescribeStep service method, as returned
     *         by AmazonElasticMapReduce.
     * 
     * @throws InternalServerException
     * @throws InvalidRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeStepResult describeStep() throws AmazonServiceException, AmazonClientException;
    
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
     * @return The response from the ListClusters service method, as returned
     *         by AmazonElasticMapReduce.
     * 
     * @throws InternalServerException
     * @throws InvalidRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListClustersResult listClusters() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Provides all available details about the instance groups in a cluster.
     * </p>
     * 
     * @return The response from the ListInstanceGroups service method, as
     *         returned by AmazonElasticMapReduce.
     * 
     * @throws InternalServerException
     * @throws InvalidRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListInstanceGroupsResult listInstanceGroups() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * ModifyInstanceGroups modifies the number of nodes and configuration
     * settings of an instance group. The input parameters include the new
     * target instance count for the group and the instance group ID. The
     * call will either succeed or fail atomically.
     * </p>
     * 
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void modifyInstanceGroups() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Provides information about the cluster instances that Amazon EMR
     * provisions on behalf of a user when it creates the cluster. For
     * example, this operation indicates when the EC2 instances reach the
     * Ready state, when instances become available to Amazon EMR to use for
     * jobs, and the IP addresses for cluster instances, etc.
     * </p>
     * 
     * @return The response from the ListInstances service method, as
     *         returned by AmazonElasticMapReduce.
     * 
     * @throws InternalServerException
     * @throws InvalidRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListInstancesResult listInstances() throws AmazonServiceException, AmazonClientException;
    
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
     * @return The response from the DescribeJobFlows service method, as
     *         returned by AmazonElasticMapReduce.
     * 
     * @throws InternalServerErrorException
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
    public DescribeJobFlowsResult describeJobFlows() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Provides cluster-level details including status, hardware and software
     * configuration, VPC settings, and so on. For information about the
     * cluster steps, see ListSteps.
     * </p>
     * 
     * @return The response from the DescribeCluster service method, as
     *         returned by AmazonElasticMapReduce.
     * 
     * @throws InternalServerException
     * @throws InvalidRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticMapReduce indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClusterResult describeCluster() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
        