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
 * The streaming configuration associated with an Amazon Chime SDK Voice Connector. Specifies whether media streaming is
 * enabled for sending to Amazon Kinesis, and shows the retention period for the Amazon Kinesis data, in hours.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/StreamingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of time, in hours, to the Kinesis data.
     * </p>
     */
    private Integer dataRetentionInHours;
    /**
     * <p>
     * When true, streaming to Kinesis is off.
     * </p>
     */
    private Boolean disabled;
    /**
     * <p>
     * The streaming notification targets.
     * </p>
     */
    private java.util.List<StreamingNotificationTarget> streamingNotificationTargets;
    /**
     * <p>
     * The call analytics configuration.
     * </p>
     */
    private MediaInsightsConfiguration mediaInsightsConfiguration;

    /**
     * <p>
     * The amount of time, in hours, to the Kinesis data.
     * </p>
     * 
     * @param dataRetentionInHours
     *        The amount of time, in hours, to the Kinesis data.
     */

    public void setDataRetentionInHours(Integer dataRetentionInHours) {
        this.dataRetentionInHours = dataRetentionInHours;
    }

    /**
     * <p>
     * The amount of time, in hours, to the Kinesis data.
     * </p>
     * 
     * @return The amount of time, in hours, to the Kinesis data.
     */

    public Integer getDataRetentionInHours() {
        return this.dataRetentionInHours;
    }

    /**
     * <p>
     * The amount of time, in hours, to the Kinesis data.
     * </p>
     * 
     * @param dataRetentionInHours
     *        The amount of time, in hours, to the Kinesis data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingConfiguration withDataRetentionInHours(Integer dataRetentionInHours) {
        setDataRetentionInHours(dataRetentionInHours);
        return this;
    }

    /**
     * <p>
     * When true, streaming to Kinesis is off.
     * </p>
     * 
     * @param disabled
     *        When true, streaming to Kinesis is off.
     */

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * <p>
     * When true, streaming to Kinesis is off.
     * </p>
     * 
     * @return When true, streaming to Kinesis is off.
     */

    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * <p>
     * When true, streaming to Kinesis is off.
     * </p>
     * 
     * @param disabled
     *        When true, streaming to Kinesis is off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingConfiguration withDisabled(Boolean disabled) {
        setDisabled(disabled);
        return this;
    }

    /**
     * <p>
     * When true, streaming to Kinesis is off.
     * </p>
     * 
     * @return When true, streaming to Kinesis is off.
     */

    public Boolean isDisabled() {
        return this.disabled;
    }

    /**
     * <p>
     * The streaming notification targets.
     * </p>
     * 
     * @return The streaming notification targets.
     */

    public java.util.List<StreamingNotificationTarget> getStreamingNotificationTargets() {
        return streamingNotificationTargets;
    }

    /**
     * <p>
     * The streaming notification targets.
     * </p>
     * 
     * @param streamingNotificationTargets
     *        The streaming notification targets.
     */

    public void setStreamingNotificationTargets(java.util.Collection<StreamingNotificationTarget> streamingNotificationTargets) {
        if (streamingNotificationTargets == null) {
            this.streamingNotificationTargets = null;
            return;
        }

        this.streamingNotificationTargets = new java.util.ArrayList<StreamingNotificationTarget>(streamingNotificationTargets);
    }

    /**
     * <p>
     * The streaming notification targets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStreamingNotificationTargets(java.util.Collection)} or
     * {@link #withStreamingNotificationTargets(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param streamingNotificationTargets
     *        The streaming notification targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingConfiguration withStreamingNotificationTargets(StreamingNotificationTarget... streamingNotificationTargets) {
        if (this.streamingNotificationTargets == null) {
            setStreamingNotificationTargets(new java.util.ArrayList<StreamingNotificationTarget>(streamingNotificationTargets.length));
        }
        for (StreamingNotificationTarget ele : streamingNotificationTargets) {
            this.streamingNotificationTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The streaming notification targets.
     * </p>
     * 
     * @param streamingNotificationTargets
     *        The streaming notification targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingConfiguration withStreamingNotificationTargets(java.util.Collection<StreamingNotificationTarget> streamingNotificationTargets) {
        setStreamingNotificationTargets(streamingNotificationTargets);
        return this;
    }

    /**
     * <p>
     * The call analytics configuration.
     * </p>
     * 
     * @param mediaInsightsConfiguration
     *        The call analytics configuration.
     */

    public void setMediaInsightsConfiguration(MediaInsightsConfiguration mediaInsightsConfiguration) {
        this.mediaInsightsConfiguration = mediaInsightsConfiguration;
    }

    /**
     * <p>
     * The call analytics configuration.
     * </p>
     * 
     * @return The call analytics configuration.
     */

    public MediaInsightsConfiguration getMediaInsightsConfiguration() {
        return this.mediaInsightsConfiguration;
    }

    /**
     * <p>
     * The call analytics configuration.
     * </p>
     * 
     * @param mediaInsightsConfiguration
     *        The call analytics configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingConfiguration withMediaInsightsConfiguration(MediaInsightsConfiguration mediaInsightsConfiguration) {
        setMediaInsightsConfiguration(mediaInsightsConfiguration);
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
        if (getDataRetentionInHours() != null)
            sb.append("DataRetentionInHours: ").append(getDataRetentionInHours()).append(",");
        if (getDisabled() != null)
            sb.append("Disabled: ").append(getDisabled()).append(",");
        if (getStreamingNotificationTargets() != null)
            sb.append("StreamingNotificationTargets: ").append(getStreamingNotificationTargets()).append(",");
        if (getMediaInsightsConfiguration() != null)
            sb.append("MediaInsightsConfiguration: ").append(getMediaInsightsConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamingConfiguration == false)
            return false;
        StreamingConfiguration other = (StreamingConfiguration) obj;
        if (other.getDataRetentionInHours() == null ^ this.getDataRetentionInHours() == null)
            return false;
        if (other.getDataRetentionInHours() != null && other.getDataRetentionInHours().equals(this.getDataRetentionInHours()) == false)
            return false;
        if (other.getDisabled() == null ^ this.getDisabled() == null)
            return false;
        if (other.getDisabled() != null && other.getDisabled().equals(this.getDisabled()) == false)
            return false;
        if (other.getStreamingNotificationTargets() == null ^ this.getStreamingNotificationTargets() == null)
            return false;
        if (other.getStreamingNotificationTargets() != null && other.getStreamingNotificationTargets().equals(this.getStreamingNotificationTargets()) == false)
            return false;
        if (other.getMediaInsightsConfiguration() == null ^ this.getMediaInsightsConfiguration() == null)
            return false;
        if (other.getMediaInsightsConfiguration() != null && other.getMediaInsightsConfiguration().equals(this.getMediaInsightsConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataRetentionInHours() == null) ? 0 : getDataRetentionInHours().hashCode());
        hashCode = prime * hashCode + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        hashCode = prime * hashCode + ((getStreamingNotificationTargets() == null) ? 0 : getStreamingNotificationTargets().hashCode());
        hashCode = prime * hashCode + ((getMediaInsightsConfiguration() == null) ? 0 : getMediaInsightsConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public StreamingConfiguration clone() {
        try {
            return (StreamingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkvoice.model.transform.StreamingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
