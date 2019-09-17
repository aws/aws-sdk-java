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
package com.amazonaws.services.applicationautoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies whether the scaling activities for a scalable target are in a suspended state.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/SuspendedState"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuspendedState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether scale in by a target tracking scaling policy or a step scaling policy is suspended. Set the value to
     * <code>true</code> if you don't want Application Auto Scaling to remove capacity when a scaling policy is
     * triggered. The default is <code>false</code>.
     * </p>
     */
    private Boolean dynamicScalingInSuspended;
    /**
     * <p>
     * Whether scale out by a target tracking scaling policy or a step scaling policy is suspended. Set the value to
     * <code>true</code> if you don't want Application Auto Scaling to add capacity when a scaling policy is triggered.
     * The default is <code>false</code>.
     * </p>
     */
    private Boolean dynamicScalingOutSuspended;
    /**
     * <p>
     * Whether scheduled scaling is suspended. Set the value to <code>true</code> if you don't want Application Auto
     * Scaling to add or remove capacity by initiating scheduled actions. The default is <code>false</code>.
     * </p>
     */
    private Boolean scheduledScalingSuspended;

    /**
     * <p>
     * Whether scale in by a target tracking scaling policy or a step scaling policy is suspended. Set the value to
     * <code>true</code> if you don't want Application Auto Scaling to remove capacity when a scaling policy is
     * triggered. The default is <code>false</code>.
     * </p>
     * 
     * @param dynamicScalingInSuspended
     *        Whether scale in by a target tracking scaling policy or a step scaling policy is suspended. Set the value
     *        to <code>true</code> if you don't want Application Auto Scaling to remove capacity when a scaling policy
     *        is triggered. The default is <code>false</code>.
     */

    public void setDynamicScalingInSuspended(Boolean dynamicScalingInSuspended) {
        this.dynamicScalingInSuspended = dynamicScalingInSuspended;
    }

    /**
     * <p>
     * Whether scale in by a target tracking scaling policy or a step scaling policy is suspended. Set the value to
     * <code>true</code> if you don't want Application Auto Scaling to remove capacity when a scaling policy is
     * triggered. The default is <code>false</code>.
     * </p>
     * 
     * @return Whether scale in by a target tracking scaling policy or a step scaling policy is suspended. Set the value
     *         to <code>true</code> if you don't want Application Auto Scaling to remove capacity when a scaling policy
     *         is triggered. The default is <code>false</code>.
     */

    public Boolean getDynamicScalingInSuspended() {
        return this.dynamicScalingInSuspended;
    }

    /**
     * <p>
     * Whether scale in by a target tracking scaling policy or a step scaling policy is suspended. Set the value to
     * <code>true</code> if you don't want Application Auto Scaling to remove capacity when a scaling policy is
     * triggered. The default is <code>false</code>.
     * </p>
     * 
     * @param dynamicScalingInSuspended
     *        Whether scale in by a target tracking scaling policy or a step scaling policy is suspended. Set the value
     *        to <code>true</code> if you don't want Application Auto Scaling to remove capacity when a scaling policy
     *        is triggered. The default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuspendedState withDynamicScalingInSuspended(Boolean dynamicScalingInSuspended) {
        setDynamicScalingInSuspended(dynamicScalingInSuspended);
        return this;
    }

    /**
     * <p>
     * Whether scale in by a target tracking scaling policy or a step scaling policy is suspended. Set the value to
     * <code>true</code> if you don't want Application Auto Scaling to remove capacity when a scaling policy is
     * triggered. The default is <code>false</code>.
     * </p>
     * 
     * @return Whether scale in by a target tracking scaling policy or a step scaling policy is suspended. Set the value
     *         to <code>true</code> if you don't want Application Auto Scaling to remove capacity when a scaling policy
     *         is triggered. The default is <code>false</code>.
     */

    public Boolean isDynamicScalingInSuspended() {
        return this.dynamicScalingInSuspended;
    }

    /**
     * <p>
     * Whether scale out by a target tracking scaling policy or a step scaling policy is suspended. Set the value to
     * <code>true</code> if you don't want Application Auto Scaling to add capacity when a scaling policy is triggered.
     * The default is <code>false</code>.
     * </p>
     * 
     * @param dynamicScalingOutSuspended
     *        Whether scale out by a target tracking scaling policy or a step scaling policy is suspended. Set the value
     *        to <code>true</code> if you don't want Application Auto Scaling to add capacity when a scaling policy is
     *        triggered. The default is <code>false</code>.
     */

    public void setDynamicScalingOutSuspended(Boolean dynamicScalingOutSuspended) {
        this.dynamicScalingOutSuspended = dynamicScalingOutSuspended;
    }

    /**
     * <p>
     * Whether scale out by a target tracking scaling policy or a step scaling policy is suspended. Set the value to
     * <code>true</code> if you don't want Application Auto Scaling to add capacity when a scaling policy is triggered.
     * The default is <code>false</code>.
     * </p>
     * 
     * @return Whether scale out by a target tracking scaling policy or a step scaling policy is suspended. Set the
     *         value to <code>true</code> if you don't want Application Auto Scaling to add capacity when a scaling
     *         policy is triggered. The default is <code>false</code>.
     */

    public Boolean getDynamicScalingOutSuspended() {
        return this.dynamicScalingOutSuspended;
    }

    /**
     * <p>
     * Whether scale out by a target tracking scaling policy or a step scaling policy is suspended. Set the value to
     * <code>true</code> if you don't want Application Auto Scaling to add capacity when a scaling policy is triggered.
     * The default is <code>false</code>.
     * </p>
     * 
     * @param dynamicScalingOutSuspended
     *        Whether scale out by a target tracking scaling policy or a step scaling policy is suspended. Set the value
     *        to <code>true</code> if you don't want Application Auto Scaling to add capacity when a scaling policy is
     *        triggered. The default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuspendedState withDynamicScalingOutSuspended(Boolean dynamicScalingOutSuspended) {
        setDynamicScalingOutSuspended(dynamicScalingOutSuspended);
        return this;
    }

    /**
     * <p>
     * Whether scale out by a target tracking scaling policy or a step scaling policy is suspended. Set the value to
     * <code>true</code> if you don't want Application Auto Scaling to add capacity when a scaling policy is triggered.
     * The default is <code>false</code>.
     * </p>
     * 
     * @return Whether scale out by a target tracking scaling policy or a step scaling policy is suspended. Set the
     *         value to <code>true</code> if you don't want Application Auto Scaling to add capacity when a scaling
     *         policy is triggered. The default is <code>false</code>.
     */

    public Boolean isDynamicScalingOutSuspended() {
        return this.dynamicScalingOutSuspended;
    }

    /**
     * <p>
     * Whether scheduled scaling is suspended. Set the value to <code>true</code> if you don't want Application Auto
     * Scaling to add or remove capacity by initiating scheduled actions. The default is <code>false</code>.
     * </p>
     * 
     * @param scheduledScalingSuspended
     *        Whether scheduled scaling is suspended. Set the value to <code>true</code> if you don't want Application
     *        Auto Scaling to add or remove capacity by initiating scheduled actions. The default is <code>false</code>.
     */

    public void setScheduledScalingSuspended(Boolean scheduledScalingSuspended) {
        this.scheduledScalingSuspended = scheduledScalingSuspended;
    }

    /**
     * <p>
     * Whether scheduled scaling is suspended. Set the value to <code>true</code> if you don't want Application Auto
     * Scaling to add or remove capacity by initiating scheduled actions. The default is <code>false</code>.
     * </p>
     * 
     * @return Whether scheduled scaling is suspended. Set the value to <code>true</code> if you don't want Application
     *         Auto Scaling to add or remove capacity by initiating scheduled actions. The default is <code>false</code>
     *         .
     */

    public Boolean getScheduledScalingSuspended() {
        return this.scheduledScalingSuspended;
    }

    /**
     * <p>
     * Whether scheduled scaling is suspended. Set the value to <code>true</code> if you don't want Application Auto
     * Scaling to add or remove capacity by initiating scheduled actions. The default is <code>false</code>.
     * </p>
     * 
     * @param scheduledScalingSuspended
     *        Whether scheduled scaling is suspended. Set the value to <code>true</code> if you don't want Application
     *        Auto Scaling to add or remove capacity by initiating scheduled actions. The default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuspendedState withScheduledScalingSuspended(Boolean scheduledScalingSuspended) {
        setScheduledScalingSuspended(scheduledScalingSuspended);
        return this;
    }

    /**
     * <p>
     * Whether scheduled scaling is suspended. Set the value to <code>true</code> if you don't want Application Auto
     * Scaling to add or remove capacity by initiating scheduled actions. The default is <code>false</code>.
     * </p>
     * 
     * @return Whether scheduled scaling is suspended. Set the value to <code>true</code> if you don't want Application
     *         Auto Scaling to add or remove capacity by initiating scheduled actions. The default is <code>false</code>
     *         .
     */

    public Boolean isScheduledScalingSuspended() {
        return this.scheduledScalingSuspended;
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
        if (getDynamicScalingInSuspended() != null)
            sb.append("DynamicScalingInSuspended: ").append(getDynamicScalingInSuspended()).append(",");
        if (getDynamicScalingOutSuspended() != null)
            sb.append("DynamicScalingOutSuspended: ").append(getDynamicScalingOutSuspended()).append(",");
        if (getScheduledScalingSuspended() != null)
            sb.append("ScheduledScalingSuspended: ").append(getScheduledScalingSuspended());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuspendedState == false)
            return false;
        SuspendedState other = (SuspendedState) obj;
        if (other.getDynamicScalingInSuspended() == null ^ this.getDynamicScalingInSuspended() == null)
            return false;
        if (other.getDynamicScalingInSuspended() != null && other.getDynamicScalingInSuspended().equals(this.getDynamicScalingInSuspended()) == false)
            return false;
        if (other.getDynamicScalingOutSuspended() == null ^ this.getDynamicScalingOutSuspended() == null)
            return false;
        if (other.getDynamicScalingOutSuspended() != null && other.getDynamicScalingOutSuspended().equals(this.getDynamicScalingOutSuspended()) == false)
            return false;
        if (other.getScheduledScalingSuspended() == null ^ this.getScheduledScalingSuspended() == null)
            return false;
        if (other.getScheduledScalingSuspended() != null && other.getScheduledScalingSuspended().equals(this.getScheduledScalingSuspended()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDynamicScalingInSuspended() == null) ? 0 : getDynamicScalingInSuspended().hashCode());
        hashCode = prime * hashCode + ((getDynamicScalingOutSuspended() == null) ? 0 : getDynamicScalingOutSuspended().hashCode());
        hashCode = prime * hashCode + ((getScheduledScalingSuspended() == null) ? 0 : getScheduledScalingSuspended().hashCode());
        return hashCode;
    }

    @Override
    public SuspendedState clone() {
        try {
            return (SuspendedState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationautoscaling.model.transform.SuspendedStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
