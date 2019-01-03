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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetCapacity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFleetCapacityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a fleet to update capacity for.
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
     * Minimum value allowed for the fleet's instance count. Default if not set is 0.
     * </p>
     */
    private Integer minSize;
    /**
     * <p>
     * Maximum value allowed for the fleet's instance count. Default if not set is 1.
     * </p>
     */
    private Integer maxSize;

    /**
     * <p>
     * Unique identifier for a fleet to update capacity for.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet to update capacity for.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet to update capacity for.
     * </p>
     * 
     * @return Unique identifier for a fleet to update capacity for.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet to update capacity for.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet to update capacity for.
     * @return Returns a reference to this object so that method calls can be chained together.
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetCapacityRequest withDesiredInstances(Integer desiredInstances) {
        setDesiredInstances(desiredInstances);
        return this;
    }

    /**
     * <p>
     * Minimum value allowed for the fleet's instance count. Default if not set is 0.
     * </p>
     * 
     * @param minSize
     *        Minimum value allowed for the fleet's instance count. Default if not set is 0.
     */

    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    /**
     * <p>
     * Minimum value allowed for the fleet's instance count. Default if not set is 0.
     * </p>
     * 
     * @return Minimum value allowed for the fleet's instance count. Default if not set is 0.
     */

    public Integer getMinSize() {
        return this.minSize;
    }

    /**
     * <p>
     * Minimum value allowed for the fleet's instance count. Default if not set is 0.
     * </p>
     * 
     * @param minSize
     *        Minimum value allowed for the fleet's instance count. Default if not set is 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetCapacityRequest withMinSize(Integer minSize) {
        setMinSize(minSize);
        return this;
    }

    /**
     * <p>
     * Maximum value allowed for the fleet's instance count. Default if not set is 1.
     * </p>
     * 
     * @param maxSize
     *        Maximum value allowed for the fleet's instance count. Default if not set is 1.
     */

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * <p>
     * Maximum value allowed for the fleet's instance count. Default if not set is 1.
     * </p>
     * 
     * @return Maximum value allowed for the fleet's instance count. Default if not set is 1.
     */

    public Integer getMaxSize() {
        return this.maxSize;
    }

    /**
     * <p>
     * Maximum value allowed for the fleet's instance count. Default if not set is 1.
     * </p>
     * 
     * @param maxSize
     *        Maximum value allowed for the fleet's instance count. Default if not set is 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetCapacityRequest withMaxSize(Integer maxSize) {
        setMaxSize(maxSize);
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getDesiredInstances() != null)
            sb.append("DesiredInstances: ").append(getDesiredInstances()).append(",");
        if (getMinSize() != null)
            sb.append("MinSize: ").append(getMinSize()).append(",");
        if (getMaxSize() != null)
            sb.append("MaxSize: ").append(getMaxSize());
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
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getDesiredInstances() == null ^ this.getDesiredInstances() == null)
            return false;
        if (other.getDesiredInstances() != null && other.getDesiredInstances().equals(this.getDesiredInstances()) == false)
            return false;
        if (other.getMinSize() == null ^ this.getMinSize() == null)
            return false;
        if (other.getMinSize() != null && other.getMinSize().equals(this.getMinSize()) == false)
            return false;
        if (other.getMaxSize() == null ^ this.getMaxSize() == null)
            return false;
        if (other.getMaxSize() != null && other.getMaxSize().equals(this.getMaxSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getDesiredInstances() == null) ? 0 : getDesiredInstances().hashCode());
        hashCode = prime * hashCode + ((getMinSize() == null) ? 0 : getMinSize().hashCode());
        hashCode = prime * hashCode + ((getMaxSize() == null) ? 0 : getMaxSize().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFleetCapacityRequest clone() {
        return (UpdateFleetCapacityRequest) super.clone();
    }

}
