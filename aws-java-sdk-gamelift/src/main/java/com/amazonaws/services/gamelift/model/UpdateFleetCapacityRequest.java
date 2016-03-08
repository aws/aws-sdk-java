/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 */
public class UpdateFleetCapacityRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for the fleet you want to update capacity for.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * Number of EC2 instances you want this fleet to host.
     * </p>
     */
    private Integer desiredInstances;

    /**
     * <p>
     * Unique identifier for the fleet you want to update capacity for.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for the fleet you want to update capacity for.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for the fleet you want to update capacity for.
     * </p>
     * 
     * @return Unique identifier for the fleet you want to update capacity for.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for the fleet you want to update capacity for.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for the fleet you want to update capacity for.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateFleetCapacityRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * Number of EC2 instances you want this fleet to host.
     * </p>
     * 
     * @param desiredInstances
     *        Number of EC2 instances you want this fleet to host.
     */

    public void setDesiredInstances(Integer desiredInstances) {
        this.desiredInstances = desiredInstances;
    }

    /**
     * <p>
     * Number of EC2 instances you want this fleet to host.
     * </p>
     * 
     * @return Number of EC2 instances you want this fleet to host.
     */

    public Integer getDesiredInstances() {
        return this.desiredInstances;
    }

    /**
     * <p>
     * Number of EC2 instances you want this fleet to host.
     * </p>
     * 
     * @param desiredInstances
     *        Number of EC2 instances you want this fleet to host.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateFleetCapacityRequest withDesiredInstances(
            Integer desiredInstances) {
        setDesiredInstances(desiredInstances);
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
        if (getFleetId() != null)
            sb.append("FleetId: " + getFleetId() + ",");
        if (getDesiredInstances() != null)
            sb.append("DesiredInstances: " + getDesiredInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFleetCapacityRequest == false)
            return false;
        UpdateFleetCapacityRequest other = (UpdateFleetCapacityRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null
                && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getDesiredInstances() == null
                ^ this.getDesiredInstances() == null)
            return false;
        if (other.getDesiredInstances() != null
                && other.getDesiredInstances().equals(
                        this.getDesiredInstances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime
                * hashCode
                + ((getDesiredInstances() == null) ? 0 : getDesiredInstances()
                        .hashCode());
        return hashCode;
    }

    @Override
    public UpdateFleetCapacityRequest clone() {
        return (UpdateFleetCapacityRequest) super.clone();
    }
}