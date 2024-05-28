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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A representation of an asynchronous request to perform voice tone analysis on a media insights pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/VoiceToneAnalysisTask"
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
     * The status of a voice tone analysis task.
     * </p>
     */
    private String voiceToneAnalysisTaskStatus;
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
     * The status of a voice tone analysis task.
     * </p>
     * 
     * @param voiceToneAnalysisTaskStatus
     *        The status of a voice tone analysis task.
     * @see MediaPipelineTaskStatus
     */

    public void setVoiceToneAnalysisTaskStatus(String voiceToneAnalysisTaskStatus) {
        this.voiceToneAnalysisTaskStatus = voiceToneAnalysisTaskStatus;
    }

    /**
     * <p>
     * The status of a voice tone analysis task.
     * </p>
     * 
     * @return The status of a voice tone analysis task.
     * @see MediaPipelineTaskStatus
     */

    public String getVoiceToneAnalysisTaskStatus() {
        return this.voiceToneAnalysisTaskStatus;
    }

    /**
     * <p>
     * The status of a voice tone analysis task.
     * </p>
     * 
     * @param voiceToneAnalysisTaskStatus
     *        The status of a voice tone analysis task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaPipelineTaskStatus
     */

    public VoiceToneAnalysisTask withVoiceToneAnalysisTaskStatus(String voiceToneAnalysisTaskStatus) {
        setVoiceToneAnalysisTaskStatus(voiceToneAnalysisTaskStatus);
        return this;
    }

    /**
     * <p>
     * The status of a voice tone analysis task.
     * </p>
     * 
     * @param voiceToneAnalysisTaskStatus
     *        The status of a voice tone analysis task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaPipelineTaskStatus
     */

    public VoiceToneAnalysisTask withVoiceToneAnalysisTaskStatus(MediaPipelineTaskStatus voiceToneAnalysisTaskStatus) {
        this.voiceToneAnalysisTaskStatus = voiceToneAnalysisTaskStatus.toString();
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
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: ").append(getUpdatedTimestamp());
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
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceToneAnalysisTaskId() == null) ? 0 : getVoiceToneAnalysisTaskId().hashCode());
        hashCode = prime * hashCode + ((getVoiceToneAnalysisTaskStatus() == null) ? 0 : getVoiceToneAnalysisTaskStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
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
        com.amazonaws.services.chimesdkmediapipelines.model.transform.VoiceToneAnalysisTaskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
