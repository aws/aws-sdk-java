/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.autoscaling.model.*;

/**
 * Interface for accessing AmazonAutoScaling.
 * Auto Scaling <p>
 * Auto Scaling is designed to automatically launch or terminate EC2
 * instances based on user-defined policies, schedules, and health
 * checks. Use this service in conjunction with the Amazon CloudWatch and
 * Elastic Load Balancing services.
 * </p>
 */
public interface AmazonAutoScaling {

    /**
     * Overrides the default endpoint for this client ("https://autoscaling.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "autoscaling.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://autoscaling.amazonaws.com"). If the
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
     *            The endpoint (ex: "autoscaling.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://autoscaling.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonAutoScaling#setEndpoint(String)}, sets the
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
     * Describes the current Auto Scaling resource limits for your AWS
     * account.
     * </p>
     * <p>
     * For information about requesting an increase in these limits, see
     * <a href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"> AWS Service Limits </a>
     * in the <i>Amazon Web Services General Reference</i> .
     * </p>
     *
     * @param describeAccountLimitsRequest Container for the necessary
     *           parameters to execute the DescribeAccountLimits service method on
     *           AmazonAutoScaling.
     * 
     * @return The response from the DescribeAccountLimits service method, as
     *         returned by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAccountLimitsResult describeAccountLimits(DescribeAccountLimitsRequest describeAccountLimitsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more Auto Scaling groups. If a list of names is not
     * provided, the call describes all Auto Scaling groups.
     * </p>
     *
     * @param describeAutoScalingGroupsRequest Container for the necessary
     *           parameters to execute the DescribeAutoScalingGroups service method on
     *           AmazonAutoScaling.
     * 
     * @return The response from the DescribeAutoScalingGroups service
     *         method, as returned by AmazonAutoScaling.
     * 
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAutoScalingGroupsResult describeAutoScalingGroups(DescribeAutoScalingGroupsRequest describeAutoScalingGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Resumes the specified suspended Auto Scaling processes for the
     * specified Auto Scaling group. To resume specific processes, use the
     * <code>ScalingProcesses</code> parameter. To resume all processes, omit
     * the <code>ScalingProcesses</code> parameter. For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SuspendResume.html"> Suspend and Resume Auto Scaling Processes </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param resumeProcessesRequest Container for the necessary parameters
     *           to execute the ResumeProcesses service method on AmazonAutoScaling.
     * 
     * 
     * @throws ResourceInUseException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void resumeProcesses(ResumeProcessesRequest resumeProcessesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables monitoring of the specified metrics for the specified Auto
     * Scaling group.
     * </p>
     * <p>
     * You can only enable metrics collection if
     * <code>InstanceMonitoring</code> in the launch configuration for the
     * group is set to <code>True</code> .
     * </p>
     *
     * @param enableMetricsCollectionRequest Container for the necessary
     *           parameters to execute the EnableMetricsCollection service method on
     *           AmazonAutoScaling.
     * 
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void enableMetricsCollection(EnableMetricsCollectionRequest enableMetricsCollectionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the lifecycle hooks for the specified Auto Scaling group.
     * </p>
     *
     * @param describeLifecycleHooksRequest Container for the necessary
     *           parameters to execute the DescribeLifecycleHooks service method on
     *           AmazonAutoScaling.
     * 
     * @return The response from the DescribeLifecycleHooks service method,
     *         as returned by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLifecycleHooksResult describeLifecycleHooks(DescribeLifecycleHooksRequest describeLifecycleHooksRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the policies for the specified Auto Scaling group.
     * </p>
     *
     * @param describePoliciesRequest Container for the necessary parameters
     *           to execute the DescribePolicies service method on AmazonAutoScaling.
     * 
     * @return The response from the DescribePolicies service method, as
     *         returned by AmazonAutoScaling.
     * 
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribePoliciesResult describePolicies(DescribePoliciesRequest describePoliciesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the scaling process types for use with ResumeProcesses and
     * SuspendProcesses.
     * </p>
     *
     * @param describeScalingProcessTypesRequest Container for the necessary
     *           parameters to execute the DescribeScalingProcessTypes service method
     *           on AmazonAutoScaling.
     * 
     * @return The response from the DescribeScalingProcessTypes service
     *         method, as returned by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeScalingProcessTypesResult describeScalingProcessTypes(DescribeScalingProcessTypesRequest describeScalingProcessTypesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified launch configuration.
     * </p>
     * <p>
     * The launch configuration must not be attached to an Auto Scaling
     * group. When this call completes, the launch configuration is no longer
     * available for use.
     * </p>
     *
     * @param deleteLaunchConfigurationRequest Container for the necessary
     *           parameters to execute the DeleteLaunchConfiguration service method on
     *           AmazonAutoScaling.
     * 
     * 
     * @throws ResourceInUseException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteLaunchConfiguration(DeleteLaunchConfigurationRequest deleteLaunchConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an Auto Scaling group with the specified name and attributes.
     * </p>
     * <p>
     * If you exceed your maximum limit of Auto Scaling groups, which by
     * default is 20 per region, the call fails. For information about
     * viewing and updating this limit, see DescribeAccountLimits.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroup.html"> Auto Scaling Groups </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param createAutoScalingGroupRequest Container for the necessary
     *           parameters to execute the CreateAutoScalingGroup service method on
     *           AmazonAutoScaling.
     * 
     * 
     * @throws LimitExceededException
     * @throws ResourceContentionException
     * @throws AlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createAutoScalingGroup(CreateAutoScalingGroupRequest createAutoScalingGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attaches one or more EC2 instances to the specified Auto Scaling
     * group.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/attach-instance-asg.html"> Attach EC2 Instances to Your Auto Scaling Group </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param attachInstancesRequest Container for the necessary parameters
     *           to execute the AttachInstances service method on AmazonAutoScaling.
     * 
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void attachInstances(AttachInstancesRequest attachInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more scaling activities for the specified Auto
     * Scaling group. If you omit the <code>ActivityIds</code> , the call
     * returns all activities from the past six weeks. Activities are sorted
     * by the start time. Activities still in progress appear first on the
     * list.
     * </p>
     *
     * @param describeScalingActivitiesRequest Container for the necessary
     *           parameters to execute the DescribeScalingActivities service method on
     *           AmazonAutoScaling.
     * 
     * @return The response from the DescribeScalingActivities service
     *         method, as returned by AmazonAutoScaling.
     * 
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeScalingActivitiesResult describeScalingActivities(DescribeScalingActivitiesRequest describeScalingActivitiesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the notification actions associated with the specified Auto
     * Scaling group.
     * </p>
     *
     * @param describeNotificationConfigurationsRequest Container for the
     *           necessary parameters to execute the DescribeNotificationConfigurations
     *           service method on AmazonAutoScaling.
     * 
     * @return The response from the DescribeNotificationConfigurations
     *         service method, as returned by AmazonAutoScaling.
     * 
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeNotificationConfigurationsResult describeNotificationConfigurations(DescribeNotificationConfigurationsRequest describeNotificationConfigurationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified lifecycle hook.
     * </p>
     * <p>
     * If there are any outstanding lifecycle actions, they are completed
     * first ( <code>ABANDON</code> for launching instances,
     * <code>CONTINUE</code> for terminating instances).
     * </p>
     *
     * @param deleteLifecycleHookRequest Container for the necessary
     *           parameters to execute the DeleteLifecycleHook service method on
     *           AmazonAutoScaling.
     * 
     * @return The response from the DeleteLifecycleHook service method, as
     *         returned by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteLifecycleHookResult deleteLifecycleHook(DeleteLifecycleHookRequest deleteLifecycleHookRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates or updates a lifecycle hook for the specified Auto Scaling
     * Group.
     * </p>
     * <p>
     * A lifecycle hook tells Auto Scaling that you want to perform an
     * action on an instance that is not actively in service; for example,
     * either when the instance launches or before the instance terminates.
     * </p>
     * <p>
     * This operation is a part of the basic sequence for adding a lifecycle
     * hook to an Auto Scaling group:
     * </p>
     * <ol> <li>Create a notification target. A target can be either an
     * Amazon SQS queue or an Amazon SNS topic.</li>
     * <li>Create an IAM role. This role allows Auto Scaling to publish
     * lifecycle notifications to the designated SQS queue or SNS topic.</li>
     * <li> <b>Create the lifecycle hook. You can create a hook that acts
     * when instances launch or when instances terminate.</b> </li>
     * <li>If necessary, record the lifecycle action heartbeat to keep the
     * instance in a pending state.</li>
     * <li>Complete the lifecycle action.</li>
     * </ol> <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingPendingState.html"> Auto Scaling Pending State </a> and <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingTerminatingState.html"> Auto Scaling Terminating State </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     * <p>
     * If you exceed your maximum limit of lifecycle hooks, which by default
     * is 50 per region, the call fails. For information about updating this
     * limit, see
     * <a href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"> AWS Service Limits </a>
     * in the <i>Amazon Web Services General Reference</i> .
     * </p>
     *
     * @param putLifecycleHookRequest Container for the necessary parameters
     *           to execute the PutLifecycleHook service method on AmazonAutoScaling.
     * 
     * @return The response from the PutLifecycleHook service method, as
     *         returned by AmazonAutoScaling.
     * 
     * @throws LimitExceededException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PutLifecycleHookResult putLifecycleHook(PutLifecycleHookRequest putLifecycleHookRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the termination policies supported by Auto Scaling.
     * </p>
     *
     * @param describeTerminationPolicyTypesRequest Container for the
     *           necessary parameters to execute the DescribeTerminationPolicyTypes
     *           service method on AmazonAutoScaling.
     * 
     * @return The response from the DescribeTerminationPolicyTypes service
     *         method, as returned by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTerminationPolicyTypesResult describeTerminationPolicyTypes(DescribeTerminationPolicyTypesRequest describeTerminationPolicyTypesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified tags.
     * </p>
     * <p>
     * You can use filters to limit the results. For example, you can query
     * for the tags for a specific Auto Scaling group. You can specify
     * multiple values for a filter. A tag must match at least one of the
     * specified values for it to be included in the results.
     * </p>
     * <p>
     * You can also specify multiple filters. The result includes
     * information for a particular tag only if it matches all the filters.
     * If there's no match, no special message is returned.
     * </p>
     *
     * @param describeTagsRequest Container for the necessary parameters to
     *           execute the DescribeTags service method on AmazonAutoScaling.
     * 
     * @return The response from the DescribeTags service method, as returned
     *         by AmazonAutoScaling.
     * 
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified tags.
     * </p>
     *
     * @param deleteTagsRequest Container for the necessary parameters to
     *           execute the DeleteTags service method on AmazonAutoScaling.
     * 
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteTags(DeleteTagsRequest deleteTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Executes the specified policy.
     * </p>
     *
     * @param executePolicyRequest Container for the necessary parameters to
     *           execute the ExecutePolicy service method on AmazonAutoScaling.
     * 
     * 
     * @throws ScalingActivityInProgressException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void executePolicy(ExecutePolicyRequest executePolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes one or more load balancers from the specified Auto Scaling
     * group.
     * </p>
     * <p>
     * When you detach a load balancer, it enters the <code>Removing</code>
     * state while deregistering the instances in the group. When all
     * instances are deregistered, then you can no longer describe the load
     * balancer using DescribeLoadBalancers. Note that the instances remain
     * running.
     * </p>
     *
     * @param detachLoadBalancersRequest Container for the necessary
     *           parameters to execute the DetachLoadBalancers service method on
     *           AmazonAutoScaling.
     * 
     * @return The response from the DetachLoadBalancers service method, as
     *         returned by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DetachLoadBalancersResult detachLoadBalancers(DetachLoadBalancersRequest detachLoadBalancersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates or updates a policy for an Auto Scaling group. To update an
     * existing policy, use the existing policy name and set the parameters
     * you want to change. Any existing parameter not changed in an update to
     * an existing policy is not changed in this update request.
     * </p>
     * <p>
     * If you exceed your maximum limit of step adjustments, which by
     * default is 20 per region, the call fails. For information about
     * updating this limit, see
     * <a href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"> AWS Service Limits </a>
     * in the <i>Amazon Web Services General Reference</i> .
     * </p>
     *
     * @param putScalingPolicyRequest Container for the necessary parameters
     *           to execute the PutScalingPolicy service method on AmazonAutoScaling.
     * 
     * @return The response from the PutScalingPolicy service method, as
     *         returned by AmazonAutoScaling.
     * 
     * @throws LimitExceededException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PutScalingPolicyResult putScalingPolicy(PutScalingPolicyRequest putScalingPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Configures an Auto Scaling group to send notifications when specified
     * events take place. Subscribers to this topic can have messages for
     * events delivered to an endpoint such as a web server or email address.
     * </p>
     * <p>
     * For more information see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASGettingNotifications.html"> Getting Notifications When Your Auto Scaling Group Changes </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     * <p>
     * This configuration overwrites an existing configuration.
     * </p>
     *
     * @param putNotificationConfigurationRequest Container for the necessary
     *           parameters to execute the PutNotificationConfiguration service method
     *           on AmazonAutoScaling.
     * 
     * 
     * @throws LimitExceededException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void putNotificationConfiguration(PutNotificationConfigurationRequest putNotificationConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Moves the specified instances out of <code>Standby</code> mode.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingInServiceState.html"> Auto Scaling InService State </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param exitStandbyRequest Container for the necessary parameters to
     *           execute the ExitStandby service method on AmazonAutoScaling.
     * 
     * @return The response from the ExitStandby service method, as returned
     *         by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ExitStandbyResult exitStandby(ExitStandbyRequest exitStandbyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified Auto Scaling policy.
     * </p>
     *
     * @param deletePolicyRequest Container for the necessary parameters to
     *           execute the DeletePolicy service method on AmazonAutoScaling.
     * 
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deletePolicy(DeletePolicyRequest deletePolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified scheduled action.
     * </p>
     *
     * @param deleteScheduledActionRequest Container for the necessary
     *           parameters to execute the DeleteScheduledAction service method on
     *           AmazonAutoScaling.
     * 
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteScheduledAction(DeleteScheduledActionRequest deleteScheduledActionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified notification.
     * </p>
     *
     * @param deleteNotificationConfigurationRequest Container for the
     *           necessary parameters to execute the DeleteNotificationConfiguration
     *           service method on AmazonAutoScaling.
     * 
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteNotificationConfiguration(DeleteNotificationConfigurationRequest deleteNotificationConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Completes the lifecycle action for the associated token initiated
     * under the given lifecycle hook with the specified result.
     * </p>
     * <p>
     * This operation is a part of the basic sequence for adding a lifecycle
     * hook to an Auto Scaling group:
     * </p>
     * <ol> <li>Create a notification target. A target can be either an
     * Amazon SQS queue or an Amazon SNS topic.</li>
     * <li>Create an IAM role. This role allows Auto Scaling to publish
     * lifecycle notifications to the designated SQS queue or SNS topic.</li>
     * <li>Create the lifecycle hook. You can create a hook that acts when
     * instances launch or when instances terminate.</li>
     * <li>If necessary, record the lifecycle action heartbeat to keep the
     * instance in a pending state.</li>
     * <li> <b>Complete the lifecycle action</b> .</li>
     * </ol> <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingPendingState.html"> Auto Scaling Pending State </a> and <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingTerminatingState.html"> Auto Scaling Terminating State </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param completeLifecycleActionRequest Container for the necessary
     *           parameters to execute the CompleteLifecycleAction service method on
     *           AmazonAutoScaling.
     * 
     * @return The response from the CompleteLifecycleAction service method,
     *         as returned by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CompleteLifecycleActionResult completeLifecycleAction(CompleteLifecycleActionRequest completeLifecycleActionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the health status of the specified instance.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"> Health Checks </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param setInstanceHealthRequest Container for the necessary parameters
     *           to execute the SetInstanceHealth service method on AmazonAutoScaling.
     * 
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setInstanceHealth(SetInstanceHealthRequest setInstanceHealthRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the notification types that are supported by Auto Scaling.
     * </p>
     *
     * @param describeAutoScalingNotificationTypesRequest Container for the
     *           necessary parameters to execute the
     *           DescribeAutoScalingNotificationTypes service method on
     *           AmazonAutoScaling.
     * 
     * @return The response from the DescribeAutoScalingNotificationTypes
     *         service method, as returned by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAutoScalingNotificationTypesResult describeAutoScalingNotificationTypes(DescribeAutoScalingNotificationTypesRequest describeAutoScalingNotificationTypesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Suspends the specified Auto Scaling processes for the specified Auto
     * Scaling group. To suspend specific processes, use the
     * <code>ScalingProcesses</code> parameter. To suspend all processes,
     * omit the <code>ScalingProcesses</code> parameter.
     * </p>
     * <p>
     * Note that if you suspend either the <code>Launch</code> or
     * <code>Terminate</code> process types, it can prevent other process
     * types from functioning properly.
     * </p>
     * <p>
     * To resume processes that have been suspended, use ResumeProcesses.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SuspendResume.html"> Suspend and Resume Auto Scaling Processes </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param suspendProcessesRequest Container for the necessary parameters
     *           to execute the SuspendProcesses service method on AmazonAutoScaling.
     * 
     * 
     * @throws ResourceInUseException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void suspendProcesses(SuspendProcessesRequest suspendProcessesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates or updates tags for the specified Auto Scaling group.
     * </p>
     * <p>
     * A tag is defined by its resource ID, resource type, key, value, and
     * propagate flag. The value and the propagate flag are optional
     * parameters. The only supported resource type is
     * <code>auto-scaling-group</code> , and the resource ID must be the name
     * of the group. The <code>PropagateAtLaunch</code> flag determines
     * whether the tag is added to instances launched in the group. Valid
     * values are <code>true</code> or <code>false</code> .
     * </p>
     * <p>
     * When you specify a tag with a key that already exists, the operation
     * overwrites the previous tag definition, and you do not get an error
     * message.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html"> Tagging Auto Scaling Groups and Instances </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param createOrUpdateTagsRequest Container for the necessary
     *           parameters to execute the CreateOrUpdateTags service method on
     *           AmazonAutoScaling.
     * 
     * 
     * @throws LimitExceededException
     * @throws ResourceContentionException
     * @throws AlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createOrUpdateTags(CreateOrUpdateTagsRequest createOrUpdateTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the load balancers for the specified Auto Scaling group.
     * </p>
     *
     * @param describeLoadBalancersRequest Container for the necessary
     *           parameters to execute the DescribeLoadBalancers service method on
     *           AmazonAutoScaling.
     * 
     * @return The response from the DescribeLoadBalancers service method, as
     *         returned by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLoadBalancersResult describeLoadBalancers(DescribeLoadBalancersRequest describeLoadBalancersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attaches one or more load balancers to the specified Auto Scaling
     * group.
     * </p>
     * <p>
     * To describe the load balancers for an Auto Scaling group, use
     * DescribeLoadBalancers. To detach the load balancer from the Auto
     * Scaling group, use DetachLoadBalancers.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/attach-load-balancer-asg.html"> Attach a Load Balancer to Your Auto Scaling Group </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param attachLoadBalancersRequest Container for the necessary
     *           parameters to execute the AttachLoadBalancers service method on
     *           AmazonAutoScaling.
     * 
     * @return The response from the AttachLoadBalancers service method, as
     *         returned by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AttachLoadBalancersResult attachLoadBalancers(AttachLoadBalancersRequest attachLoadBalancersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes one or more instances from the specified Auto Scaling group.
     * After the instances are detached, you can manage them independently
     * from the rest of the Auto Scaling group.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/detach-instance-asg.html"> Detach EC2 Instances from Your Auto Scaling Group </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param detachInstancesRequest Container for the necessary parameters
     *           to execute the DetachInstances service method on AmazonAutoScaling.
     * 
     * @return The response from the DetachInstances service method, as
     *         returned by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DetachInstancesResult detachInstances(DetachInstancesRequest detachInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more Auto Scaling instances. If a list is not
     * provided, the call describes all instances.
     * </p>
     *
     * @param describeAutoScalingInstancesRequest Container for the necessary
     *           parameters to execute the DescribeAutoScalingInstances service method
     *           on AmazonAutoScaling.
     * 
     * @return The response from the DescribeAutoScalingInstances service
     *         method, as returned by AmazonAutoScaling.
     * 
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAutoScalingInstancesResult describeAutoScalingInstances(DescribeAutoScalingInstancesRequest describeAutoScalingInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a launch configuration.
     * </p>
     * <p>
     * If you exceed your maximum limit of launch configurations, which by
     * default is 100 per region, the call fails. For information about
     * viewing and updating this limit, see DescribeAccountLimits.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/LaunchConfiguration.html"> Launch Configurations </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param createLaunchConfigurationRequest Container for the necessary
     *           parameters to execute the CreateLaunchConfiguration service method on
     *           AmazonAutoScaling.
     * 
     * 
     * @throws LimitExceededException
     * @throws ResourceContentionException
     * @throws AlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createLaunchConfiguration(CreateLaunchConfigurationRequest createLaunchConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Moves the specified instances into <code>Standby</code> mode.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingInServiceState.html"> Auto Scaling InService State </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param enterStandbyRequest Container for the necessary parameters to
     *           execute the EnterStandby service method on AmazonAutoScaling.
     * 
     * @return The response from the EnterStandby service method, as returned
     *         by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EnterStandbyResult enterStandby(EnterStandbyRequest enterStandbyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the available types of lifecycle hooks.
     * </p>
     *
     * @param describeLifecycleHookTypesRequest Container for the necessary
     *           parameters to execute the DescribeLifecycleHookTypes service method on
     *           AmazonAutoScaling.
     * 
     * @return The response from the DescribeLifecycleHookTypes service
     *         method, as returned by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLifecycleHookTypesResult describeLifecycleHookTypes(DescribeLifecycleHookTypesRequest describeLifecycleHookTypesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified Auto Scaling group.
     * </p>
     * <p>
     * The group must have no instances and no scaling activities in
     * progress.
     * </p>
     * <p>
     * To remove all instances before calling
     * <code>DeleteAutoScalingGroup</code> , call UpdateAutoScalingGroup to
     * set the minimum and maximum size of the Auto Scaling group to zero.
     * </p>
     *
     * @param deleteAutoScalingGroupRequest Container for the necessary
     *           parameters to execute the DeleteAutoScalingGroup service method on
     *           AmazonAutoScaling.
     * 
     * 
     * @throws ResourceInUseException
     * @throws ScalingActivityInProgressException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteAutoScalingGroup(DeleteAutoScalingGroupRequest deleteAutoScalingGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disables monitoring of the specified metrics for the specified Auto
     * Scaling group.
     * </p>
     *
     * @param disableMetricsCollectionRequest Container for the necessary
     *           parameters to execute the DisableMetricsCollection service method on
     *           AmazonAutoScaling.
     * 
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void disableMetricsCollection(DisableMetricsCollectionRequest disableMetricsCollectionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the configuration for the specified Auto Scaling group.
     * </p>
     * <p>
     * To update an Auto Scaling group with a launch configuration with
     * <code>InstanceMonitoring</code> set to <code>False</code> , you must
     * first disable the collection of group metrics. Otherwise, you will get
     * an error. If you have previously enabled the collection of group
     * metrics, you can disable it using DisableMetricsCollection.
     * </p>
     * <p>
     * The new settings are registered upon the completion of this call. Any
     * launch configuration settings take effect on any triggers after this
     * call returns. Scaling activities that are currently in progress aren't
     * affected.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * If you specify a new value for <code>MinSize</code> without
     * specifying a value for <code>DesiredCapacity</code> , and the new
     * <code>MinSize</code> is larger than the current size of the group, we
     * implicitly call SetDesiredCapacity to set the size of the group to the
     * new value of <code>MinSize</code> .
     * </p>
     * </li>
     * <li> <p>
     * If you specify a new value for <code>MaxSize</code> without
     * specifying a value for <code>DesiredCapacity</code> , and the new
     * <code>MaxSize</code> is smaller than the current size of the group, we
     * implicitly call SetDesiredCapacity to set the size of the group to the
     * new value of <code>MaxSize</code> .
     * </p>
     * </li>
     * <li> <p>
     * All other optional parameters are left unchanged if not specified.
     * </p>
     * </li>
     * 
     * </ul>
     *
     * @param updateAutoScalingGroupRequest Container for the necessary
     *           parameters to execute the UpdateAutoScalingGroup service method on
     *           AmazonAutoScaling.
     * 
     * 
     * @throws ScalingActivityInProgressException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateAutoScalingGroup(UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more launch configurations. If you omit the list of
     * names, then the call describes all launch configurations.
     * </p>
     *
     * @param describeLaunchConfigurationsRequest Container for the necessary
     *           parameters to execute the DescribeLaunchConfigurations service method
     *           on AmazonAutoScaling.
     * 
     * @return The response from the DescribeLaunchConfigurations service
     *         method, as returned by AmazonAutoScaling.
     * 
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLaunchConfigurationsResult describeLaunchConfigurations(DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the policy adjustment types for use with PutScalingPolicy.
     * </p>
     *
     * @param describeAdjustmentTypesRequest Container for the necessary
     *           parameters to execute the DescribeAdjustmentTypes service method on
     *           AmazonAutoScaling.
     * 
     * @return The response from the DescribeAdjustmentTypes service method,
     *         as returned by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAdjustmentTypesResult describeAdjustmentTypes(DescribeAdjustmentTypesRequest describeAdjustmentTypesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the actions scheduled for your Auto Scaling group that
     * haven't run. To describe the actions that have already run, use
     * DescribeScalingActivities.
     * </p>
     *
     * @param describeScheduledActionsRequest Container for the necessary
     *           parameters to execute the DescribeScheduledActions service method on
     *           AmazonAutoScaling.
     * 
     * @return The response from the DescribeScheduledActions service method,
     *         as returned by AmazonAutoScaling.
     * 
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeScheduledActionsResult describeScheduledActions(DescribeScheduledActionsRequest describeScheduledActionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Records a heartbeat for the lifecycle action associated with a
     * specific token. This extends the timeout by the length of time defined
     * by the <code>HeartbeatTimeout</code> parameter of PutLifecycleHook.
     * </p>
     * <p>
     * This operation is a part of the basic sequence for adding a lifecycle
     * hook to an Auto Scaling group:
     * </p>
     * <ol> <li>Create a notification target. A target can be either an
     * Amazon SQS queue or an Amazon SNS topic.</li>
     * <li>Create an IAM role. This role allows Auto Scaling to publish
     * lifecycle notifications to the designated SQS queue or SNS topic.</li>
     * <li>Create the lifecycle hook. You can create a hook that acts when
     * instances launch or when instances terminate.</li>
     * <li> <b>If necessary, record the lifecycle action heartbeat to keep
     * the instance in a pending state.</b> </li>
     * <li>Complete the lifecycle action.</li>
     * </ol> <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingPendingState.html"> Auto Scaling Pending State </a> and <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingTerminatingState.html"> Auto Scaling Terminating State </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param recordLifecycleActionHeartbeatRequest Container for the
     *           necessary parameters to execute the RecordLifecycleActionHeartbeat
     *           service method on AmazonAutoScaling.
     * 
     * @return The response from the RecordLifecycleActionHeartbeat service
     *         method, as returned by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RecordLifecycleActionHeartbeatResult recordLifecycleActionHeartbeat(RecordLifecycleActionHeartbeatRequest recordLifecycleActionHeartbeatRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates or updates a scheduled scaling action for an Auto Scaling
     * group. When updating a scheduled scaling action, if you leave a
     * parameter unspecified, the corresponding value remains unchanged in
     * the affected Auto Scaling group.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/schedule_time.html"> Scheduled Scaling </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param putScheduledUpdateGroupActionRequest Container for the
     *           necessary parameters to execute the PutScheduledUpdateGroupAction
     *           service method on AmazonAutoScaling.
     * 
     * 
     * @throws LimitExceededException
     * @throws ResourceContentionException
     * @throws AlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void putScheduledUpdateGroupAction(PutScheduledUpdateGroupActionRequest putScheduledUpdateGroupActionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the available CloudWatch metrics for Auto Scaling.
     * </p>
     * <p>
     * Note that the <code>GroupStandbyInstances</code> metric is not
     * returned by default. You must explicitly request this metric when
     * calling EnableMetricsCollection.
     * </p>
     *
     * @param describeMetricCollectionTypesRequest Container for the
     *           necessary parameters to execute the DescribeMetricCollectionTypes
     *           service method on AmazonAutoScaling.
     * 
     * @return The response from the DescribeMetricCollectionTypes service
     *         method, as returned by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeMetricCollectionTypesResult describeMetricCollectionTypes(DescribeMetricCollectionTypesRequest describeMetricCollectionTypesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the size of the specified Auto Scaling group.
     * </p>
     * <p>
     * For more information about desired capacity, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/WhatIsAutoScaling.html"> What Is Auto Scaling? </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     *
     * @param setDesiredCapacityRequest Container for the necessary
     *           parameters to execute the SetDesiredCapacity service method on
     *           AmazonAutoScaling.
     * 
     * 
     * @throws ScalingActivityInProgressException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setDesiredCapacity(SetDesiredCapacityRequest setDesiredCapacityRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Terminates the specified instance and optionally adjusts the desired
     * group size.
     * </p>
     * <p>
     * This call simply makes a termination request. The instances is not
     * terminated immediately.
     * </p>
     *
     * @param terminateInstanceInAutoScalingGroupRequest Container for the
     *           necessary parameters to execute the
     *           TerminateInstanceInAutoScalingGroup service method on
     *           AmazonAutoScaling.
     * 
     * @return The response from the TerminateInstanceInAutoScalingGroup
     *         service method, as returned by AmazonAutoScaling.
     * 
     * @throws ScalingActivityInProgressException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public TerminateInstanceInAutoScalingGroupResult terminateInstanceInAutoScalingGroup(TerminateInstanceInAutoScalingGroupRequest terminateInstanceInAutoScalingGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the current Auto Scaling resource limits for your AWS
     * account.
     * </p>
     * <p>
     * For information about requesting an increase in these limits, see
     * <a href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html"> AWS Service Limits </a>
     * in the <i>Amazon Web Services General Reference</i> .
     * </p>
     * 
     * @return The response from the DescribeAccountLimits service method, as
     *         returned by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAccountLimitsResult describeAccountLimits() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes one or more Auto Scaling groups. If a list of names is not
     * provided, the call describes all Auto Scaling groups.
     * </p>
     * 
     * @return The response from the DescribeAutoScalingGroups service
     *         method, as returned by AmazonAutoScaling.
     * 
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAutoScalingGroupsResult describeAutoScalingGroups() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes the policies for the specified Auto Scaling group.
     * </p>
     * 
     * @return The response from the DescribePolicies service method, as
     *         returned by AmazonAutoScaling.
     * 
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribePoliciesResult describePolicies() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes the scaling process types for use with ResumeProcesses and
     * SuspendProcesses.
     * </p>
     * 
     * @return The response from the DescribeScalingProcessTypes service
     *         method, as returned by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeScalingProcessTypesResult describeScalingProcessTypes() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes one or more scaling activities for the specified Auto
     * Scaling group. If you omit the <code>ActivityIds</code> , the call
     * returns all activities from the past six weeks. Activities are sorted
     * by the start time. Activities still in progress appear first on the
     * list.
     * </p>
     * 
     * @return The response from the DescribeScalingActivities service
     *         method, as returned by AmazonAutoScaling.
     * 
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeScalingActivitiesResult describeScalingActivities() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes the notification actions associated with the specified Auto
     * Scaling group.
     * </p>
     * 
     * @return The response from the DescribeNotificationConfigurations
     *         service method, as returned by AmazonAutoScaling.
     * 
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeNotificationConfigurationsResult describeNotificationConfigurations() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes the termination policies supported by Auto Scaling.
     * </p>
     * 
     * @return The response from the DescribeTerminationPolicyTypes service
     *         method, as returned by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTerminationPolicyTypesResult describeTerminationPolicyTypes() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes the specified tags.
     * </p>
     * <p>
     * You can use filters to limit the results. For example, you can query
     * for the tags for a specific Auto Scaling group. You can specify
     * multiple values for a filter. A tag must match at least one of the
     * specified values for it to be included in the results.
     * </p>
     * <p>
     * You can also specify multiple filters. The result includes
     * information for a particular tag only if it matches all the filters.
     * If there's no match, no special message is returned.
     * </p>
     * 
     * @return The response from the DescribeTags service method, as returned
     *         by AmazonAutoScaling.
     * 
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTagsResult describeTags() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Removes one or more load balancers from the specified Auto Scaling
     * group.
     * </p>
     * <p>
     * When you detach a load balancer, it enters the <code>Removing</code>
     * state while deregistering the instances in the group. When all
     * instances are deregistered, then you can no longer describe the load
     * balancer using DescribeLoadBalancers. Note that the instances remain
     * running.
     * </p>
     * 
     * @return The response from the DetachLoadBalancers service method, as
     *         returned by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DetachLoadBalancersResult detachLoadBalancers() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes the notification types that are supported by Auto Scaling.
     * </p>
     * 
     * @return The response from the DescribeAutoScalingNotificationTypes
     *         service method, as returned by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAutoScalingNotificationTypesResult describeAutoScalingNotificationTypes() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Attaches one or more load balancers to the specified Auto Scaling
     * group.
     * </p>
     * <p>
     * To describe the load balancers for an Auto Scaling group, use
     * DescribeLoadBalancers. To detach the load balancer from the Auto
     * Scaling group, use DetachLoadBalancers.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/attach-load-balancer-asg.html"> Attach a Load Balancer to Your Auto Scaling Group </a>
     * in the <i>Auto Scaling Developer Guide</i> .
     * </p>
     * 
     * @return The response from the AttachLoadBalancers service method, as
     *         returned by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AttachLoadBalancersResult attachLoadBalancers() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes one or more Auto Scaling instances. If a list is not
     * provided, the call describes all instances.
     * </p>
     * 
     * @return The response from the DescribeAutoScalingInstances service
     *         method, as returned by AmazonAutoScaling.
     * 
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAutoScalingInstancesResult describeAutoScalingInstances() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes the available types of lifecycle hooks.
     * </p>
     * 
     * @return The response from the DescribeLifecycleHookTypes service
     *         method, as returned by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLifecycleHookTypesResult describeLifecycleHookTypes() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes one or more launch configurations. If you omit the list of
     * names, then the call describes all launch configurations.
     * </p>
     * 
     * @return The response from the DescribeLaunchConfigurations service
     *         method, as returned by AmazonAutoScaling.
     * 
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLaunchConfigurationsResult describeLaunchConfigurations() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes the policy adjustment types for use with PutScalingPolicy.
     * </p>
     * 
     * @return The response from the DescribeAdjustmentTypes service method,
     *         as returned by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAdjustmentTypesResult describeAdjustmentTypes() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes the actions scheduled for your Auto Scaling group that
     * haven't run. To describe the actions that have already run, use
     * DescribeScalingActivities.
     * </p>
     * 
     * @return The response from the DescribeScheduledActions service method,
     *         as returned by AmazonAutoScaling.
     * 
     * @throws InvalidNextTokenException
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeScheduledActionsResult describeScheduledActions() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes the available CloudWatch metrics for Auto Scaling.
     * </p>
     * <p>
     * Note that the <code>GroupStandbyInstances</code> metric is not
     * returned by default. You must explicitly request this metric when
     * calling EnableMetricsCollection.
     * </p>
     * 
     * @return The response from the DescribeMetricCollectionTypes service
     *         method, as returned by AmazonAutoScaling.
     * 
     * @throws ResourceContentionException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeMetricCollectionTypesResult describeMetricCollectionTypes() throws AmazonServiceException, AmazonClientException;
    
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
        