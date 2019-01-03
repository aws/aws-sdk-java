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
 * Describes the status of the cluster (job flow).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/JobFlowExecutionStatusDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobFlowExecutionStatusDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The state of the job flow.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The creation date and time of the job flow.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The start date and time of the job flow.
     * </p>
     */
    private java.util.Date startDateTime;
    /**
     * <p>
     * The date and time when the job flow was ready to start running bootstrap actions.
     * </p>
     */
    private java.util.Date readyDateTime;
    /**
     * <p>
     * The completion date and time of the job flow.
     * </p>
     */
    private java.util.Date endDateTime;
    /**
     * <p>
     * Description of the job flow last changed state.
     * </p>
     */
    private String lastStateChangeReason;

    /**
     * Default constructor for JobFlowExecutionStatusDetail object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public JobFlowExecutionStatusDetail() {
    }

    /**
     * Constructs a new JobFlowExecutionStatusDetail object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param state
     *        The state of the job flow.
     * @param creationDateTime
     *        The creation date and time of the job flow.
     */
    public JobFlowExecutionStatusDetail(String state, java.util.Date creationDateTime) {
        setState(state);
        setCreationDateTime(creationDateTime);
    }

    /**
     * Constructs a new JobFlowExecutionStatusDetail object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param state
     *        The state of the job flow.
     * @param creationDateTime
     *        The creation date and time of the job flow.
     */
    public JobFlowExecutionStatusDetail(JobFlowExecutionState state, java.util.Date creationDateTime) {
        setState(state.toString());
        setCreationDateTime(creationDateTime);
    }

    /**
     * <p>
     * The state of the job flow.
     * </p>
     * 
     * @param state
     *        The state of the job flow.
     * @see JobFlowExecutionState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the job flow.
     * </p>
     * 
     * @return The state of the job flow.
     * @see JobFlowExecutionState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the job flow.
     * </p>
     * 
     * @param state
     *        The state of the job flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobFlowExecutionState
     */

    public JobFlowExecutionStatusDetail withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the job flow.
     * </p>
     * 
     * @param state
     *        The state of the job flow.
     * @see JobFlowExecutionState
     */

    public void setState(JobFlowExecutionState state) {
        withState(state);
    }

    /**
     * <p>
     * The state of the job flow.
     * </p>
     * 
     * @param state
     *        The state of the job flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobFlowExecutionState
     */

    public JobFlowExecutionStatusDetail withState(JobFlowExecutionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The creation date and time of the job flow.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time of the job flow.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The creation date and time of the job flow.
     * </p>
     * 
     * @return The creation date and time of the job flow.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The creation date and time of the job flow.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time of the job flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobFlowExecutionStatusDetail withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The start date and time of the job flow.
     * </p>
     * 
     * @param startDateTime
     *        The start date and time of the job flow.
     */

    public void setStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * <p>
     * The start date and time of the job flow.
     * </p>
     * 
     * @return The start date and time of the job flow.
     */

    public java.util.Date getStartDateTime() {
        return this.startDateTime;
    }

    /**
     * <p>
     * The start date and time of the job flow.
     * </p>
     * 
     * @param startDateTime
     *        The start date and time of the job flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobFlowExecutionStatusDetail withStartDateTime(java.util.Date startDateTime) {
        setStartDateTime(startDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the job flow was ready to start running bootstrap actions.
     * </p>
     * 
     * @param readyDateTime
     *        The date and time when the job flow was ready to start running bootstrap actions.
     */

    public void setReadyDateTime(java.util.Date readyDateTime) {
        this.readyDateTime = readyDateTime;
    }

    /**
     * <p>
     * The date and time when the job flow was ready to start running bootstrap actions.
     * </p>
     * 
     * @return The date and time when the job flow was ready to start running bootstrap actions.
     */

    public java.util.Date getReadyDateTime() {
        return this.readyDateTime;
    }

    /**
     * <p>
     * The date and time when the job flow was ready to start running bootstrap actions.
     * </p>
     * 
     * @param readyDateTime
     *        The date and time when the job flow was ready to start running bootstrap actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobFlowExecutionStatusDetail withReadyDateTime(java.util.Date readyDateTime) {
        setReadyDateTime(readyDateTime);
        return this;
    }

    /**
     * <p>
     * The completion date and time of the job flow.
     * </p>
     * 
     * @param endDateTime
     *        The completion date and time of the job flow.
     */

    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * <p>
     * The completion date and time of the job flow.
     * </p>
     * 
     * @return The completion date and time of the job flow.
     */

    public java.util.Date getEndDateTime() {
        return this.endDateTime;
    }

    /**
     * <p>
     * The completion date and time of the job flow.
     * </p>
     * 
     * @param endDateTime
     *        The completion date and time of the job flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobFlowExecutionStatusDetail withEndDateTime(java.util.Date endDateTime) {
        setEndDateTime(endDateTime);
        return this;
    }

    /**
     * <p>
     * Description of the job flow last changed state.
     * </p>
     * 
     * @param lastStateChangeReason
     *        Description of the job flow last changed state.
     */

    public void setLastStateChangeReason(String lastStateChangeReason) {
        this.lastStateChangeReason = lastStateChangeReason;
    }

    /**
     * <p>
     * Description of the job flow last changed state.
     * </p>
     * 
     * @return Description of the job flow last changed state.
     */

    public String getLastStateChangeReason() {
        return this.lastStateChangeReason;
    }

    /**
     * <p>
     * Description of the job flow last changed state.
     * </p>
     * 
     * @param lastStateChangeReason
     *        Description of the job flow last changed state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobFlowExecutionStatusDetail withLastStateChangeReason(String lastStateChangeReason) {
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
        if (getReadyDateTime() != null)
            sb.append("ReadyDateTime: ").append(getReadyDateTime()).append(",");
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

        if (obj instanceof JobFlowExecutionStatusDetail == false)
            return false;
        JobFlowExecutionStatusDetail other = (JobFlowExecutionStatusDetail) obj;
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
        if (other.getReadyDateTime() == null ^ this.getReadyDateTime() == null)
            return false;
        if (other.getReadyDateTime() != null && other.getReadyDateTime().equals(this.getReadyDateTime()) == false)
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
        hashCode = prime * hashCode + ((getReadyDateTime() == null) ? 0 : getReadyDateTime().hashCode());
        hashCode = prime * hashCode + ((getEndDateTime() == null) ? 0 : getEndDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastStateChangeReason() == null) ? 0 : getLastStateChangeReason().hashCode());
        return hashCode;
    }

    @Override
    public JobFlowExecutionStatusDetail clone() {
        try {
            return (JobFlowExecutionStatusDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.JobFlowExecutionStatusDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
