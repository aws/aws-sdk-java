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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DetachInstances" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetachInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The IDs of the instances. You can specify up to 20 instances.
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
     * Indicates whether the Auto Scaling group decrements the desired capacity value by the number of instances
     * detached.
     * </p>
     */
    private Boolean shouldDecrementDesiredCapacity;

    /**
     * <p>
     * The IDs of the instances. You can specify up to 20 instances.
     * </p>
     * 
     * @return The IDs of the instances. You can specify up to 20 instances.
     */

    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
            instanceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceIds;
    }

    /**
     * <p>
     * The IDs of the instances. You can specify up to 20 instances.
     * </p>
     * 
     * @param instanceIds
     *        The IDs of the instances. You can specify up to 20 instances.
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
     * The IDs of the instances. You can specify up to 20 instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceIds(java.util.Collection)} or {@link #withInstanceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceIds
     *        The IDs of the instances. You can specify up to 20 instances.
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
     * The IDs of the instances. You can specify up to 20 instances.
     * </p>
     * 
     * @param instanceIds
     *        The IDs of the instances. You can specify up to 20 instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachInstancesRequest withInstanceIds(java.util.Collection<String> instanceIds) {
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

    public DetachInstancesRequest withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * Indicates whether the Auto Scaling group decrements the desired capacity value by the number of instances
     * detached.
     * </p>
     * 
     * @param shouldDecrementDesiredCapacity
     *        Indicates whether the Auto Scaling group decrements the desired capacity value by the number of instances
     *        detached.
     */

    public void setShouldDecrementDesiredCapacity(Boolean shouldDecrementDesiredCapacity) {
        this.shouldDecrementDesiredCapacity = shouldDecrementDesiredCapacity;
    }

    /**
     * <p>
     * Indicates whether the Auto Scaling group decrements the desired capacity value by the number of instances
     * detached.
     * </p>
     * 
     * @return Indicates whether the Auto Scaling group decrements the desired capacity value by the number of instances
     *         detached.
     */

    public Boolean getShouldDecrementDesiredCapacity() {
        return this.shouldDecrementDesiredCapacity;
    }

    /**
     * <p>
     * Indicates whether the Auto Scaling group decrements the desired capacity value by the number of instances
     * detached.
     * </p>
     * 
     * @param shouldDecrementDesiredCapacity
     *        Indicates whether the Auto Scaling group decrements the desired capacity value by the number of instances
     *        detached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachInstancesRequest withShouldDecrementDesiredCapacity(Boolean shouldDecrementDesiredCapacity) {
        setShouldDecrementDesiredCapacity(shouldDecrementDesiredCapacity);
        return this;
    }

    /**
     * <p>
     * Indicates whether the Auto Scaling group decrements the desired capacity value by the number of instances
     * detached.
     * </p>
     * 
     * @return Indicates whether the Auto Scaling group decrements the desired capacity value by the number of instances
     *         detached.
     */

    public Boolean isShouldDecrementDesiredCapacity() {
        return this.shouldDecrementDesiredCapacity;
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
        if (getInstanceIds() != null)
            sb.append("InstanceIds: ").append(getInstanceIds()).append(",");
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: ").append(getAutoScalingGroupName()).append(",");
        if (getShouldDecrementDesiredCapacity() != null)
            sb.append("ShouldDecrementDesiredCapacity: ").append(getShouldDecrementDesiredCapacity());
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
