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
 * A representation of an asynchronous request to perform speaker search analysis on a media insights pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/SpeakerSearchTask"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpeakerSearchTask implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The speaker search task ID.
     * </p>
     */
    private String speakerSearchTaskId;
    /**
     * <p>
     * The status of the speaker search task.
     * </p>
     */
    private String speakerSearchTaskStatus;
    /**
     * <p>
     * The time at which a speaker search task was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The time at which a speaker search task was updated.
     * </p>
     */
    private java.util.Date updatedTimestamp;

    /**
     * <p>
     * The speaker search task ID.
     * </p>
     * 
     * @param speakerSearchTaskId
     *        The speaker search task ID.
     */

    public void setSpeakerSearchTaskId(String speakerSearchTaskId) {
        this.speakerSearchTaskId = speakerSearchTaskId;
    }

    /**
     * <p>
     * The speaker search task ID.
     * </p>
     * 
     * @return The speaker search task ID.
     */

    public String getSpeakerSearchTaskId() {
        return this.speakerSearchTaskId;
    }

    /**
     * <p>
     * The speaker search task ID.
     * </p>
     * 
     * @param speakerSearchTaskId
     *        The speaker search task ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpeakerSearchTask withSpeakerSearchTaskId(String speakerSearchTaskId) {
        setSpeakerSearchTaskId(speakerSearchTaskId);
        return this;
    }

    /**
     * <p>
     * The status of the speaker search task.
     * </p>
     * 
     * @param speakerSearchTaskStatus
     *        The status of the speaker search task.
     * @see MediaPipelineTaskStatus
     */

    public void setSpeakerSearchTaskStatus(String speakerSearchTaskStatus) {
        this.speakerSearchTaskStatus = speakerSearchTaskStatus;
    }

    /**
     * <p>
     * The status of the speaker search task.
     * </p>
     * 
     * @return The status of the speaker search task.
     * @see MediaPipelineTaskStatus
     */

    public String getSpeakerSearchTaskStatus() {
        return this.speakerSearchTaskStatus;
    }

    /**
     * <p>
     * The status of the speaker search task.
     * </p>
     * 
     * @param speakerSearchTaskStatus
     *        The status of the speaker search task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaPipelineTaskStatus
     */

    public SpeakerSearchTask withSpeakerSearchTaskStatus(String speakerSearchTaskStatus) {
        setSpeakerSearchTaskStatus(speakerSearchTaskStatus);
        return this;
    }

    /**
     * <p>
     * The status of the speaker search task.
     * </p>
     * 
     * @param speakerSearchTaskStatus
     *        The status of the speaker search task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaPipelineTaskStatus
     */

    public SpeakerSearchTask withSpeakerSearchTaskStatus(MediaPipelineTaskStatus speakerSearchTaskStatus) {
        this.speakerSearchTaskStatus = speakerSearchTaskStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time at which a speaker search task was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which a speaker search task was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time at which a speaker search task was created.
     * </p>
     * 
     * @return The time at which a speaker search task was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time at which a speaker search task was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which a speaker search task was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpeakerSearchTask withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The time at which a speaker search task was updated.
     * </p>
     * 
     * @param updatedTimestamp
     *        The time at which a speaker search task was updated.
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The time at which a speaker search task was updated.
     * </p>
     * 
     * @return The time at which a speaker search task was updated.
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * <p>
     * The time at which a speaker search task was updated.
     * </p>
     * 
     * @param updatedTimestamp
     *        The time at which a speaker search task was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpeakerSearchTask withUpdatedTimestamp(java.util.Date updatedTimestamp) {
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
        if (getSpeakerSearchTaskId() != null)
            sb.append("SpeakerSearchTaskId: ").append(getSpeakerSearchTaskId()).append(",");
        if (getSpeakerSearchTaskStatus() != null)
            sb.append("SpeakerSearchTaskStatus: ").append(getSpeakerSearchTaskStatus()).append(",");
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

        if (obj instanceof SpeakerSearchTask == false)
            return false;
        SpeakerSearchTask other = (SpeakerSearchTask) obj;
        if (other.getSpeakerSearchTaskId() == null ^ this.getSpeakerSearchTaskId() == null)
            return false;
        if (other.getSpeakerSearchTaskId() != null && other.getSpeakerSearchTaskId().equals(this.getSpeakerSearchTaskId()) == false)
            return false;
        if (other.getSpeakerSearchTaskStatus() == null ^ this.getSpeakerSearchTaskStatus() == null)
            return false;
        if (other.getSpeakerSearchTaskStatus() != null && other.getSpeakerSearchTaskStatus().equals(this.getSpeakerSearchTaskStatus()) == false)
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

        hashCode = prime * hashCode + ((getSpeakerSearchTaskId() == null) ? 0 : getSpeakerSearchTaskId().hashCode());
        hashCode = prime * hashCode + ((getSpeakerSearchTaskStatus() == null) ? 0 : getSpeakerSearchTaskStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public SpeakerSearchTask clone() {
        try {
            return (SpeakerSearchTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.SpeakerSearchTaskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
