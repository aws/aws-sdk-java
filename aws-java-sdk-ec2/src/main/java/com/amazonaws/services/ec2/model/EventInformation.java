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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a Spot Fleet event.
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
     * The following are the <code>error</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>iamFleetRoleInvalid</code> - The Spot Fleet did not have the required permissions either to launch or
     * terminate an instance.
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
     * <code>spotInstanceCountLimitExceeded</code> - You've reached the limit on the number of Spot Instances that you
     * can launch.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the <code>fleetRequestChange</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The Spot Fleet has been validated and Amazon EC2 is attempting to maintain the target
     * number of running Spot Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Spot Fleet is canceled and has no running Spot Instances. The Spot Fleet will be
     * deleted two days after its instances were terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled_running</code> - The Spot Fleet is canceled and does not launch additional Spot Instances.
     * Existing Spot Instances continue to run until they are interrupted or terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled_terminating</code> - The Spot Fleet is canceled and its Spot Instances are terminating.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Spot Fleet request has expired. A subsequent event indicates that the instances were
     * terminated, if the request was created with <code>TerminateInstancesWithExpiration</code> set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify_in_progress</code> - A request to modify the Spot Fleet request was accepted and is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify_successful</code> - The Spot Fleet request was modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>price_update</code> - The price for a launch configuration was adjusted because it was too high. This
     * change is permanent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>submitted</code> - The Spot Fleet request is being evaluated and Amazon EC2 is preparing to launch the
     * target number of Spot Instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the <code>instanceChange</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>launched</code> - A request was fulfilled and a new instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terminated</code> - An instance was terminated by the user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the <code>Information</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>launchSpecTemporarilyBlacklisted</code> - The configuration is not valid and several attempts to launch
     * instances have failed. For more information, see the description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launchSpecUnusable</code> - The price in a launch specification is not valid because it is below the Spot
     * price or the Spot price is above the On-Demand price.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fleetProgressHalted</code> - The price in every launch specification is not valid. A launch specification
     * might become valid if the Spot price changes.
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
     * The following are the <code>error</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>iamFleetRoleInvalid</code> - The Spot Fleet did not have the required permissions either to launch or
     * terminate an instance.
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
     * <code>spotInstanceCountLimitExceeded</code> - You've reached the limit on the number of Spot Instances that you
     * can launch.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the <code>fleetRequestChange</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The Spot Fleet has been validated and Amazon EC2 is attempting to maintain the target
     * number of running Spot Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Spot Fleet is canceled and has no running Spot Instances. The Spot Fleet will be
     * deleted two days after its instances were terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled_running</code> - The Spot Fleet is canceled and does not launch additional Spot Instances.
     * Existing Spot Instances continue to run until they are interrupted or terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled_terminating</code> - The Spot Fleet is canceled and its Spot Instances are terminating.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Spot Fleet request has expired. A subsequent event indicates that the instances were
     * terminated, if the request was created with <code>TerminateInstancesWithExpiration</code> set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify_in_progress</code> - A request to modify the Spot Fleet request was accepted and is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify_successful</code> - The Spot Fleet request was modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>price_update</code> - The price for a launch configuration was adjusted because it was too high. This
     * change is permanent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>submitted</code> - The Spot Fleet request is being evaluated and Amazon EC2 is preparing to launch the
     * target number of Spot Instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the <code>instanceChange</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>launched</code> - A request was fulfilled and a new instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terminated</code> - An instance was terminated by the user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the <code>Information</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>launchSpecTemporarilyBlacklisted</code> - The configuration is not valid and several attempts to launch
     * instances have failed. For more information, see the description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launchSpecUnusable</code> - The price in a launch specification is not valid because it is below the Spot
     * price or the Spot price is above the On-Demand price.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fleetProgressHalted</code> - The price in every launch specification is not valid. A launch specification
     * might become valid if the Spot price changes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventSubType
     *        The event.</p>
     *        <p>
     *        The following are the <code>error</code> events:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>iamFleetRoleInvalid</code> - The Spot Fleet did not have the required permissions either to launch
     *        or terminate an instance.
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
     *        <code>spotInstanceCountLimitExceeded</code> - You've reached the limit on the number of Spot Instances
     *        that you can launch.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following are the <code>fleetRequestChange</code> events:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>active</code> - The Spot Fleet has been validated and Amazon EC2 is attempting to maintain the
     *        target number of running Spot Instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelled</code> - The Spot Fleet is canceled and has no running Spot Instances. The Spot Fleet will
     *        be deleted two days after its instances were terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelled_running</code> - The Spot Fleet is canceled and does not launch additional Spot Instances.
     *        Existing Spot Instances continue to run until they are interrupted or terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelled_terminating</code> - The Spot Fleet is canceled and its Spot Instances are terminating.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expired</code> - The Spot Fleet request has expired. A subsequent event indicates that the instances
     *        were terminated, if the request was created with <code>TerminateInstancesWithExpiration</code> set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modify_in_progress</code> - A request to modify the Spot Fleet request was accepted and is in
     *        progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modify_successful</code> - The Spot Fleet request was modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>price_update</code> - The price for a launch configuration was adjusted because it was too high.
     *        This change is permanent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>submitted</code> - The Spot Fleet request is being evaluated and Amazon EC2 is preparing to launch
     *        the target number of Spot Instances.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following are the <code>instanceChange</code> events:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>launched</code> - A request was fulfilled and a new instance was launched.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>terminated</code> - An instance was terminated by the user.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following are the <code>Information</code> events:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>launchSpecTemporarilyBlacklisted</code> - The configuration is not valid and several attempts to
     *        launch instances have failed. For more information, see the description of the event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launchSpecUnusable</code> - The price in a launch specification is not valid because it is below the
     *        Spot price or the Spot price is above the On-Demand price.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fleetProgressHalted</code> - The price in every launch specification is not valid. A launch
     *        specification might become valid if the Spot price changes.
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
     * The following are the <code>error</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>iamFleetRoleInvalid</code> - The Spot Fleet did not have the required permissions either to launch or
     * terminate an instance.
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
     * <code>spotInstanceCountLimitExceeded</code> - You've reached the limit on the number of Spot Instances that you
     * can launch.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the <code>fleetRequestChange</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The Spot Fleet has been validated and Amazon EC2 is attempting to maintain the target
     * number of running Spot Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Spot Fleet is canceled and has no running Spot Instances. The Spot Fleet will be
     * deleted two days after its instances were terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled_running</code> - The Spot Fleet is canceled and does not launch additional Spot Instances.
     * Existing Spot Instances continue to run until they are interrupted or terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled_terminating</code> - The Spot Fleet is canceled and its Spot Instances are terminating.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Spot Fleet request has expired. A subsequent event indicates that the instances were
     * terminated, if the request was created with <code>TerminateInstancesWithExpiration</code> set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify_in_progress</code> - A request to modify the Spot Fleet request was accepted and is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify_successful</code> - The Spot Fleet request was modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>price_update</code> - The price for a launch configuration was adjusted because it was too high. This
     * change is permanent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>submitted</code> - The Spot Fleet request is being evaluated and Amazon EC2 is preparing to launch the
     * target number of Spot Instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the <code>instanceChange</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>launched</code> - A request was fulfilled and a new instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terminated</code> - An instance was terminated by the user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the <code>Information</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>launchSpecTemporarilyBlacklisted</code> - The configuration is not valid and several attempts to launch
     * instances have failed. For more information, see the description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launchSpecUnusable</code> - The price in a launch specification is not valid because it is below the Spot
     * price or the Spot price is above the On-Demand price.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fleetProgressHalted</code> - The price in every launch specification is not valid. A launch specification
     * might become valid if the Spot price changes.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The event.</p>
     *         <p>
     *         The following are the <code>error</code> events:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>iamFleetRoleInvalid</code> - The Spot Fleet did not have the required permissions either to launch
     *         or terminate an instance.
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
     *         <code>spotInstanceCountLimitExceeded</code> - You've reached the limit on the number of Spot Instances
     *         that you can launch.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following are the <code>fleetRequestChange</code> events:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>active</code> - The Spot Fleet has been validated and Amazon EC2 is attempting to maintain the
     *         target number of running Spot Instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cancelled</code> - The Spot Fleet is canceled and has no running Spot Instances. The Spot Fleet
     *         will be deleted two days after its instances were terminated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cancelled_running</code> - The Spot Fleet is canceled and does not launch additional Spot
     *         Instances. Existing Spot Instances continue to run until they are interrupted or terminated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cancelled_terminating</code> - The Spot Fleet is canceled and its Spot Instances are terminating.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>expired</code> - The Spot Fleet request has expired. A subsequent event indicates that the
     *         instances were terminated, if the request was created with <code>TerminateInstancesWithExpiration</code>
     *         set.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>modify_in_progress</code> - A request to modify the Spot Fleet request was accepted and is in
     *         progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>modify_successful</code> - The Spot Fleet request was modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>price_update</code> - The price for a launch configuration was adjusted because it was too high.
     *         This change is permanent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>submitted</code> - The Spot Fleet request is being evaluated and Amazon EC2 is preparing to launch
     *         the target number of Spot Instances.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following are the <code>instanceChange</code> events:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>launched</code> - A request was fulfilled and a new instance was launched.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>terminated</code> - An instance was terminated by the user.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following are the <code>Information</code> events:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>launchSpecTemporarilyBlacklisted</code> - The configuration is not valid and several attempts to
     *         launch instances have failed. For more information, see the description of the event.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launchSpecUnusable</code> - The price in a launch specification is not valid because it is below
     *         the Spot price or the Spot price is above the On-Demand price.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>fleetProgressHalted</code> - The price in every launch specification is not valid. A launch
     *         specification might become valid if the Spot price changes.
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
     * The following are the <code>error</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>iamFleetRoleInvalid</code> - The Spot Fleet did not have the required permissions either to launch or
     * terminate an instance.
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
     * <code>spotInstanceCountLimitExceeded</code> - You've reached the limit on the number of Spot Instances that you
     * can launch.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the <code>fleetRequestChange</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The Spot Fleet has been validated and Amazon EC2 is attempting to maintain the target
     * number of running Spot Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled</code> - The Spot Fleet is canceled and has no running Spot Instances. The Spot Fleet will be
     * deleted two days after its instances were terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled_running</code> - The Spot Fleet is canceled and does not launch additional Spot Instances.
     * Existing Spot Instances continue to run until they are interrupted or terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cancelled_terminating</code> - The Spot Fleet is canceled and its Spot Instances are terminating.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The Spot Fleet request has expired. A subsequent event indicates that the instances were
     * terminated, if the request was created with <code>TerminateInstancesWithExpiration</code> set.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify_in_progress</code> - A request to modify the Spot Fleet request was accepted and is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>modify_successful</code> - The Spot Fleet request was modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>price_update</code> - The price for a launch configuration was adjusted because it was too high. This
     * change is permanent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>submitted</code> - The Spot Fleet request is being evaluated and Amazon EC2 is preparing to launch the
     * target number of Spot Instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the <code>instanceChange</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>launched</code> - A request was fulfilled and a new instance was launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terminated</code> - An instance was terminated by the user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the <code>Information</code> events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>launchSpecTemporarilyBlacklisted</code> - The configuration is not valid and several attempts to launch
     * instances have failed. For more information, see the description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launchSpecUnusable</code> - The price in a launch specification is not valid because it is below the Spot
     * price or the Spot price is above the On-Demand price.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fleetProgressHalted</code> - The price in every launch specification is not valid. A launch specification
     * might become valid if the Spot price changes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventSubType
     *        The event.</p>
     *        <p>
     *        The following are the <code>error</code> events:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>iamFleetRoleInvalid</code> - The Spot Fleet did not have the required permissions either to launch
     *        or terminate an instance.
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
     *        <code>spotInstanceCountLimitExceeded</code> - You've reached the limit on the number of Spot Instances
     *        that you can launch.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following are the <code>fleetRequestChange</code> events:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>active</code> - The Spot Fleet has been validated and Amazon EC2 is attempting to maintain the
     *        target number of running Spot Instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelled</code> - The Spot Fleet is canceled and has no running Spot Instances. The Spot Fleet will
     *        be deleted two days after its instances were terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelled_running</code> - The Spot Fleet is canceled and does not launch additional Spot Instances.
     *        Existing Spot Instances continue to run until they are interrupted or terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cancelled_terminating</code> - The Spot Fleet is canceled and its Spot Instances are terminating.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expired</code> - The Spot Fleet request has expired. A subsequent event indicates that the instances
     *        were terminated, if the request was created with <code>TerminateInstancesWithExpiration</code> set.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modify_in_progress</code> - A request to modify the Spot Fleet request was accepted and is in
     *        progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>modify_successful</code> - The Spot Fleet request was modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>price_update</code> - The price for a launch configuration was adjusted because it was too high.
     *        This change is permanent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>submitted</code> - The Spot Fleet request is being evaluated and Amazon EC2 is preparing to launch
     *        the target number of Spot Instances.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following are the <code>instanceChange</code> events:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>launched</code> - A request was fulfilled and a new instance was launched.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>terminated</code> - An instance was terminated by the user.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following are the <code>Information</code> events:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>launchSpecTemporarilyBlacklisted</code> - The configuration is not valid and several attempts to
     *        launch instances have failed. For more information, see the description of the event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launchSpecUnusable</code> - The price in a launch specification is not valid because it is below the
     *        Spot price or the Spot price is above the On-Demand price.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fleetProgressHalted</code> - The price in every launch specification is not valid. A launch
     *        specification might become valid if the Spot price changes.
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
