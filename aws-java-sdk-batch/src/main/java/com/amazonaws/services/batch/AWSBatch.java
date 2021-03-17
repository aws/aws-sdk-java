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
package com.amazonaws.services.batch;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.batch.model.*;

/**
 * Interface for accessing AWS Batch.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.batch.AbstractAWSBatch} instead.
 * </p>
 * <p>
 * <p>
 * Using AWS Batch, you can run batch computing workloads on the AWS Cloud. Batch computing is a common means for
 * developers, scientists, and engineers to access large amounts of compute resources. AWS Batch uses the advantages of
 * this computing workload to remove the undifferentiated heavy lifting of configuring and managing required
 * infrastructure. At the same time, it also adopts a familiar batch computing software approach. Given these
 * advantages, AWS Batch can help you to efficiently provision resources in response to jobs submitted, thus effectively
 * helping you to eliminate capacity constraints, reduce compute costs, and deliver your results more quickly.
 * </p>
 * <p>
 * As a fully managed service, AWS Batch can run batch computing workloads of any scale. AWS Batch automatically
 * provisions compute resources and optimizes workload distribution based on the quantity and scale of your specific
 * workloads. With AWS Batch, there's no need to install or manage batch computing software. This means that you can
 * focus your time and energy on analyzing results and solving your specific problems.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSBatch {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "batch";

    /**
     * Overrides the default endpoint for this client ("batch.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "batch.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "batch.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol from this
     * client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "batch.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "batch.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSBatch#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
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
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Cancels a job in an AWS Batch job queue. Jobs that are in the <code>SUBMITTED</code>, <code>PENDING</code>, or
     * <code>RUNNABLE</code> state are canceled. Jobs that have progressed to <code>STARTING</code> or
     * <code>RUNNING</code> aren't canceled, but the API operation still succeeds, even if no job is canceled. These
     * jobs must be terminated with the <a>TerminateJob</a> operation.
     * </p>
     * 
     * @param cancelJobRequest
     *        Contains the parameters for <code>CancelJob</code>.
     * @return Result of the CancelJob operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that's not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.CancelJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/CancelJob" target="_top">AWS API
     *      Documentation</a>
     */
    CancelJobResult cancelJob(CancelJobRequest cancelJobRequest);

    /**
     * <p>
     * Creates an AWS Batch compute environment. You can create <code>MANAGED</code> or <code>UNMANAGED</code> compute
     * environments. <code>MANAGED</code> compute environments can use Amazon EC2 or AWS Fargate resources.
     * <code>UNMANAGED</code> compute environments can only use EC2 resources.
     * </p>
     * <p>
     * In a managed compute environment, AWS Batch manages the capacity and instance types of the compute resources
     * within the environment. This is based on the compute resource specification that you define or the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html">launch template</a> that you
     * specify when you create the compute environment. Either, you can choose to use EC2 On-Demand Instances and EC2
     * Spot Instances. Or, you can use Fargate and Fargate Spot capacity in your managed compute environment. You can
     * optionally set a maximum price so that Spot Instances only launch when the Spot Instance price is less than a
     * specified percentage of the On-Demand price.
     * </p>
     * <note>
     * <p>
     * Multi-node parallel jobs aren't supported on Spot Instances.
     * </p>
     * </note>
     * <p>
     * In an unmanaged compute environment, you can manage your own EC2 compute resources and have a lot of flexibility
     * with how you configure your compute resources. For example, you can use custom AMIs. However, you must verify
     * that each of your AMIs meet the Amazon ECS container instance AMI specification. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container_instance_AMIs.html">container
     * instance AMIs</a> in the <i>Amazon Elastic Container Service Developer Guide</i>. After you created your
     * unmanaged compute environment, you can use the <a>DescribeComputeEnvironments</a> operation to find the Amazon
     * ECS cluster that's associated with it. Then, launch your container instances into that Amazon ECS cluster. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_container_instance.html">Launching an
     * Amazon ECS container instance</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * AWS Batch doesn't upgrade the AMIs in a compute environment after the environment is created. For example, it
     * doesn't update the AMIs when a newer version of the Amazon ECS optimized AMI is available. Therefore, you're
     * responsible for managing the guest operating system (including its updates and security patches) and any
     * additional application software or utilities that you install on the compute resources. To use a new AMI for your
     * AWS Batch jobs, complete these steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a new compute environment with the new AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Add the compute environment to an existing job queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * Remove the earlier compute environment from your job queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete the earlier compute environment.
     * </p>
     * </li>
     * </ol>
     * </note>
     * 
     * @param createComputeEnvironmentRequest
     *        Contains the parameters for <code>CreateComputeEnvironment</code>.
     * @return Result of the CreateComputeEnvironment operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that's not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.CreateComputeEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/CreateComputeEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    CreateComputeEnvironmentResult createComputeEnvironment(CreateComputeEnvironmentRequest createComputeEnvironmentRequest);

    /**
     * <p>
     * Creates an AWS Batch job queue. When you create a job queue, you associate one or more compute environments to
     * the queue and assign an order of preference for the compute environments.
     * </p>
     * <p>
     * You also set a priority to the job queue that determines the order that the AWS Batch scheduler places jobs onto
     * its associated compute environments. For example, if a compute environment is associated with more than one job
     * queue, the job queue with a higher priority is given preference for scheduling jobs to that compute environment.
     * </p>
     * 
     * @param createJobQueueRequest
     *        Contains the parameters for <code>CreateJobQueue</code>.
     * @return Result of the CreateJobQueue operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that's not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.CreateJobQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/CreateJobQueue" target="_top">AWS API
     *      Documentation</a>
     */
    CreateJobQueueResult createJobQueue(CreateJobQueueRequest createJobQueueRequest);

    /**
     * <p>
     * Deletes an AWS Batch compute environment.
     * </p>
     * <p>
     * Before you can delete a compute environment, you must set its state to <code>DISABLED</code> with the
     * <a>UpdateComputeEnvironment</a> API operation and disassociate it from any job queues with the
     * <a>UpdateJobQueue</a> API operation. Compute environments that use AWS Fargate resources must terminate all
     * active jobs on that compute environment before deleting the compute environment. If this isn't done, the compute
     * environment enters an invalid state.
     * </p>
     * 
     * @param deleteComputeEnvironmentRequest
     *        Contains the parameters for <code>DeleteComputeEnvironment</code>.
     * @return Result of the DeleteComputeEnvironment operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that's not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.DeleteComputeEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DeleteComputeEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteComputeEnvironmentResult deleteComputeEnvironment(DeleteComputeEnvironmentRequest deleteComputeEnvironmentRequest);

    /**
     * <p>
     * Deletes the specified job queue. You must first disable submissions for a queue with the <a>UpdateJobQueue</a>
     * operation. All jobs in the queue are eventually terminated when you delete a job queue. The jobs are terminated
     * at a rate of about 16 jobs each second.
     * </p>
     * <p>
     * It's not necessary to disassociate compute environments from a queue before submitting a
     * <code>DeleteJobQueue</code> request.
     * </p>
     * 
     * @param deleteJobQueueRequest
     *        Contains the parameters for <code>DeleteJobQueue</code>.
     * @return Result of the DeleteJobQueue operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that's not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.DeleteJobQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DeleteJobQueue" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteJobQueueResult deleteJobQueue(DeleteJobQueueRequest deleteJobQueueRequest);

    /**
     * <p>
     * Deregisters an AWS Batch job definition. Job definitions are permanently deleted after 180 days.
     * </p>
     * 
     * @param deregisterJobDefinitionRequest
     * @return Result of the DeregisterJobDefinition operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that's not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.DeregisterJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DeregisterJobDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    DeregisterJobDefinitionResult deregisterJobDefinition(DeregisterJobDefinitionRequest deregisterJobDefinitionRequest);

    /**
     * <p>
     * Describes one or more of your compute environments.
     * </p>
     * <p>
     * If you're using an unmanaged compute environment, you can use the <code>DescribeComputeEnvironment</code>
     * operation to determine the <code>ecsClusterArn</code> that you should launch your Amazon ECS container instances
     * into.
     * </p>
     * 
     * @param describeComputeEnvironmentsRequest
     *        Contains the parameters for <code>DescribeComputeEnvironments</code>.
     * @return Result of the DescribeComputeEnvironments operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that's not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.DescribeComputeEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DescribeComputeEnvironments"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeComputeEnvironmentsResult describeComputeEnvironments(DescribeComputeEnvironmentsRequest describeComputeEnvironmentsRequest);

    /**
     * <p>
     * Describes a list of job definitions. You can specify a <code>status</code> (such as <code>ACTIVE</code>) to only
     * return job definitions that match that status.
     * </p>
     * 
     * @param describeJobDefinitionsRequest
     *        Contains the parameters for <code>DescribeJobDefinitions</code>.
     * @return Result of the DescribeJobDefinitions operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that's not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.DescribeJobDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DescribeJobDefinitions" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeJobDefinitionsResult describeJobDefinitions(DescribeJobDefinitionsRequest describeJobDefinitionsRequest);

    /**
     * <p>
     * Describes one or more of your job queues.
     * </p>
     * 
     * @param describeJobQueuesRequest
     *        Contains the parameters for <code>DescribeJobQueues</code>.
     * @return Result of the DescribeJobQueues operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that's not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.DescribeJobQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DescribeJobQueues" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeJobQueuesResult describeJobQueues(DescribeJobQueuesRequest describeJobQueuesRequest);

    /**
     * <p>
     * Describes a list of AWS Batch jobs.
     * </p>
     * 
     * @param describeJobsRequest
     *        Contains the parameters for <code>DescribeJobs</code>.
     * @return Result of the DescribeJobs operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that's not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.DescribeJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DescribeJobs" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeJobsResult describeJobs(DescribeJobsRequest describeJobsRequest);

    /**
     * <p>
     * Returns a list of AWS Batch jobs.
     * </p>
     * <p>
     * You must specify only one of the following items:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A job queue ID to return a list of jobs in that job queue
     * </p>
     * </li>
     * <li>
     * <p>
     * A multi-node parallel job ID to return a list of nodes for that job
     * </p>
     * </li>
     * <li>
     * <p>
     * An array job ID to return a list of the children for that job
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can filter the results by job status with the <code>jobStatus</code> parameter. If you don't specify a
     * status, only <code>RUNNING</code> jobs are returned.
     * </p>
     * 
     * @param listJobsRequest
     *        Contains the parameters for <code>ListJobs</code>.
     * @return Result of the ListJobs operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that's not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListJobsResult listJobs(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * Lists the tags for an AWS Batch resource. AWS Batch resources that support tags are compute environments, jobs,
     * job definitions, and job queues. ARNs for child jobs of array and multi-node parallel (MNP) jobs are not
     * supported.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that's not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Registers an AWS Batch job definition.
     * </p>
     * 
     * @param registerJobDefinitionRequest
     *        Contains the parameters for <code>RegisterJobDefinition</code>.
     * @return Result of the RegisterJobDefinition operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that's not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.RegisterJobDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/RegisterJobDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    RegisterJobDefinitionResult registerJobDefinition(RegisterJobDefinitionRequest registerJobDefinitionRequest);

    /**
     * <p>
     * Submits an AWS Batch job from a job definition. Parameters that are specified during <a>SubmitJob</a> override
     * parameters defined in the job definition. vCPU and memory requirements that are specified in the
     * <code>ResourceRequirements</code> objects in the job definition are the exception. They can't be overridden this
     * way using the <code>memory</code> and <code>vcpus</code> parameters. Rather, you must specify updates to job
     * definition parameters in a <code>ResourceRequirements</code> object that's included in the
     * <code>containerOverrides</code> parameter.
     * </p>
     * <important>
     * <p>
     * Jobs that run on Fargate resources can't be guaranteed to run for more than 14 days. This is because, after 14
     * days, Fargate resources might become unavailable and job might be terminated.
     * </p>
     * </important>
     * 
     * @param submitJobRequest
     *        Contains the parameters for <code>SubmitJob</code>.
     * @return Result of the SubmitJob operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that's not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.SubmitJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/SubmitJob" target="_top">AWS API
     *      Documentation</a>
     */
    SubmitJobResult submitJob(SubmitJobRequest submitJobRequest);

    /**
     * <p>
     * Associates the specified tags to a resource with the specified <code>resourceArn</code>. If existing tags on a
     * resource aren't specified in the request parameters, they aren't changed. When a resource is deleted, the tags
     * associated with that resource are deleted as well. AWS Batch resources that support tags are compute
     * environments, jobs, job definitions, and job queues. ARNs for child jobs of array and multi-node parallel (MNP)
     * jobs are not supported.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that's not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Terminates a job in a job queue. Jobs that are in the <code>STARTING</code> or <code>RUNNING</code> state are
     * terminated, which causes them to transition to <code>FAILED</code>. Jobs that have not progressed to the
     * <code>STARTING</code> state are cancelled.
     * </p>
     * 
     * @param terminateJobRequest
     *        Contains the parameters for <code>TerminateJob</code>.
     * @return Result of the TerminateJob operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that's not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.TerminateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/TerminateJob" target="_top">AWS API
     *      Documentation</a>
     */
    TerminateJobResult terminateJob(TerminateJobRequest terminateJobRequest);

    /**
     * <p>
     * Deletes specified tags from an AWS Batch resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that's not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an AWS Batch compute environment.
     * </p>
     * 
     * @param updateComputeEnvironmentRequest
     *        Contains the parameters for <code>UpdateComputeEnvironment</code>.
     * @return Result of the UpdateComputeEnvironment operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that's not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.UpdateComputeEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/UpdateComputeEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateComputeEnvironmentResult updateComputeEnvironment(UpdateComputeEnvironmentRequest updateComputeEnvironmentRequest);

    /**
     * <p>
     * Updates a job queue.
     * </p>
     * 
     * @param updateJobQueueRequest
     *        Contains the parameters for <code>UpdateJobQueue</code>.
     * @return Result of the UpdateJobQueue operation returned by the service.
     * @throws ClientException
     *         These errors are usually caused by a client action, such as using an action or resource on behalf of a
     *         user that doesn't have permissions to use the action or resource, or specifying an identifier that's not
     *         valid.
     * @throws ServerException
     *         These errors are usually caused by a server issue.
     * @sample AWSBatch.UpdateJobQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/UpdateJobQueue" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateJobQueueResult updateJobQueue(UpdateJobQueueRequest updateJobQueueRequest);

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
