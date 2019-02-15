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
package com.amazonaws.services.applicationautoscaling;

import javax.annotation.Generated;

import com.amazonaws.services.applicationautoscaling.model.*;

/**
 * Interface for accessing Application Auto Scaling asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.applicationautoscaling.AbstractAWSApplicationAutoScalingAsync} instead.
 * </p>
 * <p>
 * <p>
 * With Application Auto Scaling, you can configure automatic scaling for your scalable resources. You can use
 * Application Auto Scaling to accomplish the following tasks:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Define scaling policies to automatically scale your AWS or custom resources
 * </p>
 * </li>
 * <li>
 * <p>
 * Scale your resources in response to CloudWatch alarms
 * </p>
 * </li>
 * <li>
 * <p>
 * Schedule one-time or recurring scaling actions
 * </p>
 * </li>
 * <li>
 * <p>
 * View the history of your scaling events
 * </p>
 * </li>
 * </ul>
 * <p>
 * Application Auto Scaling can scale the following resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Amazon ECS services. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-auto-scaling.html">Service Auto Scaling</a>
 * in the <i>Amazon Elastic Container Service Developer Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon EC2 Spot fleets. For more information, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/fleet-auto-scaling.html">Automatic Scaling for Spot
 * Fleet</a> in the <i>Amazon EC2 User Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon EMR clusters. For more information, see <a
 * href="https://docs.aws.amazon.com/ElasticMapReduce/latest/ManagementGuide/emr-automatic-scaling.html">Using Automatic
 * Scaling in Amazon EMR</a> in the <i>Amazon EMR Management Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * AppStream 2.0 fleets. For more information, see <a
 * href="https://docs.aws.amazon.com/appstream2/latest/developerguide/autoscaling.html">Fleet Auto Scaling for Amazon
 * AppStream 2.0</a> in the <i>Amazon AppStream 2.0 Developer Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Provisioned read and write capacity for Amazon DynamoDB tables and global secondary indexes. For more information,
 * see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/AutoScaling.html">Managing Throughput
 * Capacity Automatically with DynamoDB Auto Scaling</a> in the <i>Amazon DynamoDB Developer Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Aurora Replicas. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Integrating.AutoScaling.html">Using Amazon
 * Aurora Auto Scaling with Aurora Replicas</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon SageMaker endpoint variants. For more information, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/endpoint-auto-scaling.html">Automatically Scaling Amazon
 * SageMaker Models</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Custom resources provided by your own applications or services. More information is available in our <a
 * href="https://github.com/aws/aws-auto-scaling-custom-resource">GitHub repository</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * To learn more about Application Auto Scaling, including information about granting IAM users required permissions for
 * Application Auto Scaling actions, see the <a
 * href="https://docs.aws.amazon.com/autoscaling/application/userguide/what-is-application-auto-scaling.html"
 * >Application Auto Scaling User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSApplicationAutoScalingAsync extends AWSApplicationAutoScaling {

    /**
     * <p>
     * Deletes the specified Application Auto Scaling scaling policy.
     * </p>
     * <p>
     * Deleting a policy deletes the underlying alarm action, but does not delete the CloudWatch alarm associated with
     * the scaling policy, even if it no longer has an associated action.
     * </p>
     * <p>
     * To create a scaling policy or update an existing one, see <a>PutScalingPolicy</a>.
     * </p>
     * 
     * @param deleteScalingPolicyRequest
     * @return A Java Future containing the result of the DeleteScalingPolicy operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.DeleteScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DeleteScalingPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteScalingPolicyResult> deleteScalingPolicyAsync(DeleteScalingPolicyRequest deleteScalingPolicyRequest);

    /**
     * <p>
     * Deletes the specified Application Auto Scaling scaling policy.
     * </p>
     * <p>
     * Deleting a policy deletes the underlying alarm action, but does not delete the CloudWatch alarm associated with
     * the scaling policy, even if it no longer has an associated action.
     * </p>
     * <p>
     * To create a scaling policy or update an existing one, see <a>PutScalingPolicy</a>.
     * </p>
     * 
     * @param deleteScalingPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteScalingPolicy operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.DeleteScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DeleteScalingPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteScalingPolicyResult> deleteScalingPolicyAsync(DeleteScalingPolicyRequest deleteScalingPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteScalingPolicyRequest, DeleteScalingPolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified Application Auto Scaling scheduled action.
     * </p>
     * 
     * @param deleteScheduledActionRequest
     * @return A Java Future containing the result of the DeleteScheduledAction operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.DeleteScheduledAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DeleteScheduledAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteScheduledActionResult> deleteScheduledActionAsync(DeleteScheduledActionRequest deleteScheduledActionRequest);

    /**
     * <p>
     * Deletes the specified Application Auto Scaling scheduled action.
     * </p>
     * 
     * @param deleteScheduledActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteScheduledAction operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.DeleteScheduledAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DeleteScheduledAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteScheduledActionResult> deleteScheduledActionAsync(DeleteScheduledActionRequest deleteScheduledActionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteScheduledActionRequest, DeleteScheduledActionResult> asyncHandler);

    /**
     * <p>
     * Deregisters a scalable target.
     * </p>
     * <p>
     * Deregistering a scalable target deletes the scaling policies that are associated with it.
     * </p>
     * <p>
     * To create a scalable target or update an existing one, see <a>RegisterScalableTarget</a>.
     * </p>
     * 
     * @param deregisterScalableTargetRequest
     * @return A Java Future containing the result of the DeregisterScalableTarget operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.DeregisterScalableTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DeregisterScalableTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterScalableTargetResult> deregisterScalableTargetAsync(DeregisterScalableTargetRequest deregisterScalableTargetRequest);

    /**
     * <p>
     * Deregisters a scalable target.
     * </p>
     * <p>
     * Deregistering a scalable target deletes the scaling policies that are associated with it.
     * </p>
     * <p>
     * To create a scalable target or update an existing one, see <a>RegisterScalableTarget</a>.
     * </p>
     * 
     * @param deregisterScalableTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterScalableTarget operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.DeregisterScalableTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DeregisterScalableTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterScalableTargetResult> deregisterScalableTargetAsync(DeregisterScalableTargetRequest deregisterScalableTargetRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterScalableTargetRequest, DeregisterScalableTargetResult> asyncHandler);

    /**
     * <p>
     * Gets information about the scalable targets in the specified namespace.
     * </p>
     * <p>
     * You can filter the results using the <code>ResourceIds</code> and <code>ScalableDimension</code> parameters.
     * </p>
     * <p>
     * To create a scalable target or update an existing one, see <a>RegisterScalableTarget</a>. If you are no longer
     * using a scalable target, you can deregister it using <a>DeregisterScalableTarget</a>.
     * </p>
     * 
     * @param describeScalableTargetsRequest
     * @return A Java Future containing the result of the DescribeScalableTargets operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.DescribeScalableTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DescribeScalableTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScalableTargetsResult> describeScalableTargetsAsync(DescribeScalableTargetsRequest describeScalableTargetsRequest);

    /**
     * <p>
     * Gets information about the scalable targets in the specified namespace.
     * </p>
     * <p>
     * You can filter the results using the <code>ResourceIds</code> and <code>ScalableDimension</code> parameters.
     * </p>
     * <p>
     * To create a scalable target or update an existing one, see <a>RegisterScalableTarget</a>. If you are no longer
     * using a scalable target, you can deregister it using <a>DeregisterScalableTarget</a>.
     * </p>
     * 
     * @param describeScalableTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScalableTargets operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.DescribeScalableTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DescribeScalableTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScalableTargetsResult> describeScalableTargetsAsync(DescribeScalableTargetsRequest describeScalableTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScalableTargetsRequest, DescribeScalableTargetsResult> asyncHandler);

    /**
     * <p>
     * Provides descriptive information about the scaling activities in the specified namespace from the previous six
     * weeks.
     * </p>
     * <p>
     * You can filter the results using the <code>ResourceId</code> and <code>ScalableDimension</code> parameters.
     * </p>
     * <p>
     * Scaling activities are triggered by CloudWatch alarms that are associated with scaling policies. To view the
     * scaling policies for a service namespace, see <a>DescribeScalingPolicies</a>. To create a scaling policy or
     * update an existing one, see <a>PutScalingPolicy</a>.
     * </p>
     * 
     * @param describeScalingActivitiesRequest
     * @return A Java Future containing the result of the DescribeScalingActivities operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.DescribeScalingActivities
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DescribeScalingActivities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(
            DescribeScalingActivitiesRequest describeScalingActivitiesRequest);

    /**
     * <p>
     * Provides descriptive information about the scaling activities in the specified namespace from the previous six
     * weeks.
     * </p>
     * <p>
     * You can filter the results using the <code>ResourceId</code> and <code>ScalableDimension</code> parameters.
     * </p>
     * <p>
     * Scaling activities are triggered by CloudWatch alarms that are associated with scaling policies. To view the
     * scaling policies for a service namespace, see <a>DescribeScalingPolicies</a>. To create a scaling policy or
     * update an existing one, see <a>PutScalingPolicy</a>.
     * </p>
     * 
     * @param describeScalingActivitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScalingActivities operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.DescribeScalingActivities
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DescribeScalingActivities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(
            DescribeScalingActivitiesRequest describeScalingActivitiesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScalingActivitiesRequest, DescribeScalingActivitiesResult> asyncHandler);

    /**
     * <p>
     * Describes the scaling policies for the specified service namespace.
     * </p>
     * <p>
     * You can filter the results using the <code>ResourceId</code>, <code>ScalableDimension</code>, and
     * <code>PolicyNames</code> parameters.
     * </p>
     * <p>
     * To create a scaling policy or update an existing one, see <a>PutScalingPolicy</a>. If you are no longer using a
     * scaling policy, you can delete it using <a>DeleteScalingPolicy</a>.
     * </p>
     * 
     * @param describeScalingPoliciesRequest
     * @return A Java Future containing the result of the DescribeScalingPolicies operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.DescribeScalingPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DescribeScalingPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScalingPoliciesResult> describeScalingPoliciesAsync(DescribeScalingPoliciesRequest describeScalingPoliciesRequest);

    /**
     * <p>
     * Describes the scaling policies for the specified service namespace.
     * </p>
     * <p>
     * You can filter the results using the <code>ResourceId</code>, <code>ScalableDimension</code>, and
     * <code>PolicyNames</code> parameters.
     * </p>
     * <p>
     * To create a scaling policy or update an existing one, see <a>PutScalingPolicy</a>. If you are no longer using a
     * scaling policy, you can delete it using <a>DeleteScalingPolicy</a>.
     * </p>
     * 
     * @param describeScalingPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScalingPolicies operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.DescribeScalingPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DescribeScalingPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScalingPoliciesResult> describeScalingPoliciesAsync(DescribeScalingPoliciesRequest describeScalingPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScalingPoliciesRequest, DescribeScalingPoliciesResult> asyncHandler);

    /**
     * <p>
     * Describes the scheduled actions for the specified service namespace.
     * </p>
     * <p>
     * You can filter the results using the <code>ResourceId</code>, <code>ScalableDimension</code>, and
     * <code>ScheduledActionNames</code> parameters.
     * </p>
     * <p>
     * To create a scheduled action or update an existing one, see <a>PutScheduledAction</a>. If you are no longer using
     * a scheduled action, you can delete it using <a>DeleteScheduledAction</a>.
     * </p>
     * 
     * @param describeScheduledActionsRequest
     * @return A Java Future containing the result of the DescribeScheduledActions operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.DescribeScheduledActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DescribeScheduledActions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(DescribeScheduledActionsRequest describeScheduledActionsRequest);

    /**
     * <p>
     * Describes the scheduled actions for the specified service namespace.
     * </p>
     * <p>
     * You can filter the results using the <code>ResourceId</code>, <code>ScalableDimension</code>, and
     * <code>ScheduledActionNames</code> parameters.
     * </p>
     * <p>
     * To create a scheduled action or update an existing one, see <a>PutScheduledAction</a>. If you are no longer using
     * a scheduled action, you can delete it using <a>DeleteScheduledAction</a>.
     * </p>
     * 
     * @param describeScheduledActionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScheduledActions operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.DescribeScheduledActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DescribeScheduledActions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(DescribeScheduledActionsRequest describeScheduledActionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScheduledActionsRequest, DescribeScheduledActionsResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a policy for an Application Auto Scaling scalable target.
     * </p>
     * <p>
     * Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scaling policy
     * applies to the scalable target identified by those three attributes. You cannot create a scaling policy until you
     * have registered the resource as a scalable target using <a>RegisterScalableTarget</a>.
     * </p>
     * <p>
     * To update a policy, specify its policy name and the parameters that you want to change. Any parameters that you
     * don't specify are not changed by this update request.
     * </p>
     * <p>
     * You can view the scaling policies for a service namespace using <a>DescribeScalingPolicies</a>. If you are no
     * longer using a scaling policy, you can delete it using <a>DeleteScalingPolicy</a>.
     * </p>
     * <p>
     * Multiple scaling policies can be in force at the same time for the same scalable target. You can have one or more
     * target tracking scaling policies, one or more step scaling policies, or both. However, there is a chance that
     * multiple policies could conflict, instructing the scalable target to scale out or in at the same time.
     * Application Auto Scaling gives precedence to the policy that provides the largest capacity for both scale in and
     * scale out. For example, if one policy increases capacity by 3, another policy increases capacity by 200 percent,
     * and the current capacity is 10, Application Auto Scaling uses the policy with the highest calculated capacity
     * (200% of 10 = 20) and scales out to 30.
     * </p>
     * <p>
     * Learn more about how to work with scaling policies in the <a
     * href="https://docs.aws.amazon.com/autoscaling/application/userguide/what-is-application-auto-scaling.html"
     * >Application Auto Scaling User Guide</a>.
     * </p>
     * 
     * @param putScalingPolicyRequest
     * @return A Java Future containing the result of the PutScalingPolicy operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.PutScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/PutScalingPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(PutScalingPolicyRequest putScalingPolicyRequest);

    /**
     * <p>
     * Creates or updates a policy for an Application Auto Scaling scalable target.
     * </p>
     * <p>
     * Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scaling policy
     * applies to the scalable target identified by those three attributes. You cannot create a scaling policy until you
     * have registered the resource as a scalable target using <a>RegisterScalableTarget</a>.
     * </p>
     * <p>
     * To update a policy, specify its policy name and the parameters that you want to change. Any parameters that you
     * don't specify are not changed by this update request.
     * </p>
     * <p>
     * You can view the scaling policies for a service namespace using <a>DescribeScalingPolicies</a>. If you are no
     * longer using a scaling policy, you can delete it using <a>DeleteScalingPolicy</a>.
     * </p>
     * <p>
     * Multiple scaling policies can be in force at the same time for the same scalable target. You can have one or more
     * target tracking scaling policies, one or more step scaling policies, or both. However, there is a chance that
     * multiple policies could conflict, instructing the scalable target to scale out or in at the same time.
     * Application Auto Scaling gives precedence to the policy that provides the largest capacity for both scale in and
     * scale out. For example, if one policy increases capacity by 3, another policy increases capacity by 200 percent,
     * and the current capacity is 10, Application Auto Scaling uses the policy with the highest calculated capacity
     * (200% of 10 = 20) and scales out to 30.
     * </p>
     * <p>
     * Learn more about how to work with scaling policies in the <a
     * href="https://docs.aws.amazon.com/autoscaling/application/userguide/what-is-application-auto-scaling.html"
     * >Application Auto Scaling User Guide</a>.
     * </p>
     * 
     * @param putScalingPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutScalingPolicy operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.PutScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/PutScalingPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(PutScalingPolicyRequest putScalingPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutScalingPolicyRequest, PutScalingPolicyResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a scheduled action for an Application Auto Scaling scalable target.
     * </p>
     * <p>
     * Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scheduled
     * action applies to the scalable target identified by those three attributes. You cannot create a scheduled action
     * until you have registered the resource as a scalable target using <a>RegisterScalableTarget</a>.
     * </p>
     * <p>
     * To update an action, specify its name and the parameters that you want to change. If you don't specify start and
     * end times, the old values are deleted. Any other parameters that you don't specify are not changed by this update
     * request.
     * </p>
     * <p>
     * You can view the scheduled actions using <a>DescribeScheduledActions</a>. If you are no longer using a scheduled
     * action, you can delete it using <a>DeleteScheduledAction</a>.
     * </p>
     * <p>
     * Learn more about how to work with scheduled actions in the <a
     * href="https://docs.aws.amazon.com/autoscaling/application/userguide/what-is-application-auto-scaling.html"
     * >Application Auto Scaling User Guide</a>.
     * </p>
     * 
     * @param putScheduledActionRequest
     * @return A Java Future containing the result of the PutScheduledAction operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.PutScheduledAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/PutScheduledAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutScheduledActionResult> putScheduledActionAsync(PutScheduledActionRequest putScheduledActionRequest);

    /**
     * <p>
     * Creates or updates a scheduled action for an Application Auto Scaling scalable target.
     * </p>
     * <p>
     * Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scheduled
     * action applies to the scalable target identified by those three attributes. You cannot create a scheduled action
     * until you have registered the resource as a scalable target using <a>RegisterScalableTarget</a>.
     * </p>
     * <p>
     * To update an action, specify its name and the parameters that you want to change. If you don't specify start and
     * end times, the old values are deleted. Any other parameters that you don't specify are not changed by this update
     * request.
     * </p>
     * <p>
     * You can view the scheduled actions using <a>DescribeScheduledActions</a>. If you are no longer using a scheduled
     * action, you can delete it using <a>DeleteScheduledAction</a>.
     * </p>
     * <p>
     * Learn more about how to work with scheduled actions in the <a
     * href="https://docs.aws.amazon.com/autoscaling/application/userguide/what-is-application-auto-scaling.html"
     * >Application Auto Scaling User Guide</a>.
     * </p>
     * 
     * @param putScheduledActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutScheduledAction operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.PutScheduledAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/PutScheduledAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutScheduledActionResult> putScheduledActionAsync(PutScheduledActionRequest putScheduledActionRequest,
            com.amazonaws.handlers.AsyncHandler<PutScheduledActionRequest, PutScheduledActionResult> asyncHandler);

    /**
     * <p>
     * Registers or updates a scalable target. A scalable target is a resource that Application Auto Scaling can scale
     * out and scale in. Each scalable target has a resource ID, scalable dimension, and namespace, as well as values
     * for minimum and maximum capacity.
     * </p>
     * <p>
     * After you register a scalable target, you do not need to register it again to use other Application Auto Scaling
     * operations. To see which resources have been registered, use <a>DescribeScalableTargets</a>. You can also view
     * the scaling policies for a service namespace using <a>DescribeScalableTargets</a>.
     * </p>
     * <p>
     * If you no longer need a scalable target, you can deregister it using <a>DeregisterScalableTarget</a>.
     * </p>
     * 
     * @param registerScalableTargetRequest
     * @return A Java Future containing the result of the RegisterScalableTarget operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.RegisterScalableTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/RegisterScalableTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterScalableTargetResult> registerScalableTargetAsync(RegisterScalableTargetRequest registerScalableTargetRequest);

    /**
     * <p>
     * Registers or updates a scalable target. A scalable target is a resource that Application Auto Scaling can scale
     * out and scale in. Each scalable target has a resource ID, scalable dimension, and namespace, as well as values
     * for minimum and maximum capacity.
     * </p>
     * <p>
     * After you register a scalable target, you do not need to register it again to use other Application Auto Scaling
     * operations. To see which resources have been registered, use <a>DescribeScalableTargets</a>. You can also view
     * the scaling policies for a service namespace using <a>DescribeScalableTargets</a>.
     * </p>
     * <p>
     * If you no longer need a scalable target, you can deregister it using <a>DeregisterScalableTarget</a>.
     * </p>
     * 
     * @param registerScalableTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterScalableTarget operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.RegisterScalableTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/RegisterScalableTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterScalableTargetResult> registerScalableTargetAsync(RegisterScalableTargetRequest registerScalableTargetRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterScalableTargetRequest, RegisterScalableTargetResult> asyncHandler);

}
