/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The connector pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/MediaLiveConnectorPipeline"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaLiveConnectorPipeline implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The connector pipeline's data sources.
     * </p>
     */
    private java.util.List<LiveConnectorSourceConfiguration> sources;
    /**
     * <p>
     * The connector pipeline's data sinks.
     * </p>
     */
    private java.util.List<LiveConnectorSinkConfiguration> sinks;
    /**
     * <p>
     * The connector pipeline's ID.
     * </p>
     */
    private String mediaPipelineId;
    /**
     * <p>
     * The connector pipeline's ARN.
     * </p>
     */
    private String mediaPipelineArn;
    /**
     * <p>
     * The connector pipeline's status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Thetime at which the connector pipeline was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The time at which the connector pipeline was last updated.
     * </p>
     */
    private java.util.Date updatedTimestamp;

    /**
     * <p>
     * The connector pipeline's data sources.
     * </p>
     * 
     * @return The connector pipeline's data sources.
     */

    public java.util.List<LiveConnectorSourceConfiguration> getSources() {
        return sources;
    }

    /**
     * <p>
     * The connector pipeline's data sources.
     * </p>
     * 
     * @param sources
     *        The connector pipeline's data sources.
     */

    public void setSources(java.util.Collection<LiveConnectorSourceConfiguration> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<LiveConnectorSourceConfiguration>(sources);
    }

    /**
     * <p>
     * The connector pipeline's data sources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        The connector pipeline's data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaLiveConnectorPipeline withSources(LiveConnectorSourceConfiguration... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<LiveConnectorSourceConfiguration>(sources.length));
        }
        for (LiveConnectorSourceConfiguration ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The connector pipeline's data sources.
     * </p>
     * 
     * @param sources
     *        The connector pipeline's data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaLiveConnectorPipeline withSources(java.util.Collection<LiveConnectorSourceConfiguration> sources) {
        setSources(sources);
        return this;
    }

    /**
     * <p>
     * The connector pipeline's data sinks.
     * </p>
     * 
     * @return The connector pipeline's data sinks.
     */

    public java.util.List<LiveConnectorSinkConfiguration> getSinks() {
        return sinks;
    }

    /**
     * <p>
     * The connector pipeline's data sinks.
     * </p>
     * 
     * @param sinks
     *        The connector pipeline's data sinks.
     */

    public void setSinks(java.util.Collection<LiveConnectorSinkConfiguration> sinks) {
        if (sinks == null) {
            this.sinks = null;
            return;
        }

        this.sinks = new java.util.ArrayList<LiveConnectorSinkConfiguration>(sinks);
    }

    /**
     * <p>
     * The connector pipeline's data sinks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSinks(java.util.Collection)} or {@link #withSinks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param sinks
     *        The connector pipeline's data sinks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaLiveConnectorPipeline withSinks(LiveConnectorSinkConfiguration... sinks) {
        if (this.sinks == null) {
            setSinks(new java.util.ArrayList<LiveConnectorSinkConfiguration>(sinks.length));
        }
        for (LiveConnectorSinkConfiguration ele : sinks) {
            this.sinks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The connector pipeline's data sinks.
     * </p>
     * 
     * @param sinks
     *        The connector pipeline's data sinks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaLiveConnectorPipeline withSinks(java.util.Collection<LiveConnectorSinkConfiguration> sinks) {
        setSinks(sinks);
        return this;
    }

    /**
     * <p>
     * The connector pipeline's ID.
     * </p>
     * 
     * @param mediaPipelineId
     *        The connector pipeline's ID.
     */

    public void setMediaPipelineId(String mediaPipelineId) {
        this.mediaPipelineId = mediaPipelineId;
    }

    /**
     * <p>
     * The connector pipeline's ID.
     * </p>
     * 
     * @return The connector pipeline's ID.
     */

    public String getMediaPipelineId() {
        return this.mediaPipelineId;
    }

    /**
     * <p>
     * The connector pipeline's ID.
     * </p>
     * 
     * @param mediaPipelineId
     *        The connector pipeline's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaLiveConnectorPipeline withMediaPipelineId(String mediaPipelineId) {
        setMediaPipelineId(mediaPipelineId);
        return this;
    }

    /**
     * <p>
     * The connector pipeline's ARN.
     * </p>
     * 
     * @param mediaPipelineArn
     *        The connector pipeline's ARN.
     */

    public void setMediaPipelineArn(String mediaPipelineArn) {
        this.mediaPipelineArn = mediaPipelineArn;
    }

    /**
     * <p>
     * The connector pipeline's ARN.
     * </p>
     * 
     * @return The connector pipeline's ARN.
     */

    public String getMediaPipelineArn() {
        return this.mediaPipelineArn;
    }

    /**
     * <p>
     * The connector pipeline's ARN.
     * </p>
     * 
     * @param mediaPipelineArn
     *        The connector pipeline's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaLiveConnectorPipeline withMediaPipelineArn(String mediaPipelineArn) {
        setMediaPipelineArn(mediaPipelineArn);
        return this;
    }

    /**
     * <p>
     * The connector pipeline's status.
     * </p>
     * 
     * @param status
     *        The connector pipeline's status.
     * @see MediaPipelineStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The connector pipeline's status.
     * </p>
     * 
     * @return The connector pipeline's status.
     * @see MediaPipelineStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The connector pipeline's status.
     * </p>
     * 
     * @param status
     *        The connector pipeline's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaPipelineStatus
     */

    public MediaLiveConnectorPipeline withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The connector pipeline's status.
     * </p>
     * 
     * @param status
     *        The connector pipeline's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaPipelineStatus
     */

    public MediaLiveConnectorPipeline withStatus(MediaPipelineStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Thetime at which the connector pipeline was created.
     * </p>
     * 
     * @param createdTimestamp
     *        Thetime at which the connector pipeline was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * Thetime at which the connector pipeline was created.
     * </p>
     * 
     * @return Thetime at which the connector pipeline was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * Thetime at which the connector pipeline was created.
     * </p>
     * 
     * @param createdTimestamp
     *        Thetime at which the connector pipeline was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaLiveConnectorPipeline withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The time at which the connector pipeline was last updated.
     * </p>
     * 
     * @param updatedTimestamp
     *        The time at which the connector pipeline was last updated.
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The time at which the connector pipeline was last updated.
     * </p>
     * 
     * @return The time at which the connector pipeline was last updated.
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * <p>
     * The time at which the connector pipeline was last updated.
     * </p>
     * 
     * @param updatedTimestamp
     *        The time at which the connector pipeline was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaLiveConnectorPipeline withUpdatedTimestamp(java.util.Date updatedTimestamp) {
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
        if (getSources() != null)
            sb.append("Sources: ").append(getSources()).append(",");
        if (getSinks() != null)
            sb.append("Sinks: ").append(getSinks()).append(",");
        if (getMediaPipelineId() != null)
            sb.append("MediaPipelineId: ").append(getMediaPipelineId()).append(",");
        if (getMediaPipelineArn() != null)
            sb.append("MediaPipelineArn: ").append(getMediaPipelineArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof MediaLiveConnectorPipeline == false)
            return false;
        MediaLiveConnectorPipeline other = (MediaLiveConnectorPipeline) obj;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        if (other.getSinks() == null ^ this.getSinks() == null)
            return false;
        if (other.getSinks() != null && other.getSinks().equals(this.getSinks()) == false)
            return false;
        if (other.getMediaPipelineId() == null ^ this.getMediaPipelineId() == null)
            return false;
        if (other.getMediaPipelineId() != null && other.getMediaPipelineId().equals(this.getMediaPipelineId()) == false)
            return false;
        if (other.getMediaPipelineArn() == null ^ this.getMediaPipelineArn() == null)
            return false;
        if (other.getMediaPipelineArn() != null && other.getMediaPipelineArn().equals(this.getMediaPipelineArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getSinks() == null) ? 0 : getSinks().hashCode());
        hashCode = prime * hashCode + ((getMediaPipelineId() == null) ? 0 : getMediaPipelineId().hashCode());
        hashCode = prime * hashCode + ((getMediaPipelineArn() == null) ? 0 : getMediaPipelineArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public MediaLiveConnectorPipeline clone() {
        try {
            return (MediaLiveConnectorPipeline) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.MediaLiveConnectorPipelineMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
