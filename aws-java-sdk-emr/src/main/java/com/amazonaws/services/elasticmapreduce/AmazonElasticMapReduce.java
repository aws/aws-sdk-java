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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.services.elasticmapreduce.waiters.AmazonElasticMapReduceWaiters;

/**
 * Interface for accessing Amazon EMR.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.elasticmapreduce.AbstractAmazonElasticMapReduce} instead.
 * </p>
 * <p>
 * <p>
 * Amazon EMR is a web service that makes it easy to process large amounts of data efficiently. Amazon EMR uses Hadoop
 * processing combined with several AWS products to do tasks such as web indexing, data mining, log file analysis,
 * machine learning, scientific simulation, and data warehousing.
 * </p>
 */
public interface AmazonElasticMapReduce {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "elasticmapreduce";

    /**
     * Overrides the default endpoint for this client ("https://elasticmapreduce.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "elasticmapreduce.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://elasticmapreduce.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "elasticmapreduce.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://elasticmapreduce.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonElasticMapReduce#setEndpoint(String)}, sets the regional endpoint for this
     * client's service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

    /**
     * <p>
     * Adds one or more instance groups to a running cluster.
     * </p>
     * 
     * @param addInstanceGroupsRequest
     *        Input to an AddInstanceGroups call.
     * @return Result of the AddInstanceGroups operation returned by the service.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and that the request was not completed.
     * @sample AmazonElasticMapReduce.AddInstanceGroups
     */
    AddInstanceGroupsResult addInstanceGroups(AddInstanceGroupsRequest addInstanceGroupsRequest);

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
     * @return Result of the AddJobFlowSteps operation returned by the service.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and that the request was not completed.
     * @sample AmazonElasticMapReduce.AddJobFlowSteps
     */
    AddJobFlowStepsResult addJobFlowSteps(AddJobFlowStepsRequest addJobFlowStepsRequest);

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
     * @return Result of the AddTags operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.AddTags
     */
    AddTagsResult addTags(AddTagsRequest addTagsRequest);

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
     * @return Result of the CancelSteps operation returned by the service.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and that the request was not completed.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.CancelSteps
     */
    CancelStepsResult cancelSteps(CancelStepsRequest cancelStepsRequest);

    /**
     * <p>
     * Creates a security configuration, which is stored in the service and can be specified when a cluster is created.
     * </p>
     * 
     * @param createSecurityConfigurationRequest
     * @return Result of the CreateSecurityConfiguration operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.CreateSecurityConfiguration
     */
    CreateSecurityConfigurationResult createSecurityConfiguration(CreateSecurityConfigurationRequest createSecurityConfigurationRequest);

    /**
     * <p>
     * Deletes a security configuration.
     * </p>
     * 
     * @param deleteSecurityConfigurationRequest
     * @return Result of the DeleteSecurityConfiguration operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.DeleteSecurityConfiguration
     */
    DeleteSecurityConfigurationResult deleteSecurityConfiguration(DeleteSecurityConfigurationRequest deleteSecurityConfigurationRequest);

    /**
     * <p>
     * Provides cluster-level details including status, hardware and software configuration, VPC settings, and so on.
     * For information about the cluster steps, see <a>ListSteps</a>.
     * </p>
     * 
     * @param describeClusterRequest
     *        This input determines which cluster to describe.
     * @return Result of the DescribeCluster operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.DescribeCluster
     */
    DescribeClusterResult describeCluster(DescribeClusterRequest describeClusterRequest);

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
     * @return Result of the DescribeJobFlows operation returned by the service.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and that the request was not completed.
     * @sample AmazonElasticMapReduce.DescribeJobFlows
     */
    @Deprecated
    DescribeJobFlowsResult describeJobFlows(DescribeJobFlowsRequest describeJobFlowsRequest);

    /**
     * Simplified method form for invoking the DescribeJobFlows operation.
     *
     * @see #describeJobFlows(DescribeJobFlowsRequest)
     */
    @Deprecated
    DescribeJobFlowsResult describeJobFlows();

    /**
     * <p>
     * Provides the details of a security configuration by returning the configuration JSON.
     * </p>
     * 
     * @param describeSecurityConfigurationRequest
     * @return Result of the DescribeSecurityConfiguration operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.DescribeSecurityConfiguration
     */
    DescribeSecurityConfigurationResult describeSecurityConfiguration(DescribeSecurityConfigurationRequest describeSecurityConfigurationRequest);

    /**
     * <p>
     * Provides more detail about the cluster step.
     * </p>
     * 
     * @param describeStepRequest
     *        This input determines which step to describe.
     * @return Result of the DescribeStep operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.DescribeStep
     */
    DescribeStepResult describeStep(DescribeStepRequest describeStepRequest);

    /**
     * <p>
     * Provides information about the bootstrap actions associated with a cluster.
     * </p>
     * 
     * @param listBootstrapActionsRequest
     *        This input determines which bootstrap actions to retrieve.
     * @return Result of the ListBootstrapActions operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.ListBootstrapActions
     */
    ListBootstrapActionsResult listBootstrapActions(ListBootstrapActionsRequest listBootstrapActionsRequest);

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
     * @return Result of the ListClusters operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.ListClusters
     */
    ListClustersResult listClusters(ListClustersRequest listClustersRequest);

    /**
     * Simplified method form for invoking the ListClusters operation.
     *
     * @see #listClusters(ListClustersRequest)
     */
    ListClustersResult listClusters();

    /**
     * <p>
     * Provides all available details about the instance groups in a cluster.
     * </p>
     * 
     * @param listInstanceGroupsRequest
     *        This input determines which instance groups to retrieve.
     * @return Result of the ListInstanceGroups operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.ListInstanceGroups
     */
    ListInstanceGroupsResult listInstanceGroups(ListInstanceGroupsRequest listInstanceGroupsRequest);

    /**
     * <p>
     * Provides information about the cluster instances that Amazon EMR provisions on behalf of a user when it creates
     * the cluster. For example, this operation indicates when the EC2 instances reach the Ready state, when instances
     * become available to Amazon EMR to use for jobs, and the IP addresses for cluster instances, etc.
     * </p>
     * 
     * @param listInstancesRequest
     *        This input determines which instances to list.
     * @return Result of the ListInstances operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.ListInstances
     */
    ListInstancesResult listInstances(ListInstancesRequest listInstancesRequest);

    /**
     * <p>
     * Lists all the security configurations visible to this account, providing their creation dates and times, and
     * their names. This call returns a maximum of 50 clusters per call, but returns a marker to track the paging of the
     * cluster list across multiple ListSecurityConfigurations calls.
     * </p>
     * 
     * @param listSecurityConfigurationsRequest
     * @return Result of the ListSecurityConfigurations operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.ListSecurityConfigurations
     */
    ListSecurityConfigurationsResult listSecurityConfigurations(ListSecurityConfigurationsRequest listSecurityConfigurationsRequest);

    /**
     * <p>
     * Provides a list of steps for the cluster in reverse order unless you specify stepIds with the request.
     * </p>
     * 
     * @param listStepsRequest
     *        This input determines which steps to list.
     * @return Result of the ListSteps operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.ListSteps
     */
    ListStepsResult listSteps(ListStepsRequest listStepsRequest);

    /**
     * <p>
     * ModifyInstanceGroups modifies the number of nodes and configuration settings of an instance group. The input
     * parameters include the new target instance count for the group and the instance group ID. The call will either
     * succeed or fail atomically.
     * </p>
     * 
     * @param modifyInstanceGroupsRequest
     *        Change the size of some instance groups.
     * @return Result of the ModifyInstanceGroups operation returned by the service.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and that the request was not completed.
     * @sample AmazonElasticMapReduce.ModifyInstanceGroups
     */
    ModifyInstanceGroupsResult modifyInstanceGroups(ModifyInstanceGroupsRequest modifyInstanceGroupsRequest);

    /**
     * Simplified method form for invoking the ModifyInstanceGroups operation.
     *
     * @see #modifyInstanceGroups(ModifyInstanceGroupsRequest)
     */
    ModifyInstanceGroupsResult modifyInstanceGroups();

    /**
     * <p>
     * Creates or updates an automatic scaling policy for a core instance group or task instance group in an Amazon EMR
     * cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances
     * in response to the value of a CloudWatch metric.
     * </p>
     * 
     * @param putAutoScalingPolicyRequest
     * @return Result of the PutAutoScalingPolicy operation returned by the service.
     * @sample AmazonElasticMapReduce.PutAutoScalingPolicy
     */
    PutAutoScalingPolicyResult putAutoScalingPolicy(PutAutoScalingPolicyRequest putAutoScalingPolicyRequest);

    /**
     * <p>
     * Removes an automatic scaling policy from a specified instance group within an EMR cluster.
     * </p>
     * 
     * @param removeAutoScalingPolicyRequest
     * @return Result of the RemoveAutoScalingPolicy operation returned by the service.
     * @sample AmazonElasticMapReduce.RemoveAutoScalingPolicy
     */
    RemoveAutoScalingPolicyResult removeAutoScalingPolicy(RemoveAutoScalingPolicyRequest removeAutoScalingPolicyRequest);

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
     * @return Result of the RemoveTags operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the EMR service.
     * @throws InvalidRequestException
     *         This exception occurs when there is something wrong with user input.
     * @sample AmazonElasticMapReduce.RemoveTags
     */
    RemoveTagsResult removeTags(RemoveTagsRequest removeTagsRequest);

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
     * @return Result of the RunJobFlow operation returned by the service.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and that the request was not completed.
     * @sample AmazonElasticMapReduce.RunJobFlow
     */
    RunJobFlowResult runJobFlow(RunJobFlowRequest runJobFlowRequest);

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
     * @return Result of the SetTerminationProtection operation returned by the service.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and that the request was not completed.
     * @sample AmazonElasticMapReduce.SetTerminationProtection
     */
    SetTerminationProtectionResult setTerminationProtection(SetTerminationProtectionRequest setTerminationProtectionRequest);

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
     * @return Result of the SetVisibleToAllUsers operation returned by the service.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and that the request was not completed.
     * @sample AmazonElasticMapReduce.SetVisibleToAllUsers
     */
    SetVisibleToAllUsersResult setVisibleToAllUsers(SetVisibleToAllUsersRequest setVisibleToAllUsersRequest);

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
     * @return Result of the TerminateJobFlows operation returned by the service.
     * @throws InternalServerErrorException
     *         Indicates that an error occurred while processing the request and that the request was not completed.
     * @sample AmazonElasticMapReduce.TerminateJobFlows
     */
    TerminateJobFlowsResult terminateJobFlows(TerminateJobFlowsRequest terminateJobFlowsRequest);

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

    AmazonElasticMapReduceWaiters waiters();

}
