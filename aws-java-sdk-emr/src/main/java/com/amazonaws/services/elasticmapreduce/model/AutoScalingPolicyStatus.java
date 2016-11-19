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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * The status of an automatic scaling policy.
 * </p>
 */
public class AutoScalingPolicyStatus implements Serializable, Cloneable {

    /**
     * <p>
     * </p>
     */
    private String state;
    /**
     * <p>
     * The reason for a change in status.
     * </p>
     */
    private AutoScalingPolicyStateChangeReason stateChangeReason;

    /**
     * <p>
     * </p>
     * 
     * @param state
     * @see AutoScalingPolicyState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     * @see AutoScalingPolicyState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * </p>
     * 
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoScalingPolicyState
     */

    public AutoScalingPolicyStatus withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param state
     * @see AutoScalingPolicyState
     */

    public void setState(AutoScalingPolicyState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * </p>
     * 
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoScalingPolicyState
     */

    public AutoScalingPolicyStatus withState(AutoScalingPolicyState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The reason for a change in status.
     * </p>
     * 
     * @param stateChangeReason
     *        The reason for a change in status.
     */

    public void setStateChangeReason(AutoScalingPolicyStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
    }

    /**
     * <p>
     * The reason for a change in status.
     * </p>
     * 
     * @return The reason for a change in status.
     */

    public AutoScalingPolicyStateChangeReason getStateChangeReason() {
        return this.stateChangeReason;
    }

    /**
     * <p>
     * The reason for a change in status.
     * </p>
     * 
     * @param stateChangeReason
     *        The reason for a change in status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingPolicyStatus withStateChangeReason(AutoScalingPolicyStateChangeReason stateChangeReason) {
        setStateChangeReason(stateChangeReason);
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
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getStateChangeReason() != null)
            sb.append("StateChangeReason: " + getStateChangeReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingPolicyStatus == false)
            return false;
        AutoScalingPolicyStatus other = (AutoScalingPolicyStatus) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateChangeReason() == null ^ this.getStateChangeReason() == null)
            return false;
        if (other.getStateChangeReason() != null && other.getStateChangeReason().equals(this.getStateChangeReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateChangeReason() == null) ? 0 : getStateChangeReason().hashCode());
        return hashCode;
    }

    @Override
    public AutoScalingPolicyStatus clone() {
        try {
            return (AutoScalingPolicyStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
