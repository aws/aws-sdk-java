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
package com.amazonaws.services.applicationautoscaling;

import com.amazonaws.services.applicationautoscaling.model.*;

/**
 * Interface for accessing Application Auto Scaling asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Application Auto Scaling is a general purpose Auto Scaling service for supported elastic AWS resources. With
 * Application Auto Scaling, you can automatically scale your AWS resources, with an experience similar to that of Auto
 * Scaling.
 * </p>
 * <p>
 * Application Auto Scaling supports scaling the following AWS resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Amazon ECS services
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon EC2 Spot fleet instances
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can use Application Auto Scaling to accomplish the following tasks:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Define scaling policies for automatically adjusting your AWS resources
 * </p>
 * </li>
 * <li>
 * <p>
 * Scale your resources in response to CloudWatch alarms
 * </p>
 * </li>
 * <li>
 * <p>
 * View history of your scaling events
 * </p>
 * </li>
 * </ul>
 * <p>
 * Application Auto Scaling is available in the following regions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>us-east-1</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>us-west-1</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>us-west-2</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ap-southeast-1</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ap-southeast-2</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ap-northeast-1</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>eu-central-1</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>eu-west-1</code>
 * </p>
 * </li>
 * </ul>
 */
public interface AWSApplicationAutoScalingAsync extends AWSApplicationAutoScaling {

    /**
     * <p>
     * Deletes an Application Auto Scaling scaling policy that was previously created. If you are no longer using a
     * scaling policy, you can delete it with this operation.
     * </p>
     * <p>
     * Deleting a policy deletes the underlying alarm action, but does not delete the CloudWatch alarm associated with
     * the scaling policy, even if it no longer has an associated action.
     * </p>
     * <p>
     * To create a new scaling policy or update an existing one, see <a>PutScalingPolicy</a>.
     * </p>
     * 
     * @param deleteScalingPolicyRequest
     * @return A Java Future containing the result of the DeleteScalingPolicy operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.DeleteScalingPolicy
     */
    java.util.concurrent.Future<DeleteScalingPolicyResult> deleteScalingPolicyAsync(DeleteScalingPolicyRequest deleteScalingPolicyRequest);

    /**
     * <p>
     * Deletes an Application Auto Scaling scaling policy that was previously created. If you are no longer using a
     * scaling policy, you can delete it with this operation.
     * </p>
     * <p>
     * Deleting a policy deletes the underlying alarm action, but does not delete the CloudWatch alarm associated with
     * the scaling policy, even if it no longer has an associated action.
     * </p>
     * <p>
     * To create a new scaling policy or update an existing one, see <a>PutScalingPolicy</a>.
     * </p>
     * 
     * @param deleteScalingPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteScalingPolicy operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.DeleteScalingPolicy
     */
    java.util.concurrent.Future<DeleteScalingPolicyResult> deleteScalingPolicyAsync(DeleteScalingPolicyRequest deleteScalingPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteScalingPolicyRequest, DeleteScalingPolicyResult> asyncHandler);

    /**
     * <p>
     * Deregisters a scalable target that was previously registered. If you are no longer using a scalable target, you
     * can delete it with this operation. When you deregister a scalable target, all of the scaling policies that are
     * associated with that scalable target are deleted.
     * </p>
     * <p>
     * To create a new scalable target or update an existing one, see <a>RegisterScalableTarget</a>.
     * </p>
     * 
     * @param deregisterScalableTargetRequest
     * @return A Java Future containing the result of the DeregisterScalableTarget operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.DeregisterScalableTarget
     */
    java.util.concurrent.Future<DeregisterScalableTargetResult> deregisterScalableTargetAsync(DeregisterScalableTargetRequest deregisterScalableTargetRequest);

    /**
     * <p>
     * Deregisters a scalable target that was previously registered. If you are no longer using a scalable target, you
     * can delete it with this operation. When you deregister a scalable target, all of the scaling policies that are
     * associated with that scalable target are deleted.
     * </p>
     * <p>
     * To create a new scalable target or update an existing one, see <a>RegisterScalableTarget</a>.
     * </p>
     * 
     * @param deregisterScalableTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterScalableTarget operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.DeregisterScalableTarget
     */
    java.util.concurrent.Future<DeregisterScalableTargetResult> deregisterScalableTargetAsync(DeregisterScalableTargetRequest deregisterScalableTargetRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterScalableTargetRequest, DeregisterScalableTargetResult> asyncHandler);

    /**
     * <p>
     * Provides descriptive information for scalable targets with a specified service namespace.
     * </p>
     * <p>
     * You can filter the results in a service namespace with the <code>ResourceIds</code> and
     * <code>ScalableDimension</code> parameters.
     * </p>
     * <p>
     * To create a new scalable target or update an existing one, see <a>RegisterScalableTarget</a>. If you are no
     * longer using a scalable target, you can deregister it with <a>DeregisterScalableTarget</a>.
     * </p>
     * 
     * @param describeScalableTargetsRequest
     * @return A Java Future containing the result of the DescribeScalableTargets operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.DescribeScalableTargets
     */
    java.util.concurrent.Future<DescribeScalableTargetsResult> describeScalableTargetsAsync(DescribeScalableTargetsRequest describeScalableTargetsRequest);

    /**
     * <p>
     * Provides descriptive information for scalable targets with a specified service namespace.
     * </p>
     * <p>
     * You can filter the results in a service namespace with the <code>ResourceIds</code> and
     * <code>ScalableDimension</code> parameters.
     * </p>
     * <p>
     * To create a new scalable target or update an existing one, see <a>RegisterScalableTarget</a>. If you are no
     * longer using a scalable target, you can deregister it with <a>DeregisterScalableTarget</a>.
     * </p>
     * 
     * @param describeScalableTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScalableTargets operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.DescribeScalableTargets
     */
    java.util.concurrent.Future<DescribeScalableTargetsResult> describeScalableTargetsAsync(DescribeScalableTargetsRequest describeScalableTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScalableTargetsRequest, DescribeScalableTargetsResult> asyncHandler);

    /**
     * <p>
     * Provides descriptive information for scaling activities with a specified service namespace for the previous six
     * weeks.
     * </p>
     * <p>
     * You can filter the results in a service namespace with the <code>ResourceId</code> and
     * <code>ScalableDimension</code> parameters.
     * </p>
     * <p>
     * Scaling activities are triggered by CloudWatch alarms that are associated with scaling policies. To view the
     * existing scaling policies for a service namespace, see <a>DescribeScalingPolicies</a>. To create a new scaling
     * policy or update an existing one, see <a>PutScalingPolicy</a>.
     * </p>
     * 
     * @param describeScalingActivitiesRequest
     * @return A Java Future containing the result of the DescribeScalingActivities operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.DescribeScalingActivities
     */
    java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(
            DescribeScalingActivitiesRequest describeScalingActivitiesRequest);

    /**
     * <p>
     * Provides descriptive information for scaling activities with a specified service namespace for the previous six
     * weeks.
     * </p>
     * <p>
     * You can filter the results in a service namespace with the <code>ResourceId</code> and
     * <code>ScalableDimension</code> parameters.
     * </p>
     * <p>
     * Scaling activities are triggered by CloudWatch alarms that are associated with scaling policies. To view the
     * existing scaling policies for a service namespace, see <a>DescribeScalingPolicies</a>. To create a new scaling
     * policy or update an existing one, see <a>PutScalingPolicy</a>.
     * </p>
     * 
     * @param describeScalingActivitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScalingActivities operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.DescribeScalingActivities
     */
    java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(
            DescribeScalingActivitiesRequest describeScalingActivitiesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScalingActivitiesRequest, DescribeScalingActivitiesResult> asyncHandler);

    /**
     * <p>
     * Provides descriptive information for scaling policies with a specified service namespace.
     * </p>
     * <p>
     * You can filter the results in a service namespace with the <code>ResourceId</code>,
     * <code>ScalableDimension</code>, and <code>PolicyNames</code> parameters.
     * </p>
     * <p>
     * To create a new scaling policy or update an existing one, see <a>PutScalingPolicy</a>. If you are no longer using
     * a scaling policy, you can delete it with <a>DeleteScalingPolicy</a>.
     * </p>
     * 
     * @param describeScalingPoliciesRequest
     * @return A Java Future containing the result of the DescribeScalingPolicies operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.DescribeScalingPolicies
     */
    java.util.concurrent.Future<DescribeScalingPoliciesResult> describeScalingPoliciesAsync(DescribeScalingPoliciesRequest describeScalingPoliciesRequest);

    /**
     * <p>
     * Provides descriptive information for scaling policies with a specified service namespace.
     * </p>
     * <p>
     * You can filter the results in a service namespace with the <code>ResourceId</code>,
     * <code>ScalableDimension</code>, and <code>PolicyNames</code> parameters.
     * </p>
     * <p>
     * To create a new scaling policy or update an existing one, see <a>PutScalingPolicy</a>. If you are no longer using
     * a scaling policy, you can delete it with <a>DeleteScalingPolicy</a>.
     * </p>
     * 
     * @param describeScalingPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScalingPolicies operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.DescribeScalingPolicies
     */
    java.util.concurrent.Future<DescribeScalingPoliciesResult> describeScalingPoliciesAsync(DescribeScalingPoliciesRequest describeScalingPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScalingPoliciesRequest, DescribeScalingPoliciesResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a policy for an existing Application Auto Scaling scalable target. Each scalable target is
     * identified by service namespace, a resource ID, and a scalable dimension, and a scaling policy applies to a
     * scalable target that is identified by those three attributes. You cannot create a scaling policy without first
     * registering a scalable target with <a>RegisterScalableTarget</a>.
     * </p>
     * <p>
     * To update an existing policy, use the existing policy name and set the parameters you want to change. Any
     * existing parameter not changed in an update to an existing policy is not changed in this update request.
     * </p>
     * <p>
     * You can view the existing scaling policies for a service namespace with <a>DescribeScalingPolicies</a>. If you
     * are no longer using a scaling policy, you can delete it with <a>DeleteScalingPolicy</a>.
     * </p>
     * 
     * @param putScalingPolicyRequest
     * @return A Java Future containing the result of the PutScalingPolicy operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.PutScalingPolicy
     */
    java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(PutScalingPolicyRequest putScalingPolicyRequest);

    /**
     * <p>
     * Creates or updates a policy for an existing Application Auto Scaling scalable target. Each scalable target is
     * identified by service namespace, a resource ID, and a scalable dimension, and a scaling policy applies to a
     * scalable target that is identified by those three attributes. You cannot create a scaling policy without first
     * registering a scalable target with <a>RegisterScalableTarget</a>.
     * </p>
     * <p>
     * To update an existing policy, use the existing policy name and set the parameters you want to change. Any
     * existing parameter not changed in an update to an existing policy is not changed in this update request.
     * </p>
     * <p>
     * You can view the existing scaling policies for a service namespace with <a>DescribeScalingPolicies</a>. If you
     * are no longer using a scaling policy, you can delete it with <a>DeleteScalingPolicy</a>.
     * </p>
     * 
     * @param putScalingPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutScalingPolicy operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.PutScalingPolicy
     */
    java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(PutScalingPolicyRequest putScalingPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutScalingPolicyRequest, PutScalingPolicyResult> asyncHandler);

    /**
     * <p>
     * Registers or updates a scalable target. A scalable target is a resource that can be scaled out or in with
     * Application Auto Scaling. After you have registered a scalable target, you can use this operation to update the
     * minimum and maximum values for your scalable dimension.
     * </p>
     * <p>
     * After you register a scalable target with Application Auto Scaling, you can create and apply scaling policies to
     * it with <a>PutScalingPolicy</a>. You can view the existing scaling policies for a service namespace with
     * <a>DescribeScalableTargets</a>. If you are no longer using a scalable target, you can deregister it with
     * <a>DeregisterScalableTarget</a>.
     * </p>
     * 
     * @param registerScalableTargetRequest
     * @return A Java Future containing the result of the RegisterScalableTarget operation returned by the service.
     * @sample AWSApplicationAutoScalingAsync.RegisterScalableTarget
     */
    java.util.concurrent.Future<RegisterScalableTargetResult> registerScalableTargetAsync(RegisterScalableTargetRequest registerScalableTargetRequest);

    /**
     * <p>
     * Registers or updates a scalable target. A scalable target is a resource that can be scaled out or in with
     * Application Auto Scaling. After you have registered a scalable target, you can use this operation to update the
     * minimum and maximum values for your scalable dimension.
     * </p>
     * <p>
     * After you register a scalable target with Application Auto Scaling, you can create and apply scaling policies to
     * it with <a>PutScalingPolicy</a>. You can view the existing scaling policies for a service namespace with
     * <a>DescribeScalableTargets</a>. If you are no longer using a scalable target, you can deregister it with
     * <a>DeregisterScalableTarget</a>.
     * </p>
     * 
     * @param registerScalableTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterScalableTarget operation returned by the service.
     * @sample AWSApplicationAutoScalingAsyncHandler.RegisterScalableTarget
     */
    java.util.concurrent.Future<RegisterScalableTargetResult> registerScalableTargetAsync(RegisterScalableTargetRequest registerScalableTargetRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterScalableTargetRequest, RegisterScalableTargetResult> asyncHandler);

}
