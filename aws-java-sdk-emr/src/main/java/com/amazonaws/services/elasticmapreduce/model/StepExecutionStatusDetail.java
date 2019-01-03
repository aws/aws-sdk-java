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
 * The execution state of a step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/StepExecutionStatusDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StepExecutionStatusDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The state of the step.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The creation date and time of the step.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The start date and time of the step.
     * </p>
     */
    private java.util.Date startDateTime;
    /**
     * <p>
     * The completion date and time of the step.
     * </p>
     */
    private java.util.Date endDateTime;
    /**
     * <p>
     * A description of the step's current state.
     * </p>
     */
    private String lastStateChangeReason;

    /**
     * Default constructor for StepExecutionStatusDetail object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public StepExecutionStatusDetail() {
    }

    /**
     * Constructs a new StepExecutionStatusDetail object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param state
     *        The state of the step.
     * @param creationDateTime
     *        The creation date and time of the step.
     */
    public StepExecutionStatusDetail(String state, java.util.Date creationDateTime) {
        setState(state);
        setCreationDateTime(creationDateTime);
    }

    /**
     * Constructs a new StepExecutionStatusDetail object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param state
     *        The state of the step.
     * @param creationDateTime
     *        The creation date and time of the step.
     */
    public StepExecutionStatusDetail(StepExecutionState state, java.util.Date creationDateTime) {
        setState(state.toString());
        setCreationDateTime(creationDateTime);
    }

    /**
     * <p>
     * The state of the step.
     * </p>
     * 
     * @param state
     *        The state of the step.
     * @see StepExecutionState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the step.
     * </p>
     * 
     * @return The state of the step.
     * @see StepExecutionState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the step.
     * </p>
     * 
     * @param state
     *        The state of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepExecutionState
     */

    public StepExecutionStatusDetail withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the step.
     * </p>
     * 
     * @param state
     *        The state of the step.
     * @see StepExecutionState
     */

    public void setState(StepExecutionState state) {
        withState(state);
    }

    /**
     * <p>
     * The state of the step.
     * </p>
     * 
     * @param state
     *        The state of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepExecutionState
     */

    public StepExecutionStatusDetail withState(StepExecutionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The creation date and time of the step.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time of the step.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The creation date and time of the step.
     * </p>
     * 
     * @return The creation date and time of the step.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The creation date and time of the step.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepExecutionStatusDetail withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The start date and time of the step.
     * </p>
     * 
     * @param startDateTime
     *        The start date and time of the step.
     */

    public void setStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * <p>
     * The start date and time of the step.
     * </p>
     * 
     * @return The start date and time of the step.
     */

    public java.util.Date getStartDateTime() {
        return this.startDateTime;
    }

    /**
     * <p>
     * The start date and time of the step.
     * </p>
     * 
     * @param startDateTime
     *        The start date and time of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepExecutionStatusDetail withStartDateTime(java.util.Date startDateTime) {
        setStartDateTime(startDateTime);
        return this;
    }

    /**
     * <p>
     * The completion date and time of the step.
     * </p>
     * 
     * @param endDateTime
     *        The completion date and time of the step.
     */

    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * <p>
     * The completion date and time of the step.
     * </p>
     * 
     * @return The completion date and time of the step.
     */

    public java.util.Date getEndDateTime() {
        return this.endDateTime;
    }

    /**
     * <p>
     * The completion date and time of the step.
     * </p>
     * 
     * @param endDateTime
     *        The completion date and time of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepExecutionStatusDetail withEndDateTime(java.util.Date endDateTime) {
        setEndDateTime(endDateTime);
        return this;
    }

    /**
     * <p>
     * A description of the step's current state.
     * </p>
     * 
     * @param lastStateChangeReason
     *        A description of the step's current state.
     */

    public void setLastStateChangeReason(String lastStateChangeReason) {
        this.lastStateChangeReason = lastStateChangeReason;
    }

    /**
     * <p>
     * A description of the step's current state.
     * </p>
     * 
     * @return A description of the step's current state.
     */

    public String getLastStateChangeReason() {
        return this.lastStateChangeReason;
    }

    /**
     * <p>
     * A description of the step's current state.
     * </p>
     * 
     * @param lastStateChangeReason
     *        A description of the step's current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepExecutionStatusDetail withLastStateChangeReason(String lastStateChangeReason) {
        setLastStateChangeReason(lastStateChangeReason);
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
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getStartDateTime() != null)
            sb.append("StartDateTime: ").append(getStartDateTime()).append(",");
        if (getEndDateTime() != null)
            sb.append("EndDateTime: ").append(getEndDateTime()).append(",");
        if (getLastStateChangeReason() != null)
            sb.append("LastStateChangeReason: ").append(getLastStateChangeReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StepExecutionStatusDetail == false)
            return false;
        StepExecutionStatusDetail other = (StepExecutionStatusDetail) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getStartDateTime() == null ^ this.getStartDateTime() == null)
            return false;
        if (other.getStartDateTime() != null && other.getStartDateTime().equals(this.getStartDateTime()) == false)
            return false;
        if (other.getEndDateTime() == null ^ this.getEndDateTime() == null)
            return false;
        if (other.getEndDateTime() != null && other.getEndDateTime().equals(this.getEndDateTime()) == false)
            return false;
        if (other.getLastStateChangeReason() == null ^ this.getLastStateChangeReason() == null)
            return false;
        if (other.getLastStateChangeReason() != null && other.getLastStateChangeReason().equals(this.getLastStateChangeReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getStartDateTime() == null) ? 0 : getStartDateTime().hashCode());
        hashCode = prime * hashCode + ((getEndDateTime() == null) ? 0 : getEndDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastStateChangeReason() == null) ? 0 : getLastStateChangeReason().hashCode());
        return hashCode;
    }

    @Override
    public StepExecutionStatusDetail clone() {
        try {
            return (StepExecutionStatusDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.StepExecutionStatusDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
