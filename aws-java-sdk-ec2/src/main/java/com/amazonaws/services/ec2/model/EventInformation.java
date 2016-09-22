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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a Spot fleet event.
 * </p>
 */
public class EventInformation implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the instance. This information is available only for <code>instanceChange</code> events.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The event.
     * </p>
     * <p>
     * The following are the <code>error</code> events.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>iamFleetRoleInvalid</code> - The Spot fleet did not have the required permissions either to launch or
     * terminate an instance.
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
     * <code>spotFleetRequestConfigurationInvalid</code> - The configuration is not valid. For more information, see the
     * description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spotInstanceCountLimitExceeded</code> - You've reached the limit on the number of Spot instances that you
     * can launch.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the <code>fleetRequestChange</code> events.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The Spot fleet has been validated and Amazon EC2 is attempting to maintain the target
     * number of running Spot instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Spot fleet is canceled and has no running Spot instances. The Spot fleet will be
     * deleted two days after its instances were terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled_running</code> - The Spot fleet is canceled and will not launch additional Spot instances, but
     * its existing Spot instances continue to run until they are interrupted or terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled_terminating</code> - The Spot fleet is canceled and its Spot instances are terminating.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Spot fleet request has expired. A subsequent event indicates that the instances were
     * terminated, if the request was created with <code>TerminateInstancesWithExpiration</code> set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify_in_progress</code> - A request to modify the Spot fleet request was accepted and is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify_successful</code> - The Spot fleet request was modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>price_update</code> - The bid price for a launch configuration was adjusted because it was too high. This
     * change is permanent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>submitted</code> - The Spot fleet request is being evaluated and Amazon EC2 is preparing to launch the
     * target number of Spot instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the <code>instanceChange</code> events.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>launched</code> - A bid was fulfilled and a new instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terminated</code> - An instance was terminated by the user.
     * </p>
     * </li>
     * </ul>
     */
    private String eventSubType;
    /**
     * <p>
     * The description of the event.
     * </p>
     */
    private String eventDescription;

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
     * <p>
     * The event.
     * </p>
     * <p>
     * The following are the <code>error</code> events.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>iamFleetRoleInvalid</code> - The Spot fleet did not have the required permissions either to launch or
     * terminate an instance.
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
     * <code>spotFleetRequestConfigurationInvalid</code> - The configuration is not valid. For more information, see the
     * description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spotInstanceCountLimitExceeded</code> - You've reached the limit on the number of Spot instances that you
     * can launch.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the <code>fleetRequestChange</code> events.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The Spot fleet has been validated and Amazon EC2 is attempting to maintain the target
     * number of running Spot instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Spot fleet is canceled and has no running Spot instances. The Spot fleet will be
     * deleted two days after its instances were terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled_running</code> - The Spot fleet is canceled and will not launch additional Spot instances, but
     * its existing Spot instances continue to run until they are interrupted or terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled_terminating</code> - The Spot fleet is canceled and its Spot instances are terminating.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Spot fleet request has expired. A subsequent event indicates that the instances were
     * terminated, if the request was created with <code>TerminateInstancesWithExpiration</code> set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify_in_progress</code> - A request to modify the Spot fleet request was accepted and is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify_successful</code> - The Spot fleet request was modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>price_update</code> - The bid price for a launch configuration was adjusted because it was too high. This
     * change is permanent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>submitted</code> - The Spot fleet request is being evaluated and Amazon EC2 is preparing to launch the
     * target number of Spot instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the <code>instanceChange</code> events.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>launched</code> - A bid was fulfilled and a new instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terminated</code> - An instance was terminated by the user.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventSubType
     *        The event.</p>
     *        <p>
     *        The following are the <code>error</code> events.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>iamFleetRoleInvalid</code> - The Spot fleet did not have the required permissions either to launch
     *        or terminate an instance.
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
     *        <code>spotFleetRequestConfigurationInvalid</code> - The configuration is not valid. For more information,
     *        see the description of the event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>spotInstanceCountLimitExceeded</code> - You've reached the limit on the number of Spot instances
     *        that you can launch.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following are the <code>fleetRequestChange</code> events.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>active</code> - The Spot fleet has been validated and Amazon EC2 is attempting to maintain the
     *        target number of running Spot instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelled</code> - The Spot fleet is canceled and has no running Spot instances. The Spot fleet will
     *        be deleted two days after its instances were terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelled_running</code> - The Spot fleet is canceled and will not launch additional Spot instances,
     *        but its existing Spot instances continue to run until they are interrupted or terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelled_terminating</code> - The Spot fleet is canceled and its Spot instances are terminating.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expired</code> - The Spot fleet request has expired. A subsequent event indicates that the instances
     *        were terminated, if the request was created with <code>TerminateInstancesWithExpiration</code> set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modify_in_progress</code> - A request to modify the Spot fleet request was accepted and is in
     *        progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modify_successful</code> - The Spot fleet request was modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>price_update</code> - The bid price for a launch configuration was adjusted because it was too high.
     *        This change is permanent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>submitted</code> - The Spot fleet request is being evaluated and Amazon EC2 is preparing to launch
     *        the target number of Spot instances.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following are the <code>instanceChange</code> events.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>launched</code> - A bid was fulfilled and a new instance was launched.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>terminated</code> - An instance was terminated by the user.
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
     * The following are the <code>error</code> events.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>iamFleetRoleInvalid</code> - The Spot fleet did not have the required permissions either to launch or
     * terminate an instance.
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
     * <code>spotFleetRequestConfigurationInvalid</code> - The configuration is not valid. For more information, see the
     * description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spotInstanceCountLimitExceeded</code> - You've reached the limit on the number of Spot instances that you
     * can launch.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the <code>fleetRequestChange</code> events.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The Spot fleet has been validated and Amazon EC2 is attempting to maintain the target
     * number of running Spot instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Spot fleet is canceled and has no running Spot instances. The Spot fleet will be
     * deleted two days after its instances were terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled_running</code> - The Spot fleet is canceled and will not launch additional Spot instances, but
     * its existing Spot instances continue to run until they are interrupted or terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled_terminating</code> - The Spot fleet is canceled and its Spot instances are terminating.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Spot fleet request has expired. A subsequent event indicates that the instances were
     * terminated, if the request was created with <code>TerminateInstancesWithExpiration</code> set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify_in_progress</code> - A request to modify the Spot fleet request was accepted and is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify_successful</code> - The Spot fleet request was modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>price_update</code> - The bid price for a launch configuration was adjusted because it was too high. This
     * change is permanent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>submitted</code> - The Spot fleet request is being evaluated and Amazon EC2 is preparing to launch the
     * target number of Spot instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the <code>instanceChange</code> events.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>launched</code> - A bid was fulfilled and a new instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terminated</code> - An instance was terminated by the user.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The event.</p>
     *         <p>
     *         The following are the <code>error</code> events.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>iamFleetRoleInvalid</code> - The Spot fleet did not have the required permissions either to launch
     *         or terminate an instance.
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
     *         <code>spotFleetRequestConfigurationInvalid</code> - The configuration is not valid. For more information,
     *         see the description of the event.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>spotInstanceCountLimitExceeded</code> - You've reached the limit on the number of Spot instances
     *         that you can launch.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following are the <code>fleetRequestChange</code> events.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>active</code> - The Spot fleet has been validated and Amazon EC2 is attempting to maintain the
     *         target number of running Spot instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cancelled</code> - The Spot fleet is canceled and has no running Spot instances. The Spot fleet
     *         will be deleted two days after its instances were terminated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cancelled_running</code> - The Spot fleet is canceled and will not launch additional Spot
     *         instances, but its existing Spot instances continue to run until they are interrupted or terminated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cancelled_terminating</code> - The Spot fleet is canceled and its Spot instances are terminating.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>expired</code> - The Spot fleet request has expired. A subsequent event indicates that the
     *         instances were terminated, if the request was created with <code>TerminateInstancesWithExpiration</code>
     *         set.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>modify_in_progress</code> - A request to modify the Spot fleet request was accepted and is in
     *         progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>modify_successful</code> - The Spot fleet request was modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>price_update</code> - The bid price for a launch configuration was adjusted because it was too
     *         high. This change is permanent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>submitted</code> - The Spot fleet request is being evaluated and Amazon EC2 is preparing to launch
     *         the target number of Spot instances.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following are the <code>instanceChange</code> events.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>launched</code> - A bid was fulfilled and a new instance was launched.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>terminated</code> - An instance was terminated by the user.
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
     * The following are the <code>error</code> events.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>iamFleetRoleInvalid</code> - The Spot fleet did not have the required permissions either to launch or
     * terminate an instance.
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
     * <code>spotFleetRequestConfigurationInvalid</code> - The configuration is not valid. For more information, see the
     * description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spotInstanceCountLimitExceeded</code> - You've reached the limit on the number of Spot instances that you
     * can launch.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the <code>fleetRequestChange</code> events.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The Spot fleet has been validated and Amazon EC2 is attempting to maintain the target
     * number of running Spot instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Spot fleet is canceled and has no running Spot instances. The Spot fleet will be
     * deleted two days after its instances were terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled_running</code> - The Spot fleet is canceled and will not launch additional Spot instances, but
     * its existing Spot instances continue to run until they are interrupted or terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled_terminating</code> - The Spot fleet is canceled and its Spot instances are terminating.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Spot fleet request has expired. A subsequent event indicates that the instances were
     * terminated, if the request was created with <code>TerminateInstancesWithExpiration</code> set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify_in_progress</code> - A request to modify the Spot fleet request was accepted and is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify_successful</code> - The Spot fleet request was modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>price_update</code> - The bid price for a launch configuration was adjusted because it was too high. This
     * change is permanent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>submitted</code> - The Spot fleet request is being evaluated and Amazon EC2 is preparing to launch the
     * target number of Spot instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the <code>instanceChange</code> events.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>launched</code> - A bid was fulfilled and a new instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terminated</code> - An instance was terminated by the user.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventSubType
     *        The event.</p>
     *        <p>
     *        The following are the <code>error</code> events.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>iamFleetRoleInvalid</code> - The Spot fleet did not have the required permissions either to launch
     *        or terminate an instance.
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
     *        <code>spotFleetRequestConfigurationInvalid</code> - The configuration is not valid. For more information,
     *        see the description of the event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>spotInstanceCountLimitExceeded</code> - You've reached the limit on the number of Spot instances
     *        that you can launch.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following are the <code>fleetRequestChange</code> events.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>active</code> - The Spot fleet has been validated and Amazon EC2 is attempting to maintain the
     *        target number of running Spot instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelled</code> - The Spot fleet is canceled and has no running Spot instances. The Spot fleet will
     *        be deleted two days after its instances were terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelled_running</code> - The Spot fleet is canceled and will not launch additional Spot instances,
     *        but its existing Spot instances continue to run until they are interrupted or terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelled_terminating</code> - The Spot fleet is canceled and its Spot instances are terminating.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expired</code> - The Spot fleet request has expired. A subsequent event indicates that the instances
     *        were terminated, if the request was created with <code>TerminateInstancesWithExpiration</code> set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modify_in_progress</code> - A request to modify the Spot fleet request was accepted and is in
     *        progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modify_successful</code> - The Spot fleet request was modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>price_update</code> - The bid price for a launch configuration was adjusted because it was too high.
     *        This change is permanent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>submitted</code> - The Spot fleet request is being evaluated and Amazon EC2 is preparing to launch
     *        the target number of Spot instances.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following are the <code>instanceChange</code> events.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>launched</code> - A bid was fulfilled and a new instance was launched.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>terminated</code> - An instance was terminated by the user.
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
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getEventSubType() != null)
            sb.append("EventSubType: " + getEventSubType() + ",");
        if (getEventDescription() != null)
            sb.append("EventDescription: " + getEventDescription());
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
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getEventSubType() == null ^ this.getEventSubType() == null)
            return false;
        if (other.getEventSubType() != null && other.getEventSubType().equals(this.getEventSubType()) == false)
            return false;
        if (other.getEventDescription() == null ^ this.getEventDescription() == null)
            return false;
        if (other.getEventDescription() != null && other.getEventDescription().equals(this.getEventDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getEventSubType() == null) ? 0 : getEventSubType().hashCode());
        hashCode = prime * hashCode + ((getEventDescription() == null) ? 0 : getEventDescription().hashCode());
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
