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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object that captures the Amazon IVS configuration that the customer provisioned, the ingest configurations that the
 * broadcaster used, and the most recent Amazon IVS stream events it encountered.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/StreamSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamSession implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The properties of the channel at the time of going live.
     * </p>
     */
    private Channel channel;
    /**
     * <p>
     * Time when the channel went offline. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * For live streams, this is <code>NULL</code>.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The properties of the incoming RTMP stream for the stream.
     * </p>
     */
    private IngestConfiguration ingestConfiguration;
    /**
     * <p>
     * The properties of recording the live stream.
     * </p>
     */
    private RecordingConfiguration recordingConfiguration;
    /**
     * <p>
     * Time when the channel went live. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * Unique identifier for a live or previously live stream in the specified channel.
     * </p>
     */
    private String streamId;
    /**
     * <p>
     * List of Amazon IVS events that the stream encountered. The list is sorted by most recent events and contains up
     * to 500 events. For Amazon IVS events, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/eventbridge.html">Using Amazon EventBridge with Amazon
     * IVS</a>.
     * </p>
     */
    private java.util.List<StreamEvent> truncatedEvents;

    /**
     * <p>
     * The properties of the channel at the time of going live.
     * </p>
     * 
     * @param channel
     *        The properties of the channel at the time of going live.
     */

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    /**
     * <p>
     * The properties of the channel at the time of going live.
     * </p>
     * 
     * @return The properties of the channel at the time of going live.
     */

    public Channel getChannel() {
        return this.channel;
    }

    /**
     * <p>
     * The properties of the channel at the time of going live.
     * </p>
     * 
     * @param channel
     *        The properties of the channel at the time of going live.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamSession withChannel(Channel channel) {
        setChannel(channel);
        return this;
    }

    /**
     * <p>
     * Time when the channel went offline. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * For live streams, this is <code>NULL</code>.
     * </p>
     * 
     * @param endTime
     *        Time when the channel went offline. This is an ISO 8601 timestamp; <i>note that this is returned as a
     *        string</i>. For live streams, this is <code>NULL</code>.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * Time when the channel went offline. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * For live streams, this is <code>NULL</code>.
     * </p>
     * 
     * @return Time when the channel went offline. This is an ISO 8601 timestamp; <i>note that this is returned as a
     *         string</i>. For live streams, this is <code>NULL</code>.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * Time when the channel went offline. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * For live streams, this is <code>NULL</code>.
     * </p>
     * 
     * @param endTime
     *        Time when the channel went offline. This is an ISO 8601 timestamp; <i>note that this is returned as a
     *        string</i>. For live streams, this is <code>NULL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamSession withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The properties of the incoming RTMP stream for the stream.
     * </p>
     * 
     * @param ingestConfiguration
     *        The properties of the incoming RTMP stream for the stream.
     */

    public void setIngestConfiguration(IngestConfiguration ingestConfiguration) {
        this.ingestConfiguration = ingestConfiguration;
    }

    /**
     * <p>
     * The properties of the incoming RTMP stream for the stream.
     * </p>
     * 
     * @return The properties of the incoming RTMP stream for the stream.
     */

    public IngestConfiguration getIngestConfiguration() {
        return this.ingestConfiguration;
    }

    /**
     * <p>
     * The properties of the incoming RTMP stream for the stream.
     * </p>
     * 
     * @param ingestConfiguration
     *        The properties of the incoming RTMP stream for the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamSession withIngestConfiguration(IngestConfiguration ingestConfiguration) {
        setIngestConfiguration(ingestConfiguration);
        return this;
    }

    /**
     * <p>
     * The properties of recording the live stream.
     * </p>
     * 
     * @param recordingConfiguration
     *        The properties of recording the live stream.
     */

    public void setRecordingConfiguration(RecordingConfiguration recordingConfiguration) {
        this.recordingConfiguration = recordingConfiguration;
    }

    /**
     * <p>
     * The properties of recording the live stream.
     * </p>
     * 
     * @return The properties of recording the live stream.
     */

    public RecordingConfiguration getRecordingConfiguration() {
        return this.recordingConfiguration;
    }

    /**
     * <p>
     * The properties of recording the live stream.
     * </p>
     * 
     * @param recordingConfiguration
     *        The properties of recording the live stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamSession withRecordingConfiguration(RecordingConfiguration recordingConfiguration) {
        setRecordingConfiguration(recordingConfiguration);
        return this;
    }

    /**
     * <p>
     * Time when the channel went live. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * </p>
     * 
     * @param startTime
     *        Time when the channel went live. This is an ISO 8601 timestamp; <i>note that this is returned as a
     *        string</i>.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Time when the channel went live. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * </p>
     * 
     * @return Time when the channel went live. This is an ISO 8601 timestamp; <i>note that this is returned as a
     *         string</i>.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Time when the channel went live. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * </p>
     * 
     * @param startTime
     *        Time when the channel went live. This is an ISO 8601 timestamp; <i>note that this is returned as a
     *        string</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamSession withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Unique identifier for a live or previously live stream in the specified channel.
     * </p>
     * 
     * @param streamId
     *        Unique identifier for a live or previously live stream in the specified channel.
     */

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    /**
     * <p>
     * Unique identifier for a live or previously live stream in the specified channel.
     * </p>
     * 
     * @return Unique identifier for a live or previously live stream in the specified channel.
     */

    public String getStreamId() {
        return this.streamId;
    }

    /**
     * <p>
     * Unique identifier for a live or previously live stream in the specified channel.
     * </p>
     * 
     * @param streamId
     *        Unique identifier for a live or previously live stream in the specified channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamSession withStreamId(String streamId) {
        setStreamId(streamId);
        return this;
    }

    /**
     * <p>
     * List of Amazon IVS events that the stream encountered. The list is sorted by most recent events and contains up
     * to 500 events. For Amazon IVS events, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/eventbridge.html">Using Amazon EventBridge with Amazon
     * IVS</a>.
     * </p>
     * 
     * @return List of Amazon IVS events that the stream encountered. The list is sorted by most recent events and
     *         contains up to 500 events. For Amazon IVS events, see <a
     *         href="https://docs.aws.amazon.com/ivs/latest/userguide/eventbridge.html">Using Amazon EventBridge with
     *         Amazon IVS</a>.
     */

    public java.util.List<StreamEvent> getTruncatedEvents() {
        return truncatedEvents;
    }

    /**
     * <p>
     * List of Amazon IVS events that the stream encountered. The list is sorted by most recent events and contains up
     * to 500 events. For Amazon IVS events, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/eventbridge.html">Using Amazon EventBridge with Amazon
     * IVS</a>.
     * </p>
     * 
     * @param truncatedEvents
     *        List of Amazon IVS events that the stream encountered. The list is sorted by most recent events and
     *        contains up to 500 events. For Amazon IVS events, see <a
     *        href="https://docs.aws.amazon.com/ivs/latest/userguide/eventbridge.html">Using Amazon EventBridge with
     *        Amazon IVS</a>.
     */

    public void setTruncatedEvents(java.util.Collection<StreamEvent> truncatedEvents) {
        if (truncatedEvents == null) {
            this.truncatedEvents = null;
            return;
        }

        this.truncatedEvents = new java.util.ArrayList<StreamEvent>(truncatedEvents);
    }

    /**
     * <p>
     * List of Amazon IVS events that the stream encountered. The list is sorted by most recent events and contains up
     * to 500 events. For Amazon IVS events, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/eventbridge.html">Using Amazon EventBridge with Amazon
     * IVS</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTruncatedEvents(java.util.Collection)} or {@link #withTruncatedEvents(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param truncatedEvents
     *        List of Amazon IVS events that the stream encountered. The list is sorted by most recent events and
     *        contains up to 500 events. For Amazon IVS events, see <a
     *        href="https://docs.aws.amazon.com/ivs/latest/userguide/eventbridge.html">Using Amazon EventBridge with
     *        Amazon IVS</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamSession withTruncatedEvents(StreamEvent... truncatedEvents) {
        if (this.truncatedEvents == null) {
            setTruncatedEvents(new java.util.ArrayList<StreamEvent>(truncatedEvents.length));
        }
        for (StreamEvent ele : truncatedEvents) {
            this.truncatedEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of Amazon IVS events that the stream encountered. The list is sorted by most recent events and contains up
     * to 500 events. For Amazon IVS events, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/eventbridge.html">Using Amazon EventBridge with Amazon
     * IVS</a>.
     * </p>
     * 
     * @param truncatedEvents
     *        List of Amazon IVS events that the stream encountered. The list is sorted by most recent events and
     *        contains up to 500 events. For Amazon IVS events, see <a
     *        href="https://docs.aws.amazon.com/ivs/latest/userguide/eventbridge.html">Using Amazon EventBridge with
     *        Amazon IVS</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamSession withTruncatedEvents(java.util.Collection<StreamEvent> truncatedEvents) {
        setTruncatedEvents(truncatedEvents);
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
        if (getChannel() != null)
            sb.append("Channel: ").append(getChannel()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getIngestConfiguration() != null)
            sb.append("IngestConfiguration: ").append(getIngestConfiguration()).append(",");
        if (getRecordingConfiguration() != null)
            sb.append("RecordingConfiguration: ").append(getRecordingConfiguration()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStreamId() != null)
            sb.append("StreamId: ").append(getStreamId()).append(",");
        if (getTruncatedEvents() != null)
            sb.append("TruncatedEvents: ").append(getTruncatedEvents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamSession == false)
            return false;
        StreamSession other = (StreamSession) obj;
        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getIngestConfiguration() == null ^ this.getIngestConfiguration() == null)
            return false;
        if (other.getIngestConfiguration() != null && other.getIngestConfiguration().equals(this.getIngestConfiguration()) == false)
            return false;
        if (other.getRecordingConfiguration() == null ^ this.getRecordingConfiguration() == null)
            return false;
        if (other.getRecordingConfiguration() != null && other.getRecordingConfiguration().equals(this.getRecordingConfiguration()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStreamId() == null ^ this.getStreamId() == null)
            return false;
        if (other.getStreamId() != null && other.getStreamId().equals(this.getStreamId()) == false)
            return false;
        if (other.getTruncatedEvents() == null ^ this.getTruncatedEvents() == null)
            return false;
        if (other.getTruncatedEvents() != null && other.getTruncatedEvents().equals(this.getTruncatedEvents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getIngestConfiguration() == null) ? 0 : getIngestConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRecordingConfiguration() == null) ? 0 : getRecordingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStreamId() == null) ? 0 : getStreamId().hashCode());
        hashCode = prime * hashCode + ((getTruncatedEvents() == null) ? 0 : getTruncatedEvents().hashCode());
        return hashCode;
    }

    @Override
    public StreamSession clone() {
        try {
            return (StreamSession) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivs.model.transform.StreamSessionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
