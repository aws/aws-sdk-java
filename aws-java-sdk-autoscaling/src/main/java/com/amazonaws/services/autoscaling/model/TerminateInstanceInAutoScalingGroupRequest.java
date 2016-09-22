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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for TerminateInstanceInAutoScalingGroup.
 * </p>
 */
public class TerminateInstanceInAutoScalingGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * If <code>true</code>, terminating the instance also decrements the size of the Auto Scaling group.
     * </p>
     */
    private Boolean shouldDecrementDesiredCapacity;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateInstanceInAutoScalingGroupRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, terminating the instance also decrements the size of the Auto Scaling group.
     * </p>
     * 
     * @param shouldDecrementDesiredCapacity
     *        If <code>true</code>, terminating the instance also decrements the size of the Auto Scaling group.
     */

    public void setShouldDecrementDesiredCapacity(Boolean shouldDecrementDesiredCapacity) {
        this.shouldDecrementDesiredCapacity = shouldDecrementDesiredCapacity;
    }

    /**
     * <p>
     * If <code>true</code>, terminating the instance also decrements the size of the Auto Scaling group.
     * </p>
     * 
     * @return If <code>true</code>, terminating the instance also decrements the size of the Auto Scaling group.
     */

    public Boolean getShouldDecrementDesiredCapacity() {
        return this.shouldDecrementDesiredCapacity;
    }

    /**
     * <p>
     * If <code>true</code>, terminating the instance also decrements the size of the Auto Scaling group.
     * </p>
     * 
     * @param shouldDecrementDesiredCapacity
     *        If <code>true</code>, terminating the instance also decrements the size of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateInstanceInAutoScalingGroupRequest withShouldDecrementDesiredCapacity(Boolean shouldDecrementDesiredCapacity) {
        setShouldDecrementDesiredCapacity(shouldDecrementDesiredCapacity);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, terminating the instance also decrements the size of the Auto Scaling group.
     * </p>
     * 
     * @return If <code>true</code>, terminating the instance also decrements the size of the Auto Scaling group.
     */

    public Boolean isShouldDecrementDesiredCapacity() {
        return this.shouldDecrementDesiredCapacity;
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
        if (getShouldDecrementDesiredCapacity() != null)
            sb.append("ShouldDecrementDesiredCapacity: " + getShouldDecrementDesiredCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminateInstanceInAutoScalingGroupRequest == false)
            return false;
        TerminateInstanceInAutoScalingGroupRequest other = (TerminateInstanceInAutoScalingGroupRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getShouldDecrementDesiredCapacity() == null ^ this.getShouldDecrementDesiredCapacity() == null)
            return false;
        if (other.getShouldDecrementDesiredCapacity() != null
                && other.getShouldDecrementDesiredCapacity().equals(this.getShouldDecrementDesiredCapacity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getShouldDecrementDesiredCapacity() == null) ? 0 : getShouldDecrementDesiredCapacity().hashCode());
        return hashCode;
    }

    @Override
    public TerminateInstanceInAutoScalingGroupRequest clone() {
        return (TerminateInstanceInAutoScalingGroupRequest) super.clone();
    }
}
