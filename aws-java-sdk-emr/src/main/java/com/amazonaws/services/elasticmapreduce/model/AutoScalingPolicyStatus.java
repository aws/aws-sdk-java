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
 * The status of an automatic scaling policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/AutoScalingPolicyStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoScalingPolicyStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the status of the automatic scaling policy.
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
     * Indicates the status of the automatic scaling policy.
     * </p>
     * 
     * @param state
     *        Indicates the status of the automatic scaling policy.
     * @see AutoScalingPolicyState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Indicates the status of the automatic scaling policy.
     * </p>
     * 
     * @return Indicates the status of the automatic scaling policy.
     * @see AutoScalingPolicyState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Indicates the status of the automatic scaling policy.
     * </p>
     * 
     * @param state
     *        Indicates the status of the automatic scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoScalingPolicyState
     */

    public AutoScalingPolicyStatus withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the automatic scaling policy.
     * </p>
     * 
     * @param state
     *        Indicates the status of the automatic scaling policy.
     * @see AutoScalingPolicyState
     */

    public void setState(AutoScalingPolicyState state) {
        withState(state);
    }

    /**
     * <p>
     * Indicates the status of the automatic scaling policy.
     * </p>
     * 
     * @param state
     *        Indicates the status of the automatic scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoScalingPolicyState
     */

    public AutoScalingPolicyStatus withState(AutoScalingPolicyState state) {
        this.state = state.toString();
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
            sb.append("StateChangeReason: ").append(getStateChangeReason());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.AutoScalingPolicyStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
