/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure contains the status information about a canary run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/CanaryRunStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CanaryRunStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current state of the run.
     * </p>
     */
    private String state;
    /**
     * <p>
     * If run of the canary failed, this field contains the reason for the error.
     * </p>
     */
    private String stateReason;
    /**
     * <p>
     * If this value is <code>CANARY_FAILURE</code>, an exception occurred in the canary code. If this value is
     * <code>EXECUTION_FAILURE</code>, an exception occurred in CloudWatch Synthetics.
     * </p>
     */
    private String stateReasonCode;

    /**
     * <p>
     * The current state of the run.
     * </p>
     * 
     * @param state
     *        The current state of the run.
     * @see CanaryRunState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the run.
     * </p>
     * 
     * @return The current state of the run.
     * @see CanaryRunState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the run.
     * </p>
     * 
     * @param state
     *        The current state of the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CanaryRunState
     */

    public CanaryRunStatus withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the run.
     * </p>
     * 
     * @param state
     *        The current state of the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CanaryRunState
     */

    public CanaryRunStatus withState(CanaryRunState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * If run of the canary failed, this field contains the reason for the error.
     * </p>
     * 
     * @param stateReason
     *        If run of the canary failed, this field contains the reason for the error.
     */

    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * If run of the canary failed, this field contains the reason for the error.
     * </p>
     * 
     * @return If run of the canary failed, this field contains the reason for the error.
     */

    public String getStateReason() {
        return this.stateReason;
    }

    /**
     * <p>
     * If run of the canary failed, this field contains the reason for the error.
     * </p>
     * 
     * @param stateReason
     *        If run of the canary failed, this field contains the reason for the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryRunStatus withStateReason(String stateReason) {
        setStateReason(stateReason);
        return this;
    }

    /**
     * <p>
     * If this value is <code>CANARY_FAILURE</code>, an exception occurred in the canary code. If this value is
     * <code>EXECUTION_FAILURE</code>, an exception occurred in CloudWatch Synthetics.
     * </p>
     * 
     * @param stateReasonCode
     *        If this value is <code>CANARY_FAILURE</code>, an exception occurred in the canary code. If this value is
     *        <code>EXECUTION_FAILURE</code>, an exception occurred in CloudWatch Synthetics.
     * @see CanaryRunStateReasonCode
     */

    public void setStateReasonCode(String stateReasonCode) {
        this.stateReasonCode = stateReasonCode;
    }

    /**
     * <p>
     * If this value is <code>CANARY_FAILURE</code>, an exception occurred in the canary code. If this value is
     * <code>EXECUTION_FAILURE</code>, an exception occurred in CloudWatch Synthetics.
     * </p>
     * 
     * @return If this value is <code>CANARY_FAILURE</code>, an exception occurred in the canary code. If this value is
     *         <code>EXECUTION_FAILURE</code>, an exception occurred in CloudWatch Synthetics.
     * @see CanaryRunStateReasonCode
     */

    public String getStateReasonCode() {
        return this.stateReasonCode;
    }

    /**
     * <p>
     * If this value is <code>CANARY_FAILURE</code>, an exception occurred in the canary code. If this value is
     * <code>EXECUTION_FAILURE</code>, an exception occurred in CloudWatch Synthetics.
     * </p>
     * 
     * @param stateReasonCode
     *        If this value is <code>CANARY_FAILURE</code>, an exception occurred in the canary code. If this value is
     *        <code>EXECUTION_FAILURE</code>, an exception occurred in CloudWatch Synthetics.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CanaryRunStateReasonCode
     */

    public CanaryRunStatus withStateReasonCode(String stateReasonCode) {
        setStateReasonCode(stateReasonCode);
        return this;
    }

    /**
     * <p>
     * If this value is <code>CANARY_FAILURE</code>, an exception occurred in the canary code. If this value is
     * <code>EXECUTION_FAILURE</code>, an exception occurred in CloudWatch Synthetics.
     * </p>
     * 
     * @param stateReasonCode
     *        If this value is <code>CANARY_FAILURE</code>, an exception occurred in the canary code. If this value is
     *        <code>EXECUTION_FAILURE</code>, an exception occurred in CloudWatch Synthetics.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CanaryRunStateReasonCode
     */

    public CanaryRunStatus withStateReasonCode(CanaryRunStateReasonCode stateReasonCode) {
        this.stateReasonCode = stateReasonCode.toString();
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
        if (getStateReason() != null)
            sb.append("StateReason: ").append(getStateReason()).append(",");
        if (getStateReasonCode() != null)
            sb.append("StateReasonCode: ").append(getStateReasonCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CanaryRunStatus == false)
            return false;
        CanaryRunStatus other = (CanaryRunStatus) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateReason() == null ^ this.getStateReason() == null)
            return false;
        if (other.getStateReason() != null && other.getStateReason().equals(this.getStateReason()) == false)
            return false;
        if (other.getStateReasonCode() == null ^ this.getStateReasonCode() == null)
            return false;
        if (other.getStateReasonCode() != null && other.getStateReasonCode().equals(this.getStateReasonCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime * hashCode + ((getStateReasonCode() == null) ? 0 : getStateReasonCode().hashCode());
        return hashCode;
    }

    @Override
    public CanaryRunStatus clone() {
        try {
            return (CanaryRunStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.synthetics.model.transform.CanaryRunStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
