/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A representation of an asynchronous request to perform voice tone analysis on a Voice Connector call.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/VoiceToneAnalysisTask"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VoiceToneAnalysisTask implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the voice tone analysis task.
     * </p>
     */
    private String voiceToneAnalysisTaskId;
    /**
     * <p>
     * The status of a voice tone analysis task, <code>IN_QUEUE</code>, <code>IN_PROGRESS</code>,
     * <code>PARTIAL_SUCCESS</code>, <code>SUCCEEDED</code>, <code>FAILED</code>, or <code>STOPPED</code>.
     * </p>
     */
    private String voiceToneAnalysisTaskStatus;
    /**
     * <p>
     * The call details of a voice tone analysis task.
     * </p>
     */
    private CallDetails callDetails;
    /**
     * <p>
     * The time at which a voice tone analysis task was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The time at which a voice tone analysis task was updated.
     * </p>
     */
    private java.util.Date updatedTimestamp;
    /**
     * <p>
     * The time at which a voice tone analysis task started.
     * </p>
     */
    private java.util.Date startedTimestamp;
    /**
     * <p>
     * The status of a voice tone analysis task.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The ID of the voice tone analysis task.
     * </p>
     * 
     * @param voiceToneAnalysisTaskId
     *        The ID of the voice tone analysis task.
     */

    public void setVoiceToneAnalysisTaskId(String voiceToneAnalysisTaskId) {
        this.voiceToneAnalysisTaskId = voiceToneAnalysisTaskId;
    }

    /**
     * <p>
     * The ID of the voice tone analysis task.
     * </p>
     * 
     * @return The ID of the voice tone analysis task.
     */

    public String getVoiceToneAnalysisTaskId() {
        return this.voiceToneAnalysisTaskId;
    }

    /**
     * <p>
     * The ID of the voice tone analysis task.
     * </p>
     * 
     * @param voiceToneAnalysisTaskId
     *        The ID of the voice tone analysis task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceToneAnalysisTask withVoiceToneAnalysisTaskId(String voiceToneAnalysisTaskId) {
        setVoiceToneAnalysisTaskId(voiceToneAnalysisTaskId);
        return this;
    }

    /**
     * <p>
     * The status of a voice tone analysis task, <code>IN_QUEUE</code>, <code>IN_PROGRESS</code>,
     * <code>PARTIAL_SUCCESS</code>, <code>SUCCEEDED</code>, <code>FAILED</code>, or <code>STOPPED</code>.
     * </p>
     * 
     * @param voiceToneAnalysisTaskStatus
     *        The status of a voice tone analysis task, <code>IN_QUEUE</code>, <code>IN_PROGRESS</code>,
     *        <code>PARTIAL_SUCCESS</code>, <code>SUCCEEDED</code>, <code>FAILED</code>, or <code>STOPPED</code>.
     */

    public void setVoiceToneAnalysisTaskStatus(String voiceToneAnalysisTaskStatus) {
        this.voiceToneAnalysisTaskStatus = voiceToneAnalysisTaskStatus;
    }

    /**
     * <p>
     * The status of a voice tone analysis task, <code>IN_QUEUE</code>, <code>IN_PROGRESS</code>,
     * <code>PARTIAL_SUCCESS</code>, <code>SUCCEEDED</code>, <code>FAILED</code>, or <code>STOPPED</code>.
     * </p>
     * 
     * @return The status of a voice tone analysis task, <code>IN_QUEUE</code>, <code>IN_PROGRESS</code>,
     *         <code>PARTIAL_SUCCESS</code>, <code>SUCCEEDED</code>, <code>FAILED</code>, or <code>STOPPED</code>.
     */

    public String getVoiceToneAnalysisTaskStatus() {
        return this.voiceToneAnalysisTaskStatus;
    }

    /**
     * <p>
     * The status of a voice tone analysis task, <code>IN_QUEUE</code>, <code>IN_PROGRESS</code>,
     * <code>PARTIAL_SUCCESS</code>, <code>SUCCEEDED</code>, <code>FAILED</code>, or <code>STOPPED</code>.
     * </p>
     * 
     * @param voiceToneAnalysisTaskStatus
     *        The status of a voice tone analysis task, <code>IN_QUEUE</code>, <code>IN_PROGRESS</code>,
     *        <code>PARTIAL_SUCCESS</code>, <code>SUCCEEDED</code>, <code>FAILED</code>, or <code>STOPPED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceToneAnalysisTask withVoiceToneAnalysisTaskStatus(String voiceToneAnalysisTaskStatus) {
        setVoiceToneAnalysisTaskStatus(voiceToneAnalysisTaskStatus);
        return this;
    }

    /**
     * <p>
     * The call details of a voice tone analysis task.
     * </p>
     * 
     * @param callDetails
     *        The call details of a voice tone analysis task.
     */

    public void setCallDetails(CallDetails callDetails) {
        this.callDetails = callDetails;
    }

    /**
     * <p>
     * The call details of a voice tone analysis task.
     * </p>
     * 
     * @return The call details of a voice tone analysis task.
     */

    public CallDetails getCallDetails() {
        return this.callDetails;
    }

    /**
     * <p>
     * The call details of a voice tone analysis task.
     * </p>
     * 
     * @param callDetails
     *        The call details of a voice tone analysis task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceToneAnalysisTask withCallDetails(CallDetails callDetails) {
        setCallDetails(callDetails);
        return this;
    }

    /**
     * <p>
     * The time at which a voice tone analysis task was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which a voice tone analysis task was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time at which a voice tone analysis task was created.
     * </p>
     * 
     * @return The time at which a voice tone analysis task was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time at which a voice tone analysis task was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which a voice tone analysis task was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceToneAnalysisTask withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The time at which a voice tone analysis task was updated.
     * </p>
     * 
     * @param updatedTimestamp
     *        The time at which a voice tone analysis task was updated.
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The time at which a voice tone analysis task was updated.
     * </p>
     * 
     * @return The time at which a voice tone analysis task was updated.
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * <p>
     * The time at which a voice tone analysis task was updated.
     * </p>
     * 
     * @param updatedTimestamp
     *        The time at which a voice tone analysis task was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceToneAnalysisTask withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        setUpdatedTimestamp(updatedTimestamp);
        return this;
    }

    /**
     * <p>
     * The time at which a voice tone analysis task started.
     * </p>
     * 
     * @param startedTimestamp
     *        The time at which a voice tone analysis task started.
     */

    public void setStartedTimestamp(java.util.Date startedTimestamp) {
        this.startedTimestamp = startedTimestamp;
    }

    /**
     * <p>
     * The time at which a voice tone analysis task started.
     * </p>
     * 
     * @return The time at which a voice tone analysis task started.
     */

    public java.util.Date getStartedTimestamp() {
        return this.startedTimestamp;
    }

    /**
     * <p>
     * The time at which a voice tone analysis task started.
     * </p>
     * 
     * @param startedTimestamp
     *        The time at which a voice tone analysis task started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceToneAnalysisTask withStartedTimestamp(java.util.Date startedTimestamp) {
        setStartedTimestamp(startedTimestamp);
        return this;
    }

    /**
     * <p>
     * The status of a voice tone analysis task.
     * </p>
     * 
     * @param statusMessage
     *        The status of a voice tone analysis task.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status of a voice tone analysis task.
     * </p>
     * 
     * @return The status of a voice tone analysis task.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status of a voice tone analysis task.
     * </p>
     * 
     * @param statusMessage
     *        The status of a voice tone analysis task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceToneAnalysisTask withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getVoiceToneAnalysisTaskId() != null)
            sb.append("VoiceToneAnalysisTaskId: ").append(getVoiceToneAnalysisTaskId()).append(",");
        if (getVoiceToneAnalysisTaskStatus() != null)
            sb.append("VoiceToneAnalysisTaskStatus: ").append(getVoiceToneAnalysisTaskStatus()).append(",");
        if (getCallDetails() != null)
            sb.append("CallDetails: ").append(getCallDetails()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: ").append(getUpdatedTimestamp()).append(",");
        if (getStartedTimestamp() != null)
            sb.append("StartedTimestamp: ").append(getStartedTimestamp()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VoiceToneAnalysisTask == false)
            return false;
        VoiceToneAnalysisTask other = (VoiceToneAnalysisTask) obj;
        if (other.getVoiceToneAnalysisTaskId() == null ^ this.getVoiceToneAnalysisTaskId() == null)
            return false;
        if (other.getVoiceToneAnalysisTaskId() != null && other.getVoiceToneAnalysisTaskId().equals(this.getVoiceToneAnalysisTaskId()) == false)
            return false;
        if (other.getVoiceToneAnalysisTaskStatus() == null ^ this.getVoiceToneAnalysisTaskStatus() == null)
            return false;
        if (other.getVoiceToneAnalysisTaskStatus() != null && other.getVoiceToneAnalysisTaskStatus().equals(this.getVoiceToneAnalysisTaskStatus()) == false)
            return false;
        if (other.getCallDetails() == null ^ this.getCallDetails() == null)
            return false;
        if (other.getCallDetails() != null && other.getCallDetails().equals(this.getCallDetails()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        if (other.getStartedTimestamp() == null ^ this.getStartedTimestamp() == null)
            return false;
        if (other.getStartedTimestamp() != null && other.getStartedTimestamp().equals(this.getStartedTimestamp()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceToneAnalysisTaskId() == null) ? 0 : getVoiceToneAnalysisTaskId().hashCode());
        hashCode = prime * hashCode + ((getVoiceToneAnalysisTaskStatus() == null) ? 0 : getVoiceToneAnalysisTaskStatus().hashCode());
        hashCode = prime * hashCode + ((getCallDetails() == null) ? 0 : getCallDetails().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStartedTimestamp() == null) ? 0 : getStartedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public VoiceToneAnalysisTask clone() {
        try {
            return (VoiceToneAnalysisTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkvoice.model.transform.VoiceToneAnalysisTaskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
