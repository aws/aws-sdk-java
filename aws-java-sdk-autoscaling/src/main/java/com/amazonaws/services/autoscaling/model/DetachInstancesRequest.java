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
 * Contains the parameters for DetachInstances.
 * </p>
 */
public class DetachInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * One or more instance IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceIds;
    /**
     * <p>
     * The name of the group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * If <code>True</code>, the Auto Scaling group decrements the desired capacity value by the number of instances
     * detached.
     * </p>
     */
    private Boolean shouldDecrementDesiredCapacity;

    /**
     * <p>
     * One or more instance IDs.
     * </p>
     * 
     * @return One or more instance IDs.
     */

    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
            instanceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceIds;
    }

    /**
     * <p>
     * One or more instance IDs.
     * </p>
     * 
     * @param instanceIds
     *        One or more instance IDs.
     */

    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new com.amazonaws.internal.SdkInternalList<String>(instanceIds);
    }

    /**
     * <p>
     * One or more instance IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceIds(java.util.Collection)} or {@link #withInstanceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceIds
     *        One or more instance IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachInstancesRequest withInstanceIds(String... instanceIds) {
        if (this.instanceIds == null) {
            setInstanceIds(new com.amazonaws.internal.SdkInternalList<String>(instanceIds.length));
        }
        for (String ele : instanceIds) {
            this.instanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more instance IDs.
     * </p>
     * 
     * @param instanceIds
     *        One or more instance IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachInstancesRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the group.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @return The name of the group.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachInstancesRequest withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * If <code>True</code>, the Auto Scaling group decrements the desired capacity value by the number of instances
     * detached.
     * </p>
     * 
     * @param shouldDecrementDesiredCapacity
     *        If <code>True</code>, the Auto Scaling group decrements the desired capacity value by the number of
     *        instances detached.
     */

    public void setShouldDecrementDesiredCapacity(Boolean shouldDecrementDesiredCapacity) {
        this.shouldDecrementDesiredCapacity = shouldDecrementDesiredCapacity;
    }

    /**
     * <p>
     * If <code>True</code>, the Auto Scaling group decrements the desired capacity value by the number of instances
     * detached.
     * </p>
     * 
     * @return If <code>True</code>, the Auto Scaling group decrements the desired capacity value by the number of
     *         instances detached.
     */

    public Boolean getShouldDecrementDesiredCapacity() {
        return this.shouldDecrementDesiredCapacity;
    }

    /**
     * <p>
     * If <code>True</code>, the Auto Scaling group decrements the desired capacity value by the number of instances
     * detached.
     * </p>
     * 
     * @param shouldDecrementDesiredCapacity
     *        If <code>True</code>, the Auto Scaling group decrements the desired capacity value by the number of
     *        instances detached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachInstancesRequest withShouldDecrementDesiredCapacity(Boolean shouldDecrementDesiredCapacity) {
        setShouldDecrementDesiredCapacity(shouldDecrementDesiredCapacity);
        return this;
    }

    /**
     * <p>
     * If <code>True</code>, the Auto Scaling group decrements the desired capacity value by the number of instances
     * detached.
     * </p>
     * 
     * @return If <code>True</code>, the Auto Scaling group decrements the desired capacity value by the number of
     *         instances detached.
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
        if (getInstanceIds() != null)
            sb.append("InstanceIds: " + getInstanceIds() + ",");
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
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

        if (obj instanceof DetachInstancesRequest == false)
            return false;
        DetachInstancesRequest other = (DetachInstancesRequest) obj;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
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

        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getShouldDecrementDesiredCapacity() == null) ? 0 : getShouldDecrementDesiredCapacity().hashCode());
        return hashCode;
    }

    @Override
    public DetachInstancesRequest clone() {
        return (DetachInstancesRequest) super.clone();
    }
}
