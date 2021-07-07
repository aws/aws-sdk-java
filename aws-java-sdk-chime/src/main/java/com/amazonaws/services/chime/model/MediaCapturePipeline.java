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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A media capture pipeline object. A string consisting of an ID, source type, a source ARN, a sink type, and a sink
 * ARN.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/MediaCapturePipeline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaCapturePipeline implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of a media capture pipeline.
     * </p>
     */
    private String mediaPipelineId;
    /**
     * <p>
     * Source type from which media artifacts are saved. You must use <code>ChimeMeeting</code>.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * ARN of the source from which the media artifacts will be saved.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * The status of the media capture pipeline.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Destination type to which the media artifacts are saved. You must use an S3 Bucket.
     * </p>
     */
    private String sinkType;
    /**
     * <p>
     * ARN of the destination to which the media artifacts are saved.
     * </p>
     */
    private String sinkArn;
    /**
     * <p>
     * The time at which the capture pipeline was created, in ISO 8601 format.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The time at which the capture pipeline was updated, in ISO 8601 format.
     * </p>
     */
    private java.util.Date updatedTimestamp;

    /**
     * <p>
     * The ID of a media capture pipeline.
     * </p>
     * 
     * @param mediaPipelineId
     *        The ID of a media capture pipeline.
     */

    public void setMediaPipelineId(String mediaPipelineId) {
        this.mediaPipelineId = mediaPipelineId;
    }

    /**
     * <p>
     * The ID of a media capture pipeline.
     * </p>
     * 
     * @return The ID of a media capture pipeline.
     */

    public String getMediaPipelineId() {
        return this.mediaPipelineId;
    }

    /**
     * <p>
     * The ID of a media capture pipeline.
     * </p>
     * 
     * @param mediaPipelineId
     *        The ID of a media capture pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaCapturePipeline withMediaPipelineId(String mediaPipelineId) {
        setMediaPipelineId(mediaPipelineId);
        return this;
    }

    /**
     * <p>
     * Source type from which media artifacts are saved. You must use <code>ChimeMeeting</code>.
     * </p>
     * 
     * @param sourceType
     *        Source type from which media artifacts are saved. You must use <code>ChimeMeeting</code>.
     * @see MediaPipelineSourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * Source type from which media artifacts are saved. You must use <code>ChimeMeeting</code>.
     * </p>
     * 
     * @return Source type from which media artifacts are saved. You must use <code>ChimeMeeting</code>.
     * @see MediaPipelineSourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * Source type from which media artifacts are saved. You must use <code>ChimeMeeting</code>.
     * </p>
     * 
     * @param sourceType
     *        Source type from which media artifacts are saved. You must use <code>ChimeMeeting</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaPipelineSourceType
     */

    public MediaCapturePipeline withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * Source type from which media artifacts are saved. You must use <code>ChimeMeeting</code>.
     * </p>
     * 
     * @param sourceType
     *        Source type from which media artifacts are saved. You must use <code>ChimeMeeting</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaPipelineSourceType
     */

    public MediaCapturePipeline withSourceType(MediaPipelineSourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * <p>
     * ARN of the source from which the media artifacts will be saved.
     * </p>
     * 
     * @param sourceArn
     *        ARN of the source from which the media artifacts will be saved.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * ARN of the source from which the media artifacts will be saved.
     * </p>
     * 
     * @return ARN of the source from which the media artifacts will be saved.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * ARN of the source from which the media artifacts will be saved.
     * </p>
     * 
     * @param sourceArn
     *        ARN of the source from which the media artifacts will be saved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaCapturePipeline withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * The status of the media capture pipeline.
     * </p>
     * 
     * @param status
     *        The status of the media capture pipeline.
     * @see MediaPipelineStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the media capture pipeline.
     * </p>
     * 
     * @return The status of the media capture pipeline.
     * @see MediaPipelineStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the media capture pipeline.
     * </p>
     * 
     * @param status
     *        The status of the media capture pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaPipelineStatus
     */

    public MediaCapturePipeline withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the media capture pipeline.
     * </p>
     * 
     * @param status
     *        The status of the media capture pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaPipelineStatus
     */

    public MediaCapturePipeline withStatus(MediaPipelineStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Destination type to which the media artifacts are saved. You must use an S3 Bucket.
     * </p>
     * 
     * @param sinkType
     *        Destination type to which the media artifacts are saved. You must use an S3 Bucket.
     * @see MediaPipelineSinkType
     */

    public void setSinkType(String sinkType) {
        this.sinkType = sinkType;
    }

    /**
     * <p>
     * Destination type to which the media artifacts are saved. You must use an S3 Bucket.
     * </p>
     * 
     * @return Destination type to which the media artifacts are saved. You must use an S3 Bucket.
     * @see MediaPipelineSinkType
     */

    public String getSinkType() {
        return this.sinkType;
    }

    /**
     * <p>
     * Destination type to which the media artifacts are saved. You must use an S3 Bucket.
     * </p>
     * 
     * @param sinkType
     *        Destination type to which the media artifacts are saved. You must use an S3 Bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaPipelineSinkType
     */

    public MediaCapturePipeline withSinkType(String sinkType) {
        setSinkType(sinkType);
        return this;
    }

    /**
     * <p>
     * Destination type to which the media artifacts are saved. You must use an S3 Bucket.
     * </p>
     * 
     * @param sinkType
     *        Destination type to which the media artifacts are saved. You must use an S3 Bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaPipelineSinkType
     */

    public MediaCapturePipeline withSinkType(MediaPipelineSinkType sinkType) {
        this.sinkType = sinkType.toString();
        return this;
    }

    /**
     * <p>
     * ARN of the destination to which the media artifacts are saved.
     * </p>
     * 
     * @param sinkArn
     *        ARN of the destination to which the media artifacts are saved.
     */

    public void setSinkArn(String sinkArn) {
        this.sinkArn = sinkArn;
    }

    /**
     * <p>
     * ARN of the destination to which the media artifacts are saved.
     * </p>
     * 
     * @return ARN of the destination to which the media artifacts are saved.
     */

    public String getSinkArn() {
        return this.sinkArn;
    }

    /**
     * <p>
     * ARN of the destination to which the media artifacts are saved.
     * </p>
     * 
     * @param sinkArn
     *        ARN of the destination to which the media artifacts are saved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaCapturePipeline withSinkArn(String sinkArn) {
        setSinkArn(sinkArn);
        return this;
    }

    /**
     * <p>
     * The time at which the capture pipeline was created, in ISO 8601 format.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the capture pipeline was created, in ISO 8601 format.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time at which the capture pipeline was created, in ISO 8601 format.
     * </p>
     * 
     * @return The time at which the capture pipeline was created, in ISO 8601 format.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time at which the capture pipeline was created, in ISO 8601 format.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the capture pipeline was created, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaCapturePipeline withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The time at which the capture pipeline was updated, in ISO 8601 format.
     * </p>
     * 
     * @param updatedTimestamp
     *        The time at which the capture pipeline was updated, in ISO 8601 format.
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The time at which the capture pipeline was updated, in ISO 8601 format.
     * </p>
     * 
     * @return The time at which the capture pipeline was updated, in ISO 8601 format.
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * <p>
     * The time at which the capture pipeline was updated, in ISO 8601 format.
     * </p>
     * 
     * @param updatedTimestamp
     *        The time at which the capture pipeline was updated, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaCapturePipeline withUpdatedTimestamp(java.util.Date updatedTimestamp) {
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
        if (getMediaPipelineId() != null)
            sb.append("MediaPipelineId: ").append(getMediaPipelineId()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append("***Sensitive Data Redacted***").append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSinkType() != null)
            sb.append("SinkType: ").append(getSinkType()).append(",");
        if (getSinkArn() != null)
            sb.append("SinkArn: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof MediaCapturePipeline == false)
            return false;
        MediaCapturePipeline other = (MediaCapturePipeline) obj;
        if (other.getMediaPipelineId() == null ^ this.getMediaPipelineId() == null)
            return false;
        if (other.getMediaPipelineId() != null && other.getMediaPipelineId().equals(this.getMediaPipelineId()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSinkType() == null ^ this.getSinkType() == null)
            return false;
        if (other.getSinkType() != null && other.getSinkType().equals(this.getSinkType()) == false)
            return false;
        if (other.getSinkArn() == null ^ this.getSinkArn() == null)
            return false;
        if (other.getSinkArn() != null && other.getSinkArn().equals(this.getSinkArn()) == false)
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

        hashCode = prime * hashCode + ((getMediaPipelineId() == null) ? 0 : getMediaPipelineId().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSinkType() == null) ? 0 : getSinkType().hashCode());
        hashCode = prime * hashCode + ((getSinkArn() == null) ? 0 : getSinkArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public MediaCapturePipeline clone() {
        try {
            return (MediaCapturePipeline) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.MediaCapturePipelineMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
