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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a Spot fleet event.
 * </p>
 */
public class EventInformation implements Serializable, Cloneable {

    /**
     * The ID of the instance. This information is available only for
     * <code>instanceChange</code> events.
     */
    private String instanceId;

    /**
     * The event. <p>The following are the <code>error</code> events. <ul>
     * <li> <p><code>iamFleetRoleInvalid</code> - Spot fleet did not have the
     * required permissions either to launch or terminate an instance. </li>
     * <li> <p><code>spotFleetRequestConfigurationInvalid</code> - The
     * configuration is not valid. For more information, see the description.
     * </li> <li> <p><code>spotInstanceCountLimitExceeded</code> - You've
     * reached the limit on the number of Spot Instances that you can launch.
     * </li> </ul> <p>The following are the <code>fleetRequestChange</code>
     * events. <ul> <li> <p><code>active</code> - The Spot fleet has been
     * validated and Amazon EC2 is attempting to maintain the target number
     * of running Spot Instances. </li> <li> <p><code>cancelled</code> - The
     * Spot fleet is canceled and has no running Spot Instances. The Spot
     * fleet will be deleted two days after its instances were terminated.
     * </li> <li> <p><code>cancelled_running</code> - The Spot fleet is
     * canceled and will not launch additional Spot Instances, but its
     * existing Spot Instances will continue to run until they are
     * interrupted or terminated. </li> <li>
     * <p><code>cancelled_terminating</code> - The Spot fleet is canceled and
     * its Spot Instances are terminating. </li> <li> <p><code>expired</code>
     * - The Spot fleet request has expired. A subsequent event indicates
     * that the instances were terminated, if the request was created with
     * <code>terminateInstancesWithExpiration</code> set. </li> <li>
     * <p><code>price_update</code> - The bid price for a launch
     * configuration was adjusted because it was too high. This change is
     * permanent. </li> <li> <p><code>submitted</code> - The Spot fleet
     * request is being evaluated and Amazon EC2 is preparing to launch the
     * target number of Spot Instances. </li> </ul> <p>The following are the
     * <code>instanceChange</code> events. <ul> <li> <p><code>launched</code>
     * - A bid was fulfilled and a new instance was launched. </li> <li>
     * <p><code>terminated</code> - An instance was terminated by the user.
     * </li> </ul>
     */
    private String eventSubType;

    /**
     * The description of the event.
     */
    private String eventDescription;

    /**
     * The ID of the instance. This information is available only for
     * <code>instanceChange</code> events.
     *
     * @return The ID of the instance. This information is available only for
     *         <code>instanceChange</code> events.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance. This information is available only for
     * <code>instanceChange</code> events.
     *
     * @param instanceId The ID of the instance. This information is available only for
     *         <code>instanceChange</code> events.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance. This information is available only for
     * <code>instanceChange</code> events.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance. This information is available only for
     *         <code>instanceChange</code> events.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EventInformation withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The event. <p>The following are the <code>error</code> events. <ul>
     * <li> <p><code>iamFleetRoleInvalid</code> - Spot fleet did not have the
     * required permissions either to launch or terminate an instance. </li>
     * <li> <p><code>spotFleetRequestConfigurationInvalid</code> - The
     * configuration is not valid. For more information, see the description.
     * </li> <li> <p><code>spotInstanceCountLimitExceeded</code> - You've
     * reached the limit on the number of Spot Instances that you can launch.
     * </li> </ul> <p>The following are the <code>fleetRequestChange</code>
     * events. <ul> <li> <p><code>active</code> - The Spot fleet has been
     * validated and Amazon EC2 is attempting to maintain the target number
     * of running Spot Instances. </li> <li> <p><code>cancelled</code> - The
     * Spot fleet is canceled and has no running Spot Instances. The Spot
     * fleet will be deleted two days after its instances were terminated.
     * </li> <li> <p><code>cancelled_running</code> - The Spot fleet is
     * canceled and will not launch additional Spot Instances, but its
     * existing Spot Instances will continue to run until they are
     * interrupted or terminated. </li> <li>
     * <p><code>cancelled_terminating</code> - The Spot fleet is canceled and
     * its Spot Instances are terminating. </li> <li> <p><code>expired</code>
     * - The Spot fleet request has expired. A subsequent event indicates
     * that the instances were terminated, if the request was created with
     * <code>terminateInstancesWithExpiration</code> set. </li> <li>
     * <p><code>price_update</code> - The bid price for a launch
     * configuration was adjusted because it was too high. This change is
     * permanent. </li> <li> <p><code>submitted</code> - The Spot fleet
     * request is being evaluated and Amazon EC2 is preparing to launch the
     * target number of Spot Instances. </li> </ul> <p>The following are the
     * <code>instanceChange</code> events. <ul> <li> <p><code>launched</code>
     * - A bid was fulfilled and a new instance was launched. </li> <li>
     * <p><code>terminated</code> - An instance was terminated by the user.
     * </li> </ul>
     *
     * @return The event. <p>The following are the <code>error</code> events. <ul>
     *         <li> <p><code>iamFleetRoleInvalid</code> - Spot fleet did not have the
     *         required permissions either to launch or terminate an instance. </li>
     *         <li> <p><code>spotFleetRequestConfigurationInvalid</code> - The
     *         configuration is not valid. For more information, see the description.
     *         </li> <li> <p><code>spotInstanceCountLimitExceeded</code> - You've
     *         reached the limit on the number of Spot Instances that you can launch.
     *         </li> </ul> <p>The following are the <code>fleetRequestChange</code>
     *         events. <ul> <li> <p><code>active</code> - The Spot fleet has been
     *         validated and Amazon EC2 is attempting to maintain the target number
     *         of running Spot Instances. </li> <li> <p><code>cancelled</code> - The
     *         Spot fleet is canceled and has no running Spot Instances. The Spot
     *         fleet will be deleted two days after its instances were terminated.
     *         </li> <li> <p><code>cancelled_running</code> - The Spot fleet is
     *         canceled and will not launch additional Spot Instances, but its
     *         existing Spot Instances will continue to run until they are
     *         interrupted or terminated. </li> <li>
     *         <p><code>cancelled_terminating</code> - The Spot fleet is canceled and
     *         its Spot Instances are terminating. </li> <li> <p><code>expired</code>
     *         - The Spot fleet request has expired. A subsequent event indicates
     *         that the instances were terminated, if the request was created with
     *         <code>terminateInstancesWithExpiration</code> set. </li> <li>
     *         <p><code>price_update</code> - The bid price for a launch
     *         configuration was adjusted because it was too high. This change is
     *         permanent. </li> <li> <p><code>submitted</code> - The Spot fleet
     *         request is being evaluated and Amazon EC2 is preparing to launch the
     *         target number of Spot Instances. </li> </ul> <p>The following are the
     *         <code>instanceChange</code> events. <ul> <li> <p><code>launched</code>
     *         - A bid was fulfilled and a new instance was launched. </li> <li>
     *         <p><code>terminated</code> - An instance was terminated by the user.
     *         </li> </ul>
     */
    public String getEventSubType() {
        return eventSubType;
    }
    
    /**
     * The event. <p>The following are the <code>error</code> events. <ul>
     * <li> <p><code>iamFleetRoleInvalid</code> - Spot fleet did not have the
     * required permissions either to launch or terminate an instance. </li>
     * <li> <p><code>spotFleetRequestConfigurationInvalid</code> - The
     * configuration is not valid. For more information, see the description.
     * </li> <li> <p><code>spotInstanceCountLimitExceeded</code> - You've
     * reached the limit on the number of Spot Instances that you can launch.
     * </li> </ul> <p>The following are the <code>fleetRequestChange</code>
     * events. <ul> <li> <p><code>active</code> - The Spot fleet has been
     * validated and Amazon EC2 is attempting to maintain the target number
     * of running Spot Instances. </li> <li> <p><code>cancelled</code> - The
     * Spot fleet is canceled and has no running Spot Instances. The Spot
     * fleet will be deleted two days after its instances were terminated.
     * </li> <li> <p><code>cancelled_running</code> - The Spot fleet is
     * canceled and will not launch additional Spot Instances, but its
     * existing Spot Instances will continue to run until they are
     * interrupted or terminated. </li> <li>
     * <p><code>cancelled_terminating</code> - The Spot fleet is canceled and
     * its Spot Instances are terminating. </li> <li> <p><code>expired</code>
     * - The Spot fleet request has expired. A subsequent event indicates
     * that the instances were terminated, if the request was created with
     * <code>terminateInstancesWithExpiration</code> set. </li> <li>
     * <p><code>price_update</code> - The bid price for a launch
     * configuration was adjusted because it was too high. This change is
     * permanent. </li> <li> <p><code>submitted</code> - The Spot fleet
     * request is being evaluated and Amazon EC2 is preparing to launch the
     * target number of Spot Instances. </li> </ul> <p>The following are the
     * <code>instanceChange</code> events. <ul> <li> <p><code>launched</code>
     * - A bid was fulfilled and a new instance was launched. </li> <li>
     * <p><code>terminated</code> - An instance was terminated by the user.
     * </li> </ul>
     *
     * @param eventSubType The event. <p>The following are the <code>error</code> events. <ul>
     *         <li> <p><code>iamFleetRoleInvalid</code> - Spot fleet did not have the
     *         required permissions either to launch or terminate an instance. </li>
     *         <li> <p><code>spotFleetRequestConfigurationInvalid</code> - The
     *         configuration is not valid. For more information, see the description.
     *         </li> <li> <p><code>spotInstanceCountLimitExceeded</code> - You've
     *         reached the limit on the number of Spot Instances that you can launch.
     *         </li> </ul> <p>The following are the <code>fleetRequestChange</code>
     *         events. <ul> <li> <p><code>active</code> - The Spot fleet has been
     *         validated and Amazon EC2 is attempting to maintain the target number
     *         of running Spot Instances. </li> <li> <p><code>cancelled</code> - The
     *         Spot fleet is canceled and has no running Spot Instances. The Spot
     *         fleet will be deleted two days after its instances were terminated.
     *         </li> <li> <p><code>cancelled_running</code> - The Spot fleet is
     *         canceled and will not launch additional Spot Instances, but its
     *         existing Spot Instances will continue to run until they are
     *         interrupted or terminated. </li> <li>
     *         <p><code>cancelled_terminating</code> - The Spot fleet is canceled and
     *         its Spot Instances are terminating. </li> <li> <p><code>expired</code>
     *         - The Spot fleet request has expired. A subsequent event indicates
     *         that the instances were terminated, if the request was created with
     *         <code>terminateInstancesWithExpiration</code> set. </li> <li>
     *         <p><code>price_update</code> - The bid price for a launch
     *         configuration was adjusted because it was too high. This change is
     *         permanent. </li> <li> <p><code>submitted</code> - The Spot fleet
     *         request is being evaluated and Amazon EC2 is preparing to launch the
     *         target number of Spot Instances. </li> </ul> <p>The following are the
     *         <code>instanceChange</code> events. <ul> <li> <p><code>launched</code>
     *         - A bid was fulfilled and a new instance was launched. </li> <li>
     *         <p><code>terminated</code> - An instance was terminated by the user.
     *         </li> </ul>
     */
    public void setEventSubType(String eventSubType) {
        this.eventSubType = eventSubType;
    }
    
    /**
     * The event. <p>The following are the <code>error</code> events. <ul>
     * <li> <p><code>iamFleetRoleInvalid</code> - Spot fleet did not have the
     * required permissions either to launch or terminate an instance. </li>
     * <li> <p><code>spotFleetRequestConfigurationInvalid</code> - The
     * configuration is not valid. For more information, see the description.
     * </li> <li> <p><code>spotInstanceCountLimitExceeded</code> - You've
     * reached the limit on the number of Spot Instances that you can launch.
     * </li> </ul> <p>The following are the <code>fleetRequestChange</code>
     * events. <ul> <li> <p><code>active</code> - The Spot fleet has been
     * validated and Amazon EC2 is attempting to maintain the target number
     * of running Spot Instances. </li> <li> <p><code>cancelled</code> - The
     * Spot fleet is canceled and has no running Spot Instances. The Spot
     * fleet will be deleted two days after its instances were terminated.
     * </li> <li> <p><code>cancelled_running</code> - The Spot fleet is
     * canceled and will not launch additional Spot Instances, but its
     * existing Spot Instances will continue to run until they are
     * interrupted or terminated. </li> <li>
     * <p><code>cancelled_terminating</code> - The Spot fleet is canceled and
     * its Spot Instances are terminating. </li> <li> <p><code>expired</code>
     * - The Spot fleet request has expired. A subsequent event indicates
     * that the instances were terminated, if the request was created with
     * <code>terminateInstancesWithExpiration</code> set. </li> <li>
     * <p><code>price_update</code> - The bid price for a launch
     * configuration was adjusted because it was too high. This change is
     * permanent. </li> <li> <p><code>submitted</code> - The Spot fleet
     * request is being evaluated and Amazon EC2 is preparing to launch the
     * target number of Spot Instances. </li> </ul> <p>The following are the
     * <code>instanceChange</code> events. <ul> <li> <p><code>launched</code>
     * - A bid was fulfilled and a new instance was launched. </li> <li>
     * <p><code>terminated</code> - An instance was terminated by the user.
     * </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventSubType The event. <p>The following are the <code>error</code> events. <ul>
     *         <li> <p><code>iamFleetRoleInvalid</code> - Spot fleet did not have the
     *         required permissions either to launch or terminate an instance. </li>
     *         <li> <p><code>spotFleetRequestConfigurationInvalid</code> - The
     *         configuration is not valid. For more information, see the description.
     *         </li> <li> <p><code>spotInstanceCountLimitExceeded</code> - You've
     *         reached the limit on the number of Spot Instances that you can launch.
     *         </li> </ul> <p>The following are the <code>fleetRequestChange</code>
     *         events. <ul> <li> <p><code>active</code> - The Spot fleet has been
     *         validated and Amazon EC2 is attempting to maintain the target number
     *         of running Spot Instances. </li> <li> <p><code>cancelled</code> - The
     *         Spot fleet is canceled and has no running Spot Instances. The Spot
     *         fleet will be deleted two days after its instances were terminated.
     *         </li> <li> <p><code>cancelled_running</code> - The Spot fleet is
     *         canceled and will not launch additional Spot Instances, but its
     *         existing Spot Instances will continue to run until they are
     *         interrupted or terminated. </li> <li>
     *         <p><code>cancelled_terminating</code> - The Spot fleet is canceled and
     *         its Spot Instances are terminating. </li> <li> <p><code>expired</code>
     *         - The Spot fleet request has expired. A subsequent event indicates
     *         that the instances were terminated, if the request was created with
     *         <code>terminateInstancesWithExpiration</code> set. </li> <li>
     *         <p><code>price_update</code> - The bid price for a launch
     *         configuration was adjusted because it was too high. This change is
     *         permanent. </li> <li> <p><code>submitted</code> - The Spot fleet
     *         request is being evaluated and Amazon EC2 is preparing to launch the
     *         target number of Spot Instances. </li> </ul> <p>The following are the
     *         <code>instanceChange</code> events. <ul> <li> <p><code>launched</code>
     *         - A bid was fulfilled and a new instance was launched. </li> <li>
     *         <p><code>terminated</code> - An instance was terminated by the user.
     *         </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EventInformation withEventSubType(String eventSubType) {
        this.eventSubType = eventSubType;
        return this;
    }

    /**
     * The description of the event.
     *
     * @return The description of the event.
     */
    public String getEventDescription() {
        return eventDescription;
    }
    
    /**
     * The description of the event.
     *
     * @param eventDescription The description of the event.
     */
    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }
    
    /**
     * The description of the event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventDescription The description of the event.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EventInformation withEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getEventSubType() != null) sb.append("EventSubType: " + getEventSubType() + ",");
        if (getEventDescription() != null) sb.append("EventDescription: " + getEventDescription() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EventInformation == false) return false;
        EventInformation other = (EventInformation)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getEventSubType() == null ^ this.getEventSubType() == null) return false;
        if (other.getEventSubType() != null && other.getEventSubType().equals(this.getEventSubType()) == false) return false; 
        if (other.getEventDescription() == null ^ this.getEventDescription() == null) return false;
        if (other.getEventDescription() != null && other.getEventDescription().equals(this.getEventDescription()) == false) return false; 
        return true;
    }
    
    @Override
    public EventInformation clone() {
        try {
            return (EventInformation) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    