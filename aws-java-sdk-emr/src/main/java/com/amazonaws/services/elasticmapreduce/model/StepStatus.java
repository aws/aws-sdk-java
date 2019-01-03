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
 * The execution status details of the cluster step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/StepStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StepStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The execution state of the cluster step.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The reason for the step execution status change.
     * </p>
     */
    private StepStateChangeReason stateChangeReason;
    /**
     * <p>
     * The details for the step failure including reason, message, and log file path where the root cause was
     * identified.
     * </p>
     */
    private FailureDetails failureDetails;
    /**
     * <p>
     * The timeline of the cluster step status over time.
     * </p>
     */
    private StepTimeline timeline;

    /**
     * <p>
     * The execution state of the cluster step.
     * </p>
     * 
     * @param state
     *        The execution state of the cluster step.
     * @see StepState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The execution state of the cluster step.
     * </p>
     * 
     * @return The execution state of the cluster step.
     * @see StepState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The execution state of the cluster step.
     * </p>
     * 
     * @param state
     *        The execution state of the cluster step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepState
     */

    public StepStatus withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The execution state of the cluster step.
     * </p>
     * 
     * @param state
     *        The execution state of the cluster step.
     * @see StepState
     */

    public void setState(StepState state) {
        withState(state);
    }

    /**
     * <p>
     * The execution state of the cluster step.
     * </p>
     * 
     * @param state
     *        The execution state of the cluster step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepState
     */

    public StepStatus withState(StepState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the step execution status change.
     * </p>
     * 
     * @param stateChangeReason
     *        The reason for the step execution status change.
     */

    public void setStateChangeReason(StepStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
    }

    /**
     * <p>
     * The reason for the step execution status change.
     * </p>
     * 
     * @return The reason for the step execution status change.
     */

    public StepStateChangeReason getStateChangeReason() {
        return this.stateChangeReason;
    }

    /**
     * <p>
     * The reason for the step execution status change.
     * </p>
     * 
     * @param stateChangeReason
     *        The reason for the step execution status change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepStatus withStateChangeReason(StepStateChangeReason stateChangeReason) {
        setStateChangeReason(stateChangeReason);
        return this;
    }

    /**
     * <p>
     * The details for the step failure including reason, message, and log file path where the root cause was
     * identified.
     * </p>
     * 
     * @param failureDetails
     *        The details for the step failure including reason, message, and log file path where the root cause was
     *        identified.
     */

    public void setFailureDetails(FailureDetails failureDetails) {
        this.failureDetails = failureDetails;
    }

    /**
     * <p>
     * The details for the step failure including reason, message, and log file path where the root cause was
     * identified.
     * </p>
     * 
     * @return The details for the step failure including reason, message, and log file path where the root cause was
     *         identified.
     */

    public FailureDetails getFailureDetails() {
        return this.failureDetails;
    }

    /**
     * <p>
     * The details for the step failure including reason, message, and log file path where the root cause was
     * identified.
     * </p>
     * 
     * @param failureDetails
     *        The details for the step failure including reason, message, and log file path where the root cause was
     *        identified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepStatus withFailureDetails(FailureDetails failureDetails) {
        setFailureDetails(failureDetails);
        return this;
    }

    /**
     * <p>
     * The timeline of the cluster step status over time.
     * </p>
     * 
     * @param timeline
     *        The timeline of the cluster step status over time.
     */

    public void setTimeline(StepTimeline timeline) {
        this.timeline = timeline;
    }

    /**
     * <p>
     * The timeline of the cluster step status over time.
     * </p>
     * 
     * @return The timeline of the cluster step status over time.
     */

    public StepTimeline getTimeline() {
        return this.timeline;
    }

    /**
     * <p>
     * The timeline of the cluster step status over time.
     * </p>
     * 
     * @param timeline
     *        The timeline of the cluster step status over time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepStatus withTimeline(StepTimeline timeline) {
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
        if (getFailureDetails() != null)
            sb.append("FailureDetails: ").append(getFailureDetails()).append(",");
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

        if (obj instanceof StepStatus == false)
            return false;
        StepStatus other = (StepStatus) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateChangeReason() == null ^ this.getStateChangeReason() == null)
            return false;
        if (other.getStateChangeReason() != null && other.getStateChangeReason().equals(this.getStateChangeReason()) == false)
            return false;
        if (other.getFailureDetails() == null ^ this.getFailureDetails() == null)
            return false;
        if (other.getFailureDetails() != null && other.getFailureDetails().equals(this.getFailureDetails()) == false)
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
        hashCode = prime * hashCode + ((getFailureDetails() == null) ? 0 : getFailureDetails().hashCode());
        hashCode = prime * hashCode + ((getTimeline() == null) ? 0 : getTimeline().hashCode());
        return hashCode;
    }

    @Override
    public StepStatus clone() {
        try {
            return (StepStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.StepStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
