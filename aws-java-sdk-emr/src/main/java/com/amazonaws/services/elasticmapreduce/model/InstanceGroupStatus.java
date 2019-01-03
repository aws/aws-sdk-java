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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the instance group status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/InstanceGroupStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceGroupStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current state of the instance group.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The status change reason details for the instance group.
     * </p>
     */
    private InstanceGroupStateChangeReason stateChangeReason;
    /**
     * <p>
     * The timeline of the instance group status over time.
     * </p>
     */
    private InstanceGroupTimeline timeline;

    /**
     * <p>
     * The current state of the instance group.
     * </p>
     * 
     * @param state
     *        The current state of the instance group.
     * @see InstanceGroupState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the instance group.
     * </p>
     * 
     * @return The current state of the instance group.
     * @see InstanceGroupState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the instance group.
     * </p>
     * 
     * @param state
     *        The current state of the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceGroupState
     */

    public InstanceGroupStatus withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the instance group.
     * </p>
     * 
     * @param state
     *        The current state of the instance group.
     * @see InstanceGroupState
     */

    public void setState(InstanceGroupState state) {
        withState(state);
    }

    /**
     * <p>
     * The current state of the instance group.
     * </p>
     * 
     * @param state
     *        The current state of the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceGroupState
     */

    public InstanceGroupStatus withState(InstanceGroupState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The status change reason details for the instance group.
     * </p>
     * 
     * @param stateChangeReason
     *        The status change reason details for the instance group.
     */

    public void setStateChangeReason(InstanceGroupStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
    }

    /**
     * <p>
     * The status change reason details for the instance group.
     * </p>
     * 
     * @return The status change reason details for the instance group.
     */

    public InstanceGroupStateChangeReason getStateChangeReason() {
        return this.stateChangeReason;
    }

    /**
     * <p>
     * The status change reason details for the instance group.
     * </p>
     * 
     * @param stateChangeReason
     *        The status change reason details for the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupStatus withStateChangeReason(InstanceGroupStateChangeReason stateChangeReason) {
        setStateChangeReason(stateChangeReason);
        return this;
    }

    /**
     * <p>
     * The timeline of the instance group status over time.
     * </p>
     * 
     * @param timeline
     *        The timeline of the instance group status over time.
     */

    public void setTimeline(InstanceGroupTimeline timeline) {
        this.timeline = timeline;
    }

    /**
     * <p>
     * The timeline of the instance group status over time.
     * </p>
     * 
     * @return The timeline of the instance group status over time.
     */

    public InstanceGroupTimeline getTimeline() {
        return this.timeline;
    }

    /**
     * <p>
     * The timeline of the instance group status over time.
     * </p>
     * 
     * @param timeline
     *        The timeline of the instance group status over time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupStatus withTimeline(InstanceGroupTimeline timeline) {
        setTimeline(timeline);
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
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateChangeReason() != null)
            sb.append("StateChangeReason: ").append(getStateChangeReason()).append(",");
        if (getTimeline() != null)
            sb.append("Timeline: ").append(getTimeline());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceGroupStatus == false)
            return false;
        InstanceGroupStatus other = (InstanceGroupStatus) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateChangeReason() == null ^ this.getStateChangeReason() == null)
            return false;
        if (other.getStateChangeReason() != null && other.getStateChangeReason().equals(this.getStateChangeReason()) == false)
            return false;
        if (other.getTimeline() == null ^ this.getTimeline() == null)
            return false;
        if (other.getTimeline() != null && other.getTimeline().equals(this.getTimeline()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateChangeReason() == null) ? 0 : getStateChangeReason().hashCode());
        hashCode = prime * hashCode + ((getTimeline() == null) ? 0 : getTimeline().hashCode());
        return hashCode;
    }

    @Override
    public InstanceGroupStatus clone() {
        try {
            return (InstanceGroupStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.InstanceGroupStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
