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
 * Contains the parameters for EnteStandby.
 * </p>
 */
public class EnterStandbyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * One or more instances to move into <code>Standby</code> mode. You must specify at least one instance ID.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceIds;
    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * Specifies whether the instances moved to <code>Standby</code> mode count as part of the Auto Scaling group's
     * desired capacity. If set, the desired capacity for the Auto Scaling group decrements by the number of instances
     * moved to <code>Standby</code> mode.
     * </p>
     */
    private Boolean shouldDecrementDesiredCapacity;

    /**
     * <p>
     * One or more instances to move into <code>Standby</code> mode. You must specify at least one instance ID.
     * </p>
     * 
     * @return One or more instances to move into <code>Standby</code> mode. You must specify at least one instance ID.
     */

    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
            instanceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceIds;
    }

    /**
     * <p>
     * One or more instances to move into <code>Standby</code> mode. You must specify at least one instance ID.
     * </p>
     * 
     * @param instanceIds
     *        One or more instances to move into <code>Standby</code> mode. You must specify at least one instance ID.
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
     * One or more instances to move into <code>Standby</code> mode. You must specify at least one instance ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceIds(java.util.Collection)} or {@link #withInstanceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceIds
     *        One or more instances to move into <code>Standby</code> mode. You must specify at least one instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnterStandbyRequest withInstanceIds(String... instanceIds) {
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
     * One or more instances to move into <code>Standby</code> mode. You must specify at least one instance ID.
     * </p>
     * 
     * @param instanceIds
     *        One or more instances to move into <code>Standby</code> mode. You must specify at least one instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnterStandbyRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @return The name of the Auto Scaling group.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnterStandbyRequest withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * Specifies whether the instances moved to <code>Standby</code> mode count as part of the Auto Scaling group's
     * desired capacity. If set, the desired capacity for the Auto Scaling group decrements by the number of instances
     * moved to <code>Standby</code> mode.
     * </p>
     * 
     * @param shouldDecrementDesiredCapacity
     *        Specifies whether the instances moved to <code>Standby</code> mode count as part of the Auto Scaling
     *        group's desired capacity. If set, the desired capacity for the Auto Scaling group decrements by the number
     *        of instances moved to <code>Standby</code> mode.
     */

    public void setShouldDecrementDesiredCapacity(Boolean shouldDecrementDesiredCapacity) {
        this.shouldDecrementDesiredCapacity = shouldDecrementDesiredCapacity;
    }

    /**
     * <p>
     * Specifies whether the instances moved to <code>Standby</code> mode count as part of the Auto Scaling group's
     * desired capacity. If set, the desired capacity for the Auto Scaling group decrements by the number of instances
     * moved to <code>Standby</code> mode.
     * </p>
     * 
     * @return Specifies whether the instances moved to <code>Standby</code> mode count as part of the Auto Scaling
     *         group's desired capacity. If set, the desired capacity for the Auto Scaling group decrements by the
     *         number of instances moved to <code>Standby</code> mode.
     */

    public Boolean getShouldDecrementDesiredCapacity() {
        return this.shouldDecrementDesiredCapacity;
    }

    /**
     * <p>
     * Specifies whether the instances moved to <code>Standby</code> mode count as part of the Auto Scaling group's
     * desired capacity. If set, the desired capacity for the Auto Scaling group decrements by the number of instances
     * moved to <code>Standby</code> mode.
     * </p>
     * 
     * @param shouldDecrementDesiredCapacity
     *        Specifies whether the instances moved to <code>Standby</code> mode count as part of the Auto Scaling
     *        group's desired capacity. If set, the desired capacity for the Auto Scaling group decrements by the number
     *        of instances moved to <code>Standby</code> mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnterStandbyRequest withShouldDecrementDesiredCapacity(Boolean shouldDecrementDesiredCapacity) {
        setShouldDecrementDesiredCapacity(shouldDecrementDesiredCapacity);
        return this;
    }

    /**
     * <p>
     * Specifies whether the instances moved to <code>Standby</code> mode count as part of the Auto Scaling group's
     * desired capacity. If set, the desired capacity for the Auto Scaling group decrements by the number of instances
     * moved to <code>Standby</code> mode.
     * </p>
     * 
     * @return Specifies whether the instances moved to <code>Standby</code> mode count as part of the Auto Scaling
     *         group's desired capacity. If set, the desired capacity for the Auto Scaling group decrements by the
     *         number of instances moved to <code>Standby</code> mode.
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

        if (obj instanceof EnterStandbyRequest == false)
            return false;
        EnterStandbyRequest other = (EnterStandbyRequest) obj;
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
    public EnterStandbyRequest clone() {
        return (EnterStandbyRequest) super.clone();
    }
}
