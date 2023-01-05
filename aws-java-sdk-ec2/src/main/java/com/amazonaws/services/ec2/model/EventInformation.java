/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an EC2 Fleet or Spot Fleet event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EventInformation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventInformation implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the event.
     * </p>
     */
    private String eventDescription;
    /**
     * <p>
     * The event.
     * </p>
     * <p>
     * <code>error</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>iamFleetRoleInvalid</code> - The EC2 Fleet or Spot Fleet does not have the required permissions either to
     * launch or terminate an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>allLaunchSpecsTemporarilyBlacklisted</code> - None of the configurations are valid, and several attempts to
     * launch instances have failed. For more information, see the description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spotInstanceCountLimitExceeded</code> - You've reached the limit on the number of Spot Instances that you
     * can launch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spotFleetRequestConfigurationInvalid</code> - The configuration is not valid. For more information, see the
     * description of the event.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>fleetRequestChange</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The EC2 Fleet or Spot Fleet request has been validated and Amazon EC2 is attempting to
     * maintain the target number of running instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code> (EC2 Fleet) / <code>cancelled</code> (Spot Fleet) - The EC2 Fleet is deleted or the Spot
     * Fleet request is canceled and has no running instances. The EC2 Fleet or Spot Fleet will be deleted two days
     * after its instances are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted_running</code> (EC2 Fleet) / <code>cancelled_running</code> (Spot Fleet) - The EC2 Fleet is deleted
     * or the Spot Fleet request is canceled and does not launch additional instances. Its existing instances continue
     * to run until they are interrupted or terminated. The request remains in this state until all instances are
     * interrupted or terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted_terminating</code> (EC2 Fleet) / <code>cancelled_terminating</code> (Spot Fleet) - The EC2 Fleet is
     * deleted or the Spot Fleet request is canceled and its instances are terminating. The request remains in this
     * state until all instances are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The EC2 Fleet or Spot Fleet request has expired. If the request was created with
     * <code>TerminateInstancesWithExpiration</code> set, a subsequent <code>terminated</code> event indicates that the
     * instances are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify_in_progress</code> - The EC2 Fleet or Spot Fleet request is being modified. The request remains in
     * this state until the modification is fully processed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify_succeeded</code> - The EC2 Fleet or Spot Fleet request was modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>submitted</code> - The EC2 Fleet or Spot Fleet request is being evaluated and Amazon EC2 is preparing to
     * launch the target number of instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>progress</code> - The EC2 Fleet or Spot Fleet request is in the process of being fulfilled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>instanceChange</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>launched</code> - A new instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terminated</code> - An instance was terminated by the user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>termination_notified</code> - An instance termination notification was sent when a Spot Instance was
     * terminated by Amazon EC2 during scale-down, when the target capacity of the fleet was modified down, for example,
     * from a target capacity of 4 to a target capacity of 3.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>Information</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>fleetProgressHalted</code> - The price in every launch specification is not valid because it is below the
     * Spot price (all the launch specifications have produced <code>launchSpecUnusable</code> events). A launch
     * specification might become valid if the Spot price changes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launchSpecTemporarilyBlacklisted</code> - The configuration is not valid and several attempts to launch
     * instances have failed. For more information, see the description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launchSpecUnusable</code> - The price in a launch specification is not valid because it is below the Spot
     * price.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>registerWithLoadBalancersFailed</code> - An attempt to register instances with load balancers failed. For
     * more information, see the description of the event.
     * </p>
     * </li>
     * </ul>
     */
    private String eventSubType;
    /**
     * <p>
     * The ID of the instance. This information is available only for <code>instanceChange</code> events.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The description of the event.
     * </p>
     * 
     * @param eventDescription
     *        The description of the event.
     */

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    /**
     * <p>
     * The description of the event.
     * </p>
     * 
     * @return The description of the event.
     */

    public String getEventDescription() {
        return this.eventDescription;
    }

    /**
     * <p>
     * The description of the event.
     * </p>
     * 
     * @param eventDescription
     *        The description of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventInformation withEventDescription(String eventDescription) {
        setEventDescription(eventDescription);
        return this;
    }

    /**
     * <p>
     * The event.
     * </p>
     * <p>
     * <code>error</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>iamFleetRoleInvalid</code> - The EC2 Fleet or Spot Fleet does not have the required permissions either to
     * launch or terminate an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>allLaunchSpecsTemporarilyBlacklisted</code> - None of the configurations are valid, and several attempts to
     * launch instances have failed. For more information, see the description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spotInstanceCountLimitExceeded</code> - You've reached the limit on the number of Spot Instances that you
     * can launch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spotFleetRequestConfigurationInvalid</code> - The configuration is not valid. For more information, see the
     * description of the event.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>fleetRequestChange</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The EC2 Fleet or Spot Fleet request has been validated and Amazon EC2 is attempting to
     * maintain the target number of running instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code> (EC2 Fleet) / <code>cancelled</code> (Spot Fleet) - The EC2 Fleet is deleted or the Spot
     * Fleet request is canceled and has no running instances. The EC2 Fleet or Spot Fleet will be deleted two days
     * after its instances are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted_running</code> (EC2 Fleet) / <code>cancelled_running</code> (Spot Fleet) - The EC2 Fleet is deleted
     * or the Spot Fleet request is canceled and does not launch additional instances. Its existing instances continue
     * to run until they are interrupted or terminated. The request remains in this state until all instances are
     * interrupted or terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted_terminating</code> (EC2 Fleet) / <code>cancelled_terminating</code> (Spot Fleet) - The EC2 Fleet is
     * deleted or the Spot Fleet request is canceled and its instances are terminating. The request remains in this
     * state until all instances are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The EC2 Fleet or Spot Fleet request has expired. If the request was created with
     * <code>TerminateInstancesWithExpiration</code> set, a subsequent <code>terminated</code> event indicates that the
     * instances are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify_in_progress</code> - The EC2 Fleet or Spot Fleet request is being modified. The request remains in
     * this state until the modification is fully processed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify_succeeded</code> - The EC2 Fleet or Spot Fleet request was modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>submitted</code> - The EC2 Fleet or Spot Fleet request is being evaluated and Amazon EC2 is preparing to
     * launch the target number of instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>progress</code> - The EC2 Fleet or Spot Fleet request is in the process of being fulfilled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>instanceChange</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>launched</code> - A new instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terminated</code> - An instance was terminated by the user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>termination_notified</code> - An instance termination notification was sent when a Spot Instance was
     * terminated by Amazon EC2 during scale-down, when the target capacity of the fleet was modified down, for example,
     * from a target capacity of 4 to a target capacity of 3.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>Information</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>fleetProgressHalted</code> - The price in every launch specification is not valid because it is below the
     * Spot price (all the launch specifications have produced <code>launchSpecUnusable</code> events). A launch
     * specification might become valid if the Spot price changes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launchSpecTemporarilyBlacklisted</code> - The configuration is not valid and several attempts to launch
     * instances have failed. For more information, see the description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launchSpecUnusable</code> - The price in a launch specification is not valid because it is below the Spot
     * price.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>registerWithLoadBalancersFailed</code> - An attempt to register instances with load balancers failed. For
     * more information, see the description of the event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventSubType
     *        The event.</p>
     *        <p>
     *        <code>error</code> events:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>iamFleetRoleInvalid</code> - The EC2 Fleet or Spot Fleet does not have the required permissions
     *        either to launch or terminate an instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>allLaunchSpecsTemporarilyBlacklisted</code> - None of the configurations are valid, and several
     *        attempts to launch instances have failed. For more information, see the description of the event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>spotInstanceCountLimitExceeded</code> - You've reached the limit on the number of Spot Instances
     *        that you can launch.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>spotFleetRequestConfigurationInvalid</code> - The configuration is not valid. For more information,
     *        see the description of the event.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>fleetRequestChange</code> events:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>active</code> - The EC2 Fleet or Spot Fleet request has been validated and Amazon EC2 is attempting
     *        to maintain the target number of running instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code> (EC2 Fleet) / <code>cancelled</code> (Spot Fleet) - The EC2 Fleet is deleted or the
     *        Spot Fleet request is canceled and has no running instances. The EC2 Fleet or Spot Fleet will be deleted
     *        two days after its instances are terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted_running</code> (EC2 Fleet) / <code>cancelled_running</code> (Spot Fleet) - The EC2 Fleet is
     *        deleted or the Spot Fleet request is canceled and does not launch additional instances. Its existing
     *        instances continue to run until they are interrupted or terminated. The request remains in this state
     *        until all instances are interrupted or terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted_terminating</code> (EC2 Fleet) / <code>cancelled_terminating</code> (Spot Fleet) - The EC2
     *        Fleet is deleted or the Spot Fleet request is canceled and its instances are terminating. The request
     *        remains in this state until all instances are terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expired</code> - The EC2 Fleet or Spot Fleet request has expired. If the request was created with
     *        <code>TerminateInstancesWithExpiration</code> set, a subsequent <code>terminated</code> event indicates
     *        that the instances are terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modify_in_progress</code> - The EC2 Fleet or Spot Fleet request is being modified. The request
     *        remains in this state until the modification is fully processed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modify_succeeded</code> - The EC2 Fleet or Spot Fleet request was modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>submitted</code> - The EC2 Fleet or Spot Fleet request is being evaluated and Amazon EC2 is
     *        preparing to launch the target number of instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>progress</code> - The EC2 Fleet or Spot Fleet request is in the process of being fulfilled.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>instanceChange</code> events:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>launched</code> - A new instance was launched.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>terminated</code> - An instance was terminated by the user.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>termination_notified</code> - An instance termination notification was sent when a Spot Instance was
     *        terminated by Amazon EC2 during scale-down, when the target capacity of the fleet was modified down, for
     *        example, from a target capacity of 4 to a target capacity of 3.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>Information</code> events:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>fleetProgressHalted</code> - The price in every launch specification is not valid because it is
     *        below the Spot price (all the launch specifications have produced <code>launchSpecUnusable</code> events).
     *        A launch specification might become valid if the Spot price changes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launchSpecTemporarilyBlacklisted</code> - The configuration is not valid and several attempts to
     *        launch instances have failed. For more information, see the description of the event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launchSpecUnusable</code> - The price in a launch specification is not valid because it is below the
     *        Spot price.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>registerWithLoadBalancersFailed</code> - An attempt to register instances with load balancers
     *        failed. For more information, see the description of the event.
     *        </p>
     *        </li>
     */

    public void setEventSubType(String eventSubType) {
        this.eventSubType = eventSubType;
    }

    /**
     * <p>
     * The event.
     * </p>
     * <p>
     * <code>error</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>iamFleetRoleInvalid</code> - The EC2 Fleet or Spot Fleet does not have the required permissions either to
     * launch or terminate an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>allLaunchSpecsTemporarilyBlacklisted</code> - None of the configurations are valid, and several attempts to
     * launch instances have failed. For more information, see the description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spotInstanceCountLimitExceeded</code> - You've reached the limit on the number of Spot Instances that you
     * can launch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spotFleetRequestConfigurationInvalid</code> - The configuration is not valid. For more information, see the
     * description of the event.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>fleetRequestChange</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The EC2 Fleet or Spot Fleet request has been validated and Amazon EC2 is attempting to
     * maintain the target number of running instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code> (EC2 Fleet) / <code>cancelled</code> (Spot Fleet) - The EC2 Fleet is deleted or the Spot
     * Fleet request is canceled and has no running instances. The EC2 Fleet or Spot Fleet will be deleted two days
     * after its instances are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted_running</code> (EC2 Fleet) / <code>cancelled_running</code> (Spot Fleet) - The EC2 Fleet is deleted
     * or the Spot Fleet request is canceled and does not launch additional instances. Its existing instances continue
     * to run until they are interrupted or terminated. The request remains in this state until all instances are
     * interrupted or terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted_terminating</code> (EC2 Fleet) / <code>cancelled_terminating</code> (Spot Fleet) - The EC2 Fleet is
     * deleted or the Spot Fleet request is canceled and its instances are terminating. The request remains in this
     * state until all instances are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The EC2 Fleet or Spot Fleet request has expired. If the request was created with
     * <code>TerminateInstancesWithExpiration</code> set, a subsequent <code>terminated</code> event indicates that the
     * instances are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify_in_progress</code> - The EC2 Fleet or Spot Fleet request is being modified. The request remains in
     * this state until the modification is fully processed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify_succeeded</code> - The EC2 Fleet or Spot Fleet request was modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>submitted</code> - The EC2 Fleet or Spot Fleet request is being evaluated and Amazon EC2 is preparing to
     * launch the target number of instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>progress</code> - The EC2 Fleet or Spot Fleet request is in the process of being fulfilled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>instanceChange</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>launched</code> - A new instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terminated</code> - An instance was terminated by the user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>termination_notified</code> - An instance termination notification was sent when a Spot Instance was
     * terminated by Amazon EC2 during scale-down, when the target capacity of the fleet was modified down, for example,
     * from a target capacity of 4 to a target capacity of 3.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>Information</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>fleetProgressHalted</code> - The price in every launch specification is not valid because it is below the
     * Spot price (all the launch specifications have produced <code>launchSpecUnusable</code> events). A launch
     * specification might become valid if the Spot price changes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launchSpecTemporarilyBlacklisted</code> - The configuration is not valid and several attempts to launch
     * instances have failed. For more information, see the description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launchSpecUnusable</code> - The price in a launch specification is not valid because it is below the Spot
     * price.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>registerWithLoadBalancersFailed</code> - An attempt to register instances with load balancers failed. For
     * more information, see the description of the event.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The event.</p>
     *         <p>
     *         <code>error</code> events:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>iamFleetRoleInvalid</code> - The EC2 Fleet or Spot Fleet does not have the required permissions
     *         either to launch or terminate an instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>allLaunchSpecsTemporarilyBlacklisted</code> - None of the configurations are valid, and several
     *         attempts to launch instances have failed. For more information, see the description of the event.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>spotInstanceCountLimitExceeded</code> - You've reached the limit on the number of Spot Instances
     *         that you can launch.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>spotFleetRequestConfigurationInvalid</code> - The configuration is not valid. For more information,
     *         see the description of the event.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>fleetRequestChange</code> events:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>active</code> - The EC2 Fleet or Spot Fleet request has been validated and Amazon EC2 is attempting
     *         to maintain the target number of running instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleted</code> (EC2 Fleet) / <code>cancelled</code> (Spot Fleet) - The EC2 Fleet is deleted or the
     *         Spot Fleet request is canceled and has no running instances. The EC2 Fleet or Spot Fleet will be deleted
     *         two days after its instances are terminated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleted_running</code> (EC2 Fleet) / <code>cancelled_running</code> (Spot Fleet) - The EC2 Fleet is
     *         deleted or the Spot Fleet request is canceled and does not launch additional instances. Its existing
     *         instances continue to run until they are interrupted or terminated. The request remains in this state
     *         until all instances are interrupted or terminated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleted_terminating</code> (EC2 Fleet) / <code>cancelled_terminating</code> (Spot Fleet) - The EC2
     *         Fleet is deleted or the Spot Fleet request is canceled and its instances are terminating. The request
     *         remains in this state until all instances are terminated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>expired</code> - The EC2 Fleet or Spot Fleet request has expired. If the request was created with
     *         <code>TerminateInstancesWithExpiration</code> set, a subsequent <code>terminated</code> event indicates
     *         that the instances are terminated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>modify_in_progress</code> - The EC2 Fleet or Spot Fleet request is being modified. The request
     *         remains in this state until the modification is fully processed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>modify_succeeded</code> - The EC2 Fleet or Spot Fleet request was modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>submitted</code> - The EC2 Fleet or Spot Fleet request is being evaluated and Amazon EC2 is
     *         preparing to launch the target number of instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>progress</code> - The EC2 Fleet or Spot Fleet request is in the process of being fulfilled.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>instanceChange</code> events:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>launched</code> - A new instance was launched.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>terminated</code> - An instance was terminated by the user.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>termination_notified</code> - An instance termination notification was sent when a Spot Instance
     *         was terminated by Amazon EC2 during scale-down, when the target capacity of the fleet was modified down,
     *         for example, from a target capacity of 4 to a target capacity of 3.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>Information</code> events:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>fleetProgressHalted</code> - The price in every launch specification is not valid because it is
     *         below the Spot price (all the launch specifications have produced <code>launchSpecUnusable</code>
     *         events). A launch specification might become valid if the Spot price changes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launchSpecTemporarilyBlacklisted</code> - The configuration is not valid and several attempts to
     *         launch instances have failed. For more information, see the description of the event.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launchSpecUnusable</code> - The price in a launch specification is not valid because it is below
     *         the Spot price.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>registerWithLoadBalancersFailed</code> - An attempt to register instances with load balancers
     *         failed. For more information, see the description of the event.
     *         </p>
     *         </li>
     */

    public String getEventSubType() {
        return this.eventSubType;
    }

    /**
     * <p>
     * The event.
     * </p>
     * <p>
     * <code>error</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>iamFleetRoleInvalid</code> - The EC2 Fleet or Spot Fleet does not have the required permissions either to
     * launch or terminate an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>allLaunchSpecsTemporarilyBlacklisted</code> - None of the configurations are valid, and several attempts to
     * launch instances have failed. For more information, see the description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spotInstanceCountLimitExceeded</code> - You've reached the limit on the number of Spot Instances that you
     * can launch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spotFleetRequestConfigurationInvalid</code> - The configuration is not valid. For more information, see the
     * description of the event.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>fleetRequestChange</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The EC2 Fleet or Spot Fleet request has been validated and Amazon EC2 is attempting to
     * maintain the target number of running instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code> (EC2 Fleet) / <code>cancelled</code> (Spot Fleet) - The EC2 Fleet is deleted or the Spot
     * Fleet request is canceled and has no running instances. The EC2 Fleet or Spot Fleet will be deleted two days
     * after its instances are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted_running</code> (EC2 Fleet) / <code>cancelled_running</code> (Spot Fleet) - The EC2 Fleet is deleted
     * or the Spot Fleet request is canceled and does not launch additional instances. Its existing instances continue
     * to run until they are interrupted or terminated. The request remains in this state until all instances are
     * interrupted or terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted_terminating</code> (EC2 Fleet) / <code>cancelled_terminating</code> (Spot Fleet) - The EC2 Fleet is
     * deleted or the Spot Fleet request is canceled and its instances are terminating. The request remains in this
     * state until all instances are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The EC2 Fleet or Spot Fleet request has expired. If the request was created with
     * <code>TerminateInstancesWithExpiration</code> set, a subsequent <code>terminated</code> event indicates that the
     * instances are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify_in_progress</code> - The EC2 Fleet or Spot Fleet request is being modified. The request remains in
     * this state until the modification is fully processed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify_succeeded</code> - The EC2 Fleet or Spot Fleet request was modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>submitted</code> - The EC2 Fleet or Spot Fleet request is being evaluated and Amazon EC2 is preparing to
     * launch the target number of instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>progress</code> - The EC2 Fleet or Spot Fleet request is in the process of being fulfilled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>instanceChange</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>launched</code> - A new instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terminated</code> - An instance was terminated by the user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>termination_notified</code> - An instance termination notification was sent when a Spot Instance was
     * terminated by Amazon EC2 during scale-down, when the target capacity of the fleet was modified down, for example,
     * from a target capacity of 4 to a target capacity of 3.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>Information</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>fleetProgressHalted</code> - The price in every launch specification is not valid because it is below the
     * Spot price (all the launch specifications have produced <code>launchSpecUnusable</code> events). A launch
     * specification might become valid if the Spot price changes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launchSpecTemporarilyBlacklisted</code> - The configuration is not valid and several attempts to launch
     * instances have failed. For more information, see the description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launchSpecUnusable</code> - The price in a launch specification is not valid because it is below the Spot
     * price.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>registerWithLoadBalancersFailed</code> - An attempt to register instances with load balancers failed. For
     * more information, see the description of the event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventSubType
     *        The event.</p>
     *        <p>
     *        <code>error</code> events:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>iamFleetRoleInvalid</code> - The EC2 Fleet or Spot Fleet does not have the required permissions
     *        either to launch or terminate an instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>allLaunchSpecsTemporarilyBlacklisted</code> - None of the configurations are valid, and several
     *        attempts to launch instances have failed. For more information, see the description of the event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>spotInstanceCountLimitExceeded</code> - You've reached the limit on the number of Spot Instances
     *        that you can launch.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>spotFleetRequestConfigurationInvalid</code> - The configuration is not valid. For more information,
     *        see the description of the event.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>fleetRequestChange</code> events:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>active</code> - The EC2 Fleet or Spot Fleet request has been validated and Amazon EC2 is attempting
     *        to maintain the target number of running instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code> (EC2 Fleet) / <code>cancelled</code> (Spot Fleet) - The EC2 Fleet is deleted or the
     *        Spot Fleet request is canceled and has no running instances. The EC2 Fleet or Spot Fleet will be deleted
     *        two days after its instances are terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted_running</code> (EC2 Fleet) / <code>cancelled_running</code> (Spot Fleet) - The EC2 Fleet is
     *        deleted or the Spot Fleet request is canceled and does not launch additional instances. Its existing
     *        instances continue to run until they are interrupted or terminated. The request remains in this state
     *        until all instances are interrupted or terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted_terminating</code> (EC2 Fleet) / <code>cancelled_terminating</code> (Spot Fleet) - The EC2
     *        Fleet is deleted or the Spot Fleet request is canceled and its instances are terminating. The request
     *        remains in this state until all instances are terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expired</code> - The EC2 Fleet or Spot Fleet request has expired. If the request was created with
     *        <code>TerminateInstancesWithExpiration</code> set, a subsequent <code>terminated</code> event indicates
     *        that the instances are terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modify_in_progress</code> - The EC2 Fleet or Spot Fleet request is being modified. The request
     *        remains in this state until the modification is fully processed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modify_succeeded</code> - The EC2 Fleet or Spot Fleet request was modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>submitted</code> - The EC2 Fleet or Spot Fleet request is being evaluated and Amazon EC2 is
     *        preparing to launch the target number of instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>progress</code> - The EC2 Fleet or Spot Fleet request is in the process of being fulfilled.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>instanceChange</code> events:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>launched</code> - A new instance was launched.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>terminated</code> - An instance was terminated by the user.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>termination_notified</code> - An instance termination notification was sent when a Spot Instance was
     *        terminated by Amazon EC2 during scale-down, when the target capacity of the fleet was modified down, for
     *        example, from a target capacity of 4 to a target capacity of 3.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>Information</code> events:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>fleetProgressHalted</code> - The price in every launch specification is not valid because it is
     *        below the Spot price (all the launch specifications have produced <code>launchSpecUnusable</code> events).
     *        A launch specification might become valid if the Spot price changes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launchSpecTemporarilyBlacklisted</code> - The configuration is not valid and several attempts to
     *        launch instances have failed. For more information, see the description of the event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launchSpecUnusable</code> - The price in a launch specification is not valid because it is below the
     *        Spot price.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>registerWithLoadBalancersFailed</code> - An attempt to register instances with load balancers
     *        failed. For more information, see the description of the event.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventInformation withEventSubType(String eventSubType) {
        setEventSubType(eventSubType);
        return this;
    }

    /**
     * <p>
     * The ID of the instance. This information is available only for <code>instanceChange</code> events.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance. This information is available only for <code>instanceChange</code> events.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance. This information is available only for <code>instanceChange</code> events.
     * </p>
     * 
     * @return The ID of the instance. This information is available only for <code>instanceChange</code> events.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance. This information is available only for <code>instanceChange</code> events.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance. This information is available only for <code>instanceChange</code> events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventInformation withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEventDescription() != null)
            sb.append("EventDescription: ").append(getEventDescription()).append(",");
        if (getEventSubType() != null)
            sb.append("EventSubType: ").append(getEventSubType()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventInformation == false)
            return false;
        EventInformation other = (EventInformation) obj;
        if (other.getEventDescription() == null ^ this.getEventDescription() == null)
            return false;
        if (other.getEventDescription() != null && other.getEventDescription().equals(this.getEventDescription()) == false)
            return false;
        if (other.getEventSubType() == null ^ this.getEventSubType() == null)
            return false;
        if (other.getEventSubType() != null && other.getEventSubType().equals(this.getEventSubType()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventDescription() == null) ? 0 : getEventDescription().hashCode());
        hashCode = prime * hashCode + ((getEventSubType() == null) ? 0 : getEventSubType().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public EventInformation clone() {
        try {
            return (EventInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
