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
 * Structure that contains the settings for a media stream pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/MediaStreamPipeline"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaStreamPipeline implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the media stream pipeline
     * </p>
     */
    private String mediaPipelineId;
    /**
     * <p>
     * The ARN of the media stream pipeline.
     * </p>
     */
    private String mediaPipelineArn;
    /**
     * <p>
     * The time at which the media stream pipeline was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The time at which the media stream pipeline was updated.
     * </p>
     */
    private java.util.Date updatedTimestamp;
    /**
     * <p>
     * The status of the media stream pipeline.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The media stream pipeline's data sources.
     * </p>
     */
    private java.util.List<MediaStreamSource> sources;
    /**
     * <p>
     * The media stream pipeline's data sinks.
     * </p>
     */
    private java.util.List<MediaStreamSink> sinks;

    /**
     * <p>
     * The ID of the media stream pipeline
     * </p>
     * 
     * @param mediaPipelineId
     *        The ID of the media stream pipeline
     */

    public void setMediaPipelineId(String mediaPipelineId) {
        this.mediaPipelineId = mediaPipelineId;
    }

    /**
     * <p>
     * The ID of the media stream pipeline
     * </p>
     * 
     * @return The ID of the media stream pipeline
     */

    public String getMediaPipelineId() {
        return this.mediaPipelineId;
    }

    /**
     * <p>
     * The ID of the media stream pipeline
     * </p>
     * 
     * @param mediaPipelineId
     *        The ID of the media stream pipeline
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaStreamPipeline withMediaPipelineId(String mediaPipelineId) {
        setMediaPipelineId(mediaPipelineId);
        return this;
    }

    /**
     * <p>
     * The ARN of the media stream pipeline.
     * </p>
     * 
     * @param mediaPipelineArn
     *        The ARN of the media stream pipeline.
     */

    public void setMediaPipelineArn(String mediaPipelineArn) {
        this.mediaPipelineArn = mediaPipelineArn;
    }

    /**
     * <p>
     * The ARN of the media stream pipeline.
     * </p>
     * 
     * @return The ARN of the media stream pipeline.
     */

    public String getMediaPipelineArn() {
        return this.mediaPipelineArn;
    }

    /**
     * <p>
     * The ARN of the media stream pipeline.
     * </p>
     * 
     * @param mediaPipelineArn
     *        The ARN of the media stream pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaStreamPipeline withMediaPipelineArn(String mediaPipelineArn) {
        setMediaPipelineArn(mediaPipelineArn);
        return this;
    }

    /**
     * <p>
     * The time at which the media stream pipeline was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the media stream pipeline was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time at which the media stream pipeline was created.
     * </p>
     * 
     * @return The time at which the media stream pipeline was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time at which the media stream pipeline was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the media stream pipeline was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaStreamPipeline withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The time at which the media stream pipeline was updated.
     * </p>
     * 
     * @param updatedTimestamp
     *        The time at which the media stream pipeline was updated.
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The time at which the media stream pipeline was updated.
     * </p>
     * 
     * @return The time at which the media stream pipeline was updated.
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * <p>
     * The time at which the media stream pipeline was updated.
     * </p>
     * 
     * @param updatedTimestamp
     *        The time at which the media stream pipeline was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaStreamPipeline withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        setUpdatedTimestamp(updatedTimestamp);
        return this;
    }

    /**
     * <p>
     * The status of the media stream pipeline.
     * </p>
     * 
     * @param status
     *        The status of the media stream pipeline.
     * @see MediaPipelineStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the media stream pipeline.
     * </p>
     * 
     * @return The status of the media stream pipeline.
     * @see MediaPipelineStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the media stream pipeline.
     * </p>
     * 
     * @param status
     *        The status of the media stream pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaPipelineStatus
     */

    public MediaStreamPipeline withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the media stream pipeline.
     * </p>
     * 
     * @param status
     *        The status of the media stream pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaPipelineStatus
     */

    public MediaStreamPipeline withStatus(MediaPipelineStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The media stream pipeline's data sources.
     * </p>
     * 
     * @return The media stream pipeline's data sources.
     */

    public java.util.List<MediaStreamSource> getSources() {
        return sources;
    }

    /**
     * <p>
     * The media stream pipeline's data sources.
     * </p>
     * 
     * @param sources
     *        The media stream pipeline's data sources.
     */

    public void setSources(java.util.Collection<MediaStreamSource> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<MediaStreamSource>(sources);
    }

    /**
     * <p>
     * The media stream pipeline's data sources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        The media stream pipeline's data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaStreamPipeline withSources(MediaStreamSource... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<MediaStreamSource>(sources.length));
        }
        for (MediaStreamSource ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The media stream pipeline's data sources.
     * </p>
     * 
     * @param sources
     *        The media stream pipeline's data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaStreamPipeline withSources(java.util.Collection<MediaStreamSource> sources) {
        setSources(sources);
        return this;
    }

    /**
     * <p>
     * The media stream pipeline's data sinks.
     * </p>
     * 
     * @return The media stream pipeline's data sinks.
     */

    public java.util.List<MediaStreamSink> getSinks() {
        return sinks;
    }

    /**
     * <p>
     * The media stream pipeline's data sinks.
     * </p>
     * 
     * @param sinks
     *        The media stream pipeline's data sinks.
     */

    public void setSinks(java.util.Collection<MediaStreamSink> sinks) {
        if (sinks == null) {
            this.sinks = null;
            return;
        }

        this.sinks = new java.util.ArrayList<MediaStreamSink>(sinks);
    }

    /**
     * <p>
     * The media stream pipeline's data sinks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSinks(java.util.Collection)} or {@link #withSinks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param sinks
     *        The media stream pipeline's data sinks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaStreamPipeline withSinks(MediaStreamSink... sinks) {
        if (this.sinks == null) {
            setSinks(new java.util.ArrayList<MediaStreamSink>(sinks.length));
        }
        for (MediaStreamSink ele : sinks) {
            this.sinks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The media stream pipeline's data sinks.
     * </p>
     * 
     * @param sinks
     *        The media stream pipeline's data sinks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaStreamPipeline withSinks(java.util.Collection<MediaStreamSink> sinks) {
        setSinks(sinks);
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
        if (getMediaPipelineArn() != null)
            sb.append("MediaPipelineArn: ").append(getMediaPipelineArn()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: ").append(getUpdatedTimestamp()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources()).append(",");
        if (getSinks() != null)
            sb.append("Sinks: ").append(getSinks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaStreamPipeline == false)
            return false;
        MediaStreamPipeline other = (MediaStreamPipeline) obj;
        if (other.getMediaPipelineId() == null ^ this.getMediaPipelineId() == null)
            return false;
        if (other.getMediaPipelineId() != null && other.getMediaPipelineId().equals(this.getMediaPipelineId()) == false)
            return false;
        if (other.getMediaPipelineArn() == null ^ this.getMediaPipelineArn() == null)
            return false;
        if (other.getMediaPipelineArn() != null && other.getMediaPipelineArn().equals(this.getMediaPipelineArn()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        if (other.getSinks() == null ^ this.getSinks() == null)
            return false;
        if (other.getSinks() != null && other.getSinks().equals(this.getSinks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMediaPipelineId() == null) ? 0 : getMediaPipelineId().hashCode());
        hashCode = prime * hashCode + ((getMediaPipelineArn() == null) ? 0 : getMediaPipelineArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getSinks() == null) ? 0 : getSinks().hashCode());
        return hashCode;
    }

    @Override
    public MediaStreamPipeline clone() {
        try {
            return (MediaStreamPipeline) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.MediaStreamPipelineMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
