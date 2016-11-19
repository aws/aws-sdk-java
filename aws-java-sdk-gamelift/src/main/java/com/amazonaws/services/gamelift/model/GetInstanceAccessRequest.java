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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class GetInstanceAccessRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a fleet. Specify the fleet that contain the instance you want access to. The fleet can be
     * in any of the following statuses: ACTIVATING, ACTIVE, or ERROR. Fleets with an ERROR status can be accessed for a
     * few hours before being deleted.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * Unique identifier for an instance. Specify the instance you want to get access to. You can access an instance in
     * any status.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * Unique identifier for a fleet. Specify the fleet that contain the instance you want access to. The fleet can be
     * in any of the following statuses: ACTIVATING, ACTIVE, or ERROR. Fleets with an ERROR status can be accessed for a
     * few hours before being deleted.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet. Specify the fleet that contain the instance you want access to. The fleet
     *        can be in any of the following statuses: ACTIVATING, ACTIVE, or ERROR. Fleets with an ERROR status can be
     *        accessed for a few hours before being deleted.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet. Specify the fleet that contain the instance you want access to. The fleet can be
     * in any of the following statuses: ACTIVATING, ACTIVE, or ERROR. Fleets with an ERROR status can be accessed for a
     * few hours before being deleted.
     * </p>
     * 
     * @return Unique identifier for a fleet. Specify the fleet that contain the instance you want access to. The fleet
     *         can be in any of the following statuses: ACTIVATING, ACTIVE, or ERROR. Fleets with an ERROR status can be
     *         accessed for a few hours before being deleted.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet. Specify the fleet that contain the instance you want access to. The fleet can be
     * in any of the following statuses: ACTIVATING, ACTIVE, or ERROR. Fleets with an ERROR status can be accessed for a
     * few hours before being deleted.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet. Specify the fleet that contain the instance you want access to. The fleet
     *        can be in any of the following statuses: ACTIVATING, ACTIVE, or ERROR. Fleets with an ERROR status can be
     *        accessed for a few hours before being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceAccessRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for an instance. Specify the instance you want to get access to. You can access an instance in
     * any status.
     * </p>
     * 
     * @param instanceId
     *        Unique identifier for an instance. Specify the instance you want to get access to. You can access an
     *        instance in any status.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * Unique identifier for an instance. Specify the instance you want to get access to. You can access an instance in
     * any status.
     * </p>
     * 
     * @return Unique identifier for an instance. Specify the instance you want to get access to. You can access an
     *         instance in any status.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * Unique identifier for an instance. Specify the instance you want to get access to. You can access an instance in
     * any status.
     * </p>
     * 
     * @param instanceId
     *        Unique identifier for an instance. Specify the instance you want to get access to. You can access an
     *        instance in any status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceAccessRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
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
        if (getFleetId() != null)
            sb.append("FleetId: " + getFleetId() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstanceAccessRequest == false)
            return false;
        GetInstanceAccessRequest other = (GetInstanceAccessRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
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

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public GetInstanceAccessRequest clone() {
        return (GetInstanceAccessRequest) super.clone();
    }
}
